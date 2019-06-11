package hadooptrain2.mapreduce;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

import java.io.IOException;

/**
 *
 */
public class WordCountApp {

    /**
     *
     */
    public static class MyMapper extends Mapper<LongWritable, Text, Text, LongWritable> {

//        @Override
//        public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
//            super.map(key, value, context);
//        }

        LongWritable one = new LongWritable(1);
        @Override
        protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
            super.map(key, value, context);

            //
            String line = value.toString();

            //
            String[] words = line.split(" ");
            for(String word : words) {
                context.write(new Text(word), one);
            }
        }
    }

    public static class MyReducer extends Reducer<Text, LongWritable, Text, LongWritable> {
        @Override
        protected void reduce(Text key, Iterable<LongWritable> values, Context context) throws IOException, InterruptedException {
            super.reduce(key, values, context);

            long sum = 0;
            for(LongWritable value : values) {
                // 求单词key出现的总和
                sum += value.get();
            }
            // 最终统计结果的输出
            context.write(key, new LongWritable(sum));
        }
    }

    /**
     * Driver
     * @param args
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Configuration configuration = new Configuration();
        Job job = Job.getInstance(configuration, "wordconut");

        // 设置job的处理类
        job.setJarByClass(WordCountApp.class);

        // 设置作业处理的输入路径
        FileInputFormat.setInputPaths(job, new Path(args[0]));

        // 设置map相关参数
        job.setMapperClass(MyMapper.class);
        job.setMapOutputKeyClass(Text.class);;
        job.setMapOutputValueClass(LongWritable.class);

        // 设置reduce相关参数
        job.setReducerClass(MyReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(LongWritable.class);

        // 设置作业处理输出路径
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }

}

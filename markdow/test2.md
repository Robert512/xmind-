```dot
digraph graph_name{
    bgcolor="transparent";//背景透明
    
    subgraph cluster_subgraph_name{//聚集子图
        node[shape=box];
        cluster_A -> cluster_B;
    }
    
    subgraph subgraph_name{//子图
        node[shape=none];
        sub_A -> sub_B;
    }
    
    {//匿名子图
        node[shape=octagon];
        nest_A -> nest_B;
    }
    
    global_A -> global_B;
    
    cluster_B -> global_B;
    sub_B -> global_B;
    nest_B -> global_B;
}

```

```dot
digraph G{
    
    C->D;
    A->B
}
```
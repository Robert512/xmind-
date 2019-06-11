```dot
digraph G{
    label="Spark Cluster + AKKA"
    
    A->B
}
```

```mermaid
graph LR
    A-.->B
```

```mermaid
graph TB
    
    subgraph one
    a1 --> a2
    end
    subgraph two
    b1-->b2
    end
    subgraph three
    c1 --> c2
    end
    a1 --> c2
```

```puml
 A->B
```


```plantuml
 digraph Test {
    A->B
 }
```

```mermaid
graph TD
client1-->|read / write|SVN((SVN server))
client2-->|read only|SVN
client3-->|read / write|SVN
client4-->|read only|SVN
client5(...)-->SVN
SVN---|store the data|sharedrive
```　
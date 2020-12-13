package hdfsdemo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import org.junit.Test;

public class HdfsClient {
    @Test
    public void testMkdirs() throws IOException,InterruptedException, URISyntaxException{
        Configuration conf = new Configuration();
        //conf.set("dfs.replication","1");
        FileSystem fs = FileSystem.get(new URI("hdfs://localhost:9000"),conf,"master");

        fs.rename(new Path("/data/tbStock.txt"),new Path("/data/demo.txt"));

        fs.close();

        System.out.println("It Is Done!");

    }
}

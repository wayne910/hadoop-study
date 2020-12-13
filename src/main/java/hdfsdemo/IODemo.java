package hdfsdemo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;


import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class IODemo {
    @Test
    public void putFileToHDFS() throws IOException,InterruptedException, URISyntaxException{
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(new URI("hdfs://localhost:9000"),conf,"master");

        FSDataInputStream fis = fs.open(new Path("/data/demo.txt"));

        FileOutputStream fos = new FileOutputStream("/home/master/Desktop/app/data/demo011.txt");

        IOUtils.copyBytes(fis,fos,conf);

        IOUtils.closeStream(fos);
        IOUtils.closeStream(fis);
        fs.close();
    }
}

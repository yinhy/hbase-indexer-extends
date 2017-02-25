package com.ngdata.hbaseindexer.parse;

import com.google.gson.Gson;
import org.apache.hadoop.hbase.util.Bytes;

import java.util.Collection;
import java.util.List;

/**
 * Created by wangkai8 on 17/2/8.
 */
public class ArrayByteArrayValueMapper implements ByteArrayValueMapper {

    Gson gson = new Gson();

    @Override
    public Collection<? extends Object> map(byte[] bytes) {
        return gson.fromJson(Bytes.toString(bytes), List.class);
    }
}

package com.ngdata.hbaseindexer.parse;

import com.google.common.collect.ImmutableList;
import org.apache.hadoop.hbase.util.Bytes;

import java.util.Collection;

/**
 * Created by wangkai8 on 17/2/8.
 */
public class JsonByteArrayValueMapper implements ByteArrayValueMapper {

    @Override
    public Collection<? extends Object> map(byte[] bytes) {
        return ImmutableList.of(Bytes.toString(bytes));
    }
}

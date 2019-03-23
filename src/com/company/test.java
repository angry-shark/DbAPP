package com.company;



import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.Sheet;
import com.company.excelModel.ReadModel;
import com.company.listener.ExcelListener;
import com.company.utils.FileUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = FileUtil.getResourcesFileInputStream("TCGA.xls");
        ExcelListener excelListener = new ExcelListener();
        EasyExcelFactory.readBySax(inputStream, new Sheet(2, 1, ReadModel.class), excelListener);
        inputStream.close();
    }


    public static void print(List<Object> datas){
        int i=0;
        for (Object ob:datas) {
            System.out.println(i++);
            System.out.println(ob);
        }
    }
}

package com.zhu.utils;

import org.apache.commons.codec.binary.Base64;

import java.io.*;

/*
 *  @项目名：  nicemirror 
 *  @包名：    com.zhu.utils
 *  @文件名:   ImgUtils
 *  @创建者:   Unow
 *  @创建时间:  2018/11/20 11:01
 *  @描述：    TODO
 */
public class ImgUtils {
    public static void main(String [] args) throws IOException {
        File file = new File("C:\\Users\\Unow\\Desktop\\MyWork\\face_storage\\1.txt");

    }
    /**
     * 将图片转换成Base64编码
     * @param imgFile 待处理图片
     * @return
     */
    public static String getImgStr(String imgFile){
        //将图片文件转化为字节数组字符串，并对其进行Base64编码处理


        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try
        {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(Base64.encodeBase64(data));
        return new String(Base64.encodeBase64(data));
    }

    public static String getImgStrByIo(InputStream in){
        //将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        byte[] data = null;
        //读取图片字节数组
        try
        {
            data = new byte[in.available()];
            in.read(data);
            in.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(Base64.encodeBase64(data));
        return new String(Base64.encodeBase64(data));
    }
    /**
     * 对字节数组字符串进行Base64解码并生成图片
     * @param imgStr 图片数据
     * @param imgFilePath 保存图片全路径地址
     * @return
     */
    public static boolean generateImage(String imgStr,String imgFilePath){
        //
        if (imgStr == null) //图像数据为空
            return false;
        try
        {
            //Base64解码
            byte[] b = Base64.decodeBase64(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            //生成jpeg图片

            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}

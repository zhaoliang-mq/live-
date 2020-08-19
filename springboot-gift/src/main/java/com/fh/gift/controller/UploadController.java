package com.fh.gift.controller;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.fh.common.Ignore;
import com.fh.common.ServerResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@RestController
@RequestMapping("file")
@CrossOrigin
public class UploadController {

    @RequestMapping("uploadToOss")
    @Ignore
    public ServerResponse uploadToOss(MultipartFile file){

        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI4GH69eCYfa2FrKENba6D";
        String accessKeySecret = "XVPyj0AZcYUocEHaYR98Y3PsvzCFhP";
        String backetName = "zf000123";
        String prefixUrl  = "http://zf000123.oss-cn-beijing.aliyuncs.com/";
        //原文件名字
        String fileName = file.getOriginalFilename();
        String newFileName = UUID.randomUUID()+suffiixFile(fileName);
        try {

            // 创建OSSClient实例。
            OSS ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

            // 上传文件流。
            InputStream inputStream = file.getInputStream();
            ossClient.putObject( backetName, newFileName, inputStream);
            // 关闭OSSClient。
            ossClient.shutdown();


        } catch (IOException e) {
            e.printStackTrace();
        }

        return  ServerResponse.success(prefixUrl+newFileName);
    }

    /**
     * 获取后缀名
     * @param fileName
     * @return
     */
    public  String  suffiixFile(String fileName){
        int index = fileName.lastIndexOf(".");
        return  fileName.substring(index);
    }


}

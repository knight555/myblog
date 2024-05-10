package com.boom.myblog.config;

import com.boom.myblog.utils.PropertiesUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    /**
     * 属性配置
     */
    private static PropertiesUtils pro = PropertiesUtils.getInstance();
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //上传的图片在D盘下的OTA目录下，访问路径如：http://localhost:9999/OTA/a.jpg
        //其中OTA表示访问的前缀。"file:D:/OTA/"是文件真实的存储路径
        registry.addResourceHandler("/static/**").addResourceLocations("file:"+pro.getStaticResource());
//        registry.addResourceHandler("/OTA/**").addResourceLocations("file:" + pro.getOriginImagePath());
//        registry.addResourceHandler("/OTA_th/**").addResourceLocations("file:" + pro.getThumbnailImagePath());
    }
}
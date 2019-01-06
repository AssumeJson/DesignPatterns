package com.lg.design.factory.simple;

/**
 * 视频的简单工厂模式
 *
 * @author by Assume
 * @date 2019/1/6 11:38
 */
public class VideoSimpleFactory {
    /**
     * v1：
     * 简单的判断方式来进行初始化类
     */
//    public void videoFactory(String videoName) {
//        if ("java".equalsIgnoreCase(videoName)) {
//            new JavaVideo().production();
//        } else if ("FE".equalsIgnoreCase(videoName)) {
//            new FEVideo().production();
//        }else {
//            System.out.println("没有该课程啊");
//        }
//    }

    /**
     * v2：
     * 利用反射机制替代判断来创建实体类。并且完美的解决了之后如果课程增加需要修改工厂类的麻烦。
     *
     * @param clazz
     */
    public Video videoFactoryV2(Class clazz) {
        Video video = null;
        // 使用反射 创建实体类
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}

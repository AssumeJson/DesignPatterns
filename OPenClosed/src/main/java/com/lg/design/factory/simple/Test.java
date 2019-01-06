package com.lg.design.factory.simple;

/**
 * 客户端
 *
 * @author by Assume
 * @date 2019/1/6 11:10
 */
public class Test {
    // 如果需要创建Java 视频 则需要初始化 Java视频类，如果需要创建前端视频则需要创建前端类
    // 如果后续类需要扩展又将继续创建类。可想而知，如果程序非常复杂，维护有多麻烦。
//    public static void main(String[] args) {
//        Video javaVideo = new JavaVideo();
//        javaVideo.production();
//
//        new FEVideo().production();
//    }

    /**
     * 第一种 简单的比较工厂模式，通过字符串的比较来初始化相对的实体类
     *
     * @param args
     */
//    public static void main(String[] args) {
//        new VideoSimpleFactory().videoFactory("java");
//        new VideoSimpleFactory().videoFactory("fe");
//    }

    /**
     * 第二种 使用反射机制，创建实体类
     * @param args
     */
    public static void main(String[] args) {
        new VideoSimpleFactory().videoFactoryV2(new JavaVideo().getClass()).production();
        // 在这里可以将 工厂方法设置成静态方法，确保在后续不会添加其他类继承的情况下。
        new VideoSimpleFactory().videoFactoryV2(new CVideo().getClass()).production();
    }
}

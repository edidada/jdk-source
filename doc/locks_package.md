# 

locks since java 1.5 2004 年 9 月

Lock接口
Condition接口

AbstractOwnableSynchronizer抽象类
子类
- AbstractQueuedSynchronizer
- AbstractQueuedLongSynchronizer

LockSupport的park()和unpark()方法和Object.wait(), notify方法都可以操作线程的等待和唤醒，但是两者主要有两个区别
 1. 面向的主体不同，LockSupport的park, unpark面向的是线程，而Object.wait, nofify面向的是对象
 2. 底层实现机制不同，可以看到Object的wait, notify方法也是native方法，Unsafe的park和unpark方法也是native方法，
    底层实现不同，Object.notify不能唤醒Unsafe park的线程。

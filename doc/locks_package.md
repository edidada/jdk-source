# lock package

locks since java 1.5 2004 �� 9 ��

Lock�ӿ�
Condition�ӿ�

AbstractOwnableSynchronizer������
����
- AbstractQueuedSynchronizer
- AbstractQueuedLongSynchronizer

LockSupport��park()��unpark()������Object.wait(), notify���������Բ����̵߳ĵȴ��ͻ��ѣ�����������Ҫ����������
 1. ��������岻ͬ��LockSupport��park, unpark��������̣߳���Object.wait, nofify������Ƕ���
 2. �ײ�ʵ�ֻ��Ʋ�ͬ�����Կ���Object��wait, notify����Ҳ��native������Unsafe��park��unpark����Ҳ��native������
    �ײ�ʵ�ֲ�ͬ��Object.notify���ܻ���Unsafe park���̡߳�


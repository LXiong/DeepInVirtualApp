/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package dodola.common.hook.base;

/**
 * @author Lody
 *         实现本接口的类具备注入的能力.
 */
public interface Injectable {

    /**
     * 注入的Impl
     *
     * @throws Throwable
     */
    void inject() throws Throwable;

    /**
     * @return 注入环境是否已经失效.
     */
    boolean isEnvBad();

}

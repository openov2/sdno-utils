/*
 * Copyright 2016 Huawei Technologies Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openo.sdno.framework.base.threadpool;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Task test class.<br/>
 * 
 * @author
 * @version SDNO 0.5 2016-3-30
 */
public class TaskTest extends Task {

    @Test
    public void testRun() {
        try {
            new TaskTest().run();
            assertTrue(true);
        } catch(Exception e) {
            fail("Error in running the task");
        }
    }

    @Test
    public void testGetTaskName() {
        assertTrue(null == new TaskTest().getTaskName());
    }

    @Override
    public void doTask() {
        assertTrue(true);
    }

    @Override
    public String getTaskName() {
        return null;
    }

}

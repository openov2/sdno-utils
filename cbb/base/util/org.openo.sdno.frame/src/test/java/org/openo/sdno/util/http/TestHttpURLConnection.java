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

package org.openo.sdno.util.http;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.io.IOUtils;

/**
 * TestHttpURLConnection class.<br>
 * 
 * @author
 * @version SDNO 0.5 2016-4-27
 */
public class TestHttpURLConnection extends HttpURLConnection {

    protected TestHttpURLConnection(URL u) {
        super(u);

    }

    @Override
    public void disconnect() {

    }

    @Override
    public boolean usingProxy() {

        return false;
    }

    @Override
    public void connect() throws IOException {

    }

    @Override
    public InputStream getInputStream() throws IOException {
        String source = "Test string in TestHttpURLConnection.getInputStream().";
        return IOUtils.toInputStream(source, "UTF-8");
    }

    @Override
    public InputStream getErrorStream() {
        String source = "Test string in TestHttpURLConnection.getErrorStream().";
        try {
            return IOUtils.toInputStream(source, "UTF-8");
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String getHeaderField(String name) {
        return "testGetHeaderField";
    }

}

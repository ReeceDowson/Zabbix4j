/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package jp.myaaaaa.zabbix4j.host;

import jp.myaaaaa.zabbix4j.ZabbixApiTestBase;
import jp.myaaaaa.zabbix4j.hostgroup.HostgroupExistRequest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Suguru Yajima on 2014/05/02.
 */
public class HostExistTest extends ZabbixApiTestBase {

    public HostExistTest() {
        super();
    }

    @Test
    public void testExist1() throws Exception {

        int hostId = 10108;

        HostExistRequest request = new HostExistRequest();
        HostExistRequest.Params params = request.getParams();
        params.addHostId(hostId);

        HostExistResponse response = zabbixApi.host().exist(request);

        assertNotNull(response);
        assertTrue(response.isResult());
    }

    @Test
    public void testExist2() throws Exception {

        int hostId = 999999;

        HostExistRequest request = new HostExistRequest();
        HostExistRequest.Params params = request.getParams();
        params.addHostId(hostId);

        HostExistResponse response = zabbixApi.host().exist(request);

        assertNotNull(response);
        assertFalse(response.isResult());
    }
}
/**
 * Copyright © 2019 同程艺龙 (zhihui.li@ly.com)
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
/**
 * 
 */
package com.ly.train.flower.center.service;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ly.train.flower.center.util.R;
import com.ly.train.flower.common.annotation.FlowerService;
import com.ly.train.flower.common.service.Complete;
import com.ly.train.flower.common.service.Service;
import com.ly.train.flower.common.service.container.ServiceContext;
import com.ly.train.flower.common.service.web.Flush;

/**
 * @author leeyazhou
 *
 */
@FlowerService
public class ReturnService implements Service<Object, Object>, Flush, Complete {

  @Override
  public Object process(Object message, ServiceContext context) throws Throwable {
    context.getWeb().println(JSONObject.toJSONString(R.ok(message), SerializerFeature.PrettyFormat));
    return message;
  }

}

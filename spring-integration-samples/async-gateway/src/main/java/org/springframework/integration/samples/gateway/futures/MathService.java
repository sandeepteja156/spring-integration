/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.integration.samples.gateway.futures;

import java.util.Random;

/**
 * @author Oleg Zhurakousky
 *
 */
public class MathService {
	private final Random random = new Random();
	
	public int multiplyByTwo(int i) throws Exception{
		long sleep = random.nextInt(10) * 1000;
		Thread.sleep(sleep);
		//System.out.println("Multiplied " + i);
		return i*2;
	}
}
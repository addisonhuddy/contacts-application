/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package example.app.geode.cache.support;

import java.util.Properties;

import com.gemstone.gemfire.cache.Declarable;

/**
 * DeclarableSupport is an abstract class implementing the GemFire {@link Declarable} interface with a
 * no-op {@code init(:Properties)} implementation extended GemFire components and objects that must be
 * declared in (cache) XML.
 *
 * @author John Blum
 * @see com.gemstone.gemfire.cache.Declarable
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public abstract class DeclarableSupport implements Declarable {

	/**
	 * Initializes a user-defined object using the given properties.
	 *
	 * @param configuration {@link Properties} used to configure and initialize the user-defined object
	 * in GemFire configuration meta-data (e.g. cache.xml).
	 */
	@Override
	public void init(Properties configuration) {
	}
}

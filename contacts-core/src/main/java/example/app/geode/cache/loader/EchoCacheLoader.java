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

package example.app.geode.cache.loader;

import org.apache.geode.cache.CacheLoaderException;
import org.apache.geode.cache.LoaderHelper;

import example.app.geode.cache.loader.support.CacheLoaderSupport;

/**
 * The EchoCacheLoader class is a Apache Geode {@link org.apache.geode.cache.CacheLoader} implementation
 * that echoes back the key as the value for the key.
 *
 * @author John Blum
 * @see example.app.geode.cache.loader.support.CacheLoaderSupport
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public class EchoCacheLoader extends CacheLoaderSupport<Object, Object> {

	private static final EchoCacheLoader INSTANCE = new EchoCacheLoader();

	public static EchoCacheLoader getInstance() {
		return INSTANCE;
	}

	@Override
	public Object load(LoaderHelper<Object, Object> helper) throws CacheLoaderException {
		return helper.getKey();
	}
}

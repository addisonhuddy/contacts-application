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
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package example.app.config;

import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.data.gemfire.cache.config.EnableGemfireCaching;
import org.springframework.data.gemfire.config.annotation.EnableCachingDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

import example.app.config.gemfire.GemFireConfiguration;
import example.app.model.Contact;
import example.app.model.Customer;
import example.app.model.Person;
import example.app.repo.PersonRepository;

/**
 * The ClusterConfigurationExampleConfiguration class...
 *
 * @author John Blum
 * @since 1.0.0
 */
@Configuration
@EnableCachingDefinedRegions
@EnableEntityDefinedRegions(basePackageClasses = Person.class,
  excludeFilters = @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = { Contact.class, Customer.class }))
@EnableGemfireCaching
@EnableGemfireRepositories(basePackageClasses = PersonRepository.class)
@Import(GemFireConfiguration.class)
@SuppressWarnings("unused")
public class ClusterConfigurationExampleConfiguration {

}

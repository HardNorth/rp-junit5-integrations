/*
 * Copyright 2020 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.example.junit5.attribute;

import com.epam.reportportal.annotations.attribute.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemAttributeTest {

	@Test
	@Attributes(attributes = { @Attribute(key = "key", value = "value") })
	public void first() {
		Assertions.assertEquals(1, 1);
	}

	@Test
	@Attributes(attributeValues = { @AttributeValue(value = "value") })
	public void second() {
		Assertions.assertEquals(1, 1);
	}

	@Test
	@Attributes(multiKeyAttributes = { @MultiKeyAttribute(keys = { "k1", "k2" }, value = "v") })
	public void third() {
		Assertions.assertEquals(1, 1);
	}

	@Test
	@Attributes(multiValueAttributes = { @MultiValueAttribute(key = "k", values = { "v1", "v2" }) })
	public void fourth() {
		Assertions.assertEquals(1, 1);
	}

	@Test
	@Attributes(multiValueAttributes = { @MultiValueAttribute(isNullKey = true, values = { "v1", "v2" }) })
	public void fifth() {
		Assertions.assertEquals(1, 1);
	}

	@Test
	@Attributes(attributes = { @Attribute(key = "key1", value = "value1"),
			@Attribute(key = "key2", value = "value2") }, multiKeyAttributes = {
			@MultiKeyAttribute(keys = { "k1", "k2" }, value = "v") })
	public void sixth() {
		Assertions.assertEquals(1, 1);
	}

}

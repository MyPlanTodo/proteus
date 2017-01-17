/*
 * Apache License
 * Version 2.0, January 2004
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * TERMS AND CONDITIONS FOR USE, REPRODUCTION, AND DISTRIBUTION
 *
 * Copyright (c) 2017 Flipkart Internet Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.flipkart.android.proteus;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * StyleTest
 *
 * @author aditya.sharat
 */
public class StyleTest {

    @Test
    public void valueOf_valid() throws Exception {
        int styleId = 2131165442;
        int attributeId = 2130772032;

        Style style = Style.valueOf("?Theme_AppCompat:actionBarSize");

        assert style != null;
        assertThat(style.styleId, is(styleId));
        assertThat(style.attributeId, is(attributeId));
    }

    @Test
    public void valueOf_not_found() throws Exception {
        Style style = Style.valueOf("?random:random");
        assert style == null;
        style = Style.valueOf("?random:random");
        assert style == null;
    }

    @Test
    public void valueOf_invalid() throws Exception {
        Style style = Style.valueOf("random-random");
        assert style == null;
    }

    @Test
    public void copy() throws Exception {
        Style style = Style.valueOf("?Theme_AppCompat:actionBarSize");
        assert style != null;
        assertThat(style, is(style.copy()));
    }

}
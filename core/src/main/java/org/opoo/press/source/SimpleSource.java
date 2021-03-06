/*
 * Copyright 2013 Alex Lin.
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
package org.opoo.press.source;

import org.opoo.press.Origin;
import org.opoo.press.Source;

import java.io.Serializable;
import java.util.Map;

/**
 * @author Alex Lin
 */
public class SimpleSource implements Source, Serializable {
    private final Map<String, Object> frontMatter;
    private final String content;
    private final Origin origin;

    /**
     * @param origin
     * @param frontMatter
     * @param content
     */
    public SimpleSource(Origin origin,
                        Map<String, Object> frontMatter, String content) {
        super();
        this.origin = origin;
        this.frontMatter = frontMatter;
        this.content = content;
    }

    /* (non-Javadoc)
     * @see org.opoo.press.Source#getOrigin()
     */
    @Override
    public Origin getOrigin() {
        return origin;
    }

    /* (non-Javadoc)
     * @see org.opoo.press.Source#getMeta()
     */
    @Override
    public Map<String, Object> getMeta() {
        return frontMatter;
    }

    /* (non-Javadoc)
     * @see org.opoo.press.Source#getContent()
     */
    @Override
    public String getContent() {
        return content;
    }
}

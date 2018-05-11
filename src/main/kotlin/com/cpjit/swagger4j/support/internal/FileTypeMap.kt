/*
 * Copyright 2011-2017 CPJIT Group.
 * 
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
package com.cpjit.swagger4j.support.internal

import java.util.HashMap

import org.apache.commons.io.FilenameUtils
import org.apache.commons.lang3.StringUtils

/**
 * @author yonghuan
 * @since 1.2.0
 */
internal object FileTypeMap {
    private val extension2mime = HashMap<String, String>()

    init {
        extension2mime["css"] = "text/css"
        extension2mime["js"] = "application/javascript"
        extension2mime["jpg"] = "image/jpeg"
        extension2mime["png"] = "image/jpeg"
        extension2mime["svg"] = "image/svg+xml"
    }

    fun getContentType(file: String): String? {
        val extension = FilenameUtils.getExtension(file)
        var mime = extension2mime[extension]
        if (StringUtils.isBlank(mime)) {
            mime = "application/octet-stream"
        }
        return mime
    }
}

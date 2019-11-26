/*
 * #%L
 * AIW i2b2 ETL
 * %%
 * Copyright (C) 2012 - 2013 Emory University
 * %%
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
 * #L%
 */
package edu.emory.cci.aiw.i2b2etl.dest.metadata;

import edu.emory.cci.aiw.etl.util.CodeUtil;
import java.util.logging.Logger;

/**
 *
 * @author Andrew Post
 */
public class MetadataUtil {

    private static class LazyLoggerHolder {

        private static Logger instance =
                Logger.getLogger(MetadataUtil.class.getPackage().getName());
    }

    /**
     * Gets the logger for this package.
     *
     * @return a {@link Logger} object.
     */
    static Logger logger() {
        return LazyLoggerHolder.instance;
    }

    public static String toSourceSystemCode(String sourceIdString) {
        if (sourceIdString != null && sourceIdString.length() > CodeUtil.CODE_LENGTH) {
            return sourceIdString.substring(0, CodeUtil.CODE_LENGTH);
        } else {
            return sourceIdString;
        }
    }
    
    public static final String DEFAULT_CONCEPT_ID_PREFIX_INTERNAL = "AIW";
}

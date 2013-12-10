/**********************************************************************
Copyright (c) 2003 Erik Bengtson and others. All rights reserved.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Contributors:
2003 Andy Jefferson - coding standards
    ...
**********************************************************************/
package org.datanucleus.store.valuegenerator;

import org.datanucleus.exceptions.NucleusException;

/**
 * General class to throw exceptions in generators.
 */
public class ValueGenerationException extends NucleusException
{
    /**
     * Constructor
     * @param message a localised message
     */
    public ValueGenerationException(String message)
    {
        super(message);
    }

    /**
     * Constructor
     * @param message a localised message
     * @param nested the nested exception 
     */
    public ValueGenerationException(String message, Throwable nested)
    {
        super(message, nested);
    }
}
////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code for adherence to a set of rules.
// Copyright (C) 2001-2002  Oliver Burn
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
////////////////////////////////////////////////////////////////////////////////
package com.puppycrawl.tools.checkstyle.checks;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the options for whitespace around parentheses.
 *
 * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a>
 * @version 1
 */
public final class PadOption
    extends AbstractOption
{
    /** maps from a string representation to an option */
    private static final Map STR_TO_OPT = new HashMap();
    
    /**
     * Represents no spacing following a left parenthesis
     * or preceeding a right one. 
     */
    public static final PadOption NOSPACE = new PadOption("nospace");
    /**
     * Represents mandatory spacing following a left parenthesis
     * and preceeding a right one.
     */
    public static final PadOption SPACE = new PadOption("space");

    /**
     * Creates a new <code>PadOption</code> instance.
     * @param aStrRep the string representation
     */
    private PadOption(String aStrRep)
    {
        super(aStrRep);
    }
    
    /** @see com.puppycrawl.tools.checkstyle.checks.AbstractOption */
    protected Map getStrToOpt()
    {
        return STR_TO_OPT;
    }  
}

//
// JODConverter - Java OpenDocument Converter
// Copyright 2004-2011 Mirko Nasato and contributors
//
// JODConverter is free software: you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public License
// as published by the Free Software Foundation, either version 3 of
// the License, or (at your option) any later version.
//
// JODConverter is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General
// Public License along with JODConverter.  If not, see
// <http://www.gnu.org/licenses/>.
//
package org.artofsolving.jodconverter.office;

import static org.artofsolving.jodconverter.office.OfficeUtils.toUrl;
import static org.testng.Assert.assertEquals;

import java.io.File;

public class OfficeUtilsTest {

    public void testToUrl() {
        //TODO create separate tests for Windows
        assertEquals(toUrl(new File("/tmp/document.odt")), "file:///tmp/document.odt");
        assertEquals(toUrl(new File("/tmp/document with spaces.odt")), "file:///tmp/document%20with%20spaces.odt");
    }

}

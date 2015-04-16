/*
 * Copyright (c) 2001-2002, Marco Hunsicker. All rights reserved.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 */
package de.hunsicker.jalopy.storage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import de.hunsicker.util.ResourceBundleFactory;

import java.text.MessageFormat;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


/**
 * Exposes the loggers that are used throughout the system.
 *
 * @author <a href="http://jalopy.sf.net/contact.html">Marco Hunsicker</a>
 * @version $Revision: 1.3 $
 */
public final class Loggers
{
    //~ Static variables/initializers ----------------------------------------------------

    /** Logging category for all messages. */
    public static final Logger ALL = Logger.getLogger("de.hunsicker.jalopy");

    /** Logging category for I/O messages. */
    public static final Logger IO = Logger.getLogger("de.hunsicker.jalopy.io");

    /** Logging category for parsing messages. */
    public static final Logger PARSER =
        Logger.getLogger("de.hunsicker.jalopy.language.java");

    /** Logging category for Javadoc parsing messages. */
    public static final Logger PARSER_JAVADOC =
        Logger.getLogger("de.hunsicker.jalopy.language.javadoc");

    /** Logging category for printer messages. */
    public static final Logger PRINTER = Logger.getLogger("de.hunsicker.jalopy.printer");

    /** Logging category for Javadoc printer messages. */
    public static final Logger PRINTER_JAVADOC =
        Logger.getLogger("de.hunsicker.jalopy.printerjavadoc");

    /** Logging category for transformation messages. */
    public static final Logger TRANSFORM =
        Logger.getLogger("de.hunsicker.jalopy.transform");

    private static final ResourceBundle resourceBundle =
        ResourceBundleFactory.getBundle("de.hunsicker.jalopy.storage.Bundle");

    public static String fmt(String key, Object... args) {
        return MessageFormat.format(resourceBundle.getString(key), args);
    }

}

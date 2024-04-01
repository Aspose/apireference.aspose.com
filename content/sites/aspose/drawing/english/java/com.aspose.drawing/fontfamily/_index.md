---
title: FontFamily
second_title: Aspose.Drawing for Java API Reference
description: Defines a group of type faces having a similar basic design and certain variations in styles.
type: docs
weight: 24
url: /java/com.aspose.drawing/fontfamily/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
com.aspose.ms.System.IDisposable
```
public final class FontFamily implements System.IDisposable
```

Defines a group of type faces having a similar basic design and certain variations in styles. This class cannot be inherited.
## Constructors

| Constructor | Description |
| --- | --- |
| [FontFamily(String name)](#FontFamily-java.lang.String-) | Initializes a new instance of the [FontFamily](../../com.aspose.drawing/fontfamily) class with the specified name. |
| [FontFamily(String name, FontCollection fontCollection)](#FontFamily-java.lang.String-com.aspose.drawing.FontCollection-) | Initializes a new instance of the [FontFamily](../../com.aspose.drawing/fontfamily) class. |
| [FontFamily(String name, FontFamilyDefinition definition)](#FontFamily-java.lang.String-com.aspose.drawing.FontFamilyDefinition-) | Initializes a new instance of the [FontFamily](../../com.aspose.drawing/fontfamily) class. |
## Methods

| Method | Description |
| --- | --- |
| [getFamilies()](#getFamilies--) | Gets an array that contains all the [FontFamily](../../com.aspose.drawing/fontfamily) objects associated with the current graphics context. |
| [getGenericSansSerif()](#getGenericSansSerif--) | Gets a generic sans serif [FontFamily](../../com.aspose.drawing/fontfamily) object. |
| [getGenericSerif()](#getGenericSerif--) | Gets a generic serif [FontFamily](../../com.aspose.drawing/fontfamily). |
| [getGenericMonospace()](#getGenericMonospace--) | Gets a generic monospace [FontFamily](../../com.aspose.drawing/fontfamily). |
| [getName()](#getName--) | Gets the name of this [FontFamily](../../com.aspose.drawing/fontfamily). |
| [dispose()](#dispose--) | Releases all resources used by this [FontFamily](../../com.aspose.drawing/fontfamily). |
| [getName(int language)](#getName-int-) | Returns the name, in the specified language, of this [FontFamily](../../com.aspose.drawing/fontfamily). |
| [isStyleAvailable(int style)](#isStyleAvailable-int-) | Indicates whether the specified [FontStyle](../../com.aspose.drawing/fontstyle) enumeration is available. |
| [getEmHeight(int style)](#getEmHeight-int-) | Gets the height, in font design units, of the EM square for the specified style. |
| [getCellAscent(int style)](#getCellAscent-int-) | Returns the cell ascent, in design units, of the [FontFamily](../../com.aspose.drawing/fontfamily) of the specified style. |
| [getCellDescent(int style)](#getCellDescent-int-) | Returns the cell descent, in design units, of the [FontFamily](../../com.aspose.drawing/fontfamily) of the specified style. |
| [hashCode()](#hashCode--) | Gets a hash code for this [FontFamily](../../com.aspose.drawing/fontfamily). |
| [equals(Object obj)](#equals-java.lang.Object-) | Indicates whether the specified object is a [FontFamily](../../com.aspose.drawing/fontfamily) and is identical to this [FontFamily](../../com.aspose.drawing/fontfamily). |
| [getLineSpacing(int style)](#getLineSpacing-int-) | Returns the line spacing, in design units, of the [FontFamily](../../com.aspose.drawing/fontfamily) of the specified style. |
### FontFamily(String name) {#FontFamily-java.lang.String-}
```
public FontFamily(String name)
```


Initializes a new instance of the [FontFamily](../../com.aspose.drawing/fontfamily) class with the specified name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of the new [FontFamily](../../com.aspose.drawing/fontfamily). |

### FontFamily(String name, FontCollection fontCollection) {#FontFamily-java.lang.String-com.aspose.drawing.FontCollection-}
```
public FontFamily(String name, FontCollection fontCollection)
```


Initializes a new instance of the [FontFamily](../../com.aspose.drawing/fontfamily) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of the font family. |
| fontCollection | [FontCollection](../../com.aspose.drawing/fontcollection) | The font collection. |

### FontFamily(String name, FontFamilyDefinition definition) {#FontFamily-java.lang.String-com.aspose.drawing.FontFamilyDefinition-}
```
public FontFamily(String name, FontFamilyDefinition definition)
```


Initializes a new instance of the [FontFamily](../../com.aspose.drawing/fontfamily) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | The name of the font family. |
| definition | [FontFamilyDefinition](../../com.aspose.drawing/fontfamilydefinition) | The definition. |

### getFamilies() {#getFamilies--}
```
public static FontFamily[] getFamilies()
```


Gets an array that contains all the [FontFamily](../../com.aspose.drawing/fontfamily) objects associated with the current graphics context.

**Returns:**
com.aspose.drawing.FontFamily[] - An array of [FontFamily](../../com.aspose.drawing/fontfamily) objects associated with the current graphics context.
### getGenericSansSerif() {#getGenericSansSerif--}
```
public static FontFamily getGenericSansSerif()
```


Gets a generic sans serif [FontFamily](../../com.aspose.drawing/fontfamily) object.

**Returns:**
[FontFamily](../../com.aspose.drawing/fontfamily) - A [FontFamily](../../com.aspose.drawing/fontfamily) object that represents a generic sans serif font.
### getGenericSerif() {#getGenericSerif--}
```
public static FontFamily getGenericSerif()
```


Gets a generic serif [FontFamily](../../com.aspose.drawing/fontfamily).

**Returns:**
[FontFamily](../../com.aspose.drawing/fontfamily) - A [FontFamily](../../com.aspose.drawing/fontfamily) that represents a generic serif font.
### getGenericMonospace() {#getGenericMonospace--}
```
public static FontFamily getGenericMonospace()
```


Gets a generic monospace [FontFamily](../../com.aspose.drawing/fontfamily).

**Returns:**
[FontFamily](../../com.aspose.drawing/fontfamily) - A [FontFamily](../../com.aspose.drawing/fontfamily) that represents a generic monospace font.
### getName() {#getName--}
```
public String getName()
```


Gets the name of this [FontFamily](../../com.aspose.drawing/fontfamily).

**Returns:**
java.lang.String - A String that represents the name of this [FontFamily](../../com.aspose.drawing/fontfamily).
### dispose() {#dispose--}
```
public void dispose()
```


Releases all resources used by this [FontFamily](../../com.aspose.drawing/fontfamily).

### getName(int language) {#getName-int-}
```
public String getName(int language)
```


Returns the name, in the specified language, of this [FontFamily](../../com.aspose.drawing/fontfamily).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| language | int | The language in which the name is returned. |

**Returns:**
java.lang.String - A String that represents the name, in the specified language, of this [FontFamily](../../com.aspose.drawing/fontfamily).
### isStyleAvailable(int style) {#isStyleAvailable-int-}
```
public boolean isStyleAvailable(int style)
```


Indicates whether the specified [FontStyle](../../com.aspose.drawing/fontstyle) enumeration is available.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) to test. |

**Returns:**
boolean - true if the specified [FontStyle](../../com.aspose.drawing/fontstyle) is available; otherwise, false.
### getEmHeight(int style) {#getEmHeight-int-}
```
public int getEmHeight(int style)
```


Gets the height, in font design units, of the EM square for the specified style.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) for which to get the EM height. |

**Returns:**
int - The height of the EM square.
### getCellAscent(int style) {#getCellAscent-int-}
```
public int getCellAscent(int style)
```


Returns the cell ascent, in design units, of the [FontFamily](../../com.aspose.drawing/fontfamily) of the specified style.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | int | A [FontStyle](../../com.aspose.drawing/fontstyle) that contains style information for the font. |

**Returns:**
int - The cell ascent for this [FontFamily](../../com.aspose.drawing/fontfamily) that uses the specified [FontStyle](../../com.aspose.drawing/fontstyle).
### getCellDescent(int style) {#getCellDescent-int-}
```
public int getCellDescent(int style)
```


Returns the cell descent, in design units, of the [FontFamily](../../com.aspose.drawing/fontfamily) of the specified style.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | int | A [FontStyle](../../com.aspose.drawing/fontstyle) that contains style information for the font. |

**Returns:**
int - The cell descent metric for this [FontFamily](../../com.aspose.drawing/fontfamily) that uses the specified [FontStyle](../../com.aspose.drawing/fontstyle).
### hashCode() {#hashCode--}
```
public int hashCode()
```


Gets a hash code for this [FontFamily](../../com.aspose.drawing/fontfamily).

**Returns:**
int - The hash code for this [FontFamily](../../com.aspose.drawing/fontfamily).
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


Indicates whether the specified object is a [FontFamily](../../com.aspose.drawing/fontfamily) and is identical to this [FontFamily](../../com.aspose.drawing/fontfamily).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| obj | java.lang.Object | The object to test. |

**Returns:**
boolean - `true` if `obj` is a [FontFamily](../../com.aspose.drawing/fontfamily) and is identical to this [FontFamily](../../com.aspose.drawing/fontfamily); otherwise, `false`.
### getLineSpacing(int style) {#getLineSpacing-int-}
```
public int getLineSpacing(int style)
```


Returns the line spacing, in design units, of the [FontFamily](../../com.aspose.drawing/fontfamily) of the specified style. The line spacing is the vertical distance between the base lines of two consecutive lines of text.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| style | int | The [FontStyle](../../com.aspose.drawing/fontstyle) to apply. |

**Returns:**
int - The distance between two consecutive lines of text.

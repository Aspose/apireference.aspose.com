---
title: ExternalFontCache
second_title: Aspose.Page for Java API Reference
description: Use this class to obtain font encapsulation in a form that is accepted by Device.
type: docs
weight: 14
url: /java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Use this class to obtain font encapsulation in a form that is accepted by Device.
## Constructors

| Constructor | Description |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Methods

| Method | Description |
| --- | --- |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifies additional fonts folders. |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Fetches DrFont by font family name, size and style. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Fetches DrFont by font family name, size, style and font capitals. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Fetches DrFont by font family name, size, style and alternative font family name. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Fetches DrFont by font family name, size, style, font capitals and alternative font family name. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Fetches TTFont by font family name, style and alternative font family name. |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


Specifies additional fonts folders. Fonts folders that are used by OS are used by ExternalFont Cache by default. There are no needs to define them,

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | An array of additional fonts folders. |

### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Fetches DrFont by font family name, size and style.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Font family name. |
| sizePoints | float | Font size in points (one point is 1/72 of inch). |
| style | int | Font style. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Fetches DrFont by font family name, size, style and font capitals.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Font family name. |
| sizePoints | float | Font size in points (one point is 1/72 of inch). |
| style | int | Font style. |
| fontCapitals | int | Font capitals. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Fetches DrFont by font family name, size, style and alternative font family name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Font family name. |
| sizePoints | float | Font size in points (one point is 1/72 of inch). |
| style | int | Font style. |
| altFamilyName | java.lang.String | Alternative font family name. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Fetches DrFont by font family name, size, style, font capitals and alternative font family name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Font family name. |
| sizePoints | float | Font size in points (one point is 1/72 of inch). |
| style | int | Font style. |
| altFamilyName | java.lang.String | Alternative font family name. |
| fontCapitals | int | Font capitals. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Fetches TTFont by font family name, style and alternative font family name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| familyName | java.lang.String | Font family name. |
| style | int | Font style. |
| altFamilyName | java.lang.String | Alternative font family name. |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont.

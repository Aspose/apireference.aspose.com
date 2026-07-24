---
title: "ExternalFontCache"
second_title: "Aspose.Page voor Java API-referentie"
description: "Gebruik deze klasse om font-inkapseling te verkrijgen in een vorm die door Device wordt geaccepteerd."
type: docs
weight: 13
url: /nl/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Gebruik deze klasse om font-inkapseling te verkrijgen in een vorm die door Device wordt geaccepteerd.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Velden

| Veld | Beschrijving |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Standaard lettergrootte. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Standaard lettertype stijl. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | Haalt DrFont op basis van lettertypefamilienaam, standaardgrootte (1) en standaardstijl (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | Haalt DrFont op basis van lettertypefamilienaam, standaardgrootte (1) en stijl. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Haalt DrFont op basis van lettertypefamilienaam, grootte en stijl. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Haalt DrFont op basis van lettertypefamilienaam, grootte, stijl en hoofdletters. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Haalt DrFont op basis van lettertypefamilienaam, grootte, stijl en alternatieve lettertypefamilienaam. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Haalt DrFont op basis van lettertypefamilienaam, grootte, stijl, hoofdletters en alternatieve lettertypefamilienaam. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Haalt TTFont op basis van lettertypefamilienaam, stijl en alternatieve lettertypefamilienaam. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specificeert extra lettertype-mappen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ExternalFontCache() {#ExternalFontCache--}
```
public ExternalFontCache()
```


### DEFAULT_SIZE {#DEFAULT-SIZE}
```
public static final float DEFAULT_SIZE
```


Standaard lettergrootte.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Standaard lettertype stijl.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


Haalt DrFont op basis van lettertypefamilienaam, standaardgrootte (1) en standaardstijl (PLAIN).

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| familyName | java.lang.String | Lettertypefamilienaam. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


Haalt DrFont op basis van lettertypefamilienaam, standaardgrootte (1) en stijl.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| familyName | java.lang.String | Lettertypefamilienaam. |
| stijl | int | Lettertype stijl. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Haalt DrFont op basis van lettertypefamilienaam, grootte en stijl.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| familyName | java.lang.String | Lettertypefamilienaam. |
| sizePoints | float | Lettergrootte in punten (een punt is 1/72 van een inch). |
| stijl | int | Lettertype stijl. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Haalt DrFont op basis van lettertypefamilienaam, grootte, stijl en hoofdletters.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| familyName | java.lang.String | Lettertypefamilienaam. |
| sizePoints | float | Lettergrootte in punten (een punt is 1/72 van een inch). |
| stijl | int | Lettertype stijl. |
| fontCapitals | int | Lettertype hoofdletters. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Haalt DrFont op basis van lettertypefamilienaam, grootte, stijl en alternatieve lettertypefamilienaam.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| familyName | java.lang.String | Lettertypefamilienaam. |
| sizePoints | float | Lettergrootte in punten (een punt is 1/72 van een inch). |
| stijl | int | Lettertype stijl. |
| altFamilyName | java.lang.String | Alternatieve lettertypefamilienaam. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Haalt DrFont op basis van lettertypefamilienaam, grootte, stijl, hoofdletters en alternatieve lettertypefamilienaam.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| familyName | java.lang.String | Lettertypefamilienaam. |
| sizePoints | float | Lettergrootte in punten (een punt is 1/72 van een inch). |
| stijl | int | Lettertype stijl. |
| altFamilyName | java.lang.String | Alternatieve lettertypefamilienaam. |
| fontCapitals | int | Lettertype hoofdletters. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Haalt TTFont op basis van lettertypefamilienaam, stijl en alternatieve lettertypefamilienaam.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| familyName | java.lang.String | Lettertypefamilienaam. |
| stijl | int | Lettertype stijl. |
| altFamilyName | java.lang.String | Alternatieve lettertypefamilienaam. |

**Returns:**
com.aspose.foundation.truetype.TTFont - TTFont.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] additionalFontFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public static void setAdditionalFontsFolders(String[] additionalFontFolders)
```


Specificeert extra lettertype-mappen. Lettertype-mappen die door het besturingssysteem worden gebruikt, worden standaard door de ExternalFont Cache gebruikt. Er is geen noodzaak om ze te definiëren,

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | Een array van extra lettertype-mappen. |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


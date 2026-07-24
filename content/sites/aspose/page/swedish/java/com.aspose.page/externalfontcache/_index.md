---
title: "ExternalFontCache"
second_title: "Aspose.Page för Java API-referens"
description: "Använd den här klassen för att få fontinkapsling i ett format som accepteras av Device."
type: docs
weight: 13
url: /sv/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Använd den här klassen för att få fontinkapsling i ett format som accepteras av Device.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Fält

| Fält | Beskrivning |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Standard teckenstorlek. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Standard teckenstil. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | Hämtar DrFont efter typsnittsfamiljnamn, standardstorlek (1) och standardstil (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | Hämtar DrFont efter typsnittsfamiljnamn, standardstorlek (1) och stil. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Hämtar DrFont efter typsnittsfamiljnamn, storlek och stil. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Hämtar DrFont efter typsnittsfamiljnamn, storlek, stil och versaler. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Hämtar DrFont efter typsnittsfamiljnamn, storlek, stil och alternativt typsnittsfamiljnamn. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Hämtar DrFont efter typsnittsfamiljnamn, storlek, stil, versaler och alternativt typsnittsfamiljnamn. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Hämtar TTFont efter typsnittsfamiljnamn, stil och alternativt typsnittsfamiljnamn. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Anger ytterligare teckensnittsmappar. |
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


Standard teckenstorlek.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Standard teckenstil.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


Hämtar DrFont efter typsnittsfamiljnamn, standardstorlek (1) och standardstil (PLAIN).

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| familyName | java.lang.String | Typsnittsfamiljnamn. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


Hämtar DrFont efter typsnittsfamiljnamn, standardstorlek (1) och stil.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| familyName | java.lang.String | Typsnittsfamiljnamn. |
| style | int | Teckenstil. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Hämtar DrFont efter typsnittsfamiljnamn, storlek och stil.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| familyName | java.lang.String | Typsnittsfamiljnamn. |
| sizePoints | float | Teckenstorlek i punkter (en punkt är 1/72 tum). |
| style | int | Teckenstil. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Hämtar DrFont efter typsnittsfamiljnamn, storlek, stil och versaler.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| familyName | java.lang.String | Typsnittsfamiljnamn. |
| sizePoints | float | Teckenstorlek i punkter (en punkt är 1/72 tum). |
| style | int | Teckenstil. |
| fontCapitals | int | Versaler för teckensnitt. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Hämtar DrFont efter typsnittsfamiljnamn, storlek, stil och alternativt typsnittsfamiljnamn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| familyName | java.lang.String | Typsnittsfamiljnamn. |
| sizePoints | float | Teckenstorlek i punkter (en punkt är 1/72 tum). |
| style | int | Teckenstil. |
| altFamilyName | java.lang.String | Alternativt namn på teckensnittsfamilj. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Hämtar DrFont efter typsnittsfamiljnamn, storlek, stil, versaler och alternativt typsnittsfamiljnamn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| familyName | java.lang.String | Typsnittsfamiljnamn. |
| sizePoints | float | Teckenstorlek i punkter (en punkt är 1/72 tum). |
| style | int | Teckenstil. |
| altFamilyName | java.lang.String | Alternativt namn på teckensnittsfamilj. |
| fontCapitals | int | Versaler för teckensnitt. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Hämtar TTFont efter typsnittsfamiljnamn, stil och alternativt typsnittsfamiljnamn.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| familyName | java.lang.String | Typsnittsfamiljnamn. |
| style | int | Teckenstil. |
| altFamilyName | java.lang.String | Alternativt namn på teckensnittsfamilj. |

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


Anger ytterligare teckensnittsmappar. Teckensnittsmappar som används av OS används av ExternalFont Cache som standard. Det finns inget behov av att definiera dem,

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | En array av ytterligare teckensnittsmappar. |

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


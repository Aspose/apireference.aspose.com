---
title: "ExternalFontCache"
second_title: "Aspose.Page for Java API-Referenz"
description: "Verwenden Sie diese Klasse, um die Schriftkapselung in einer Form zu erhalten, die von Device akzeptiert wird."
type: docs
weight: 13
url: /de/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Verwenden Sie diese Klasse, um die Schriftkapselung in einer Form zu erhalten, die von Device akzeptiert wird.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Standard-Schriftgröße. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Standard-Schriftstil. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | Lädt DrFont nach Schriftfamiliennamen, Standardgröße (1) und Standardstil (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | Lädt DrFont nach Schriftfamiliennamen, Standardgröße (1) und Stil. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Lädt DrFont nach Schriftfamiliennamen, Größe und Stil. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Lädt DrFont nach Schriftfamiliennamen, Größe, Stil und Großbuchstaben. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Lädt DrFont nach Schriftfamiliennamen, Größe, Stil und alternativem Schriftfamiliennamen. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Lädt DrFont nach Schriftfamiliennamen, Größe, Stil, Großbuchstaben und alternativem Schriftfamiliennamen. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Lädt TTFont nach Schriftfamiliennamen, Stil und alternativem Schriftfamiliennamen. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Gibt zusätzliche Schriftordner an. |
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


Standard-Schriftgröße.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Standard-Schriftstil.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


Lädt DrFont nach Schriftfamiliennamen, Standardgröße (1) und Standardstil (PLAIN).

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| familyName | java.lang.String | Schriftfamilienname. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


Lädt DrFont nach Schriftfamiliennamen, Standardgröße (1) und Stil.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| familyName | java.lang.String | Schriftfamilienname. |
| Stil | int | Schriftstil. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Lädt DrFont nach Schriftfamiliennamen, Größe und Stil.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| familyName | java.lang.String | Schriftfamilienname. |
| sizePoints | float | Schriftgröße in Punkten (ein Punkt ist 1/72 Zoll). |
| Stil | int | Schriftstil. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Lädt DrFont nach Schriftfamiliennamen, Größe, Stil und Großbuchstaben.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| familyName | java.lang.String | Schriftfamilienname. |
| sizePoints | float | Schriftgröße in Punkten (ein Punkt ist 1/72 Zoll). |
| Stil | int | Schriftstil. |
| fontCapitals | int | Schriftgroßbuchstaben. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Lädt DrFont nach Schriftfamiliennamen, Größe, Stil und alternativem Schriftfamiliennamen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| familyName | java.lang.String | Schriftfamilienname. |
| sizePoints | float | Schriftgröße in Punkten (ein Punkt ist 1/72 Zoll). |
| Stil | int | Schriftstil. |
| altFamilyName | java.lang.String | Alternativer Schriftfamilienname. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Lädt DrFont nach Schriftfamiliennamen, Größe, Stil, Großbuchstaben und alternativem Schriftfamiliennamen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| familyName | java.lang.String | Schriftfamilienname. |
| sizePoints | float | Schriftgröße in Punkten (ein Punkt ist 1/72 Zoll). |
| Stil | int | Schriftstil. |
| altFamilyName | java.lang.String | Alternativer Schriftfamilienname. |
| fontCapitals | int | Schriftgroßbuchstaben. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Lädt TTFont nach Schriftfamiliennamen, Stil und alternativem Schriftfamiliennamen.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| familyName | java.lang.String | Schriftfamilienname. |
| Stil | int | Schriftstil. |
| altFamilyName | java.lang.String | Alternativer Schriftfamilienname. |

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


Gibt zusätzliche Schriftordner an. Schriftordner, die vom Betriebssystem verwendet werden, werden standardmäßig vom ExternalFont-Cache verwendet. Es besteht keine Notwendigkeit, sie zu definieren,

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | Ein Array zusätzlicher Schriftordner. |

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


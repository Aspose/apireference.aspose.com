---
title: "FontDefinition"
second_title: "Aspose.Font für Java API-Referenz"
description: "Stellt die Definition einer Font-Datei-Sammlung dar."
type: docs
weight: 38
url: /de/java/com.aspose.font/fontdefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontDefinition
```

Stellt die Definition eines Font-Dateisatzes dar. Diese Klasse enthält Felder, die nicht mit internen Font-Daten zusammenhängen. Diese Felder beschreiben die Font-Platzierung und weitere Daten, die zum Laden einer Font aus einer Font-Quelle (Datei, Speicher usw.) erforderlich sind.
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Erstellt eine Einzeldatei-Font-Definition. |
| [FontDefinition(FontType fontType, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Erstellt eine Einzeldatei-Font-Definition. |
| [FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Erstellt eine Einzeldatei-Font-Definition. |
| [FontDefinition(FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Erstellt eine Einzeldatei-Font-Definition. |
| [FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Erstellt eine Einzeldatei-Font-Definition. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Erstellt eine Einzeldatei-Font-Definition. |
| [FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Erstellt eine Mehrdatei-Font-Definition. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Erstellt eine Mehrdatei-Font-Definition. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Erstellt eine Mehrdatei-Font-Definition. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Erstellt eine Mehrdatei-Font-Definition. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileDefinitions()](#getFileDefinitions--) | Ruft die Sammlung von Dateidefinitionen ab. |
| [getFontName()](#getFontName--) | Gibt den Font-Namen zurück. |
| [getFontNames()](#getFontNames--) | Ruft Font-Namen als ein  MultiLanguageString  ab. |
| [getFontType()](#getFontType--) | Liefert Font‑Typ. |
| [getPostscriptName()](#getPostscriptName--) | Ruft den Postscript-Font-Namen ab. |
| [getPostscriptNames()](#getPostscriptNames--) | Ruft Postscript-Font-Namen als ein  MultiLanguageString  ab. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(StreamSource source, FontType fontType)](#open-com.aspose.font.StreamSource-com.aspose.font.FontType-) | Gibt die FontDefinition für die Font-Stream-Quelle und den Font-Typ zurück. |
| [open(String fileName, FontType fontType)](#open-java.lang.String-com.aspose.font.FontType-) | Gibt die FontDefinition für die Font-Datei und den Font-Typ zurück. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)
```


Erstellt eine Einzeldatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileExtension | java.lang.String | Font-Dateierweiterung. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Font-Stream-Quelle. |

### FontDefinition(FontType fontType, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, StreamSource streamSource)
```


Erstellt eine Einzeldatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Font-Stream-Quelle. |

### FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)
```


Erstellt eine Einzeldatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontName | java.lang.String | Schriftartname. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileExtension | java.lang.String | Font-Dateierweiterung. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Font-Stream-Quelle. |

### FontDefinition(FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(FontType fontType, FontFileDefinition fileDefinition)
```


Erstellt eine Einzeldatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)
```


Erstellt eine Einzeldatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontName | java.lang.String | Schriftartname. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)
```


Erstellt eine Einzeldatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontName | java.lang.String | Schriftartname. |
| postscriptName | java.lang.String | Postscript-Font-Name. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)
```


Erstellt eine Mehrdatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Array von FontFileDefinition-Objekten. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Erstellt eine Mehrdatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontName | java.lang.String | Schriftartname. |
| postscriptName | java.lang.String | Postscript-Font-Name. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Array von FontFileDefinition-Objekten. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)
```


Erstellt eine Mehrdatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Font-Namen. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Postscript-Font-Namen. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Erstellt eine Mehrdatei-Font-Definition.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Font-Namen. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Postscript-Font-Namen. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Array von FontFileDefinition-Objekten. |

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
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getFileDefinitions() {#getFileDefinitions--}
```
public FontFileDefinition[] getFileDefinitions()
```


Ruft die Sammlung von Dateidefinitionen ab.

**Returns:**
com.aspose.font.FontFileDefinition[] - Sammlung von Dateidefinitionen.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Gibt den Font-Namen zurück.

**Returns:**
java.lang.String - Schriftartname.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Ruft Font-Namen als ein  MultiLanguageString  ab.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names as a  MultiLanguageString .
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Liefert Font‑Typ.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getPostscriptName() {#getPostscriptName--}
```
public String getPostscriptName()
```


Ruft den Postscript-Font-Namen ab.

**Returns:**
java.lang.String - Postscript-Font-Name.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Ruft Postscript-Font-Namen als ein  MultiLanguageString  ab.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Postscript Font names as a  MultiLanguageString .
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




### open(StreamSource source, FontType fontType) {#open-com.aspose.font.StreamSource-com.aspose.font.FontType-}
```
public static FontDefinition open(StreamSource source, FontType fontType)
```


Gibt die FontDefinition für die Font-Stream-Quelle und den Font-Typ zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| source | [StreamSource](../../com.aspose.font/streamsource) | Font-Stream-Quelle. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
### open(String fileName, FontType fontType) {#open-java.lang.String-com.aspose.font.FontType-}
```
public static FontDefinition open(String fileName, FontType fontType)
```


Gibt die FontDefinition für die Font-Datei und den Font-Typ zurück.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| fileName | java.lang.String | Schriftdateiname. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Schrifttyp. |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
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


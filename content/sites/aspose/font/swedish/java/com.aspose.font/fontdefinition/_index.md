---
title: "FontDefinition"
second_title: "Aspose.Font för Java API-referens"
description: "Representerar definition av Font-filuppsättning."
type: docs
weight: 38
url: /sv/java/com.aspose.font/fontdefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontDefinition
```

Representerar definition av teckensnittfiluppsättning. Denna klass innehåller fält som inte är relaterade till teckensnittets interna data. Dessa fält beskriver teckensnittets placering och annan data som behövs för att ladda teckensnitt från någon teckensnittskälla (fil, minne, etc).
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Skapar en enkel-fils teckensnittsdefinition. |
| [FontDefinition(FontType fontType, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Skapar en enkel-fils teckensnittsdefinition. |
| [FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Skapar en enkel-fils teckensnittsdefinition. |
| [FontDefinition(FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Skapar en enkel-fils teckensnittsdefinition. |
| [FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Skapar en enkel-fils teckensnittsdefinition. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Skapar en enkel-fils teckensnittsdefinition. |
| [FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Skapar en flermodulig teckensnittsdefinition. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Skapar en flermodulig teckensnittsdefinition. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Skapar en flermodulig teckensnittsdefinition. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Skapar en flermodulig teckensnittsdefinition. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileDefinitions()](#getFileDefinitions--) | Hämtar samling av fildefinitioner. |
| [getFontName()](#getFontName--) | Returnerar teckensnittets namn. |
| [getFontNames()](#getFontNames--) | Hämtar teckensnittens namn som en  MultiLanguageString . |
| [getFontType()](#getFontType--) | Hämtar Font‑typ. |
| [getPostscriptName()](#getPostscriptName--) | Hämtar postscript-teckensnittets namn. |
| [getPostscriptNames()](#getPostscriptNames--) | Hämtar postscript-teckensnittens namn som en  MultiLanguageString . |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(StreamSource source, FontType fontType)](#open-com.aspose.font.StreamSource-com.aspose.font.FontType-) | Returnerar FontDefinition för teckensnittets strömkälla och teckensnittstyp. |
| [open(String fileName, FontType fontType)](#open-java.lang.String-com.aspose.font.FontType-) | Returnerar FontDefinition för teckensnittfil och teckensnittstyp. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)
```


Skapar en enkel-fils teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileExtension | java.lang.String | Teckensnittfilens filändelse. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Teckensnittets strömkälla. |

### FontDefinition(FontType fontType, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, StreamSource streamSource)
```


Skapar en enkel-fils teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Teckensnittets strömkälla. |

### FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)
```


Skapar en enkel-fils teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontName | java.lang.String | Teckensnittsnamn. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileExtension | java.lang.String | Teckensnittfilens filändelse. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Teckensnittets strömkälla. |

### FontDefinition(FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(FontType fontType, FontFileDefinition fileDefinition)
```


Skapar en enkel-fils teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)
```


Skapar en enkel-fils teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontName | java.lang.String | Teckensnittsnamn. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)
```


Skapar en enkel-fils teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontName | java.lang.String | Teckensnittsnamn. |
| postscriptName | java.lang.String | Postscript-teckensnittets namn. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)
```


Skapar en flermodulig teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Array av FontFileDefinition-objekt. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Skapar en flermodulig teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontName | java.lang.String | Teckensnittsnamn. |
| postscriptName | java.lang.String | Postscript-teckensnittets namn. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Array av FontFileDefinition-objekt. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)
```


Skapar en flermodulig teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Teckensnittsnamn. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Postscript-teckensnittsnamn. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Skapar en flermodulig teckensnittsdefinition.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Teckensnittsnamn. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Postscript-teckensnittsnamn. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Array av FontFileDefinition-objekt. |

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


Hämtar samling av fildefinitioner.

**Returns:**
com.aspose.font.FontFileDefinition[] - Samling av fildefinitioner.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Returnerar teckensnittets namn.

**Returns:**
java.lang.String - Teckensnittsnamn.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Hämtar teckensnittens namn som en  MultiLanguageString .

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names as a  MultiLanguageString .
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Hämtar Font‑typ.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getPostscriptName() {#getPostscriptName--}
```
public String getPostscriptName()
```


Hämtar postscript-teckensnittets namn.

**Returns:**
java.lang.String - Postscript-teckensnittets namn.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Hämtar postscript-teckensnittens namn som en  MultiLanguageString .

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


Returnerar FontDefinition för teckensnittets strömkälla och teckensnittstyp.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| source | [StreamSource](../../com.aspose.font/streamsource) | Teckensnittets strömkälla. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
### open(String fileName, FontType fontType) {#open-java.lang.String-com.aspose.font.FontType-}
```
public static FontDefinition open(String fileName, FontType fontType)
```


Returnerar FontDefinition för teckensnittfil och teckensnittstyp.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| fileName | java.lang.String | Fontfilnamn. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Typsnittstyp. |

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


---
title: "FontDefinition"
second_title: "Riferimento API Aspose.Font per Java"
description: "Rappresenta la definizione del set di file Font."
type: docs
weight: 38
url: /it/java/com.aspose.font/fontdefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontDefinition
```

Rappresenta la definizione del set di file Font. Questa classe contiene campi che non sono correlati ai dati interni del font. Questi campi descrivono il posizionamento del font e altri dati necessari per caricare il font da una qualche fonte di font (file, memoria, ecc).
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Crea la definizione Font a singolo file. |
| [FontDefinition(FontType fontType, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Crea la definizione Font a singolo file. |
| [FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Crea la definizione Font a singolo file. |
| [FontDefinition(FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Crea la definizione Font a singolo file. |
| [FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Crea la definizione Font a singolo file. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Crea la definizione Font a singolo file. |
| [FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Crea la definizione Font a più file. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Crea la definizione Font a più file. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Crea la definizione Font a più file. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Crea la definizione Font a più file. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileDefinitions()](#getFileDefinitions--) | Ottiene la collezione delle definizioni dei file. |
| [getFontName()](#getFontName--) | Restituisce il nome del Font. |
| [getFontNames()](#getFontNames--) | Ottiene i nomi del Font come un MultiLanguageString. |
| [getFontType()](#getFontType--) | Ottiene il tipo di Font. |
| [getPostscriptName()](#getPostscriptName--) | Ottiene il nome del Font postscript. |
| [getPostscriptNames()](#getPostscriptNames--) | Ottiene i nomi del Font postscript come un MultiLanguageString. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(StreamSource source, FontType fontType)](#open-com.aspose.font.StreamSource-com.aspose.font.FontType-) | Restituisce FontDefinition per la sorgente di stream del font e il tipo di font. |
| [open(String fileName, FontType fontType)](#open-java.lang.String-com.aspose.font.FontType-) | Restituisce FontDefinition per il file del font e il tipo di font. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)
```


Crea la definizione Font a singolo file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileExtension | java.lang.String | Estensione del file Font. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Sorgente di stream del Font. |

### FontDefinition(FontType fontType, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, StreamSource streamSource)
```


Crea la definizione Font a singolo file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Sorgente di stream del Font. |

### FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)
```


Crea la definizione Font a singolo file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontName | java.lang.String | Nome del font. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileExtension | java.lang.String | Estensione del file Font. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Sorgente di stream del Font. |

### FontDefinition(FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(FontType fontType, FontFileDefinition fileDefinition)
```


Crea la definizione Font a singolo file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)
```


Crea la definizione Font a singolo file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontName | java.lang.String | Nome del font. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)
```


Crea la definizione Font a singolo file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontName | java.lang.String | Nome del font. |
| postscriptName | java.lang.String | Nome del Font Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)
```


Crea la definizione Font a più file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Array di oggetti FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Crea la definizione Font a più file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontName | java.lang.String | Nome del font. |
| postscriptName | java.lang.String | Nome del Font Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Array di oggetti FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)
```


Crea la definizione Font a più file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Nomi del Font. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Nomi del Font Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Crea la definizione Font a più file.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Nomi del Font. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Nomi del Font Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Array di oggetti FontFileDefinition. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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


Ottiene la collezione delle definizioni dei file.

**Returns:**
com.aspose.font.FontFileDefinition[] - Collezione delle definizioni dei file.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Restituisce il nome del Font.

**Returns:**
java.lang.String - Nome del font.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Ottiene i nomi del Font come un MultiLanguageString.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names as a  MultiLanguageString .
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Ottiene il tipo di Font.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getPostscriptName() {#getPostscriptName--}
```
public String getPostscriptName()
```


Ottiene il nome del Font postscript.

**Returns:**
java.lang.String - Nome del Font Postscript.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Ottiene i nomi del Font postscript come un MultiLanguageString.

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


Restituisce FontDefinition per la sorgente di stream del font e il tipo di font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| source | [StreamSource](../../com.aspose.font/streamsource) | Sorgente di stream del Font. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
### open(String fileName, FontType fontType) {#open-java.lang.String-com.aspose.font.FontType-}
```
public static FontDefinition open(String fileName, FontType fontType)
```


Restituisce FontDefinition per il file del font e il tipo di font.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fileName | java.lang.String | Nome file del font. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo di Font. |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


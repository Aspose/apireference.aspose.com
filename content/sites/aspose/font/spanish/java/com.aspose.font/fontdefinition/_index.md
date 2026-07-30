---
title: "FontDefinition"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la definición del conjunto de archivos de Font."
type: docs
weight: 38
url: /es/java/com.aspose.font/fontdefinition/
---
**Inheritance:**
java.lang.Object
```
public class FontDefinition
```

Representa la definición del conjunto de archivos de fuente. Esta clase contiene campos que no están relacionados con los datos internos de la fuente. Estos campos describen la ubicación de la fuente y otros datos necesarios para cargar la fuente desde alguna fuente de fuente (archivo, memoria, etc.).
## Constructores

| Constructor | Descripción |
| --- | --- |
| [FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Crea una definición de fuente de un solo archivo. |
| [FontDefinition(FontType fontType, StreamSource streamSource)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-) | Crea una definición de fuente de un solo archivo. |
| [FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)](#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-) | Crea una definición de fuente de un solo archivo. |
| [FontDefinition(FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Crea una definición de fuente de un solo archivo. |
| [FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Crea una definición de fuente de un solo archivo. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Crea una definición de fuente de un solo archivo. |
| [FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Crea una definición de fuente de varios archivos. |
| [FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Crea una definición de fuente de varios archivos. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-) | Crea una definición de fuente de varios archivos. |
| [FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)](#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---) | Crea una definición de fuente de varios archivos. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getFileDefinitions()](#getFileDefinitions--) | Obtiene la colección de definiciones de archivos. |
| [getFontName()](#getFontName--) | Devuelve el nombre de la fuente. |
| [getFontNames()](#getFontNames--) | Obtiene los nombres de la fuente como un MultiLanguageString. |
| [getFontType()](#getFontType--) | Obtiene el tipo de la fuente. |
| [getPostscriptName()](#getPostscriptName--) | Obtiene el nombre de la fuente Postscript. |
| [getPostscriptNames()](#getPostscriptNames--) | Obtiene los nombres de la fuente Postscript como un MultiLanguageString. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [open(StreamSource source, FontType fontType)](#open-com.aspose.font.StreamSource-com.aspose.font.FontType-) | Devuelve FontDefinition para la fuente de flujo de fuente y el tipo de fuente. |
| [open(String fileName, FontType fontType)](#open-java.lang.String-com.aspose.font.FontType-) | Devuelve FontDefinition para el archivo de fuente y el tipo de fuente. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, String fileExtension, StreamSource streamSource)
```


Crea una definición de fuente de un solo archivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileExtension | java.lang.String | Extensión del archivo de fuente. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Fuente de flujo de fuente. |

### FontDefinition(FontType fontType, StreamSource streamSource) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.StreamSource-}
```
public FontDefinition(FontType fontType, StreamSource streamSource)
```


Crea una definición de fuente de un solo archivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Fuente de flujo de fuente. |

### FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource) {#FontDefinition-java.lang.String-com.aspose.font.FontType-java.lang.String-com.aspose.font.StreamSource-}
```
public FontDefinition(String fontName, FontType fontType, String fileExtension, StreamSource streamSource)
```


Crea una definición de fuente de un solo archivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontName | java.lang.String | Nombre de fuente. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileExtension | java.lang.String | Extensión del archivo de fuente. |
| streamSource | [StreamSource](../../com.aspose.font/streamsource) | Fuente de flujo de fuente. |

### FontDefinition(FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(FontType fontType, FontFileDefinition fileDefinition)
```


Crea una definición de fuente de un solo archivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, FontType fontType, FontFileDefinition fileDefinition)
```


Crea una definición de fuente de un solo archivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontName | java.lang.String | Nombre de fuente. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition fileDefinition)
```


Crea una definición de fuente de un solo archivo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontName | java.lang.String | Nombre de fuente. |
| postscriptName | java.lang.String | Nombre de la fuente Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(FontType fontType, FontFileDefinition[] fileDefinitions)
```


Crea una definición de fuente de varios archivos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Matriz de objetos FontFileDefinition. |

### FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-java.lang.String-java.lang.String-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(String fontName, String postscriptName, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Crea una definición de fuente de varios archivos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontName | java.lang.String | Nombre de fuente. |
| postscriptName | java.lang.String | Nombre de la fuente Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Matriz de objetos FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition-}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition fileDefinition)
```


Crea una definición de fuente de varios archivos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Nombres de fuentes. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Nombres de fuentes Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileDefinition | [FontFileDefinition](../../com.aspose.font/fontfiledefinition) | FontFileDefinition. |

### FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions) {#FontDefinition-com.aspose.font.MultiLanguageString-com.aspose.font.MultiLanguageString-com.aspose.font.FontType-com.aspose.font.FontFileDefinition---}
```
public FontDefinition(MultiLanguageString fontNames, MultiLanguageString postscriptNames, FontType fontType, FontFileDefinition[] fileDefinitions)
```


Crea una definición de fuente de varios archivos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Nombres de fuentes. |
| postscriptNames | [MultiLanguageString](../../com.aspose.font/multilanguagestring) | Nombres de fuentes Postscript. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |
| fileDefinitions | [FontFileDefinition\[\]](../../com.aspose.font/fontfiledefinition) | Matriz de objetos FontFileDefinition. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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


Obtiene la colección de definiciones de archivos.

**Returns:**
com.aspose.font.FontFileDefinition[] - Colección de definiciones de archivos.
### getFontName() {#getFontName--}
```
public String getFontName()
```


Devuelve el nombre de la fuente.

**Returns:**
java.lang.String - Nombre de fuente.
### getFontNames() {#getFontNames--}
```
public MultiLanguageString getFontNames()
```


Obtiene los nombres de la fuente como un MultiLanguageString.

**Returns:**
[MultiLanguageString](../../com.aspose.font/multilanguagestring) - Font names as a  MultiLanguageString .
### getFontType() {#getFontType--}
```
public FontType getFontType()
```


Obtiene el tipo de la fuente.

**Returns:**
[FontType](../../com.aspose.font/fonttype) - Font type.
### getPostscriptName() {#getPostscriptName--}
```
public String getPostscriptName()
```


Obtiene el nombre de la fuente Postscript.

**Returns:**
java.lang.String - Nombre de fuente Postscript.
### getPostscriptNames() {#getPostscriptNames--}
```
public MultiLanguageString getPostscriptNames()
```


Obtiene los nombres de la fuente Postscript como un MultiLanguageString.

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


Devuelve FontDefinition para la fuente de flujo de fuente y el tipo de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| source | [StreamSource](../../com.aspose.font/streamsource) | Fuente de flujo de fuente. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |

**Returns:**
[FontDefinition](../../com.aspose.font/fontdefinition) - FontDefinition.
### open(String fileName, FontType fontType) {#open-java.lang.String-com.aspose.font.FontType-}
```
public static FontDefinition open(String fileName, FontType fontType)
```


Devuelve FontDefinition para el archivo de fuente y el tipo de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fileName | java.lang.String | Nombre del archivo de fuente. |
| fontType | [FontType](../../com.aspose.font/fonttype) | Tipo de fuente. |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


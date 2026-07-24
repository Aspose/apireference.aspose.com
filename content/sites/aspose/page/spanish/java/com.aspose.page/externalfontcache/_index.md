---
title: "ExternalFontCache"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Utilice esta clase para obtener la encapsulación de fuentes en un formato que sea aceptado por Device."
type: docs
weight: 13
url: /es/java/com.aspose.page/externalfontcache/
---
**Inheritance:**
java.lang.Object
```
public class ExternalFontCache
```

Utilice esta clase para obtener la encapsulación de fuentes en un formato que sea aceptado por Device.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [ExternalFontCache()](#ExternalFontCache--) |  |
## Campos

| Campo | Descripción |
| --- | --- |
| [DEFAULT_SIZE](#DEFAULT-SIZE) | Tamaño de fuente predeterminado. |
| [DEFAULT_STYLE](#DEFAULT-STYLE) | Estilo de fuente predeterminado. |
## Métodos

| Método | Descripción |
| --- | --- |
| [FetchTrFont(String familyName)](#FetchTrFont-java.lang.String-) | Obtiene DrFont por nombre de familia de fuente, tamaño predeterminado (1) y estilo predeterminado (PLAIN). |
| [FetchTrFont(String familyName, int style)](#FetchTrFont-java.lang.String-int-) | Obtiene DrFont por nombre de familia de fuente, tamaño predeterminado (1) y estilo. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [fetchDrFont(String familyName, float sizePoints, int style)](#fetchDrFont-java.lang.String-float-int-) | Obtiene DrFont por nombre de familia de fuente, tamaño y estilo. |
| [fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-int-) | Obtiene DrFont por nombre de familia de fuente, tamaño, estilo y mayúsculas de fuente. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)](#fetchDrFont-java.lang.String-float-int-java.lang.String-) | Obtiene DrFont por nombre de familia de fuente, tamaño, estilo y nombre alternativo de familia de fuente. |
| [fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)](#fetchDrFont-java.lang.String-float-int-java.lang.String-int-) | Obtiene DrFont por nombre de familia de fuente, tamaño, estilo, mayúsculas de fuente y nombre alternativo de familia de fuente. |
| [fetchTTFont(String familyName, int style, String altFamilyName)](#fetchTTFont-java.lang.String-int-java.lang.String-) | Obtiene TTFont por nombre de familia de fuente, estilo y nombre alternativo de familia de fuente. |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] additionalFontFolders)](#setAdditionalFontsFolders-java.lang.String---) | Especifica carpetas de fuentes adicionales. |
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


Tamaño de fuente predeterminado.

### DEFAULT_STYLE {#DEFAULT-STYLE}
```
public static final int DEFAULT_STYLE
```


Estilo de fuente predeterminado.

### FetchTrFont(String familyName) {#FetchTrFont-java.lang.String-}
```
public DrFont FetchTrFont(String familyName)
```


Obtiene DrFont por nombre de familia de fuente, tamaño predeterminado (1) y estilo predeterminado (PLAIN).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| familyName | java.lang.String | Nombre de familia de fuente. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### FetchTrFont(String familyName, int style) {#FetchTrFont-java.lang.String-int-}
```
public DrFont FetchTrFont(String familyName, int style)
```


Obtiene DrFont por nombre de familia de fuente, tamaño predeterminado (1) y estilo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| familyName | java.lang.String | Nombre de familia de fuente. |
| estilo | int | Estilo de fuente. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
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
### fetchDrFont(String familyName, float sizePoints, int style) {#fetchDrFont-java.lang.String-float-int-}
```
public static DrFont fetchDrFont(String familyName, float sizePoints, int style)
```


Obtiene DrFont por nombre de familia de fuente, tamaño y estilo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| familyName | java.lang.String | Nombre de familia de fuente. |
| sizePoints | float | Tamaño de fuente en puntos (un punto es 1/72 de pulgada). |
| estilo | int | Estilo de fuente. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, int fontCapitals)
```


Obtiene DrFont por nombre de familia de fuente, tamaño, estilo y mayúsculas de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| familyName | java.lang.String | Nombre de familia de fuente. |
| sizePoints | float | Tamaño de fuente en puntos (un punto es 1/72 de pulgada). |
| estilo | int | Estilo de fuente. |
| fontCapitals | int | Mayúsculas de fuente. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName) {#fetchDrFont-java.lang.String-float-int-java.lang.String-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName)
```


Obtiene DrFont por nombre de familia de fuente, tamaño, estilo y nombre alternativo de familia de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| familyName | java.lang.String | Nombre de familia de fuente. |
| sizePoints | float | Tamaño de fuente en puntos (un punto es 1/72 de pulgada). |
| estilo | int | Estilo de fuente. |
| altFamilyName | java.lang.String | Nombre alternativo de la familia de fuentes. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals) {#fetchDrFont-java.lang.String-float-int-java.lang.String-int-}
```
public DrFont fetchDrFont(String familyName, float sizePoints, int style, String altFamilyName, int fontCapitals)
```


Obtiene DrFont por nombre de familia de fuente, tamaño, estilo, mayúsculas de fuente y nombre alternativo de familia de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| familyName | java.lang.String | Nombre de familia de fuente. |
| sizePoints | float | Tamaño de fuente en puntos (un punto es 1/72 de pulgada). |
| estilo | int | Estilo de fuente. |
| altFamilyName | java.lang.String | Nombre alternativo de la familia de fuentes. |
| fontCapitals | int | Mayúsculas de fuente. |

**Returns:**
com.aspose.foundation.drawing.DrFont - DrFont.
### fetchTTFont(String familyName, int style, String altFamilyName) {#fetchTTFont-java.lang.String-int-java.lang.String-}
```
public TTFont fetchTTFont(String familyName, int style, String altFamilyName)
```


Obtiene TTFont por nombre de familia de fuente, estilo y nombre alternativo de familia de fuente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| familyName | java.lang.String | Nombre de familia de fuente. |
| estilo | int | Estilo de fuente. |
| altFamilyName | java.lang.String | Nombre alternativo de la familia de fuentes. |

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


Especifica carpetas de fuentes adicionales. Las carpetas de fuentes que son usadas por el SO se utilizan en la caché ExternalFont por defecto. No es necesario definirlas,

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| additionalFontFolders | java.lang.String[] | Una matriz de carpetas de fuentes adicionales. |

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


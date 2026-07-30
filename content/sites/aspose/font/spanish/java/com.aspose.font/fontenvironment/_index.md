---
title: "FontEnvironment"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Proporciona información sobre el entorno y la plataforma actuales."
type: docs
weight: 39
url: /es/java/com.aspose.font/fontenvironment/
---
**Inheritance:**
java.lang.Object
```
public class FontEnvironment
```

Proporciona información sobre el entorno y la plataforma actuales.
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCffCommonFontsSettings()](#getCffCommonFontsSettings--) | Configuraciones comunes a fuentes CFF. |
| [getClass()](#getClass--) |  |
| [getCurrent()](#getCurrent--) | Obtiene el entorno actual. |
| [getCurrentPlatformId()](#getCurrentPlatformId--) | Obtiene el id de plataforma actual. |
| [getFontSpecificEncodings()](#getFontSpecificEncodings--) | Almacena codificaciones específicas para fuentes conscientes del consumidor. |
| [getStrictness()](#getStrictness--) | Algunas fuentes pueden contener datos inesperados, características no especificadas o pueden estar recortadas de forma aproximada. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setStrictness(FontEnvironment.ParsingStrictness value)](#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-) | Algunas fuentes pueden contener datos inesperados, características no especificadas o pueden estar recortadas de forma aproximada. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getCffCommonFontsSettings() {#getCffCommonFontsSettings--}
```
public static CffFontsSettings getCffCommonFontsSettings()
```


Configuraciones comunes a fuentes CFF.

**Returns:**
[CffFontsSettings](../../com.aspose.font/cfffontssettings)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getCurrent() {#getCurrent--}
```
public static FontEnvironment getCurrent()
```


Obtiene el entorno actual.

**Returns:**
[FontEnvironment](../../com.aspose.font/fontenvironment) - Current environment.
### getCurrentPlatformId() {#getCurrentPlatformId--}
```
public int getCurrentPlatformId()
```


Obtiene el id de plataforma actual.

**Returns:**
int - Id de plataforma actual.
### getFontSpecificEncodings() {#getFontSpecificEncodings--}
```
public FontSpecificEncodings getFontSpecificEncodings()
```


Almacena codificaciones específicas para fuentes conscientes del consumidor. Por ejemplo, PDF usa codificaciones específicas de Adobe Symbol y ZapfDingbats.

**Returns:**
[FontSpecificEncodings](../../com.aspose.font/fontspecificencodings) - Specific encodings for consumer-aware Fonts.
### getStrictness() {#getStrictness--}
```
public FontEnvironment.ParsingStrictness getStrictness()
```


Algunas fuentes pueden contener datos inesperados, características no especificadas o pueden estar recortadas de forma aproximada. Se recomienda una configuración tolerante para los usuarios que desean abrir cualquier fuente sin importar la posible insuficiencia de la fuente. No se garantiza que las estructuras internas de la fuente sean consistentes. Se recomienda una configuración estricta para los usuarios que desean abrir fuentes mayormente válidas y sólidas.

**Returns:**
[ParsingStrictness](../../com.aspose.font/parsingstrictness) - Strictness.
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




### setStrictness(FontEnvironment.ParsingStrictness value) {#setStrictness-com.aspose.font.FontEnvironment.ParsingStrictness-}
```
public void setStrictness(FontEnvironment.ParsingStrictness value)
```


Algunas fuentes pueden contener datos inesperados, características no especificadas o pueden estar recortadas de forma aproximada. Se recomienda una configuración tolerante para los usuarios que desean abrir cualquier fuente sin importar la posible insuficiencia de la fuente. No se garantiza que las estructuras internas de la fuente sean consistentes. Se recomienda una configuración estricta para los usuarios que desean abrir fuentes mayormente válidas y sólidas.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [ParsingStrictness](../../com.aspose.font/parsingstrictness) | Rigor. |

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


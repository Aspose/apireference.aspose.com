---
title: "TtfEncodingParameters"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa los parámetros de codificación TTF."
type: docs
weight: 93
url: /es/java/com.aspose.font/ttfencodingparameters/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.font.IEncodingParameters](../../com.aspose.font/iencodingparameters)
```
public class TtfEncodingParameters implements IEncodingParameters
```

Representa los parámetros de codificación TTF. Debe usarse para solicitar una codificación específica del tipo de letra TTF.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [TtfEncodingParameters(int platformId, int platformSpecificId)](#TtfEncodingParameters-int-int-) | Inicializa una nueva instancia de la clase TtfEncodingParameters. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getPlatformId()](#getPlatformId--) | Obtiene el valor de PlatformId. |
| [getPlatformSpecificId()](#getPlatformSpecificId--) | Obtiene el valor de PlatformSpecificId. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setPlatformId(int value)](#setPlatformId-int-) | Establece el valor de PlatformId. |
| [setPlatformSpecificId(int value)](#setPlatformSpecificId-int-) | Establece el valor de PlatformSpecificId. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### TtfEncodingParameters(int platformId, int platformSpecificId) {#TtfEncodingParameters-int-int-}
```
public TtfEncodingParameters(int platformId, int platformSpecificId)
```


Inicializa una nueva instancia de la clase TtfEncodingParameters. Toma Platform Id y Platform-specific encoding id como parámetros. Estos parámetros se utilizan para solicitar una subtabla CMap especial de la tabla CMap principal de la fuente, ver la tabla 'CMap', 'name' en la especificación del archivo de fuente OpenType.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| platformId | int | Identificador de plataforma. |
| platformSpecificId | int | Identificador de codificación específico de la plataforma. |

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
### getPlatformId() {#getPlatformId--}
```
public int getPlatformId()
```


Obtiene el valor de PlatformId.

**Returns:**
int - valor de PlatformId.
### getPlatformSpecificId() {#getPlatformSpecificId--}
```
public int getPlatformSpecificId()
```


Obtiene el valor de PlatformSpecificId.

**Returns:**
int - valor de PlatformSpecificId.
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




### setPlatformId(int value) {#setPlatformId-int-}
```
public void setPlatformId(int value)
```


Establece el valor de PlatformId.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | int | Valor de PlatformId. |

### setPlatformSpecificId(int value) {#setPlatformSpecificId-int-}
```
public void setPlatformSpecificId(int value)
```


Establece el valor de PlatformSpecificId.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| valor | int | Valor de PlatformSpecificId. |

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


---
title: "AxisRecord"
second_title: "Referencia de API de Aspose.Font para Java"
description: "Representa la estructura de registro de eje."
type: docs
weight: 10
url: /es/java/com.aspose.font/axisrecord/
---
**Inheritance:**
java.lang.Object
```
public class AxisRecord
```

Representa la estructura Axis Record. Spec: el registro de eje proporciona información sobre un solo eje de diseño.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [AxisRecord(String tag, int axisNameId, int axisOrdering)](#AxisRecord-java.lang.String-int-int-) | Constructor |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAxisNameId()](#getAxisNameId--) | Devuelve el campo axisNameID. |
| [getAxisOrdering()](#getAxisOrdering--) | Devuelve el campo axisOrdering. |
| [getClass()](#getClass--) |  |
| [getTag()](#getTag--) | Devuelve una etiqueta que identifica el eje de variación de diseño. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### AxisRecord(String tag, int axisNameId, int axisOrdering) {#AxisRecord-java.lang.String-int-int-}
```
public AxisRecord(String tag, int axisNameId, int axisOrdering)
```


Constructor

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| tag | java.lang.String | Etiqueta, spec: una etiqueta que identifica el eje de variación de diseño |
| axisNameId | int | El ID de nombre para las entradas en la tabla 'name' que proporcionan una cadena de visualización para este eje |
| axisOrdering | int | El valor que las aplicaciones pueden usar para determinar la ordenación primaria de los nombres de fuentes, o para ordenar etiquetas al componer nombres de familia o de fuente. |

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
### getAxisNameId() {#getAxisNameId--}
```
public int getAxisNameId()
```


Devuelve el campo axisNameID. Spec: el campo axisNameID proporciona un ID de nombre que puede usarse para obtener cadenas de la tabla 'name' que pueden usarse para referirse al eje en las interfaces de usuario de la aplicación.

**Returns:**
int - El campo axisNameID.
### getAxisOrdering() {#getAxisOrdering--}
```
public int getAxisOrdering()
```


Devuelve el campo axisOrdering. Spec: un valor que las aplicaciones pueden usar para determinar la ordenación primaria de los nombres de fuentes, o para ordenar etiquetas al componer nombres de familia o de fuente.

**Returns:**
int - El campo axisOrdering.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getTag() {#getTag--}
```
public String getTag()
```


Devuelve una etiqueta que identifica el eje de variación de diseño. Spec: cada registro de eje tiene una etiqueta que designa el eje. Los valores de etiqueta deben seguir las reglas para etiquetas de eje descritas en el Registro de Etiquetas de Eje de Variación de Diseño OpenType.

**Returns:**
java.lang.String - Una etiqueta que identifica el eje de variación de diseño.
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


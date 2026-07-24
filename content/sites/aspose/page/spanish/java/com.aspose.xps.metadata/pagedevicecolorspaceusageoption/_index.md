---
title: "PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Describe las opciones de la característica PageDeviceColorSpaceUsage."
type: docs
weight: 10
url: /es/java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

Describe las opciones de la característica  PageDeviceColorSpaceUsage  .
## Campos

| Campo | Descripción |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | Si el dispositivo determina que el perfil especificado por el  PageDeviceColorSpaceProfileURI  parámetro puede usarse como un perfil de espacio de color del dispositivo, todos los elementos que usan el mismo perfil se tratan como si ya estuvieran especificados en el espacio de color del dispositivo. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | Si el perfil especificado por el parámetro PageDeviceColorSpaceProfileURI tiene un número de canales que coincide con el número de primarios del dispositivo, DEBERÍA usarse en lugar de la gestión interna de color del dispositivo para todos los elementos. |
## Métodos

| Método | Descripción |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Agrega una lista de elementos al final de la lista de ítems de esta opción. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Obtiene el nombre del elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


Si el dispositivo determina que el perfil especificado por el  PageDeviceColorSpaceProfileURI  parámetro puede usarse como un perfil de espacio de color del dispositivo, todos los elementos que usan el mismo perfil se tratan como si ya estuvieran especificados en el espacio de color del dispositivo. Todos los demás elementos DEBEN usar el perfil especificado para ese elemento. Si el perfil no puede usarse como un perfil de espacio de color del dispositivo, los elementos que usan el perfil DEBEN gestionarse en color como cualquier otro elemento que utilice el perfil de color.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


Si el perfil especificado por el parámetro PageDeviceColorSpaceProfileURI tiene un número de canales que coincide con el número de primarios del dispositivo, DEBERÍA usarse en lugar de la gestión interna de color del dispositivo para todos los elementos. Se asume que los elementos que usan este perfil están en el espacio de color del dispositivo y no se gestionarán más en color.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Agrega una lista de elementos al final de la lista de ítems de esta opción. Cada uno debe ser una instancia de  ScoredProperty  o de  Property .

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista de elementos a agregar. |

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
### getName() {#getName--}
```
public String getName()
```


Obtiene el nombre del elemento.

**Returns:**
java.lang.String
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


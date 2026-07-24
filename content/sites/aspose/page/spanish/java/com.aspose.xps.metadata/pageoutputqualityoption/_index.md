---
title: "PageOutputQuality.PageOutputQualityOption"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Define las opciones de la característica PageOutputQuality."
type: docs
weight: 10
url: /es/java/com.aspose.xps.metadata/pageoutputquality.pageoutputqualityoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageOutputQuality.PageOutputQualityOption extends Option
```

Define opciones de la característica PageOutputQuality.
## Campos

| Campo | Descripción |
| --- | --- |
| [Automatic](#Automatic) | Especifica la intención para la salida automática (permite que el cliente elija automáticamente la mejor configuración). |
| [Draft](#Draft) | Especifica la intención para la salida de borrador (equilibrada para texto y gráficos de calidad de borrador). |
| [Fax](#Fax) | Especifica la intención para la salida de fax (equilibrada para la calidad estándar de fax). |
| [High](#High) | Especifica la intención para la salida de alta calidad (equilibrada para texto y gráficos de alta calidad). |
| [Normal](#Normal) | Especifica la intención para la salida normal (equilibrada para texto y gráficos de buena calidad). |
| [Photographic](#Photographic) | Especifica la intención para la salida fotográfica (las imágenes deben tener la máxima calidad). |
| [Text](#Text) | Especifica la intención para la salida solo de texto (los gráficos pueden producirse pobremente o no producirse en absoluto). |
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
### Automatic {#Automatic}
```
public static PageOutputQuality.PageOutputQualityOption Automatic
```


Especifica la intención para la salida automática (permite que el cliente elija automáticamente la mejor configuración).

### Draft {#Draft}
```
public static PageOutputQuality.PageOutputQualityOption Draft
```


Especifica la intención para la salida de borrador (equilibrada para texto y gráficos de calidad de borrador).

### Fax {#Fax}
```
public static PageOutputQuality.PageOutputQualityOption Fax
```


Especifica la intención para la salida de fax (equilibrada para la calidad estándar de fax).

### High {#High}
```
public static PageOutputQuality.PageOutputQualityOption High
```


Especifica la intención para la salida de alta calidad (equilibrada para texto y gráficos de alta calidad).

### Normal {#Normal}
```
public static PageOutputQuality.PageOutputQualityOption Normal
```


Especifica la intención para la salida normal (equilibrada para texto y gráficos de buena calidad).

### Photographic {#Photographic}
```
public static PageOutputQuality.PageOutputQualityOption Photographic
```


Especifica la intención para la salida fotográfica (las imágenes deben tener la máxima calidad).

### Text {#Text}
```
public static PageOutputQuality.PageOutputQualityOption Text
```


Especifica la intención para la salida solo de texto (los gráficos pueden producirse pobremente o no producirse en absoluto).

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


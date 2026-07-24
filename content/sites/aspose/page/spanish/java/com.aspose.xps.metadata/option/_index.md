---
title: "Option"
second_title: "Referencia de API de Aspose.Page para Java"
description: "La clase que implementa una opción PrintTicket Option."
type: docs
weight: 76
url: /es/java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

La clase que implementa una opción PrintTicket común. La clase base para todas las opciones definidas por el esquema. Un elemento Option contiene todos los elementos  Property  y  ScoredProperty  asociados a esta opción. https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## Constructores

| Constructor | Descripción |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | Crea una nueva instancia de opción PrintTicket. |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | Crea una nueva instancia de opción PrintTicket. |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | Crea una instancia de opción clonada. |
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
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


Crea una nueva instancia de opción PrintTicket.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String | Un nombre de opción arbitrario. |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Una matriz arbitraria de instancias de  IOptionItem . Cada una debe ser una instancia de  ScoredProperty  o de  Property . |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


Crea una nueva instancia de opción PrintTicket.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Una matriz arbitraria de instancias de  IOptionItem . Cada una debe ser una instancia de  ScoredProperty  o de  Property . |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


Crea una instancia de opción clonada.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | Una instancia de opción para clonar. |

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


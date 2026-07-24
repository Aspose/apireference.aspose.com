---
title: "ScoredProperty"
second_title: "Referencia de API de Aspose.Page para Java"
description: "La clase que implementa una ScoredProperty de PrintTicket común."
type: docs
weight: 146
url: /es/java/com.aspose.xps.metadata/scoredproperty/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem)
```
public class ScoredProperty extends CompositePrintTicketElement implements IOptionItem, IScoredPropertyItem
```

La clase que implementa una ScoredProperty de PrintTicket común. La clase base para todas las propiedades puntuadas definidas por el esquema. Un elemento ScoredProperty declara una propiedad que es intrínseca a una definición de Option. Tales propiedades deben compararse al evaluar qué tan de cerca una Option solicitada coincide con una Option compatible con el dispositivo. https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty
## Constructores

| Constructor | Descripción |
| --- | --- |
| [ScoredProperty(String name, ParameterRef parameterRef)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-) | Crea una nueva instancia. |
| [ScoredProperty(String name, Value value, IScoredPropertyItem[] items)](#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-) | Crea una nueva instancia. |
## Métodos

| Método | Descripción |
| --- | --- |
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
### ScoredProperty(String name, ParameterRef parameterRef) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.ParameterRef-}
```
public ScoredProperty(String name, ParameterRef parameterRef)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String | Un nombre de propiedad. |
| parameterRef | [ParameterRef](../../com.aspose.xps.metadata/parameterref) | Una instancia de ParameterRef. |

### ScoredProperty(String name, Value value, IScoredPropertyItem[] items) {#ScoredProperty-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IScoredPropertyItem...-}
```
public ScoredProperty(String name, Value value, IScoredPropertyItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String | Un nombre de propiedad. |
| value | [Value](../../com.aspose.xps.metadata/value) | Un valor de propiedad. |
| items | [IScoredPropertyItem\[\]](../../com.aspose.xps.metadata/iscoredpropertyitem) | Una matriz arbitraria de instancias de IScoredPropertyItem. Cada una debe ser una instancia de ScoredProperty, Property o Value. |

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


---
title: "Property"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase que implementa la propiedad del ticket de impresión."
type: docs
weight: 143
url: /es/java/com.aspose.xps.metadata/property/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem), [com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem), [com.aspose.xps.metadata.IPropertyItem](../../com.aspose.xps.metadata/ipropertyitem)
```
public class Property extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem, IOptionItem, IScoredPropertyItem, IPropertyItem
```

Clase que implementa la propiedad de ticket de impresión. La clase que implementa una Property común de PrintTicket. La clase base para todas las propiedades definidas por el esquema. Un elemento Property declara un dispositivo, formato de trabajo u otra propiedad relevante cuyo nombre se indica en su atributo name. Un elemento Value se usa para asignar un valor a la Property. Una Property puede ser compleja, posiblemente conteniendo múltiples subpropiedades. Las subpropiedades también se representan mediante elementos Property. https://docs.microsoft.com/en-us/windows/win32/printdocs/property
## Constructores

| Constructor | Descripción |
| --- | --- |
| [Property(String name, Property property, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-) | Crea una nueva instancia. |
| [Property(String name, Value value, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-) | Crea una nueva instancia. |
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
### Property(String name, Property property, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Property property, IPropertyItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String | Un nombre de propiedad. |
| property | [Property](../../com.aspose.xps.metadata/property) | Una instancia obligatoria de Property. |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | Una matriz arbitraria de instancias de IPropertyItem. Cada una debe ser una instancia de Property o de Value. |

### Property(String name, Value value, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Value value, IPropertyItem[] items)
```


Crea una nueva instancia.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| name | java.lang.String | Un nombre de propiedad. |
| value | [Value](../../com.aspose.xps.metadata/value) | Una instancia obligatoria de Value. |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | Una matriz arbitraria de instancias de IPropertyItem. Cada una debe ser una instancia de Property o de Value. |

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


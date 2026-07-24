---
title: "Property"
second_title: "Aspose.Page for Java API-Referenz"
description: "Klasse, die die Druckticket‑Eigenschaft implementiert."
type: docs
weight: 143
url: /de/java/com.aspose.xps.metadata/property/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem), [com.aspose.xps.metadata.IOptionItem](../../com.aspose.xps.metadata/ioptionitem), [com.aspose.xps.metadata.IScoredPropertyItem](../../com.aspose.xps.metadata/iscoredpropertyitem), [com.aspose.xps.metadata.IPropertyItem](../../com.aspose.xps.metadata/ipropertyitem)
```
public class Property extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem, IOptionItem, IScoredPropertyItem, IPropertyItem
```

Klasse, die eine Print‑Ticket‑Eigenschaft implementiert. Die Klasse, die eine gemeinsame PrintTicket Property implementiert. Die Basisklasse für alle schema‑definierten Eigenschaften. Ein Property-Element deklariert ein Gerät, Job‑Formatierung oder eine andere relevante Eigenschaft, deren Name durch das Attribut name angegeben wird. Ein Value-Element wird verwendet, um einen Wert dem Property zuzuweisen. Ein Property kann komplex sein und mehrere Untereigenschaften enthalten. Untereigenschaften werden ebenfalls durch Property-Elemente dargestellt. https://docs.microsoft.com/en-us/windows/win32/printdocs/property
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Property(String name, Property property, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Property-com.aspose.xps.metadata.IPropertyItem...-) | Erstellt eine neue Instanz. |
| [Property(String name, Value value, IPropertyItem[] items)](#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-) | Erstellt eine neue Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ermittelt den Elementnamen. |
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


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Ein Eigenschaftsname. |
| property | [Property](../../com.aspose.xps.metadata/property) | Eine obligatorische Property-Instanz. |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | Ein beliebiges Array von IPropertyItem-Instanzen. Jede muss eine Property- oder eine Value-Instanz sein. |

### Property(String name, Value value, IPropertyItem[] items) {#Property-java.lang.String-com.aspose.xps.metadata.Value-com.aspose.xps.metadata.IPropertyItem...-}
```
public Property(String name, Value value, IPropertyItem[] items)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Ein Eigenschaftsname. |
| value | [Value](../../com.aspose.xps.metadata/value) | Eine obligatorische  Value  Instanz. |
| items | [IPropertyItem\[\]](../../com.aspose.xps.metadata/ipropertyitem) | Ein beliebiges Array von IPropertyItem-Instanzen. Jede muss eine Property- oder eine Value-Instanz sein. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
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


Ermittelt den Elementnamen.

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
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


---
title: "Option"
second_title: "Aspose.Page for Java API-Referenz"
description: "Die Klasse, die eine allgemeine PrintTicket-Option implementiert."
type: docs
weight: 76
url: /de/java/com.aspose.xps.metadata/option/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Option extends CompositePrintTicketElement implements IFeatureItem
```

Die Klasse, die eine allgemeine PrintTicket-Option implementiert. Die Basisklasse für alle schema-definierten Optionen. Ein Option-Element enthält alle Property- und ScoredProperty-Elemente, die mit dieser Option verknüpft sind. https://docs.microsoft.com/en-us/windows/win32/printdocs/option
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Option(String name, IOptionItem[] items)](#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-) | Erstellt eine neue PrintTicket-Option-Instanz. |
| [Option(IOptionItem[] items)](#Option-com.aspose.xps.metadata.IOptionItem...-) | Erstellt eine neue PrintTicket-Option-Instanz. |
| [Option(Option option)](#Option-com.aspose.xps.metadata.Option-) | Erstellt eine geklonte Optionsinstanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. |
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
### Option(String name, IOptionItem[] items) {#Option-java.lang.String-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(String name, IOptionItem[] items)
```


Erstellt eine neue PrintTicket-Option-Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Ein beliebiger Optionsname. |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Ein beliebiges Array von IOptionItem-Instanzen. Jede muss eine ScoredProperty- oder eine Property-Instanz sein. |

### Option(IOptionItem[] items) {#Option-com.aspose.xps.metadata.IOptionItem...-}
```
public Option(IOptionItem[] items)
```


Erstellt eine neue PrintTicket-Option-Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Ein beliebiges Array von IOptionItem-Instanzen. Jede muss eine ScoredProperty- oder eine Property-Instanz sein. |

### Option(Option option) {#Option-com.aspose.xps.metadata.Option-}
```
public Option(Option option)
```


Erstellt eine geklonte Optionsinstanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| option | [Option](../../com.aspose.xps.metadata/option) | Eine Optionsinstanz zum Klonen. |

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. Jedes muss eine Instanz von  ScoredProperty  oder  Property  sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste der hinzuzufügenden Elemente. |

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


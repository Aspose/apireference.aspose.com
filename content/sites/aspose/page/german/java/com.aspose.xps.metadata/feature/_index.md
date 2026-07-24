---
title: "Feature"
second_title: "Aspose.Page for Java API-Referenz"
description: "Die Klasse, die ein gemeinsames Print Schema-Feature kapselt."
type: docs
weight: 38
url: /de/java/com.aspose.xps.metadata/feature/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Feature extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem
```

Die Klasse, die ein gemeinsames Print‑Schema‑Feature kapselt. Die Basisklasse für alle schema‑definierten Features. Ein  Feature  Element enthält eine vollständige Liste der  Option  und  Property  Elemente, die ein Geräteattribut, eine Job‑Formatierungseinstellung oder ein anderes relevantes Merkmal vollständig beschreiben. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [Feature(String name, Option option, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Option-com.aspose.xps.metadata.IFeatureItem...-) | Erstellt eine neue PrintTicket‑Feature‑Instanz. |
| [Feature(String name, Feature feature, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-) | Erstellt eine neue PrintTicket‑Feature‑Instanz. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieses Features hinzu. |
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
### Feature(String name, Option option, IFeatureItem[] items) {#Feature-java.lang.String-com.aspose.xps.metadata.Option-com.aspose.xps.metadata.IFeatureItem...-}
```
public Feature(String name, Option option, IFeatureItem[] items)
```


Erstellt eine neue PrintTicket‑Feature‑Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Ein Feature‑Name. |
| option | [Option](../../com.aspose.xps.metadata/option) | Erforderliche  Option  Instanz. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Ein beliebiges Array von  IFeatureItem  Instanzen. Jede muss ein  Feature , ein  Option  oder ein  Property  Instanz sein. |

### Feature(String name, Feature feature, IFeatureItem[] items) {#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-}
```
public Feature(String name, Feature feature, IFeatureItem[] items)
```


Erstellt eine neue PrintTicket‑Feature‑Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | java.lang.String | Feature‑Name. |
| feature | [Feature](../../com.aspose.xps.metadata/feature) | Erforderliche Feature-Instanz. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Ein beliebiges Array von Property-Instanzen. Jede muss ein Feature, eine Option oder eine Property-Instanz sein. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieses Features hinzu. Jedes muss eine Feature-, eine Option- oder eine Property-Instanz sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Liste der hinzuzufügenden Elemente. |

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


---
title: "Funktion"
second_title: "Aspose.Page för Java API-referens"
description: "Klassen som kapslar in en gemensam Print Schema‑funktion."
type: docs
weight: 38
url: /sv/java/com.aspose.xps.metadata/feature/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IPrintTicketItem](../../com.aspose.xps.metadata/iprintticketitem), [com.aspose.xps.metadata.IFeatureItem](../../com.aspose.xps.metadata/ifeatureitem)
```
public class Feature extends CompositePrintTicketElement implements IPrintTicketItem, IFeatureItem
```

Klassen som kapslar in en gemensam Print Schema‑funktion. Bas‑klassen för alla schema‑definierade funktioner. Ett Feature‑element innehåller en komplett lista över Option‑ och Property‑element som fullt beskriver en enhetsegenskap, jobbformatinställning eller annan relevant egenskap. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [Feature(String name, Option option, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Option-com.aspose.xps.metadata.IFeatureItem...-) | Skapar en ny PrintTicket‑funktioninstans. |
| [Feature(String name, Feature feature, IFeatureItem[] items)](#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-) | Skapar en ny PrintTicket‑funktioninstans. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Lägger till en lista med objekt i slutet av den här funktionens objektlista. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Hämtar elementets namn. |
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


Skapar en ny PrintTicket‑funktioninstans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| name | java.lang.String | Ett funktionsnamn. |
| option | [Option](../../com.aspose.xps.metadata/option) | Krävd Option‑instans. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | En godtycklig matris av IFeatureItem‑instanser. Varje måste vara en Feature, ett Option eller en Property‑instans. |

### Feature(String name, Feature feature, IFeatureItem[] items) {#Feature-java.lang.String-com.aspose.xps.metadata.Feature-com.aspose.xps.metadata.IFeatureItem...-}
```
public Feature(String name, Feature feature, IFeatureItem[] items)
```


Skapar en ny PrintTicket‑funktioninstans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| name | java.lang.String | Funktionsnamn. |
| feature | [Feature](../../com.aspose.xps.metadata/feature) | Krävd Feature‑instans. |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | En godtycklig matris av Property‑instanser. Varje måste vara en Feature, ett Option eller en Property‑instans. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Lägger till en lista med objekt i slutet av den här funktionens objektlista. Var och en måste vara ett Feature, ett Option eller ett Property‑instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Lista med objekt att lägga till. |

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
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


Hämtar elementets namn.

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
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


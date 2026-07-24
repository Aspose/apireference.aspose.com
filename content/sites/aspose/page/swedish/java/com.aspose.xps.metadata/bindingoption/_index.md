---
title: "JobBindAllDocuments.BindingOption"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver alternativen för funktionen JobBindAllDocuments."
type: docs
weight: 11
url: /sv/java/com.aspose.xps.metadata/jobbindalldocuments.bindingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobBindAllDocuments.BindingOption extends Option
```

Beskriver  JobBindAllDocuments  funktionens alternativ.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)](#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-) | Skapar en ny instans. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| [Bale](#Bale) | Anger balbindning. |
| [BindBottom](#BindBottom) | Anger bindning längs den nedre kanten. |
| [BindLeft](#BindLeft) | Anger bindning längs den vänstra kanten. |
| [BindRight](#BindRight) | Anger bindning längs den högra kanten. |
| [BindTop](#BindTop) | Anger bindning längs den övre kanten. |
| [Booklet](#Booklet) | Anger bindning för häfte. |
| [EdgeStitchBottom](#EdgeStitchBottom) | Anger kantstygning längs den nedre kanten. |
| [EdgeStitchLeft](#EdgeStitchLeft) | Anger kantstygning längs den vänstra kanten. |
| [EdgeStitchRight](#EdgeStitchRight) | Anger kantstygning längs den högra kanten. |
| [EdgeStitchTop](#EdgeStitchTop) | Anger kantstygning längs den övre kanten. |
| [Fold](#Fold) | Anger en vikningsbindning. |
| [JogOffset](#JogOffset) | Anger förskjuten bindning. |
| [None](#None) | Anger ingen bindning. |
| [Trim](#Trim) | Anger trimningsbindning. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Lägger till en lista med objekt i slutet av detta alternativs objektlista. |
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
### BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items) {#BindingOption-java.lang.String-com.aspose.xps.metadata.JobBindAllDocuments.IBindingOptionItem...-}
```
public BindingOption(String name, JobBindAllDocuments.IBindingOptionItem[] items)
```


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| name | java.lang.String | Ett alternativnamn. |
| items | [IBindingOptionItem\[\]](../../com.aspose.xps.metadata/ibindingoptionitem) | En matris av giltiga underordnade objekt. |

### Bale {#Bale}
```
public static final JobBindAllDocuments.BindingOption Bale
```


Anger balbindning.

### BindBottom {#BindBottom}
```
public static final JobBindAllDocuments.BindingOption BindBottom
```


Anger bindning längs den nedre kanten.

### BindLeft {#BindLeft}
```
public static final JobBindAllDocuments.BindingOption BindLeft
```


Anger bindning längs den vänstra kanten.

### BindRight {#BindRight}
```
public static final JobBindAllDocuments.BindingOption BindRight
```


Anger bindning längs den högra kanten.

### BindTop {#BindTop}
```
public static final JobBindAllDocuments.BindingOption BindTop
```


Anger bindning längs den övre kanten.

### Booklet {#Booklet}
```
public static final JobBindAllDocuments.BindingOption Booklet
```


Anger bindning för häfte.

### EdgeStitchBottom {#EdgeStitchBottom}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchBottom
```


Anger kantstygning längs den nedre kanten.

### EdgeStitchLeft {#EdgeStitchLeft}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchLeft
```


Anger kantstygning längs den vänstra kanten.

### EdgeStitchRight {#EdgeStitchRight}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchRight
```


Anger kantstygning längs den högra kanten.

### EdgeStitchTop {#EdgeStitchTop}
```
public static final JobBindAllDocuments.BindingOption EdgeStitchTop
```


Anger kantstygning längs den övre kanten.

### Fold {#Fold}
```
public static final JobBindAllDocuments.BindingOption Fold
```


Anger en vikningsbindning.

### JogOffset {#JogOffset}
```
public static final JobBindAllDocuments.BindingOption JogOffset
```


Anger förskjuten bindning.

### None {#None}
```
public static final JobBindAllDocuments.BindingOption None
```


Anger ingen bindning.

### Trim {#Trim}
```
public static final JobBindAllDocuments.BindingOption Trim
```


Anger trimningsbindning.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Lägger till en lista med objekt i slutet av detta alternativs objektlista. Varje objekt måste vara en  ScoredProperty  eller en  Property  -instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista med objekt att lägga till. |

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


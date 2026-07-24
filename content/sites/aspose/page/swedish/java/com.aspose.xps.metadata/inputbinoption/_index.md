---
title: "InputBin.InputBinOption"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver alternativen för funktionerna JobInputBin, DocumentInputBin och PageInputBin."
type: docs
weight: 14
url: /sv/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

Beskriver  JobInputBin ,  DocumentInputBin  och  PageInputBin  funktionsalternativ.
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Skapar en ny instans. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| [AutoSelect](#AutoSelect) | Enheten kommer automatiskt att välja det bästa alternativet baserat på konfigurationen. |
| [AutoSheetFeeder](#AutoSheetFeeder) | Enhetens inmatningsfack för bläckstråleskrivare. |
| [Cassette](#Cassette) | Anger att matningsbehållaren är en kassett. |
| [Manual](#Manual) | Anger standard manuellt matningsfack. |
| [Tractor](#Tractor) | Anger att matningsbehållaren är en traktor. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Lägger till en lista med objekt i slutet av detta alternativs objektlista. |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Lägger till en array av  IInputBinOptionItem  -instanser till alternativet. |
| [clone()](#clone--) | Klonar den här alternativinstansen. |
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
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| optionName | java.lang.String | Ett alternativnamn. |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | En godtycklig array av  IInputBinOptionItem  -instanser. |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


Enheten kommer automatiskt att välja det bästa alternativet baserat på konfigurationen.

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


Enhetens inmatningsfack för bläckstråleskrivare.

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


Anger att matningsbehållaren är en kassett.

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


Anger standard manuellt matningsfack.

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


Anger att matningsbehållaren är en traktor.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Lägger till en lista med objekt i slutet av detta alternativs objektlista. Varje objekt måste vara en  ScoredProperty  eller en  Property  -instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista med objekt att lägga till. |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


Lägger till en array av  IInputBinOptionItem  -instanser till alternativet.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | En godtycklig array av  IInputBinOptionItem  -instanser. |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


Klonar den här alternativinstansen.

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
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


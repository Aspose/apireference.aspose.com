---
title: "InputBin.InputBinOption"
second_title: "Aspose.Page voor Java API-referentie"
description: "Beschrijft de opties voor de functies JobInputBin, DocumentInputBin en PageInputBin."
type: docs
weight: 14
url: /nl/java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

Beschrijft de  JobInputBin ,  DocumentInputBin  en  PageInputBin  functieopties.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Maakt een nieuw exemplaar aan. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| [AutoSelect](#AutoSelect) | Apparaat kiest automatisch de beste optie op basis van de configuratie. |
| [AutoSheetFeeder](#AutoSheetFeeder) | Apparaatinvoerlade voor inkjetprinters. |
| [Cassette](#Cassette) | Geeft aan dat de invoerlade een cassette is. |
| [Manual](#Manual) | Geeft de standaard handmatige invoerlade aan. |
| [Tractor](#Tractor) | Geeft aan dat de invoerlade een tractor is. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Voegt een array van  IInputBinOptionItem  instanties toe aan de optie. |
| [clone()](#clone--) | Kloont deze optie-instantie. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Haalt de elementnaam op. |
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


Maakt een nieuw exemplaar aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| optionName | java.lang.String | Een optienaam. |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Een willekeurige array van  IInputBinOptionItem  instanties. |

### AutoSelect {#AutoSelect}
```
public static final InputBin.InputBinOption AutoSelect
```


Apparaat kiest automatisch de beste optie op basis van de configuratie.

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static final InputBin.InputBinOption AutoSheetFeeder
```


Apparaatinvoerlade voor inkjetprinters.

### Cassette {#Cassette}
```
public static final InputBin.InputBinOption Cassette
```


Geeft aan dat de invoerlade een cassette is.

### Manual {#Manual}
```
public static final InputBin.InputBinOption Manual
```


Geeft de standaard handmatige invoerlade aan.

### Tractor {#Tractor}
```
public static final InputBin.InputBinOption Tractor
```


Geeft aan dat de invoerlade een tractor is.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. Elk item moet een  ScoredProperty  of een  Property  instantie zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lijst met toe te voegen items. |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```


Voegt een array van  IInputBinOptionItem  instanties toe aan de optie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | Een willekeurige array van  IInputBinOptionItem  instanties. |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


Kloont deze optie-instantie.

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Beschrijving |
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


Haalt de elementnaam op.

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
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


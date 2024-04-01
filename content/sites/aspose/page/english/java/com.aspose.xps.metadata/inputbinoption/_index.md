---
title: InputBin.InputBinOption
second_title: Aspose.Page for Java API Reference
description: Describes the JobInputBin DocumentInputBin and PageInputBin features options.
type: docs
weight: 14
url: /java/com.aspose.xps.metadata/inputbin.inputbinoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.InputBin.IInputBinItem](../../com.aspose.xps.metadata/iinputbinitem)
```
public static final class InputBin.InputBinOption extends Option implements InputBin.IInputBinItem
```

Describes the  JobInputBin ,  DocumentInputBin  and  PageInputBin  features options.

## Constructors

| Constructor | Description |
| --- | --- |
| [InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)](#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Creates a new instance. |
| [InputBinOption(InputBin.InputBinOption option)](#InputBinOption-com.aspose.xps.metadata.InputBin.InputBinOption-) | Clones this option instance. |
## Fields

| Field | Description |
| --- | --- |
| [AutoSelect](#AutoSelect) | Device will automatically choose best option based on configuration. |
| [AutoSheetFeeder](#AutoSheetFeeder) | Device Input tray for Inkjet Printers. |
| [Cassette](#Cassette) | Specifies the feed bin is a cassette. |
| [Manual](#Manual) | Specifies the default manual feed bin. |
| [Tractor](#Tractor) | Specifies the feed bin is a tractor. |
## Methods

| Method | Description |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Adds a list of items to the end of this option's item list. |
| [add(InputBin.IInputBinOptionItem[] items)](#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-) | Adds an array of  IInputBinOptionItem  instances to the option. |
| [clone()](#clone--) | Clones this option instance. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Gets the element name. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setMediaCapacity(int mediaCapacity)](#setMediaCapacity-int-) | Sets a  MediaCapacity  scored property value. |
| [setMediaSheetCapacity(int mediaSheetCapacity)](#setMediaSheetCapacity-int-) | Sets a  MediaSheetCapacity  scored property value. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items) {#InputBinOption-java.lang.String-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBinOption(String optionName, InputBin.IInputBinOptionItem[] items)
```


Creates a new instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| optionName | java.lang.String | An options name. |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | An arbitrary array of  IInputBinOptionItem  instances. |

### InputBinOption(InputBin.InputBinOption option) {#InputBinOption-com.aspose.xps.metadata.InputBin.InputBinOption-}
```
public InputBinOption(InputBin.InputBinOption option)
```


Clones this option instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| option | [InputBinOption](../../com.aspose.xps.metadata/inputbinoption) | An instance to clone. |

### AutoSelect {#AutoSelect}
```
public static InputBin.InputBinOption AutoSelect
```


Device will automatically choose best option based on configuration.

### AutoSheetFeeder {#AutoSheetFeeder}
```
public static InputBin.InputBinOption AutoSheetFeeder
```


Device Input tray for Inkjet Printers.

### Cassette {#Cassette}
```
public static InputBin.InputBinOption Cassette
```


Specifies the feed bin is a cassette.

### Manual {#Manual}
```
public static InputBin.InputBinOption Manual
```


Specifies the default manual feed bin.

### Tractor {#Tractor}
```
public static InputBin.InputBinOption Tractor
```


Specifies the feed bin is a tractor.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Adds a list of items to the end of this option's item list. Each one must be a  ScoredProperty  or a  Property  instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | List of items to add. |

### add(InputBin.IInputBinOptionItem[] items) {#add-com.aspose.xps.metadata.InputBin.IInputBinOptionItem...-}
```
public InputBin.InputBinOption add(InputBin.IInputBinOptionItem[] items)
```

Adds an array of  IInputBinOptionItem  instances to the option.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | [IInputBinOptionItem\[\]](../../com.aspose.xps.metadata/iinputbinoptionitem) | An arbitrary array of  IInputBinOptionItem  instances. |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This options instance.
### clone() {#clone--}
```
public InputBin.InputBinOption clone()
```


Clones this option instance. The shortcut to the cloneing constructor.

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - The clone of this option instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
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


Gets the element name.

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




### setMediaCapacity(int mediaCapacity) {#setMediaCapacity-int-}
```
public InputBin.InputBinOption setMediaCapacity(int mediaCapacity)
```

Sets a  MediaCapacity  scored property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mediaCapacity | int | A  MediaCapacity  scored property value. |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This option instance.
### setMediaSheetCapacity(int mediaSheetCapacity) {#setMediaSheetCapacity-int-}
```
public InputBin.InputBinOption setMediaSheetCapacity(int mediaSheetCapacity)
```

Sets a  MediaSheetCapacity  scored property value.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| mediaSheetCapacity | int | A  MediaSheetCapacity  scored property value. |

**Returns:**
[InputBinOption](../../com.aspose.xps.metadata/inputbinoption) - This option instance.
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
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


---
title: "Staple.StapleOption"
second_title: "Aspose.Page för Java API-referens"
description: "Beskriver alternativen för funktionerna JobStapleAllDocuments och DocumentStaple."
type: docs
weight: 10
url: /sv/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

Beskriver alternativ för  JobStapleAllDocuments  och  DocumentStaple  funktionerna .
## Konstruktörer

| Konstruktor | Beskrivning |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Skapar en ny instans. |
## Fält

| Fält | Beskrivning |
| --- | --- |
| [None](#None) | Anger ingen häftning. |
| [SaddleStitch](#SaddleStitch) | Anger häftning med ryggsöm. |
| [StapleBottomLeft](#StapleBottomLeft) | Anger en enda häftklämma i det nedre vänstra hörnet. |
| [StapleBottomRight](#StapleBottomRight) | Anger en enda häftklämma i det nedre högra hörnet. |
| [StapleDualBottom](#StapleDualBottom) | Anger två häftklämmor längs den nedre kanten. |
| [StapleDualLeft](#StapleDualLeft) | Anger två häftklämmor längs den vänstra kanten. |
| [StapleDualRight](#StapleDualRight) | Anger två häftklämmor längs den högra kanten. |
| [StapleDualTop](#StapleDualTop) | Anger två häftklämmor längs den övre kanten |
| [StapleTopLeft](#StapleTopLeft) | Anger en enda häftklämma i det övre vänstra hörnet. |
| [StapleTopRight](#StapleTopRight) | Anger en enda häftklämma i det övre högra hörnet. |
## Metoder

| Metod | Beskrivning |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Lägger till en lista med objekt i slutet av detta alternativs objektlista. |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Lägger till en matris av  IStapleOptionItem  -instanser till funktionen. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Hämtar elementets namn. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Ställer in ett  Angle  poängsatt egenskapsvärde. |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | Ställer in ett  SheetCapacity  poängsatt egenskapsvärde. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


Skapar en ny instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| optionName | java.lang.String | Ett alternativnamn. |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | En godtycklig matris av  IStapleOptionItem  -instanser. |

### None {#None}
```
public static final Staple.StapleOption None
```


Anger ingen häftning.

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


Anger häftning med ryggsöm.

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


Anger en enda häftklämma i det nedre vänstra hörnet.

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


Anger en enda häftklämma i det nedre högra hörnet.

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


Anger två häftklämmor längs den nedre kanten.

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


Anger två häftklämmor längs den vänstra kanten.

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


Anger två häftklämmor längs den högra kanten.

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


Anger två häftklämmor längs den övre kanten

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


Anger en enda häftklämma i det övre vänstra hörnet.

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


Anger en enda häftklämma i det övre högra hörnet.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Lägger till en lista med objekt i slutet av detta alternativs objektlista. Varje objekt måste vara en  ScoredProperty  eller en  Property  -instans.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lista med objekt att lägga till. |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


Lägger till en matris av  IStapleOptionItem  -instanser till funktionen.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | En godtycklig matris av  IStapleOptionItem  -instanser. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
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




### setAngle(int angle) {#setAngle-int-}
```
public final Staple.StapleOption setAngle(int angle)
```


Ställer in ett  Angle  poängsatt egenskapsvärde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| vinkel | int | Ett  Angle  poängsatt egenskapsvärde. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


Ställer in ett  SheetCapacity  poängsatt egenskapsvärde.

**Parameters:**
| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sheetCapacity | int | Ett  SheetCapacity  poängsatt egenskapsvärde. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
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


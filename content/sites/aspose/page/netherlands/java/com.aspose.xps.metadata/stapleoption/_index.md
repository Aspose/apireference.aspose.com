---
title: "Staple.StapleOption"
second_title: "Aspose.Page voor Java API-referentie"
description: "Beschrijft de functie‑opties van JobStapleAllDocuments en DocumentStaple."
type: docs
weight: 10
url: /nl/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

Beschrijft de  JobStapleAllDocuments  en  DocumentStaple  functie-opties.
## Constructors

| Constructor | Beschrijving |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Maakt een nieuw exemplaar aan. |
## Velden

| Veld | Beschrijving |
| --- | --- |
| [None](#None) | Specificeert geen nieten. |
| [SaddleStitch](#SaddleStitch) | Specificeert saddle stitch-nieten. |
| [StapleBottomLeft](#StapleBottomLeft) | Specificeert één niet in de onderste, linkerhoek. |
| [StapleBottomRight](#StapleBottomRight) | Specificeert één niet in de onderste, rechterhoek. |
| [StapleDualBottom](#StapleDualBottom) | Specificeert twee nieten langs de onderkant. |
| [StapleDualLeft](#StapleDualLeft) | Specificeert twee nieten langs de linkerkant. |
| [StapleDualRight](#StapleDualRight) | Specificeert twee nieten langs de rechterkant. |
| [StapleDualTop](#StapleDualTop) | Specificeert twee nieten langs de bovenkant. |
| [StapleTopLeft](#StapleTopLeft) | Specificeert één niet in de bovenste, linkerhoek. |
| [StapleTopRight](#StapleTopRight) | Specificeert één niet in de bovenste, rechterhoek. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Voegt een array van IStapleOptionItem-instanties toe aan de functie. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Haalt de elementnaam op. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Stelt een Angle-score-eigenschapwaarde in. |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | Stelt een SheetCapacity-score-eigenschapwaarde in. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


Maakt een nieuw exemplaar aan.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| optionName | java.lang.String | Een optienaam. |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Een willekeurige array van IStapleOptionItem-instanties. |

### None {#None}
```
public static final Staple.StapleOption None
```


Specificeert geen nieten.

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


Specificeert saddle stitch-nieten.

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


Specificeert één niet in de onderste, linkerhoek.

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


Specificeert één niet in de onderste, rechterhoek.

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


Specificeert twee nieten langs de onderkant.

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


Specificeert twee nieten langs de linkerkant.

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


Specificeert twee nieten langs de rechterkant.

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


Specificeert twee nieten langs de bovenkant.

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


Specificeert één niet in de bovenste, linkerhoek.

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


Specificeert één niet in de bovenste, rechterhoek.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Voegt een lijst met items toe aan het einde van de itemslijst van deze optie. Elk item moet een  ScoredProperty  of een  Property  instantie zijn.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Lijst met toe te voegen items. |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


Voegt een array van IStapleOptionItem-instanties toe aan de functie.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Een willekeurige array van IStapleOptionItem-instanties. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
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




### setAngle(int angle) {#setAngle-int-}
```
public final Staple.StapleOption setAngle(int angle)
```


Stelt een Angle-score-eigenschapwaarde in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| angle | int | Een Angle-score-eigenschapwaarde. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


Stelt een SheetCapacity-score-eigenschapwaarde in.

**Parameters:**
| Parameter | Type | Beschrijving |
| --- | --- | --- |
| sheetCapacity | int | Een SheetCapacity-score-eigenschapwaarde. |

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


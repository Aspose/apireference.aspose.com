---
title: "Staple.StapleOption"
second_title: "Aspose.Page for Java API-Referenz"
description: "Beschreibt die Funktionsoptionen für JobStapleAllDocuments und DocumentStaple."
type: docs
weight: 10
url: /de/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

Beschreibt die Optionen der Features  JobStapleAllDocuments  und  DocumentStaple .
## Konstruktoren

| Konstruktor | Beschreibung |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Erstellt eine neue Instanz. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| [None](#None) | Gibt an, dass nicht geheftet wird. |
| [SaddleStitch](#SaddleStitch) | Gibt an, dass Sattelheftung verwendet wird. |
| [StapleBottomLeft](#StapleBottomLeft) | Gibt an, dass ein einzelner Heftklammer in der unteren linken Ecke platziert wird. |
| [StapleBottomRight](#StapleBottomRight) | Gibt an, dass ein einzelner Heftklammer in der unteren rechten Ecke platziert wird. |
| [StapleDualBottom](#StapleDualBottom) | Gibt an, dass zwei Heftklammern entlang der unteren Kante platziert werden. |
| [StapleDualLeft](#StapleDualLeft) | Gibt an, dass zwei Heftklammern entlang der linken Kante platziert werden. |
| [StapleDualRight](#StapleDualRight) | Gibt an, dass zwei Heftklammern entlang der rechten Kante platziert werden. |
| [StapleDualTop](#StapleDualTop) | Gibt an, dass zwei Heftklammern entlang der oberen Kante platziert werden. |
| [StapleTopLeft](#StapleTopLeft) | Gibt an, dass ein einzelner Heftklammer in der oberen linken Ecke platziert wird. |
| [StapleTopRight](#StapleTopRight) | Gibt an, dass ein einzelner Heftklammer in der oberen rechten Ecke platziert wird. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Fügt dem Feature ein Array von  IStapleOptionItem  Instanzen hinzu. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ermittelt den Elementnamen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Setzt einen  Angle  bewerteten Eigenschaftswert. |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | Setzt einen  SheetCapacity  bewerteten Eigenschaftswert. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


Erstellt eine neue Instanz.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| optionName | java.lang.String | Ein Optionsname. |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Ein beliebiges Array von  IStapleOptionItem  Instanzen. |

### None {#None}
```
public static final Staple.StapleOption None
```


Gibt an, dass nicht geheftet wird.

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


Gibt an, dass Sattelheftung verwendet wird.

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


Gibt an, dass ein einzelner Heftklammer in der unteren linken Ecke platziert wird.

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


Gibt an, dass ein einzelner Heftklammer in der unteren rechten Ecke platziert wird.

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


Gibt an, dass zwei Heftklammern entlang der unteren Kante platziert werden.

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


Gibt an, dass zwei Heftklammern entlang der linken Kante platziert werden.

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


Gibt an, dass zwei Heftklammern entlang der rechten Kante platziert werden.

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


Gibt an, dass zwei Heftklammern entlang der oberen Kante platziert werden.

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


Gibt an, dass ein einzelner Heftklammer in der oberen linken Ecke platziert wird.

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


Gibt an, dass ein einzelner Heftklammer in der oberen rechten Ecke platziert wird.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Fügt eine Liste von Elementen am Ende der Elementliste dieser Option hinzu. Jedes muss eine Instanz von  ScoredProperty  oder  Property  sein.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Liste der hinzuzufügenden Elemente. |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


Fügt dem Feature ein Array von  IStapleOptionItem  Instanzen hinzu.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Ein beliebiges Array von  IStapleOptionItem  Instanzen. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
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




### setAngle(int angle) {#setAngle-int-}
```
public final Staple.StapleOption setAngle(int angle)
```


Setzt einen  Angle  bewerteten Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| angle | int | Ein  Angle  bewerteter Eigenschaftswert. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


Setzt einen  SheetCapacity  bewerteten Eigenschaftswert.

**Parameters:**
| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| sheetCapacity | int | Ein  SheetCapacity  bewerteter Eigenschaftswert. |

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


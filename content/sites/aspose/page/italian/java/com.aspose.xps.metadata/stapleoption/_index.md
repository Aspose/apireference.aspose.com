---
title: "Staple.StapleOption"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive le opzioni delle funzionalità JobStapleAllDocuments e DocumentStaple."
type: docs
weight: 10
url: /it/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

Descrive le opzioni delle funzionalità  JobStapleAllDocuments  e  DocumentStaple .
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Crea una nuova istanza. |
## Campi

| Campo | Descrizione |
| --- | --- |
| [None](#None) | Specifica nessuna puntatura. |
| [SaddleStitch](#SaddleStitch) | Specifica la puntatura a cucitura a sella. |
| [StapleBottomLeft](#StapleBottomLeft) | Specifica una singola puntura nell'angolo inferiore sinistro. |
| [StapleBottomRight](#StapleBottomRight) | Specifica una singola puntura nell'angolo inferiore destro. |
| [StapleDualBottom](#StapleDualBottom) | Specifica due punture lungo il bordo inferiore. |
| [StapleDualLeft](#StapleDualLeft) | Specifica due punture lungo il bordo sinistro. |
| [StapleDualRight](#StapleDualRight) | Specifica due punture lungo il bordo destro. |
| [StapleDualTop](#StapleDualTop) | Specifica due punture lungo il bordo superiore |
| [StapleTopLeft](#StapleTopLeft) | Specifica una singola puntura nell'angolo superiore sinistro. |
| [StapleTopRight](#StapleTopRight) | Specifica una singola puntura nell'angolo superiore destro. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Aggiunge un array di  IStapleOptionItem  istanze alla funzionalità. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ottiene il nome dell'elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Imposta un valore della proprietà valutata  Angle . |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | Imposta un valore della proprietà valutata  SheetCapacity . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


Crea una nuova istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| optionName | java.lang.String | Un nome dell'opzione. |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Un array arbitrario di  IStapleOptionItem  istanze. |

### None {#None}
```
public static final Staple.StapleOption None
```


Specifica nessuna puntatura.

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


Specifica la puntatura a cucitura a sella.

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


Specifica una singola puntura nell'angolo inferiore sinistro.

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


Specifica una singola puntura nell'angolo inferiore destro.

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


Specifica due punture lungo il bordo inferiore.

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


Specifica due punture lungo il bordo sinistro.

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


Specifica due punture lungo il bordo destro.

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


Specifica due punture lungo il bordo superiore

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


Specifica una singola puntura nell'angolo superiore sinistro.

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


Specifica una singola puntura nell'angolo superiore destro.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. Ognuno deve essere un'istanza di  ScoredProperty  o di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Elenco di elementi da aggiungere. |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


Aggiunge un array di  IStapleOptionItem  istanze alla funzionalità.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Un array arbitrario di  IStapleOptionItem  istanze. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
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


Ottiene il nome dell'elemento.

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


Imposta un valore della proprietà valutata  Angle .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| angle | int | Un valore della proprietà valutata  Angle . |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


Imposta un valore della proprietà valutata  SheetCapacity .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sheetCapacity | int | Un valore della proprietà valutata  SheetCapacity . |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


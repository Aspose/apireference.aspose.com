---
title: "Staple.StapleOption"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает параметры функций JobStapleAllDocuments и DocumentStaple."
type: docs
weight: 10
url: /ru/java/com.aspose.xps.metadata/staple.stapleoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class Staple.StapleOption extends Option
```

Описывает параметры функций JobStapleAllDocuments и DocumentStaple.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [StapleOption(String optionName, Staple.IStapleOptionItem[] items)](#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Создаёт новый экземпляр. |
## Поля

| Поле | Описание |
| --- | --- |
| [None](#None) | Указывает отсутствие скрепления. |
| [SaddleStitch](#SaddleStitch) | Указывает скрепление сшивкой. |
| [StapleBottomLeft](#StapleBottomLeft) | Указывает одну скобу в нижнем левом углу. |
| [StapleBottomRight](#StapleBottomRight) | Указывает одну скобу в нижнем правом углу. |
| [StapleDualBottom](#StapleDualBottom) | Указывает две скобы вдоль нижнего края. |
| [StapleDualLeft](#StapleDualLeft) | Указывает две скобы вдоль левого края. |
| [StapleDualRight](#StapleDualRight) | Указывает две скобы вдоль правого края. |
| [StapleDualTop](#StapleDualTop) | Указывает две скобы вдоль верхнего края |
| [StapleTopLeft](#StapleTopLeft) | Указывает одну скобу в верхнем левом углу. |
| [StapleTopRight](#StapleTopRight) | Указывает одну скобу в верхнем правом углу. |
## Методы

| Метод | Описание |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Добавляет список элементов в конец списка элементов этой опции. |
| [add(Staple.IStapleOptionItem[] items)](#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-) | Добавляет массив  IStapleOptionItem  экземпляров к функции. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Получает имя элемента. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAngle(int angle)](#setAngle-int-) | Устанавливает значение оцененного свойства  Angle . |
| [setSheetCapacity(int sheetCapacity)](#setSheetCapacity-int-) | Устанавливает значение оцененного свойства  SheetCapacity . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### StapleOption(String optionName, Staple.IStapleOptionItem[] items) {#StapleOption-java.lang.String-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public StapleOption(String optionName, Staple.IStapleOptionItem[] items)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| optionName | java.lang.String | Имя параметра. |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Произвольный массив  IStapleOptionItem  экземпляров. |

### None {#None}
```
public static final Staple.StapleOption None
```


Указывает отсутствие скрепления.

### SaddleStitch {#SaddleStitch}
```
public static final Staple.StapleOption SaddleStitch
```


Указывает скрепление сшивкой.

### StapleBottomLeft {#StapleBottomLeft}
```
public static final Staple.StapleOption StapleBottomLeft
```


Указывает одну скобу в нижнем левом углу.

### StapleBottomRight {#StapleBottomRight}
```
public static final Staple.StapleOption StapleBottomRight
```


Указывает одну скобу в нижнем правом углу.

### StapleDualBottom {#StapleDualBottom}
```
public static final Staple.StapleOption StapleDualBottom
```


Указывает две скобы вдоль нижнего края.

### StapleDualLeft {#StapleDualLeft}
```
public static final Staple.StapleOption StapleDualLeft
```


Указывает две скобы вдоль левого края.

### StapleDualRight {#StapleDualRight}
```
public static final Staple.StapleOption StapleDualRight
```


Указывает две скобы вдоль правого края.

### StapleDualTop {#StapleDualTop}
```
public static final Staple.StapleOption StapleDualTop
```


Указывает две скобы вдоль верхнего края

### StapleTopLeft {#StapleTopLeft}
```
public static final Staple.StapleOption StapleTopLeft
```


Указывает одну скобу в верхнем левом углу.

### StapleTopRight {#StapleTopRight}
```
public static final Staple.StapleOption StapleTopRight
```


Указывает одну скобу в верхнем правом углу.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Добавляет список элементов в конец списка элементов этой опции. Каждый из них должен быть экземпляром  ScoredProperty  или  Property  instance.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Список элементов для добавления. |

### add(Staple.IStapleOptionItem[] items) {#add-com.aspose.xps.metadata.Staple.IStapleOptionItem...-}
```
public Staple.StapleOption add(Staple.IStapleOptionItem[] items)
```


Добавляет массив  IStapleOptionItem  экземпляров к функции.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IStapleOptionItem\[\]](../../com.aspose.xps.metadata/istapleoptionitem) | Произвольный массив  IStapleOptionItem  экземпляров. |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This options instance.
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Параметр | Тип | Описание |
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


Получает имя элемента.

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


Устанавливает значение оцененного свойства  Angle .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| angle | int | Значение оцененного свойства  Angle . |

**Returns:**
[StapleOption](../../com.aspose.xps.metadata/stapleoption) - This option instance.
### setSheetCapacity(int sheetCapacity) {#setSheetCapacity-int-}
```
public final Staple.StapleOption setSheetCapacity(int sheetCapacity)
```


Устанавливает значение оцененного свойства  SheetCapacity .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| sheetCapacity | int | Значение оцененного свойства  SheetCapacity . |

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
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


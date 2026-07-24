---
title: "PageMediaType.PageMediaTypeOption"
second_title: "Справочник API Aspose.Page для Java"
description: "Описывает параметры функции PageMediaType."
type: docs
weight: 13
url: /ru/java/com.aspose.xps.metadata/pagemediatype.pagemediatypeoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.PageMediaType.IPageMediaTypeItem](../../com.aspose.xps.metadata/ipagemediatypeitem)
```
public static final class PageMediaType.PageMediaTypeOption extends Option implements PageMediaType.IPageMediaTypeItem
```

Описывает параметры функции  PageMediaType .
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)](#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Создаёт новый экземпляр. |
| [PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)](#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-) | Клонирует этот экземпляр параметра. |
## Поля

| Поле | Описание |
| --- | --- |
| [Archival](#Archival) | Указывает носитель архивного качества. |
| [AutoSelect](#AutoSelect) | Указывает, что носитель будет выбран автоматически. |
| [BackPrintFilm](#BackPrintFilm) | Указывает специализированный носитель для печати с обратной стороны пленки. |
| [Bond](#Bond) | Указывает стандартный бонд-носитель. |
| [CardStock](#CardStock) | Указывает стандартный картонный носитель. |
| [Continous](#Continous) | Указывает носитель с непрерывной подачей. |
| [EnvelopePlain](#EnvelopePlain) | Указывает стандартный конвертный носитель. |
| [EnvelopeWindow](#EnvelopeWindow) | Указывает носитель для конвертов с окошком. |
| [Fabric](#Fabric) | Указывает тканевый носитель. |
| [HighResolution](#HighResolution) | Указывает специализированный носитель высокого разрешения. |
| [Label](#Label) | Указывает носитель для этикеток. |
| [MultiLayerForm](#MultiLayerForm) | Указывает носитель для присоединённых многостраничных форм. |
| [MultiPartForm](#MultiPartForm) | Указывает носитель для отдельных многостраничных форм. |
| [None](#None) | Указывает неизвестный или неуказанный в списке носитель. |
| [Photographic](#Photographic) | Указывает стандартный фотоноситель. |
| [PhotographicFilm](#PhotographicFilm) | Указывает фотоноситель на пленке. |
| [PhotographicGlossy](#PhotographicGlossy) | Указывает глянцевый фотоноситель. |
| [PhotographicHighGloss](#PhotographicHighGloss) | Указывает фотоноситель с высоким глянцем. |
| [PhotographicMatte](#PhotographicMatte) | Указывает матовый фотоноситель. |
| [PhotographicSatin](#PhotographicSatin) | Указывает сатиновый фотоноситель. |
| [PhotographicSemiGloss](#PhotographicSemiGloss) | Указывает полуглянцевый фотоноситель. |
| [Plain](#Plain) | Указывает стандартный бумажный носитель. |
| [Screen](#Screen) | Указывает вывод на дисплей в непрерывной форме. |
| [ScreenPaged](#ScreenPaged) | Указывает вывод на дисплей в постраничной форме. |
| [Stationary](#Stationary) | Указывает специализированный канцелярский носитель. |
| [TShirtTransfer](#TShirtTransfer) | Указывает специализированный носитель для переноса на футболки. |
| [TabStockFull](#TabStockFull) | Указывает материал табов, который не предварительно нарезан (одинарные табы). |
| [TabStockPreCut](#TabStockPreCut) | Указывает материал табов, который предварительно нарезан (многократные табы). |
| [Transparency](#Transparency) | Указывает материал прозрачности. |
## Методы

| Метод | Описание |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Добавляет список элементов в конец списка элементов этой опции. |
| [add(PageMediaType.IPageMediaTypeOptionItem[] items)](#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-) | Добавляет массив экземпляров  IPageMediaTypeOptionItem  в параметр. |
| [clone()](#clone--) | Клонирует этот экземпляр параметра. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Получает имя элемента. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setWeight(int weight)](#setWeight-int-) | Устанавливает значение свойства оценки  Weight . |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items) {#PageMediaTypeOption-java.lang.String-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaTypeOption(String optionName, PageMediaType.IPageMediaTypeOptionItem[] items)
```


Создаёт новый экземпляр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| optionName | java.lang.String | Имя параметра. |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Произвольный массив экземпляров  IPageMediaTypeOptionItem . |

### PageMediaTypeOption(PageMediaType.PageMediaTypeOption option) {#PageMediaTypeOption-com.aspose.xps.metadata.PageMediaType.PageMediaTypeOption-}
```
public PageMediaTypeOption(PageMediaType.PageMediaTypeOption option)
```


Клонирует этот экземпляр параметра.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| option | [PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) | Экземпляр для клонирования. |

### Archival {#Archival}
```
public static PageMediaType.PageMediaTypeOption Archival
```


Указывает носитель архивного качества.

### AutoSelect {#AutoSelect}
```
public static PageMediaType.PageMediaTypeOption AutoSelect
```


Указывает, что носитель будет выбран автоматически.

### BackPrintFilm {#BackPrintFilm}
```
public static PageMediaType.PageMediaTypeOption BackPrintFilm
```


Указывает специализированный носитель для печати с обратной стороны пленки.

### Bond {#Bond}
```
public static PageMediaType.PageMediaTypeOption Bond
```


Указывает стандартный бонд-носитель.

### CardStock {#CardStock}
```
public static PageMediaType.PageMediaTypeOption CardStock
```


Указывает стандартный картонный носитель.

### Continous {#Continous}
```
public static PageMediaType.PageMediaTypeOption Continous
```


Указывает носитель с непрерывной подачей.

### EnvelopePlain {#EnvelopePlain}
```
public static PageMediaType.PageMediaTypeOption EnvelopePlain
```


Указывает стандартный конвертный носитель.

### EnvelopeWindow {#EnvelopeWindow}
```
public static PageMediaType.PageMediaTypeOption EnvelopeWindow
```


Указывает носитель для конвертов с окошком.

### Fabric {#Fabric}
```
public static PageMediaType.PageMediaTypeOption Fabric
```


Указывает тканевый носитель.

### HighResolution {#HighResolution}
```
public static PageMediaType.PageMediaTypeOption HighResolution
```


Указывает специализированный носитель высокого разрешения.

### Label {#Label}
```
public static PageMediaType.PageMediaTypeOption Label
```


Указывает носитель для этикеток.

### MultiLayerForm {#MultiLayerForm}
```
public static PageMediaType.PageMediaTypeOption MultiLayerForm
```


Указывает носитель для присоединённых многостраничных форм.

### MultiPartForm {#MultiPartForm}
```
public static PageMediaType.PageMediaTypeOption MultiPartForm
```


Указывает носитель для отдельных многостраничных форм.

### None {#None}
```
public static PageMediaType.PageMediaTypeOption None
```


Указывает неизвестный или неуказанный в списке носитель.

### Photographic {#Photographic}
```
public static PageMediaType.PageMediaTypeOption Photographic
```


Указывает стандартный фотоноситель.

### PhotographicFilm {#PhotographicFilm}
```
public static PageMediaType.PageMediaTypeOption PhotographicFilm
```


Указывает фотоноситель на пленке.

### PhotographicGlossy {#PhotographicGlossy}
```
public static PageMediaType.PageMediaTypeOption PhotographicGlossy
```


Указывает глянцевый фотоноситель.

### PhotographicHighGloss {#PhotographicHighGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicHighGloss
```


Указывает фотоноситель с высоким глянцем.

### PhotographicMatte {#PhotographicMatte}
```
public static PageMediaType.PageMediaTypeOption PhotographicMatte
```


Указывает матовый фотоноситель.

### PhotographicSatin {#PhotographicSatin}
```
public static PageMediaType.PageMediaTypeOption PhotographicSatin
```


Указывает сатиновый фотоноситель.

### PhotographicSemiGloss {#PhotographicSemiGloss}
```
public static PageMediaType.PageMediaTypeOption PhotographicSemiGloss
```


Указывает полуглянцевый фотоноситель.

### Plain {#Plain}
```
public static PageMediaType.PageMediaTypeOption Plain
```


Указывает стандартный бумажный носитель.

### Screen {#Screen}
```
public static PageMediaType.PageMediaTypeOption Screen
```


Указывает вывод на дисплей в непрерывной форме.

### ScreenPaged {#ScreenPaged}
```
public static PageMediaType.PageMediaTypeOption ScreenPaged
```


Указывает вывод на дисплей в постраничной форме.

### Stationary {#Stationary}
```
public static PageMediaType.PageMediaTypeOption Stationary
```


Указывает специализированный канцелярский носитель.

### TShirtTransfer {#TShirtTransfer}
```
public static PageMediaType.PageMediaTypeOption TShirtTransfer
```


Указывает специализированный носитель для переноса на футболки.

### TabStockFull {#TabStockFull}
```
public static PageMediaType.PageMediaTypeOption TabStockFull
```


Указывает материал табов, который не предварительно нарезан (одинарные табы).

### TabStockPreCut {#TabStockPreCut}
```
public static PageMediaType.PageMediaTypeOption TabStockPreCut
```


Указывает материал табов, который предварительно нарезан (многократные табы).

### Transparency {#Transparency}
```
public static PageMediaType.PageMediaTypeOption Transparency
```


Указывает материал прозрачности.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Добавляет список элементов в конец списка элементов этой опции. Каждый из них должен быть экземпляром  ScoredProperty  или  Property  instance.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Список элементов для добавления. |

### add(PageMediaType.IPageMediaTypeOptionItem[] items) {#add-com.aspose.xps.metadata.PageMediaType.IPageMediaTypeOptionItem...-}
```
public PageMediaType.PageMediaTypeOption add(PageMediaType.IPageMediaTypeOptionItem[] items)
```


Добавляет массив экземпляров  IPageMediaTypeOptionItem  в параметр.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| items | [IPageMediaTypeOptionItem\[\]](../../com.aspose.xps.metadata/ipagemediatypeoptionitem) | Произвольный массив экземпляров  IPageMediaTypeOptionItem . |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This options instance.
### clone() {#clone--}
```
public PageMediaType.PageMediaTypeOption clone()
```


Клонирует этот экземпляр параметра. Ярлык к конструктору клонирования.

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - The clone of this option instance.
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




### setWeight(int weight) {#setWeight-int-}
```
public PageMediaType.PageMediaTypeOption setWeight(int weight)
```


Устанавливает значение свойства оценки  Weight .

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| вес | int | Значение свойства оценки  Weight . |

**Returns:**
[PageMediaTypeOption](../../com.aspose.xps.metadata/pagemediatypeoption) - This option instance.
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


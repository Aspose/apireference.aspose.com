---
title: "XpsConverterToPdfOptions"
second_title: "Справочник API Aspose.Page для Java"
description: "Представляет параметры конвертера XPS в PDF для плагина."
type: docs
weight: 13
url: /ru/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

Представляет параметры конвертера XPS в PDF для плагина [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | Инициализирует новый экземпляр объекта [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions). |
## Методы

| Метод | Описание |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Добавляет новый источник данных в коллекцию данных плагина XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Добавляет новый источник данных в коллекцию данных плагина XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Возвращает коллекцию данных плагина XpsConverterOptions. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Возвращает значение, указывающее уровень сжатия изображения. |
| [getOperationName()](#getOperationName--) | Возвращает название операции. |
| [getPageNumbers()](#getPageNumbers--) | Получает массив номеров страниц в документе XPS для конвертации. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Получает коллекцию добавленных целей для сохранения результатов операции. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Устанавливает значение, определяющее уровень сжатия изображения. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Устанавливает массив номеров страниц в документе XPS для конвертации. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


Инициализирует новый экземпляр объекта [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions).

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Добавляет новый источник данных в коллекцию данных плагина XpsConverter.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Источник данных для добавления. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Добавляет новый источник данных в коллекцию данных плагина XpsConverterOptions.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Источник данных (файл или поток) для сохранения результатов операции. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Возвращает коллекцию данных плагина XpsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Возвращает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Returns:**
int - Значение, определяющее уровень сжатия изображения.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Возвращает название операции.

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Получает массив номеров страниц в документе XPS для конвертации.

**Returns:**
int[] - массив номеров страниц в документе XPS.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Получает коллекцию добавленных целей для сохранения результатов операции.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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




### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Устанавливает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Значение, определяющее уровень сжатия изображения. |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Устанавливает массив номеров страниц в документе XPS для конвертации. Если не задано, будут конвертированы все страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| pageNumbers | int[] | Массив чисел страниц в документе XPS. |

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


---
title: "XpsConverterToImageOptions"
second_title: "Справочник API Aspose.Page для Java"
description: "Представляет параметры конвертера XPS в изображение для плагина."
type: docs
weight: 12
url: /ru/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Представляет параметры конвертера XPS в изображение для плагина [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Создаёт новый экземпляр объекта [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions). |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Создаёт новый экземпляр объекта [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) с форматом изображения. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Создаёт новый экземпляр объекта [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) с размером получаемого изображения. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Создаёт новый экземпляр объекта [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) с форматом изображения. |
## Методы

| Метод | Описание |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Добавляет новый источник данных в коллекцию данных плагина XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Добавляет новый источник данных в коллекцию данных плагина XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Возвращает коллекцию данных плагина XpsConverterOptions. |
| [getImageFormat()](#getImageFormat--) | Получает формат изображения. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Возвращает значение, указывающее уровень сжатия изображения. |
| [getOperationName()](#getOperationName--) | Возвращает название операции. |
| [getPageNumbers()](#getPageNumbers--) | Получает массив номеров страниц в документе XPS для конвертации. |
| [getResolution()](#getResolution--) | Получает разрешение изображения. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Получает коллекцию добавленных целей для сохранения результатов операции. |
| [getSize()](#getSize--) | Получает размер результирующего изображения. |
| [getSmoothingMode()](#getSmoothingMode--) | Получает режим сглаживания для рендеринга изображения. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Получает формат изображения. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Устанавливает значение, определяющее уровень сжатия изображения. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Устанавливает массив номеров страниц в документе XPS для конвертации. |
| [setResolution(int resolution)](#setResolution-int-) | Устанавливает разрешение изображения. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Устанавливает размер результирующего изображения. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Устанавливает режим сглаживания для рендеринга изображения. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Создаёт новый экземпляр объекта [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions).

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Создаёт новый экземпляр объекта [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) с форматом изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат результирующего изображения. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Создаёт новый экземпляр объекта [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) с размером получаемого изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер результирующего изображения. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Создаёт новый экземпляр объекта [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) с форматом изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат результирующего изображения. |
| размер | java.awt.Dimension |  |

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
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Получает формат изображения.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
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
### getResolution() {#getResolution--}
```
public int getResolution()
```


Получает разрешение изображения.

**Returns:**
int - разрешение изображения.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Получает коллекцию добавленных целей для сохранения результатов операции.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Получает размер результирующего изображения.

**Returns:**
java.awt.Dimension - размер изображения.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Получает режим сглаживания для рендеринга изображения.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
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




### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Получает формат изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат результирующего изображения. |

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

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Устанавливает разрешение изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| разрешение | int | Разрешение результирующего изображения. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Устанавливает размер результирующего изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер результирующего изображения. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Устанавливает режим сглаживания для рендеринга изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Режим сглаживания. |

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


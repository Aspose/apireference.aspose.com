---
title: "PsConverterToImageOptions"
second_title: "Справочник API Aspose.Page для Java"
description: "Представляет параметры конвертера PS/EPS в изображение для  плагина."
type: docs
weight: 12
url: /ru/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

Представляет параметры конвертера PS/EPS в изображение для плагина [PsConverter](../../com.aspose.eps.plugins/psconverter).
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | Инициализирует новый экземпляр объекта [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions). |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | Инициализирует новый экземпляр объекта [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) с форматом изображения. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | Инициализирует новый экземпляр объекта [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) с размером получаемого изображения. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Инициализирует новый экземпляр объекта [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) с форматом изображения. |
## Методы

| Метод | Описание |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Добавляет новый источник данных в коллекцию данных плагина PsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Добавляет новый источник данных в коллекцию данных плагина PsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Возвращает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Возвращает коллекцию данных плагина PsConverterOptions. |
| [getExceptions()](#getExceptions--) | Возвращает список некритических ошибок. |
| [getImageFormat()](#getImageFormat--) | Получает формат изображения. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Возвращает значение, указывающее уровень сжатия изображения. |
| [getOperationName()](#getOperationName--) | Возвращает название операции. |
| [getResolution()](#getResolution--) | Получает разрешение изображения. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Получает коллекцию добавленных целей для сохранения результатов операции. |
| [getSize()](#getSize--) | Получает размер результирующего изображения. |
| [getSmoothingMode()](#getSmoothingMode--) | Получает режим сглаживания для рендеринга изображения. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Получает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [isSupressErrors()](#isSupressErrors--) | Возвращает значение, указывающее, будут ли ошибки подавляться во время конвертации. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Указывает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Указывает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Получает формат изображения. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Устанавливает значение, определяющее уровень сжатия изображения. |
| [setResolution(int resolution)](#setResolution-int-) | Устанавливает разрешение изображения. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Устанавливает размер результирующего изображения. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Устанавливает режим сглаживания для рендеринга изображения. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


Инициализирует новый экземпляр объекта [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions).

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


Инициализирует новый экземпляр объекта [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) с форматом изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат результирующего изображения. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


Инициализирует новый экземпляр объекта [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) с размером получаемого изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер результирующего изображения. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Инициализирует новый экземпляр объекта [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) с форматом изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат результирующего изображения. |
| размер | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Добавляет новый источник данных в коллекцию данных плагина PsConverter.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Источник данных для добавления. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Добавляет новый источник данных в коллекцию данных плагина PsConverterOptions.

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Возвращает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. Папка по умолчанию — стандартная папка шрифтов, где ОС ищет шрифты для внутренних нужд.

**Returns:**
java.lang.String[] — массив папок шрифтов.
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


Возвращает коллекцию данных плагина PsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Возвращает список некритических ошибок.

**Returns:**
java.util.List<java.lang.Exception> — список исключений
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
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - A smoothing mode.
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### isDebug() {#isDebug--}
```
public boolean isDebug()
```


Получает флаг, позволяющий выводить предупреждения и сообщения во время конвертации.

**Returns:**
boolean — значение debug.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Возвращает значение, указывающее, будут ли ошибки подавляться во время конвертации.

**Returns:**
boolean — логическое значение
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### setAdditionalFontsFolders(String[] fontsFolders) {#setAdditionalFontsFolders-java.lang.String---}
```
public void setAdditionalFontsFolders(String[] fontsFolders)
```


Указывает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. Папка по умолчанию — стандартная папка шрифтов, где ОС ищет шрифты для внутренних нужд.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Массив папок шрифтов. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Указывает флаг, позволяющий выводить предупреждения и сообщения во время конвертации.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| debug | boolean | Булево значение. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Устанавливает режим сглаживания для рендеринга изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Режим сглаживания. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| supressErrors | boolean | Булево значение. |

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


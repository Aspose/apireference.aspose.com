---
title: "ImageSaveOptions"
second_title: "Справочник API Aspose.Page для Java"
description: "Этот класс содержит параметры, необходимые для управления процессом конвертации."
type: docs
weight: 10
url: /ru/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

Этот класс содержит параметры, необходимые для управления процессом конвертации.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Инициализировать новый экземпляр класса ImageSaveOptions со значениями по умолчанию для флагов suppressErrors (true) и debug (false). |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | Инициализирует новый экземпляр ImageSaveOptions с указанным форматом изображения. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | Инициализирует новый экземпляр ImageSaveOptions с указанным размером изображения. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | Инициализирует новый экземпляр ImageSaveOptions с указанным размером изображения и форматом изображения. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | Инициализирует новый экземпляр ImageSaveOptions с указанным форматом изображения и флагом suppressErrors. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | Инициализирует новый экземпляр ImageSaveOptions с указанным размером изображения и флагом suppressErrors. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | Инициализирует новый экземпляр ImageSaveOptions с указанным размером изображения, форматом изображения и флагом suppressErrors. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | Инициализировать новый экземпляр класса ImageSaveOptions со значениями по умолчанию для флага debug (false). |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Возвращает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Получает флаг, показывающий, необходимо ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [getExceptions()](#getExceptions--) | Возвращает список некритических ошибок. |
| [getImageFormat()](#getImageFormat--) | Получает формат изображения для результирующего изображения. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Возвращает значение, указывающее уровень сжатия изображения. |
| [getResolution()](#getResolution--) | Возвращает разрешение результирующего изображения. |
| [getSize()](#getSize--) | Получает размер страницы или изображения. |
| [getSmoothingMode()](#getSmoothingMode--) | Получает режим сглаживания. |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | Указывает, будет ли библиотека пытаться объединять фрагменты изображения. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Получает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [isSupressErrors()](#isSupressErrors--) | Возвращает значение, указывающее, будут ли ошибки подавляться во время конвертации. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Указывает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Указывает, следует ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Указывает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Указывает формат изображения для результирующего изображения. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Устанавливает значение, определяющее уровень сжатия изображения. |
| [setResolution(float resolution)](#setResolution-float-) | Указывает разрешение результирующего изображения. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Указывает размер страницы или изображения. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Устанавливает режим сглаживания. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования. |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | Указывает, должна ли библиотека пытаться соединять фрагменты изображения. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Инициализировать новый экземпляр класса ImageSaveOptions со значениями по умолчанию для флагов suppressErrors (true) и debug (false).

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


Инициализирует новый экземпляр ImageSaveOptions с указанным форматом изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат изображения. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


Инициализирует новый экземпляр ImageSaveOptions с указанным размером изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер изображения. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


Инициализирует новый экземпляр ImageSaveOptions с указанным размером изображения и форматом изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер изображения. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат изображения. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


Инициализирует новый экземпляр ImageSaveOptions с указанным форматом изображения и флагом suppressErrors.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат изображения. |
| supressErrors | boolean | Если true, преобразование будет продолжено несмотря на некритические ошибки. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


Инициализирует новый экземпляр ImageSaveOptions с указанным размером изображения и флагом suppressErrors.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер изображения. |
| supressErrors | boolean | Если true, преобразование будет продолжено несмотря на некритические ошибки. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


Инициализирует новый экземпляр ImageSaveOptions с указанным размером изображения, форматом изображения и флагом suppressErrors.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер изображения. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат изображения. |
| supressErrors | boolean | Если true, преобразование будет продолжено несмотря на некритические ошибки. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


Инициализировать новый экземпляр класса ImageSaveOptions со значениями по умолчанию для флага debug (false).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| supressErrors | boolean | Если true, преобразование будет продолжено несмотря на некритические ошибки. |

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
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Получает флаг, показывающий, необходимо ли сохранять шрифты, не являющиеся TrueType, в TTF.

**Returns:**
boolean — значение флага.
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


Получает формат изображения для результирующего изображения.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Возвращает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Returns:**
int - Значение, определяющее уровень сжатия изображения.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Возвращает разрешение результирующего изображения.

**Returns:**
float — Разрешение изображения.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Получает размер страницы или изображения.

**Returns:**
java.awt.Dimension — размер страницы или изображения.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Получает режим сглаживания.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


Указывает, будет ли библиотека пытаться соединять фрагменты изображения. Используется, когда изображение в исходном файле PS/EPS разбито на фрагменты. В этом случае без этого флага между фрагментами остаются тонкие зазоры.

**Returns:**
boolean — значение флага.
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

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Указывает, следует ли сохранять шрифты, не являющиеся TrueType, в TTF. Это значительно уменьшает объём получаемого документа при преобразовании PS в PDF и повышает скорость конвертации PS‑файлов с большим количеством текста в шрифтах, не являющихся TrueType, в любой формат вывода. Однако при преобразовании PostSctipt‑файла в изображение наблюдается небольшое вертикальное смещение текста.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | boolean | Значение флага. |

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


Указывает формат изображения для результирующего изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Формат выходного изображения. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Устанавливает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Значение, определяющее уровень сжатия изображения. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Указывает разрешение результирующего изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| разрешение | float | Разрешение изображения. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Указывает размер страницы или изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер страницы или изображения. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Устанавливает режим сглаживания.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | режим сглаживания для установки |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| supressErrors | boolean | Булево значение. |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


Указывает, должна ли библиотека пытаться соединять фрагменты изображения. Используется, когда изображение в исходном файле PS/EPS разбито на фрагменты. В этом случае без этого флага между фрагментами остаются тонкие зазоры.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| tryJoinImageFragments | boolean | значение флага. |

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


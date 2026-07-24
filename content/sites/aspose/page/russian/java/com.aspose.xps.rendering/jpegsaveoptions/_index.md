---
title: "JpegSaveOptions"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс параметров сохранения XPS-as-JPEG."
type: docs
weight: 12
url: /ru/java/com.aspose.xps.rendering/jpegsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class JpegSaveOptions extends ImageSaveOptions
```

Класс параметров сохранения XPS-as-JPEG.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [JpegSaveOptions()](#JpegSaveOptions--) | Создаёт новый экземпляр параметров. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Возвращает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [getBatchSize()](#getBatchSize--) | Возвращает размер части страниц, передаваемых от узла к узлу. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Возвращает коллекцию обработчиков событий, которые вносят изменения в страницу XPS непосредственно перед её сохранением. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Получает флаг, показывающий, необходимо ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [getExceptions()](#getExceptions--) | Возвращает список некритических ошибок. |
| [getImageSize()](#getImageSize--) | Получает размер выходных изображений в пикселях. |
| [getInterpolationMode()](#getInterpolationMode--) | Получает режим интерполяции. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Возвращает значение, указывающее уровень сжатия изображения. |
| [getPageNumbers()](#getPageNumbers--) | Получает массив номеров страниц для рендеринга. |
| [getResolution()](#getResolution--) | Получает разрешение изображения. |
| [getSize()](#getSize--) | Получает размер страницы или изображения. |
| [getSmoothingMode()](#getSmoothingMode--) | Получает режим сглаживания. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Получает подсказку по рендерингу текста. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Получает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [isSupressErrors()](#isSupressErrors--) | Возвращает значение, указывающее, будут ли ошибки подавляться во время конвертации. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Указывает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [setBatchSize(int value)](#setBatchSize-int-) | Устанавливает размер части страниц, передаваемых от узла к узлу. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Указывает, следует ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Указывает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Устанавливает размер выходных изображений в пикселях. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Устанавливает режим интерполяции. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Устанавливает значение, определяющее уровень сжатия изображения. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Устанавливает массив номеров страниц для рендеринга. |
| [setResolution(float value)](#setResolution-float-) | Устанавливает разрешение изображения. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Указывает размер страницы или изображения. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Устанавливает режим сглаживания. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Устанавливает подсказку по рендерингу текста. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### JpegSaveOptions() {#JpegSaveOptions--}
```
public JpegSaveOptions()
```


Создаёт новый экземпляр параметров.

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Возвращает размер части страниц, передаваемых от узла к узлу.

**Returns:**
int - Размер части страниц, передаваемых от узла к узлу.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Возвращает коллекцию обработчиков событий, которые вносят изменения в страницу XPS непосредственно перед её сохранением.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Получает размер выходных изображений в пикселях.

**Returns:**
java.awt.Dimension - Размер выходных изображений в пикселях.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Получает режим интерполяции.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Возвращает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Returns:**
int - Значение, определяющее уровень сжатия изображения.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Получает массив номеров страниц для рендеринга.

**Returns:**
int[] - Номера страниц.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Получает разрешение изображения.

**Returns:**
float - Разрешение изображения.
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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Получает подсказку по рендерингу текста.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Устанавливает размер части страниц, передаваемых от узла к узлу.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Размер части страниц, передаваемых от узла к узлу. |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Устанавливает размер выходных изображений в пикселях.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | java.awt.Dimension | Размер выходных изображений в пикселях. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Устанавливает режим интерполяции.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | Режим интерполяции. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Устанавливает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Значение, определяющее уровень сжатия изображения. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Устанавливает массив номеров страниц для рендеринга.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int[] | Количество страниц. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Устанавливает разрешение изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | float | Разрешение изображения. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Указывает размер страницы или изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер страницы или изображения. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Устанавливает режим сглаживания.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Режим сглаживания. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| supressErrors | boolean | Булево значение. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Устанавливает подсказку по рендерингу текста.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | Подсказка по рендерингу текста. |

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


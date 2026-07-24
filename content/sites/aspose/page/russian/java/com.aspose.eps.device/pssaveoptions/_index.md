---
title: "PsSaveOptions"
second_title: "Справочник API Aspose.Page для Java"
description: "Этот класс содержит параметры, необходимые для управления процессом конвертации."
type: docs
weight: 12
url: /ru/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

Этот класс содержит параметры, необходимые для управления процессом конвертации.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флагов suppressErrors (true) и debug (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флага debug (false). |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Возвращает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Получает флаг, показывающий, необходимо ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | Возвращает список некритических ошибок. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Возвращает значение, указывающее уровень сжатия изображения. |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | Получает размер страницы или изображения. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Получает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [isEmbedFonts()](#isEmbedFonts--) | Указывает, следует ли встраивать используемые шрифты в документ PS |
| [isSupressErrors()](#isSupressErrors--) | Возвращает значение, указывающее, будут ли ошибки подавляться во время конвертации. |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Указывает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Указывает, следует ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Указывает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | Указывает, следует ли встраивать используемые шрифты в документ PS |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | Укажите тип шрифта, в котором следует встраивать шрифты в документ PS |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Устанавливает значение, определяющее уровень сжатия изображения. |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | Укажите формат сохранения результирующего файла |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Указывает размер страницы или изображения. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования. |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флагов suppressErrors (true) и debug (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флага debug (false).

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
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - цвет фона
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
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - тип шрифта, в котором следует встраивать шрифты в документ PS
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Возвращает список некритических ошибок.

**Returns:**
java.util.List<java.lang.Exception> — список исключений
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Возвращает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Returns:**
int - Значение, определяющее уровень сжатия изображения.
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - поля страницы
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - размер страницы
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
### getSize() {#getSize--}
```
public Dimension getSize()
```


Получает размер страницы или изображения.

**Returns:**
java.awt.Dimension — размер страницы или изображения.
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
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


Указывает, следует ли встраивать используемые шрифты в документ PS

**Returns:**
boolean - значение флага embedFonts
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Возвращает значение, указывающее, будут ли ошибки подавляться во время конвертации.

**Returns:**
boolean — логическое значение
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - указывает, является ли фон прозрачным
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

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| backgroundColor | java.awt.Color | Указывает цвет фона |

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

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


Указывает, следует ли встраивать используемые шрифты в документ PS

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| embedFonts | boolean | флаг embedFonts |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


Укажите тип шрифта, в котором следует встраивать шрифты в документ PS

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| embedFontsAs | java.lang.String | Тип шрифта |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Устанавливает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Значение, определяющее уровень сжатия изображения. |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| поля | java.awt.Insets | Указывает поля страницы |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Указывает размер страницы |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


Укажите формат сохранения результирующего файла

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | Формат результирующего файла |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Указывает размер страницы или изображения.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер страницы или изображения. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| supressErrors | boolean | Булево значение. |

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| прозрачный | boolean | Указывает, является ли фон прозрачным |

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


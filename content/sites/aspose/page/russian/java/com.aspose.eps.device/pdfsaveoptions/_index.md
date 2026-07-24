---
title: "PdfSaveOptions"
second_title: "Справочник API Aspose.Page для Java"
description: "Этот класс содержит параметры, необходимые для управления процессом конвертации."
type: docs
weight: 11
url: /ru/java/com.aspose.eps.device/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PdfSaveOptions extends SaveOptions
```

Этот класс содержит параметры, необходимые для управления процессом конвертации.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флагов suppressErrors (true) и debug (false). |
| [PdfSaveOptions(boolean supressErrors)](#PdfSaveOptions-boolean-) | Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флага debug (false). |
| [PdfSaveOptions(Dimension size)](#PdfSaveOptions-java.awt.Dimension-) | Инициализировать новый экземпляр класса PdfSaveOptions с размером страницы. |
| [PdfSaveOptions(boolean supressErrors, Dimension size)](#PdfSaveOptions-boolean-java.awt.Dimension-) | Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флага debug (false) и размером страницы. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Возвращает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Получает флаг, показывающий, необходимо ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [getExceptions()](#getExceptions--) | Возвращает список некритических ошибок. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Возвращает значение, указывающее уровень сжатия изображения. |
| [getSize()](#getSize--) | Получает размер страницы или изображения. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Получает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [isSupressErrors()](#isSupressErrors--) | Возвращает значение, указывающее, будут ли ошибки подавляться во время конвертации. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Указывает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Указывает, следует ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Указывает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Устанавливает значение, определяющее уровень сжатия изображения. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Указывает размер страницы или изображения. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
```


Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флагов suppressErrors (true) и debug (false).

### PdfSaveOptions(boolean supressErrors) {#PdfSaveOptions-boolean-}
```
public PdfSaveOptions(boolean supressErrors)
```


Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флага debug (false).

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| supressErrors | boolean | Если true, преобразование будет продолжено несмотря на некритические ошибки. |

### PdfSaveOptions(Dimension size) {#PdfSaveOptions-java.awt.Dimension-}
```
public PdfSaveOptions(Dimension size)
```


Инициализировать новый экземпляр класса PdfSaveOptions с размером страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| размер | java.awt.Dimension | Размер страницы. |

### PdfSaveOptions(boolean supressErrors, Dimension size) {#PdfSaveOptions-boolean-java.awt.Dimension-}
```
public PdfSaveOptions(boolean supressErrors, Dimension size)
```


Инициализировать новый экземпляр класса PdfSaveOptions со значениями по умолчанию для флага debug (false) и размером страницы.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| supressErrors | boolean | Если true, преобразование будет продолжено несмотря на некритические ошибки. |
| размер | java.awt.Dimension | Размер страницы. |

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
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Возвращает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Returns:**
int - Значение, определяющее уровень сжатия изображения.
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

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Устанавливает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Значение, определяющее уровень сжатия изображения. |

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


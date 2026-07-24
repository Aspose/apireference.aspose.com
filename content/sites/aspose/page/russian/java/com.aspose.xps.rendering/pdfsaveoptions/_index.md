---
title: "PdfSaveOptions"
second_title: "Справочник API Aspose.Page для Java"
description: "Класс параметров сохранения XPS-as-PDF."
type: docs
weight: 14
url: /ru/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Класс параметров сохранения XPS-as-PDF.
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Создаёт новый экземпляр параметров. |
## Методы

| Метод | Описание |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Возвращает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [getBatchSize()](#getBatchSize--) | Возвращает размер части страниц, передаваемых от узла к узлу. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Возвращает коллекцию обработчиков событий, которые вносят изменения в страницу XPS непосредственно перед её сохранением. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Получает флаг, показывающий, необходимо ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Возвращает детали шифрования. |
| [getExceptions()](#getExceptions--) | Возвращает список некритических ошибок. |
| [getImageCompression()](#getImageCompression--) | Возвращает тип сжатия, используемый для всех изображений в документе. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Возвращает значение, указывающее уровень сжатия изображения. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Получает, до какого уровня следует раскрывать оглавление документа при открытии PDF-файла в просмотрщике. 1 — отображаются только элементы первого уровня, 2 — отображаются элементы первого и второго уровней и т.д. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Получает высоту дерева оглавления документа для сохранения. 0 — дерево оглавления не будет конвертировано, 1 — будут конвертированы только элементы первого уровня и т.д. |
| [getPageNumbers()](#getPageNumbers--) | Получает массив номеров страниц для рендеринга. |
| [getSize()](#getSize--) | Получает размер страницы или изображения. |
| [getTextCompression()](#getTextCompression--) | Возвращает тип сжатия, используемый для всех потоков содержимого, кроме изображений. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Получает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [isSupressErrors()](#isSupressErrors--) | Возвращает значение, указывающее, будут ли ошибки подавляться во время конвертации. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | В XPS некоторые текстовые элементы могут содержать ссылки на альтернативные формы глифов, которые не соответствуют ни одному коду символа в шрифте. |
| [preserveText(boolean value)](#preserveText-boolean-) | В XPS некоторые текстовые элементы могут содержать ссылки на альтернативные формы глифов, которые не соответствуют ни одному коду символа в шрифте. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Указывает дополнительные папки шрифтов, где конвертер должен искать шрифты для входного документа. |
| [setBatchSize(int value)](#setBatchSize-int-) | Устанавливает размер части страниц, передаваемых от узла к узлу. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Указывает, следует ли сохранять шрифты, не являющиеся TrueType, в TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Указывает флаг, позволяющий выводить предупреждения и сообщения во время конвертации. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Устанавливает детали шифрования. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Устанавливает тип сжатия, используемый для всех изображений в документе. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Устанавливает значение, определяющее уровень сжатия изображения. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Устанавливает, до какого уровня следует раскрывать оглавление документа при открытии PDF-файла в просмотрщике. 1 — отображаются только элементы первого уровня, 2 — отображаются элементы первого и второго уровней и т.д. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Устанавливает высоту дерева оглавления документа для сохранения. 0 — дерево оглавления не будет конвертировано, 1 — будут конвертированы только элементы первого уровня и т.д. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Устанавливает массив номеров страниц для рендеринга. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Указывает размер страницы или изображения. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Указывает флаг, который определяет, будут ли ошибки подавляться во время преобразования. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Устанавливает тип сжатия, используемый для всех потоков содержимого, кроме изображений. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - Коллекция обработчиков событий, выполняющих модификации страницы XPS непосредственно перед её сохранением.
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Возвращает детали шифрования. Если не задано, шифрование не будет выполнено.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Возвращает список некритических ошибок.

**Returns:**
java.util.List<java.lang.Exception> — список исключений
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Возвращает тип сжатия, используемый для всех изображений в документе. По умолчанию — PdfImageCompression.Auto.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Возвращает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Returns:**
int - Значение, определяющее уровень сжатия изображения.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Получает, до какого уровня следует раскрывать оглавление документа при открытии PDF-файла в просмотрщике. 1 — отображаются только элементы первого уровня, 2 — отображаются элементы первого и второго уровней и т.д.

**Returns:**
int — уровень раскрытия дерева оглавления.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Получает высоту дерева оглавления документа для сохранения. 0 — дерево оглавления не будет преобразовано, 1 — будут преобразованы только элементы первого уровня, и так далее. По умолчанию — 10.

**Returns:**
int — высота дерева оглавления.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Получает массив номеров страниц для рендеринга.

**Returns:**
int[] - Номера страниц.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Получает размер страницы или изображения.

**Returns:**
java.awt.Dimension — размер страницы или изображения.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Возвращает тип сжатия, используемый для всех потоков содержимого, кроме изображений. По умолчанию — PdfTextCompression.Flate.

**Returns:**
[PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) - The compression type.
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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


В XPS некоторые текстовые элементы могут содержать ссылки на альтернативные формы глифов, которые не соответствуют ни одному коду символа в шрифте. Если этот флаг установлен в true, текст из таких элементов XPS преобразуется в графические формы. Затем сам текст отображается прозрачным поверх них. Это делает текст таких элементов выделяемым. Но побочный эффект — выходной файл может стать значительно больше оригинала. Если флаг установлен в false, символы, которые должны отображаться как альтернативные формы, заменяются другими символами, которые сопоставляются с альтернативными глифами. Таким образом, текст, хотя и остаётся выделяемым, будет изменён и, скорее всего, станет нечитаемым.

**Returns:**
boolean — значение флага.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


В XPS некоторые текстовые элементы могут содержать ссылки на альтернативные формы глифов, которые не соответствуют ни одному коду символа в шрифте. Если этот флаг установлен в true, текст из таких элементов XPS преобразуется в графические формы. Затем сам текст отображается прозрачным поверх них. Это делает текст таких элементов выделяемым. Но побочный эффект — выходной файл может стать значительно больше оригинала. Если флаг установлен в false, символы, которые должны отображаться как альтернативные формы, заменяются другими символами, которые сопоставляются с альтернативными глифами. Таким образом, текст, хотя и остаётся выделяемым, будет изменён и, скорее всего, станет нечитаемым.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | boolean | Значение флага. |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Устанавливает параметры шифрования. Если не задано, шифрование не будет выполнено.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | Параметры шифрования. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Устанавливает тип сжатия, используемый для всех изображений в документе. По умолчанию — PdfImageCompression.Auto.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | Тип сжатия. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Устанавливает значение, определяющее уровень сжатия изображения. Доступные значения от 0 до 100. Чем меньше указанное число, тем выше степень сжатия и, следовательно, ниже качество изображения. Значение 0 приводит к изображению наихудшего качества, а 100 — к изображению наилучшего качества.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Значение, определяющее уровень сжатия изображения. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Устанавливает, до какого уровня следует раскрывать оглавление документа при открытии PDF-файла в просмотрщике. 1 — отображаются только элементы первого уровня, 2 — отображаются элементы первого и второго уровней и т.д.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Уровень раскрытия дерева оглавления. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Устанавливает высоту дерева оглавления документа для сохранения. 0 — дерево оглавления не будет конвертировано, 1 — будут конвертированы только элементы первого уровня и т.д.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int | Высота дерева оглавления. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Устанавливает массив номеров страниц для рендеринга.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int[] | Количество страниц. |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Устанавливает тип сжатия, используемый для всех потоков содержимого, кроме изображений. По умолчанию — PdfTextCompression.Flate.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | Тип сжатия. |

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


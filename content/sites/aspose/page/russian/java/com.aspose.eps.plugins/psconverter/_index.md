---
title: "PsConverter"
second_title: "Справочник API Aspose.Page для Java"
description: "Представляет плагин PsConverter."
type: docs
weight: 10
url: /ru/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Представляет плагин PsConverter.

Пример демонстрирует, как преобразовать файл PS/EPS в PDF‑документ.

// создать PsConverter PsConverter converter = new PsConverter(); // создать объект PsConverterToPdfOptions для установки типа выходных данных как файл PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // добавить путь входного файла opt.addDataSource(new FileDataSource(inputPath)); // установить путь выходного файла opt.addSaveDataSource(new FileDataSource(outputPath)); // запустить процесс конвертации ResultContainer results = converter.process(opt);

Пример демонстрирует, как преобразовать файл PS/EPS в изображение с выводом в файл.

// создать PsConverter PsConverter converter = new PsConverter(); // создать PsConverterToImageOptions с целевым форматом изображения JPEG. Формат изображения по умолчанию для получаемого изображения — PNG. // Также можно задать размер получаемого изображения, разрешение, режим сглаживания и уровень качества JPEG для формата JPEG. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // добавить путь входного файла opt.addDataSource(new FileDataSource(inputPath)); // если входной файл PS многостраничный, результаты будут набором файлов изображений с именем: [\"outputPath\" без расширения][номерСтраницы, начиная с 0].[расширение из \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // запустить процесс конвертации converter.process(opt);

Пример демонстрирует, как преобразовать файл PS/EPS в изображение с выводом в массивы байтов.

В источнике данных вывода массивов байтов (byte [][]) один массив байтов содержит изображение одной страницы. Таким образом, для одностраничных документов результат будет содержать массив [1][], а для многостраничных документов результат будет содержать массив [число страниц во входном документе PS][]. // создать PsConverter PsConverter converter = new PsConverter(); // создать PsConverterToImageOptions с целевым форматом изображения JPEG. Формат изображения по умолчанию для получаемого изображения — PNG. // Также можно задать размер получаемого изображения, разрешение, режим сглаживания и уровень качества JPEG для формата JPEG. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // добавить путь входного файла opt.addDataSource(new FileDataSource(inputPath)); // если входной файл PS многостраничный, результаты будут набором файлов изображений с именем: [\"outputPath\" без расширения][номерСтраницы, начиная с 0].[расширение из \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // запустить процесс конвертации converter.process(opt); // получить массивы полученных байтов byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Методы

| Метод | Описание |
| --- | --- |
| [dispose()](#dispose--) | Реализация IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Запускает обработку PsConverter с указанными параметрами. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverter() {#PsConverter--}
```
public PsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


Реализация IDisposable.

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




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


Запускает обработку PsConverter с указанными параметрами.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Объект параметров, содержащий инструкции для PsConverter. |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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


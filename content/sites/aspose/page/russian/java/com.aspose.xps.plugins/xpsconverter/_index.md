---
title: "XpsConverter"
second_title: "Справочник API Aspose.Page для Java"
description: "Представляет плагин XpsConverter."
type: docs
weight: 10
url: /ru/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

Представляет плагин XpsConverter.

В примере показано, как преобразовать документ XPS в документ PDF.

// создать XpsConverter XpsConverter converter = new XpsConverter(); // создать объект XpsConverterToPdfOptions для установки типа выходных данных как файл XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // добавить путь входного файла opt.addDataSource(new FileDataSource(inputPath)); // установить путь выходного файла opt.addSaveDataSource(new FileDataSource(outputPath)); // запустить процесс преобразования ResultContainer results = converter.process(opt);

В примере показано, как преобразовать документ XPS в изображение с выводом в файл.

// создать XpsConverter XpsConverter converter = new XpsConverter(); // создать XpsConverterToImageOptions с целевым форматом изображения JPEG. Формат изображения по умолчанию для получаемого изображения — PNG. // Также можно задать размер получаемого изображения, разрешение, режим сглаживания и уровень качества JPEG для формата JPEG. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // добавить путь входного файла opt.addDataSource(new FileDataSource(inputPath)); // если входной файл XPS многстраничный, результаты будут набором файлов изображений с именем: [\"outputPath\" без расширения][pageNumber, начиная с 0].[расширение из \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // запустить процесс преобразования converter.process(opt);

В примере показано, как преобразовать документ XPS в изображение с выводом в массивы байтов.

В источнике данных вывода массивов байтов (byte [][]) один массив байтов содержит изображение одной страницы. Таким образом, для одностраничных документов результат будет содержать массив [1][], для многостраничных документов результат будет содержать массив [число страниц во входном документе XPS][]. // создать XpsConverter XpsConverter converter = new XpsConverter(); // создать XpsConverterToImageOptions с целевым форматом изображения JPEG. Формат изображения по умолчанию для получаемого изображения — PNG. // Также можно задать размер получаемого изображения, разрешение, режим сглаживания и уровень качества JPEG для формата JPEG. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // добавить путь входного файла opt.addDataSource(new FileDataSource(inputPath)); // если входной файл XPS многстраничный, результаты будут набором файлов изображений с именем: [\"outputPath\" без расширения][pageNumber, начиная с 1].[расширение из \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // запустить процесс преобразования converter.process(opt); // получить массивы байтов результата byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Конструкторы

| Конструктор | Описание |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## Методы

| Метод | Описание |
| --- | --- |
| [dispose()](#dispose--) | Реализация IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Запускает обработку XpsConverter с указанными параметрами. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverter() {#XpsConverter--}
```
public XpsConverter()
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


Запускает обработку XpsConverter с указанными параметрами.

**Parameters:**
| Параметр | Тип | Описание |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Объект параметров, содержащий инструкции для XpsConverter. |

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


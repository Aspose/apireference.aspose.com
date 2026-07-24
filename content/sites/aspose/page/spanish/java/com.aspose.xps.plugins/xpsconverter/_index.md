---
title: "XpsConverter"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Representa el complemento XpsConverter."
type: docs
weight: 10
url: /es/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

Representa el complemento XpsConverter.

El ejemplo muestra cómo convertir un documento XPS a un documento PDF.

// crear XpsConverter XpsConverter converter = new XpsConverter(); // crear objeto XpsConverterToPdfOptions para establecer el tipo de datos de salida como archivo XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // agregar ruta del archivo de entrada opt.addDataSource(new FileDataSource(inputPath)); // establecer ruta del archivo de salida opt.addSaveDataSource(new FileDataSource(outputPath)); // iniciar proceso de conversión ResultContainer results = converter.process(opt);

El ejemplo muestra cómo convertir un documento XPS a una imagen con salida a archivo.

// crear XpsConverter XpsConverter converter = new XpsConverter(); // crear XpsConverterToImageOptions con formato de imagen objetivo JPEG. El formato de imagen predeterminado para la imagen resultante es PNG. // También podemos establecer un tamaño de la imagen resultante, una resolución, un modo de suavizado y el nivel de calidad JPEG para el formato de imagen JPEG resultante. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // agregar ruta del archivo de entrada opt.addDataSource(new FileDataSource(inputPath)); // si el archivo XPS de entrada tiene varias páginas, los resultados serán un conjunto de archivos de imagen con el nombre: [\"outputPath\" sin extensión][pageNumber iniciado desde 0].[extensión de \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // iniciar proceso de conversión converter.process(opt);

El ejemplo muestra cómo convertir un documento XPS a una imagen con salida de matrices de bytes.

En la fuente de datos de salida de matrices de bytes (byte[][]) una matriz de bytes contiene una imagen de una página. Por lo tanto, para documentos de una sola página el resultado contendrá una matriz [1][], y para documentos de varias páginas el resultado contendrá una matriz [número de páginas en el documento XPS de entrada][] . // crear XpsConverter XpsConverter converter = new XpsConverter(); // crear XpsConverterToImageOptions con formato de imagen objetivo JPEG. El formato de imagen predeterminado para la imagen resultante es PNG. // También podemos establecer un tamaño de la imagen resultante, una resolución, un modo de suavizado y el nivel de calidad JPEG para el formato de imagen JPEG resultante. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // agregar ruta del archivo de entrada opt.addDataSource(new FileDataSource(inputPath)); // si el archivo XPS de entrada tiene varias páginas, los resultados serán un conjunto de archivos de imagen con el nombre: [\"outputPath\" sin extensión][pageNumber iniciado desde 1].[extensión de \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // iniciar proceso de conversión converter.process(opt); // obtener matrices de bytes resultantes byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Constructores

| Constructor | Descripción |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## Métodos

| Método | Descripción |
| --- | --- |
| [dispose()](#dispose--) | Implementación de IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Inicia el procesamiento de XpsConverter con los parámetros especificados. |
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


Implementación de IDisposable.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
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


Inicia el procesamiento de XpsConverter con los parámetros especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Un objeto de opciones que contiene instrucciones para el XpsConverter. |

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
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


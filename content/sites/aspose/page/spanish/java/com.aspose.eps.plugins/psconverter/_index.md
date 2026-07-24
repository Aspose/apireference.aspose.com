---
title: "PsConverter"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Representa el plugin PsConverter."
type: docs
weight: 10
url: /es/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Representa el plugin PsConverter.

El ejemplo muestra cómo convertir un archivo PS/EPS a un documento PDF.

// crear PsConverter PsConverter converter = new PsConverter(); // crear objeto PsConverterToPdfOptions para establecer el tipo de datos de salida como archivo PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // agregar ruta del archivo de entrada opt.addDataSource(new FileDataSource(inputPath)); // establecer ruta del archivo de salida opt.addSaveDataSource(new FileDataSource(outputPath)); // iniciar proceso de conversión ResultContainer results = converter.process(opt);

El ejemplo muestra cómo convertir un archivo PS/EPS a una imagen con salida a archivo.

// crear PsConverter PsConverter converter = new PsConverter(); // crear PsConverterToImageOptions con formato de imagen JPEG objetivo. El formato de imagen predeterminado para la imagen resultante es PNG. // Además podemos establecer un tamaño de la imagen resultante, una resolución, un modo de suavizado y el nivel de calidad JPEG para el formato de imagen JPEG resultante. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // agregar ruta del archivo de entrada opt.addDataSource(new FileDataSource(inputPath)); // si el archivo PS de entrada tiene varias páginas, los resultados serán un conjunto de archivos de imagen con nombre: ["outputPath" sin extensión][número de página comenzando desde 0].[extensión de "outputPath"] opt.addSaveDataSource(new FileDataSource(outputPath)); // iniciar proceso de conversión converter.process(opt);

El ejemplo muestra cómo convertir un archivo PS/EPS a una imagen con salida de matrices de bytes.

En la fuente de datos de salida de matrices de bytes (byte [][]) una matriz de bytes contiene la imagen de una página. Por lo tanto, para documentos de una sola página el resultado contendrá una matriz [1][], y para documentos de varias páginas el resultado contendrá una matriz [número de páginas en el documento PS de entrada][]. // crear PsConverter PsConverter converter = new PsConverter(); // crear PsConverterToImageOptions con formato de imagen JPEG objetivo. El formato de imagen predeterminado para la imagen resultante es PNG. // Además podemos establecer un tamaño de la imagen resultante, una resolución, un modo de suavizado y el nivel de calidad JPEG para el formato de imagen JPEG resultante. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // agregar ruta del archivo de entrada opt.addDataSource(new FileDataSource(inputPath)); // si el archivo PS de entrada tiene varias páginas, los resultados serán un conjunto de archivos de imagen con nombre: ["outputPath" sin extensión][número de página comenzando desde 0].[extensión de "outputPath"] opt.addSaveDataSource(new ByteArrayDataSource()); // iniciar proceso de conversión converter.process(opt); // obtener matrices de bytes resultantes byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Métodos

| Método | Descripción |
| --- | --- |
| [dispose()](#dispose--) | Implementación de IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Inicia el procesamiento de PsConverter con los parámetros especificados. |
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


Inicia el procesamiento de PsConverter con los parámetros especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Un objeto de opciones que contiene instrucciones para PsConverter. |

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


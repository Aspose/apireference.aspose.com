---
title: "XpsConverterToImageOptions"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Representa opciones del convertidor de XPS a Imagen para el plugin."
type: docs
weight: 12
url: /es/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Representa opciones del convertidor de XPS a Imagen para el plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Constructores

| Constructor | Descripción |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions). |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con formato de imagen. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con un tamaño de la imagen resultante. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con formato de imagen. |
## Métodos

| Método | Descripción |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Agrega una nueva fuente de datos a la colección de datos del complemento XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Agrega una nueva fuente de datos a la colección de datos del complemento XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Devuelve la colección de datos del complemento XpsConverterOptions. |
| [getImageFormat()](#getImageFormat--) | Obtiene el formato de imagen. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Devuelve el valor que especifica el nivel de compresión de una imagen. |
| [getOperationName()](#getOperationName--) | Devuelve el nombre de la operación. |
| [getPageNumbers()](#getPageNumbers--) | Obtiene la matriz de números de páginas en el documento XPS a convertir. |
| [getResolution()](#getResolution--) | Obtiene la resolución de la imagen. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Obtiene la colección de objetivos añadidos para guardar los resultados de la operación. |
| [getSize()](#getSize--) | Obtiene el tamaño de la imagen resultante. |
| [getSmoothingMode()](#getSmoothingMode--) | Obtiene el modo de suavizado para renderizar la imagen. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Obtiene el formato de imagen. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Establece el valor que especifica el nivel de compresión de una imagen. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Establece la matriz de números de páginas en el documento XPS a convertir. |
| [setResolution(int resolution)](#setResolution-int-) | Establece la resolución de la imagen. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Establece el tamaño de la imagen resultante. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Establece el modo de suavizado para renderizar la imagen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions).

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con formato de imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato de la imagen resultante. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con un tamaño de la imagen resultante.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Un tamaño de la imagen resultante. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Inicializa una nueva instancia del objeto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con formato de imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato de la imagen resultante. |
| size | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Agrega una nueva fuente de datos a la colección de datos del complemento XpsConverter.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Fuente de datos a añadir. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Agrega una nueva fuente de datos a la colección de datos del complemento XpsConverterOptions.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Fuente de datos (archivo o flujo) para los resultados de la operación de guardado. |

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
### getDataCollection() {#getDataCollection--}
```
public final List<IDataSource> getDataCollection()
```


Devuelve la colección de datos del complemento XpsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Obtiene el formato de imagen.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Devuelve el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Returns:**
int - El valor que especifica el nivel de compresión de una imagen.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Devuelve el nombre de la operación.

**Returns:**
java.lang.String
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Obtiene la matriz de números de páginas en el documento XPS a convertir.

**Returns:**
int[] - Una matriz de números de páginas en el documento XPS.
### getResolution() {#getResolution--}
```
public int getResolution()
```


Obtiene la resolución de la imagen.

**Returns:**
int - Una resolución de imagen.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Obtiene la colección de objetivos añadidos para guardar los resultados de la operación.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtiene el tamaño de la imagen resultante.

**Returns:**
java.awt.Dimension - Un tamaño de imagen.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Obtiene el modo de suavizado para renderizar la imagen.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - A smoothing mode.
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




### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Obtiene el formato de imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato de la imagen resultante. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Establece el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | El valor que especifica el nivel de compresión de una imagen. |

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Establece la matriz de números de páginas en el documento XPS a convertir. Si no se establece, se convertirán todas las páginas.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pageNumbers | int[] | Una matriz de números de páginas en el documento XPS. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Establece la resolución de la imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| resolution | int | Una resolución de la imagen resultante. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Establece el tamaño de la imagen resultante.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Un tamaño de la imagen resultante. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Establece el modo de suavizado para renderizar la imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Un modo de suavizado. |

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


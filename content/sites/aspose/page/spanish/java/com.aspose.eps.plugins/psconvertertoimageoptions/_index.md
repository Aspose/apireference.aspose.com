---
title: "PsConverterToImageOptions"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Representa opciones del convertidor de PS/EPS a Imagen para el complemento."
type: docs
weight: 12
url: /es/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

Representa opciones del convertidor de PS/EPS a Imagen para el complemento [PsConverter](../../com.aspose.eps.plugins/psconverter).
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | Inicializa una nueva instancia del objeto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions). |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | Inicializa una nueva instancia del objeto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con formato de imagen. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | Inicializa una nueva instancia del objeto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con un tamaño de la imagen resultante. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Inicializa una nueva instancia del objeto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con formato de imagen. |
## Métodos

| Método | Descripción |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Agrega una nueva fuente de datos a la colección de datos del complemento PsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Agrega una nueva fuente de datos a la colección de datos del complemento PsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Devuelve carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Devuelve la colección de datos del complemento PsConverterOptions. |
| [getExceptions()](#getExceptions--) | Devuelve una lista de errores no críticos. |
| [getImageFormat()](#getImageFormat--) | Obtiene el formato de imagen. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Devuelve el valor que especifica el nivel de compresión de una imagen. |
| [getOperationName()](#getOperationName--) | Devuelve el nombre de la operación. |
| [getResolution()](#getResolution--) | Obtiene la resolución de la imagen. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Obtiene la colección de objetivos añadidos para guardar los resultados de la operación. |
| [getSize()](#getSize--) | Obtiene el tamaño de la imagen resultante. |
| [getSmoothingMode()](#getSmoothingMode--) | Obtiene el modo de suavizado para renderizar la imagen. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtiene la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [isSupressErrors()](#isSupressErrors--) | Devuelve un valor que indica si los errores serán suprimidos durante la conversión. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Especifica carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Especifica la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Obtiene el formato de imagen. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Establece el valor que especifica el nivel de compresión de una imagen. |
| [setResolution(int resolution)](#setResolution-int-) | Establece la resolución de la imagen. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Establece el tamaño de la imagen resultante. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Establece el modo de suavizado para renderizar la imagen. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Especifica la bandera que indica si los errores serán suprimidos durante la conversión. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


Inicializa una nueva instancia del objeto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions).

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


Inicializa una nueva instancia del objeto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con formato de imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato de la imagen resultante. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


Inicializa una nueva instancia del objeto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con un tamaño de la imagen resultante.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Un tamaño de la imagen resultante. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Inicializa una nueva instancia del objeto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con formato de imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato de la imagen resultante. |
| size | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Agrega una nueva fuente de datos a la colección de datos del complemento PsConverter.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Fuente de datos a añadir. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Agrega una nueva fuente de datos a la colección de datos del complemento PsConverterOptions.

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
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Devuelve carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. La carpeta predeterminada es la carpeta estándar de fuentes donde el SO encuentra fuentes para necesidades internas.

**Returns:**
java.lang.String[] - Una matriz de carpetas de fuentes.
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


Devuelve la colección de datos del complemento PsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Devuelve una lista de errores no críticos.

**Returns:**
java.util.List<java.lang.Exception> - Lista de excepciones
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
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - A smoothing mode.
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


Obtiene la bandera que permite la salida de advertencias y mensajes durante la conversión.

**Returns:**
boolean - valor de depuración.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Devuelve un valor que indica si los errores serán suprimidos durante la conversión.

**Returns:**
boolean - valor booleano
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


Especifica carpetas de fuentes adicionales donde el convertidor debe encontrar fuentes para el documento de entrada. La carpeta predeterminada es la carpeta estándar de fuentes donde el SO encuentra fuentes para necesidades internas.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Una matriz de carpetas de fuentes. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Especifica la bandera que permite la salida de advertencias y mensajes durante la conversión.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| debug | boolean | Valor booleano. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Establece el modo de suavizado para renderizar la imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Un modo de suavizado. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Especifica la bandera que indica si los errores serán suprimidos durante la conversión.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| supressErrors | boolean | Valor booleano. |

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


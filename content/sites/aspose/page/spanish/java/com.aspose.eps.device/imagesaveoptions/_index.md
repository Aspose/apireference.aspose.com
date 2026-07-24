---
title: "ImageSaveOptions"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Esta clase contiene opciones necesarias para gestionar el proceso de conversión."
type: docs
weight: 10
url: /es/java/com.aspose.eps.device/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class ImageSaveOptions extends SaveOptions
```

Esta clase contiene opciones necesarias para gestionar el proceso de conversión.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Inicializa una nueva instancia de la clase  ImageSaveOptions  con valores predeterminados para las banderas  suppressErrors  (true) y  debug  (false). |
| [ImageSaveOptions(ImageFormat imageFormat)](#ImageSaveOptions-com.aspose.page.ImageFormat-) | Inicializa una nueva instancia de  ImageSaveOptions  con el formato de imagen especificado. |
| [ImageSaveOptions(Dimension size)](#ImageSaveOptions-java.awt.Dimension-) | Inicializa una nueva instancia de  ImageSaveOptions  con el tamaño de la imagen especificado. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-) | Inicializa una nueva instancia de  ImageSaveOptions  con el tamaño de la imagen y el formato de imagen especificados. |
| [ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-) | Inicializa una nueva instancia de  ImageSaveOptions  con el formato de imagen especificado y la bandera suppressErrors. |
| [ImageSaveOptions(Dimension size, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-boolean-) | Inicializa una nueva instancia de  ImageSaveOptions  con el tamaño de la imagen especificado y la bandera suppressErrors. |
| [ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)](#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-) | Inicializa una nueva instancia de  ImageSaveOptions  con el tamaño de la imagen, el formato de imagen y la bandera suppressErrors especificados. |
| [ImageSaveOptions(boolean supressErrors)](#ImageSaveOptions-boolean-) | Inicializa una nueva instancia de la clase  ImageSaveOptions  con valores predeterminados para la bandera  debug  (false). |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Devuelve carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Obtiene la bandera que indica si es necesario guardar fuentes no TrueType en TTF. |
| [getExceptions()](#getExceptions--) | Devuelve una lista de errores no críticos. |
| [getImageFormat()](#getImageFormat--) | Obtiene un formato de imagen para la imagen resultante. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Devuelve el valor que especifica el nivel de compresión de una imagen. |
| [getResolution()](#getResolution--) | Devuelve la resolución de la imagen resultante. |
| [getSize()](#getSize--) | Obtiene un tamaño de la página o imagen. |
| [getSmoothingMode()](#getSmoothingMode--) | Obtiene el modo de suavizado. |
| [getTryJoinImageFragments()](#getTryJoinImageFragments--) | Indica si la biblioteca intentará unir fragmentos de imagen. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtiene la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [isSupressErrors()](#isSupressErrors--) | Devuelve un valor que indica si los errores serán suprimidos durante la conversión. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Especifica carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Especifica si se deben guardar fuentes no TrueType en TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Especifica la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Especifica un formato de imagen para la imagen resultante. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Establece el valor que especifica el nivel de compresión de una imagen. |
| [setResolution(float resolution)](#setResolution-float-) | Especifica la resolución de la imagen resultante. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Especifica un tamaño de la página o imagen. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Establece el modo de suavizado. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Especifica la bandera que indica si los errores serán suprimidos durante la conversión. |
| [setTryJoinImageFragments(boolean tryJoinImageFragments)](#setTryJoinImageFragments-boolean-) | Especifica si la biblioteca debe intentar unir fragmentos de imagen. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Inicializa una nueva instancia de la clase  ImageSaveOptions  con valores predeterminados para las banderas  suppressErrors  (true) y  debug  (false).

### ImageSaveOptions(ImageFormat imageFormat) {#ImageSaveOptions-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(ImageFormat imageFormat)
```


Inicializa una nueva instancia de  ImageSaveOptions  con el formato de imagen especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | El formato de la imagen. |

### ImageSaveOptions(Dimension size) {#ImageSaveOptions-java.awt.Dimension-}
```
public ImageSaveOptions(Dimension size)
```


Inicializa una nueva instancia de  ImageSaveOptions  con el tamaño de la imagen especificado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Tamaño de la imagen. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat)
```


Inicializa una nueva instancia de  ImageSaveOptions  con el tamaño de la imagen y el formato de imagen especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Tamaño de la imagen. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Formato de la imagen. |

### ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(ImageFormat imageFormat, boolean supressErrors)
```


Inicializa una nueva instancia de  ImageSaveOptions  con el formato de imagen especificado y la bandera suppressErrors.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Formato de la imagen. |
| supressErrors | boolean | Si es true, la conversión continuará a pesar de errores no críticos. |

### ImageSaveOptions(Dimension size, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-boolean-}
```
public ImageSaveOptions(Dimension size, boolean supressErrors)
```


Inicializa una nueva instancia de  ImageSaveOptions  con el tamaño de la imagen especificado y la bandera suppressErrors.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Tamaño de la imagen. |
| supressErrors | boolean | Si es true, la conversión continuará a pesar de errores no críticos. |

### ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors) {#ImageSaveOptions-java.awt.Dimension-com.aspose.page.ImageFormat-boolean-}
```
public ImageSaveOptions(Dimension size, ImageFormat imageFormat, boolean supressErrors)
```


Inicializa una nueva instancia de  ImageSaveOptions  con el tamaño de la imagen, el formato de imagen y la bandera suppressErrors especificados.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Tamaño de la imagen. |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Formato de la imagen. |
| supressErrors | boolean | Si es true, la conversión continuará a pesar de errores no críticos. |

### ImageSaveOptions(boolean supressErrors) {#ImageSaveOptions-boolean-}
```
public ImageSaveOptions(boolean supressErrors)
```


Inicializa una nueva instancia de la clase  ImageSaveOptions  con valores predeterminados para la bandera  debug  (false).

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| supressErrors | boolean | Si es true, la conversión continuará a pesar de errores no críticos. |

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
### getConvertFontsToTTF() {#getConvertFontsToTTF--}
```
public boolean getConvertFontsToTTF()
```


Obtiene la bandera que indica si es necesario guardar fuentes no TrueType en TTF.

**Returns:**
boolean - El valor de la bandera.
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


Obtiene un formato de imagen para la imagen resultante.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An output image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Devuelve el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Returns:**
int - El valor que especifica el nivel de compresión de una imagen.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Devuelve la resolución de la imagen resultante.

**Returns:**
float - La resolución de la imagen.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtiene un tamaño de la página o imagen.

**Returns:**
java.awt.Dimension - Un tamaño de la página o imagen.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Obtiene el modo de suavizado.

**Returns:**
[SmoothingMode](../../com.aspose.eps.device/smoothingmode) - the smoothingMode.
### getTryJoinImageFragments() {#getTryJoinImageFragments--}
```
public boolean getTryJoinImageFragments()
```


Indica si la biblioteca intentará unir fragmentos de imagen. Se usa cuando la imagen en un archivo PS/EPS de origen está cortada en fragmentos. En este caso, sin esta bandera, quedan pequeños espacios entre los fragmentos.

**Returns:**
boolean - el valor de la bandera.
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

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Especifica si se deben guardar fuentes no TrueType en TTF. Reduce significativamente el volumen del documento resultante en la conversión de PS a PDF y aumenta la velocidad de conversión de archivos PS con una gran cantidad de texto en fuentes no TrueType a cualquier formato de salida. Sin embargo, hay un pequeño desplazamiento vertical del texto al convertir un archivo PostScript a imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | boolean | El valor de la bandera. |

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


Especifica un formato de imagen para la imagen resultante.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato de imagen de salida. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Establece el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | El valor que especifica el nivel de compresión de una imagen. |

### setResolution(float resolution) {#setResolution-float-}
```
public void setResolution(float resolution)
```


Especifica la resolución de la imagen resultante.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| resolution | float | La resolución de la imagen. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Especifica un tamaño de la página o imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Tamaño de la página o imagen. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Establece el modo de suavizado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | el smoothingMode a establecer |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Especifica la bandera que indica si los errores serán suprimidos durante la conversión.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| supressErrors | boolean | Valor booleano. |

### setTryJoinImageFragments(boolean tryJoinImageFragments) {#setTryJoinImageFragments-boolean-}
```
public void setTryJoinImageFragments(boolean tryJoinImageFragments)
```


Especifica si la biblioteca debe intentar unir fragmentos de imagen. Se usa cuando la imagen en un archivo PS/EPS de origen está cortada en fragmentos. En este caso, sin esta bandera, quedan pequeños espacios entre los fragmentos.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| tryJoinImageFragments | boolean | el valor de la bandera. |

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


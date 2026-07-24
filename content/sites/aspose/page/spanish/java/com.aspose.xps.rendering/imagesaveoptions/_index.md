---
title: "ImageSaveOptions"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase básica para opciones de guardado XPS-as-image."
type: docs
weight: 11
url: /es/java/com.aspose.xps.rendering/imagesaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public abstract class ImageSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IPipelineOptions, IEventBasedModificationOptions
```

Clase básica para opciones de guardado XPS-as-image.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [ImageSaveOptions()](#ImageSaveOptions--) | Crea una nueva instancia de opciones. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Devuelve carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [getBatchSize()](#getBatchSize--) | Devuelve el tamaño de una porción de páginas para pasar de nodo a nodo. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Devuelve la colección de controladores de eventos que realizan modificaciones a una página XPS justo antes de guardarse. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Obtiene la bandera que indica si es necesario guardar fuentes no TrueType en TTF. |
| [getExceptions()](#getExceptions--) | Devuelve una lista de errores no críticos. |
| [getImageSize()](#getImageSize--) | Obtiene el tamaño de las imágenes de salida en píxeles. |
| [getInterpolationMode()](#getInterpolationMode--) | Obtiene el modo de interpolación. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Devuelve el valor que especifica el nivel de compresión de una imagen. |
| [getPageNumbers()](#getPageNumbers--) | Obtiene la matriz de números de páginas a renderizar. |
| [getResolution()](#getResolution--) | Obtiene la resolución de la imagen. |
| [getSize()](#getSize--) | Obtiene un tamaño de la página o imagen. |
| [getSmoothingMode()](#getSmoothingMode--) | Obtiene el modo de suavizado. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Obtiene la sugerencia de renderizado de texto. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtiene la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [isSupressErrors()](#isSupressErrors--) | Devuelve un valor que indica si los errores serán suprimidos durante la conversión. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Especifica carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [setBatchSize(int value)](#setBatchSize-int-) | Establece el tamaño de una porción de páginas para pasar de nodo a nodo. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Especifica si se deben guardar fuentes no TrueType en TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Especifica la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Establece el tamaño de las imágenes de salida en píxeles. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Establece el modo de interpolación. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Establece el valor que especifica el nivel de compresión de una imagen. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Establece la matriz de números de páginas a renderizar. |
| [setResolution(float value)](#setResolution-float-) | Establece la resolución de la imagen. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Especifica un tamaño de la página o imagen. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Establece el modo de suavizado. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Especifica la bandera que indica si los errores serán suprimidos durante la conversión. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Establece la sugerencia de renderizado de texto. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### ImageSaveOptions() {#ImageSaveOptions--}
```
public ImageSaveOptions()
```


Crea una nueva instancia de opciones.

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
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Devuelve el tamaño de una porción de páginas para pasar de nodo a nodo.

**Returns:**
int - El tamaño de una porción de páginas para pasar de nodo a nodo.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Devuelve la colección de controladores de eventos que realizan modificaciones a una página XPS justo antes de guardarse.

**Returns:**
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler>
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
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Obtiene el tamaño de las imágenes de salida en píxeles.

**Returns:**
java.awt.Dimension - El tamaño de las imágenes de salida en píxeles.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Obtiene el modo de interpolación.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Devuelve el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Returns:**
int - El valor que especifica el nivel de compresión de una imagen.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Obtiene la matriz de números de páginas a renderizar.

**Returns:**
int[] - Números de páginas.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Obtiene la resolución de la imagen.

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
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Obtiene la sugerencia de renderizado de texto.

**Returns:**
[TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) - The text rendering hint.
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

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Establece el tamaño de una porción de páginas para pasar de nodo a nodo.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | El tamaño de una porción de páginas para pasar de nodo a nodo. |

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

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Establece el tamaño de las imágenes de salida en píxeles.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | java.awt.Dimension | El tamaño de las imágenes de salida en píxeles. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Establece el modo de interpolación.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | El modo de interpolación. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Establece el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | El valor que especifica el nivel de compresión de una imagen. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Establece la matriz de números de páginas a renderizar.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int[] | Números de páginas. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Establece la resolución de la imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | float | La resolución de la imagen. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Especifica un tamaño de la página o imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Tamaño de la página o imagen. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Establece el modo de suavizado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | El modo de suavizado. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Especifica la bandera que indica si los errores serán suprimidos durante la conversión.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| supressErrors | boolean | Valor booleano. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Establece la sugerencia de renderizado de texto.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | La sugerencia de renderizado de texto. |

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


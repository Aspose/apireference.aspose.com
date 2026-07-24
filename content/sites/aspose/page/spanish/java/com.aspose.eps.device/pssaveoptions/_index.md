---
title: "PsSaveOptions"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Esta clase contiene opciones necesarias para gestionar el proceso de conversión."
type: docs
weight: 12
url: /es/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

Esta clase contiene opciones necesarias para gestionar el proceso de conversión.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | Inicializa una nueva instancia de la clase  PdfSaveOptions  con valores predeterminados para las banderas  suppressErrors  (true) y  debug  (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | Inicializa una nueva instancia de la clase  PdfSaveOptions  con valores predeterminados para la bandera  debug  (false). |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Devuelve carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Obtiene la bandera que indica si es necesario guardar fuentes no TrueType en TTF. |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | Devuelve una lista de errores no críticos. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Devuelve el valor que especifica el nivel de compresión de una imagen. |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | Obtiene un tamaño de la página o imagen. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtiene la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [isEmbedFonts()](#isEmbedFonts--) | Indica si se deben incrustar las fuentes usadas en el documento PS |
| [isSupressErrors()](#isSupressErrors--) | Devuelve un valor que indica si los errores serán suprimidos durante la conversión. |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Especifica carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Especifica si se deben guardar fuentes no TrueType en TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Especifica la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | Especifica si se deben incrustar las fuentes usadas en el documento PS |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | Especifique el tipo de fuente en la que incrustar las fuentes en el documento PS |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Establece el valor que especifica el nivel de compresión de una imagen. |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | Especifique el formato de guardado del archivo resultante |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Especifica un tamaño de la página o imagen. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Especifica la bandera que indica si los errores serán suprimidos durante la conversión. |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


Inicializa una nueva instancia de la clase  PdfSaveOptions  con valores predeterminados para las banderas  suppressErrors  (true) y  debug  (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


Inicializa una nueva instancia de la clase  PdfSaveOptions  con valores predeterminados para la bandera  debug  (false).

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
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - el color de fondo
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
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - un tipo de fuente en la que incrustar fuentes en un documento PS
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Devuelve una lista de errores no críticos.

**Returns:**
java.util.List<java.lang.Exception> - Lista de excepciones
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Devuelve el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Returns:**
int - El valor que especifica el nivel de compresión de una imagen.
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - los márgenes de la página
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - el tamaño de la página
### getSaveFormat() {#getSaveFormat--}
```
public PsSaveFormat getSaveFormat()
```




**Returns:**
[PsSaveFormat](../../com.aspose.eps.device/pssaveformat) - save format of resulting file
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtiene un tamaño de la página o imagen.

**Returns:**
java.awt.Dimension - Un tamaño de la página o imagen.
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
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


Indica si se deben incrustar las fuentes usadas en el documento PS

**Returns:**
boolean - valor de la bandera embedFonts
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Devuelve un valor que indica si los errores serán suprimidos durante la conversión.

**Returns:**
boolean - valor booleano
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - Indica si el fondo es transparente
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

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| backgroundColor | java.awt.Color | Especifica el color de fondo |

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

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


Especifica si se deben incrustar las fuentes usadas en el documento PS

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| embedFonts | boolean | bandera embedFonts |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


Especifique el tipo de fuente en la que incrustar las fuentes en el documento PS

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| embedFontsAs | java.lang.String | Tipo de fuente |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Establece el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | El valor que especifica el nivel de compresión de una imagen. |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| márgenes | java.awt.Insets | Especifica los márgenes de la página |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Especifica el tamaño de la página |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


Especifique el formato de guardado del archivo resultante

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | Formato del archivo resultante |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Especifica un tamaño de la página o imagen.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| size | java.awt.Dimension | Tamaño de la página o imagen. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Especifica la bandera que indica si los errores serán suprimidos durante la conversión.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| supressErrors | boolean | Valor booleano. |

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| transparente | boolean | Especifica si el fondo es transparente |

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


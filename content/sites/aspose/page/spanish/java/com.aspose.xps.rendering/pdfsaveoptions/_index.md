---
title: "PdfSaveOptions"
second_title: "Referencia de API de Aspose.Page para Java"
description: "Clase para opciones de guardado XPS-como-PDF."
type: docs
weight: 14
url: /es/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Clase para opciones de guardado XPS-como-PDF.
## Constructores

| Constructor | Descripción |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Crea una nueva instancia de opciones. |
## Métodos

| Método | Descripción |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Devuelve carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [getBatchSize()](#getBatchSize--) | Devuelve el tamaño de una porción de páginas para pasar de nodo a nodo. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Devuelve la colección de controladores de eventos que realizan modificaciones a una página XPS justo antes de guardarse. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Obtiene la bandera que indica si es necesario guardar fuentes no TrueType en TTF. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Devuelve los detalles del cifrado. |
| [getExceptions()](#getExceptions--) | Devuelve una lista de errores no críticos. |
| [getImageCompression()](#getImageCompression--) | Devuelve el tipo de compresión que se utilizará para todas las imágenes del documento. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Devuelve el valor que especifica el nivel de compresión de una imagen. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Obtiene hasta qué nivel debe expandirse el esquema del documento cuando el archivo PDF se abre en un visor. 1 - solo se muestran los elementos del esquema de primer nivel, 2 - solo se muestran los elementos de primer y segundo nivel, y así sucesivamente. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Obtiene la altura del árbol de esquema del documento a guardar. 0 - el árbol de esquema no se convertirá, 1 - solo se convertirán los elementos del primer nivel, y así sucesivamente. |
| [getPageNumbers()](#getPageNumbers--) | Obtiene la matriz de números de páginas a renderizar. |
| [getSize()](#getSize--) | Obtiene un tamaño de la página o imagen. |
| [getTextCompression()](#getTextCompression--) | Devuelve el tipo de compresión que se utilizará para todas las secuencias de contenido, excepto imágenes. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Obtiene la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [isSupressErrors()](#isSupressErrors--) | Devuelve un valor que indica si los errores serán suprimidos durante la conversión. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | En XPS, algunos elementos de texto pueden contener referencias a formas de glifo alternativas que no corresponden a ningún código de carácter en la fuente. |
| [preserveText(boolean value)](#preserveText-boolean-) | En XPS, algunos elementos de texto pueden contener referencias a formas de glifo alternativas que no corresponden a ningún código de carácter en la fuente. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Especifica carpetas de fuentes adicionales donde el convertidor debe buscar fuentes para el documento de entrada. |
| [setBatchSize(int value)](#setBatchSize-int-) | Establece el tamaño de una porción de páginas para pasar de nodo a nodo. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Especifica si se deben guardar fuentes no TrueType en TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Especifica la bandera que permite la salida de advertencias y mensajes durante la conversión. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Establece los detalles del cifrado. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Establece el tipo de compresión que se utilizará para todas las imágenes del documento. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Establece el valor que especifica el nivel de compresión de una imagen. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Establece hasta qué nivel debe expandirse el esquema del documento cuando el archivo PDF se abre en un visor. 1 - solo se muestran los elementos del esquema de primer nivel, 2 - solo se muestran los elementos de primer y segundo nivel, y así sucesivamente. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Establece la altura del árbol de esquema del documento a guardar. 0 - el árbol de esquema no se convertirá, 1 - solo se convertirán los elementos del primer nivel, y así sucesivamente. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Establece la matriz de números de páginas a renderizar. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Especifica un tamaño de la página o imagen. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Especifica la bandera que indica si los errores serán suprimidos durante la conversión. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Establece el tipo de compresión que se utilizará para todas las secuencias de contenido, excepto imágenes. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - La colección de controladores de eventos que realizan modificaciones a una página XPS justo antes de que se guarde.
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Devuelve los detalles del cifrado. Si no se establece, no se realizará ningún cifrado.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Devuelve una lista de errores no críticos.

**Returns:**
java.util.List<java.lang.Exception> - Lista de excepciones
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Devuelve el tipo de compresión que se utilizará para todas las imágenes del documento. El valor predeterminado es PdfImageCompression.Auto.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Devuelve el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Returns:**
int - El valor que especifica el nivel de compresión de una imagen.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Obtiene hasta qué nivel debe expandirse el esquema del documento cuando el archivo PDF se abre en un visor. 1 - solo se muestran los elementos del esquema de primer nivel, 2 - solo se muestran los elementos de primer y segundo nivel, y así sucesivamente.

**Returns:**
int - El nivel de expansión del árbol de esquema.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Obtiene la altura del árbol de esquema del documento a guardar. 0 - el árbol de esquema no se convertirá, 1 - solo se convertirán los elementos del primer nivel, y así sucesivamente. El valor predeterminado es 10.

**Returns:**
int - La altura del árbol de esquema.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Obtiene la matriz de números de páginas a renderizar.

**Returns:**
int[] - Números de páginas.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Obtiene un tamaño de la página o imagen.

**Returns:**
java.awt.Dimension - Un tamaño de la página o imagen.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Devuelve el tipo de compresión que se utilizará para todas las secuencias de contenido, excepto imágenes. El valor predeterminado es PdfTextCompression.Flate.

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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


En XPS, algunos elementos de texto pueden contener referencias a formas de glifo alternativas que no corresponden a ningún código de carácter en la fuente. Si esta bandera se establece en true, el texto de dichos elementos XPS se convierte en formas gráficas. Entonces el texto mismo aparece transparente encima. Esto deja el texto de dichos elementos seleccionable. Pero el efecto secundario es que el archivo de salida puede ser mucho más grande que el original. Si esta bandera se establece en false, los caracteres que deberían mostrarse como formas alternativas se reemplazan por otros caracteres que se asignan a las formas de glifo alternativas. Por lo tanto, el texto, aunque sigue siendo seleccionable, se modificará y probablemente será ilegible.

**Returns:**
boolean - El valor de la bandera.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


En XPS, algunos elementos de texto pueden contener referencias a formas de glifo alternativas que no corresponden a ningún código de carácter en la fuente. Si esta bandera se establece en true, el texto de dichos elementos XPS se convierte en formas gráficas. Entonces el texto mismo aparece transparente encima. Esto deja el texto de dichos elementos seleccionable. Pero el efecto secundario es que el archivo de salida puede ser mucho más grande que el original. Si esta bandera se establece en false, los caracteres que deberían mostrarse como formas alternativas se reemplazan por otros caracteres que se asignan a las formas de glifo alternativas. Por lo tanto, el texto, aunque sigue siendo seleccionable, se modificará y probablemente será ilegible.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | boolean | El valor de la bandera. |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Establece los detalles del cifrado. Si no se establece, no se realizará ningún cifrado.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | Los detalles del cifrado. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Establece el tipo de compresión que se utilizará para todas las imágenes del documento. El valor predeterminado es PdfImageCompression.Auto.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | El tipo de compresión. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Establece el valor que especifica el nivel de compresión de una imagen. Los valores disponibles son de 0 a 100. Cuanto menor sea el número especificado, mayor será la compresión y, por lo tanto, menor la calidad de la imagen. Un valor de 0 produce la imagen de menor calidad, mientras que 100 produce la de mayor calidad.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | El valor que especifica el nivel de compresión de una imagen. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Establece hasta qué nivel debe expandirse el esquema del documento cuando el archivo PDF se abre en un visor. 1 - solo se muestran los elementos del esquema de primer nivel, 2 - solo se muestran los elementos de primer y segundo nivel, y así sucesivamente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | El nivel de expansión del árbol de contorno. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Establece la altura del árbol de esquema del documento a guardar. 0 - el árbol de esquema no se convertirá, 1 - solo se convertirán los elementos del primer nivel, y así sucesivamente.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int | La altura del árbol de contorno. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Establece la matriz de números de páginas a renderizar.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | int[] | Números de páginas. |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Establece el tipo de compresión que se usará para todas las transmisiones de contenido, excepto imágenes. El valor predeterminado es PdfTextCompression.Flate.

**Parameters:**
| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | El tipo de compresión. |

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


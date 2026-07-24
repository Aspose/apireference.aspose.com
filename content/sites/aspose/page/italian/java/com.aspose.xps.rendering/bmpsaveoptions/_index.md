---
title: "BmpSaveOptions"
second_title: "Aspose.Page per Java API Reference"
description: "Classe per le opzioni di salvataggio XPS-as-BMP."
type: docs
weight: 10
url: /it/java/com.aspose.xps.rendering/bmpsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions), [com.aspose.xps.rendering.ImageSaveOptions](../../com.aspose.xps.rendering/imagesaveoptions)
```
public class BmpSaveOptions extends ImageSaveOptions
```

Classe per le opzioni di salvataggio XPS-as-BMP.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [BmpSaveOptions()](#BmpSaveOptions--) | Crea una nuova istanza di opzioni. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Restituisce le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. |
| [getBatchSize()](#getBatchSize--) | Restituisce la dimensione di una porzione di pagine da passare da nodo a nodo. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Restituisce la collezione di gestori di eventi che eseguono modifiche a una pagina XPS poco prima di essere salvata. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Ottiene il flag che indica se è necessario salvare i font non TrueType in TTF. |
| [getExceptions()](#getExceptions--) | Restituisce un elenco di errori non critici. |
| [getImageSize()](#getImageSize--) | Ottiene la dimensione delle immagini di output in pixel. |
| [getInterpolationMode()](#getInterpolationMode--) | Ottiene la modalità di interpolazione. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Restituisce il valore che specifica il livello di compressione per un'immagine. |
| [getPageNumbers()](#getPageNumbers--) | Ottiene l'array dei numeri di pagine da renderizzare. |
| [getResolution()](#getResolution--) | Ottiene la risoluzione dell'immagine. |
| [getSize()](#getSize--) | Ottiene una dimensione della pagina o dell'immagine. |
| [getSmoothingMode()](#getSmoothingMode--) | Ottiene la modalità di smoothing. |
| [getTextRenderingHint()](#getTextRenderingHint--) | Ottiene il suggerimento di rendering del testo. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Ottiene il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [isSupressErrors()](#isSupressErrors--) | Restituisce un valore che indica se gli errori saranno soppressi durante la conversione. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifica le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. |
| [setBatchSize(int value)](#setBatchSize-int-) | Imposta la dimensione di una porzione di pagine da passare da nodo a nodo. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Specifica se salvare i font non TrueType in TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifica il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [setImageSize(Dimension value)](#setImageSize-java.awt.Dimension-) | Imposta la dimensione delle immagini di output in pixel. |
| [setInterpolationMode(InterpolationMode value)](#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-) | Imposta la modalità di interpolazione. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Imposta il valore che specifica il livello di compressione per un\'immagine. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Imposta l'array dei numeri di pagine da renderizzare. |
| [setResolution(float value)](#setResolution-float-) | Imposta la risoluzione dell\'immagine. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifica una dimensione della pagina o dell'immagine. |
| [setSmoothingMode(SmoothingMode value)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Imposta la modalità di smoothing. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifica il flag che indica se gli errori saranno soppressi durante la conversione. |
| [setTextRenderingHint(TextRenderingHint value)](#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-) | Imposta il suggerimento di rendering del testo. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### BmpSaveOptions() {#BmpSaveOptions--}
```
public BmpSaveOptions()
```


Crea una nuova istanza di opzioni.

### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getAdditionalFontsFolders() {#getAdditionalFontsFolders--}
```
public String[] getAdditionalFontsFolders()
```


Restituisce le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. La cartella predefinita è la cartella standard dei font dove il sistema operativo trova i font per esigenze interne.

**Returns:**
java.lang.String[] - Un array di cartelle dei font.
### getBatchSize() {#getBatchSize--}
```
public int getBatchSize()
```


Restituisce la dimensione di una porzione di pagine da passare da nodo a nodo.

**Returns:**
int - La dimensione di una porzione di pagine da passare da nodo a nodo.
### getBeforePageSavingEventHandlers() {#getBeforePageSavingEventHandlers--}
```
public List<EventBasedModifications.BeforePageSavingEventHandler> getBeforePageSavingEventHandlers()
```


Restituisce la collezione di gestori di eventi che eseguono modifiche a una pagina XPS poco prima di essere salvata.

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


Ottiene il flag che indica se è necessario salvare i font non TrueType in TTF.

**Returns:**
boolean - Il valore del flag.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Restituisce un elenco di errori non critici.

**Returns:**
java.util.List<java.lang.Exception> - Elenco delle eccezioni
### getImageSize() {#getImageSize--}
```
public Dimension getImageSize()
```


Ottiene la dimensione delle immagini di output in pixel.

**Returns:**
java.awt.Dimension - La dimensione delle immagini di output in pixel.
### getInterpolationMode() {#getInterpolationMode--}
```
public InterpolationMode getInterpolationMode()
```


Ottiene la modalità di interpolazione.

**Returns:**
[InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) - The interpolation mode.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Restituisce il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Returns:**
int - Il valore che specifica il livello di compressione per un\'immagine.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Ottiene l'array dei numeri di pagine da renderizzare.

**Returns:**
int[] - Numeri di pagine.
### getResolution() {#getResolution--}
```
public float getResolution()
```


Ottiene la risoluzione dell'immagine.

**Returns:**
float - La risoluzione dell'immagine.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Ottiene una dimensione della pagina o dell'immagine.

**Returns:**
java.awt.Dimension - Una dimensione della pagina o dell'immagine.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Ottiene la modalità di smoothing.

**Returns:**
[SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) - The smoothing mode.
### getTextRenderingHint() {#getTextRenderingHint--}
```
public TextRenderingHint getTextRenderingHint()
```


Ottiene il suggerimento di rendering del testo.

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


Ottiene il flag che consente l'emissione di avvisi e messaggi durante la conversione.

**Returns:**
boolean - valore di debug.
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Restituisce un valore che indica se gli errori saranno soppressi durante la conversione.

**Returns:**
boolean - valore booleano
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


Specifica le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. La cartella predefinita è la cartella standard dei font dove il sistema operativo trova i font per esigenze interne.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| fontsFolders | java.lang.String[] | Un array di cartelle dei font. |

### setBatchSize(int value) {#setBatchSize-int-}
```
public void setBatchSize(int value)
```


Imposta la dimensione di una porzione di pagine da passare da nodo a nodo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | La dimensione di una porzione di pagine da trasferire da nodo a nodo. |

### setConvertFontsToTTF(boolean value) {#setConvertFontsToTTF-boolean-}
```
public void setConvertFontsToTTF(boolean value)
```


Specifica se salvare i font non TrueType in TTF. Riduce significativamente il volume del documento risultante nella conversione da PS a PDF e aumenta la velocità di conversione dei file PS con una grande quantità di testo in font non TrueType in qualsiasi formato di output. Tuttavia c'è un piccolo spostamento verticale del testo durante la conversione di un file PostSctipt in immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | boolean | Il valore del flag. |

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Specifica il flag che consente l'emissione di avvisi e messaggi durante la conversione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| debug | boolean | Valore booleano. |

### setImageSize(Dimension value) {#setImageSize-java.awt.Dimension-}
```
public void setImageSize(Dimension value)
```


Imposta la dimensione delle immagini di output in pixel.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | java.awt.Dimension | La dimensione delle immagini di output in pixel. |

### setInterpolationMode(InterpolationMode value) {#setInterpolationMode-com.aspose.xps.rendering.InterpolationMode-}
```
public void setInterpolationMode(InterpolationMode value)
```


Imposta la modalità di interpolazione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [InterpolationMode](../../com.aspose.xps.rendering/interpolationmode) | La modalità di interpolazione. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Imposta il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Il valore che specifica il livello di compressione per un\'immagine. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Imposta l'array dei numeri di pagine da renderizzare.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int[] | Numero di pagine. |

### setResolution(float value) {#setResolution-float-}
```
public void setResolution(float value)
```


Imposta la risoluzione dell\'immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | float | La risoluzione dell'immagine. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specifica una dimensione della pagina o dell'immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dimensione | java.awt.Dimension | Dimensione della pagina o dell'immagine. |

### setSmoothingMode(SmoothingMode value) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode value)
```


Imposta la modalità di smoothing.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | La modalità di smussatura. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specifica il flag che indica se gli errori saranno soppressi durante la conversione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| supressErrors | boolean | Valore booleano. |

### setTextRenderingHint(TextRenderingHint value) {#setTextRenderingHint-com.aspose.xps.rendering.TextRenderingHint-}
```
public void setTextRenderingHint(TextRenderingHint value)
```


Imposta il suggerimento di rendering del testo.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [TextRenderingHint](../../com.aspose.xps.rendering/textrenderinghint) | Il suggerimento di rendering del testo. |

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
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


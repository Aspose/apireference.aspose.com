---
title: "PsSaveOptions"
second_title: "Aspose.Page per Java API Reference"
description: "Questa classe contiene le opzioni necessarie per gestire il processo di conversione."
type: docs
weight: 12
url: /it/java/com.aspose.eps.device/pssaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)
```
public class PsSaveOptions extends SaveOptions
```

Questa classe contiene le opzioni necessarie per gestire il processo di conversione.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [PsSaveOptions()](#PsSaveOptions--) | Inizializza una nuova istanza della classe PdfSaveOptions con i valori predefiniti per i flag suppressErrors (true) e debug (false). |
| [PsSaveOptions(boolean supressErrors)](#PsSaveOptions-boolean-) | Inizializza una nuova istanza della classe PdfSaveOptions con i valori predefiniti per il flag debug (false). |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Restituisce le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. |
| [getBackgroundColor()](#getBackgroundColor--) |  |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Ottiene il flag che indica se è necessario salvare i font non TrueType in TTF. |
| [getEmbedFontsAs()](#getEmbedFontsAs--) |  |
| [getExceptions()](#getExceptions--) | Restituisce un elenco di errori non critici. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Restituisce il valore che specifica il livello di compressione per un'immagine. |
| [getMargins()](#getMargins--) |  |
| [getPageSize()](#getPageSize--) |  |
| [getSaveFormat()](#getSaveFormat--) |  |
| [getSize()](#getSize--) | Ottiene una dimensione della pagina o dell'immagine. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Ottiene il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [isEmbedFonts()](#isEmbedFonts--) | Indica se incorporare i font utilizzati nel documento PS |
| [isSupressErrors()](#isSupressErrors--) | Restituisce un valore che indica se gli errori saranno soppressi durante la conversione. |
| [isTransparent()](#isTransparent--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifica le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. |
| [setBackgroundColor(Color backgroundColor)](#setBackgroundColor-java.awt.Color-) |  |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Specifica se salvare i font non TrueType in TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifica il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [setEmbedFonts(boolean embedFonts)](#setEmbedFonts-boolean-) | Specifica se incorporare i font utilizzati nel documento PS |
| [setEmbedFontsAs(String embedFontsAs)](#setEmbedFontsAs-java.lang.String-) | Specifica il tipo di font in cui incorporare i font nel documento PS |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Imposta il valore che specifica il livello di compressione per un\'immagine. |
| [setMargins(Insets margins)](#setMargins-java.awt.Insets-) |  |
| [setPageSize(Dimension pageSize)](#setPageSize-java.awt.Dimension-) |  |
| [setSaveFormat(PsSaveFormat saveFormat)](#setSaveFormat-com.aspose.eps.device.PsSaveFormat-) | Specifica il formato di salvataggio del file risultante |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifica una dimensione della pagina o dell'immagine. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifica il flag che indica se gli errori saranno soppressi durante la conversione. |
| [setTransparent(boolean transparent)](#setTransparent-boolean-) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsSaveOptions() {#PsSaveOptions--}
```
public PsSaveOptions()
```


Inizializza una nuova istanza della classe PdfSaveOptions con i valori predefiniti per i flag suppressErrors (true) e debug (false).

### PsSaveOptions(boolean supressErrors) {#PsSaveOptions-boolean-}
```
public PsSaveOptions(boolean supressErrors)
```


Inizializza una nuova istanza della classe PdfSaveOptions con i valori predefiniti per il flag debug (false).

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| supressErrors | boolean | Se true la conversione continuerà nonostante gli errori non critici. |

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
### getBackgroundColor() {#getBackgroundColor--}
```
public Color getBackgroundColor()
```




**Returns:**
java.awt.Color - il colore di sfondo
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
### getEmbedFontsAs() {#getEmbedFontsAs--}
```
public String getEmbedFontsAs()
```




**Returns:**
java.lang.String - un tipo di font in cui incorporare i font nel documento PS
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Restituisce un elenco di errori non critici.

**Returns:**
java.util.List<java.lang.Exception> - Elenco delle eccezioni
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Restituisce il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Returns:**
int - Il valore che specifica il livello di compressione per un\'immagine.
### getMargins() {#getMargins--}
```
public Insets getMargins()
```




**Returns:**
java.awt.Insets - i margini della pagina
### getPageSize() {#getPageSize--}
```
public Dimension getPageSize()
```




**Returns:**
java.awt.Dimension - le dimensioni della pagina
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


Ottiene una dimensione della pagina o dell'immagine.

**Returns:**
java.awt.Dimension - Una dimensione della pagina o dell'immagine.
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
### isEmbedFonts() {#isEmbedFonts--}
```
public boolean isEmbedFonts()
```


Indica se incorporare i font utilizzati nel documento PS

**Returns:**
boolean - valore del flag embedFonts
### isSupressErrors() {#isSupressErrors--}
```
public boolean isSupressErrors()
```


Restituisce un valore che indica se gli errori saranno soppressi durante la conversione.

**Returns:**
boolean - valore booleano
### isTransparent() {#isTransparent--}
```
public boolean isTransparent()
```




**Returns:**
boolean - Indica se lo sfondo è trasparente
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

### setBackgroundColor(Color backgroundColor) {#setBackgroundColor-java.awt.Color-}
```
public void setBackgroundColor(Color backgroundColor)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| backgroundColor | java.awt.Color | Specifica il colore di sfondo |

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

### setEmbedFonts(boolean embedFonts) {#setEmbedFonts-boolean-}
```
public void setEmbedFonts(boolean embedFonts)
```


Specifica se incorporare i font utilizzati nel documento PS

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| embedFonts | boolean | embedFonts flag |

### setEmbedFontsAs(String embedFontsAs) {#setEmbedFontsAs-java.lang.String-}
```
public void setEmbedFontsAs(String embedFontsAs)
```


Specifica il tipo di font in cui incorporare i font nel documento PS

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| embedFontsAs | java.lang.String | Tipo di font |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Imposta il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Il valore che specifica il livello di compressione per un\'immagine. |

### setMargins(Insets margins) {#setMargins-java.awt.Insets-}
```
public void setMargins(Insets margins)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| margini | java.awt.Insets | Specifica i margini della pagina |

### setPageSize(Dimension pageSize) {#setPageSize-java.awt.Dimension-}
```
public void setPageSize(Dimension pageSize)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pageSize | java.awt.Dimension | Specifica le dimensioni della pagina |

### setSaveFormat(PsSaveFormat saveFormat) {#setSaveFormat-com.aspose.eps.device.PsSaveFormat-}
```
public void setSaveFormat(PsSaveFormat saveFormat)
```


Specifica il formato di salvataggio del file risultante

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| saveFormat | [PsSaveFormat](../../com.aspose.eps.device/pssaveformat) | Formato del file risultante |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Specifica una dimensione della pagina o dell'immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dimensione | java.awt.Dimension | Dimensione della pagina o dell'immagine. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specifica il flag che indica se gli errori saranno soppressi durante la conversione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| supressErrors | boolean | Valore booleano. |

### setTransparent(boolean transparent) {#setTransparent-boolean-}
```
public void setTransparent(boolean transparent)
```




**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| trasparente | boolean | Specifica se lo sfondo è trasparente |

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


---
title: "PdfSaveOptions"
second_title: "Aspose.Page per Java API Reference"
description: "Classe per le opzioni di salvataggio XPS-as-PDF."
type: docs
weight: 14
url: /it/java/com.aspose.xps.rendering/pdfsaveoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.page.SaveOptions](../../com.aspose.page/saveoptions)

**All Implemented Interfaces:**
[com.aspose.page.IMultiPageSaveOptions](../../com.aspose.page/imultipagesaveoptions), [com.aspose.xps.rendering.IXpsTextConversionOptions](../../com.aspose.xps.rendering/ixpstextconversionoptions), [com.aspose.xps.rendering.IPipelineOptions](../../com.aspose.xps.rendering/ipipelineoptions), [com.aspose.xps.rendering.IEventBasedModificationOptions](../../com.aspose.xps.rendering/ieventbasedmodificationoptions)
```
public class PdfSaveOptions extends SaveOptions implements IMultiPageSaveOptions, IXpsTextConversionOptions, IPipelineOptions, IEventBasedModificationOptions
```

Classe per le opzioni di salvataggio XPS-as-PDF.
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [PdfSaveOptions()](#PdfSaveOptions--) | Crea una nuova istanza di opzioni. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Restituisce le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. |
| [getBatchSize()](#getBatchSize--) | Restituisce la dimensione di una porzione di pagine da passare da nodo a nodo. |
| [getBeforePageSavingEventHandlers()](#getBeforePageSavingEventHandlers--) | Restituisce la collezione di gestori di eventi che eseguono modifiche a una pagina XPS poco prima di essere salvata. |
| [getClass()](#getClass--) |  |
| [getConvertFontsToTTF()](#getConvertFontsToTTF--) | Ottiene il flag che indica se è necessario salvare i font non TrueType in TTF. |
| [getEncryptionDetails()](#getEncryptionDetails--) | Restituisce i dettagli della crittografia. |
| [getExceptions()](#getExceptions--) | Restituisce un elenco di errori non critici. |
| [getImageCompression()](#getImageCompression--) | Restituisce il tipo di compressione da utilizzare per tutte le immagini nel documento. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Restituisce il valore che specifica il livello di compressione per un'immagine. |
| [getOutlineTreeExpansionLevel()](#getOutlineTreeExpansionLevel--) | Ottiene fino a quale livello l'indice del documento dovrebbe essere espanso quando il file PDF viene aperto in un visualizzatore. 1 - vengono mostrati solo gli elementi di indice di primo livello, 2 - vengono mostrati solo gli elementi di indice di primo e secondo livello, e così via. |
| [getOutlineTreeHeight()](#getOutlineTreeHeight--) | Ottiene l'altezza dell'albero dell'indice del documento da salvare. 0 - l'albero dell'indice non verrà convertito, 1 - verranno convertiti solo gli elementi di indice di primo livello, e così via. |
| [getPageNumbers()](#getPageNumbers--) | Ottiene l'array dei numeri di pagine da renderizzare. |
| [getSize()](#getSize--) | Ottiene una dimensione della pagina o dell'immagine. |
| [getTextCompression()](#getTextCompression--) | Restituisce il tipo di compressione da utilizzare per tutti i flussi di contenuto, eccetto le immagini. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Ottiene il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [isSupressErrors()](#isSupressErrors--) | Restituisce un valore che indica se gli errori saranno soppressi durante la conversione. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [preserveText()](#preserveText--) | In XPS, alcuni elementi di testo possono contenere riferimenti a forme di glifo alternative che non corrispondono a nessun codice carattere nel font. |
| [preserveText(boolean value)](#preserveText-boolean-) | In XPS, alcuni elementi di testo possono contenere riferimenti a forme di glifo alternative che non corrispondono a nessun codice carattere nel font. |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifica le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. |
| [setBatchSize(int value)](#setBatchSize-int-) | Imposta la dimensione di una porzione di pagine da passare da nodo a nodo. |
| [setConvertFontsToTTF(boolean value)](#setConvertFontsToTTF-boolean-) | Specifica se salvare i font non TrueType in TTF. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifica il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [setEncryptionDetails(PdfEncryptionDetails value)](#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-) | Imposta i dettagli della crittografia. |
| [setImageCompression(PdfImageCompression value)](#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-) | Imposta il tipo di compressione da utilizzare per tutte le immagini nel documento. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Imposta il valore che specifica il livello di compressione per un\'immagine. |
| [setOutlineTreeExpansionLevel(int value)](#setOutlineTreeExpansionLevel-int-) | Imposta fino a quale livello l'indice del documento dovrebbe essere espanso quando il file PDF viene aperto in un visualizzatore. 1 - vengono mostrati solo gli elementi di indice di primo livello, 2 - vengono mostrati solo gli elementi di indice di primo e secondo livello, e così via. |
| [setOutlineTreeHeight(int value)](#setOutlineTreeHeight-int-) | Imposta l'altezza dell'albero dell'indice del documento da salvare. 0 - l'albero dell'indice non verrà convertito, 1 - verranno convertiti solo gli elementi di indice di primo livello, e così via. |
| [setPageNumbers(int[] value)](#setPageNumbers-int---) | Imposta l'array dei numeri di pagine da renderizzare. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Specifica una dimensione della pagina o dell'immagine. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifica il flag che indica se gli errori saranno soppressi durante la conversione. |
| [setTextCompression(PdfTextCompression value)](#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-) | Imposta il tipo di compressione da utilizzare per tutti i flussi di contenuto, eccetto le immagini. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PdfSaveOptions() {#PdfSaveOptions--}
```
public PdfSaveOptions()
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
java.util.List<com.aspose.xps.features.EventBasedModifications.BeforePageSavingEventHandler> - La collezione di gestori di eventi che esegue modifiche a una pagina XPS subito prima che venga salvata.
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
### getEncryptionDetails() {#getEncryptionDetails--}
```
public PdfEncryptionDetails getEncryptionDetails()
```


Restituisce i dettagli della crittografia. Se non impostato, non verrà eseguita alcuna crittografia.

**Returns:**
[PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) - The encryption details.
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Restituisce un elenco di errori non critici.

**Returns:**
java.util.List<java.lang.Exception> - Elenco delle eccezioni
### getImageCompression() {#getImageCompression--}
```
public PdfImageCompression getImageCompression()
```


Restituisce il tipo di compressione da utilizzare per tutte le immagini nel documento. L'impostazione predefinita è PdfImageCompression.Auto.

**Returns:**
[PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) - The compression type.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Restituisce il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Returns:**
int - Il valore che specifica il livello di compressione per un\'immagine.
### getOutlineTreeExpansionLevel() {#getOutlineTreeExpansionLevel--}
```
public int getOutlineTreeExpansionLevel()
```


Ottiene fino a quale livello l'indice del documento dovrebbe essere espanso quando il file PDF viene aperto in un visualizzatore. 1 - vengono mostrati solo gli elementi di indice di primo livello, 2 - vengono mostrati solo gli elementi di indice di primo e secondo livello, e così via.

**Returns:**
int - Il livello di espansione dell'albero di contorno.
### getOutlineTreeHeight() {#getOutlineTreeHeight--}
```
public int getOutlineTreeHeight()
```


Ottiene l'altezza dell'albero di contorno del documento da salvare. 0 - l'albero di contorno non verrà convertito, 1 - verranno convertiti solo gli elementi di contorno di primo livello, e così via. L'impostazione predefinita è 10.

**Returns:**
int - L'altezza dell'albero di contorno.
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Ottiene l'array dei numeri di pagine da renderizzare.

**Returns:**
int[] - Numeri di pagine.
### getSize() {#getSize--}
```
public Dimension getSize()
```


Ottiene una dimensione della pagina o dell'immagine.

**Returns:**
java.awt.Dimension - Una dimensione della pagina o dell'immagine.
### getTextCompression() {#getTextCompression--}
```
public PdfTextCompression getTextCompression()
```


Restituisce il tipo di compressione da utilizzare per tutti i flussi di contenuto, eccetto le immagini. L'impostazione predefinita è PdfTextCompression.Flate.

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




### preserveText() {#preserveText--}
```
public boolean preserveText()
```


In XPS, alcuni elementi di testo possono contenere riferimenti a forme di glifo alternative che non corrispondono a nessun codice carattere nel font. Se questo flag è impostato su true, il testo di tali elementi XPS viene convertito in forme grafiche. Quindi il testo stesso appare trasparente sopra. Questo rende il testo di tali elementi selezionabile. Tuttavia l'effetto collaterale è che il file di output può diventare molto più grande dell'originale. Se questo flag è impostato su false, i caratteri che dovrebbero essere visualizzati come forme alternative vengono sostituiti con altri caratteri che vengono mappati alle forme di glifo alternative. Pertanto il testo, sebbene rimanga selezionabile, verrà modificato e probabilmente diventerà illeggibile.

**Returns:**
boolean - Il valore del flag.
### preserveText(boolean value) {#preserveText-boolean-}
```
public void preserveText(boolean value)
```


In XPS, alcuni elementi di testo possono contenere riferimenti a forme di glifo alternative che non corrispondono a nessun codice carattere nel font. Se questo flag è impostato su true, il testo di tali elementi XPS viene convertito in forme grafiche. Quindi il testo stesso appare trasparente sopra. Questo rende il testo di tali elementi selezionabile. Tuttavia l'effetto collaterale è che il file di output può diventare molto più grande dell'originale. Se questo flag è impostato su false, i caratteri che dovrebbero essere visualizzati come forme alternative vengono sostituiti con altri caratteri che vengono mappati alle forme di glifo alternative. Pertanto il testo, sebbene rimanga selezionabile, verrà modificato e probabilmente diventerà illeggibile.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | boolean | Il valore del flag. |

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

### setEncryptionDetails(PdfEncryptionDetails value) {#setEncryptionDetails-com.aspose.xps.rendering.PdfEncryptionDetails-}
```
public void setEncryptionDetails(PdfEncryptionDetails value)
```


Imposta i dettagli della crittografia. Se non impostato, non verrà eseguita alcuna crittografia.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [PdfEncryptionDetails](../../com.aspose.xps.rendering/pdfencryptiondetails) | I dettagli della crittografia. |

### setImageCompression(PdfImageCompression value) {#setImageCompression-com.aspose.xps.rendering.PdfImageCompression-}
```
public void setImageCompression(PdfImageCompression value)
```


Imposta il tipo di compressione da utilizzare per tutte le immagini nel documento. L'impostazione predefinita è PdfImageCompression.Auto.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [PdfImageCompression](../../com.aspose.xps.rendering/pdfimagecompression) | Il tipo di compressione. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Imposta il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Il valore che specifica il livello di compressione per un\'immagine. |

### setOutlineTreeExpansionLevel(int value) {#setOutlineTreeExpansionLevel-int-}
```
public void setOutlineTreeExpansionLevel(int value)
```


Imposta fino a quale livello l'indice del documento dovrebbe essere espanso quando il file PDF viene aperto in un visualizzatore. 1 - vengono mostrati solo gli elementi di indice di primo livello, 2 - vengono mostrati solo gli elementi di indice di primo e secondo livello, e così via.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Il livello di espansione dell'albero di contorno. |

### setOutlineTreeHeight(int value) {#setOutlineTreeHeight-int-}
```
public void setOutlineTreeHeight(int value)
```


Imposta l'altezza dell'albero dell'indice del documento da salvare. 0 - l'albero dell'indice non verrà convertito, 1 - verranno convertiti solo gli elementi di indice di primo livello, e così via.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | L'altezza dell'albero di contorno. |

### setPageNumbers(int[] value) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] value)
```


Imposta l'array dei numeri di pagine da renderizzare.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int[] | Numero di pagine. |

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

### setTextCompression(PdfTextCompression value) {#setTextCompression-com.aspose.xps.rendering.PdfTextCompression-}
```
public void setTextCompression(PdfTextCompression value)
```


Imposta il tipo di compressione da utilizzare per tutti i flussi di contenuto, eccetto le immagini. L'impostazione predefinita è PdfTextCompression.Flate.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| value | [PdfTextCompression](../../com.aspose.xps.rendering/pdftextcompression) | Il tipo di compressione. |

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


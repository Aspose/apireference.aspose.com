---
title: "PsConverterToImageOptions"
second_title: "Aspose.Page per Java API Reference"
description: "Rappresenta le opzioni del convertitore da PS/EPS a immagine per il plugin."
type: docs
weight: 12
url: /it/java/com.aspose.eps.plugins/psconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.eps.plugins.PsConverterOptions](../../com.aspose.eps.plugins/psconverteroptions)
```
public class PsConverterToImageOptions extends PsConverterOptions
```

Rappresenta le opzioni del convertitore da PS/EPS a immagine per il plugin [PsConverter](../../com.aspose.eps.plugins/psconverter).
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [PsConverterToImageOptions()](#PsConverterToImageOptions--) | Inizializza una nuova istanza dell'oggetto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions). |
| [PsConverterToImageOptions(ImageFormat imageFormat)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-) | Inizializza una nuova istanza dell'oggetto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con il formato immagine. |
| [PsConverterToImageOptions(Dimension size)](#PsConverterToImageOptions-java.awt.Dimension-) | Inizializza una nuova istanza dell'oggetto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con una dimensione dell'immagine risultante. |
| [PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Inizializza una nuova istanza dell'oggetto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con il formato immagine. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Aggiunge una nuova origine dati alla raccolta dati del plugin PsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Aggiunge una nuova origine dati alla raccolta dati del plugin PsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getAdditionalFontsFolders()](#getAdditionalFontsFolders--) | Restituisce le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Restituisce la raccolta dati del plugin PsConverterOptions. |
| [getExceptions()](#getExceptions--) | Restituisce un elenco di errori non critici. |
| [getImageFormat()](#getImageFormat--) | Ottiene il formato immagine. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Restituisce il valore che specifica il livello di compressione per un'immagine. |
| [getOperationName()](#getOperationName--) | Restituisce il nome dell'operazione. |
| [getResolution()](#getResolution--) | Ottiene la risoluzione dell'immagine. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Ottiene la collezione di destinazioni aggiunte per salvare i risultati dell\'operazione. |
| [getSize()](#getSize--) | Ottiene le dimensioni dell\'immagine risultante. |
| [getSmoothingMode()](#getSmoothingMode--) | Ottiene la modalità di smoothing per il rendering dell\'immagine. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Ottiene il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [isSupressErrors()](#isSupressErrors--) | Restituisce un valore che indica se gli errori saranno soppressi durante la conversione. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifica le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifica il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Ottiene il formato immagine. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Imposta il valore che specifica il livello di compressione per un\'immagine. |
| [setResolution(int resolution)](#setResolution-int-) | Imposta la risoluzione dell\'immagine. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Imposta le dimensioni dell\'immagine risultante. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.eps.device.SmoothingMode-) | Imposta la modalità di smoothing per il rendering dell\'immagine. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifica il flag che indica se gli errori saranno soppressi durante la conversione. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverterToImageOptions() {#PsConverterToImageOptions--}
```
public PsConverterToImageOptions()
```


Inizializza una nuova istanza dell'oggetto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions).

### PsConverterToImageOptions(ImageFormat imageFormat) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public PsConverterToImageOptions(ImageFormat imageFormat)
```


Inizializza una nuova istanza dell'oggetto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con il formato immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato dell\'immagine risultante. |

### PsConverterToImageOptions(Dimension size) {#PsConverterToImageOptions-java.awt.Dimension-}
```
public PsConverterToImageOptions(Dimension size)
```


Inizializza una nuova istanza dell'oggetto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con una dimensione dell'immagine risultante.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dimensione | java.awt.Dimension | Una dimensione dell\'immagine risultante. |

### PsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#PsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public PsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Inizializza una nuova istanza dell'oggetto [PsConverterToImageOptions](../../com.aspose.eps.plugins/psconvertertoimageoptions) con il formato immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato dell\'immagine risultante. |
| dimensione | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Aggiunge una nuova origine dati alla raccolta dati del plugin PsConverter.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Origine dati da aggiungere. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Aggiunge una nuova origine dati alla raccolta dati del plugin PsConverterOptions.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| saveDataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Origine dati (file o stream) per salvare i risultati dell\'operazione. |

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


Restituisce la raccolta dati del plugin PsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getExceptions() {#getExceptions--}
```
public List<Exception> getExceptions()
```


Restituisce un elenco di errori non critici.

**Returns:**
java.util.List<java.lang.Exception> - Elenco delle eccezioni
### getImageFormat() {#getImageFormat--}
```
public ImageFormat getImageFormat()
```


Ottiene il formato immagine.

**Returns:**
[ImageFormat](../../com.aspose.page/imageformat) - An image format.
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Restituisce il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Returns:**
int - Il valore che specifica il livello di compressione per un\'immagine.
### getOperationName() {#getOperationName--}
```
public final String getOperationName()
```


Restituisce il nome dell'operazione.

**Returns:**
java.lang.String
### getResolution() {#getResolution--}
```
public int getResolution()
```


Ottiene la risoluzione dell'immagine.

**Returns:**
int - Una risoluzione dell\'immagine.
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Ottiene la collezione di destinazioni aggiunte per salvare i risultati dell\'operazione.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
### getSize() {#getSize--}
```
public Dimension getSize()
```


Ottiene le dimensioni dell\'immagine risultante.

**Returns:**
java.awt.Dimension - Una dimensione dell\'immagine.
### getSmoothingMode() {#getSmoothingMode--}
```
public SmoothingMode getSmoothingMode()
```


Ottiene la modalità di smoothing per il rendering dell\'immagine.

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

### setDebug(boolean debug) {#setDebug-boolean-}
```
public void setDebug(boolean debug)
```


Specifica il flag che consente l'emissione di avvisi e messaggi durante la conversione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| debug | boolean | Valore booleano. |

### setImageFormat(ImageFormat imageFormat) {#setImageFormat-com.aspose.page.ImageFormat-}
```
public void setImageFormat(ImageFormat imageFormat)
```


Ottiene il formato immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato dell\'immagine risultante. |

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Imposta il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Il valore che specifica il livello di compressione per un\'immagine. |

### setResolution(int resolution) {#setResolution-int-}
```
public void setResolution(int resolution)
```


Imposta la risoluzione dell\'immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| risoluzione | int | Una risoluzione dell'immagine risultante. |

### setSize(Dimension size) {#setSize-java.awt.Dimension-}
```
public void setSize(Dimension size)
```


Imposta le dimensioni dell\'immagine risultante.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dimensione | java.awt.Dimension | Una dimensione dell'immagine risultante. |

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.eps.device.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Imposta la modalità di smoothing per il rendering dell\'immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.eps.device/smoothingmode) | Una modalità di smussatura. |

### setSupressErrors(boolean supressErrors) {#setSupressErrors-boolean-}
```
public void setSupressErrors(boolean supressErrors)
```


Specifica il flag che indica se gli errori saranno soppressi durante la conversione.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| supressErrors | boolean | Valore booleano. |

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


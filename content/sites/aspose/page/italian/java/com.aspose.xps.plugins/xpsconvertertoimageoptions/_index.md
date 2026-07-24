---
title: "XpsConverterToImageOptions"
second_title: "Aspose.Page per Java API Reference"
description: "Rappresenta le opzioni del convertitore da XPS a Immagine per il plugin."
type: docs
weight: 12
url: /it/java/com.aspose.xps.plugins/xpsconvertertoimageoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToImageOptions extends XpsConverterOptions
```

Rappresenta le opzioni del convertitore da XPS a Immagine per il plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [XpsConverterToImageOptions()](#XpsConverterToImageOptions--) | Inizializza una nuova istanza dell'oggetto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions). |
| [XpsConverterToImageOptions(ImageFormat imageFormat)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-) | Inizializza una nuova istanza dell'oggetto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con il formato immagine. |
| [XpsConverterToImageOptions(Dimension size)](#XpsConverterToImageOptions-java.awt.Dimension-) | Inizializza una nuova istanza dell'oggetto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con una dimensione dell'immagine risultante. |
| [XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)](#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-) | Inizializza una nuova istanza dell'oggetto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con il formato immagine. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Aggiunge una nuova origine dati alla raccolta dati del plugin XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Aggiunge una nuova origine dati alla raccolta dati del plugin XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Restituisce la raccolta dati del plugin XpsConverterOptions. |
| [getImageFormat()](#getImageFormat--) | Ottiene il formato immagine. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Restituisce il valore che specifica il livello di compressione per un'immagine. |
| [getOperationName()](#getOperationName--) | Restituisce il nome dell'operazione. |
| [getPageNumbers()](#getPageNumbers--) | Ottiene l'array dei numeri di pagine nel documento XPS da convertire. |
| [getResolution()](#getResolution--) | Ottiene la risoluzione dell'immagine. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Ottiene la collezione di destinazioni aggiunte per salvare i risultati dell\'operazione. |
| [getSize()](#getSize--) | Ottiene le dimensioni dell\'immagine risultante. |
| [getSmoothingMode()](#getSmoothingMode--) | Ottiene la modalità di smoothing per il rendering dell\'immagine. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setImageFormat(ImageFormat imageFormat)](#setImageFormat-com.aspose.page.ImageFormat-) | Ottiene il formato immagine. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Imposta il valore che specifica il livello di compressione per un\'immagine. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Imposta l\'array dei numeri di pagine nel documento XPS da convertire. |
| [setResolution(int resolution)](#setResolution-int-) | Imposta la risoluzione dell\'immagine. |
| [setSize(Dimension size)](#setSize-java.awt.Dimension-) | Imposta le dimensioni dell\'immagine risultante. |
| [setSmoothingMode(SmoothingMode smoothingMode)](#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-) | Imposta la modalità di smoothing per il rendering dell\'immagine. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToImageOptions() {#XpsConverterToImageOptions--}
```
public XpsConverterToImageOptions()
```


Inizializza una nuova istanza dell'oggetto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions).

### XpsConverterToImageOptions(ImageFormat imageFormat) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat)
```


Inizializza una nuova istanza dell'oggetto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con il formato immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato dell\'immagine risultante. |

### XpsConverterToImageOptions(Dimension size) {#XpsConverterToImageOptions-java.awt.Dimension-}
```
public XpsConverterToImageOptions(Dimension size)
```


Inizializza una nuova istanza dell'oggetto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con una dimensione dell'immagine risultante.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dimensione | java.awt.Dimension | Una dimensione dell\'immagine risultante. |

### XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size) {#XpsConverterToImageOptions-com.aspose.page.ImageFormat-java.awt.Dimension-}
```
public XpsConverterToImageOptions(ImageFormat imageFormat, Dimension size)
```


Inizializza una nuova istanza dell'oggetto [XpsConverterToImageOptions](../../com.aspose.xps.plugins/xpsconvertertoimageoptions) con il formato immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| imageFormat | [ImageFormat](../../com.aspose.page/imageformat) | Un formato dell\'immagine risultante. |
| dimensione | java.awt.Dimension |  |

### addDataSource(IDataSource dataSource) {#addDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addDataSource(IDataSource dataSource)
```


Aggiunge una nuova origine dati alla raccolta dati del plugin XpsConverter.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dataSource | [IDataSource](../../com.aspose.page.plugins/idatasource) | Origine dati da aggiungere. |

### addSaveDataSource(IDataSource saveDataSource) {#addSaveDataSource-com.aspose.page.plugins.IDataSource-}
```
public final void addSaveDataSource(IDataSource saveDataSource)
```


Aggiunge una nuova origine dati alla raccolta dati del plugin XpsConverterOptions.

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


Restituisce la raccolta dati del plugin XpsConverterOptions.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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
### getPageNumbers() {#getPageNumbers--}
```
public int[] getPageNumbers()
```


Ottiene l'array dei numeri di pagine nel documento XPS da convertire.

**Returns:**
int[] - Un array dei numeri di pagine nel documento XPS.
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

### setPageNumbers(int[] pageNumbers) {#setPageNumbers-int---}
```
public void setPageNumbers(int[] pageNumbers)
```


Imposta l\'array dei numeri di pagine nel documento XPS da convertire. Se non impostato, tutte le pagine saranno convertite.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| pageNumbers | int[] | Un array di numeri di pagine nel documento XPS. |

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

### setSmoothingMode(SmoothingMode smoothingMode) {#setSmoothingMode-com.aspose.xps.rendering.SmoothingMode-}
```
public void setSmoothingMode(SmoothingMode smoothingMode)
```


Imposta la modalità di smoothing per il rendering dell\'immagine.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| smoothingMode | [SmoothingMode](../../com.aspose.xps.rendering/smoothingmode) | Una modalità di smussatura. |

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


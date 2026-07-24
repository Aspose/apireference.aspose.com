---
title: "XpsConverterToPdfOptions"
second_title: "Aspose.Page per Java API Reference"
description: "Rappresenta le opzioni del convertitore da XPS a PDF per il plugin."
type: docs
weight: 13
url: /it/java/com.aspose.xps.plugins/xpsconvertertopdfoptions/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.plugins.XpsConverterOptions](../../com.aspose.xps.plugins/xpsconverteroptions)
```
public class XpsConverterToPdfOptions extends XpsConverterOptions
```

Rappresenta le opzioni del convertitore da XPS a PDF per il plugin [XpsConverter](../../com.aspose.xps.plugins/xpsconverter).
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [XpsConverterToPdfOptions()](#XpsConverterToPdfOptions--) | Inizializza una nuova istanza dell'oggetto [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions). |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [addDataSource(IDataSource dataSource)](#addDataSource-com.aspose.page.plugins.IDataSource-) | Aggiunge una nuova origine dati alla raccolta dati del plugin XpsConverter. |
| [addSaveDataSource(IDataSource saveDataSource)](#addSaveDataSource-com.aspose.page.plugins.IDataSource-) | Aggiunge una nuova origine dati alla raccolta dati del plugin XpsConverterOptions. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getDataCollection()](#getDataCollection--) | Restituisce la raccolta dati del plugin XpsConverterOptions. |
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Restituisce il valore che specifica il livello di compressione per un'immagine. |
| [getOperationName()](#getOperationName--) | Restituisce il nome dell'operazione. |
| [getPageNumbers()](#getPageNumbers--) | Ottiene l'array dei numeri di pagine nel documento XPS da convertire. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Ottiene la collezione di destinazioni aggiunte per salvare i risultati dell\'operazione. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Imposta il valore che specifica il livello di compressione per un\'immagine. |
| [setPageNumbers(int[] pageNumbers)](#setPageNumbers-int---) | Imposta l\'array dei numeri di pagine nel documento XPS da convertire. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverterToPdfOptions() {#XpsConverterToPdfOptions--}
```
public XpsConverterToPdfOptions()
```


Inizializza una nuova istanza dell'oggetto [XpsConverterToPdfOptions](../../com.aspose.xps.plugins/xpsconvertertopdfoptions).

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
### getSaveTargetsCollection() {#getSaveTargetsCollection--}
```
public final List<IDataSource> getSaveTargetsCollection()
```


Ottiene la collezione di destinazioni aggiunte per salvare i risultati dell\'operazione.

**Returns:**
java.util.List<com.aspose.page.plugins.IDataSource>
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


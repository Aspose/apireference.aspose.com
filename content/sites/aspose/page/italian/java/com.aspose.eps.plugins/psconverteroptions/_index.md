---
title: "PsConverterOptions"
second_title: "Aspose.Page per Java API Reference"
description: "Rappresenta la classe base delle opzioni per il plugin."
type: docs
weight: 11
url: /it/java/com.aspose.eps.plugins/psconverteroptions/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPluginOptions](../../com.aspose.page.plugins/ipluginoptions), [com.aspose.page.plugins.IDataContainer](../../com.aspose.page.plugins/idatacontainer), [com.aspose.page.plugins.ISaveInstruction](../../com.aspose.page.plugins/isaveinstruction)
```
public class PsConverterOptions implements IPluginOptions, IDataContainer, ISaveInstruction
```

Rappresenta la classe base delle opzioni per il plugin [PsConverter](../../com.aspose.eps.plugins/psconverter).
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
| [getJpegQualityLevel()](#getJpegQualityLevel--) | Restituisce il valore che specifica il livello di compressione per un'immagine. |
| [getOperationName()](#getOperationName--) | Restituisce il nome dell'operazione. |
| [getSaveTargetsCollection()](#getSaveTargetsCollection--) | Ottiene la collezione di destinazioni aggiunte per salvare i risultati dell\'operazione. |
| [hashCode()](#hashCode--) |  |
| [isDebug()](#isDebug--) | Ottiene il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [isSupressErrors()](#isSupressErrors--) | Restituisce un valore che indica se gli errori saranno soppressi durante la conversione. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [setAdditionalFontsFolders(String[] fontsFolders)](#setAdditionalFontsFolders-java.lang.String---) | Specifica le cartelle dei font aggiuntive dove il convertitore dovrebbe trovare i font per il documento di input. |
| [setDebug(boolean debug)](#setDebug-boolean-) | Specifica il flag che consente l'emissione di avvisi e messaggi durante la conversione. |
| [setJpegQualityLevel(int value)](#setJpegQualityLevel-int-) | Imposta il valore che specifica il livello di compressione per un\'immagine. |
| [setSupressErrors(boolean supressErrors)](#setSupressErrors-boolean-) | Specifica il flag che indica se gli errori saranno soppressi durante la conversione. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
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
### getJpegQualityLevel() {#getJpegQualityLevel--}
```
public int getJpegQualityLevel()
```


Restituisce il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Returns:**
int - Il valore che specifica il livello di compressione per un\'immagine.
### getOperationName() {#getOperationName--}
```
public String getOperationName()
```


Restituisce il nome dell'operazione.

**Returns:**
java.lang.String
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

### setJpegQualityLevel(int value) {#setJpegQualityLevel-int-}
```
public void setJpegQualityLevel(int value)
```


Imposta il valore che specifica il livello di compressione per un\'immagine. I valori disponibili sono da 0 a 100. Più basso è il numero specificato, maggiore è la compressione e quindi più bassa è la qualità dell\'immagine. Un valore 0 produce l\'immagine di qualità più bassa, mentre 100 produce la più alta.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | int | Il valore che specifica il livello di compressione per un\'immagine. |

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


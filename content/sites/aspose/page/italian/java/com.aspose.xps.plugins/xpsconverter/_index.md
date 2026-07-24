---
title: "XpsConverter"
second_title: "Aspose.Page per Java API Reference"
description: "Rappresenta il plugin XpsConverter."
type: docs
weight: 10
url: /it/java/com.aspose.xps.plugins/xpsconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class XpsConverter implements IPlugin
```

Rappresenta il plugin XpsConverter.

L'esempio dimostra come convertire un documento XPS in un documento PDF.

// crea XpsConverter XpsConverter converter = new XpsConverter(); // crea l'oggetto XpsConverterToPdfOptions per impostare il tipo di dati di output come file XpsConverterToPdfOptions opt = new XpsConverterToPdfOptions(); // aggiungi il percorso del file di input opt.addDataSource(new FileDataSource(inputPath)); // imposta il percorso del file di output opt.addSaveDataSource(new FileDataSource(outputPath)); // avvia il processo di conversione ResultContainer results = converter.process(opt);

L'esempio dimostra come convertire un documento XPS in un'immagine con output su file.

// crea XpsConverter XpsConverter converter = new XpsConverter(); // crea XpsConverterToImageOptions con formato immagine JPEG di destinazione. Il formato immagine predefinito per l'immagine risultante è PNG. // Inoltre possiamo impostare una dimensione dell'immagine risultante, una risoluzione, una modalità di smoothing e il livello di qualità JPEG per il formato immagine JPEG risultante. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // aggiungi il percorso del file di input opt.addDataSource(new FileDataSource(inputPath)); // se il file XPS di input è multipagina, i risultati saranno un insieme di file immagine con nome: [\"outputPath\" senza estensione][pageNumber iniziato da 0].[estensione da \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // avvia il processo di conversione converter.process(opt);

L'esempio dimostra come convertire un documento XPS in un'immagine con output in array di byte.

Nella sorgente dati di output a array di byte (byte[][]) un array di byte contiene l'immagine di una pagina. Pertanto, per i documenti a pagina singola il risultato conterrà un array [1][], per i documenti a più pagine il risultato conterrà un array [numero di pagine nel documento XPS di input][]. // crea XpsConverter XpsConverter converter = new XpsConverter(); // crea XpsConverterToImageOptions con formato immagine JPEG di destinazione. Il formato immagine predefinito per l'immagine risultante è PNG. // Inoltre possiamo impostare una dimensione dell'immagine risultante, una risoluzione, una modalità di smoothing e il livello di qualità JPEG per il formato immagine JPEG risultante. XpsConverterToImageOptions opt = new XpsConverterToImageOptions(ImageFormat.Jpeg); // aggiungi il percorso del file di input opt.addDataSource(new FileDataSource(inputPath)); // se il file XPS di input è multipagina, i risultati saranno un insieme di file immagine con nome: [\"outputPath\" senza estensione][pageNumber iniziato da 1].[estensione da \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // avvia il processo di conversione converter.process(opt); // ottieni gli array di byte risultanti byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [XpsConverter()](#XpsConverter--) |  |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [dispose()](#dispose--) | Implementazione di IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Avvia l'elaborazione di XpsConverter con i parametri specificati. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### XpsConverter() {#XpsConverter--}
```
public XpsConverter()
```


### dispose() {#dispose--}
```
public final void dispose()
```


Implementazione di IDisposable.

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




### process(IPluginOptions options) {#process-com.aspose.page.plugins.IPluginOptions-}
```
public final ResultContainer process(IPluginOptions options)
```


Avvia l'elaborazione di XpsConverter con i parametri specificati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Un oggetto di opzioni contenente le istruzioni per l'XpsConverter. |

**Returns:**
[ResultContainer](../../com.aspose.page.plugins/resultcontainer) - An ResultContainer object containing the result of the operation.
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


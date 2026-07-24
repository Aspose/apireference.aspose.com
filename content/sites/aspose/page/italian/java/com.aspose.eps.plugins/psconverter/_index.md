---
title: "PsConverter"
second_title: "Aspose.Page per Java API Reference"
description: "Rappresenta il plugin PsConverter."
type: docs
weight: 10
url: /it/java/com.aspose.eps.plugins/psconverter/
---
**Inheritance:**
java.lang.Object

**All Implemented Interfaces:**
[com.aspose.page.plugins.IPlugin](../../com.aspose.page.plugins/iplugin)
```
public class PsConverter implements IPlugin
```

Rappresenta il plugin PsConverter.

L'esempio dimostra come convertire un file PS/EPS in un documento PDF.

// crea PsConverter PsConverter converter = new PsConverter(); // crea l'oggetto PsConverterToPdfOptions per impostare il tipo di dati di output come file PsConverterToPdfOptions opt = new PsConverterToPdfOptions(); // aggiungi il percorso del file di input opt.addDataSource(new FileDataSource(inputPath)); // imposta il percorso del file di output opt.addSaveDataSource(new FileDataSource(outputPath)); // avvia il processo di conversione ResultContainer results = converter.process(opt);

L'esempio dimostra come convertire un file PS/EPS in un'immagine con output su file.

// crea PsConverter PsConverter converter = new PsConverter(); // crea PsConverterToImageOptions con formato immagine JPEG di destinazione. Il formato immagine predefinito per l'immagine risultante è PNG. // Inoltre possiamo impostare una dimensione dell'immagine risultante, una risoluzione, una modalità di smoothing e il livello di qualità JPEG per il formato immagine JPEG risultante. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // aggiungi il percorso del file di input opt.addDataSource(new FileDataSource(inputPath)); // se il file PS di input è multipagina, i risultati saranno un insieme di file immagine con nome: [\"outputPath\" senza estensione][pageNumber started from 0].[extension from \"outputPath\"] opt.addSaveDataSource(new FileDataSource(outputPath)); // avvia il processo di conversione converter.process(opt);

L'esempio dimostra come convertire un file PS/EPS in un'immagine con output di array di byte.

Nella sorgente dati di output di array di byte (byte [][]) un array di byte contiene l'immagine di una pagina. Pertanto, per documenti a una pagina il risultato conterrà un array [1][], per documenti multi-pagina il risultato conterrà un array [number of pages in input PS document][]. // crea PsConverter PsConverter converter = new PsConverter(); // crea PsConverterToImageOptions con formato immagine JPEG di destinazione. Il formato immagine predefinito per l'immagine risultante è PNG. // Inoltre possiamo impostare una dimensione dell'immagine risultante, una risoluzione, una modalità di smoothing e il livello di qualità JPEG per il formato immagine JPEG risultante. PsConverterToImageOptions opt = new PsConverterToImageOptions(ImageFormat.Jpeg); // aggiungi il percorso del file di input opt.addDataSource(new FileDataSource(inputPath)); // se il file PS di input è multipagina, i risultati saranno un insieme di file immagine con nome: [\"outputPath\" senza estensione][pageNumber started from 0].[extension from \"outputPath\"] opt.addSaveDataSource(new ByteArrayDataSource()); // avvia il processo di conversione converter.process(opt); // ottieni gli array di byte risultanti byte[][] imagesBytes = (byte [][]) ((ByteArrayResult)results.ResultCollection[0]).Data;
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [PsConverter()](#PsConverter--) |  |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [dispose()](#dispose--) | Implementazione di IDisposable. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process(IPluginOptions options)](#process-com.aspose.page.plugins.IPluginOptions-) | Avvia l'elaborazione di PsConverter con i parametri specificati. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PsConverter() {#PsConverter--}
```
public PsConverter()
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


Avvia l'elaborazione di PsConverter con i parametri specificati.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [IPluginOptions](../../com.aspose.page.plugins/ipluginoptions) | Un oggetto di opzioni contenente le istruzioni per PsConverter. |

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


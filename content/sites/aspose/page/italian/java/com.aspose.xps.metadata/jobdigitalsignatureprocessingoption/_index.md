---
title: "JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive le opzioni della funzionalità JobDigitalSignatureProcessing."
type: docs
weight: 10
url: /it/java/com.aspose.xps.metadata/jobdigitalsignatureprocessing.jobdigitalsignatureprocessingoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption extends Option
```

Descrive le opzioni della funzionalità JobDigitalSignatureProcessing.
## Campi

| Campo | Descrizione |
| --- | --- |
| [PrintInvalidSignatures](#PrintInvalidSignatures) | Stampa il lavoro indipendentemente dalla validità delle firme digitali. |
| [PrintInvalidSignaturesWithErrorReport](#PrintInvalidSignaturesWithErrorReport) | Stampa il lavoro indipendentemente dalla validità delle firme digitali. |
| [PrintOnlyValidSignatures](#PrintOnlyValidSignatures) | Stampa il lavoro solo se tutte le firme digitali sono valide. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IOptionItem[] items)](#add-com.aspose.xps.metadata.IOptionItem...-) | Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getClass()](#getClass--) |  |
| [getName()](#getName--) | Ottiene il nome dell'elemento. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### PrintInvalidSignatures {#PrintInvalidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignatures
```


Stampa il lavoro indipendentemente dalla validità delle firme digitali. Le firme digitali POSSONO essere ignorate.

### PrintInvalidSignaturesWithErrorReport {#PrintInvalidSignaturesWithErrorReport}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintInvalidSignaturesWithErrorReport
```


Stampa il lavoro indipendentemente dalla validità delle firme digitali. Nel caso venga rilevata una firma non valida, una pagina di errore dovrebbe essere stampata alla fine del lavoro. Le firme digitali DEVONO NON essere ignorate.

### PrintOnlyValidSignatures {#PrintOnlyValidSignatures}
```
public static final JobDigitalSignatureProcessing.JobDigitalSignatureProcessingOption PrintOnlyValidSignatures
```


Stampa il lavoro solo se tutte le firme digitali sono valide. Le firme digitali DEVONO NON essere ignorate.

### add(IOptionItem[] items) {#add-com.aspose.xps.metadata.IOptionItem...-}
```
public void add(IOptionItem[] items)
```


Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa opzione. Ognuno deve essere un'istanza di  ScoredProperty  o di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IOptionItem\[\]](../../com.aspose.xps.metadata/ioptionitem) | Elenco di elementi da aggiungere. |

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
### getName() {#getName--}
```
public String getName()
```


Ottiene il nome dell'elemento.

**Returns:**
java.lang.String
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


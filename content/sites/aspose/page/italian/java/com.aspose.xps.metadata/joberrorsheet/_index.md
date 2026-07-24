---
title: "JobErrorSheet"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive l'output del foglio di errore."
type: docs
weight: 53
url: /it/java/com.aspose.xps.metadata/joberrorsheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobErrorSheet extends Feature implements IJobPrintTicketItem
```

Descrive l'output del foglio di errore. L'intero lavoro avrà un unico foglio di errore. Il foglio di errore deve essere prodotto con il  PageMediaSize  predefinito e utilizzando il  PageMediaType  predefinito. Il foglio di errore deve essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o elaborazione (come  JobDuplex ,  JobStaple , o  JobBinding ) non deve includere il foglio di errore. Il foglio di errore deve comparire come ultimo foglio del lavoro. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)](#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-) | Crea una nuova istanza. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [add(IFeatureItem[] items)](#add-com.aspose.xps.metadata.IFeatureItem...-) | Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa funzionalità. |
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
### JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items) {#JobErrorSheet-com.aspose.xps.metadata.JobErrorSheet.IJobErrorSheetItem...-}
```
public JobErrorSheet(JobErrorSheet.IJobErrorSheetItem[] items)
```


Crea una nuova istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IJobErrorSheetItem\[\]](../../com.aspose.xps.metadata/ijoberrorsheetitem) | Un array di elementi specifici per la funzionalità. |

### add(IFeatureItem[] items) {#add-com.aspose.xps.metadata.IFeatureItem...-}
```
public void add(IFeatureItem[] items)
```


Aggiunge un elenco di elementi alla fine dell'elenco degli elementi di questa funzionalità. Ognuno deve essere un  Feature , un  Option , o un'istanza di  Property .

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IFeatureItem\[\]](../../com.aspose.xps.metadata/ifeatureitem) | Elenco di elementi da aggiungere. |

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


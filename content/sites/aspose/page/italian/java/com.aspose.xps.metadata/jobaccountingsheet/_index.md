---
title: "JobAccountingSheet"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive il foglio di contabilità da emettere per il lavoro."
type: docs
weight: 44
url: /it/java/com.aspose.xps.metadata/jobaccountingsheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobAccountingSheet extends Feature implements IJobPrintTicketItem
```

Descrive il foglio di contabilizzazione da emettere per il lavoro. Il foglio di contabilizzazione dovrebbe essere emesso con il  PageMediaSize  predefinito e utilizzando il  PageMediaType  predefinito. Il foglio di contabilizzazione dovrebbe essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o di elaborazione (come  JobDuplex ,  JobStaple , o  JobBinding ) non dovrebbe includere il foglio di contabilizzazione. Il foglio di contabilizzazione può comparire come prima o ultima pagina del lavoro a discrezione dell'implementatore. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobaccountingsheet
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options)](#JobAccountingSheet-com.aspose.xps.metadata.JobAccountingSheet.JobAccountingSheetOption...-) | Crea una nuova istanza. |
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
### JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options) {#JobAccountingSheet-com.aspose.xps.metadata.JobAccountingSheet.JobAccountingSheetOption...-}
```
public JobAccountingSheet(JobAccountingSheet.JobAccountingSheetOption[] options)
```


Crea una nuova istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [JobAccountingSheetOption\[\]](../../com.aspose.xps.metadata/jobaccountingsheetoption) | Un array di opzioni specifiche per la funzionalità. |

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


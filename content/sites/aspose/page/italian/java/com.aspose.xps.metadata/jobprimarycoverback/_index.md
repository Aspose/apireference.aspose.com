---
title: "JobPrimaryCoverBack"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive il foglio di copertina finale posteriore."
type: docs
weight: 66
url: /it/java/com.aspose.xps.metadata/jobprimarycoverback/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem)
```
public final class JobPrimaryCoverBack extends Feature implements IJobPrintTicketItem
```

Descrive il foglio di copertina posteriore (finale). Ogni lavoro avrà un foglio primario separato. Il foglio di copertina dovrebbe essere stampato con il  PageMediaSize  e il  PageMediaType  utilizzati per l'ultima pagina del lavoro. Il foglio di copertina dovrebbe essere integrato nelle opzioni di elaborazione (come  JobDuplexAllDocumentsContiguously ,  JobNUpAllDocumentsContiguously ) come indicato dall'Option specificata. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobprimarycoverback
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [JobPrimaryCoverBack(JobPrimaryCoverBack.CoverBackOption[] options)](#JobPrimaryCoverBack-com.aspose.xps.metadata.JobPrimaryCoverBack.CoverBackOption...-) | Crea una nuova istanza. |
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
### JobPrimaryCoverBack(JobPrimaryCoverBack.CoverBackOption[] options) {#JobPrimaryCoverBack-com.aspose.xps.metadata.JobPrimaryCoverBack.CoverBackOption...-}
```
public JobPrimaryCoverBack(JobPrimaryCoverBack.CoverBackOption[] options)
```


Crea una nuova istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [CoverBackOption\[\]](../../com.aspose.xps.metadata/coverbackoption) | Un array di opzioni specifiche per la funzionalità. |

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


---
title: "DocumentBannerSheet"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive il foglio banner da emettere per un documento specifico."
type: docs
weight: 13
url: /it/java/com.aspose.xps.metadata/documentbannersheet/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem)
```
public final class DocumentBannerSheet extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem
```

Descrive il foglio banner da produrre per un documento specifico. Il foglio banner deve essere prodotto con il valore predefinito di  PageMediaSize  e utilizzando il valore predefinito di  PageMediaType . Il foglio banner deve inoltre essere isolato dal resto del lavoro. Ciò significa che qualsiasi opzione di finitura o di elaborazione (come  DocumentDuplex ,  DocumentStaple , o  DocumentBinding ) non deve includere il foglio banner. Il foglio banner può o non può essere isolato dal resto del lavoro. Questo significa che eventuali opzioni di finitura o elaborazione del lavoro possono includere il foglio banner del documento. Il foglio banner deve comparire come prima pagina del documento. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbannersheet
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options)](#DocumentBannerSheet-com.aspose.xps.metadata.DocumentBannerSheet.BannerSheetOption...-) | Crea una nuova istanza. |
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
### DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options) {#DocumentBannerSheet-com.aspose.xps.metadata.DocumentBannerSheet.BannerSheetOption...-}
```
public DocumentBannerSheet(DocumentBannerSheet.BannerSheetOption[] options)
```


Crea una nuova istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| options | [BannerSheetOption\[\]](../../com.aspose.xps.metadata/bannersheetoption) | Un array di opzioni specifiche per la funzionalità. |

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


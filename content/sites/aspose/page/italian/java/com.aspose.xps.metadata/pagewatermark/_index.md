---
title: "PageWatermark"
second_title: "Aspose.Page per Java API Reference"
description: "Descrive l'impostazione del watermark dell'output e le caratteristiche del watermark."
type: docs
weight: 131
url: /it/java/com.aspose.xps.metadata/pagewatermark/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PageWatermark extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Descrive l'impostazione del watermark dell'output e le caratteristiche del watermark. I watermark si applicano alla pagina logica, non a quella fisica. Ad esempio, se  DocumentDuplex  è abilitato, un watermark apparirà su ogni pagina  NUp  di ogni foglio. Se  DocumentDuplex ,  PagesPerSheet =2, allora ogni foglio avrà 2 watermark. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark
## Costruttori

| Costruttore | Descrizione |
| --- | --- |
| [PageWatermark(PageWatermark.IPageWatermarkItem[] items)](#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-) | Crea una nuova istanza. |
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
### PageWatermark(PageWatermark.IPageWatermarkItem[] items) {#PageWatermark-com.aspose.xps.metadata.PageWatermark.IPageWatermarkItem...-}
```
public PageWatermark(PageWatermark.IPageWatermarkItem[] items)
```


Crea una nuova istanza.

**Parameters:**
| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| items | [IPageWatermarkItem\[\]](../../com.aspose.xps.metadata/ipagewatermarkitem) | Un array di elementi specifici per la funzionalità. |

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


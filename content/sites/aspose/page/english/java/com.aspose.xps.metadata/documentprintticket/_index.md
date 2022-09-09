---
title: DocumentPrintTicket
second_title: Aspose.Page for Java API Reference
description: The class that incapsulates a document-level print ticket.
type: docs
weight: 32
url: /java/com.aspose.xps.metadata/documentprintticket/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicket](../../com.aspose.xps.metadata/printticket)
```
public final class DocumentPrintTicket extends PrintTicket
```

The class that incapsulates a document-level print ticket.
## Constructors

| Constructor | Description |
| --- | --- |
| [DocumentPrintTicket(IDocumentPrintTicketItem[] items)](#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | Creates a document-level print ticket instance. |
## Methods

| Method | Description |
| --- | --- |
| [add(IDocumentPrintTicketItem[] items)](#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-) | Adds an array of items to the end of this PrintTicket item list. |
### DocumentPrintTicket(IDocumentPrintTicketItem[] items) {#DocumentPrintTicket-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public DocumentPrintTicket(IDocumentPrintTicketItem[] items)
```


Creates a document-level print ticket instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.IDocumentPrintTicketItem[] | An arbitrary array of  IDocumentPrintTicketItem  instances. Each one must be a  Feature , a  ParameterInit  or a  Property  instance. |

### add(IDocumentPrintTicketItem[] items) {#add-com.aspose.xps.metadata.IDocumentPrintTicketItem...-}
```
public void add(IDocumentPrintTicketItem[] items)
```


Adds an array of items to the end of this PrintTicket item list. Each one may be a  Feature , an  Option  or a  Property  instance.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| items | com.aspose.xps.metadata.IDocumentPrintTicketItem[] | An array of items to add. |


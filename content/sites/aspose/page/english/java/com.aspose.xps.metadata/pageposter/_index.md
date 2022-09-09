---
title: PagePoster
second_title: Aspose.Page for Java API Reference
description: Describes the output of a single page to multiple physical media sheets.
type: docs
weight: 118
url: /java/com.aspose.xps.metadata/pageposter/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Feature](../../com.aspose.xps.metadata/feature)

**All Implemented Interfaces:**
[com.aspose.xps.metadata.IJobPrintTicketItem](../../com.aspose.xps.metadata/ijobprintticketitem), [com.aspose.xps.metadata.IDocumentPrintTicketItem](../../com.aspose.xps.metadata/idocumentprintticketitem), [com.aspose.xps.metadata.IPagePrintTicketItem](../../com.aspose.xps.metadata/ipageprintticketitem)
```
public final class PagePoster extends Feature implements IJobPrintTicketItem, IDocumentPrintTicketItem, IPagePrintTicketItem
```

Describes the output of a single page to multiple physical media sheets. https://docs.microsoft.com/en-us/windows/win32/printdocs/pageposter
## Constructors

| Constructor | Description |
| --- | --- |
| [PagePoster()](#PagePoster--) | Creates a new instance. |
## Methods

| Method | Description |
| --- | --- |
| [addPagesPerSheetOption(int value)](#addPagesPerSheetOption-int-) | Adds and option with a  PagesPerSheet  scored property value. |
### PagePoster() {#PagePoster--}
```
public PagePoster()
```


Creates a new instance.

### addPagesPerSheetOption(int value) {#addPagesPerSheetOption-int-}
```
public PagePoster addPagesPerSheetOption(int value)
```


Adds and option with a  PagesPerSheet  scored property value. Specifies the number of physical sheets per logical page.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | int | A  PagesPerSheet  scored property value. |

**Returns:**
[PagePoster](../../com.aspose.xps.metadata/pageposter) - This feature instance.

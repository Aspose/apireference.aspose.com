---
title: Class DocumentInputBin
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentInputBin class. Describes the installed input bin in a device or the full list of supported bins for a device. The JobInputBin DocumentInputBin and PageInputBin keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document. https//docs.microsoft.com/enus/windows/win32/printdocs/documentinputbin
type: docs
weight: 950
url: /net/aspose.page.xps.xpsmetadata/documentinputbin/
---
## DocumentInputBin class

Describes the installed input bin in a device or the full list of supported bins for a device. The [`JobInputBin`](../jobinputbin/), `DocumentInputBin`, and [`PageInputBin`](../pageinputbin/) keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentinputbin

```csharp
public sealed class DocumentInputBin : InputBin, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentInputBin](documentinputbin/)(params IInputBinItem[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Adds a list of items to the end of this feature's item list. Each one must be a [`Feature`](../feature/), an [`Option`](../option/) or a [`Property`](../property/) instance. |

### See Also

* class [InputBin](../inputbin/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



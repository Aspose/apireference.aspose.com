---
title: Class DocumentHolePunch
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentHolePunch class. Describes the hole punching characteristics of the output. Each document is punched separately. The JobHolePunch and DocumentHolePunch keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document. https//docs.microsoft.com/enus/windows/win32/printdocs/documentholepunch
type: docs
weight: 1010
url: /net/aspose.page.xps.xpsmetadata/documentholepunch/
---
## DocumentHolePunch class

Describes the hole punching characteristics of the output. Each document is punched separately. The [`JobHolePunch`](../jobholepunch/) and `DocumentHolePunch` keywords are mutually exclusive. Both should not be specified simultaneously in a PrintTicket or Print Capabilities document. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentholepunch

```csharp
public sealed class DocumentHolePunch : HolePunch, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentHolePunch](documentholepunch/)(params HolePunchOption[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Adds a list of items to the end of this feature's item list. Each one must be a [`Feature`](../feature/), an [`Option`](../option/), or a [`Property`](../property/) instance. |

### See Also

* class [HolePunch](../holepunch/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



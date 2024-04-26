---
title: Class PageForceFrontSide
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.PageForceFrontSide class. Forces the output to appear on the front of a media sheet. Relevant to media sheets with different surfaces on each side. In cases where this feature interferes with processing options such as DocumentDuplex
type: docs
weight: 2620
url: /net/aspose.page.xps.xpsmetadata/pageforcefrontside/
---
## PageForceFrontSide class

Forces the output to appear on the front of a media sheet. Relevant to media sheets with different surfaces on each side. In cases where this feature interferes with processing options (such as [`DocumentDuplex`](../documentduplex/)),

```csharp
PageForceFrontSide
```

takes precedence for the specific page to which the feature applies.

```csharp
public sealed class PageForceFrontSide : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [PageForceFrontSide](pageforcefrontside/)(params PageForceFrontSideOption[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Adds a list of items to the end of this feature's item list. Each one must be a [`Feature`](../feature/), an [`Option`](../option/) or a [`Property`](../property/) instance. |

## Other Members

| Name | Description |
| --- | --- |
| class [PageForceFrontSideOption](../../aspose.page.xps.xpsmetadata/pageforcefrontside.pageforcefrontsideoption) | Describes the `PageForceFrontSide` feature options. |

### See Also

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



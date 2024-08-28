---
title: Class PageWatermark
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.PageWatermark class. Describes the watermark setting of the output and the watermark characteristics. Watermarks apply to the logical page not the physical page. For example if DocumentDuplex is enabled a watermark will appear on each
type: docs
weight: 2980
url: /net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

Describes the watermark setting of the output and the watermark characteristics. Watermarks apply to the logical page, not the physical page. For example, if [`DocumentDuplex`](../documentduplex/) is enabled, a watermark will appear on each

```csharp
NUp
```

page on each sheet. If [`DocumentDuplex`](../documentduplex/),

```csharp
PagesPerSheet
```

=2, then each sheet will have 2 watermarks. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Adds a list of items to the end of this feature's item list. Each one must be a [`Feature`](../feature/), an [`Option`](../option/), or a [`Property`](../property/) instance. |

## Other Members

| Name | Description |
| --- | --- |
| interface [IPageWatermarkItem](../../aspose.page.xps.xpsmetadata/pagewatermark.ipagewatermarkitem) | The interface of any `PageWatermark` feature item. |
| interface [IPageWatermarkOptionItem](../../aspose.page.xps.xpsmetadata/pagewatermark.ipagewatermarkoptionitem) | The interface of any [`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) item. |
| class [Layering](../../aspose.page.xps.xpsmetadata/pagewatermark.layering) | Describes inner |
| class [LayeringOption](../../aspose.page.xps.xpsmetadata/pagewatermark.layeringoption) | Describes the [`Layering`](../pagewatermark.layering/) feature options. |
| class [PageWatermarkOption](../../aspose.page.xps.xpsmetadata/pagewatermark.pagewatermarkoption) | Describes the `PageWatermark` features options. |

### See Also

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



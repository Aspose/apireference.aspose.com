---
title: Class DocumentBinding
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.DocumentBinding class. Describes the method of binding. Each document is bound separately. DocumentBinding and JobBindAllDocuments are mutually exclusive. It is up to the driver to determine constraint handling between keywords. https//docs.microsoft.com/enus/windows/win32/printdocs/documentbinding
type: docs
weight: 780
url: /net/aspose.page.xps.xpsmetadata/documentbinding/
---
## DocumentBinding class

Describes the method of binding. Each document is bound separately. DocumentBinding and JobBindAllDocuments are mutually exclusive. It is up to the driver to determine constraint handling between keywords. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentbinding

```csharp
public sealed class DocumentBinding : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [DocumentBinding](documentbinding/)(params BindingOption[]) | Creates a new instance. |

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
| class [BindingGutter](../../aspose.page.xps.xpsmetadata/documentbinding.bindinggutter) | Describes the way to specify the |
| class [BindingOption](../../aspose.page.xps.xpsmetadata/documentbinding.bindingoption) | Represents options of the `DocumentBinding` feature. |
| interface [IBindingOptionItem](../../aspose.page.xps.xpsmetadata/documentbinding.ibindingoptionitem) | The interface of any [`BindingOption`](../documentbinding.bindingoption/) item. |

### See Also

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



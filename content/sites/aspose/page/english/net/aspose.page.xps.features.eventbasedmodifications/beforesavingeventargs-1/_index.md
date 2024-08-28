---
title: Class BeforeSavingEventArgsT
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.Features.EventBasedModifications.BeforeSavingEventArgs1T class. Defines the base class for arguments of various beforesaving events
type: docs
weight: 570
url: /net/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs-1/
---
## BeforeSavingEventArgs&lt;T&gt; class

Defines the base class for arguments of various before-saving events.

```csharp
public class BeforeSavingEventArgs<T>
    where T : IModificationAPI
```

| Parameter | Description |
| --- | --- |
| T | The modification API type. |

## Properties

| Name | Description |
| --- | --- |
| [AbsolutePageNumber](../../aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs-1/absolutepagenumber/) { get; } | The current absolute page number across all documents within the XPS package. |
| [DocumentNumber](../../aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs-1/documentnumber/) { get; } | The current document number within the XPS package. |
| [ElementAPI](../../aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs-1/elementapi/) { get; } | Gets the modification API of the element that is about to be saved. |
| [OutputPageNumber](../../aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs-1/outputpagenumber/) { get; } | The current output number. It differs from **AbsolutePageNumber** if the **PageNumbers** save option is specified. |
| [RelativePageNumber](../../aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs-1/relativepagenumber/) { get; } | The current page number relative to the current document within the XPS package. |

### See Also

* interface [IModificationAPI](../imodificationapi/)
* namespace [Aspose.Page.XPS.Features.EventBasedModifications](../../aspose.page.xps.features.eventbasedmodifications/)
* assembly [Aspose.Page](../../)



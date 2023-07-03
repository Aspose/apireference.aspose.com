---
title: Class JobErrorSheet
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet class. Describes the error sheet output. The entire job will have a single error sheet. The error sheet should be output on the default PageMediaSize and using the default PageMediaType. The error sheet should to be isolated from the remainder of the job. This means that any finishing or processing options such as
type: docs
weight: 1510
url: /net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Describes the error sheet output. The entire job will have a single error sheet. The error sheet should be output on the default [`PageMediaSize`](../pagemediasize/) and using the default [`PageMediaType`](../pagemediatype/). The error sheet should to be isolated from the remainder of the job. This means that any finishing or processing options (such as

```csharp
JobDuplex
```

,

```csharp
JobStaple
```

, or

```csharp
JobBinding
```

) should not include the error sheet. The error sheet should occur as the final sheet of the job. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Creates a new instance. |

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
| class [ErrorSheetOption](../../aspose.page.xps.xpsmetadata/joberrorsheet.errorsheetoption) | Describes the `JobErrorSheet` feature options. |
| class [ErrorSheetWhen](../../aspose.page.xps.xpsmetadata/joberrorsheet.errorsheetwhen) | Describes inner |
| interface [IJobErrorSheetItem](../../aspose.page.xps.xpsmetadata/joberrorsheet.ijoberrorsheetitem) | The interface of any `JobErrorSheet` feature item. |

### See Also

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



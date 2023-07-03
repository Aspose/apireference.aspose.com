---
title: Class ScoredProperty
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.ScoredProperty class. The class that implements a common PrintTicket
type: docs
weight: 3070
url: /net/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class

The class that implements a common PrintTicket

```csharp
ScoredProperty
```

. The base class for all schema-defined scored properties. A

```csharp
ScoredProperty
```

element declares a property that is intrinsic to an [`Option`](../option/) definition. Such properties should be compared when evaluating how closely a requested [`Option`](../option/) matches a device-supported [`Option`](../option/). https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty

```csharp
public class ScoredProperty : CompositePrintTicketElement, IOptionItem, IScoredPropertyItem
```

## Constructors

| Name | Description |
| --- | --- |
| [ScoredProperty](scoredproperty/#constructor)(string, ParameterRef) | Creates a new instance. |
| [ScoredProperty](scoredproperty/#constructor_1)(string, Value, params IScoredPropertyItem[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

### See Also

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IOptionItem](../ioptionitem/)
* interface [IScoredPropertyItem](../iscoredpropertyitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



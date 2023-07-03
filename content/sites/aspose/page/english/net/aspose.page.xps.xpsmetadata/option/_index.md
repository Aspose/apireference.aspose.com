---
title: Class Option
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.Option class. The class that implements a common PrintTicket
type: docs
weight: 1870
url: /net/aspose.page.xps.xpsmetadata/option/
---
## Option class

The class that implements a common PrintTicket

```csharp
Option
```

. The base class for all schema-defined options. An Option element contains all of the [`Property`](../property/) and [`ScoredProperty`](../scoredproperty/) elements associated with this option. https://docs.microsoft.com/en-us/windows/win32/printdocs/option

```csharp
public class Option : CompositePrintTicketElement, IFeatureItem
```

## Constructors

| Name | Description |
| --- | --- |
| [Option](option/#constructor)(params IOptionItem[]) | Creates a new PrintTicket option instance. |
| [Option](option/#constructor_1)(Option) | Creates a clone option instance. |
| [Option](option/#constructor_2)(string, params IOptionItem[]) | Creates a new PrintTicket option instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | Adds a list of items to the end of this option's item list. Each one must be a [`ScoredProperty`](../scoredproperty/) or [`Property`](../property/) instance. |

### See Also

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



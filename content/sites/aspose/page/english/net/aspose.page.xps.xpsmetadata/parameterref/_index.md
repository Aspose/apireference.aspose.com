---
title: Class ParameterRef
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.ParameterRef class. The class that implements a common PrintTicket parameter reference. A
type: docs
weight: 3000
url: /net/aspose.page.xps.xpsmetadata/parameterref/
---
## ParameterRef class

The class that implements a common PrintTicket parameter reference. A

```csharp
ParameterRef
```

element defines a reference to a [`ParameterInit`](../parameterinit/) element. A [`ScoredProperty`](../scoredproperty/) element that contains a ParameterRef element does not have an explicitly-set [`Value`](../value/) element. Instead, the [`ScoredProperty`](../scoredproperty/) element receives its value from the [`ParameterInit`](../parameterinit/) element referenced by a

```csharp
ParameterRef
```

element. https://docs.microsoft.com/en-us/windows/win32/printdocs/parameterref

```csharp
public class ParameterRef : PrintTicketElement, IPrintTicketItem
```

## Constructors

| Name | Description |
| --- | --- |
| [ParameterRef](parameterref/)(string) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

### See Also

* class [PrintTicketElement](../printticketelement/)
* interface [IPrintTicketItem](../iprintticketitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



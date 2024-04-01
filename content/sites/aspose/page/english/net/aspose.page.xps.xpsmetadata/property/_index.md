---
title: Class Property
second_title: Aspose.Page for .NET API Reference
description: Aspose.Page.XPS.XpsMetadata.Property class. The class that implements a common PrintTicket
type: docs
weight: 3110
url: /net/aspose.page.xps.xpsmetadata/property/
---
## Property class

The class that implements a common PrintTicket

```csharp
Property
```

. The base class for all schema-defined properties. A

```csharp
Property
```

element declares a device, job formatting, or other relevant property whose name is given by its name attribute. A [`Value`](../value/) element is used to assign a value to the

```csharp
Property
```

. A

```csharp
Property
```

can be complex, possibly containing multiple subproperties. Subproperties are also represented by

```csharp
Property
```

elements. https://docs.microsoft.com/en-us/windows/win32/printdocs/property

```csharp
public class Property : CompositePrintTicketElement, IFeatureItem, IOptionItem, IPrintTicketItem, 
    IPropertyItem, IScoredPropertyItem
```

## Constructors

| Name | Description |
| --- | --- |
| [Property](property/#constructor)(string, Property, params IPropertyItem[]) | Creates a new instance. |
| [Property](property/#constructor_1)(string, Value, params IPropertyItem[]) | Creates a new instance. |

## Properties

| Name | Description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Gets the element name. |

### See Also

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* interface [IOptionItem](../ioptionitem/)
* interface [IPrintTicketItem](../iprintticketitem/)
* interface [IPropertyItem](../ipropertyitem/)
* interface [IScoredPropertyItem](../iscoredpropertyitem/)
* namespace [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* assembly [Aspose.Page](../../)



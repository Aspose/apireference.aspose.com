---
title: Interface IIfcEntity
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.Ifc.IIfcEntity interface. IIfcEntity is a base interface for all IFC entities
type: docs
weight: 33470
url: /net/aspose.cad.fileformats.ifc/iifcentity/
---
## IIfcEntity interface

IIfcEntity is a base interface for all IFC entities

```csharp
public interface IIfcEntity : IDrawingEntity
```

## Properties

| Name | Description |
| --- | --- |
| [EntityLabel](../../aspose.cad.fileformats.ifc/iifcentity/entitylabel/) { get; } |  |

## Examples

Gets first entity from entities.

```csharp
using (IfcImage ifcImage = (IfcImage)Image.Load(fileName))
{
    IIfcEntity iEntity = ifcImage._entities[0]
}
```

### See Also

* interface [IDrawingEntity](../../aspose.cad/idrawingentity/)
* namespace [Aspose.CAD.FileFormats.Ifc](../../aspose.cad.fileformats.ifc/)
* assembly [Aspose.CAD](../../)



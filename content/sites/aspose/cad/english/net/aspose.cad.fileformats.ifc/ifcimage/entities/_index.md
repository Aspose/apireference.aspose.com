---
title: IfcImage.Entities
second_title: Aspose.CAD for .NET API Reference
description: IfcImage property. Gets all entities that exists on a drawing. Could be useful for walking through them and check its properties
type: docs
weight: 20
url: /net/aspose.cad.fileformats.ifc/ifcimage/entities/
---
## IfcImage.Entities property

Gets all entities that exists on a drawing. Could be useful for walking through them and check its properties

```csharp
public IEnumerable<IIfcEntity> Entities { get; }
```

### Property Value

A set of entity instances

## Examples

Gets entities set from a drawing.

```csharp
using (IfcImage ifcImage = (IfcImage)Image.Load(fileName))
{
    var entities = ifcImage.Entities
}
```

### See Also

* interface [IIfcEntity](../../iifcentity/)
* class [IfcImage](../)
* namespace [Aspose.CAD.FileFormats.Ifc](../../../aspose.cad.fileformats.ifc/)
* assembly [Aspose.CAD](../../../)



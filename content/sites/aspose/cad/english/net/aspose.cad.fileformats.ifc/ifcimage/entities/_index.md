---
title: IfcImage.Entities
second_title: Aspose.CAD for .NET API Reference
description: IfcImage property. Gets all entities that exists in the image. Could be useful for walwing through them and check its properties
type: docs
weight: 20
url: /net/aspose.cad.fileformats.ifc/ifcimage/entities/
---
## IfcImage.Entities property

Gets all entities that exists in the image. Could be useful for walwing through them and check its properties

```csharp
public IEnumerable<IIfcEntity> Entities { get; }
```

### Property Value

The entities dictionary. Key is a number of entity within the file, like #10 Value is entity instance

## Examples

Gets entities dictionary from the image.

```csharp
using (IfcImage ifcImage = (IfcImage)Image.Load(fileName))
{
    var entities = ifcImage._entities
}
```

### See Also

* interface [IIfcEntity](../../iifcentity/)
* class [IfcImage](../)
* namespace [Aspose.CAD.FileFormats.Ifc](../../../aspose.cad.fileformats.ifc/)
* assembly [Aspose.CAD](../../../)



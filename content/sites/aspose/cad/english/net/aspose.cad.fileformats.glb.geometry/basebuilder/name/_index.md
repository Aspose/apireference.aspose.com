---
title: BaseBuilder.Name
second_title: Aspose.CAD for .NET API Reference
description: BaseBuilder property. Gets or sets the display text name or null
type: docs
weight: 20
url: /net/aspose.cad.fileformats.glb.geometry/basebuilder/name/
---
## BaseBuilder.Name property

Gets or sets the display text name, or null.

**⚠️ DO NOT USE AS AN OBJECT ID ⚠️** see remarks.

```csharp
public string Name { get; set; }
```

## Remarks

glTF does not define any rule for object names. This means that names can be null or non unique. So don't use `Name` for anything other than object name display. If you need to reference objects by some ID, use lookup tables instead.

### See Also

* class [BaseBuilder](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../basebuilder/)
* assembly [Aspose.CAD](../../../)



---
title: IMeshBuilder1.Name
second_title: Aspose.CAD for .NET API Reference
description: IMeshBuilder property. Gets or sets the display text name or null
type: docs
weight: 40
url: /net/aspose.cad.fileformats.glb.geometry/imeshbuilder-1/name/
---
## IMeshBuilder&lt;TMaterial&gt;.Name property

Gets or sets the display text name, or null.

**⚠️ DO NOT USE AS AN OBJECT ID ⚠️** see remarks.

```csharp
public string Name { get; set; }
```

## Remarks

glTF does not define any rule for object names. This means that names can be null or non unique. So don't use `Name` for anything other than object name display. If you need to reference objects by some ID, use lookup tables instead.

### See Also

* interface [IMeshBuilder&lt;TMaterial&gt;](../)
* namespace [Aspose.CAD.FileFormats.GLB.Geometry](../../imeshbuilder-1/)
* assembly [Aspose.CAD](../../../)



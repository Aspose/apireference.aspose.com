---
title: LogicalChildOfRoot.Name
second_title: Aspose.CAD for .NET API Reference
description: LogicalChildOfRoot property. Gets or sets the display text name or null
type: docs
weight: 30
url: /net/aspose.cad.fileformats.glb/logicalchildofroot/name/
---
## LogicalChildOfRoot.Name property

Gets or sets the display text name, or null.

**⚠️ DO NOT USE AS AN OBJECT ID ⚠️** see remarks.

```csharp
public string Name { get; set; }
```

## Remarks

glTF does not define any rule for object names. This means that names can be null or non unique. So don't use `Name` for anything other than object name display. If you need to reference objects by some ID, use lookup tables instead.

### See Also

* class [LogicalChildOfRoot](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../logicalchildofroot/)
* assembly [Aspose.CAD](../../../)



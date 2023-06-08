---
title: GlbData.MergeImages
second_title: Aspose.CAD for .NET API Reference
description: GlbData method. Transfers all the GlbImage.LogicalImages content into BufferView instances
type: docs
weight: 430
url: /net/aspose.cad.fileformats.glb/glbdata/mergeimages/
---
## GlbData.MergeImages method

Transfers all the !:GlbImage.LogicalImages content into [`BufferView`](../../bufferview/) instances

```csharp
public void MergeImages()
```

## Remarks

Images can be stored in three different ways: - As satellite files. - Embedded as MIME64 into the JSON document - Referenced with [`BufferView`](../../bufferview/) This call ensures all images will be internalized as [`BufferView`](../../bufferview/) instances. This action cannot be reversed.

### See Also

* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)



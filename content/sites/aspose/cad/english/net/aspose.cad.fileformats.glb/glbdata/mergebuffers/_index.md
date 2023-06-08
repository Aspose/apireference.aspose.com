---
title: GlbData.MergeBuffers
second_title: Aspose.CAD for .NET API Reference
description: GlbData method. Merges all the GlbImage.LogicalBuffers instances into a single big one
type: docs
weight: 420
url: /net/aspose.cad.fileformats.glb/glbdata/mergebuffers/
---
## MergeBuffers() {#mergebuffers}

Merges all the !:GlbImage.LogicalBuffers instances into a single big one.

```csharp
public void MergeBuffers()
```

### Exceptions

| exception | condition |
| --- | --- |
| InvalidOperationException | .Net arrays have an upper limit of 2Gb, so this is the biggest a buffer can normally grow, so attempting to merge buffers that sum more than 2Gb will throw this exception. |

## Remarks

When merging the buffers, it also adjusts the BufferView offsets so the data they point to remains the same.

If images are required to be included in the binary, call !:GlbImage.MergeImages before calling `MergeBuffers`.

### See Also

* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)

---

## MergeBuffers(int) {#mergebuffers_1}

Merges all the !:GlbImage.LogicalBuffers instances into buffers of *maxSize* size.

```csharp
public void MergeBuffers(int maxSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| maxSize | Int32 | The maximum size of each buffer. Notice that if a single BufferView is larger than *maxSize*, that buffer will be also larger. |

### See Also

* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)



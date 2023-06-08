---
title: WriteContext.WriteTextSchema2
second_title: Aspose.CAD for .NET API Reference
description: WriteContext method. Writes model to this context using the glTF json container
type: docs
weight: 130
url: /net/aspose.cad.fileformats.glb/writecontext/writetextschema2/
---
## WriteTextSchema2(string, GlbData) {#writetextschema2_1}

Writes *model* to this context using the glTF json container.

```csharp
public void WriteTextSchema2(string baseName, GlbData model)
```

| Parameter | Type | Description |
| --- | --- | --- |
| baseName | String | The base name to use for asset files, without extension. |
| model | GlbData | The [`GlbImage`](../../glbimage/) to write. |

## Remarks

If the model has associated resources like binary assets and textures, these additional resources will be also written as associated files using the pattern: "*baseName*.{Number}.bin&#x7C;png&#x7C;jpg&#x7C;dds"

### See Also

* class [GlbData](../../glbdata/)
* class [WriteContext](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../writecontext/)
* assembly [Aspose.CAD](../../../)

---

## WriteTextSchema2(Stream, Stream, string, GlbData) {#writetextschema2}

Writes *model* to this context using the glTF json container.

```csharp
public void WriteTextSchema2(Stream stream, Stream binStream, string gltfFileName, GlbData model)
```

| Parameter | Description |
| --- | --- |
| baseName | The base name to use for asset files, without extension. |
| model | The [`GlbImage`](../../glbimage/) to write. |

## Remarks

If the model has associated resources like binary assets and textures, these additional resources will be also written as associated files using the pattern: "*baseName*.{Number}.bin&#x7C;png&#x7C;jpg&#x7C;dds"

### See Also

* class [GlbData](../../glbdata/)
* class [WriteContext](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../writecontext/)
* assembly [Aspose.CAD](../../../)



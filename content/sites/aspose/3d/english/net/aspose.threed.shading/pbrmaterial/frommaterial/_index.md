---
title: PbrMaterial.FromMaterial
second_title: Aspose.3D for .NET API Reference
description: PbrMaterial method. Allow convert other material to PbrMaterial
type: docs
weight: 20
url: /net/aspose.threed.shading/pbrmaterial/frommaterial/
---
## PbrMaterial.FromMaterial method

Allow convert other material to PbrMaterial

```csharp
public static PbrMaterial FromMaterial(Material material)
```

| Parameter | Type | Description |
| --- | --- | --- |
| material | Material |  |

### Examples

```csharp
var mat = new LambertMaterial();
var tex = new Texture();
tex.FileName = "diffuse.png";
mat.SetTexture(Material.MapDiffuse, tex);
mat.DiffuseColor = new Vector3(0.3, 0.9, 0.4);
PbrMaterial pbr = PbrMaterial.FromMaterial(mat);
```

### See Also

* class [Material](../../material/)
* class [PbrMaterial](../)
* namespace [Aspose.ThreeD.Shading](../../../aspose.threed.shading/)
* assembly [Aspose.3D](../../../)



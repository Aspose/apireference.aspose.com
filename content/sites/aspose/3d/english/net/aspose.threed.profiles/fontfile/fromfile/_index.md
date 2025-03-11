---
title: FontFile.FromFile
second_title: Aspose.3D for .NET API Reference
description: FontFile method. Load FontFile from file name
type: docs
weight: 10
url: /net/aspose.threed.profiles/fontfile/fromfile/
---
## FontFile.FromFile method

Load FontFile from file name

```csharp
public static FontFile FromFile(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | Path to the font file |

### Return Value

FontFile instance

### Exceptions

| exception | condition |
| --- | --- |
| IOException | Thrown when failed to read from file. |

## Examples

The following code shows how to create a 3D mesh from text using specified font file.

```csharp
var font = FontFile.FromFile(@"CascadiaCode-Regular.otf");
var text = new Text();
text.Font = font;
text.Content = "ABC";
text.FontSize = 10;
var linear = new LinearExtrusion(text, 10).ToMesh();
var scene = new Scene(linear);
scene.Save(@"test.stl");
```

### See Also

* class [FontFile](../)
* namespace [Aspose.ThreeD.Profiles](../../fontfile/)
* assembly [Aspose.3D](../../../)



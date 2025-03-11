---
title: Text.Font
second_title: Aspose.3D for .NET API Reference
description: Text property. The font of the text
type: docs
weight: 30
url: /net/aspose.threed.profiles/text/font/
---
## Text.Font property

The font of the text.

```csharp
public FontFile Font { get; set; }
```

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

* class [FontFile](../../fontfile/)
* class [Text](../)
* namespace [Aspose.ThreeD.Profiles](../../text/)
* assembly [Aspose.3D](../../../)



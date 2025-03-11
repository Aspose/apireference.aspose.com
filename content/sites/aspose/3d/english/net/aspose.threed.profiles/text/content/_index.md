---
title: Text.Content
second_title: Aspose.3D for .NET API Reference
description: Text property. Content of the text
type: docs
weight: 20
url: /net/aspose.threed.profiles/text/content/
---
## Text.Content property

Content of the text

```csharp
public string Content { get; set; }
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

* class [Text](../)
* namespace [Aspose.ThreeD.Profiles](../../text/)
* assembly [Aspose.3D](../../../)



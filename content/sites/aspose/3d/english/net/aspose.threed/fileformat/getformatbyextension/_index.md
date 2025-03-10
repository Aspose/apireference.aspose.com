---
title: FileFormat.GetFormatByExtension
second_title: Aspose.3D for .NET API Reference
description: FileFormat method. Gets the preferred file format from the file extension name The extension name should starts with a dot
type: docs
weight: 470
url: /net/aspose.threed/fileformat/getformatbyextension/
---
## FileFormat.GetFormatByExtension method

Gets the preferred file format from the file extension name The extension name should starts with a dot('.').

```csharp
public static FileFormat GetFormatByExtension(string extensionName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| extensionName | String | The extension name started with '.' to query. |

### Return Value

Instance of [`FileFormat`](../), otherwise null returned.

## Examples

The following code shows how to save scene to memory using specified format

```csharp
Scene scene = new Scene(new Box());
var outputFormat = ".glb";
var format = FileFormat.GetFormatByExtension(outputFormat);
using(var ms = new MemoryStream())
{
    scene.Save(ms, format);
}
```

### See Also

* class [FileFormat](../)
* namespace [Aspose.ThreeD](../../fileformat/)
* assembly [Aspose.3D](../../../)



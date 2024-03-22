---
title: FileFormat.ContentType
second_title: Aspose.3D for .NET API Reference
description: FileFormat property. Gets file format content type
type: docs
weight: 500
url: /net/aspose.threed/fileformat/contenttype/
---
## FileFormat.ContentType property

Gets file format content type

```csharp
public FileContentType ContentType { get; }
```

### Examples

```csharp
var format = FileFormat.MayaBinary;
if (format.ContentType == FileContentType.Binary)
    Console.WriteLine($"{format} is binary format");
else
    Console.WriteLine($"{format} is text-based format");
```

### See Also

* enum [FileContentType](../../filecontenttype/)
* class [FileFormat](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)



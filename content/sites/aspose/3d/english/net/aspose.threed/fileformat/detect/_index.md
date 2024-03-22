---
title: FileFormat.Detect
second_title: Aspose.3D for .NET API Reference
description: FileFormat method. Detect the file format from data stream file name is optional for guessing types that has no magic header
type: docs
weight: 460
url: /net/aspose.threed/fileformat/detect/
---
## Detect(Stream, string) {#detect}

Detect the file format from data stream, file name is optional for guessing types that has no magic header.

```csharp
public static FileFormat Detect(Stream stream, string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream |  |
| fileName | String |  |

### Examples

```csharp
byte[] bytes = new byte[100];//take the bytes from your source
var fmt = FileFormat.Detect(new MemoryStream(bytes), "input-file");
Console.WriteLine($"Input data format: {fmt}");
```

### See Also

* class [FileFormat](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)

---

## Detect(string) {#detect_1}

Detect the file format from file name, file must be readable so Aspose.3D can detect the file format through file header.

```csharp
public static FileFormat Detect(string fileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String |  |

### Examples

```csharp
var fmt = FileFormat.Detect("input.fbx");
Console.WriteLine($"Input file format: {fmt}");
```

### See Also

* class [FileFormat](../)
* namespace [Aspose.ThreeD](../../../aspose.threed/)
* assembly [Aspose.3D](../../../)



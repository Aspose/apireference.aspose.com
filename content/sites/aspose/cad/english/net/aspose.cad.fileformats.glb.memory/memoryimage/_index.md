---
title: Struct MemoryImage
second_title: Aspose.CAD for .NET API Reference
description: Aspose.CAD.FileFormats.GLB.Memory.MemoryImage struct. Represents an image file stored as an inmemory byte array
type: docs
weight: 10680
url: /net/aspose.cad.fileformats.glb.memory/memoryimage/
---
## MemoryImage structure

Represents an image file stored as an in-memory byte array

```csharp
public struct MemoryImage : IEquatable<MemoryImage>
```

## Constructors

| Name | Description |
| --- | --- |
| [MemoryImage](memoryimage/#constructor_1)(ArraySegment&lt;byte&gt;) |  |
| [MemoryImage](memoryimage/#constructor)(byte[]) |  |
| [MemoryImage](memoryimage/#constructor_2)(Func&lt;ArraySegment&lt;byte&gt;&gt;) |  |
| [MemoryImage](memoryimage/#constructor_3)(string) |  |

## Properties

| Name | Description |
| --- | --- |
| static [Empty](../../aspose.cad.fileformats.glb.memory/memoryimage/empty/) { get; } |  |
| [Content](../../aspose.cad.fileformats.glb.memory/memoryimage/content/) { get; } | Gets the file bytes of the image. |
| [FileExtension](../../aspose.cad.fileformats.glb.memory/memoryimage/fileextension/) { get; } | Gets the most appropriate extension string for this image. |
| [IsDds](../../aspose.cad.fileformats.glb.memory/memoryimage/isdds/) { get; } | Gets a value indicating whether this object represents a valid DDS image. |
| [IsEmpty](../../aspose.cad.fileformats.glb.memory/memoryimage/isempty/) { get; } |  |
| [IsExtendedFormat](../../aspose.cad.fileformats.glb.memory/memoryimage/isextendedformat/) { get; } | Gets a value indicating whether this object represents an image backed by a glTF extension. |
| [IsJpg](../../aspose.cad.fileformats.glb.memory/memoryimage/isjpg/) { get; } | Gets a value indicating whether this object represents a valid JPG image. |
| [IsKtx2](../../aspose.cad.fileformats.glb.memory/memoryimage/isktx2/) { get; } | Gets a value indicating whether this object represents a valid KTX2 image. |
| [IsPng](../../aspose.cad.fileformats.glb.memory/memoryimage/ispng/) { get; } | Gets a value indicating whether this object represents a valid PNG image. |
| [IsValid](../../aspose.cad.fileformats.glb.memory/memoryimage/isvalid/) { get; } | Gets a value indicating whether this object represents a valid image. |
| [IsWebp](../../aspose.cad.fileformats.glb.memory/memoryimage/iswebp/) { get; } | Gets a value indicating whether this object represents a valid WEBP image. |
| [MimeType](../../aspose.cad.fileformats.glb.memory/memoryimage/mimetype/) { get; } | Gets the most appropriate Mime type string for this image. |
| [SourcePath](../../aspose.cad.fileformats.glb.memory/memoryimage/sourcepath/) { get; } | Gets the source path of this image, or **null**. |

## Methods

| Name | Description |
| --- | --- |
| [Equals](../../aspose.cad.fileformats.glb.memory/memoryimage/equals/#equals)(MemoryImage) |  |
| override [Equals](../../aspose.cad.fileformats.glb.memory/memoryimage/equals/#equals_1)(object) |  |
| override [GetHashCode](../../aspose.cad.fileformats.glb.memory/memoryimage/gethashcode/)() |  |
| [IsImageOfType](../../aspose.cad.fileformats.glb.memory/memoryimage/isimageoftype/)(string) | identifies an image of a specific type. |
| [Open](../../aspose.cad.fileformats.glb.memory/memoryimage/open/)() | Opens the image file for reading its contents |
| [SaveToFile](../../aspose.cad.fileformats.glb.memory/memoryimage/savetofile/)(string) | Saves the image stored in this `MemoryImage` to a file. |
| [ToDebuggerDisplay](../../aspose.cad.fileformats.glb.memory/memoryimage/todebuggerdisplay/)() |  |
| static [AreEqual](../../aspose.cad.fileformats.glb.memory/memoryimage/areequal/)(MemoryImage, MemoryImage) |  |
| static [TryParseMime64](../../aspose.cad.fileformats.glb.memory/memoryimage/tryparsemime64/)(string, out MemoryImage) | Tries to parse a Mime64 string to `MemoryImage` |
| [operator ==](../../aspose.cad.fileformats.glb.memory/memoryimage/op_equality/) |  |
| [implicit operator](../../aspose.cad.fileformats.glb.memory/memoryimage/op_implicit/#op_implicit_1) |  (3 operators) |
| [operator !=](../../aspose.cad.fileformats.glb.memory/memoryimage/op_inequality/) |  |

### See Also

* namespace [Aspose.CAD.FileFormats.GLB.Memory](../../aspose.cad.fileformats.glb.memory/)
* assembly [Aspose.CAD](../../)



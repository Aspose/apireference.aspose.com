---
title: PdfFormat.Extract
second_title: Aspose.3D for .NET API Reference
description: PdfFormat method. Extract raw 3D content from PDF file
type: docs
weight: 10
url: /net/aspose.threed.formats/pdfformat/extract/
---
## Extract(string, byte[]) {#extract_1}

Extract raw 3D content from PDF file.

```csharp
public List<byte[]> Extract(string fileName, byte[] password = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileName | String | File name of input PDF file |
| password | Byte[] | Password of the PDF file |

### Return Value

A list of all 3D contents in bytes, including the formats that Aspose.3D don't supported.

## Examples

The following code shows how to extract all raw 3D contents from a 3D PDF file, and write them to files.

```csharp
var raw3DContents = FileFormat.PDF.Extract("input.pdf");
for (int i = 0; i < raw3DContents.Count; i++)
{
    File.WriteAllBytes("raw-3d-" + i, raw3DContents[i]);
}
```

### See Also

* class [PdfFormat](../)
* namespace [Aspose.ThreeD.Formats](../../pdfformat/)
* assembly [Aspose.3D](../../../)

---

## Extract(Stream, byte[]) {#extract}

Extract raw 3D content from PDF stream.

```csharp
public List<byte[]> Extract(Stream stream, byte[] password = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| stream | Stream | Stream of input PDF file |
| password | Byte[] | Password of the PDF file |

### Return Value

A list of all 3D contents in bytes, including the formats that Aspose.3D don't supported.

## Examples

The following code shows how to extract all raw 3D contents from a 3D PDF file, and write them to files.

```csharp
var raw3DContents = FileFormat.PDF.Extract("input.pdf");
for (int i = 0; i < raw3DContents.Count; i++)
{
    File.WriteAllBytes("raw-3d-" + i, raw3DContents[i]);
}
```

### See Also

* class [PdfFormat](../)
* namespace [Aspose.ThreeD.Formats](../../pdfformat/)
* assembly [Aspose.3D](../../../)



---
title: Enum TiffCompression
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.Saving.TiffCompression enum. Specifies what type of compression to use when saving a document to the TIFF format
type: docs
weight: 960
url: /net/aspose.note.saving/tiffcompression/
---
## TiffCompression enumeration

Specifies what type of compression to use when saving a document to the TIFF format.

```csharp
public enum TiffCompression
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `1` | Specifies no compression. |
| Rle | `2` | Specifies RLE compression. |
| Ccitt3 | `3` | Specifies CCITT Group 3 fax encoding. |
| Ccitt4 | `4` | Specifies CCITT Group 4 fax encoding. |
| Lzw | `5` | Specifies LZW compression. |
| PackBits | `32773` | Specifies Macintosh RLE compression. |
| Jpeg | `7` | Specifies JPEG DCT compression compression. |

## Examples

Shows how to save a document as image in Tiff format using PackBits compression.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();

// Load the document into Aspose.Note.
Document oneFile = new Document(Path.Combine(dataDir, "Aspose.one"));

var dst = Path.Combine(dataDir, "SaveToTiffUsingPackBitsCompression.tiff");

// Save the document.
oneFile.Save(dst, new ImageSaveOptions(SaveFormat.Tiff)
                      {
                          TiffCompression = TiffCompression.PackBits
                      });
```

Shows how to save a document as image in Tiff format using Jpeg compression.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();

// Load the document into Aspose.Note.
Document oneFile = new Document(Path.Combine(dataDir, "Aspose.one"));

var dst = Path.Combine(dataDir, "SaveToTiffUsingJpegCompression.tiff");

// Save the document.
oneFile.Save(dst, new ImageSaveOptions(SaveFormat.Tiff)
                      {
                          TiffCompression = TiffCompression.Jpeg,
                          Quality = 93
                      });
```

Shows how to save a document as image in Tiff format using CCITT Group 3 fax compression.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();

// Load the document into Aspose.Note.
Document oneFile = new Document(Path.Combine(dataDir, "Aspose.one"));

var dst = Path.Combine(dataDir, "SaveToTiffUsingCcitt3Compression.tiff");

// Save the document.
oneFile.Save(dst, new ImageSaveOptions(SaveFormat.Tiff)
                      {
                          ColorMode = ColorMode.BlackAndWhite,
                          TiffCompression = TiffCompression.Ccitt3
                      });
```

### See Also

* namespace [Aspose.Note.Saving](../../aspose.note.saving/)
* assembly [Aspose.Note](../../)



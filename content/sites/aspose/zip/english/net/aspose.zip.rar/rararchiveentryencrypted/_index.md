---
title: Class RarArchiveEntryEncrypted
second_title: Aspose.ZIP for .NET API Reference
description: Aspose.Zip.Rar.RarArchiveEntryEncrypted class. Zip entry that needs to be decompressed with decryption
type: docs
weight: 540
url: /net/aspose.zip.rar/rararchiveentryencrypted/
---
## RarArchiveEntryEncrypted class

Zip entry that needs to be decompressed with decryption.

```csharp
public sealed class RarArchiveEntryEncrypted : RarArchiveEntry
```

## Properties

| Name | Description |
| --- | --- |
| [CompressedSize](../../aspose.zip.rar/rararchiveentry/compressedsize/) { get; } | Gets the size of a compressed file. |
| [CreationTime](../../aspose.zip.rar/rararchiveentry/creationtime/) { get; } | Gets creation date and time. |
| [IsDirectory](../../aspose.zip.rar/rararchiveentry/isdirectory/) { get; } | Gets a value indicating whether the entry represents a directory. |
| [LastAccessTime](../../aspose.zip.rar/rararchiveentry/lastaccesstime/) { get; } | Gets last access date and time. |
| [ModificationTime](../../aspose.zip.rar/rararchiveentry/modificationtime/) { get; } | Gets last modified date and time. |
| [Name](../../aspose.zip.rar/rararchiveentry/name/) { get; } | Gets name of the entry within the archive. |
| [UncompressedSize](../../aspose.zip.rar/rararchiveentry/uncompressedsize/) { get; } | Gets the size of an original file. |

## Methods

| Name | Description |
| --- | --- |
| [Extract](../../aspose.zip.rar/rararchiveentry/extract/)(Stream, string) | Extracts the entry to the stream provided. |
| [Extract](../../aspose.zip.rar/rararchiveentry/extract/)(string, string) | Extracts the entry to the filesystem by the path provided. |
| [Open](../../aspose.zip.rar/rararchiveentry/open/)(string) | Opens the entry for extraction and provides a stream with decompressed entry content. |

## Events

| Name | Description |
| --- | --- |
| event [ExtractionProgressed](../../aspose.zip.rar/rararchiveentry/extractionprogressed/) | Raises when a portion of raw stream extracted. |

### See Also

* class [RarArchiveEntry](../rararchiveentry/)
* namespace [Aspose.Zip.Rar](../../aspose.zip.rar/)
* assembly [Aspose.Zip](../../)



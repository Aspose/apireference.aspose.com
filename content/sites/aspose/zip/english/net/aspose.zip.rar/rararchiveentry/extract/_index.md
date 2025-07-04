---
title: RarArchiveEntry.Extract
second_title: Aspose.ZIP for .NET API Reference
description: RarArchiveEntry method. Extracts the entry to the filesystem by the path provided
type: docs
weight: 90
url: /net/aspose.zip.rar/rararchiveentry/extract/
---
## Extract(string, string) {#extract}

Extracts the entry to the filesystem by the path provided.

```csharp
public FileInfo Extract(string path, string password = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | The path to destination file. If the file already exists, it will be overwritten. |
| password | String | Optional password for decryption. |

### Return Value

The file info of the composed file.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *path* is null. |
| SecurityException | The caller does not have the required permission to access. |
| ArgumentException | The *path* is empty, contains only white spaces, or contains invalid characters. |
| UnauthorizedAccessException | Access to file *path* is denied. |
| PathTooLongException | The specified *path*, file name, or both exceed the system-defined maximum length. For example, on Windows-based platforms, paths must be less than 248 characters, and file names must be less than 260 characters. |
| NotSupportedException | File at *path* contains a colon (:) in the middle of the string. |
| FileNotFoundException | The file is not found. |
| DirectoryNotFoundException | The specified path is invalid, such as being on an unmapped drive. |
| IOException | The file is already open. |
| InvalidDataException | Data is corrupted. -or- CRC or MAC verification failed for the entry. |
| OperationCanceledException | In .NET Framework 4.0 and above: Thrown when the extraction is canceled via the provided cancellation token. |

## Examples

Extract two entries of rar archive.

```csharp
using (FileStream rarFile = File.Open("archive.rar", FileMode.Open))
{
    using (RarArchive archive = new RarArchive(rarFile))
    {
        archive.Entries[0].Extract("first.bin", "pass");
        archive.Entries[1].Extract("second.bin", "pass");
    }
}
```

### See Also

* class [RarArchiveEntry](../)
* namespace [Aspose.Zip.Rar](../../rararchiveentry/)
* assembly [Aspose.Zip](../../../)

---

## Extract(Stream, string) {#extract_1}

Extracts the entry to the stream provided.

```csharp
public void Extract(Stream destination, string password = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| destination | Stream | Destination stream. Must be writable. |
| password | String | Optional password for decryption. |

### Exceptions

| exception | condition |
| --- | --- |
| InvalidDataException | CRC or MAC verification failed for the entry. |
| ArgumentException | *destination* does not support writing. |
| InvalidDataException | Data is corrupted. -or- CRC or MAC verification failed for the entry. |
| OperationCanceledException | In .NET Framework 4.0 and above: Thrown when the extraction is canceled via the provided cancellation token. |

## Examples

Extract an entry of rar archive with password.

```csharp
using (FileStream rarFile = File.Open("archive.zip", FileMode.Open))
{
    using (RarArchive archive = new RarArchive(rarFile))
    {
        archive.Entries[0].Extract(httpResponseStream, "p@s$");
    }
}
```

### See Also

* class [RarArchiveEntry](../)
* namespace [Aspose.Zip.Rar](../../rararchiveentry/)
* assembly [Aspose.Zip](../../../)



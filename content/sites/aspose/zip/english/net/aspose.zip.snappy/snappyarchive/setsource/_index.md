---
title: SnappyArchive.SetSource
second_title: Aspose.ZIP for .NET API Reference
description: SnappyArchive method. Sets the content to be compressed within the archive
type: docs
weight: 60
url: /net/aspose.zip.snappy/snappyarchive/setsource/
---
## SetSource(Stream) {#setsource_1}

Sets the content to be compressed within the archive.

```csharp
public void SetSource(Stream source)
```

| Parameter | Type | Description |
| --- | --- | --- |
| source | Stream | The input stream for the archive. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | The *source* stream is unseekable. |
| ObjectDisposedException | Archive has been disposed and cannot be used. |

## Examples

```csharp
using (var archive = new SnappyArchive())
{
    archive.SetSource(new MemoryStream(new byte[] { 0x00, 0xFF }));
    archive.Save("archive.snappy");
}
```

### See Also

* class [SnappyArchive](../)
* namespace [Aspose.Zip.Snappy](../../snappyarchive/)
* assembly [Aspose.Zip](../../../)

---

## SetSource(FileInfo) {#setsource}

Sets the content to be compressed within the archive.

```csharp
public void SetSource(FileInfo fileInfo)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fileInfo | FileInfo | FileInfo, which will be opened as input stream. |

### Exceptions

| exception | condition |
| --- | --- |
| SecurityException | The caller does not have the required permission to open the *fileInfo*. |
| ArgumentException | The file path is empty or contains only white spaces. |
| FileNotFoundException | The file is not found. |
| UnauthorizedAccessException | Path to file is read-only or is a directory. |
| ArgumentNullException | *fileInfo* is null. |
| DirectoryNotFoundException | The specified path is invalid, such as being on an unmapped drive. |
| IOException | The file is already open. |
| ObjectDisposedException | Archive has been disposed and cannot be used. |

## Examples

```csharp
using (var archive = new SnappyArchive()) 
{
    archive.SetSource(new FileInfo("data.bin"));
    archive.Save("archive.snappy");
}
```

### See Also

* class [SnappyArchive](../)
* namespace [Aspose.Zip.Snappy](../../snappyarchive/)
* assembly [Aspose.Zip](../../../)

---

## SetSource(string) {#setsource_2}

Sets the content to be compressed within the archive.

```csharp
public void SetSource(string sourcePath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourcePath | String | Path to file which will be opened as input stream. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *sourcePath* is null. |
| SecurityException | The caller does not have the required permission to access. |
| ArgumentException | The *sourcePath* is empty, contains only white spaces, or contains invalid characters. |
| UnauthorizedAccessException | Access to file *sourcePath* is denied. |
| PathTooLongException | The specified *sourcePath*, file name, or both exceed the system-defined maximum length. For example, on Windows-based platforms, paths must be less than 248 characters, and file names must be less than 260 characters. |
| NotSupportedException | File at *sourcePath* contains a colon (:) in the middle of the string. |
| ObjectDisposedException | Archive has been disposed and cannot be used. |

## Examples

```csharp
using (var archive = new SnappyArchive()) 
{
    archive.SetSource("data.bin");
    archive.Save("archive.snappy");
}
```

### See Also

* class [SnappyArchive](../)
* namespace [Aspose.Zip.Snappy](../../snappyarchive/)
* assembly [Aspose.Zip](../../../)



---
title: XzArchive.Save
second_title: Aspose.ZIP for .NET API Reference
description: XzArchive method. Saves xz archive to the stream provided
type: docs
weight: 50
url: /net/aspose.zip.xz/xzarchive/save/
---
## Save(Stream) {#save}

Saves xz archive to the stream provided.

```csharp
public void Save(Stream output)
```

| Parameter | Type | Description |
| --- | --- | --- |
| output | Stream | Destination stream. |

### Exceptions

| exception | condition |
| --- | --- |
| ObjectDisposedException | Archive has been disposed and cannot be used. |
| ArgumentException | *output* does not support seeking. |
| ArgumentNullException | *output* is null. |

## Remarks

*output* must be seekable.

## Examples

```csharp
using (FileStream xzFile = File.Open("archive.xz", FileMode.Create))
{
    using (var archive = new XzArchive())
    {
        archive.SetSource("data.bin");
        archive.Save(xzFile);
     }
}
```

### See Also

* class [XzArchive](../)
* namespace [Aspose.Zip.Xz](../../xzarchive/)
* assembly [Aspose.Zip](../../../)

---

## Save(string) {#save_1}

Saves xz archive to the destination file provided.

```csharp
public void Save(string destinationFileName)
```

| Parameter | Type | Description |
| --- | --- | --- |
| destinationFileName | String | The path of the archive to be created. If the specified file name points to an existing file, it will be overwritten. |

### Exceptions

| exception | condition |
| --- | --- |
| ObjectDisposedException | Archive has been disposed and cannot be used. |
| ArgumentNullException | *destinationFileName* is null. |
| SecurityException | The caller does not have the required permission to access. |
| ArgumentException | The *destinationFileName* is empty, contains only white spaces, or contains invalid characters. |
| UnauthorizedAccessException | Access to file *destinationFileName* is denied. |
| PathTooLongException | The specified *destinationFileName*, file name, or both exceed the system-defined maximum length. For example, on Windows-based platforms, paths must be less than 248 characters, and file names must be less than 260 characters. |
| NotSupportedException | File at *destinationFileName* contains a colon (:) in the middle of the string. |

## Examples

```csharp
using (var archive = new XzArchive()) 
{
    archive.SetSource(new FileInfo("data.bin"));
    archive.Save("result.xz");
}
```

### See Also

* class [XzArchive](../)
* namespace [Aspose.Zip.Xz](../../xzarchive/)
* assembly [Aspose.Zip](../../../)



---
title: RarArchive.RarArchive
second_title: Aspose.ZIP for .NET API Reference
description: RarArchive constructor. Initializes a new instance of the RarArchive class and composes an entry list can be extracted from the archive
type: docs
weight: 10
url: /net/aspose.zip.rar/rararchive/rararchive/
---
## RarArchive(string, RarArchiveLoadOptions) {#constructor_1}

Initializes a new instance of the [`RarArchive`](../) class and composes an entry list can be extracted from the archive.

```csharp
public RarArchive(string path, RarArchiveLoadOptions loadOptions = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | The fully qualified or the relative path to the archive file. |
| loadOptions | RarArchiveLoadOptions | Options to load existing archive with. |

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

## Remarks

This constructor does not decompress any entry. See [`Open`](../../rararchiveentry/open/) method for decompressing.

## Examples

The following example extracts an archive, then decompress first entry to a `MemoryStream`.

```csharp
var extracted = new MemoryStream();
using (RarArchive archive = new RarArchive("data.rar"))
{
    using (var decompressed = archive.Entries[0].Open())
    {
        byte[] b = new byte[8192];
        int bytesRead;
        while (0 < (bytesRead = decompressed.Read(b, 0, b.Length)))
            extracted.Write(b, 0, bytesRead);
    }
}
```

### See Also

* class [RarArchiveLoadOptions](../../rararchiveloadoptions/)
* class [RarArchive](../)
* namespace [Aspose.Zip.Rar](../../rararchive/)
* assembly [Aspose.Zip](../../../)

---

## RarArchive(Stream, RarArchiveLoadOptions) {#constructor}

Initializes a new instance of the [`RarArchive`](../) class and composes an entry list can be extracted from the archive.

```csharp
public RarArchive(Stream sourceStream, RarArchiveLoadOptions loadOptions = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| sourceStream | Stream | The source of the archive. |
| loadOptions | RarArchiveLoadOptions | Options to load existing archive with. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | *sourceStream* is not seekable. |
| InvalidDataException | Wrong signature for archive. - or - The file is not a RAR archive. |

## Remarks

This constructor does not decompress any entry. See [`Open`](../../rararchiveentry/open/) method for decompressing.

## Examples

The following example decipher and decompress first entry to a `MemoryStream`.

```csharp
var fs = File.OpenRead("encrypted.rar");
var extracted = new MemoryStream();
using (RarArchive archive = new RarArchive(fs, new RarArchiveLoadOptions() { DecryptionPassword = "p@s$" }))
{
    using (var decompressed = archive.Entries[0].Open())
    {
        byte[] b = new byte[8192];
        int bytesRead;
        while (0 < (bytesRead = decompressed.Read(b, 0, b.Length)))
            extracted.Write(b, 0, bytesRead);
    }
}
```

### See Also

* class [RarArchiveLoadOptions](../../rararchiveloadoptions/)
* class [RarArchive](../)
* namespace [Aspose.Zip.Rar](../../rararchive/)
* assembly [Aspose.Zip](../../../)



---
title: TarArchive.SaveZCompressed
second_title: Aspose.ZIP for .NET API Reference
description: TarArchive method. Saves archive to the stream with Z compression
type: docs
weight: 210
url: /net/aspose.zip.tar/tararchive/savezcompressed/
---
## SaveZCompressed(Stream, TarFormat?) {#savezcompressed}

Saves archive to the stream with Z compression.

```csharp
public void SaveZCompressed(Stream output, TarFormat? format = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| output | Stream | Destination stream. |
| format | Nullable`1 | Defines the tar header format. Null value will be treated as USTar when possible. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *output* is null. |
| ArgumentException | *output* is not writable. |
| ObjectDisposedException | Archive has been disposed and cannot be used |

## Remarks

*output* must be writable.

## Examples

```csharp
using (FileStream result = File.OpenWrite("result.tar.Z"))
{
    using (FileStream source = File.Open("data.bin", FileMode.Open, FileAccess.Read))
    {
        using (var archive = new TarArchive())
        {
            archive.CreateEntry("entry.bin", source);
            archive.SaveZCompressed(result);
        }
    }
}
```

### See Also

* enum [TarFormat](../../tarformat/)
* class [TarArchive](../)
* namespace [Aspose.Zip.Tar](../../tararchive/)
* assembly [Aspose.Zip](../../../)

---

## SaveZCompressed(string, TarFormat?) {#savezcompressed_1}

Saves archive to the path by path with Z compression.

```csharp
public void SaveZCompressed(string path, TarFormat? format = default)
```

| Parameter | Type | Description |
| --- | --- | --- |
| path | String | The path of the archive to be created. If the specified file name points to an existing file, it will be overwritten. |
| format | Nullable`1 | Defines the tar header format. Null value will be treated as USTar when possible. |

### Exceptions

| exception | condition |
| --- | --- |
| UnauthorizedAccessException | The caller does not have the required permission. -or- *path* specified a read-only file or directory. |
| ArgumentException | *path* is a zero-length string, contains only white space, or contains one or more invalid characters as defined by InvalidPathChars. |
| ArgumentNullException | *path* is null. |
| PathTooLongException | The specified *path*, file name, or both exceed the system-defined maximum length. For example, on Windows-based platforms, paths must be less than 248 characters, and file names must be less than 260 characters. |
| DirectoryNotFoundException | The specified *path* is invalid, (for example, it is on an unmapped drive). |
| NotSupportedException | *path* is in an invalid format. |
| ObjectDisposedException | Archive has been disposed and cannot be used |

## Examples

```csharp
using (FileStream source = File.Open("data.bin", FileMode.Open, FileAccess.Read))
{
    using (var archive = new TarArchive())
    {
        archive.CreateEntry("entry.bin", source);
        archive.SaveZCompressed("result.tar.Z");
    }
}
```

### See Also

* enum [TarFormat](../../tarformat/)
* class [TarArchive](../)
* namespace [Aspose.Zip.Tar](../../tararchive/)
* assembly [Aspose.Zip](../../../)



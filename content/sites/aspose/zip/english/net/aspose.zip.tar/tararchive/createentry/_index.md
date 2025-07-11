---
title: TarArchive.CreateEntry
second_title: Aspose.ZIP for .NET API Reference
description: TarArchive method. Create a single entry within the archive
type: docs
weight: 110
url: /net/aspose.zip.tar/tararchive/createentry/
---
## CreateEntry(string, Stream, FileSystemInfo) {#createentry_1}

Create a single entry within the archive.

```csharp
public TarEntry CreateEntry(string name, Stream source, FileSystemInfo fileInfo = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | The name of the entry. |
| source | Stream | The input stream for the entry. |
| fileInfo | FileSystemInfo | The metadata of file or folder to be compressed. |

### Return Value

Tar entry instance.

### Exceptions

| exception | condition |
| --- | --- |
| PathTooLongException | *name* is too long for tar as of IEEE 1003.1-1998 standard. |
| ArgumentException | File name, as a part of *name*, exceeds 100 symbols. |
| ObjectDisposedException | Archive has been disposed and cannot be used |

## Remarks

The entry name is solely set within *name* parameter. The file name provided in *fileInfo* parameter does not affect the entry name.

*fileInfo* can refer to DirectoryInfo if the entry is directory.

## Examples

```csharp
using (var archive = new TarArchive())
{
   archive.CreateEntry("bytes", new MemoryStream(new byte[] {0x00, 0xFF}));
   archive.Save(tarFile);
}
```

### See Also

* class [TarEntry](../../tarentry/)
* class [TarArchive](../)
* namespace [Aspose.Zip.Tar](../../tararchive/)
* assembly [Aspose.Zip](../../../)

---

## CreateEntry(string, FileInfo, bool) {#createentry}

Create a single entry within the archive.

```csharp
public TarEntry CreateEntry(string name, FileInfo fileInfo, bool openImmediately = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | The name of the entry. |
| fileInfo | FileInfo | The metadata of file or folder to be compressed. |
| openImmediately | Boolean | True, if open the file immediately, otherwise open the file on archive saving. |

### Return Value

Tar entry instance.

### Exceptions

| exception | condition |
| --- | --- |
| PathTooLongException | *name* is too long for tar as of IEEE 1003.1-1998 standard. |
| ArgumentException | File name, as a part of *name*, exceeds 100 symbols. |
| ObjectDisposedException | Archive has been disposed and cannot be used |

## Remarks

The entry name is solely set within *name* parameter. The file name provided in *fileInfo* parameter does not affect the entry name.

*fileInfo* can refer to DirectoryInfo if the entry is directory.

If the file is opened immediately with *openImmediately* parameter it becomes blocked until archive is disposed.

## Examples

```csharp
FileInfo fi = new FileInfo("data.bin");
using (var archive = new TarArchive())
{
   archive.CreateEntry("data.bin", fi);
   archive.Save(tarFile);
}
```

### See Also

* class [TarEntry](../../tarentry/)
* class [TarArchive](../)
* namespace [Aspose.Zip.Tar](../../tararchive/)
* assembly [Aspose.Zip](../../../)

---

## CreateEntry(string, string, bool) {#createentry_2}

Create a single entry within the archive.

```csharp
public TarEntry CreateEntry(string name, string path, bool openImmediately = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| name | String | The name of the entry. |
| path | String | Path to file to be compressed. |
| openImmediately | Boolean | True, if open the file immediately, otherwise open the file on archive saving. |

### Return Value

Tar entry instance.

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *path* is null. |
| SecurityException | The caller does not have the required permission to access. |
| ArgumentException | The *path* is empty, contains only white spaces, or contains invalid characters. - or - File name, as a part of *name*, exceeds 100 symbols. |
| UnauthorizedAccessException | Access to file *path* is denied. |
| PathTooLongException | The specified *path*, file name, or both exceed the system-defined maximum length. For example, on Windows-based platforms, paths must be less than 248 characters, and file names must be less than 260 characters. - or - *name* is too long for tar as of IEEE 1003.1-1998 standard. |
| NotSupportedException | File at *path* contains a colon (:) in the middle of the string. |
| ObjectDisposedException | Archive has been disposed and cannot be used |

## Remarks

The entry name is solely set within *name* parameter. The file name provided in *path* parameter does not affect the entry name.

If the file is opened immediately with *openImmediately* parameter it becomes blocked until archive is disposed.

## Examples

```csharp
using (var archive = new TarArchive())
{
    archive.CreateEntry("first.bin", "data.bin");
    archive.Save(outputTarFile);
}
```

### See Also

* class [TarEntry](../../tarentry/)
* class [TarArchive](../)
* namespace [Aspose.Zip.Tar](../../tararchive/)
* assembly [Aspose.Zip](../../../)



---
title: GzipArchive.ExtractToDirectory
second_title: Aspose.ZIP for .NET API Reference
description: GzipArchive method. Extracts content of the archive to the directory provided
type: docs
weight: 60
url: /net/aspose.zip.gzip/gziparchive/extracttodirectory/
---
## GzipArchive.ExtractToDirectory method

Extracts content of the archive to the directory provided.

```csharp
public void ExtractToDirectory(string destinationDirectory)
```

| Parameter | Type | Description |
| --- | --- | --- |
| destinationDirectory | String | The path to the directory to place the extracted files in. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | *destinationDirectory* is null. |
| PathTooLongException | The specified path, file name, or both exceed the system-defined maximum length. For example, on Windows-based platforms, paths must be less than 248 characters and file names must be less than 260 characters. |
| SecurityException | The caller does not have the required permission to access the existing directory. |
| NotSupportedException | If the directory does not exist, path contains a colon character (:) that is not part of a drive label ("C:\"). |
| ArgumentException | *destinationDirectory* is a zero-length string, contains only white space, or contains one or more invalid characters. You can query for invalid characters by using the System.IO.Path.GetInvalidPathChars method. -or- path is prefixed with, or contains, only a colon character (:). |
| IOException | The directory specified by path is a file. -or- The network name is not known. |
| OperationCanceledException | In .NET Framework 4.0 and above: Thrown when the extraction is canceled via the provided cancellation token. |
| ObjectDisposedException | Archive has been disposed and cannot be used. |

## Remarks

If the directory does not exist, it will be created.

### See Also

* class [GzipArchive](../)
* namespace [Aspose.Zip.Gzip](../../gziparchive/)
* assembly [Aspose.Zip](../../../)



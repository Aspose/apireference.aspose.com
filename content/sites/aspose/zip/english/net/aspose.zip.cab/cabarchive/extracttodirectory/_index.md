---
title: CabArchive.ExtractToDirectory
second_title: Aspose.ZIP for .NET API Reference
description: CabArchive method. Extracts all the files in the archive to the directory provided
type: docs
weight: 40
url: /net/aspose.zip.cab/cabarchive/extracttodirectory/
---
## CabArchive.ExtractToDirectory method

Extracts all the files in the archive to the directory provided.

```csharp
public void ExtractToDirectory(string destinationDirectory)
```

| Parameter | Type | Description |
| --- | --- | --- |
| destinationDirectory | String | The path to the directory to place the extracted files in. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | path is null |
| PathTooLongException | The specified path, file name, or both exceed the system-defined maximum length. |
| SecurityException | The caller does not have the required permission to access the existing directory. |
| NotSupportedException | If the directory does not exist, a path contains a colon character (:) that is not part of a drive label ("C:\"). |
| ArgumentException | path is a zero-length string, contains only white space, or contains one or more invalid characters. You can query for invalid characters by using the System.IO.Path.GetInvalidPathChars method. -or- path is prefixed with, or contains, only a colon character (:). |
| IOException | The directory specified by path is a file. -or- The network name is not known. |
| InvalidDataException | The archive is corrupted. |
| ObjectDisposedException | Archive has been disposed and cannot be used. |
| OperationCanceledException | In .NET Framework 4.0 and above: Thrown when the extraction is canceled via the provided cancellation token. |

## Remarks

If the directory does not exist, it will be created.

## Examples

```csharp
using (var archive = new CabArchive("archive.cab")) 
{ 
   archive.ExtractToDirectory("C:\extracted");
}
```

### See Also

* class [CabArchive](../)
* namespace [Aspose.Zip.Cab](../../cabarchive/)
* assembly [Aspose.Zip](../../../)



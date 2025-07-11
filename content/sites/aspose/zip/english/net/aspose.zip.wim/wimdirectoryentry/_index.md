---
title: Class WimDirectoryEntry
second_title: Aspose.ZIP for .NET API Reference
description: Aspose.Zip.Wim.WimDirectoryEntry class. Represents a single directory within wim archive
type: docs
weight: 1020
url: /net/aspose.zip.wim/wimdirectoryentry/
---
## WimDirectoryEntry class

Represents a single directory within wim archive.

```csharp
public sealed class WimDirectoryEntry : WimEntry
```

## Properties

| Name | Description |
| --- | --- |
| [AllEntries](../../aspose.zip.wim/wimdirectoryentry/allentries/) { get; } | Gets all entries of [`WimEntry`](../wimentry/) type constituting the directory recursively. |
| [AlternateDataStreams](../../aspose.zip.wim/wimentry/alternatedatastreams/) { get; } | Gets the names of the alternate data streams for a file or directory. |
| [Archive](../../aspose.zip.wim/wimentry/archive/) { get; } | Gets the archive the entry belongs to. |
| [ChangeTime](../../aspose.zip.wim/wimentry/changetime/) { get; } | Gets the last time the file or directory was changed. |
| [CreationTime](../../aspose.zip.wim/wimentry/creationtime/) { get; } | Gets the creation time of the file or directory. |
| [Directories](../../aspose.zip.wim/wimdirectoryentry/directories/) { get; } | Gets entries of `WimDirectoryEntry` type constituting the directory. |
| [FileAttributes](../../aspose.zip.wim/wimentry/fileattributes/) { get; } | Gets the file or directory attributes. |
| [Files](../../aspose.zip.wim/wimdirectoryentry/files/) { get; } | Gets entries of [`WimFileEntry`](../wimfileentry/) type constituting the directory. |
| [FilesAndDirectories](../../aspose.zip.wim/wimdirectoryentry/filesanddirectories/) { get; } | Gets entries of [`WimEntry`](../wimentry/) type constituting the directory. |
| [FullPath](../../aspose.zip.wim/wimentry/fullpath/) { get; } | Gets a full path of the entry within the image. |
| [HardLink](../../aspose.zip.wim/wimentry/hardlink/) { get; } | Gets the hardlink id of the file or directory. |
| [HasHardLinks](../../aspose.zip.wim/wimentry/hashardlinks/) { get; } | Gets whether the file or directory is known by other names. |
| [Image](../../aspose.zip.wim/wimentry/image/) { get; } | Gets the image the entry belongs to. |
| [IsDirectory](../../aspose.zip.wim/wimentry/isdirectory/) { get; } | Gets a value indicating whether the entry represents a directory. |
| [LastAccessTime](../../aspose.zip.wim/wimentry/lastaccesstime/) { get; } | Gets the last access time of the file or directory. |
| [ModificationTime](../../aspose.zip.wim/wimentry/modificationtime/) { get; } | Gets the modification time of the file or directory. |
| [Name](../../aspose.zip.wim/wimentry/name/) { get; } | Gets name of the entry within the image. |
| [Parent](../../aspose.zip.wim/wimentry/parent/) { get; } | Gets the parent directory the entry belongs to. |
| [ShortName](../../aspose.zip.wim/wimentry/shortname/) { get; } | Gets short name of the entry within the image. |

## Methods

| Name | Description |
| --- | --- |
| [ExtractToDirectory](../../aspose.zip.wim/wimdirectoryentry/extracttodirectory/)(string) | Extracts all the files in the current directory to the directory provided. |
| override [ToString](../../aspose.zip.wim/wimentry/tostring/)() |  |

### See Also

* class [WimEntry](../wimentry/)
* namespace [Aspose.Zip.Wim](../../aspose.zip.wim/)
* assembly [Aspose.Zip](../../)



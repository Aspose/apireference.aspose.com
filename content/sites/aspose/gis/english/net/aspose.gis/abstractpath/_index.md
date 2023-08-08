---
title: Class AbstractPath
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.AbstractPath class. An AbstractPath is a base class for classes that specify a unique location in an environment similar to a filesystem like a local filesystem a remote file storage or a ZIP archive among others
type: docs
weight: 10
url: /net/aspose.gis/abstractpath/
---
## AbstractPath class

An `AbstractPath` is a base class for classes that specify a unique location in an environment similar to a filesystem, like a local filesystem, a remote file storage or a ZIP archive, among others.

```csharp
public abstract class AbstractPath
```

## Properties

| Name | Description |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Gets a string representation of the location of this `AbstractPath`. |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Gets a separator character used to separate directory levels of the [`Location`](./location/) string. |

## Methods

| Name | Description |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | Creates an `AbstractPath` that represents a location on the local filesystem. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | Creates an `AbstractPath` from a Stream. |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Combines this `AbstractPath` with specified path components. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Deletes a file pointed to by this path. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Returns the extension of this `AbstractPath`. |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Returns the file name and extension of this `AbstractPath`. |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Returns the file name of this `AbstractPath` without the extension. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Gets a value indicating whether this path points to an existing file that can be opened for reading. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Returns paths located inside this `AbstractPath`, if it's a directory. |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Opens this `AbstractPath` as a file. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Returns a new `AbstractPath` with the file extension changed to the specified value. |

## Remarks

An `AbstractPath` might specify a location on a local filesystem, a location on a remote filesystem or an external storage like the Azure Blob storage, and so on. The location might point to an existing or not existing file-like objects, directory-like objects, or have any other meaning reasonable for the environment it belongs to. As an example, an `AbstractPath` inheritor that represents a location on the local filesystem can point to an existing file, directory, or to a place in the filesystem that has not been created yet. In order to make a new filesystem-like storage available to `Aspose.GIS`, one should inherit this class and implement its abstract methods.

### See Also

* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)



---
title: Class MultiStreamPath
second_title: Aspose.GIS for .NET API Reference
description: Aspose.Gis.MultiStreamPath class. This class works with formats which contains several files
type: docs
weight: 3430
url: /net/aspose.gis/multistreampath/
---
## MultiStreamPath class

This class works with formats which contains several files.

```csharp
public class MultiStreamPath : AbstractPath, IDisposable
```

## Constructors

| Name | Description |
| --- | --- |
| [MultiStreamPath](multistreampath/)(string, Dictionary&lt;string, Stream&gt;) | Create an instance of `MultiStreamPath`. |

## Properties

| Name | Description |
| --- | --- |
| override [Location](../../aspose.gis/multistreampath/location/) { get; } | Gets a string representation of the location of this `AbstractPath`. |
| override [Separator](../../aspose.gis/multistreampath/separator/) { get; } | Gets a separator character used to separate directory levels of the [`Location`](./location/) string. |
| [StreamSet](../../aspose.gis/multistreampath/streamset/) { get; } | A set of actual streams that are mapped to filenames. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Combines this [`AbstractPath`](../abstractpath/) with specified path components. |
| override [Delete](../../aspose.gis/multistreampath/delete/)() | Deletes a file pointed to by this path. |
| [Dispose](../../aspose.gis/multistreampath/dispose/)() | Destroy the object and its contents. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Returns the extension of this [`AbstractPath`](../abstractpath/). |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Returns the file name and extension of this [`AbstractPath`](../abstractpath/). |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Returns the file name of this [`AbstractPath`](../abstractpath/) without the extension. |
| override [IsFile](../../aspose.gis/multistreampath/isfile/)() | Gets a value indicating whether this path points to an existing file that can be opened for reading. |
| override [ListDirectory](../../aspose.gis/multistreampath/listdirectory/)() | Returns paths located inside this `AbstractPath`, if it's a directory. |
| override [Open](../../aspose.gis/multistreampath/open/)(FileAccess) | Abstracts a set of open streaming multi-file formats a path for accessing data. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Returns a new [`AbstractPath`](../abstractpath/) with the file extension changed to the specified value. |

### See Also

* class [AbstractPath](../abstractpath/)
* namespace [Aspose.Gis](../../aspose.gis/)
* assembly [Aspose.GIS](../../)



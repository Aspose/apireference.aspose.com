---
title: AbstractPath.Location
second_title: Aspose.GIS for .NET API Reference
description: AbstractPath property. Gets a string representation of the location of this AbstractPath
type: docs
weight: 30
url: /net/aspose.gis/abstractpath/location/
---
## AbstractPath.Location property

Gets a string representation of the location of this `AbstractPath`.

```csharp
public abstract string Location { get; }
```

## Remarks

Any two [`AbstractPath`](../)s that equal `Location`s point to the same file or directory. The string representation must use [`Separator`](../separator/) to separate directory levels.  As an example, for the local file system a location is a filesystem path, for Azure blobs it can be a path to the blob within a blob container.

### See Also

* class [AbstractPath](../)
* namespace [Aspose.Gis](../../abstractpath/)
* assembly [Aspose.GIS](../../../)



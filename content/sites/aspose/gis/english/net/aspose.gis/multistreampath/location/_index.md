---
title: MultiStreamPath.Location
second_title: Aspose.GIS for .NET API Reference
description: MultiStreamPath property. Gets a string representation of the location of this AbstractPath
type: docs
weight: 20
url: /net/aspose.gis/multistreampath/location/
---
## MultiStreamPath.Location property

Gets a string representation of the location of this `AbstractPath`.

```csharp
public override string Location { get; }
```

## Remarks

Any two [`AbstractPath`](../../abstractpath/)s that equal `Location`s point to the same file or directory. The string representation must use [`Separator`](../separator/) to separate directory levels.  As an example, for the local file system a location is a filesystem path, for Azure blobs it can be a path to the blob within a blob container.

### See Also

* class [MultiStreamPath](../)
* namespace [Aspose.Gis](../../multistreampath/)
* assembly [Aspose.GIS](../../../)



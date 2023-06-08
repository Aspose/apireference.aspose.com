---
title: GlbData.GetSatellitePaths
second_title: Aspose.CAD for .NET API Reference
description: GlbData method. Gets the list of satellite / dependency files for a given glTF file. This includes binary blobs and texture images
type: docs
weight: 550
url: /net/aspose.cad.fileformats.glb/glbdata/getsatellitepaths/
---
## GlbData.GetSatellitePaths method

Gets the list of satellite / dependency files for a given glTF file. This includes binary blobs and texture images.

```csharp
public static string[] GetSatellitePaths(string filePath)
```

| Parameter | Type | Description |
| --- | --- | --- |
| filePath | String | A valid file path. |

### Return Value

A list of relative file paths, as found in the file.

## Remarks

This method is designed to be as fast as possible, and it avoids performing much of the validation and parsing of a glTf file, it just blindly looks for URI fields.

### See Also

* class [GlbData](../)
* namespace [Aspose.CAD.FileFormats.GLB](../../glbdata/)
* assembly [Aspose.CAD](../../../)



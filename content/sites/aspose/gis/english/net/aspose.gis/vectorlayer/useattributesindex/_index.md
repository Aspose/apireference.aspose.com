---
title: VectorLayer.UseAttributesIndex
second_title: Aspose.GIS for .NET API Reference
description: VectorLayer method. Loads attribute index to speed up filtering by attributes value in filter methods like WhereGreater. If index does not exist creates it first. Use forceRebuild to force index recreation
type: docs
weight: 200
url: /net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

Loads attribute index to speed up filtering by attributes value in filter methods like [`WhereGreater`](../../featuressequence/wheregreater/). If index does not exist creates it first. Use *forceRebuild* to force index recreation.

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| indexPath | String | Path to the index file. |
| attributeName | String | Name of the attribute to build index on. |
| forceRebuild | Boolean | Whether to recreate index even if it already exists. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | Attribute with such name does not exist in the layer. |
| IOException | An I/O error occurred. |
| InvalidOperationException | Index for the specified attribute already loaded for this layer. |
| [GisException](../../gisexception/) | File exists and it is not an attribute index file created by Aspose.GIS. |

### See Also

* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

Loads attribute index to speed up filtering by attributes value in filter methods like [`WhereGreater`](../../featuressequence/wheregreater/). If index does not exist creates it first. Use *forceRebuild* to force index recreation.

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| Parameter | Type | Description |
| --- | --- | --- |
| indexPath | AbstractPath | Path to the index file. |
| attributeName | String | Name of the attribute to build index on. |
| forceRebuild | Boolean | Whether to recreate index even if it already exists. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Argument is `null`. |
| ArgumentException | Attribute with such name does not exist in the layer. |
| IOException | An I/O error occurred. |
| InvalidOperationException | Index for the specified attribute already loaded for this layer. |
| [GisException](../../gisexception/) | File exists and it is not an attribute index file created by Aspose.GIS. |

### See Also

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* namespace [Aspose.Gis](../../vectorlayer/)
* assembly [Aspose.GIS](../../../)



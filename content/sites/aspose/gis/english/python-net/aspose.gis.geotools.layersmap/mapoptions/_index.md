---
title: MapOptions Class
type: docs
weight: 30
url: /python-net/aspose.gis.geotools.layersmap/mapoptions/
---

**Summary:** Map Options for creating maps using [LayersMapBuilder](/psd/python-net/aspose.gis.geotools.layersmap/layersmapbuilder/)

**Module:** [aspose.gis.geotools.layersmap](/psd/python-net/aspose.gis.geotools.layersmap/)

**Full Name:** aspose.gis.geotools.layersmap.MapOptions

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [MapOptions()](#MapOptions__1) | Initializes a new instance of the MapOptions class |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| background_color | System.Drawing.Color | r/w | Background color of the map. Defaults to System.Drawing.Color.Transparent. |
| height | int | r/w | Visual height of the map. Defaults to 400. Used when [MapSizeModes.CUSTOM](/psd/python-net/aspose.gis.geotools.layersmap/mapsizemodes/). |
| layers | [MapLayerOptions[]](/psd/python-net/aspose.gis.geotools.layersmap/maplayeroptions) | r/w | A collection of options for vector layers to represent by Aspose.Gis.GeoTools.LayersMap.MapLayerOptions. |
| rasters | [MapRasterOptions[]](/psd/python-net/aspose.gis.geotools.layersmap/maprasteroptions) | r/w | A collection of options for rasters layers to represent by Aspose.Gis.GeoTools.LayersMap.MapRasterOptions. |
| renderer | [Renderer](/psd/python-net/aspose.gis.rendering/renderer/) | r/w | Renderer to use. Defaults to Aspose.Gis.Rendering.Renders.Jpeg. |
| size_mode | [MapSizeModes](/psd/python-net/aspose.gis.geotools.layersmap/mapsizemodes) | r/w | Size Mode. Defaults to [MapSizeModes.AUTO](/psd/python-net/aspose.gis.geotools.layersmap/mapsizemodes/) |
| spatial_reference | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r/w | Spatial Reference. Defaults to Aspose.Gis.SpatialReferencing.SpatialReferenceSystem.WebMercator. |
| tiles | [MapTilesOptions](/psd/python-net/aspose.gis.geotools.layersmap/maptilesoptions) | r/w | Tiles options. |
| width | int | r/w | Visual width of the map. Defaults to 400. Used when [MapSizeModes.CUSTOM](/psd/python-net/aspose.gis.geotools.layersmap/mapsizemodes/). |


### Constructor: MapOptions() {#MapOptions__1}


```
 MapOptions() 
```

Initializes a new instance of the MapOptions class


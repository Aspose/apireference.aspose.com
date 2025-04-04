---
title: PostGisOptions Class
type: docs
weight: 20
url: /python-net/aspose.gis.formats.postgis/postgisoptions/
---

**Summary:** Driver-specific options for PostGis format.<br/>            At the moment, the driver provides no customizable options.

**Module:** [aspose.gis.formats.postgis](/psd/python-net/aspose.gis.formats.postgis/)

**Full Name:** aspose.gis.formats.postgis.PostGisOptions

**Inheritance:** DatabaseDriverOptions

**Aspose.PSD Version:** 24.12.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [PostGisOptions()](#PostGisOptions__1) | Create new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| close_linear_ring | bool | r/w | Determines if close a unclosed [GeometryType.LINEAR_RING](/psd/python-net/aspose.gis.geometries/geometrytype/) in each geometry. Defaults to <see langword="false" />. |
| create_midpoints | bool | r/w | Determines if add a new point in the middle to each segment of geometry. Defaults to <see langword="false" />. |
| delete_near_points | bool | r/w | Determines if delete near points in each geometry. Defaults to <see langword="false" />. |
| delete_near_points_distance | double | r/w | Determines distance for [DriverOptions.delete_near_points](/psd/python-net/aspose.gis/driveroptions/). Defaults to <see langword="0" />. |
| linearization_tolerance | double | r/w | A tolerance to use to linearize curve geometries. |
| m_precision_model | [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel) | r/w | A [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel/) that will be applied to M coordinate<br/>            when geometries are added to the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) or when they are read from the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/).<br/>            The default value is [PrecisionModel.exact](/psd/python-net/aspose.gis/precisionmodel/). |
| simplify_segments | bool | r/w | Determines if delete points lying on the same segment in each geometry. Defaults to <see langword="false" />. |
| simplify_segments_distance | double | r/w | Determines distance for [DriverOptions.simplify_segments](/psd/python-net/aspose.gis/driveroptions/). Defaults to <see langword="0" />. |
| spatial_reference_system_mode | [SpatialReferenceSystemMode](/psd/python-net/aspose.gis/spatialreferencesystemmode) | r/w | Determines how the unknown geometries' SRS for the database should be handle when they are added to the layer.<br/>            The default value is [SpatialReferenceSystemMode.THROW_EXCEPTION](/psd/python-net/aspose.gis/spatialreferencesystemmode/). |
| validate_geometries_on_write | bool | r/w | Determines if geometries should be validated when they are added to the layer.<br/>            If set to <see langword="true" />, [Geometry.is_valid](/psd/python-net/aspose.gis.geometries/geometry/) is called for each<br/>            geometry when it's added to the layer, and if validation fails ([Geometry.is_valid](/psd/python-net/aspose.gis.geometries/geometry/) is <see langword="false" />), [GisException](/psd/python-net/aspose.gis/gisexception/) is thrown. |
| write_polygons_as_lines | bool | r/w | Determines if transformation of polygon or multipolygon to linestring is allowed. Defaults to <see langword="false" />. |
| xy_precision_model | [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel) | r/w | A [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel/) that will be applied to X and Y coordinates<br/>            when geometries are added to the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) or when they are read from the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/).<br/>            The default value is [PrecisionModel.exact](/psd/python-net/aspose.gis/precisionmodel/). |
| z_precision_model | [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel) | r/w | A [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel/) that will be applied to Z coordinate<br/>            when geometries are added to the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) or when they are read from the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/).<br/>            The default value is [PrecisionModel.exact](/psd/python-net/aspose.gis/precisionmodel/). |


### Constructor: PostGisOptions() {#PostGisOptions__1}


```
 PostGisOptions() 
```

Create new instance.


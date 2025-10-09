---
title: GeoJsonOptions Class
type: docs
weight: 20
url: /python-net/aspose.gis.formats.geojson/geojsonoptions/
---

**Summary:** Driver-specific options for GeoJSON format.

**Module:** [aspose.gis.formats.geojson](/psd/python-net/aspose.gis.formats.geojson/)

**Full Name:** aspose.gis.formats.geojson.GeoJsonOptions

**Inheritance:** DriverOptions

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [GeoJsonOptions()](#GeoJsonOptions__1) | Create new instance. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| array_as_string | bool | r/w | Whether to expose JSon arrays of strings, integers or reals as string. |
| attributes_skip | bool | r/w | controls translation of attributes: yes - skip all attributes |
| auto_id | [AutoIds](/psd/python-net/aspose.gis/autoids) | r/w | Auto-generate ids |
| close_linear_ring | bool | r/w | Determines if close a unclosed [GeometryType.LINEAR_RING](/psd/python-net/aspose.gis.geometries/geometrytype/) in each geometry. Defaults to <see langword="false" />. |
| create_midpoints | bool | r/w | Determines if add a new point in the middle to each segment of geometry. Defaults to <see langword="false" />. |
| date_as_string | bool | r/w | Whether to expose JSon date/time/date-time as string. |
| delete_near_points | bool | r/w | Determines if delete near points in each geometry. Defaults to <see langword="false" />. |
| delete_near_points_distance | double | r/w | Determines distance for [DriverOptions.delete_near_points](/psd/python-net/aspose.gis/driveroptions/). Defaults to <see langword="0" />. |
| description | string | r/w | Description at feature collection level (for layer creation) |
| geometry_as_collection | bool | r/w | control translation of geometries: yes - wrap geometries with GeometryCollection type |
| linearization_tolerance | double | r/w | A tolerance to use to linearize curve geometries. |
| m_precision_model | [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel) | r/w | A [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel/) that will be applied to M coordinate<br/>            when geometries are added to the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) or when they are read from the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/).<br/>            The default value is [PrecisionModel.exact](/psd/python-net/aspose.gis/precisionmodel/). |
| name | string | r/w | Name at feature collection level (for layer creation) |
| nested_properties_separator | string | r/w | Gets or sets a string that is used to separate components of nested attributes.<br/>            Default is "_". |
| read_bounding_boxes | bool | r/w | Determines if Bounding Boxes ('bbox') should be read as attributes with a name 'bbox_0', 'bbox_1', etc.<br/>            Default value is <see langword="false" />.<br/>            The [GeoJsonOptions.nested_properties_separator](/psd/python-net/aspose.gis.formats.geojson/geojsonoptions/) string is used in bbox_0, bbox_1,.. names. |
| simplify_segments | bool | r/w | Determines if delete points lying on the same segment in each geometry. Defaults to <see langword="false" />. |
| simplify_segments_distance | double | r/w | Determines distance for [DriverOptions.simplify_segments](/psd/python-net/aspose.gis/driveroptions/). Defaults to <see langword="0" />. |
| validate_geometries_on_write | bool | r/w | Determines if geometries should be validated when they are added to the layer.<br/>            If set to <see langword="true" />, [Geometry.is_valid](/psd/python-net/aspose.gis.geometries/geometry/) is called for each<br/>            geometry when it's added to the layer, and if validation fails ([Geometry.is_valid](/psd/python-net/aspose.gis.geometries/geometry/) is <see langword="false" />), [GisException](/psd/python-net/aspose.gis/gisexception/) is thrown. |
| write_bounding_boxes | bool | r/w | Determines if GeoJSON objects should be included information on the coordinate range for its Geometries.<br/>            If set to <see langword="true" />, a member "bbox" is generated for each geometry (not null) when it's added to the layer.<br/>            Default value is <see langword="false" />. |
| write_polygons_as_lines | bool | r/w | Determines if transformation of polygon or multipolygon to linestring is allowed. Defaults to <see langword="false" />. |
| write_unset_attribute | bool | r/w | Whether to write unset attributes by adding 'null' value |
| xy_precision_model | [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel) | r/w | A [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel/) that will be applied to X and Y coordinates<br/>            when geometries are added to the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) or when they are read from the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/).<br/>            The default value is [PrecisionModel.exact](/psd/python-net/aspose.gis/precisionmodel/). |
| z_precision_model | [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel) | r/w | A [PrecisionModel](/psd/python-net/aspose.gis/precisionmodel/) that will be applied to Z coordinate<br/>            when geometries are added to the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/) or when they are read from the [VectorLayer](/psd/python-net/aspose.gis/vectorlayer/).<br/>            The default value is [PrecisionModel.exact](/psd/python-net/aspose.gis/precisionmodel/). |


### Constructor: GeoJsonOptions() {#GeoJsonOptions__1}


```
 GeoJsonOptions() 
```

Create new instance.


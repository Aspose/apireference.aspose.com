---
title: Point Class
type: docs
weight: 300
url: /python-net/aspose.gis.geometries/point/
---

**Summary:** A [Point](/psd/python-net/aspose.gis.geometries/point/) represents a single location in coordinate space.

**Module:** [aspose.gis.geometries](/psd/python-net/aspose.gis.geometries/)

**Full Name:** aspose.gis.geometries.Point

**Inheritance:** IGeometry, IPoint, Geometry

**Aspose.PSD Version:** 25.9.0

## **Constructors**
| **Name** | **Description** |
| :- | :- |
| [Point()](#Point__1) | Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class. |
| [Point(other)](#Point_other_2) | Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class. |
| [Point(x, y)](#Point_x_y_3) | Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class. |
| [Point(x, y, z)](#Point_x_y_z_4) | Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class. |
| [Point(x, y, z, m)](#Point_x_y_z_m_5) | Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class. |
## **Properties**
| **Name** | **Type** | **Access** | **Description** |
| :- | :- | :- | :- |
| coordinate_dimension | int | r | Gets the number of coordinate dimensions for this [Geometry](/psd/python-net/aspose.gis.geometries/geometry/). |
| dimension | [GeometryDimension](/psd/python-net/aspose.gis.geometries/geometrydimension) | r | Gets the topological dimension of this [Geometry](/psd/python-net/aspose.gis.geometries/geometry/). |
| geometry_type | [GeometryType](/psd/python-net/aspose.gis.geometries/geometrytype) | r | Gets the type of the geometry. |
| has_curve_geometry | bool | r | Gets a value indicating whether this geometry is or contains curve (not linear) geometry. |
| has_m | bool | r/w | Gets a value indicating whether this instance has an M coordinate. |
| has_z | bool | r/w | Gets a value indicating whether this instance has Z coordinate. |
| is_empty | bool | r | Gets a value indicating whether this instance is empty. |
| is_simple | bool | r | Gets a value indicating whether this instance is simple from SFA point of view. |
| is_valid | bool | r | Gets a value indicating whether this instance is valid. |
| m | double | r/w | Gets or sets a value for the m-coordinate. |
| null [static] | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | r | Gets an instance of null geometry. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | r/w | Gets SpatialReferenceSystem of this instance.<br/>            This property can be <see langword="null" />, is SpatialReferenceSystem is unknown.<br/>            Assigning new SpatialReferenceSystem will not perform any coordinate transformation, only reference will change. |
| x | double | r/w | Gets or sets a value for the x-coordinate. |
| y | double | r/w | Gets or sets a value for the y-coordinate. |
| z | double | r/w | Gets or sets a value for the z-coordinate. |
## **Methods**
| **Name** | **Description** |
| :- | :- |
| [as_binary()](#as_binary__1) | Translates this geometry to its Well-Known Binary representation. |
| [as_binary(variant)](#as_binary_variant_2) | Translates this geometry to its Well-Known Binary representation. |
| [as_image(output_path, width, height, renderer, symbolizer)](#as_image_output_path_width_height_renderer_symbolizer_3) | Export this geometry to an image representation. |
| [as_image(output_path, width, height, renderer, symbolizer)](#as_image_output_path_width_height_renderer_symbolizer_4) | Export this geometry to an image representation. |
| [as_image(width, height, renderer, symbolizer)](#as_image_width_height_renderer_symbolizer_5) | Export this geometry to an image representation. |
| [as_text()](#as_text__6) | Translates this geometry to its Well-Known Text representation. |
| [as_text(variant)](#as_text_variant_7) | Translates this geometry to its Well-Known Text representation. |
| [as_text(variant, format)](#as_text_variant_format_8) | Translates this geometry to its Well-Known Text representation. |
| [clone()](#clone__9) | Clones this instance. |
| [covered_by(other)](#covered_by_other_10) | Determines whether this geometry is covered by a specified geometry. |
| [covers(other)](#covers_other_11) | Determines whether this geometry covers a specified geometry. |
| [crosses(other)](#crosses_other_12) | Determines if this geometry and a specified geometry cross. |
| [difference(other)](#difference_other_13) | Subtracts a specified geometry from this geometry. |
| [disjoint(other)](#disjoint_other_14) | Determines if this geometry is disjoint from a specified geometry. |
| [from_binary(wkb)](#from_binary_wkb_15) | Creates a geometry from its Well-Known Binary representation. |
| [from_binary(wkb, spatial_reference_system)](#from_binary_wkb_spatial_reference_system_16) | Creates a geometry from its Well-Known Binary representation. |
| [from_text(wkt)](#from_text_wkt_17) | Creates a geometry from its Well-Known Text representation. |
| [from_text(wkt, spatial_reference_system)](#from_text_wkt_spatial_reference_system_18) | Creates a geometry from its Well-Known Text representation. |
| [get_area()](#get_area__19) | Computes the area of this geometry. |
| [get_buffer(distance, quadrant_segments)](#get_buffer_distance_quadrant_segments_20) | Computes a buffer region around this geometry. |
| [get_centroid()](#get_centroid__21) | Computes the centroid of this geometry. |
| [get_convex_hull()](#get_convex_hull__22) | Computes the convex hull of this geometry. |
| [get_distance_to(other)](#get_distance_to_other_23) | Computes the minimum distance between this geometry and a specified geometry. |
| [get_extent()](#get_extent__24) | Computes and returns a bounding extent of this geometry. |
| [get_length()](#get_length__25) | Computes the length of this geometry. |
| [intersection(other)](#intersection_other_26) | Builds an intersection between this geometry and a specified geometry. |
| [intersects(extent)](#intersects_extent_27) | Determines whether this geometry intersects a specified extent. |
| [intersects(other)](#intersects_other_28) | Determines if this geometry and a specified geometry intersects. |
| [overlaps(other)](#overlaps_other_29) | Determines whether this geometry overlap with a specified geometry. |
| [relate(other, intersection_pattern_matrix)](#relate_other_intersection_pattern_matrix_30) | Determines if DE-9IM intersection matrix of this geometry and a specified geometry matches provided pattern. |
| [replace_polygons_by_lines()](#replace_polygons_by_lines__31) | Gets polygons represented as lines of this geometry. |
| [round_m(digits)](#round_m_digits_32) | Rounds M coordinate to a specified number of fractional digits. |
| [round_xy(digits)](#round_xy_digits_33) | Rounds X and Y coordinates to a specified number of fractional digits. |
| [round_z(digits)](#round_z_digits_34) | Rounds Z coordinate to a specified number of fractional digits. |
| set_empty() | Makes this [Geometry](/psd/python-net/aspose.gis.geometries/geometry/) empty. |
| [spatially_contains(other)](#spatially_contains_other_35) | Determines whether this geometry spatially contains a specified geometry. |
| [spatially_equals(other)](#spatially_equals_other_36) | Determines if this geometry spatially equal to a specified geometry. |
| [sym_difference(other)](#sym_difference_other_37) | Builds a symmetric difference between this geometry and a specified geometry. |
| [to_editable()](#to_editable__38) | Gets an editable copy of this geometry. |
| [to_linear_geometry()](#to_linear_geometry__39) | Gets approximate or equivalent non-curve version of this geometry using the default <c>tolerance</c>. |
| [to_linear_geometry(tolerance)](#to_linear_geometry_tolerance_40) | Gets approximate or equivalent non-curve version of this geometry using the specified <c>tolerance</c>. |
| [to_svg(extent)](#to_svg_extent_41) | Translates this geometry to Svg representation. |
| [touches(other)](#touches_other_42) | Determines if this geometry and a specified geometry touch. |
| [union(other)](#union_other_43) | Unites this geometry and a specified geometry. |
| [union(other)](#union_other_44) | Unites this geometry and a specified geometry. |
| [within(extent)](#within_extent_45) | Determines whether this geometry is within a specified extent. |
| [within(other)](#within_other_46) | Determines whether this geometry is within a specified geometry. |


### Constructor: Point() {#Point__1}


```
 Point() 
```

Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class.

### Constructor: Point(other) {#Point_other_2}


```
 Point(other) 
```

Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IPoint](/psd/python-net/aspose.gis.geometries/ipoint) | The other [IPoint](/psd/python-net/aspose.gis.geometries/ipoint/) to copy data from. |

### Constructor: Point(x, y) {#Point_x_y_3}


```
 Point(x, y) 
```

Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x | double | The value for X coordinate. |
| y | double | The value for Y coordinate. |

### Constructor: Point(x, y, z) {#Point_x_y_z_4}


```
 Point(x, y, z) 
```

Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x | double | The value for X coordinate. |
| y | double | The value for Y coordinate. |
| z | double | The value for Z coordinate. |

### Constructor: Point(x, y, z, m) {#Point_x_y_z_m_5}


```
 Point(x, y, z, m) 
```

Initializes a new instance of the [Point](/psd/python-net/aspose.gis.geometries/point/) class.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| x | double | The value for X coordinate. |
| y | double | The value for Y coordinate. |
| z | double | The value for Z coordinate. |
| m | double | The value for M coordinate. |

### Method: as_binary() {#as_binary__1}


```
 as_binary() 
```

Translates this geometry to its Well-Known Binary representation.

**Returns**

| Type | Description |
| :- | :- |
| byte | Well-Known Binary representation of this geometry. |


### Method: as_binary(variant) {#as_binary_variant_2}


```
 as_binary(variant) 
```

Translates this geometry to its Well-Known Binary representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| variant | [WkbVariant](/psd/python-net/aspose.gis.geometries/wkbvariant) | Well-Known Binary variant to use. |

**Returns**

| Type | Description |
| :- | :- |
| byte | Well-Known Binary representation of this geometry. |


### Method: as_image(output_path, width, height, renderer, symbolizer) {#as_image_output_path_width_height_renderer_symbolizer_3}


```
 as_image(output_path, width, height, renderer, symbolizer) 
```

Export this geometry to an image representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| output_path | [AbstractPath](/psd/python-net/aspose.gis/abstractpath) | Path to the output image. |
| width | [Measurement](/psd/python-net/aspose.gis.rendering/measurement/) | Width of the map. |
| height | [Measurement](/psd/python-net/aspose.gis.rendering/measurement/) | Height of the map. |
| renderer | [Renderer](/psd/python-net/aspose.gis.rendering/renderer/) | Renderer to use. |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | A symbolizer to use for rendering. If <see langword="null" />, default symbolizer is used. |

### Method: as_image(output_path, width, height, renderer, symbolizer) {#as_image_output_path_width_height_renderer_symbolizer_4}


```
 as_image(output_path, width, height, renderer, symbolizer) 
```

Export this geometry to an image representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| output_path | string | Path to the output image. |
| width | [Measurement](/psd/python-net/aspose.gis.rendering/measurement/) | Width of the map. |
| height | [Measurement](/psd/python-net/aspose.gis.rendering/measurement/) | Height of the map. |
| renderer | [Renderer](/psd/python-net/aspose.gis.rendering/renderer/) | Renderer to use. |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | A symbolizer to use for rendering. If <see langword="null" />, default symbolizer is used. |

### Method: as_image(width, height, renderer, symbolizer) {#as_image_width_height_renderer_symbolizer_5}


```
 as_image(width, height, renderer, symbolizer) 
```

Export this geometry to an image representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| width | [Measurement](/psd/python-net/aspose.gis.rendering/measurement/) | Width of the map. |
| height | [Measurement](/psd/python-net/aspose.gis.rendering/measurement/) | Height of the map. |
| renderer | [Renderer](/psd/python-net/aspose.gis.rendering/renderer/) | Renderer to use. |
| symbolizer | [VectorSymbolizer](/psd/python-net/aspose.gis.rendering.symbolizers/vectorsymbolizer/) | A symbolizer to use for rendering. If <see langword="null" />, default symbolizer is used. |

**Returns**

| Type | Description |
| :- | :- |
| _io.BufferedRandom | The image as stream |


### Method: as_text() {#as_text__6}


```
 as_text() 
```

Translates this geometry to its Well-Known Text representation.

**Returns**

| Type | Description |
| :- | :- |
| string | Well-Known Text representation of this geometry. |


### Method: as_text(variant) {#as_text_variant_7}


```
 as_text(variant) 
```

Translates this geometry to its Well-Known Text representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| variant | [WktVariant](/psd/python-net/aspose.gis.geometries/wktvariant) | Well-Known Text variant to use. |

**Returns**

| Type | Description |
| :- | :- |
| string | Well-Known Text representation of this geometry. |


### Method: as_text(variant, format) {#as_text_variant_format_8}


```
 as_text(variant, format) 
```

Translates this geometry to its Well-Known Text representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| variant | [WktVariant](/psd/python-net/aspose.gis.geometries/wktvariant) | Well-Known Text variant to use. |
| format | [NumericFormat](/psd/python-net/aspose.gis/numericformat) | Coordinate format for conversion to string. See the [NumericFormat](/psd/python-net/aspose.gis/numericformat/) to get it. |

**Returns**

| Type | Description |
| :- | :- |
| string | Well-Known Text representation of this geometry. |


### Method: clone() {#clone__9}


```
 clone() 
```

Clones this instance.

**Returns**

| Type | Description |
| :- | :- |
| [Geometry](/psd/python-net/aspose.gis.geometries/geometry) | The clone of this instance |


### Method: covered_by(other) {#covered_by_other_10}


```
 covered_by(other) 
```

Determines whether this geometry is covered by a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry is "spatially covered by" another geometry. <see langword="false" /> otherwise. |


### Method: covers(other) {#covers_other_11}


```
 covers(other) 
```

Determines whether this geometry covers a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry is "spatially covers" another geometry. <see langword="false" /> otherwise. |


### Method: crosses(other) {#crosses_other_12}


```
 crosses(other) 
```

Determines if this geometry and a specified geometry cross.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry is "spatially crosses" another geometry. <see langword="false" /> otherwise. |


### Method: difference(other) {#difference_other_13}


```
 difference(other) 
```

Subtracts a specified geometry from this geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry to subtract. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry that represents a difference of this geometry and an argument. The result geometry contains<br/>            point set that present in this geometry but not present in an argument. |


### Method: disjoint(other) {#disjoint_other_14}


```
 disjoint(other) 
```

Determines if this geometry is disjoint from a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry is "spatially disjoint" from another geometry. <see langword="false" /> otherwise. |


### Method: from_binary(wkb)  [static] {#from_binary_wkb_15}


```
 from_binary(wkb) 
```

Creates a geometry from its Well-Known Binary representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| wkb | byte | Well-Known Binary representation of a geometry. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry represented by the argument. |


### Method: from_binary(wkb, spatial_reference_system)  [static] {#from_binary_wkb_spatial_reference_system_16}


```
 from_binary(wkb, spatial_reference_system) 
```

Creates a geometry from its Well-Known Binary representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| wkb | byte | Well-Known Binary representation of a geometry. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial Reference System to be assigned to the geometry. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry represented by the argument. |


### Method: from_text(wkt)  [static] {#from_text_wkt_17}


```
 from_text(wkt) 
```

Creates a geometry from its Well-Known Text representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| wkt | string | Well-Known Text representation of a geometry. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry represented by the argument. |


### Method: from_text(wkt, spatial_reference_system)  [static] {#from_text_wkt_spatial_reference_system_18}


```
 from_text(wkt, spatial_reference_system) 
```

Creates a geometry from its Well-Known Text representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| wkt | string | Well-Known Text representation of a geometry. |
| spatial_reference_system | [SpatialReferenceSystem](/psd/python-net/aspose.gis.spatialreferencing/spatialreferencesystem/) | Spatial Reference System to be assigned to the geometry. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry represented by the argument. |


### Method: get_area() {#get_area__19}


```
 get_area() 
```

Computes the area of this geometry.

**Returns**

| Type | Description |
| :- | :- |
| double | The area of this geometry.<br/>            Sum of areas of elements of this geometry if this geometry is a [GeometryCollection](/psd/python-net/aspose.gis.geometries/geometrycollection/). |


### Method: get_buffer(distance, quadrant_segments) {#get_buffer_distance_quadrant_segments_20}


```
 get_buffer(distance, quadrant_segments) 
```

Computes a buffer region around this geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| distance | double | The buffer region width. |
| quadrant_segments | int | Number of segments used to approximate a 90 degree of curvature.<br/>            The larger this number is the better approximation of curves is produced.<br/>            Default is 30. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry that represents all points that are within a specified distance from<br/>            this geometry.<br/>            The type of result is either [Geometry.null](/psd/python-net/aspose.gis.geometries/geometry/), [IPolygon](/psd/python-net/aspose.gis.geometries/ipolygon/) or [IMultiPolygon](/psd/python-net/aspose.gis.geometries/imultipolygon/). |


### Method: get_centroid() {#get_centroid__21}


```
 get_centroid() 
```

Computes the centroid of this geometry.

**Returns**

| Type | Description |
| :- | :- |
| [IPoint](/psd/python-net/aspose.gis.geometries/ipoint) | The centroid of this geometry. If this geometry is empty an empty point returned.<br/>            The centroid is equal to the centroid of the highest dimension geometries in this geometry<br/>            (e.g. if both points and lines are contained in the geometry, only lines contribute to centroid). |


### Method: get_convex_hull() {#get_convex_hull__22}


```
 get_convex_hull() 
```

Computes the convex hull of this geometry.

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry that represents a convex hull of this geometry.<br/>            If this geometry has no points then the result is [Geometry.null](/psd/python-net/aspose.gis.geometries/geometry/).<br/>            If this geometry has only one point then the result is this point.<br/>            If this geometry has only two points then the result is [ILineString](/psd/python-net/aspose.gis.geometries/ilinestring/) with the points.<br/>            If this geometry has three or more points then the result is [ILinearRing](/psd/python-net/aspose.gis.geometries/ilinearring/) that represents a convex<br/>            hull around all geometries points. |


### Method: get_distance_to(other) {#get_distance_to_other_23}


```
 get_distance_to(other) 
```

Computes the minimum distance between this geometry and a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry to find distance to. |

**Returns**

| Type | Description |
| :- | :- |
| double | If both geometries are not [Geometry.is_empty](/psd/python-net/aspose.gis.geometries/geometry/) - a distance between closest points of the geometries.<br/>            If at least one geometry is empty -1 is returned. |


### Method: get_extent() {#get_extent__24}


```
 get_extent() 
```

Computes and returns a bounding extent of this geometry.

**Returns**

| Type | Description |
| :- | :- |
| [Extent](/psd/python-net/aspose.gis/extent) | A bounding extent of this geometry. |


### Method: get_length() {#get_length__25}


```
 get_length() 
```

Computes the length of this geometry.

**Returns**

| Type | Description |
| :- | :- |
| double | The length of this geometry.<br/>            Perimeter if this is a [Polygon](/psd/python-net/aspose.gis.geometries/polygon/).<br/>            Sum of lengths of elements of this geometry if this geometry is a [GeometryCollection](/psd/python-net/aspose.gis.geometries/geometrycollection/). |


### Method: intersection(other) {#intersection_other_26}


```
 intersection(other) 
```

Builds an intersection between this geometry and a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry to compute intersection with. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry that represents an intersection of this geometry and an argument. The result geometry contain<br/>            point set that present in both this geometry and an argument. |


### Method: intersects(extent) {#intersects_extent_27}


```
 intersects(extent) 
```

Determines whether this geometry intersects a specified extent.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | The extent. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry intersects the extent; <see langword="false" /> otherwise. |


### Method: intersects(other) {#intersects_other_28}


```
 intersects(other) 
```

Determines if this geometry and a specified geometry intersects.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry "spatially intersects" another geometry. <see langword="false" /> otherwise. |


### Method: overlaps(other) {#overlaps_other_29}


```
 overlaps(other) 
```

Determines whether this geometry overlap with a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry is "spatially overlaps" another geometry. <see langword="false" /> otherwise. |


### Method: relate(other, intersection_pattern_matrix) {#relate_other_intersection_pattern_matrix_30}


```
 relate(other, intersection_pattern_matrix) 
```

Determines if DE-9IM intersection matrix of this geometry and a specified geometry matches provided pattern.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |
| intersection_pattern_matrix | string | A patter to match with.<br/>            This should be a string with length equal to 9.<br/>            Each character of the string represent expected dimension of an intersection:<br/>            <ul><br/>            <li>character 0 - between interiors of the geometries.</li><br/>            <li>character 1 - between interior of this geometry and boundary of another geometry.</li><br/>            <li>character 2 - between interior of this geometry and exterior of another geometry.</li><br/>            <li>character 3 - between boundary of this geometry and interior of another geometry.</li><br/>            <li>character 4 - between boundaries of the geometries.</li><br/>            <li>character 5 - between boundary of this geometry and exterior of another geometry.</li><br/>            <li>character 6 - between exterior of this geometry and interior of another geometry.</li><br/>            <li>character 7 - between exterior of this geometry and boundary of another geometry.</li><br/>            <li>character 8 - between exteriors of the geometries.</li><br/>            </ul><br/>            Possible values of each characters are:<br/>            <ul><br/>            <li>* - any value;</li><br/>            <li>F - no intersection;</li><br/>            <li>T - any intersection;</li><br/>            <li>0 - point intersection (e.g. shared point);</li><br/>            <li>1 - line intersection (e.g. shared segment of line);</li><br/>            <li>2 - area intersection (e.g. shared part of polygon);</li><br/>            </ul><br/>            For example, an intersection pattern "F0*******" means, that there should not be intersection between geometries interiors<br/>            and intersection between geometries boundaries must be a point.<br/>            See OpenGIS Simple Features Specification for more details about intersection matrix pattern. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this intersection matrix matches patter; <see langword="false" /> otherwise. |


### Method: replace_polygons_by_lines() {#replace_polygons_by_lines__31}


```
 replace_polygons_by_lines() 
```

Gets polygons represented as lines of this geometry.

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry, that has no polygon geometries. The following transformation are applied:<br/>            <ul><br/>            <li> [GeometryType.POLYGON](/psd/python-net/aspose.gis.geometries/geometrytype/)s are linearized<br/>            (transformed into [GeometryType.LINE_STRING](/psd/python-net/aspose.gis.geometries/geometrytype/)s)</li><br/>            <li>[GeometryType.MULTI_POLYGON](/psd/python-net/aspose.gis.geometries/geometrytype/)s are joined into [GeometryType.MULTI_LINE_STRING](/psd/python-net/aspose.gis.geometries/geometrytype/)s</li><br/>            </ul> |


### Method: round_m(digits) {#round_m_digits_32}


```
 round_m(digits) 
```

Rounds M coordinate to a specified number of fractional digits.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| digits | int | Number of fractional digits. |

### Method: round_xy(digits) {#round_xy_digits_33}


```
 round_xy(digits) 
```

Rounds X and Y coordinates to a specified number of fractional digits.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| digits | int | Number of fractional digits. |

### Method: round_z(digits) {#round_z_digits_34}


```
 round_z(digits) 
```

Rounds Z coordinate to a specified number of fractional digits.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| digits | int | Number of fractional digits. |

### Method: spatially_contains(other) {#spatially_contains_other_35}


```
 spatially_contains(other) 
```

Determines whether this geometry spatially contains a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry is "spatially contains" another geometry. <see langword="false" /> otherwise. |


### Method: spatially_equals(other) {#spatially_equals_other_36}


```
 spatially_equals(other) 
```

Determines if this geometry spatially equal to a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry "spatially equals" to specified geometry. <see langword="false" /> otherwise. |


### Method: sym_difference(other) {#sym_difference_other_37}


```
 sym_difference(other) 
```

Builds a symmetric difference between this geometry and a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry to compute symmetric difference with. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry that represents a symmetric difference of this geometry and an argument. The result geometry contains<br/>            point set that present in one of the geometries but not present in both of them. |


### Method: to_editable() {#to_editable__38}


```
 to_editable() 
```

Gets an editable copy of this geometry.

**Returns**

| Type | Description |
| :- | :- |
| [Point](/psd/python-net/aspose.gis.geometries/point) | An editable copy of this geometry. |


### Method: to_linear_geometry() {#to_linear_geometry__39}


```
 to_linear_geometry() 
```

Gets approximate or equivalent non-curve version of this geometry using the default <c>tolerance</c>.

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry that has no curve geometries. This is the equivalent of <DOM Element: class at 0x2a1791a70d0>.IGeometry.to_linear_geometry()(float) with<br/>            default <c>tolerance</c>. Default <c>tolerance</c> is defined by [IGeometry.spatial_reference_system](/psd/python-net/aspose.gis.geometries/igeometry/)<br/>            of this geometry:<br/>            <ul><br/>            <li> For projected SRS Tolerance is 0.001 meters (in SRS units) </li><br/>            <li> For geographic SRS Tolerance is <c>1e-5</c> degrees (in SRS units) </li><br/>            <li> For unknown SRS Tolerance is <c>1e-5</c> </li><br/>            </ul><br/>            For more details on what transformations are applied refer to <DOM Element: class at 0x2a1791a70d0>.IGeometry.to_linear_geometry()(float) specification. |


### Method: to_linear_geometry(tolerance) {#to_linear_geometry_tolerance_40}


```
 to_linear_geometry(tolerance) 
```

Gets approximate or equivalent non-curve version of this geometry using the specified <c>tolerance</c>.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| tolerance | double | The <c>tolerance</c> to use. The result is guaranteed to be less than <c>tolerance</c> away from the<br/>            curved geometry, unless the number of points needed to linearize the geometry exceeds the per-quadrant maximum<br/>            which is currently equal to 10000 points. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry, that has no curve geometries. The following transformations are applied:<br/>            <ul><br/>            <li> [GeometryType.CIRCULAR_STRING](/psd/python-net/aspose.gis.geometries/geometrytype/)s are linearized<br/>            (transformed into [GeometryType.LINE_STRING](/psd/python-net/aspose.gis.geometries/geometrytype/)s with specified <paramref name="tolerance" />) </li><br/>            <li> [GeometryType.COMPOUND_CURVE](/psd/python-net/aspose.gis.geometries/geometrytype/)s are joined into <c>LineString</c>s </li><br/>            <li> [GeometryType.CURVE_POLYGON](/psd/python-net/aspose.gis.geometries/geometrytype/)s are transformed into [GeometryType.POLYGON](/psd/python-net/aspose.gis.geometries/geometrytype/)s </li><br/>            <li> [GeometryType.MULTI_CURVE](/psd/python-net/aspose.gis.geometries/geometrytype/)s are transformed into [GeometryType.MULTI_LINE_STRING](/psd/python-net/aspose.gis.geometries/geometrytype/)s </li><br/>            <li> [GeometryType.MULTI_SURFACE](/psd/python-net/aspose.gis.geometries/geometrytype/)s are transformed into [GeometryType.MULTI_POLYGON](/psd/python-net/aspose.gis.geometries/geometrytype/)s </li><br/>            </ul><br/>            As a result, [IGeometry.has_curve_geometry](/psd/python-net/aspose.gis.geometries/igeometry/) of output geometry is <see langword="false" />. |


### Method: to_svg(extent) {#to_svg_extent_41}


```
 to_svg(extent) 
```

Translates this geometry to Svg representation.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | Extent for translation this geometry to Svg |

**Returns**

| Type | Description |
| :- | :- |
| string | The Svg representation. |


### Method: touches(other) {#touches_other_42}


```
 touches(other) 
```

Determines if this geometry and a specified geometry touch.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry is "spatially touches" another geometry. <see langword="false" /> otherwise. |


### Method: union(other) {#union_other_43}


```
 union(other) 
```

Unites this geometry and a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry to unite with. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry that represents a union of this geometry and an argument. The result geometry contains<br/>            point set that present in this geometry or in an argument. |


### Method: union(other) {#union_other_44}


```
 union(other) 
```

Unites this geometry and a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry[]](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry to unite with. |

**Returns**

| Type | Description |
| :- | :- |
| [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry that represents a union of this geometry and an argument. The result geometry contains<br/>            point set that present in this geometry or in an argument. |


### Method: within(extent) {#within_extent_45}


```
 within(extent) 
```

Determines whether this geometry is within a specified extent.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| extent | [Extent](/psd/python-net/aspose.gis/extent) | The extent. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry is within extent; <see langword="false" /> otherwise. |


### Method: within(other) {#within_other_46}


```
 within(other) 
```

Determines whether this geometry is within a specified geometry.

**Parameters:**

| Parameter | Type | Description |
| :- | :- | :- |
| other | [IGeometry](/psd/python-net/aspose.gis.geometries/igeometry) | A geometry. |

**Returns**

| Type | Description |
| :- | :- |
| bool | <see langword="true" /> if this geometry is "spatially within" another geometry. <see langword="false" /> otherwise. |



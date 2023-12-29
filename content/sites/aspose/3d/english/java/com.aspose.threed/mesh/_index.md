---
title: Mesh
second_title: Aspose.3D for Java API Reference
description: A mesh is made of many n-sided polygons.
type: docs
weight: 96
url: /java/com.aspose.threed/mesh/
---

**Inheritance:**
java.lang.Object, [com.aspose.threed.A3DObject](../../com.aspose.threed/a3dobject), [com.aspose.threed.SceneObject](../../com.aspose.threed/sceneobject), [com.aspose.threed.Entity](../../com.aspose.threed/entity), [com.aspose.threed.Geometry](../../com.aspose.threed/geometry)

**All Implemented Interfaces:**
java.lang.Iterable, [com.aspose.threed.IMeshConvertible](../../com.aspose.threed/imeshconvertible)
```
public class Mesh extends Geometry implements Iterable<int[]>, IMeshConvertible
```

A mesh is made of many n-sided polygons.
## Constructors

| Constructor | Description |
| --- | --- |
| [Mesh()](#Mesh--) | Initializes a new instance of the [Mesh](../../com.aspose.threed/mesh) class. |
| [Mesh(String name)](#Mesh-java.lang.String-) | Initializes a new instance of the [Mesh](../../com.aspose.threed/mesh) class. |
## Methods

| Method | Description |
| --- | --- |
| [<T>getDeformers2()](#-T-getDeformers2--) | Gets all deformers with specified deformer types |
| [addElement(VertexElement element)](#addElement-com.aspose.threed.VertexElement-) | Adds an existing vertex element to current geometry |
| [clone()](#clone--) |  |
| [createElement(VertexElementType type)](#createElement-com.aspose.threed.VertexElementType-) | Creates a vertex element with specified type and add it to the geometry. |
| [createElement(VertexElementType type, MappingMode mappingMode, ReferenceMode referenceMode)](#createElement-com.aspose.threed.VertexElementType-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-) | Creates a vertex element with specified type and add it to the geometry. |
| [createElementUV(TextureMapping uvMapping)](#createElementUV-com.aspose.threed.TextureMapping-) | Creates a [VertexElementUV](../../com.aspose.threed/vertexelementuv) with given texture mapping type. |
| [createElementUV(TextureMapping uvMapping, MappingMode mappingMode, ReferenceMode referenceMode)](#createElementUV-com.aspose.threed.TextureMapping-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-) | Creates a [VertexElementUV](../../com.aspose.threed/vertexelementuv) with given texture mapping type. |
| [createPolygon(int v1, int v2, int v3)](#createPolygon-int-int-int-) | Create a polygon with 3 vertices(triangle) |
| [createPolygon(int v1, int v2, int v3, int v4)](#createPolygon-int-int-int-int-) | Create a polygon with 4 vertices(quad) |
| [createPolygon(int[] indices)](#createPolygon-int---) | Creates a new polygon with all vertices defined in `indices`. |
| [createPolygon(int[] indices, int offset, int length)](#createPolygon-int---int-int-) | Creates a new polygon with all vertices defined in `indices`. |
| [difference(Mesh a, Mesh b)](#difference-com.aspose.threed.Mesh-com.aspose.threed.Mesh-) | Calculate the difference of two meshes |
| [doBoolean(BooleanOperation op, Mesh a, Matrix4 transformA, Mesh b, Matrix4 transformB)](#doBoolean-com.aspose.threed.BooleanOperation-com.aspose.threed.Mesh-com.aspose.threed.Matrix4-com.aspose.threed.Mesh-com.aspose.threed.Matrix4-) | Perform Boolean operation on two meshes |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [findProperty(String propertyName)](#findProperty-java.lang.String-) | Finds the property. |
| [getBoundingBox()](#getBoundingBox--) | Gets the bounding box of current entity in its object space coordinate system. |
| [getCastShadows()](#getCastShadows--) | Gets whether this geometry can cast shadow |
| [getClass()](#getClass--) |  |
| [getControlPoints()](#getControlPoints--) | Gets all control points |
| [getDeformers()](#getDeformers--) | Gets all deformers associated with this geometry. |
| [getEdges()](#getEdges--) | Gets edges of the Mesh. |
| [getElement(VertexElementType type)](#getElement-com.aspose.threed.VertexElementType-) | Gets a vertex element with specified type |
| [getEntityRendererKey()](#getEntityRendererKey--) | Gets the key of the entity renderer registered in the renderer |
| [getExcluded()](#getExcluded--) | Gets whether to exclude this entity during exporting. |
| [getName()](#getName--) | Gets the name. |
| [getParentNode()](#getParentNode--) | Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [getParentNodes()](#getParentNodes--) | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing |
| [getPolygonCount()](#getPolygonCount--) | Gets the count of polygons |
| [getPolygonSize(int index)](#getPolygonSize-int-) | Gets the vertex count of the specified polygon. |
| [getPolygons()](#getPolygons--) | Gets the polygons definition of the mesh |
| [getProperties()](#getProperties--) | Gets the collection of all properties. |
| [getProperty(String property)](#getProperty-java.lang.String-) | Get the value of specified property |
| [getReceiveShadows()](#getReceiveShadows--) | Gets whether this geometry can receive shadow. |
| [getScene()](#getScene--) | Gets the scene that this object belongs to |
| [getVertexElementOfUV(TextureMapping textureMapping)](#getVertexElementOfUV-com.aspose.threed.TextureMapping-) | Gets a [VertexElementUV](../../com.aspose.threed/vertexelementuv) instance with given texture mapping type |
| [getVertexElements()](#getVertexElements--) | Gets all vertex elements |
| [getVisible()](#getVisible--) | Gets if the geometry is visible |
| [hashCode()](#hashCode--) |  |
| [intersect(Mesh a, Mesh b)](#intersect-com.aspose.threed.Mesh-com.aspose.threed.Mesh-) | Calculate the intersection of two meshes |
| [iterator()](#iterator--) | Gets the enumerator for each inner polygons. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [optimize(boolean vertexElements)](#optimize-boolean-) | Optimize the mesh's memory usage by eliminating duplicated control points |
| [removeProperty(Property property)](#removeProperty-com.aspose.threed.Property-) | Removes a dynamic property. |
| [removeProperty(String property)](#removeProperty-java.lang.String-) | Remove the specified property identified by name |
| [setCastShadows(boolean value)](#setCastShadows-boolean-) | Sets whether this geometry can cast shadow |
| [setExcluded(boolean value)](#setExcluded-boolean-) | Sets whether to exclude this entity during exporting. |
| [setName(String value)](#setName-java.lang.String-) | Sets the name. |
| [setParentNode(Node value)](#setParentNode-com.aspose.threed.Node-) | Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. |
| [setProperty(String property, Object value)](#setProperty-java.lang.String-java.lang.Object-) | Sets the value of specified property |
| [setReceiveShadows(boolean value)](#setReceiveShadows-boolean-) | Sets whether this geometry can receive shadow. |
| [setVisible(boolean value)](#setVisible-boolean-) | Sets if the geometry is visible |
| [toMesh()](#toMesh--) | Gets the Mesh instance from current entity. |
| [toString()](#toString--) |  |
| [union(Mesh a, Mesh b)](#union-com.aspose.threed.Mesh-com.aspose.threed.Mesh-) | Calculate the union of two meshes |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### Mesh() {#Mesh--}
```
public Mesh()
```


Initializes a new instance of the [Mesh](../../com.aspose.threed/mesh) class.

### Mesh(String name) {#Mesh-java.lang.String-}
```
public Mesh(String name)
```


Initializes a new instance of the [Mesh](../../com.aspose.threed/mesh) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| name | java.lang.String | Name. |

### <T>getDeformers2() {#-T-getDeformers2--}
```
public Collection<T> <T>getDeformers2()
```


Gets all deformers with specified deformer types

**Returns:**
java.util.Collection<T> - Deformer collection
### addElement(VertexElement element) {#addElement-com.aspose.threed.VertexElement-}
```
public void addElement(VertexElement element)
```


Adds an existing vertex element to current geometry

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| element | [VertexElement](../../com.aspose.threed/vertexelement) | The vertex element to add |

### clone() {#clone--}
```
public Mesh clone()
```




**Returns:**
[Mesh](../../com.aspose.threed/mesh)
### createElement(VertexElementType type) {#createElement-com.aspose.threed.VertexElementType-}
```
public VertexElement createElement(VertexElementType type)
```


Creates a vertex element with specified type and add it to the geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [VertexElementType](../../com.aspose.threed/vertexelementtype) | Vertex element type |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement) - Created element.
### createElement(VertexElementType type, MappingMode mappingMode, ReferenceMode referenceMode) {#createElement-com.aspose.threed.VertexElementType-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-}
```
public VertexElement createElement(VertexElementType type, MappingMode mappingMode, ReferenceMode referenceMode)
```


Creates a vertex element with specified type and add it to the geometry.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [VertexElementType](../../com.aspose.threed/vertexelementtype) | Vertex element type |
| mappingMode | [MappingMode](../../com.aspose.threed/mappingmode) | Default mapping mode |
| referenceMode | [ReferenceMode](../../com.aspose.threed/referencemode) | Default reference mode |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement) - Created element.
### createElementUV(TextureMapping uvMapping) {#createElementUV-com.aspose.threed.TextureMapping-}
```
public VertexElementUV createElementUV(TextureMapping uvMapping)
```


Creates a [VertexElementUV](../../com.aspose.threed/vertexelementuv) with given texture mapping type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| uvMapping | [TextureMapping](../../com.aspose.threed/texturemapping) | Which texture mapping type to create |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Created element uv
### createElementUV(TextureMapping uvMapping, MappingMode mappingMode, ReferenceMode referenceMode) {#createElementUV-com.aspose.threed.TextureMapping-com.aspose.threed.MappingMode-com.aspose.threed.ReferenceMode-}
```
public VertexElementUV createElementUV(TextureMapping uvMapping, MappingMode mappingMode, ReferenceMode referenceMode)
```


Creates a [VertexElementUV](../../com.aspose.threed/vertexelementuv) with given texture mapping type.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| uvMapping | [TextureMapping](../../com.aspose.threed/texturemapping) | Which texture mapping type to create |
| mappingMode | [MappingMode](../../com.aspose.threed/mappingmode) | Default mapping mode |
| referenceMode | [ReferenceMode](../../com.aspose.threed/referencemode) | Default reference mode |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - Created element uv
### createPolygon(int v1, int v2, int v3) {#createPolygon-int-int-int-}
```
public void createPolygon(int v1, int v2, int v3)
```


Create a polygon with 3 vertices(triangle)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v1 | int | Index of the first vertex |
| v2 | int | Index of the second vertex |
| v3 | int | Index of the third vertex |

### createPolygon(int v1, int v2, int v3, int v4) {#createPolygon-int-int-int-int-}
```
public void createPolygon(int v1, int v2, int v3, int v4)
```


Create a polygon with 4 vertices(quad)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| v1 | int | Index of the first vertex |
| v2 | int | Index of the second vertex |
| v3 | int | Index of the third vertex |
| v4 | int | Index of the fourth vertex |

### createPolygon(int[] indices) {#createPolygon-int---}
```
public void createPolygon(int[] indices)
```


Creates a new polygon with all vertices defined in `indices`. To create polygon vertex by vertex, please use [PolygonBuilder](../../com.aspose.threed/polygonbuilder).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| indices | int[] | Array of the polygon indices, each index points to a control point that forms the polygon. |

### createPolygon(int[] indices, int offset, int length) {#createPolygon-int---int-int-}
```
public void createPolygon(int[] indices, int offset, int length)
```


Creates a new polygon with all vertices defined in `indices`. To create polygon vertex by vertex, please use [PolygonBuilder](../../com.aspose.threed/polygonbuilder).

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| indices | int[] | Array of the polygon indices, each index points to a control point that forms the polygon. |
| offset | int | The offset of the first polygon index |
| length | int | The length of the indices |

### difference(Mesh a, Mesh b) {#difference-com.aspose.threed.Mesh-com.aspose.threed.Mesh-}
```
public static Mesh difference(Mesh a, Mesh b)
```


Calculate the difference of two meshes

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [Mesh](../../com.aspose.threed/mesh) | First mesh |
| b | [Mesh](../../com.aspose.threed/mesh) | Second mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Result mesh
### doBoolean(BooleanOperation op, Mesh a, Matrix4 transformA, Mesh b, Matrix4 transformB) {#doBoolean-com.aspose.threed.BooleanOperation-com.aspose.threed.Mesh-com.aspose.threed.Matrix4-com.aspose.threed.Mesh-com.aspose.threed.Matrix4-}
```
public static Mesh doBoolean(BooleanOperation op, Mesh a, Matrix4 transformA, Mesh b, Matrix4 transformB)
```


Perform Boolean operation on two meshes

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| op | [BooleanOperation](../../com.aspose.threed/booleanoperation) | The Boolean operation type. |
| a | [Mesh](../../com.aspose.threed/mesh) | First mesh to operate. |
| transformA | [Matrix4](../../com.aspose.threed/matrix4) | Transformation matrix of the first mesh |
| b | [Mesh](../../com.aspose.threed/mesh) | Second mesh to operate |
| transformB | [Matrix4](../../com.aspose.threed/matrix4) | Transformation matrix of the second mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - The result mesh
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### findProperty(String propertyName) {#findProperty-java.lang.String-}
```
public Property findProperty(String propertyName)
```


Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name)

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| propertyName | java.lang.String | Property name. |

**Returns:**
[Property](../../com.aspose.threed/property) - The property.
### getBoundingBox() {#getBoundingBox--}
```
public BoundingBox getBoundingBox()
```


Gets the bounding box of current entity in its object space coordinate system.

**Returns:**
[BoundingBox](../../com.aspose.threed/boundingbox)
### getCastShadows() {#getCastShadows--}
```
public boolean getCastShadows()
```


Gets whether this geometry can cast shadow

**Returns:**
boolean
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getControlPoints() {#getControlPoints--}
```
public List<Vector4> getControlPoints()
```


Gets all control points

**Returns:**
java.util.List<com.aspose.threed.Vector4>
### getDeformers() {#getDeformers--}
```
public List<Deformer> getDeformers()
```


Gets all deformers associated with this geometry.

**Returns:**
java.util.List<com.aspose.threed.Deformer>
### getEdges() {#getEdges--}
```
public List<Integer> getEdges()
```


Gets edges of the Mesh. Edge is optional in mesh, so it can be empty.

**Returns:**
java.util.List<java.lang.Integer>
### getElement(VertexElementType type) {#getElement-com.aspose.threed.VertexElementType-}
```
public VertexElement getElement(VertexElementType type)
```


Gets a vertex element with specified type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| type | [VertexElementType](../../com.aspose.threed/vertexelementtype) | which vertex element type to find |

**Returns:**
[VertexElement](../../com.aspose.threed/vertexelement) - [VertexElement](../../com.aspose.threed/vertexelement) instance if found, otherwise null will be returned.
### getEntityRendererKey() {#getEntityRendererKey--}
```
public EntityRendererKey getEntityRendererKey()
```


Gets the key of the entity renderer registered in the renderer

**Returns:**
[EntityRendererKey](../../com.aspose.threed/entityrendererkey)
### getExcluded() {#getExcluded--}
```
public boolean getExcluded()
```


Gets whether to exclude this entity during exporting.

**Returns:**
boolean
### getName() {#getName--}
```
public String getName()
```


Gets the name.

**Returns:**
java.lang.String
### getParentNode() {#getParentNode--}
```
public Node getParentNode()
```


Gets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.

**Returns:**
[Node](../../com.aspose.threed/node)
### getParentNodes() {#getParentNodes--}
```
public ArrayList<Node> getParentNodes()
```


Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing

**Returns:**
java.util.ArrayList<com.aspose.threed.Node>
### getPolygonCount() {#getPolygonCount--}
```
public int getPolygonCount()
```


Gets the count of polygons

**Returns:**
int
### getPolygonSize(int index) {#getPolygonSize-int-}
```
public int getPolygonSize(int index)
```


Gets the vertex count of the specified polygon.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| index | int | Index. |

**Returns:**
int - The polygon size.
### getPolygons() {#getPolygons--}
```
public List<int[]> getPolygons()
```


Gets the polygons definition of the mesh

**Returns:**
java.util.List<int[]>
### getProperties() {#getProperties--}
```
public PropertyCollection getProperties()
```


Gets the collection of all properties.

**Returns:**
[PropertyCollection](../../com.aspose.threed/propertycollection)
### getProperty(String property) {#getProperty-java.lang.String-}
```
public Object getProperty(String property)
```


Get the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |

**Returns:**
java.lang.Object - The value of the found property
### getReceiveShadows() {#getReceiveShadows--}
```
public boolean getReceiveShadows()
```


Gets whether this geometry can receive shadow.

**Returns:**
boolean
### getScene() {#getScene--}
```
public Scene getScene()
```


Gets the scene that this object belongs to

**Returns:**
[Scene](../../com.aspose.threed/scene)
### getVertexElementOfUV(TextureMapping textureMapping) {#getVertexElementOfUV-com.aspose.threed.TextureMapping-}
```
public VertexElementUV getVertexElementOfUV(TextureMapping textureMapping)
```


Gets a [VertexElementUV](../../com.aspose.threed/vertexelementuv) instance with given texture mapping type

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| textureMapping | [TextureMapping](../../com.aspose.threed/texturemapping) |  |

**Returns:**
[VertexElementUV](../../com.aspose.threed/vertexelementuv) - VertexElementUV with the texture mapping type
### getVertexElements() {#getVertexElements--}
```
public List<VertexElement> getVertexElements()
```


Gets all vertex elements

**Returns:**
java.util.List<com.aspose.threed.VertexElement>
### getVisible() {#getVisible--}
```
public boolean getVisible()
```


Gets if the geometry is visible

**Returns:**
boolean
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### intersect(Mesh a, Mesh b) {#intersect-com.aspose.threed.Mesh-com.aspose.threed.Mesh-}
```
public static Mesh intersect(Mesh a, Mesh b)
```


Calculate the intersection of two meshes

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [Mesh](../../com.aspose.threed/mesh) | First mesh |
| b | [Mesh](../../com.aspose.threed/mesh) | Second mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Result mesh
### iterator() {#iterator--}
```
public Iterator<int[]> iterator()
```


Gets the enumerator for each inner polygons.

**Returns:**
java.util.Iterator<int[]> - The enumerator.
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### optimize(boolean vertexElements) {#optimize-boolean-}
```
public Mesh optimize(boolean vertexElements)
```


Optimize the mesh's memory usage by eliminating duplicated control points

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| vertexElements | boolean | Optimize duplicated vertex element data |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - New mesh instance with compact memory usage
### removeProperty(Property property) {#removeProperty-com.aspose.threed.Property-}
```
public boolean removeProperty(Property property)
```


Removes a dynamic property.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | [Property](../../com.aspose.threed/property) | Which property to remove |

**Returns:**
boolean - true if the property is successfully removed
### removeProperty(String property) {#removeProperty-java.lang.String-}
```
public boolean removeProperty(String property)
```


Remove the specified property identified by name

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String |  |

**Returns:**
boolean
### setCastShadows(boolean value) {#setCastShadows-boolean-}
```
public void setCastShadows(boolean value)
```


Sets whether this geometry can cast shadow

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setExcluded(boolean value) {#setExcluded-boolean-}
```
public void setExcluded(boolean value)
```


Sets whether to exclude this entity during exporting.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setName(String value) {#setName-java.lang.String-}
```
public void setName(String value)
```


Sets the name.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | java.lang.String | New value |

### setParentNode(Node value) {#setParentNode-com.aspose.threed.Node-}
```
public void setParentNode(Node value)
```


Sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Node](../../com.aspose.threed/node) | New value |

### setProperty(String property, Object value) {#setProperty-java.lang.String-java.lang.Object-}
```
public void setProperty(String property, Object value)
```


Sets the value of specified property

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| property | java.lang.String | Property name |
| value | java.lang.Object | The value of the property |

### setReceiveShadows(boolean value) {#setReceiveShadows-boolean-}
```
public void setReceiveShadows(boolean value)
```


Sets whether this geometry can receive shadow.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### setVisible(boolean value) {#setVisible-boolean-}
```
public void setVisible(boolean value)
```


Sets if the geometry is visible

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean | New value |

### toMesh() {#toMesh--}
```
public Mesh toMesh()
```


Gets the Mesh instance from current entity.

**Returns:**
[Mesh](../../com.aspose.threed/mesh)
### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### union(Mesh a, Mesh b) {#union-com.aspose.threed.Mesh-com.aspose.threed.Mesh-}
```
public static Mesh union(Mesh a, Mesh b)
```


Calculate the union of two meshes

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| a | [Mesh](../../com.aspose.threed/mesh) | First mesh |
| b | [Mesh](../../com.aspose.threed/mesh) | Second mesh |

**Returns:**
[Mesh](../../com.aspose.threed/mesh) - Result mesh
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |


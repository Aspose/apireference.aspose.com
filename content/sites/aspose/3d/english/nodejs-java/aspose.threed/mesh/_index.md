---
title: Mesh 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/mesh/
---
## Mesh class

  A mesh is made of many n-sided polygons.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the Mesh class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(name) | Initializes a new instance of the Mesh class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |

 **Result:**



---


### getEdges{#getEdges}

| Name | Description |
| --- | --- |
| getEdges() | Gets edges of the Mesh. Edge is optional in mesh, so it can be empty. | 

 **Result:**



---


### getPolygonCount{#getPolygonCount}

| Name | Description |
| --- | --- |
| getPolygonCount() | Gets the count of polygons The polygon count. | 

 **Result:**



---


### getPolygons{#getPolygons}

| Name | Description |
| --- | --- |
| getPolygons() | Gets the polygons definition of the mesh | 

 **Result:**



---


### getVisible{#getVisible}

| Name | Description |
| --- | --- |
| getVisible() | Gets or sets if the geometry is visible | 

 **Result:**



---


### setVisible{#setVisible}

| Name | Description |
| --- | --- |
| setVisible(value) | Gets or sets if the geometry is visible | 

 **Result:**



---


### getDeformers{#getDeformers}

| Name | Description |
| --- | --- |
| getDeformers() | Gets all deformers associated with this geometry. The deformers. | 

 **Result:**



---


### getControlPoints{#getControlPoints}

| Name | Description |
| --- | --- |
| getControlPoints() | Gets all control points | 

 **Result:**



---


### getCastShadows{#getCastShadows}

| Name | Description |
| --- | --- |
| getCastShadows() | Gets or sets whether this geometry can cast shadow | 

 **Result:**



---


### setCastShadows{#setCastShadows}

| Name | Description |
| --- | --- |
| setCastShadows(value) | Gets or sets whether this geometry can cast shadow | 

 **Result:**



---


### getReceiveShadows{#getReceiveShadows}

| Name | Description |
| --- | --- |
| getReceiveShadows() | Gets or sets whether this geometry can receive shadow. | 

 **Result:**



---


### setReceiveShadows{#setReceiveShadows}

| Name | Description |
| --- | --- |
| setReceiveShadows(value) | Gets or sets whether this geometry can receive shadow. | 

 **Result:**



---


### getVertexElements{#getVertexElements}

| Name | Description |
| --- | --- |
| getVertexElements() | Gets all vertex elements | 

 **Result:**



---


### getParentNodes{#getParentNodes}

| Name | Description |
| --- | --- |
| getParentNodes() | Gets all parent nodes, an entity can be attached to multiple parent nodes for geometry instancing The nodes. | 

 **Result:**



---


### getExcluded{#getExcluded}

| Name | Description |
| --- | --- |
| getExcluded() | Gets or sets whether to exclude this entity during exporting. | 

 **Result:**



---


### setExcluded{#setExcluded}

| Name | Description |
| --- | --- |
| setExcluded(value) | Gets or sets whether to exclude this entity during exporting. | 

 **Result:**



---


### getParentNode{#getParentNode}

| Name | Description |
| --- | --- |
| getParentNode() | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. The parent node. | 

 **Result:**



---


### setParentNode{#setParentNode}

| Name | Description |
| --- | --- |
| setParentNode(value) | Gets or sets the first parent node, if set the first parent node, this entity will be detached from other parent nodes. The parent node. | 

 **Result:**



---


### getScene{#getScene}

| Name | Description |
| --- | --- |
| getScene() | Gets the scene that this object belongs to | 

 **Result:**



---


### getName{#getName}

| Name | Description |
| --- | --- |
| getName() | Gets or sets the name. The name. | 

 **Result:**



---


### setName{#setName}

| Name | Description |
| --- | --- |
| setName(value) | Gets or sets the name. The name. | 

 **Result:**



---


### getProperties{#getProperties}

| Name | Description |
| --- | --- |
| getProperties() | Gets the collection of all properties. | 

 **Result:**



---


### getPolygonSize{#getPolygonSize}

| Name | Description |
| --- | --- |
| getPolygonSize(index) | Gets the vertex count of the specified polygon. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| index | Number | Index. |

 **Result:**
Number


---


### createPolygon{#createPolygon}

| Name | Description |
| --- | --- |
| createPolygon(indices, offset, length) | Creates a new polygon with all vertices defined in indices. To create polygon vertex by vertex, please use PolygonBuilder. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| indices | Number[] | Array of the polygon indices, each index points to a control point that forms the polygon. |
| offset | Number | The offset of the first polygon index |
| length | Number | The length of the indices |

 **Result:**
Number


---


### createPolygon{#createPolygon}

| Name | Description |
| --- | --- |
| createPolygon(indices) | Creates a new polygon with all vertices defined in indices. To create polygon vertex by vertex, please use PolygonBuilder. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| indices | Number[] | Array of the polygon indices, each index points to a control point that forms the polygon. |

 **Result:**
Number


---


### createPolygon{#createPolygon}

| Name | Description |
| --- | --- |
| createPolygon(v1, v2, v3, v4) | Create a polygon with 4 vertices(quad) | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| v1 | Number | Index of the first vertex |
| v2 | Number | Index of the second vertex |
| v3 | Number | Index of the third vertex |
| v4 | Number | Index of the fourth vertex |

 **Result:**
Number


---


### createPolygon{#createPolygon}

| Name | Description |
| --- | --- |
| createPolygon(v1, v2, v3) | Create a polygon with 3 vertices(triangle) | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| v1 | Number | Index of the first vertex |
| v2 | Number | Index of the second vertex |
| v3 | Number | Index of the third vertex |

 **Result:**
Number


---


### toMesh{#toMesh}

| Name | Description |
| --- | --- |
| toMesh() | Gets the Mesh instance from current entity. | 

 **Result:**
Mesh


---


### getElement{#getElement}

| Name | Description |
| --- | --- |
| getElement(type) | Gets a vertex element with specified type | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| type | VertexElementType | VertexElementType |

 **Result:**
VertexElement


---


### getVertexElementOfUV{#getVertexElementOfUV}

| Name | Description |
| --- | --- |
| getVertexElementOfUV(textureMapping) | Gets a VertexElementUV instance with given texture mapping type | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| textureMapping | TextureMapping | TextureMapping |

 **Result:**
VertexElementUV


---


### createElement{#createElement}

| Name | Description |
| --- | --- |
| createElement(type) | Creates a vertex element with specified type and add it to the geometry. If type is VertexElementType.UV, a VertexElementUV with texture mapping type to TextureMapping.DIFFUSE will be created. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| type | VertexElementType | VertexElementType |

 **Result:**
VertexElement


---


### addElement{#addElement}

| Name | Description |
| --- | --- |
| addElement(element) | Adds an existing vertex element to current geometry | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| element | VertexElement | The vertex element to add |

 **Result:**
VertexElement


---


### createElement{#createElement}

| Name | Description |
| --- | --- |
| createElement(type, mappingMode, referenceMode) | Creates a vertex element with specified type and add it to the geometry. If type is VertexElementType.UV, a VertexElementUV with texture mapping type to TextureMapping.DIFFUSE will be created. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| type | VertexElementType | VertexElementType |
| mappingMode | MappingMode | MappingMode |
| referenceMode | ReferenceMode | ReferenceMode |

 **Result:**
VertexElement


---


### createElementUV{#createElementUV}

| Name | Description |
| --- | --- |
| createElementUV(uvMapping) | Creates a VertexElementUV with given texture mapping type. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| uvMapping | TextureMapping | TextureMapping |

 **Result:**
VertexElementUV


---


### createElementUV{#createElementUV}

| Name | Description |
| --- | --- |
| createElementUV(uvMapping, mappingMode, referenceMode) | Creates a VertexElementUV with given texture mapping type. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| uvMapping | TextureMapping | TextureMapping |
| mappingMode | MappingMode | MappingMode |
| referenceMode | ReferenceMode | ReferenceMode |

 **Result:**
VertexElementUV


---


### getBoundingBox{#getBoundingBox}

| Name | Description |
| --- | --- |
| getBoundingBox() | Gets the bounding box of current entity in its object space coordinate system. | 

 **Result:**
VertexElementUV


---


### getEntityRendererKey{#getEntityRendererKey}

| Name | Description |
| --- | --- |
| getEntityRendererKey() | Gets the key of the entity renderer registered in the renderer | 

 **Result:**
EntityRendererKey


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Removes a dynamic property. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | Property | Which property to remove |

 **Result:**
boolean


---


### removeProperty{#removeProperty}

| Name | Description |
| --- | --- |
| removeProperty(property) | Remove the specified property identified by name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  propert | String | null |

 **Result:**
boolean


---


### getProperty{#getProperty}

| Name | Description |
| --- | --- |
| getProperty(property) | Get the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |

 **Result:**
Object


---


### setProperty{#setProperty}

| Name | Description |
| --- | --- |
| setProperty(property, value) | Sets the value of specified property | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| property | String | Property name |
| value | Object | The value of the property |

 **Result:**
Object


---


### findProperty{#findProperty}

| Name | Description |
| --- | --- |
| findProperty(propertyName) | Finds the property. It can be a dynamic property (Created by CreateDynamicProperty/SetProperty) or native property(Identified by its name) | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| propertyName | String | Property name. |

 **Result:**
Property


---


### iterator{#iterator}

| Name | Description |
| --- | --- |
| iterator() | Reserved for internal use. | 

 **Result:**
Property


---




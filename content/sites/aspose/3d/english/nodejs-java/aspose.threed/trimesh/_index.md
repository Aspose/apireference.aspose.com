---
title: TriMesh 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/trimesh/
---
## TriMesh class

  A TriMesh contains raw data that can be used by GPU directly.  This class is a utility to help to construct a mesh that only contains per-vertex data.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(name, declaration) | Initialize an instance of TriMesh | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | The name of this TriMesh |
| declaration | VertexDeclaration | The vertex's declaration |

 **Result:**



---


### getVertexDeclaration{#getVertexDeclaration}

| Name | Description |
| --- | --- |
| getVertexDeclaration() | The vertex layout of the TriMesh. | 

 **Result:**



---


### getVerticesCount{#getVerticesCount}

| Name | Description |
| --- | --- |
| getVerticesCount() | The count of vertices in this TriMesh | 

 **Result:**



---


### getIndicesCount{#getIndicesCount}

| Name | Description |
| --- | --- |
| getIndicesCount() | The count of indices in this TriMesh | 

 **Result:**



---


### getUnmergedVerticesCount{#getUnmergedVerticesCount}

| Name | Description |
| --- | --- |
| getUnmergedVerticesCount() | The count of unmerged vertices that passed in by beginVertex() and endVertex(). | 

 **Result:**



---


### getCapacity{#getCapacity}

| Name | Description |
| --- | --- |
| getCapacity() | The capacity of pre-allocated vertices. | 

 **Result:**



---


### getVerticesSizeInBytes{#getVerticesSizeInBytes}

| Name | Description |
| --- | --- |
| getVerticesSizeInBytes() | The total size of all vertices in bytes | 

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


### fromMesh{#fromMesh}

| Name | Description |
| --- | --- |
| fromMesh(declaration, mesh) | Create a TriMesh from given mesh object with given vertex layout. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  declaratio | VertexDeclaration | null |
|  mes | Mesh | null |

 **Result:**
TriMesh


---


### copyFrom{#copyFrom}

| Name | Description |
| --- | --- |
| copyFrom(input, vd) | Copy the TriMesh from input with new vertex layout | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| input | TriMesh | The input TriMesh for copying |
| vd | VertexDeclaration | The new vertex declaration of the output TriMesh |

 **Result:**
TriMesh


---


### fromMesh{#fromMesh}

| Name | Description |
| --- | --- |
| fromMesh(mesh, useFloat) | Create a TriMesh from given mesh object, the vertex declaration are based on the input mesh's structure. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  mes | Mesh | null |
| useFloat | boolean | Use float type instead of double type for each vertex element component. |

 **Result:**
TriMesh


---


### beginVertex{#beginVertex}

| Name | Description |
| --- | --- |
| beginVertex() | Begin adding vertex | 

 **Result:**
Vertex


---


### endVertex{#endVertex}

| Name | Description |
| --- | --- |
| endVertex() | End adding vertex | 

 **Result:**
Vertex


---


### verticesToArray{#verticesToArray}

| Name | Description |
| --- | --- |
| verticesToArray() | Convert the vertices data to byte array | 

 **Result:**
byte[]


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() |  | 

 **Result:**
String


---


### fromRawData{#fromRawData}

| Name | Description |
| --- | --- |
| fromRawData(vd, vertices, indices, generateVertexMapping) | Create TriMesh from raw data The returned TriMesh will not copy the input byte array for performance, external changes on the array will be reflected to this instance. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| vd | VertexDeclaration | Vertex declaration, must contains at least one field. |
| vertices | byte[] | The input vertex data, the minimum length of the vertices must be greater or equal to vertex declaration's size |
| indices | Number[] | The triangle indices |
| generateVertexMapping | boolean | Generate |

 **Result:**
TriMesh


---


### loadVerticesFromBytes{#loadVerticesFromBytes}

| Name | Description |
| --- | --- |
| loadVerticesFromBytes(verticesInBytes) | Load vertices from bytes, the length of bytes must be an integer multiple of vertex size. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  verticesInByte | byte[] | null |

 **Result:**
TriMesh


---


### readVector4{#readVector4}

| Name | Description |
| --- | --- |
| readVector4(idx, field) | Read the vector4 field | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| idx | Number | The index of vertex to read |
| field | VertexField | The field with a Vector4/FVector4 data type |

 **Result:**
Vector4


---


### readFVector4{#readFVector4}

| Name | Description |
| --- | --- |
| readFVector4(idx, field) | Read the vector4 field | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| idx | Number | The index of vertex to read |
| field | VertexField | The field with a Vector4/FVector4 data type |

 **Result:**
FVector4


---


### readVector3{#readVector3}

| Name | Description |
| --- | --- |
| readVector3(idx, field) | Read the vector3 field | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| idx | Number | The index of vertex to read |
| field | VertexField | The field with a Vector3/FVector3 data type |

 **Result:**
Vector3


---


### readFVector3{#readFVector3}

| Name | Description |
| --- | --- |
| readFVector3(idx, field) | Read the vector3 field | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| idx | Number | The index of vertex to read |
| field | VertexField | The field with a Vector3/FVector3 data type |

 **Result:**
FVector3


---


### readVector2{#readVector2}

| Name | Description |
| --- | --- |
| readVector2(idx, field) | Read the vector2 field | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| idx | Number | The index of vertex to read |
| field | VertexField | The field with a Vector2/FVector2 data type |

 **Result:**
Vector2


---


### readFVector2{#readFVector2}

| Name | Description |
| --- | --- |
| readFVector2(idx, field) | Read the vector2 field | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| idx | Number | The index of vertex to read |
| field | VertexField | The field with a Vector2/FVector2 data type |

 **Result:**
FVector2


---


### readDouble{#readDouble}

| Name | Description |
| --- | --- |
| readDouble(idx, field) | Read the double field | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| idx | Number | The index of vertex to read |
| field | VertexField | The field with a float/double compatible data type |

 **Result:**
Number


---


### readFloat{#readFloat}

| Name | Description |
| --- | --- |
| readFloat(idx, field) | Read the float field | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| idx | Number | The index of vertex to read |
| field | VertexField | The field with a float/double compatible data type |

 **Result:**
Number


---


### getBoundingBox{#getBoundingBox}

| Name | Description |
| --- | --- |
| getBoundingBox() | Gets the bounding box of current entity in its object space coordinate system. | 

 **Result:**
Number


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




---
title: Patch 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/patch/
---
## Patch class

  A Patch is a parametric modeling surface, similar to NurbsSurface, it's also defined by two  PatchDirection, the U and V.  But difference between Patch and NurbsSurface is that the PatchDirection curve  can be one of PatchDirectionType.BEZIER, PatchDirectionType.QUADRATIC_BEZIER, PatchDirectionType.BASIS_SPLINE, PatchDirectionType.CARDINAL_SPLINE and PatchDirectionType.LINEAR


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the Patch class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(name) | Initializes a new instance of the Patch class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |

 **Result:**



---


### getU{#getU}

| Name | Description |
| --- | --- |
| getU() | Gets the u direction. | 

 **Result:**



---


### getV{#getV}

| Name | Description |
| --- | --- |
| getV() | Gets the v direction. The v. | 

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




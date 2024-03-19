---
title: Cylinder 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/cylinder/
---
## Cylinder class

  Parameterized Cylinder.  It can also be used to represent the cone when one of radiusTop/radiusBottom is zero.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the Cylinder class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(radius, height) | Initializes a new instance of the Cylinder class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| radius | Number | Radius of the top and bottom cap. |
| height | Number | Height. |

 **Result:**



---


### constructor_overload$2{#constructor_overload$2}

| Name | Description |
| --- | --- |
| constructor_overload$2(radiusTop, radiusBottom, height) | Initializes a new instance of the Cylinder class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| radiusTop | Number | Radius top. |
| radiusBottom | Number | Radius bottom. |
| height | Number | Height. |

 **Result:**



---


### constructor_overload$3{#constructor_overload$3}

| Name | Description |
| --- | --- |
| constructor_overload$3(radiusTop, radiusBottom, height, radialSegments, heightSegments, openEnded) | Initializes a new instance of the Cylinder class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| radiusTop | Number | Radius of cylinder's top cap. |
| radiusBottom | Number | Radius of cylinder's bottom cap. |
| height | Number | Height of the cylinder. |
| radialSegments | Number | Radial segments of both top and bottom circles.. |
| heightSegments | Number | Height segments. |
| openEnded | boolean | If set to |

 **Result:**



---


### constructor_overload$4{#constructor_overload$4}

| Name | Description |
| --- | --- |
| constructor_overload$4(name, radiusTop, radiusBottom, height, radialSegments, heightSegments, openEnded, thetaStart, thetaLength) | Initializes a new instance of the Cylinder class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | The name of this object |
| radiusTop | Number | Radius of cylinder's top cap. |
| radiusBottom | Number | Radius of cylinder's bottom cap. |
| height | Number | Height of the cylinder. |
| radialSegments | Number | Radial segments of both top and bottom circles.. |
| heightSegments | Number | Height segments. |
| openEnded | boolean | If set to |
| thetaStart | Number | Theta start. |
| thetaLength | Number | Theta length. |

 **Result:**



---


### getOffsetBottom{#getOffsetBottom}

| Name | Description |
| --- | --- |
| getOffsetBottom() | Gets or sets the vertices transformation offset of the bottom side. | 

 **Result:**



---


### setOffsetBottom{#setOffsetBottom}

| Name | Description |
| --- | --- |
| setOffsetBottom(value) | Gets or sets the vertices transformation offset of the bottom side. | 

 **Result:**



---


### getOffsetTop{#getOffsetTop}

| Name | Description |
| --- | --- |
| getOffsetTop() | Gets or sets the vertices transformation offset of the top side. | 

 **Result:**



---


### setOffsetTop{#setOffsetTop}

| Name | Description |
| --- | --- |
| setOffsetTop(value) | Gets or sets the vertices transformation offset of the top side. | 

 **Result:**



---


### getGenerateFanCylinder{#getGenerateFanCylinder}

| Name | Description |
| --- | --- |
| getGenerateFanCylinder() | Gets or sets whether to generate the fan-style cylinder when the ThetaLength is less than 2PI, otherwise the model will not be cut. | 

 **Result:**



---


### setGenerateFanCylinder{#setGenerateFanCylinder}

| Name | Description |
| --- | --- |
| setGenerateFanCylinder(value) | Gets or sets whether to generate the fan-style cylinder when the ThetaLength is less than 2PI, otherwise the model will not be cut. | 

 **Result:**



---


### getShearBottom{#getShearBottom}

| Name | Description |
| --- | --- |
| getShearBottom() | Gets or sets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) | 

 **Result:**



---


### setShearBottom{#setShearBottom}

| Name | Description |
| --- | --- |
| setShearBottom(value) | Gets or sets of the shear transform of the bottom side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) | 

 **Result:**



---


### getShearTop{#getShearTop}

| Name | Description |
| --- | --- |
| getShearTop() | Gets or sets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) | 

 **Result:**



---


### setShearTop{#setShearTop}

| Name | Description |
| --- | --- |
| setShearTop(value) | Gets or sets of the shear transform of the top side, vector stores the (x-axis, z-axis) shear value that measured in radian, default value is (0, 0) | 

 **Result:**



---


### getRadiusTop{#getRadiusTop}

| Name | Description |
| --- | --- |
| getRadiusTop() | Gets or sets the radius of cylinder's top cap. The radius of the top cap. | 

 **Result:**



---


### setRadiusTop{#setRadiusTop}

| Name | Description |
| --- | --- |
| setRadiusTop(value) | Gets or sets the radius of cylinder's top cap. The radius of the top cap. | 

 **Result:**



---


### getRadiusBottom{#getRadiusBottom}

| Name | Description |
| --- | --- |
| getRadiusBottom() | Gets or sets the radius of cylinder's bottom cap. The radius of the bottom cap. | 

 **Result:**



---


### setRadiusBottom{#setRadiusBottom}

| Name | Description |
| --- | --- |
| setRadiusBottom(value) | Gets or sets the radius of cylinder's bottom cap. The radius of the bottom cap. | 

 **Result:**



---


### getHeight{#getHeight}

| Name | Description |
| --- | --- |
| getHeight() | Gets or sets the height of the cylinder. The height. | 

 **Result:**



---


### setHeight{#setHeight}

| Name | Description |
| --- | --- |
| setHeight(value) | Gets or sets the height of the cylinder. The height. | 

 **Result:**



---


### getRadialSegments{#getRadialSegments}

| Name | Description |
| --- | --- |
| getRadialSegments() | Gets or sets the radial segments. The radial segments. | 

 **Result:**



---


### setRadialSegments{#setRadialSegments}

| Name | Description |
| --- | --- |
| setRadialSegments(value) | Gets or sets the radial segments. The radial segments. | 

 **Result:**



---


### getHeightSegments{#getHeightSegments}

| Name | Description |
| --- | --- |
| getHeightSegments() | Gets or sets the height segments. The height segments. | 

 **Result:**



---


### setHeightSegments{#setHeightSegments}

| Name | Description |
| --- | --- |
| setHeightSegments(value) | Gets or sets the height segments. The height segments. | 

 **Result:**



---


### getOpenEnded{#getOpenEnded}

| Name | Description |
| --- | --- |
| getOpenEnded() | Gets or sets a value indicating whether this Cylinder open ended. The default value is false. true if open ended; otherwise, top/bottom caps exists. | 

 **Result:**



---


### setOpenEnded{#setOpenEnded}

| Name | Description |
| --- | --- |
| setOpenEnded(value) | Gets or sets a value indicating whether this Cylinder open ended. The default value is false. true if open ended; otherwise, top/bottom caps exists. | 

 **Result:**



---


### getThetaStart{#getThetaStart}

| Name | Description |
| --- | --- |
| getThetaStart() | Gets or sets the theta start. The default value is 0. The theta start. | 

 **Result:**



---


### setThetaStart{#setThetaStart}

| Name | Description |
| --- | --- |
| setThetaStart(value) | Gets or sets the theta start. The default value is 0. The theta start. | 

 **Result:**



---


### getThetaLength{#getThetaLength}

| Name | Description |
| --- | --- |
| getThetaLength() | Gets or sets the length of the theta. The default value is 2π. The length of the theta. | 

 **Result:**



---


### setThetaLength{#setThetaLength}

| Name | Description |
| --- | --- |
| setThetaLength(value) | Gets or sets the length of the theta. The default value is 2π. The length of the theta. | 

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


### toMesh{#toMesh}

| Name | Description |
| --- | --- |
| toMesh() | Convert current object to mesh | 

 **Result:**
Mesh


---


### getBoundingBox{#getBoundingBox}

| Name | Description |
| --- | --- |
| getBoundingBox() | Gets the bounding box of current entity in its object space coordinate system. | 

 **Result:**
Mesh


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




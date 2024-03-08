---
title: Transform 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/transform/
---
## Transform class

  A transform contains information that allow access to object's translate/scale/rotation or transform matrix at minimum cost  This is used by local transform.  @hideconstructor


## Methods

### getGeometricTranslation{#getGeometricTranslation}

| Name | Description |
| --- | --- |
| getGeometricTranslation() | Gets or sets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. | 

 **Result:**



---


### setGeometricTranslation{#setGeometricTranslation}

| Name | Description |
| --- | --- |
| setGeometricTranslation(value) | Gets or sets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. | 

 **Result:**



---


### getGeometricScaling{#getGeometricScaling}

| Name | Description |
| --- | --- |
| getGeometricScaling() | Gets or sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. | 

 **Result:**



---


### setGeometricScaling{#setGeometricScaling}

| Name | Description |
| --- | --- |
| setGeometricScaling(value) | Gets or sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. | 

 **Result:**



---


### getGeometricRotation{#getGeometricRotation}

| Name | Description |
| --- | --- |
| getGeometricRotation() | Gets or sets the geometric Euler rotation(measured in degree). Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. | 

 **Result:**



---


### setGeometricRotation{#setGeometricRotation}

| Name | Description |
| --- | --- |
| setGeometricRotation(value) | Gets or sets the geometric Euler rotation(measured in degree). Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. | 

 **Result:**



---


### getTranslation{#getTranslation}

| Name | Description |
| --- | --- |
| getTranslation() | Gets or sets the translation | 

 **Result:**



---


### setTranslation{#setTranslation}

| Name | Description |
| --- | --- |
| setTranslation(value) | Gets or sets the translation | 

 **Result:**



---


### getScale{#getScale}

| Name | Description |
| --- | --- |
| getScale() | Gets or sets the scale | 

 **Result:**



---


### setScale{#setScale}

| Name | Description |
| --- | --- |
| setScale(value) | Gets or sets the scale | 

 **Result:**



---


### getPreRotation{#getPreRotation}

| Name | Description |
| --- | --- |
| getPreRotation() | Gets or sets the pre-rotation represented in degree | 

 **Result:**



---


### setPreRotation{#setPreRotation}

| Name | Description |
| --- | --- |
| setPreRotation(value) | Gets or sets the pre-rotation represented in degree | 

 **Result:**



---


### getPostRotation{#getPostRotation}

| Name | Description |
| --- | --- |
| getPostRotation() | Gets or sets the post-rotation represented in degree | 

 **Result:**



---


### setPostRotation{#setPostRotation}

| Name | Description |
| --- | --- |
| setPostRotation(value) | Gets or sets the post-rotation represented in degree | 

 **Result:**



---


### getEulerAngles{#getEulerAngles}

| Name | Description |
| --- | --- |
| getEulerAngles() | Gets or sets the rotation represented in Euler angles, measured in degree | 

 **Result:**



---


### setEulerAngles{#setEulerAngles}

| Name | Description |
| --- | --- |
| setEulerAngles(value) | Gets or sets the rotation represented in Euler angles, measured in degree | 

 **Result:**



---


### getRotation{#getRotation}

| Name | Description |
| --- | --- |
| getRotation() | Gets or sets the rotation represented in quaternion. | 

 **Result:**



---


### setRotation{#setRotation}

| Name | Description |
| --- | --- |
| setRotation(value) | Gets or sets the rotation represented in quaternion. | 

 **Result:**



---


### getTransformMatrix{#getTransformMatrix}

| Name | Description |
| --- | --- |
| getTransformMatrix() | Gets or sets the transform matrix. Assign on this will reset the Translation, Scale and Rotation, the GeometricRotation, GeometricScaling and GeometricTranslation will not be affected. | 

 **Result:**



---


### setTransformMatrix{#setTransformMatrix}

| Name | Description |
| --- | --- |
| setTransformMatrix(value) | Gets or sets the transform matrix. Assign on this will reset the Translation, Scale and Rotation, the GeometricRotation, GeometricScaling and GeometricTranslation will not be affected. | 

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


### setGeometricTranslation{#setGeometricTranslation}

| Name | Description |
| --- | --- |
| setGeometricTranslation(x, y, z) | Sets the geometric translation. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. | 

 **Result:**



---


### setGeometricScaling{#setGeometricScaling}

| Name | Description |
| --- | --- |
| setGeometricScaling(sx, sy, sz) | Sets the geometric scaling. Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. | 

 **Result:**



---


### setGeometricRotation{#setGeometricRotation}

| Name | Description |
| --- | --- |
| setGeometricRotation(rx, ry, rz) | Sets the geometric Euler rotation(measured in degree). Geometric transformation only affects the entities attached and leave the child nodes unaffected. It will be merged as local transformation when you export the geometric transformation to file types that does not support it. | 

 **Result:**



---


### setTranslation{#setTranslation}

| Name | Description |
| --- | --- |
| setTranslation(tx, ty, tz) | Sets the translation of current transform. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  t | Number | null |
|  t | Number | null |
|  t | Number | null |

 **Result:**
Transform


---


### setScale{#setScale}

| Name | Description |
| --- | --- |
| setScale(sx, sy, sz) | Sets the scale of current transform. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  s | Number | null |
|  s | Number | null |
|  s | Number | null |

 **Result:**
Transform


---


### setEulerAngles{#setEulerAngles}

| Name | Description |
| --- | --- |
| setEulerAngles(rx, ry, rz) | Sets the Euler angles in degrees of current transform. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  r | Number | null |
|  r | Number | null |
|  r | Number | null |

 **Result:**
Transform


---


### setRotation{#setRotation}

| Name | Description |
| --- | --- |
| setRotation(rw, rx, ry, rz) | Sets the rotation(as quaternion components) of current transform. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  r | Number | null |
|  r | Number | null |
|  r | Number | null |
|  r | Number | null |

 **Result:**
Transform


---


### setPreRotation{#setPreRotation}

| Name | Description |
| --- | --- |
| setPreRotation(rx, ry, rz) | Sets the pre-rotation represented in degree | 

 **Result:**
Transform


---


### setPostRotation{#setPostRotation}

| Name | Description |
| --- | --- |
| setPostRotation(rx, ry, rz) | Sets the post-rotation represented in degree | 

 **Result:**
Transform


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




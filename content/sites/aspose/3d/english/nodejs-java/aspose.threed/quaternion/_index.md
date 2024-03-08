---
title: Quaternion 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/quaternion/
---
## Quaternion class

  Quaternion is usually used to perform rotation in computer graphics.


## Properties

| Name | Description |
| --- | --- |
| 	w | The w component. | 
| 	x | The x component. | 
| 	y | The y component. | 
| 	z | The z component. | 
| 	IDENTITY | The Identity quaternion. | 

## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() |  | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(w, x, y, z) | Initializes a new instance of the Quaternion class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| w | Number | w component of the quaternion |
| x | Number | x component of the quaternion |
| y | Number | y component of the quaternion |
| z | Number | z component of the quaternion |

 **Result:**



---


### getLength{#getLength}

| Name | Description |
| --- | --- |
| getLength() | Gets the length of the quaternion | 

 **Result:**



---


### equals{#equals}

| Name | Description |
| --- | --- |
| equals(obj) | Check if two quaternions equals | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| obj | Object | The object to check equality. |

 **Result:**
boolean


---


### hashCode{#hashCode}

| Name | Description |
| --- | --- |
| hashCode() | Gets the hash code of Quaternion | 

 **Result:**
Number


---


### conjugate{#conjugate}

| Name | Description |
| --- | --- |
| conjugate() | Returns a conjugate quaternion of current quaternion | 

 **Result:**
Quaternion


---


### inverse{#inverse}

| Name | Description |
| --- | --- |
| inverse() | Returns a inverse quaternion of current quaternion | 

 **Result:**
Quaternion


---


### dot{#dot}

| Name | Description |
| --- | --- |
| dot(q) | Dots product | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| q | Quaternion | The quaternion |

 **Result:**
Number


---


### eulerAngles{#eulerAngles}

| Name | Description |
| --- | --- |
| eulerAngles() | Converts quaternion to rotation represented by Euler angles All components are in radian | 

 **Result:**
Vector3


---


### normalize{#normalize}

| Name | Description |
| --- | --- |
| normalize() | Normalize the quaternion | 

 **Result:**
Quaternion


---


### concat{#concat}

| Name | Description |
| --- | --- |
| concat(rhs) | Concatenate two quaternions | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  rh | Quaternion | null |

 **Result:**
Quaternion


---


### fromAngleAxis{#fromAngleAxis}

| Name | Description |
| --- | --- |
| fromAngleAxis(a, axis) | Creates a quaternion around given axis and rotate in clockwise | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| a | Number | Clockwise rotation in radian |
| axis | Vector3 | Axis |

 **Result:**
Quaternion


---


### fromRotation{#fromRotation}

| Name | Description |
| --- | --- |
| fromRotation(orig, dest) | Creates a quaternion that rotate from original to destination direction | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| orig | Vector3 | Original direction |
| dest | Vector3 | Destination direction |

 **Result:**
Quaternion


---


### fromEulerAngle{#fromEulerAngle}

| Name | Description |
| --- | --- |
| fromEulerAngle(pitch, yaw, roll) | Creates quaternion from given Euler angle | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| pitch | Number | Pitch in radian |
| yaw | Number | Yaw in radian |
| roll | Number | Roll in radian |

 **Result:**
Quaternion


---


### fromEulerAngle{#fromEulerAngle}

| Name | Description |
| --- | --- |
| fromEulerAngle(eulerAngle) | Creates quaternion from given Euler angle | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| eulerAngle | Vector3 | Euler angle in radian |

 **Result:**
Quaternion


---


### toMatrix{#toMatrix}

| Name | Description |
| --- | --- |
| toMatrix() | Convert the rotation presented by quaternion to transform matrix. | 

 **Result:**
Matrix4


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Gets the representation of quaternion in string | 

 **Result:**
String


---


### interpolate{#interpolate}

| Name | Description |
| --- | --- |
| interpolate(t, from, to) | Populates this quaternion with the interpolated value between the given quaternion arguments for a t between from and to. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| t | Number | The coefficient to interpolate. |
| from | Quaternion | Source quaternion. |
| to | Quaternion | Target quaternion. |

 **Result:**
Quaternion


---




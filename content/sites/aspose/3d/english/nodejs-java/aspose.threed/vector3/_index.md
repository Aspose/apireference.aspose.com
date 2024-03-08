---
title: Vector3 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/vector3/
---
## Vector3 class

  A vector with three components.


## Properties

| Name | Description |
| --- | --- |
| 	x | The x component. | 
| 	y | The y component. | 
| 	z | The z component. | 
| 	ORIGIN | Gets the origin position. The origin. | 
| 	UNIT_SCALE | Gets the unit scale vector. | 
| 	X_AXIS | Gets the X axis. The X axis. | 
| 	Y_AXIS | Gets the Y axis. The Y axis. | 
| 	Z_AXIS | Gets the Z axis. The Z axis. | 

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
| constructor_overload(x, y, z) | Initializes a new instance of the Vector3 struct. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| x | Number | The x coordinate. |
| y | Number | The y coordinate. |
| z | Number | The z coordinate. |

 **Result:**



---


### constructor_overload$2{#constructor_overload$2}

| Name | Description |
| --- | --- |
| constructor_overload$2(vec) | Initializes a new instance of the Vector3 struct. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| vec | FVector3 | The x coordinate. |

 **Result:**



---


### constructor_overload$3{#constructor_overload$3}

| Name | Description |
| --- | --- |
| constructor_overload$3(v) | Initializes a new instance of the Vector3 struct. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| v | Number | V. |

 **Result:**



---


### constructor_overload$4{#constructor_overload$4}

| Name | Description |
| --- | --- |
| constructor_overload$4(vec4) | Initializes a new instance of the Vector3 struct. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| vec4 | Vector4 | Vec4. |

 **Result:**



---


### getLength2{#getLength2}

| Name | Description |
| --- | --- |
| getLength2() | Gets the square of the length. The length2. | 

 **Result:**



---


### getLength{#getLength}

| Name | Description |
| --- | --- |
| getLength() | Gets the length of this vector. The length. | 

 **Result:**



---


### equals{#equals}

| Name | Description |
| --- | --- |
| equals(obj) | Check if two vector3 equals | 

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
| hashCode() | Gets the hash code of Vector3 | 

 **Result:**
Number


---


### dot{#dot}

| Name | Description |
| --- | --- |
| dot(rhs) | Gets the dot product of two vectors | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| rhs | Vector3 | Right hand side value. |

 **Result:**
Number


---


### normalize{#normalize}

| Name | Description |
| --- | --- |
| normalize() | Normalizes this instance. | 

 **Result:**
Vector3


---


### sin{#sin}

| Name | Description |
| --- | --- |
| sin() | Calculates sine on each component | 

 **Result:**
Vector3


---


### cos{#cos}

| Name | Description |
| --- | --- |
| cos() | Calculates cosine on each component | 

 **Result:**
Vector3


---


### cross{#cross}

| Name | Description |
| --- | --- |
| cross(rhs) | Cross product of two vectors | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| rhs | Vector3 | Right hand side value. |

 **Result:**
Vector3


---


### set{#set}

| Name | Description |
| --- | --- |
| set(newX, newY, newZ) | Sets the x/y/z component in one call. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| newX | Number | The x component. |
| newY | Number | The y component. |
| newZ | Number | The z component. |

 **Result:**
Vector3


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Returns a java.lang.String that represents the current Vector3. | 

 **Result:**
String


---


### angleBetween{#angleBetween}

| Name | Description |
| --- | --- |
| angleBetween(dir, up) | Calculate the inner angle between two direction Two direction can be non-normalized vectors | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| dir | Vector3 | The direction vector to compare with |
| up | Vector3 | The up vector of the two direction's shared plane |

 **Result:**
Number


---


### angleBetween{#angleBetween}

| Name | Description |
| --- | --- |
| angleBetween(dir) | Calculate the inner angle between two direction Two direction can be non-normalized vectors | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| dir | Vector3 | The direction vector to compare with |

 **Result:**
Number


---


### compareTo{#compareTo}

| Name | Description |
| --- | --- |
| compareTo(other) | Compare current vector to another instance. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  othe | Vector3 | null |

 **Result:**
Number


---




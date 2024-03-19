---
title: Matrix4 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/matrix4/
---
## Matrix4 class

  4x4 matrix implementation.


## Properties

| Name | Description |
| --- | --- |
| 	m00 | The m00. | 
| 	m01 | The m01. | 
| 	m02 | The m02. | 
| 	m03 | The m03. | 
| 	m10 | The m10. | 
| 	m11 | The m11. | 
| 	m12 | The m12. | 
| 	m13 | The m13. | 
| 	m20 | The m20. | 
| 	m21 | The m21. | 
| 	m22 | The m22. | 
| 	m23 | The m23. | 
| 	m30 | The m30. | 
| 	m31 | The m31. | 
| 	m32 | The m32. | 
| 	m33 | The m33. | 

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
| constructor_overload(r0, r1, r2, r3) | Constructs matrix from 4 rows. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| r0 | Vector4 | R0. |
| r1 | Vector4 | R1. |
| r2 | Vector4 | R2. |
| r3 | Vector4 | R3. |

 **Result:**



---


### constructor_overload$2{#constructor_overload$2}

| Name | Description |
| --- | --- |
| constructor_overload$2(m00, m01, m02, m03, m10, m11, m12, m13, m20, m21, m22, m23, m30, m31, m32, m33) | Initializes a new instance of the Matrix4 struct. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| m00 | Number | M00. |
| m01 | Number | M01. |
| m02 | Number | M02. |
| m03 | Number | M03. |
| m10 | Number | M10. |
| m11 | Number | M11. |
| m12 | Number | M12. |
| m13 | Number | M13. |
| m20 | Number | M20. |
| m21 | Number | M21. |
| m22 | Number | M22. |
| m23 | Number | M23. |
| m30 | Number | M30. |
| m31 | Number | M31. |
| m32 | Number | M32. |
| m33 | Number | M33. |

 **Result:**



---


### constructor_overload$3{#constructor_overload$3}

| Name | Description |
| --- | --- |
| constructor_overload$3(m) | Construct Matrix4 from an FMatrix4 instance | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | FMatrix4 | null |

 **Result:**



---


### constructor_overload$4{#constructor_overload$4}

| Name | Description |
| --- | --- |
| constructor_overload$4(m) | Initializes a new instance of the Matrix4 struct. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| m | Number[] | M. |

 **Result:**



---


### getIdentity{#getIdentity}

| Name | Description |
| --- | --- |
| getIdentity() | Gets the identity matrix. The identity. | 

 **Result:**



---


### getDeterminant{#getDeterminant}

| Name | Description |
| --- | --- |
| getDeterminant() | Gets the determinant of the matrix. The determinant. | 

 **Result:**



---


### concatenate{#concatenate}

| Name | Description |
| --- | --- |
| concatenate(m2) | Concatenates the two matrices | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| m2 | Matrix4 | M2. |

 **Result:**
Matrix4


---


### transpose{#transpose}

| Name | Description |
| --- | --- |
| transpose() | Transposes this instance. | 

 **Result:**
Matrix4


---


### normalize{#normalize}

| Name | Description |
| --- | --- |
| normalize() | Normalizes this instance. | 

 **Result:**
Matrix4


---


### inverse{#inverse}

| Name | Description |
| --- | --- |
| inverse() | Inverses this instance. | 

 **Result:**
Matrix4


---


### setTRS{#setTRS}

| Name | Description |
| --- | --- |
| setTRS(translation, rotation, scale) | Initializes the matrix with translation/rotation/scale | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| translation | Vector3 | Translation. |
| rotation | Vector3 | Euler angles for rotation, fields are in degree. |
| scale | Vector3 | Scale. |

 **Result:**
Matrix4


---


### toArray{#toArray}

| Name | Description |
| --- | --- |
| toArray() | Converts matrix to array. | 

 **Result:**
Number[]


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Returns a java.lang.String that represents the current Matrix4. | 

 **Result:**
String


---


### translate{#translate}

| Name | Description |
| --- | --- |
| translate(t) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| t | Vector3 | Translate offset |

 **Result:**
Matrix4


---


### translate{#translate}

| Name | Description |
| --- | --- |
| translate(tx, ty, tz) | Creates a matrix that translates along the x-axis, the y-axis and the z-axis | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| tx | Number | X-coordinate offset |
| ty | Number | Y-coordinate offset |
| tz | Number | Z-coordinate offset |

 **Result:**
Matrix4


---


### scale{#scale}

| Name | Description |
| --- | --- |
| scale(s) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| s | Vector3 | Scaling factories applies to the x-axis, the y-axis and the z-axis |

 **Result:**
Matrix4


---


### scale{#scale}

| Name | Description |
| --- | --- |
| scale(s) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| s | Number | Scaling factories applies to all axex |

 **Result:**
Matrix4


---


### scale{#scale}

| Name | Description |
| --- | --- |
| scale(sx, sy, sz) | Creates a matrix that scales along the x-axis, the y-axis and the z-axis. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| sx | Number | Scaling factories applies to the x-axis |
| sy | Number | Scaling factories applies to the y-axis |
| sz | Number | Scaling factories applies to the z-axis |

 **Result:**
Matrix4


---


### rotateFromEuler{#rotateFromEuler}

| Name | Description |
| --- | --- |
| rotateFromEuler(eul) | Create a rotation matrix from Euler angle | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| eul | Vector3 | Rotation in radian |

 **Result:**
Matrix4


---


### rotateFromEuler{#rotateFromEuler}

| Name | Description |
| --- | --- |
| rotateFromEuler(rx, ry, rz) | Create a rotation matrix from Euler angle | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| rx | Number | Rotation in x axis in radian |
| ry | Number | Rotation in y axis in radian |
| rz | Number | Rotation in z axis in radian |

 **Result:**
Matrix4


---


### rotate{#rotate}

| Name | Description |
| --- | --- |
| rotate(angle, axis) | Create a rotation matrix by rotation angle and axis | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| angle | Number | Rotate angle in radian |
| axis | Vector3 | Rotation axis |

 **Result:**
Matrix4


---


### rotate{#rotate}

| Name | Description |
| --- | --- |
| rotate(q) | Create a rotation matrix from a quaternion | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| q | Quaternion | Rotation quaternion |

 **Result:**
Matrix4


---




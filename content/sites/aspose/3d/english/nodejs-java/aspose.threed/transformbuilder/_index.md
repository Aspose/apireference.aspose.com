---
title: TransformBuilder 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/transformbuilder/
---
## TransformBuilder class

  The TransformBuilder is used to build transform matrix by a chain of transformations.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(initial, order) | Construct a TransformBuilder with initial transform matrix and specified compose order | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  initia | Matrix4 | null |
| order | ComposeOrder | ComposeOrder |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(order) | Construct a TransformBuilder with initial identity transform matrix and specified compose order | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| order | ComposeOrder | ComposeOrder |

 **Result:**



---


### getMatrix{#getMatrix}

| Name | Description |
| --- | --- |
| getMatrix() | Gets or sets the current matrix value | 

 **Result:**



---


### setMatrix{#setMatrix}

| Name | Description |
| --- | --- |
| setMatrix(value) | Gets or sets the current matrix value | 

 **Result:**



---


### getComposeOrder{#getComposeOrder}

| Name | Description |
| --- | --- |
| getComposeOrder() | Gets or sets the chain compose order. The value of the property is ComposeOrder integer constant. | 

 **Result:**



---


### setComposeOrder{#setComposeOrder}

| Name | Description |
| --- | --- |
| setComposeOrder(value) | Gets or sets the chain compose order. The value of the property is ComposeOrder integer constant. | 

 **Result:**



---


### compose{#compose}

| Name | Description |
| --- | --- |
| compose(m) | Append or prepend the argument to internal matrix. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Matrix4 | null |

 **Result:**



---


### append{#append}

| Name | Description |
| --- | --- |
| append(m) | Append the new transform matrix to the transform chain. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Matrix4 | null |

 **Result:**



---


### prepend{#prepend}

| Name | Description |
| --- | --- |
| prepend(m) | Prepend the new transform matrix to the transform chain. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Matrix4 | null |

 **Result:**



---


### rearrange{#rearrange}

| Name | Description |
| --- | --- |
| rearrange(newX, newY, newZ) | Rearrange the layout of the axis. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| newX | Axis | Axis |
| newY | Axis | Axis |
| newZ | Axis | Axis |

 **Result:**



---


### scale{#scale}

| Name | Description |
| --- | --- |
| scale(s) | Chain a scaling transform matrix with a component scaled by s | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Number | null |

 **Result:**



---


### scale{#scale}

| Name | Description |
| --- | --- |
| scale(x, y, z) | Chain a scaling transform matrix | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Number | null |
|   | Number | null |
|   | Number | null |

 **Result:**



---


### scale{#scale}

| Name | Description |
| --- | --- |
| scale(s) | Chain a scale transform | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Vector3 | null |

 **Result:**



---


### rotateDegree{#rotateDegree}

| Name | Description |
| --- | --- |
| rotateDegree(angle, axis) | Chain a rotation transform in degree | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| angle | Number | The angle to rotate in degree |
| axis | Vector3 | The axis to rotate |

 **Result:**



---


### rotateRadian{#rotateRadian}

| Name | Description |
| --- | --- |
| rotateRadian(angle, axis) | Chain a rotation transform in radian | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| angle | Number | The angle to rotate in radian |
| axis | Vector3 | The axis to rotate |

 **Result:**



---


### rotate{#rotate}

| Name | Description |
| --- | --- |
| rotate(q) | Chain a rotation by a quaternion | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Quaternion | null |

 **Result:**



---


### rotateEulerDegree{#rotateEulerDegree}

| Name | Description |
| --- | --- |
| rotateEulerDegree(degX, degY, degZ) | Chain a rotation by Euler angles in degree | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  deg | Number | null |
|  deg | Number | null |
|  deg | Number | null |

 **Result:**



---


### rotateEulerRadian{#rotateEulerRadian}

| Name | Description |
| --- | --- |
| rotateEulerRadian(x, y, z) | Chain a rotation by Euler angles in radian | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Number | null |
|   | Number | null |
|   | Number | null |

 **Result:**



---


### rotateEulerRadian{#rotateEulerRadian}

| Name | Description |
| --- | --- |
| rotateEulerRadian(r) | Chain a rotation by Euler angles in radian | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Vector3 | null |

 **Result:**



---


### translate{#translate}

| Name | Description |
| --- | --- |
| translate(tx, ty, tz) | Chain a translation transform | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  t | Number | null |
|  t | Number | null |
|  t | Number | null |

 **Result:**



---


### translate{#translate}

| Name | Description |
| --- | --- |
| translate(v) | Chain a translation transform | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|   | Vector3 | null |

 **Result:**



---


### reset{#reset}

| Name | Description |
| --- | --- |
| reset() | Reset the transform to identity matrix | 

 **Result:**



---


### rotateDegree{#rotateDegree}

| Name | Description |
| --- | --- |
| rotateDegree(rot, order) | Append rotation with specified order | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| rot | Vector3 | Rotation in degrees |
| order | RotationOrder | RotationOrder |

 **Result:**



---


### rotateRadian{#rotateRadian}

| Name | Description |
| --- | --- |
| rotateRadian(rot, order) | Append rotation with specified order | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| rot | Vector3 | Rotation in radian |
| order | RotationOrder | RotationOrder |

 **Result:**



---




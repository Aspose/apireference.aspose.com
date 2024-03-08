---
title: Pose 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/pose/
---
## Pose class

  The pose is used to store transformation matrix when the geometry is skinned.  The pose is a set of BonePose, each BonePose saves the concrete transformation information of the bone node.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(name) | Initializes a new instance of the Pose class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload() | Initializes a new instance of the Pose class. | 

 **Result:**



---


### getPoseType{#getPoseType}

| Name | Description |
| --- | --- |
| getPoseType() | Gets or sets the type of the pose. The value of the property is PoseType integer constant.The type of the pose. | 

 **Result:**



---


### setPoseType{#setPoseType}

| Name | Description |
| --- | --- |
| setPoseType(value) | Gets or sets the type of the pose. The value of the property is PoseType integer constant.The type of the pose. | 

 **Result:**



---


### getBonePoses{#getBonePoses}

| Name | Description |
| --- | --- |
| getBonePoses() | Gets all BonePose. The nodes. | 

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


### addBonePose{#addBonePose}

| Name | Description |
| --- | --- |
| addBonePose(node, matrix, localMatrix) | Saves pose transformation matrix for the given bone node. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| node | Node | Bone Node. |
| matrix | Matrix4 | Transformation matrix. |
| localMatrix | boolean | If set to |

 **Result:**



---


### addBonePose{#addBonePose}

| Name | Description |
| --- | --- |
| addBonePose(node, matrix) | Saves pose transformation matrix for the given bone node. Global transformation matrix is implied. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| node | Node | Bone Node. |
| matrix | Matrix4 | Transformation matrix. |

 **Result:**



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




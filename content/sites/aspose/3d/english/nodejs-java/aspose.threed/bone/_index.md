---
title: Bone 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/bone/
---
## Bone class

  A bone defines the subset of the geometry's control point, and defined blend weight for each control point.  The Bone object cannot be used directly, a SkinDeformer instance is used to deform the geometry, and SkinDeformer comes with a set of bones, each bone linked to a node.  NOTE: A control point of a geometry can be bounded to more than one Bones.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(name) | Initializes a new instance of the Bone class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload() | Initializes a new instance of the Bone class. | 

 **Result:**



---


### getWeightCount{#getWeightCount}

| Name | Description |
| --- | --- |
| getWeightCount() | Gets the count of weight, this is automatically extended by setWeight(int, double) | 

 **Result:**



---


### getTransform{#getTransform}

| Name | Description |
| --- | --- |
| getTransform() | Gets or sets the transform matrix of the node containing the bone. | 

 **Result:**



---


### setTransform{#setTransform}

| Name | Description |
| --- | --- |
| setTransform(value) | Gets or sets the transform matrix of the node containing the bone. | 

 **Result:**



---


### getBoneTransform{#getBoneTransform}

| Name | Description |
| --- | --- |
| getBoneTransform() | Gets or sets the transform matrix of the bone. | 

 **Result:**



---


### setBoneTransform{#setBoneTransform}

| Name | Description |
| --- | --- |
| setBoneTransform(value) | Gets or sets the transform matrix of the bone. | 

 **Result:**



---


### getNode{#getNode}

| Name | Description |
| --- | --- |
| getNode() | Gets or sets the node. The bone node is the bone which skin attached to, the SkinDeformer will use bone node to influence the displacement of the control points. Bone node usually has a Skeleton attached, but it's not required. Attached Skeleton is usually used by DCC software to show skeleton to user. | 

 **Result:**



---


### setNode{#setNode}

| Name | Description |
| --- | --- |
| setNode(value) | Gets or sets the node. The bone node is the bone which skin attached to, the SkinDeformer will use bone node to influence the displacement of the control points. Bone node usually has a Skeleton attached, but it's not required. Attached Skeleton is usually used by DCC software to show skeleton to user. | 

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


### get{#get}

| Name | Description |
| --- | --- |
| get(index) |  | 

 **Result:**



---


### set{#set}

| Name | Description |
| --- | --- |
| set(index, value) |  | 

 **Result:**



---


### getWeight{#getWeight}

| Name | Description |
| --- | --- |
| getWeight(index) | Gets the weight for control point specified by index | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| index | Number | Control point's index |

 **Result:**
Number


---


### setWeight{#setWeight}

| Name | Description |
| --- | --- |
| setWeight(index, weight) | Sets the weight for control point specified by index | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| index | Number | Control point's index |
| weight | Number | New weight |

 **Result:**
Number


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




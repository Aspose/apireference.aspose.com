---
title: MorphTargetChannel 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/morphtargetchannel/
---
## MorphTargetChannel class

  A MorphTargetChannel is used by MorphTargetDeformer to organize the target geometries.  Some file formats like FBX support multiple channels in parallel.  Weight is between 0 and 1.0, and default weight for target is 0.0;


## Properties

| Name | Description |
| --- | --- |
| 	DEFAULT_WEIGHT | Default weight for morph target. | 

## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(name) | Initializes a new instance of the MorphTargetChannel class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload() | Initializes a new instance of the MorphTargetChannel class. | 

 **Result:**



---


### getWeights{#getWeights}

| Name | Description |
| --- | --- |
| getWeights() | Gets the full weight values of target geometries. The full weights. | 

 **Result:**



---


### getChannelWeight{#getChannelWeight}

| Name | Description |
| --- | --- |
| getChannelWeight() | Gets or sets the deformer weight of this channel. The weight is between 0.0 and 1.0 | 

 **Result:**



---


### setChannelWeight{#setChannelWeight}

| Name | Description |
| --- | --- |
| setChannelWeight(value) | Gets or sets the deformer weight of this channel. The weight is between 0.0 and 1.0 | 

 **Result:**



---


### getTargets{#getTargets}

| Name | Description |
| --- | --- |
| getTargets() | Gets all targets associated with the channel. | 

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
| get(target) |  | 

 **Result:**



---


### set{#set}

| Name | Description |
| --- | --- |
| set(target, value) |  | 

 **Result:**



---


### getWeight{#getWeight}

| Name | Description |
| --- | --- |
| getWeight(target) | Gets the weight for the specified target, if the target is not belongs to this channel, default value 0 is returned. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  targe | Shape | null |

 **Result:**
Number


---


### setWeight{#setWeight}

| Name | Description |
| --- | --- |
| setWeight(target, weight) | Sets the weight for the specified target, default value is 1, range should between 0~1 | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  targe | Shape | null |
|  weigh | Number | null |

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




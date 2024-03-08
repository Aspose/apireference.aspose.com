---
title: KeyframeSequence 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/keyframesequence/
---
## KeyframeSequence class

  The sequence of key-frames, it describes the transformation of a sampled value over time.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(name) | Initializes a new instance of the KeyframeSequence class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload() | Initializes a new instance of the KeyframeSequence class. | 

 **Result:**



---


### getBindPoint{#getBindPoint}

| Name | Description |
| --- | --- |
| getBindPoint() | Gets the property bind point which owns this curve | 

 **Result:**



---


### getKeyFrames{#getKeyFrames}

| Name | Description |
| --- | --- |
| getKeyFrames() | Gets the key frames of this curve. The keys. | 

 **Result:**



---


### getPostBehavior{#getPostBehavior}

| Name | Description |
| --- | --- |
| getPostBehavior() | Gets the post behavior indicates what the sampled value should be after the last key frame. | 

 **Result:**



---


### getPreBehavior{#getPreBehavior}

| Name | Description |
| --- | --- |
| getPreBehavior() | Gets the pre behavior indicates what the sampled value should be before the first key. | 

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


### add{#add}

| Name | Description |
| --- | --- |
| add(time, value) | Create a new key frame with specified value | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| time | Number | Time position(measured in seconds) |
| value | Number | The value at this time position |

 **Result:**



---


### add{#add}

| Name | Description |
| --- | --- |
| add(time, value, interpolation) | Create a new key frame with specified value | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| time | Number | Time position(measured in seconds) |
| value | Number | The value at this time position |
| interpolation | Interpolation | Interpolation |

 **Result:**



---


### reset{#reset}

| Name | Description |
| --- | --- |
| reset() | Removes all key frames and reset the post/pre behaviors. | 

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


### iterator{#iterator}

| Name | Description |
| --- | --- |
| iterator() | Reserved for internal use. | 

 **Result:**
Property


---




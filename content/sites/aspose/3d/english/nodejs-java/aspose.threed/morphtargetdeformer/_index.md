---
title: MorphTargetDeformer 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/morphtargetdeformer/
---
## MorphTargetDeformer class

  MorphTargetDeformer provides per-vertex animation.  MorphTargetDeformer organize all targets via MorphTargetChannel, each channel can organize multiple targets.  A common use of morph target deformer is to apply facial expression to a character.  More details can be found at https://en.wikipedia.org/wiki/Morph_target_animation


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(name) | Initializes a new instance of the MorphTargetDeformer class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload() | Initializes a new instance of the MorphTargetDeformer class. | 

 **Result:**



---


### getChannels{#getChannels}

| Name | Description |
| --- | --- |
| getChannels() | Gets all channels contained in this deformer | 

 **Result:**



---


### getOwner{#getOwner}

| Name | Description |
| --- | --- |
| getOwner() | Gets the geometry which owns this deformer | 

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




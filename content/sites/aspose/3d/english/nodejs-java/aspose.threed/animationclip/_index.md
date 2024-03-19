---
title: AnimationClip 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/animationclip/
---
## AnimationClip class

  The Animation clip is a collection of animations.  The scene can have one or more animation clips.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the AnimationClip class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(name) | Initializes a new instance of the AnimationClip class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name |

 **Result:**



---


### getAnimations{#getAnimations}

| Name | Description |
| --- | --- |
| getAnimations() | Gets the animations contained inside the clip. The layers. | 

 **Result:**



---


### getDescription{#getDescription}

| Name | Description |
| --- | --- |
| getDescription() | Gets or sets the description of this animation clip | 

 **Result:**



---


### setDescription{#setDescription}

| Name | Description |
| --- | --- |
| setDescription(value) | Gets or sets the description of this animation clip | 

 **Result:**



---


### getStart{#getStart}

| Name | Description |
| --- | --- |
| getStart() | Gets or sets the time in seconds of the beginning of the clip. | 

 **Result:**



---


### setStart{#setStart}

| Name | Description |
| --- | --- |
| setStart(value) | Gets or sets the time in seconds of the beginning of the clip. | 

 **Result:**



---


### getStop{#getStop}

| Name | Description |
| --- | --- |
| getStop() | Gets or sets the time in seconds of the end of the clip. | 

 **Result:**



---


### setStop{#setStop}

| Name | Description |
| --- | --- |
| setStop(value) | Gets or sets the time in seconds of the end of the clip. | 

 **Result:**



---


### getScene{#getScene}

| Name | Description |
| --- | --- |
| getScene() | Gets the scene that this object belongs to | 

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


### createAnimationNode{#createAnimationNode}

| Name | Description |
| --- | --- |
| createAnimationNode(nodeName) | A shorthand function to create and register the animation node on current clip. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| nodeName | String | New animation node's name |

 **Result:**
AnimationNode


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




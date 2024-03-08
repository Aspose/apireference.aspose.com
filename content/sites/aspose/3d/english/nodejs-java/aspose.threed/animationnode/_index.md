---
title: AnimationNode 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/animationnode/
---
## AnimationNode class

  Aspose.3D's supports animation hierarchy, each animation can be composed by several animations and animation's key-frame definition.  AnimationNode defines the transformation of a property value over time, for example, animation node can be used to control a node's transformation or other A3DObject object's numerical properties.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(name) | Initializes a new instance of the AnimationNode class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name |

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload() | Initializes a new instance of the AnimationNode class. | 

 **Result:**



---


### getBindPoints{#getBindPoints}

| Name | Description |
| --- | --- |
| getBindPoints() | Gets the current property bind points | 

 **Result:**



---


### getSubAnimations{#getSubAnimations}

| Name | Description |
| --- | --- |
| getSubAnimations() | Gets the sub-animation nodes under current animations | 

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


### findBindPoint{#findBindPoint}

| Name | Description |
| --- | --- |
| findBindPoint(name) | Finds the bind point by name. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Bind point's name to find. |

 **Result:**
BindPoint


---


### getBindPoint{#getBindPoint}

| Name | Description |
| --- | --- |
| getBindPoint(target, propName, create) | Gets the animation bind point on given property. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| target | A3DObject | On which object to create the bind point. |
| propName | String | The property's name. |
| create | boolean | If set to |

 **Result:**
BindPoint


---


### getKeyframeSequence{#getKeyframeSequence}

| Name | Description |
| --- | --- |
| getKeyframeSequence(target, propName, channelName, create) | Gets the keyframe sequence on given property and channel. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| target | A3DObject | On which instance to create the keyframe sequence. |
| propName | String | The property's name. |
| channelName | String | The channel name. |
| create | boolean | If set to |

 **Result:**
KeyframeSequence


---


### getKeyframeSequence{#getKeyframeSequence}

| Name | Description |
| --- | --- |
| getKeyframeSequence(target, propName, create) | Gets the keyframe sequence on given property. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| target | A3DObject | On which instance to create the keyframe sequence. |
| propName | String | The property's name. |
| create | boolean | If set to |

 **Result:**
KeyframeSequence


---


### createBindPoint{#createBindPoint}

| Name | Description |
| --- | --- |
| createBindPoint(obj, propName) | Creates a BindPoint based on the property data type. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| obj | A3DObject | Object. |
| propName | String | Property name. |

 **Result:**
BindPoint


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




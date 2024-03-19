---
title: Property 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/property/
---
## Property class

  Class to hold user-defined properties.  @hideconstructor


## Methods

### getValue{#getValue}

| Name | Description |
| --- | --- |
| getValue() | Gets or sets the value. The value. | 

 **Result:**



---


### setValue{#setValue}

| Name | Description |
| --- | --- |
| setValue(value) | Gets or sets the value. The value. | 

 **Result:**



---


### setName{#setName}

| Name | Description |
| --- | --- |
| setName(value) |  | 

 **Result:**



---


### getValueType{#getValueType}

| Name | Description |
| --- | --- |
| getValueType() | Gets the type of the property value. The type of the value. | 

 **Result:**



---


### getProperties{#getProperties}

| Name | Description |
| --- | --- |
| getProperties() | Gets the collection of all properties. | 

 **Result:**



---


### getBindPoint{#getBindPoint}

| Name | Description |
| --- | --- |
| getBindPoint(anim, create) | Gets the property bind point on specified animation instance. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| anim | AnimationNode | On which animation to create the bind point. |
| create | boolean | Create the property bind point if it's not found. |

 **Result:**
BindPoint


---


### getKeyframeSequence{#getKeyframeSequence}

| Name | Description |
| --- | --- |
| getKeyframeSequence(anim, create) | Gets the keyframe sequence on specified animation instance. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| anim | AnimationNode | On which animation to create the keyframe sequence. |
| create | boolean | Create the keyframe sequence if it's not found. |

 **Result:**
KeyframeSequence


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Returns a string that represents the current Property. | 

 **Result:**
String


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




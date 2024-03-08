---
title: ShaderMaterial 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/shadermaterial/
---
## ShaderMaterial class

  A shader material allows to describe the material by external rendering engine or shader language.  ShaderMaterial uses ShaderTechnique to describe the concrete rendering details,  and the most suitable one will be used according to the final rendering platform.  For example, your ShaderMaterial instance can have two technique, one is defined by HLSL, and another is defined by GLSL  Under non-window platform the GLSL should be used instead of HLSL


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the ShaderMaterial class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(name) | Initializes a new instance of the ShaderMaterial class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name |

 **Result:**



---


### getTechniques{#getTechniques}

| Name | Description |
| --- | --- |
| getTechniques() | Gets all available techniques defined in this material. | 

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


### getTexture{#getTexture}

| Name | Description |
| --- | --- |
| getTexture(slotName) | Gets the texture from the specified slot, it can be material's property name or shader's parameter name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| slotName | String | Slot name. |

 **Result:**
TextureBase


---


### setTexture{#setTexture}

| Name | Description |
| --- | --- |
| setTexture(slotName, texture) | Sets the texture to specified slot | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| slotName | String | Slot name. |
| texture | TextureBase | Texture. |

 **Result:**
TextureBase


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Formats object to string | 

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


### iterator{#iterator}

| Name | Description |
| --- | --- |
| iterator() | Reserved for internal use. | 

 **Result:**
Property


---




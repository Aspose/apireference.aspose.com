---
title: Material 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/material/
---
## Material class

  Material defines the parameters necessary for visual appearance of geometry.  Aspose.3D provides shading model for LambertMaterial, PhongMaterial and ShaderMaterial  @hideconstructor


## Properties

| Name | Description |
| --- | --- |
| 	MAP_SPECULAR | Used in setTexture(java.lang.String, com.aspose.threed.TextureBase) to assign a specular texture mapping. | 
| 	MAP_DIFFUSE | Used in setTexture(java.lang.String, com.aspose.threed.TextureBase) to assign a diffuse texture mapping. | 
| 	MAP_EMISSIVE | Used in setTexture(java.lang.String, com.aspose.threed.TextureBase) to assign a emissive texture mapping. | 
| 	MAP_AMBIENT | Used in setTexture(java.lang.String, com.aspose.threed.TextureBase) to assign a ambient texture mapping. | 
| 	MAP_NORMAL | Used in setTexture(java.lang.String, com.aspose.threed.TextureBase) to assign a normal texture mapping. | 

## Methods

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




---
title: PbrSpecularMaterial 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/pbrspecularmaterial/
---
## PbrSpecularMaterial class

  Material for physically based rendering based on diffuse color/specular/glossiness


## Properties

| Name | Description |
| --- | --- |
| 	MAP_SPECULAR_GLOSSINESS | The texture map for specular glossiness | 

## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Constructor of the PbrSpecularMaterial | 

 **Result:**



---


### getTransparency{#getTransparency}

| Name | Description |
| --- | --- |
| getTransparency() | Gets or sets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped. The transparency factor. | 

 **Result:**



---


### setTransparency{#setTransparency}

| Name | Description |
| --- | --- |
| setTransparency(value) | Gets or sets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped. The transparency factor. | 

 **Result:**



---


### getNormalTexture{#getNormalTexture}

| Name | Description |
| --- | --- |
| getNormalTexture() | Gets or sets the texture of normal mapping | 

 **Result:**



---


### setNormalTexture{#setNormalTexture}

| Name | Description |
| --- | --- |
| setNormalTexture(value) | Gets or sets the texture of normal mapping | 

 **Result:**



---


### getSpecularGlossinessTexture{#getSpecularGlossinessTexture}

| Name | Description |
| --- | --- |
| getSpecularGlossinessTexture() | Gets or sets the texture for specular color, channel RGB stores the specular color and channel A stores the glossiness. | 

 **Result:**



---


### setSpecularGlossinessTexture{#setSpecularGlossinessTexture}

| Name | Description |
| --- | --- |
| setSpecularGlossinessTexture(value) | Gets or sets the texture for specular color, channel RGB stores the specular color and channel A stores the glossiness. | 

 **Result:**



---


### getGlossinessFactor{#getGlossinessFactor}

| Name | Description |
| --- | --- |
| getGlossinessFactor() | Gets or sets the glossiness(smoothness) of the material, 1 means perfectly smooth and 0 means perfectly rough, default value is 1, range is [0, 1] | 

 **Result:**



---


### setGlossinessFactor{#setGlossinessFactor}

| Name | Description |
| --- | --- |
| setGlossinessFactor(value) | Gets or sets the glossiness(smoothness) of the material, 1 means perfectly smooth and 0 means perfectly rough, default value is 1, range is [0, 1] | 

 **Result:**



---


### getSpecular{#getSpecular}

| Name | Description |
| --- | --- |
| getSpecular() | Gets or sets the specular color of the material, default value is (1, 1, 1). | 

 **Result:**



---


### setSpecular{#setSpecular}

| Name | Description |
| --- | --- |
| setSpecular(value) | Gets or sets the specular color of the material, default value is (1, 1, 1). | 

 **Result:**



---


### getDiffuseTexture{#getDiffuseTexture}

| Name | Description |
| --- | --- |
| getDiffuseTexture() | Gets or sets the texture for diffuse | 

 **Result:**



---


### setDiffuseTexture{#setDiffuseTexture}

| Name | Description |
| --- | --- |
| setDiffuseTexture(value) | Gets or sets the texture for diffuse | 

 **Result:**



---


### getDiffuse{#getDiffuse}

| Name | Description |
| --- | --- |
| getDiffuse() | Gets or sets the diffuse color of the material, default value is (1, 1, 1) | 

 **Result:**



---


### setDiffuse{#setDiffuse}

| Name | Description |
| --- | --- |
| setDiffuse(value) | Gets or sets the diffuse color of the material, default value is (1, 1, 1) | 

 **Result:**



---


### getEmissiveTexture{#getEmissiveTexture}

| Name | Description |
| --- | --- |
| getEmissiveTexture() | Gets or sets the texture for emissive | 

 **Result:**



---


### setEmissiveTexture{#setEmissiveTexture}

| Name | Description |
| --- | --- |
| setEmissiveTexture(value) | Gets or sets the texture for emissive | 

 **Result:**



---


### getEmissiveColor{#getEmissiveColor}

| Name | Description |
| --- | --- |
| getEmissiveColor() | Gets or sets the emissive color, default value is (0, 0, 0) | 

 **Result:**



---


### setEmissiveColor{#setEmissiveColor}

| Name | Description |
| --- | --- |
| setEmissiveColor(value) | Gets or sets the emissive color, default value is (0, 0, 0) | 

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




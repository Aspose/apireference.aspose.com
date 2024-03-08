---
title: PbrMaterial 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/pbrmaterial/
---
## PbrMaterial class

  Material for physically based rendering based on albedo color/metallic/roughness


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Construct a default PBR material instance | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(albedo) | Construct a default PBR material with specified albedo color value. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| albedo | Vector3 | The default albedo color value |

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


### getSpecularTexture{#getSpecularTexture}

| Name | Description |
| --- | --- |
| getSpecularTexture() | Gets or sets the texture for specular color | 

 **Result:**



---


### setSpecularTexture{#setSpecularTexture}

| Name | Description |
| --- | --- |
| setSpecularTexture(value) | Gets or sets the texture for specular color | 

 **Result:**



---


### getAlbedoTexture{#getAlbedoTexture}

| Name | Description |
| --- | --- |
| getAlbedoTexture() | Gets or sets the texture for albedo | 

 **Result:**



---


### setAlbedoTexture{#setAlbedoTexture}

| Name | Description |
| --- | --- |
| setAlbedoTexture(value) | Gets or sets the texture for albedo | 

 **Result:**



---


### getAlbedo{#getAlbedo}

| Name | Description |
| --- | --- |
| getAlbedo() | Gets or sets the base color of the material | 

 **Result:**



---


### setAlbedo{#setAlbedo}

| Name | Description |
| --- | --- |
| setAlbedo(value) | Gets or sets the base color of the material | 

 **Result:**



---


### getOcclusionTexture{#getOcclusionTexture}

| Name | Description |
| --- | --- |
| getOcclusionTexture() | Gets or sets the texture for ambient occlusion | 

 **Result:**



---


### setOcclusionTexture{#setOcclusionTexture}

| Name | Description |
| --- | --- |
| setOcclusionTexture(value) | Gets or sets the texture for ambient occlusion | 

 **Result:**



---


### getOcclusionFactor{#getOcclusionFactor}

| Name | Description |
| --- | --- |
| getOcclusionFactor() | Gets or sets the factor of ambient occlusion | 

 **Result:**



---


### setOcclusionFactor{#setOcclusionFactor}

| Name | Description |
| --- | --- |
| setOcclusionFactor(value) | Gets or sets the factor of ambient occlusion | 

 **Result:**



---


### getMetallicFactor{#getMetallicFactor}

| Name | Description |
| --- | --- |
| getMetallicFactor() | Gets or sets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric. | 

 **Result:**



---


### setMetallicFactor{#setMetallicFactor}

| Name | Description |
| --- | --- |
| setMetallicFactor(value) | Gets or sets the metalness of the material, value of 1 means the material is a metal and value of 0 means the material is a dielectric. | 

 **Result:**



---


### getRoughnessFactor{#getRoughnessFactor}

| Name | Description |
| --- | --- |
| getRoughnessFactor() | Gets or sets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth | 

 **Result:**



---


### setRoughnessFactor{#setRoughnessFactor}

| Name | Description |
| --- | --- |
| setRoughnessFactor(value) | Gets or sets the roughness of the material, value of 1 means the material is completely rough and value of 0 means the material is completely smooth | 

 **Result:**



---


### getMetallicRoughness{#getMetallicRoughness}

| Name | Description |
| --- | --- |
| getMetallicRoughness() | Gets or sets the texture for metallic(in R channel) and roughness(in G channel) | 

 **Result:**



---


### setMetallicRoughness{#setMetallicRoughness}

| Name | Description |
| --- | --- |
| setMetallicRoughness(value) | Gets or sets the texture for metallic(in R channel) and roughness(in G channel) | 

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
| getEmissiveColor() | Gets or sets the emissive color | 

 **Result:**



---


### setEmissiveColor{#setEmissiveColor}

| Name | Description |
| --- | --- |
| setEmissiveColor(value) | Gets or sets the emissive color | 

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


### fromMaterial{#fromMaterial}

| Name | Description |
| --- | --- |
| fromMaterial(material) | Allow convert other material to PbrMaterial | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  materia | Material | null |

 **Result:**
PbrMaterial


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




---
title: PhongMaterial 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/phongmaterial/
---
## PhongMaterial class

  Material for blinn-phong shading model.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initializes a new instance of the PhongMaterial class. | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(name) | Initializes a new instance of the PhongMaterial class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name |

 **Result:**



---


### getSpecularColor{#getSpecularColor}

| Name | Description |
| --- | --- |
| getSpecularColor() | Gets or sets the specular color. | 

 **Result:**



---


### setSpecularColor{#setSpecularColor}

| Name | Description |
| --- | --- |
| setSpecularColor(value) | Gets or sets the specular color. | 

 **Result:**



---


### getSpecularFactor{#getSpecularFactor}

| Name | Description |
| --- | --- |
| getSpecularFactor() | Gets or sets the specular factor. The formula of specular: SpecularColor SpecularFactor (N dot H) ^ Shininess | 

 **Result:**



---


### setSpecularFactor{#setSpecularFactor}

| Name | Description |
| --- | --- |
| setSpecularFactor(value) | Gets or sets the specular factor. The formula of specular: SpecularColor SpecularFactor (N dot H) ^ Shininess | 

 **Result:**



---


### getShininess{#getShininess}

| Name | Description |
| --- | --- |
| getShininess() | Gets or sets the shininess, this controls the specular highlight's size. The formula of specular: SpecularColor SpecularFactor (N dot H) ^ Shininess The shininess. | 

 **Result:**



---


### setShininess{#setShininess}

| Name | Description |
| --- | --- |
| setShininess(value) | Gets or sets the shininess, this controls the specular highlight's size. The formula of specular: SpecularColor SpecularFactor (N dot H) ^ Shininess The shininess. | 

 **Result:**



---


### getReflectionColor{#getReflectionColor}

| Name | Description |
| --- | --- |
| getReflectionColor() | Gets or sets the reflection color. The reflection. | 

 **Result:**



---


### setReflectionColor{#setReflectionColor}

| Name | Description |
| --- | --- |
| setReflectionColor(value) | Gets or sets the reflection color. The reflection. | 

 **Result:**



---


### getReflectionFactor{#getReflectionFactor}

| Name | Description |
| --- | --- |
| getReflectionFactor() | Gets or sets the attenuation of the reflection color. The reflection factor. | 

 **Result:**



---


### setReflectionFactor{#setReflectionFactor}

| Name | Description |
| --- | --- |
| setReflectionFactor(value) | Gets or sets the attenuation of the reflection color. The reflection factor. | 

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


### getAmbientColor{#getAmbientColor}

| Name | Description |
| --- | --- |
| getAmbientColor() | Gets or sets the ambient color The Example: var mat = new LambertMaterial(); mat.AmbientColor = new Vector3(1, 1, 1); ambient. | 

 **Result:**



---


### setAmbientColor{#setAmbientColor}

| Name | Description |
| --- | --- |
| setAmbientColor(value) | Gets or sets the ambient color The Example: var mat = new LambertMaterial(); mat.AmbientColor = new Vector3(1, 1, 1); ambient. | 

 **Result:**



---


### getDiffuseColor{#getDiffuseColor}

| Name | Description |
| --- | --- |
| getDiffuseColor() | Gets or sets the diffuse color The Example: var mat = new LambertMaterial(); mat.DiffuseColor = new Vector3(1, 0, 0); diffuse. | 

 **Result:**



---


### setDiffuseColor{#setDiffuseColor}

| Name | Description |
| --- | --- |
| setDiffuseColor(value) | Gets or sets the diffuse color The Example: var mat = new LambertMaterial(); mat.DiffuseColor = new Vector3(1, 0, 0); diffuse. | 

 **Result:**



---


### getTransparentColor{#getTransparentColor}

| Name | Description |
| --- | --- |
| getTransparentColor() | Gets or sets the transparent color. The Example: var mat = new LambertMaterial(); mat.TransparentColor = new Vector3(0.3, 0.5, 0.2); color of the transparent. | 

 **Result:**



---


### setTransparentColor{#setTransparentColor}

| Name | Description |
| --- | --- |
| setTransparentColor(value) | Gets or sets the transparent color. The Example: var mat = new LambertMaterial(); mat.TransparentColor = new Vector3(0.3, 0.5, 0.2); color of the transparent. | 

 **Result:**



---


### getTransparency{#getTransparency}

| Name | Description |
| --- | --- |
| getTransparency() | Gets or sets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped. The Example: var mat = new LambertMaterial(); mat.Transparency = 0.3; transparency factor. | 

 **Result:**



---


### setTransparency{#setTransparency}

| Name | Description |
| --- | --- |
| setTransparency(value) | Gets or sets the transparency factor. The factor should be ranged between 0(0%, fully opaque) and 1(100%, fully transparent) Any invalid factor value will be clamped. The Example: var mat = new LambertMaterial(); mat.Transparency = 0.3; transparency factor. | 

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




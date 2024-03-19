---
title: TextureBase 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/texturebase/
---
## TextureBase class

  Base class for all concrete textures.  Texture defines the look and feel of a geometry surface.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor(name) | Initializes a new instance of the TextureBase class. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| name | String | Name. |

 **Result:**



---


### getAlpha{#getAlpha}

| Name | Description |
| --- | --- |
| getAlpha() | Gets or sets the default alpha value of the texture This is valid when the AlphaSource is AlphaSource.PIXEL_ALPHA Default value is 1.0, valid value range is between 0 and 1 | 

 **Result:**



---


### setAlpha{#setAlpha}

| Name | Description |
| --- | --- |
| setAlpha(value) | Gets or sets the default alpha value of the texture This is valid when the AlphaSource is AlphaSource.PIXEL_ALPHA Default value is 1.0, valid value range is between 0 and 1 | 

 **Result:**



---


### getAlphaSource{#getAlphaSource}

| Name | Description |
| --- | --- |
| getAlphaSource() | Gets or sets whether the texture defines the alpha channel. Default value is AlphaSource.NONEThe value of the property is AlphaSource integer constant. | 

 **Result:**



---


### setAlphaSource{#setAlphaSource}

| Name | Description |
| --- | --- |
| setAlphaSource(value) | Gets or sets whether the texture defines the alpha channel. Default value is AlphaSource.NONEThe value of the property is AlphaSource integer constant. | 

 **Result:**



---


### getWrapModeU{#getWrapModeU}

| Name | Description |
| --- | --- |
| getWrapModeU() | Gets or sets the texture wrap modes in U. The value of the property is WrapMode integer constant. | 

 **Result:**



---


### setWrapModeU{#setWrapModeU}

| Name | Description |
| --- | --- |
| setWrapModeU(value) | Gets or sets the texture wrap modes in U. The value of the property is WrapMode integer constant. | 

 **Result:**



---


### getWrapModeV{#getWrapModeV}

| Name | Description |
| --- | --- |
| getWrapModeV() | Gets or sets the texture wrap modes in V. The value of the property is WrapMode integer constant. | 

 **Result:**



---


### setWrapModeV{#setWrapModeV}

| Name | Description |
| --- | --- |
| setWrapModeV(value) | Gets or sets the texture wrap modes in V. The value of the property is WrapMode integer constant. | 

 **Result:**



---


### getWrapModeW{#getWrapModeW}

| Name | Description |
| --- | --- |
| getWrapModeW() | Gets or sets the texture wrap modes in W. The value of the property is WrapMode integer constant. | 

 **Result:**



---


### setWrapModeW{#setWrapModeW}

| Name | Description |
| --- | --- |
| setWrapModeW(value) | Gets or sets the texture wrap modes in W. The value of the property is WrapMode integer constant. | 

 **Result:**



---


### getMinFilter{#getMinFilter}

| Name | Description |
| --- | --- |
| getMinFilter() | Gets or sets the filter for minification. The value of the property is TextureFilter integer constant. | 

 **Result:**



---


### setMinFilter{#setMinFilter}

| Name | Description |
| --- | --- |
| setMinFilter(value) | Gets or sets the filter for minification. The value of the property is TextureFilter integer constant. | 

 **Result:**



---


### getMagFilter{#getMagFilter}

| Name | Description |
| --- | --- |
| getMagFilter() | Gets or sets the filter for magnification. The value of the property is TextureFilter integer constant. | 

 **Result:**



---


### setMagFilter{#setMagFilter}

| Name | Description |
| --- | --- |
| setMagFilter(value) | Gets or sets the filter for magnification. The value of the property is TextureFilter integer constant. | 

 **Result:**



---


### getMipFilter{#getMipFilter}

| Name | Description |
| --- | --- |
| getMipFilter() | Gets or sets the filter for mip-level sampling. The value of the property is TextureFilter integer constant. | 

 **Result:**



---


### setMipFilter{#setMipFilter}

| Name | Description |
| --- | --- |
| setMipFilter(value) | Gets or sets the filter for mip-level sampling. The value of the property is TextureFilter integer constant. | 

 **Result:**



---


### getUVRotation{#getUVRotation}

| Name | Description |
| --- | --- |
| getUVRotation() | Gets or sets the rotation of the texture | 

 **Result:**



---


### setUVRotation{#setUVRotation}

| Name | Description |
| --- | --- |
| setUVRotation(value) | Gets or sets the rotation of the texture | 

 **Result:**



---


### getUVScale{#getUVScale}

| Name | Description |
| --- | --- |
| getUVScale() | Gets or sets the UV scale. The UV scale. | 

 **Result:**



---


### setUVScale{#setUVScale}

| Name | Description |
| --- | --- |
| setUVScale(value) | Gets or sets the UV scale. The UV scale. | 

 **Result:**



---


### getUVTranslation{#getUVTranslation}

| Name | Description |
| --- | --- |
| getUVTranslation() | Gets or sets the UV translation. The UV translation. | 

 **Result:**



---


### setUVTranslation{#setUVTranslation}

| Name | Description |
| --- | --- |
| setUVTranslation(value) | Gets or sets the UV translation. The UV translation. | 

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


### setTranslation{#setTranslation}

| Name | Description |
| --- | --- |
| setTranslation(u, v) | Sets the UV translation. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| u | Number | U. |
| v | Number | V. |

 **Result:**



---


### setScale{#setScale}

| Name | Description |
| --- | --- |
| setScale(u, v) | Sets the UV scale. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| u | Number | U. |
| v | Number | V. |

 **Result:**



---


### setRotation{#setRotation}

| Name | Description |
| --- | --- |
| setRotation(u, v) | Sets the UV rotation. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| u | Number | U. |
| v | Number | V. |

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




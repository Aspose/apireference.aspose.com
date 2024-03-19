---
title: ImageRenderOptions 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/imagerenderoptions/
---
## ImageRenderOptions class

  Options for Scene.render(com.aspose.threed.Camera, java.lang.String, com.aspose.threed.Vector2, java.lang.String, com.aspose.threed.ImageRenderOptions) and  Scene.render(com.aspose.threed.Camera, com.aspose.threed.TextureData, com.aspose.threed.ImageRenderOptions)


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() | Initialize an instance of ImageRenderOptions | 

 **Result:**



---


### getBackgroundColor{#getBackgroundColor}

| Name | Description |
| --- | --- |
| getBackgroundColor() | The background color of the render result. | 

 **Result:**



---


### setBackgroundColor{#setBackgroundColor}

| Name | Description |
| --- | --- |
| setBackgroundColor(value) | The background color of the render result. | 

 **Result:**



---


### getAssetDirectories{#getAssetDirectories}

| Name | Description |
| --- | --- |
| getAssetDirectories() | Directories that stored external assets(like textures) | 

 **Result:**



---


### getEnableShadows{#getEnableShadows}

| Name | Description |
| --- | --- |
| getEnableShadows() | Gets or sets whether to render shadows. | 

 **Result:**



---


### setEnableShadows{#setEnableShadows}

| Name | Description |
| --- | --- |
| setEnableShadows(value) | Gets or sets whether to render shadows. | 

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




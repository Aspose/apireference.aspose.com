---
title: FontFile 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/fontfile/
---
## FontFile class

  Font file contains definitions for glyphs, this is used to create text profile.  @hideconstructor


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


### fromFile{#fromFile}

| Name | Description |
| --- | --- |
| fromFile(fileName) | Load FontFile from file name | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| fileName | String | Path to the font file |

 **Result:**
FontFile


---


### parse{#parse}

| Name | Description |
| --- | --- |
| parse(bytes) | Parse FontFile from bytes | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| bytes | byte[] | OTF font file raw content |

 **Result:**
FontFile


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




---
title: RelativeRectangle 
second_title: Aspose.3D for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.threed/relativerectangle/
---
## RelativeRectangle class

  Relative rectangle  The formula between relative component to absolute value is:  Scale  (Reference Width) + offset  So if we want it to represent an absolute value, leave all scale fields zero, and use offset fields instead.


## Methods

### constructor{#constructor}

| Name | Description |
| --- | --- |
| constructor() |  | 

 **Result:**



---


### constructor_overload{#constructor_overload}

| Name | Description |
| --- | --- |
| constructor_overload(left, top, width, height) | Construct a RelativeRectangle | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  lef | Number | null |
|  to | Number | null |
|  widt | Number | null |
|  heigh | Number | null |

 **Result:**



---


### getScaleX{#getScaleX}

| Name | Description |
| --- | --- |
| getScaleX() | Relative coordinate X | 

 **Result:**



---


### setScaleX{#setScaleX}

| Name | Description |
| --- | --- |
| setScaleX(value) | Relative coordinate X | 

 **Result:**



---


### getScaleY{#getScaleY}

| Name | Description |
| --- | --- |
| getScaleY() | Relative coordinate Y | 

 **Result:**



---


### setScaleY{#setScaleY}

| Name | Description |
| --- | --- |
| setScaleY(value) | Relative coordinate Y | 

 **Result:**



---


### getScaleWidth{#getScaleWidth}

| Name | Description |
| --- | --- |
| getScaleWidth() | Relative width | 

 **Result:**



---


### setScaleWidth{#setScaleWidth}

| Name | Description |
| --- | --- |
| setScaleWidth(value) | Relative width | 

 **Result:**



---


### getScaleHeight{#getScaleHeight}

| Name | Description |
| --- | --- |
| getScaleHeight() | Relative height | 

 **Result:**



---


### setScaleHeight{#setScaleHeight}

| Name | Description |
| --- | --- |
| setScaleHeight(value) | Relative height | 

 **Result:**



---


### getOffsetX{#getOffsetX}

| Name | Description |
| --- | --- |
| getOffsetX() | Gets or sets the offset for coordinate X | 

 **Result:**



---


### setOffsetX{#setOffsetX}

| Name | Description |
| --- | --- |
| setOffsetX(value) | Gets or sets the offset for coordinate X | 

 **Result:**



---


### getOffsetY{#getOffsetY}

| Name | Description |
| --- | --- |
| getOffsetY() | Gets or sets the offset for coordinate Y | 

 **Result:**



---


### setOffsetY{#setOffsetY}

| Name | Description |
| --- | --- |
| setOffsetY(value) | Gets or sets the offset for coordinate Y | 

 **Result:**



---


### getOffsetWidth{#getOffsetWidth}

| Name | Description |
| --- | --- |
| getOffsetWidth() | Gets or sets the offset for width | 

 **Result:**



---


### setOffsetWidth{#setOffsetWidth}

| Name | Description |
| --- | --- |
| setOffsetWidth(value) | Gets or sets the offset for width | 

 **Result:**



---


### getOffsetHeight{#getOffsetHeight}

| Name | Description |
| --- | --- |
| getOffsetHeight() | Gets or sets the offset for height | 

 **Result:**



---


### setOffsetHeight{#setOffsetHeight}

| Name | Description |
| --- | --- |
| setOffsetHeight(value) | Gets or sets the offset for height | 

 **Result:**



---


### toAbsolute{#toAbsolute}

| Name | Description |
| --- | --- |
| toAbsolute(left, top, width, height) | Convert the relative rectangle to absolute rectangle | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
| left | Number | Left of the rectangle |
| top | Number | Top of the rectangle |
| width | Number | Width of the rectangle |
| height | Number | Height of the rectangle |

 **Result:**
Rect


---


### fromScale{#fromScale}

| Name | Description |
| --- | --- |
| fromScale(scaleX, scaleY, scaleWidth, scaleHeight) | Construct a RelativeRectangle with all offset fields zero and scale fields from given parameters. | 

 **Parameters:**

| Name | Type | Description |
| --- | --- | --- |
|  scale | Number | null |
|  scale | Number | null |
|  scaleWidt | Number | null |
|  scaleHeigh | Number | null |

 **Result:**
RelativeRectangle


---


### toString{#toString}

| Name | Description |
| --- | --- |
| toString() | Converts the value of this instance to a java.lang.String. | 

 **Result:**
RelativeRectangle


---




---
title: setSize
second_title: Aspose.Sildes for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.slides/slidesize/setsize/
---

## setSize(int type, int scaleType)  function

  Sets the type of slide size and scales content using scale type.
  
  

### Parameters

| Name | Type | Description |
| --- | --- | --- |
| type | int | Slide size type. |
| scaleType | int | Scale type of slide content. Assigning any value except SlideSizeType#Custom will change ( #getSize) accordingly, but will keep ( #getOrientation/ #setOrientation(int)) intact. |


---


## setSize(float width, float height, int scaleType)  function

 Sets the size in points and scales content using scale type.
 

### Parameters

| Name | Type | Description |
| --- | --- | --- |
| width | float | Width. |
| height | float | Height. |
| scaleType | int | Scale type of slide content. Assigning any value will reset ( #getType) property to SlideSizeType#Custom and set ( #getOrientation/ #setOrientation(int)). |


---



---
title: insertClone
second_title: Aspose.Sildes for PHP via Java API Reference
description: 
type: docs

url: /php-java/aspose.slides/slidecollection/insertclone/
---

## insertClone(int index, [Slide](../../slide) sourceSlide)  method

 Inserts a copy of a specified slide to specified position of the collection.
 

### Parameters

| Name | Type | Description |
| --- | --- | --- |
| index | int | Index of new slide. |
| sourceSlide | [Slide](../../slide) | Slide to clone. When cloning a slide between different presentations slide's master can be cloned too. Internal registry is used to track automatically cloned masters to prevent creation of multiple clones of the same master slide. Manual cloning of master slides will be neither prevented nor registered. If you need more control over cloning process use #insertClone(int,ISlide,ILayoutSlide) or #insertClone(int,ISlide,IMasterSlide,boolean) for cloning slides and IMasterSlideCollection#addClone(IMasterSlide) for cloning masters. |

### Returns
[Slide](../../slide)


---


## insertClone(int index, [Slide](../../slide) sourceSlide, [LayoutSlide](../../layoutslide) destLayout)  method

 Inserts a copy of a specified slide to specified position of the collection.
 

### Parameters

| Name | Type | Description |
| --- | --- | --- |
| index | int | Index of new slide. |
| sourceSlide | [Slide](../slide) | Slide to clone. |
| destLayout | [LayoutSlide](../../layoutslide) | Layout slide for a new slide. |

### Returns
[Slide](../../slide)


---


## insertClone(int index, [Slide](../../slide) sourceSlide, [MasterSlide](../../masterslide) destMaster, boolean allowCloneMissingLayout)  method

 Inserts a copy of a specified source slide to specified position of the collection.
 Appropriate layout will be selected automatically from the specified 
 master (appropriate layout is the layout with the same Type or Name as 
 of layout of the source slide). If there is no appropriate layout then
 layout of the source slide will be cloned (if allowCloneMissingLayout 
 is true) or PptxEditException will be thrown (if allowCloneMissingLayout
 is false).
 

### Parameters

| Name | Type | Description |
| --- | --- | --- |
| index | int | Index of new slide. |
| sourceSlide | [Slide](../slide) | Slide to clone. |
| destMaster | [MasterSlide](../masterslide) | Master slide for a new slide. |
| allowCloneMissingLayout | boolean | If there is no appropriate layout in specified master then layout of the source slide will be cloned (if allowCloneMissingLayout is true) or PptxEditException will be thrown (if allowCloneMissingLayout is false). |

### Returns
[Slide](../../slide)

### Exception

| Exception | Condition |
| --- | --- |
 | PptxEditException | Thrown if there is no appropriate layout in specified master and allowCloneMissingLayout is false. |


---



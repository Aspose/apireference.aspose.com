---
title: add
second_title: Aspose.Sildes for Node.js via Java API Reference
description: 
type: docs

url: /nodejs-java/aspose.slides/globallayoutslidecollection/add/
---

## add([MasterSlide](../../masterslide) master, byte layoutType, String layoutName)  function

 Adds a new layout slide to the presentation.
 

### Parameters

| Name | Type | Description |
| --- | --- | --- |
| master | [MasterSlide](../masterslide) | Master slide for a new layout. |
| layoutType | byte | Layout type for a new layout. Supported layout types: Title, TitleOnly, Blank, TitleAndObject, VerticalText, VerticalTitleAndText, TwoObjects, SectionHeader, TwoTextAndTwoObjects, TitleObjectAndCaption, PictureAndCaption, Custom. Other layout types are not supported now: Text, TwoColumnText, Table, TextAndChart, ChartAndText, Diagram, Chart, TextAndClipArt, ClipArtAndText, TextAndObject, ObjectAndText, Object, TextAndMedia, MediaAndText, ObjectOverText, TextOverObject, TextAndTwoObjects, TwoObjectsAndText, TwoObjectsOverText, FourObjects, ClipArtAndVerticalText, VerticalTitleAndTextOverChart, ObjectAndTwoObject, TwoObjectsAndObject. |
| layoutName | String | Name for a new layout. If passed name is already in use the ArgumentException will be thrown. If null parameter is passed then name genarated atomatically in regards to passed layout type (for example "Title Slide" or "1_Title Slide", "2_..", etc.). 1) Added layout for value SlideLayoutType.Custom of layoutType contains no placeholders and no shapes. 2) Analogue of this function is function IMasterLayoutSlideCollection#add(byte,String) accessed with ( IMasterSlide#getLayoutSlides) property. |

### Result
[LayoutSlide](../../layoutslide)

### Error

| Error | Condition |
| --- | --- |
 | com.aspose.ms.System.ArgumentException | Thrown if layout name value layoutName is already in use in collection of the layouts of master. |


---



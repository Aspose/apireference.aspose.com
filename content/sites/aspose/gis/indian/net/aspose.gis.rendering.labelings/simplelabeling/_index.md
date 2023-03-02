---
title: Class SimpleLabeling
second_title: .NET API संदर्भ के लिए Aspose.GIS
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling कक्ष. एक सधरण लेबलंग हर सुवध पर लेबल लग देत है
type: docs
weight: 1700
url: /hi/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

एक साधारण लेबलिंग हर सुविधा पर लेबल लगा देता है।

```csharp
public class SimpleLabeling : Labeling
```

## कंस्ट्रक्टर्स

| नाम | विवरण |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | का एक नया उदाहरण प्रारंभ करता है`SimpleLabeling` वर्ग. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | का एक नया उदाहरण प्रारंभ करता है`SimpleLabeling` वर्ग. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | का एक नया उदाहरण प्रारंभ करता है`SimpleLabeling` वर्ग. |

## गुण

| नाम | विवरण |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | एक कॉलबैक जिसका उपयोग फीचर को संभालने से पहले इस लेबलिंग को कॉन्फ़िगर करने के लिए किया जाता है। |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | पाठ का रंग निर्धारित करता है। |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | टेक्स्ट प्रस्तुत करने के लिए उपयोग करने के लिए फ़ॉन्ट परिवार। डिफ़ॉल्ट सिस्टम निर्भर मूल्य है। |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | पाठ का आकार। |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | शैली पाठ पर लागू करने के लिए। |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | लेबलिंग के लिए संशोधित एक के साथ सुविधा ज्यामिति को प्रतिस्थापित करने का एक तरीका प्रदान करता है। यह कॉलबैक पहले के बाद लागू होता है[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . डिफ़ॉल्ट है`null` (फ़ीचर ज्योमेट्री का उपयोग यथा-है) करें. |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | पाठ के चारों ओर प्रभामंडल (स्ट्रोक) का रंग। |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | पाठ के चारों ओर प्रभामंडल (स्ट्रोक) का आकार। |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | लेबल के स्रोत के रूप में उपयोग करने के लिए विशेषता नाम। अगर नजरअंदाज कर दिया[`LabelExpression`](./labelexpression/) सेट है। कोई भी[`LabelAttribute`](./labelattribute/) या[`LabelExpression`](./labelexpression/) रेंडरिंग से पहले सेट होना चाहिए; InvalidOperationException अन्यथा फेंक दिया जाता है। |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | लेबल टेक्स्ट को अनुकूलित और प्रारूपित करने का एक तरीका प्रदान करता है। यदि सेट है, ओवरराइड करता है[`LabelAttribute`](./labelattribute/) . कोई भी[`LabelAttribute`](./labelattribute/) या[`LabelExpression`](./labelexpression/) रेंडरिंग से पहले सेट होना चाहिए; InvalidOperationException अन्यथा फेंक दिया जाता है। |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | मल्टीपार्ट ज्यामिति के लिए रेंडरिंग व्यवहार निर्दिष्ट करता है। डिफ़ॉल्ट हैAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | लेबल प्लेसमेंट निर्दिष्ट करता है कि फीचर की ज्यामिति के सापेक्ष लेबल कैसे रखे जाते हैं। |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | इस लेबल की प्राथमिकता को इंगित करता है यदि यह किसी अन्य लेबल के साथ ओवरलैप होता है। निम्न प्राथमिकता वाला लेबल रेंडर नहीं किया गया है. डिफ़ॉल्ट 1000 है. |

## तरीकों

| नाम | विवरण |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | इस उदाहरण को क्लोन करता है। |

### यह सभी देखें

* class [Labeling](../labeling/)
* नाम स्थान [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* सभा [Aspose.GIS](../../)



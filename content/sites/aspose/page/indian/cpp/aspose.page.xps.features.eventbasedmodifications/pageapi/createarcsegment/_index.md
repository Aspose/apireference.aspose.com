---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment method"
linktitle: "CreateArcSegment"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment मेथड. C++ में एक नया दीर्घवृत्तीय आर्क सेगमेंट बनाता है।"
type: docs
weight: 600
url: /hi/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createarcsegment/
---
## PageAPI::CreateArcSegment method


एक नया दीर्घवृत्तीय चाप खंड बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsArcSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateArcSegment(System::Drawing::PointF point, System::Drawing::SizeF size, float rotationAngle, bool isLargeArc, XpsModel::XpsSweepDirection sweepDirection, bool isStroked=true)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| बिंदु | System::Drawing::PointF | दीर्घवृत्तीय आर्क का अंत बिंदु। |
| size | System::Drawing::SizeF | दीर्घवृत्तीय आर्क का x और y त्रिज्या एक x,y जोड़े के रूप में। |
| rotationAngle | फ़्लोट | बताता है कि वर्तमान निर्देशांक प्रणाली के सापेक्ष दीर्घवृत्त कैसे घुमाया गया है। |
| isLargeArc | bool | निर्धारित करता है कि आर्क 180 या उससे अधिक के स्वेप के साथ खींचा गया है या नहीं। |
| sweepDirection | XpsModel::XpsSweepDirection | आर्क जिस दिशा में खींचा जाता है वह दिशा। |
| isStroked | bool | निर्दिष्ट करता है कि इस पथ के इस खंड के लिए स्ट्रोक खींचा गया है या नहीं। |

### ReturnValue

नया दीर्घवृत्तीय आर्क सेगमेंट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)

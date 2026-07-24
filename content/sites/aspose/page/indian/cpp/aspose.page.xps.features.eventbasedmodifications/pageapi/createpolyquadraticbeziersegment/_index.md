---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment मेथड"
linktitle: "CreatePolyQuadraticBezierSegment"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment मेथड। पाथ फ़िगर में पिछले बिंदु से वर्टिसेज़ के सेट के माध्यम से द्विघात बीज़ियर कर्व्स का नया सेट बनाता है, निर्दिष्ट नियंत्रण बिंदुओं का उपयोग करके C++ में।"
type: docs
weight: 1900
url: /hi/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolyquadraticbeziersegment/
---
## PageAPI::CreatePolyQuadraticBezierSegment method


पाथ फ़िगर में पिछले बिंदु से वर्टिसेज़ के सेट के माध्यम से, निर्दिष्ट कंट्रोल पॉइंट्स का उपयोग करके, क्वाड्रेटिक बीज़ियर कर्व्स का एक नया सेट बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsPolyQuadraticBezierSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyQuadraticBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | System::ArrayPtr\\<System::Drawing::PointF\\> | एकाधिक द्विघात बीज़ियर खंडों के लिए नियंत्रण बिंदु। |
| isStroked | bool | निर्दिष्ट करता है कि इस पथ के इस खंड के लिए स्ट्रोक खींचा गया है या नहीं। |

### ReturnValue

नया द्विघात बीज़ियर वक्र खंड।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyQuadraticBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolyquadraticbeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)

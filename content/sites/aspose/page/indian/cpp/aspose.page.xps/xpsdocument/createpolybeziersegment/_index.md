---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment मेथड"
linktitle: "CreatePolyBezierSegment"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment मेथड। C++ में क्यूबिक बीज़ियर कर्व्स का नया सेट बनाता है।"
type: docs
weight: 2400
url: /hi/cpp/aspose.page.xps/xpsdocument/createpolybeziersegment/
---
## XpsDocument::CreatePolyBezierSegment method


क्यूबिक बीज़ियर कर्व्स का एक नया सेट बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsPolyBezierSegment> Aspose::Page::XPS::XpsDocument::CreatePolyBezierSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | System::ArrayPtr\\<System::Drawing::PointF\\> | बहु बेज़ियर सेगमेंट्स के लिए नियंत्रण बिंदु। |
| isStroked | bool | निर्दिष्ट करता है कि इस पथ के इस खंड के लिए स्ट्रोक खींचा गया है या नहीं। |

### ReturnValue

नया क्यूबिक बेज़ियर कर्व्स सेगमेंट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyBezierSegment](../../../aspose.page.xps.xpsmodel/xpspolybeziersegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)

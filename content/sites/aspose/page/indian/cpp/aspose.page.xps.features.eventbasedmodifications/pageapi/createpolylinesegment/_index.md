---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment method. C++ में एक नया बहुभुज चित्र बनाता है जिसमें व्यक्तिगत वर्टिसेज की मनमानी संख्या होती है।"
type: docs
weight: 1800
url: /hi/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createpolylinesegment/
---
## PageAPI::CreatePolyLineSegment method


व्यक्तिगत वर्टिसेज़ की मनमानी संख्या वाले एक नया पॉलीगॉनल ड्राइंग बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| points | System::ArrayPtr\\<System::Drawing::PointF\\> | बहु-सेगमेंट्स जो पॉली लाइन सेगमेंट को परिभाषित करते हैं, उनके लिए निर्देशांक का एक सेट। |
| isStroked | bool | निर्दिष्ट करता है कि इस पथ के इस खंड के लिए स्ट्रोक खींचा गया है या नहीं। |

### ReturnValue

नया बहुभुज ड्राइंग सेगमेंट।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPolyLineSegment](../../../aspose.page.xps.xpsmodel/xpspolylinesegment/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment method"
linktitle: "CreatePolyLineSegment"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment method. C++ में एक नया बहुभुजीय ड्राइंग बनाता है जिसमें मनमाने संख्या में व्यक्तिगत वर्टिसेज़ होते हैं।"
type: docs
weight: 2500
url: /hi/cpp/aspose.page.xps/xpsdocument/createpolylinesegment/
---
## XpsDocument::CreatePolyLineSegment method


व्यक्तिगत वर्टिसेज़ की मनमानी संख्या वाले एक नया पॉलीगॉनल ड्राइंग बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsPolyLineSegment> Aspose::Page::XPS::XpsDocument::CreatePolyLineSegment(System::ArrayPtr<System::Drawing::PointF> points, bool isStroked=true)
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
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)

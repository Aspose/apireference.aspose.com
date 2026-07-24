---
title: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush method"
linktitle: "CreateRadialGradientBrush"
second_title: "Aspose.Page C++ के लिए"
description: "Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush method. C++ में एक नया रेडियल ग्रेडिएंट ब्रश बनाता है।"
type: docs
weight: 2700
url: /hi/cpp/aspose.page.xps/xpsdocument/createradialgradientbrush/
---
## XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF, System::Drawing::PointF, float, float) method


एक नया रेडियल ग्रेडिएंट ब्रश बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| center | System::Drawing::PointF | रेडियल ग्रेडिएंट का केंद्र बिंदु (अर्थात, दीर्घवृत्त का केंद्र)। |
| gradientOrigin | System::Drawing::PointF | रेडियल ग्रेडिएंट का मूल बिंदु। |
| radiusX | फ़्लोट | दीर्घवृत्त के x आयाम में वह त्रिज्या जो रेडियल ग्रेडिएंट को परिभाषित करती है। |
| radiusY | फ़्लोट | रेडियल ग्रेडिएंट को परिभाषित करने वाले दीर्घवृत्त में y आयाम में त्रिज्या। |

### ReturnValue

नया रेडियल ग्रेडिएंट ब्रश।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateRadialGradientBrush(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\>, System::Drawing::PointF, System::Drawing::PointF, float, float) method


एक नया रेडियल ग्रेडिएंट ब्रश बनाता है।

```cpp
System::SharedPtr<XpsModel::XpsRadialGradientBrush> Aspose::Page::XPS::XpsDocument::CreateRadialGradientBrush(System::SharedPtr<System::Collections::Generic::List<System::SharedPtr<XpsModel::XpsGradientStop>>> gradientStops, System::Drawing::PointF center, System::Drawing::PointF gradientOrigin, float radiusX, float radiusY)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| gradientStops | System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<XpsModel::XpsGradientStop\>\>\> | ग्रेडिएंट स्टॉप्स की सूची। |
| center | System::Drawing::PointF | रेडियल ग्रेडिएंट का केंद्र बिंदु (अर्थात, दीर्घवृत्त का केंद्र)। |
| gradientOrigin | System::Drawing::PointF | रेडियल ग्रेडिएंट का मूल बिंदु। |
| radiusX | फ़्लोट | दीर्घवृत्त के x आयाम में वह त्रिज्या जो रेडियल ग्रेडिएंट को परिभाषित करती है। |
| radiusY | फ़्लोट | रेडियल ग्रेडिएंट को परिभाषित करने वाले दीर्घवृत्त में y आयाम में त्रिज्या। |

### ReturnValue

नया रेडियल ग्रेडिएंट ब्रश।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsRadialGradientBrush](../../../aspose.page.xps.xpsmodel/xpsradialgradientbrush/)
* Class [List](../../../system.collections.generic/list/)
* Class [XpsGradientStop](../../../aspose.page.xps.xpsmodel/xpsgradientstop/)
* Class [PointF](../../../system.drawing/pointf/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)

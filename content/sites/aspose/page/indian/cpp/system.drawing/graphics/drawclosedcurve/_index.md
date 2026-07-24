---
title: "System::Drawing::Graphics::DrawClosedCurve method"
linktitle: "DrawClosedCurve"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Graphics::DrawClosedCurve मेथड। C++ में निर्दिष्ट पेन का उपयोग करके एक बंद स्प्लाइन बनाता है।"
type: docs
weight: 1300
url: /hi/cpp/system.drawing/graphics/drawclosedcurve/
---
## Graphics::DrawClosedCurve(const SharedPtr\<Pen\>\&, const ArrayPtr\<Point\>\&, float, Drawing2D::FillMode) method


निर्दिष्ट पेन का उपयोग करके बंद स्प्लाइन को ड्रॉ करता है।

```cpp
void System::Drawing::Graphics::DrawClosedCurve(const SharedPtr<Pen> &pen, const ArrayPtr<Point> &points, float tension=0.5f, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पेन | const SharedPtr\<Pen\>\& | स्प्लाइन बनाते समय उपयोग करने के लिए एक पेन |
| points | const ArrayPtr\<Point\>\& | [Array](../../../system/array/) बिंदुओं की जो स्प्लाइन को निर्धारित करती है |
| तनाव | फ़्लोट | स्प्लाइन के तनाव को निर्दिष्ट करने वाला मान |
| fillmode | Drawing2D::FillMode | IGNORED |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../pen/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Point](../../point/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::DrawClosedCurve(const SharedPtr\<Pen\>\&, const ArrayPtr\<PointF\>\&, float, Drawing2D::FillMode) method


निर्दिष्ट पेन का उपयोग करके बंद स्प्लाइन को ड्रॉ करता है।

```cpp
void System::Drawing::Graphics::DrawClosedCurve(const SharedPtr<Pen> &pen, const ArrayPtr<PointF> &points, float tension=0.5f, Drawing2D::FillMode fillmode=Drawing2D::FillMode::Alternate)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पेन | const SharedPtr\<Pen\>\& | स्प्लाइन बनाते समय उपयोग करने के लिए एक पेन |
| points | const ArrayPtr\<PointF\>\& | [Array](../../../system/array/) बिंदुओं की जो स्प्लाइन को निर्धारित करती है |
| तनाव | फ़्लोट | स्प्लाइन के तनाव को निर्दिष्ट करने वाला मान |
| fillmode | Drawing2D::FillMode | IGNORED |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Pen](../../pen/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PointF](../../pointf/)
* Enum [FillMode](../../../system.drawing.drawing2d/fillmode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)

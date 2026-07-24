---
title: "System::Drawing::Graphics::SetClip विधि"
linktitle: "SetClip"
second_title: "Aspose.Page C++ के लिए"
description: "System::Drawing::Graphics::SetClip विधि. वर्तमान Graphics ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्रॉइंग सतह के क्लिपिंग क्षेत्र को उस निर्दिष्ट ऑपरेशन के परिणाम में सेट करता है जो वर्तमान क्लिप क्षेत्र और ग्राफ़िक्स पाथ द्वारा निर्दिष्ट क्षेत्र को C++ में संयोजित करता है।"
type: docs
weight: 8600
url: /hi/cpp/system.drawing/graphics/setclip/
---
## Graphics::SetClip(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) method


वर्तमान [Graphics](../) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्रॉइंग सतह के क्लिपिंग क्षेत्र को उस निर्दिष्ट ऑपरेशन के परिणाम में सेट करता है जो वर्तमान क्लिप क्षेत्र और ग्राफ़िक्स पाथ द्वारा निर्दिष्ट क्षेत्र को संयोजित करता है।

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Drawing2D::GraphicsPath> &path, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| पथ | const SharedPtr\<Drawing2D::GraphicsPath\>\& | संयोजन के लिए एक क्षेत्र निर्दिष्ट करता है |
| combineMode | Drawing2D::CombineMode | संयोजन ऑपरेशन को निर्दिष्ट करता है |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) method


लागू नहीं किया गया।

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Graphics> &graphics, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Graphics](../)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) method


वर्तमान [Graphics](../) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्रॉइंग सतह के क्लिपिंग क्षेत्र को उस निर्दिष्ट ऑपरेशन के परिणाम में सेट करता है जो वर्तमान क्लिप क्षेत्र और निर्दिष्ट क्षेत्र को संयोजित करता है।

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Region> &region, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| क्षेत्र | const SharedPtr\<Region\>\& | संयोजन के लिए एक क्षेत्र निर्दिष्ट करता है |
| combineMode | Drawing2D::CombineMode | संयोजन ऑपरेशन को निर्दिष्ट करता है |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(Rectangle, Drawing2D::CombineMode) method


वर्तमान [Graphics](../) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्रॉइंग सतह के क्लिपिंग क्षेत्र को उस निर्दिष्ट ऑपरेशन के परिणाम में सेट करता है जो वर्तमान क्लिप क्षेत्र और निर्दिष्ट क्षेत्र को संयोजित करता है।

```cpp
void System::Drawing::Graphics::SetClip(Rectangle rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | Rectangle | संयोजन के लिए एक क्षेत्र निर्दिष्ट करता है |
| combineMode | Drawing2D::CombineMode | संयोजन ऑपरेशन को निर्दिष्ट करता है |

## संबंधित देखें

* Class [Rectangle](../../rectangle/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
## Graphics::SetClip(RectangleF, Drawing2D::CombineMode) method


वर्तमान [Graphics](../) ऑब्जेक्ट द्वारा प्रतिनिधित्व किए गए ड्रॉइंग सतह के क्लिपिंग क्षेत्र को उस निर्दिष्ट ऑपरेशन के परिणाम में सेट करता है जो वर्तमान क्लिप क्षेत्र और निर्दिष्ट क्षेत्र को संयोजित करता है।

```cpp
void System::Drawing::Graphics::SetClip(RectangleF rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| rect | RectangleF | संयोजन के लिए एक क्षेत्र निर्दिष्ट करता है |
| combineMode | Drawing2D::CombineMode | संयोजन ऑपरेशन को निर्दिष्ट करता है |

## संबंधित देखें

* Class [RectangleF](../../rectanglef/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)

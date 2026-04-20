---
title: "طريقة System::Drawing::Graphics::SetClip"
linktitle: "SetClip"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Drawing::Graphics::SetClip. تُعيّن منطقة القص لسطح الرسم الممثَّل بواسطة كائن Graphics الحالي إلى نتيجة العملية المحددة التي تجمع بين منطقة القص الحالية والمنطقة المحددة بواسطة مسار رسومي في C++."
type: docs
weight: 8600
url: /ar/cpp/system.drawing/graphics/setclip/
---
## Graphics::SetClip(const SharedPtr\<Drawing2D::GraphicsPath\>\&, Drawing2D::CombineMode) method


تُعيّن منطقة القص لسطح الرسم الممثَّل بواسطة كائن [Graphics](../) الحالي إلى نتيجة العملية المحددة التي تجمع بين منطقة القص الحالية والمنطقة المحددة بواسطة مسار رسومي.

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Drawing2D::GraphicsPath> &path, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const SharedPtr\<Drawing2D::GraphicsPath\>\& | يحدِّد منطقة للجمع |
| combineMode | Drawing2D::CombineMode | يحدد عملية الجمع |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Graphics\>\&, Drawing2D::CombineMode) method


غير مُنفّذ.

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Graphics> &graphics, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Graphics](../)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(const SharedPtr\<Region\>\&, Drawing2D::CombineMode) method


يضبط منطقة القص لسطح الرسم الممثلة بواسطة كائن [Graphics](../) الحالي إلى نتيجة العملية المحددة التي تجمع بين منطقة القص الحالية والمنطقة المحددة.

```cpp
void System::Drawing::Graphics::SetClip(const SharedPtr<Region> &region, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| منطقة | const SharedPtr\<Region\>\& | يحدِّد منطقة للجمع |
| combineMode | Drawing2D::CombineMode | يحدد عملية الجمع |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(Rectangle, Drawing2D::CombineMode) method


يضبط منطقة القص لسطح الرسم الممثلة بواسطة كائن [Graphics](../) الحالي إلى نتيجة العملية المحددة التي تجمع بين منطقة القص الحالية والمنطقة المحددة.

```cpp
void System::Drawing::Graphics::SetClip(Rectangle rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rect | مستطيل | يحدِّد منطقة للجمع |
| combineMode | Drawing2D::CombineMode | يحدد عملية الجمع |

## انظر أيضًا

* Class [Rectangle](../../rectangle/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Graphics::SetClip(RectangleF, Drawing2D::CombineMode) method


يضبط منطقة القص لسطح الرسم الممثلة بواسطة كائن [Graphics](../) الحالي إلى نتيجة العملية المحددة التي تجمع بين منطقة القص الحالية والمنطقة المحددة.

```cpp
void System::Drawing::Graphics::SetClip(RectangleF rect, Drawing2D::CombineMode combineMode=Drawing2D::CombineMode::Replace)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rect | RectangleF | يحدِّد منطقة للجمع |
| combineMode | Drawing2D::CombineMode | يحدد عملية الجمع |

## انظر أيضًا

* Class [RectangleF](../../rectanglef/)
* Enum [CombineMode](../../../system.drawing.drawing2d/combinemode/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)

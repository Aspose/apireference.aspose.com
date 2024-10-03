---
title: Aspose::Page::EPS::GradientBrush class
linktitle: GradientBrush
second_title: Aspose.Page for C++
description: 'Aspose::Page::EPS::GradientBrush class. This class is used for encapsulating LinearGradientBrush and PathGradientBrush with possibility to set wrap mode to clamp. Native gradient brushes always throw an exception when someone tries to set WrapMode property to WrapMode.Clamp in C++.'
type: docs
weight: 300
url: /cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


This class is used for encapsulating LinearGradientBrush and PathGradientBrush with possibility to set wrap mode to clamp. Native gradient brushes always throw an exception when someone tries to set WrapMode property to WrapMode.Clamp.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Methods

| Method | Description |
| --- | --- |
| [Clone](./clone/)() override | Clones this brush. |
| [get_Bounds](./get_bounds/)() const | Returns or specifies bounds for this gradient brushes. |
| [get_NativeBrush](./get_nativebrush/)() const | Returns native gradient brush. |
| [get_WrapMode](./get_wrapmode/)() const | Returns or specifies wrap mode for this gradient brush. It can be WrapMode.Clamp, that results in throwing exception in native gradient brushes. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Creates new instance of [GradientBrush](./). |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Returns or specifies bounds for this gradient brushes. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Returns or specifies wrap mode for this gradient brush. It can be WrapMode.Clamp, that results in throwing exception in native gradient brushes. |
## See Also

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

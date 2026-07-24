---
title: "Aspose::Page::EPS::GradientBrush 类"
linktitle: "GradientBrush"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::GradientBrush 类。此类用于封装 LinearGradientBrush 和 PathGradientBrush，并可以将包装模式设置为 clamp。在 C++ 中，原生渐变画刷在尝试将 WrapMode 属性设置为 WrapMode.Clamp 时总是抛出异常。"
type: docs
weight: 300
url: /zh/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


此类用于封装 LinearGradientBrush 和 PathGradientBrush，并可以将包装模式设置为 clamp。当尝试将 WrapMode 属性设置为 WrapMode.Clamp 时，原生渐变画刷总是会抛出异常。

```cpp
class GradientBrush : public System::Drawing::Brush
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 克隆此画刷。 |
| [Dispose](./dispose/)() override | 释放此 [T:Aspose::Page::EPS::GradientBrush](../) 对象使用的所有资源。 |
| [get_Bounds](./get_bounds/)() const | 返回或指定此渐变画刷的边界。 |
| [get_NativeBrush](./get_nativebrush/)() const | 返回原生渐变画刷。 |
| [get_WrapMode](./get_wrapmode/)() const | 返回或指定此渐变画刷的包装模式。它可以是 WrapMode.Clamp，这将在原生渐变画刷中导致抛出异常。 |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | 创建 [GradientBrush](./) 的新实例。 |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | 返回或指定此渐变画刷的边界。 |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | 返回或指定此渐变画刷的包装模式。它可以是 WrapMode.Clamp，这将在原生渐变画刷中导致抛出异常。 |
## 另见

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

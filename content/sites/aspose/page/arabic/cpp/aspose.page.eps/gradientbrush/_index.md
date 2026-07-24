---
title: "فئة Aspose::Page::EPS::GradientBrush"
linktitle: "GradientBrush"
second_title: "Aspose.Page لـ C++"
description: "فئة Aspose::Page::EPS::GradientBrush. تُستخدم هذه الفئة لتغليف LinearGradientBrush و PathGradientBrush مع إمكانية تعيين وضع الالتفاف إلى clamp. دائمًا ما تُطلق الفُرَش المتدرجة الأصلية استثناءً عندما يحاول أحدهم تعيين خاصية WrapMode إلى WrapMode.Clamp في C++."
type: docs
weight: 300
url: /ar/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


هذه الفئة تُستخدم لتغليف LinearGradientBrush و PathGradientBrush مع إمكانية ضبط وضع الالتفاف إلى clamp. فرش التدرج الأصلية دائمًا ما تُطلق استثناءً عندما يحاول أحدهم ضبط خاصية WrapMode إلى WrapMode.Clamp.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينسخ هذه الفرشاة. |
| [Dispose](./dispose/)() override | يطلق جميع الموارد المستخدمة بواسطة هذا [T:Aspose::Page::EPS::GradientBrush](../) كائن. |
| [get_Bounds](./get_bounds/)() const | يرجع أو يحدد الحدود لهذه الفُرش المتدرجة. |
| [get_NativeBrush](./get_nativebrush/)() const | يرجع الفرشاة المتدرجة الأصلية. |
| [get_WrapMode](./get_wrapmode/)() const | يرجع أو يحدد وضع الالتفاف لهذه الفرشاة المتدرجة. يمكن أن يكون WrapMode.Clamp، مما يؤدي إلى رمي استثناء في الفُرَش المتدرجة الأصلية. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | ينشئ نسخة جديدة من [GradientBrush](./). |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | يرجع أو يحدد الحدود لهذه الفُرش المتدرجة. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | يرجع أو يحدد وضع الالتفاف لهذه الفرشاة المتدرجة. يمكن أن يكون WrapMode.Clamp، مما يؤدي إلى رمي استثناء في الفُرَش المتدرجة الأصلية. |
## انظر أيضًا

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

---
title: "Aspose::Page::EPS::GradientBrush sınıfı"
linktitle: "GradientBrush"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::GradientBrush sınıfı. Bu sınıf, LinearGradientBrush ve PathGradientBrush'ı sarmak ve sarma modunu clamp olarak ayarlama imkanı sağlamak için kullanılır. Yerel gradient fırçaları, C++'ta WrapMode özelliğini WrapMode.Clamp olarak ayarlamaya çalışan birisi olduğunda her zaman bir istisna fırlatır."
type: docs
weight: 300
url: /tr/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


Bu sınıf, LinearGradientBrush ve PathGradientBrush nesnelerini kapsüllemek ve sarma modunu clamp olarak ayarlama imkanı sağlamak için kullanılır. Yerel gradient fırçalar, WrapMode özelliği WrapMode.Clamp olarak ayarlanmaya çalışıldığında her zaman bir istisna fırlatır.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Bu fırçayı kopyalar. |
| [Dispose](./dispose/)() override | Bu [T:Aspose::Page::EPS::GradientBrush](../) nesnesi tarafından kullanılan tüm kaynakları serbest bırakır. |
| [get_Bounds](./get_bounds/)() const | Bu gradient fırçaları için sınırları döndürür veya belirtir. |
| [get_NativeBrush](./get_nativebrush/)() const | Yerel gradient fırçasını döndürür. |
| [get_WrapMode](./get_wrapmode/)() const | Bu gradient fırçası için sarma modunu döndürür veya belirtir. WrapMode.Clamp olabilir; bu, yerel gradient fırçalarında istisna fırlatılmasına neden olur. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Yeni bir [GradientBrush](./) örneği oluşturur. |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Bu gradient fırçaları için sınırları döndürür veya belirtir. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Bu gradient fırçası için sarma modunu döndürür veya belirtir. WrapMode.Clamp olabilir; bu, yerel gradient fırçalarında istisna fırlatılmasına neden olur. |
## Ayrıca Bakınız

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

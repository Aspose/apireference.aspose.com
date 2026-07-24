---
title: "Aspose::Page::EPS::GradientBrush 클래스"
linktitle: "GradientBrush"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::GradientBrush 클래스. 이 클래스는 LinearGradientBrush와 PathGradientBrush를 캡슐화하고 랩 모드를 클램프으로 설정할 수 있도록 사용됩니다. 네이티브 그라디언트 브러시는 C++에서 WrapMode 속성을 WrapMode.Clamp으로 설정하려고 하면 항상 예외를 발생시킵니다."
type: docs
weight: 300
url: /ko/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


이 클래스는 LinearGradientBrush와 PathGradientBrush를 캡슐화하는 데 사용되며, 랩 모드를 Clamp으로 설정할 수 있습니다. 기본 그라디언트 브러시는 WrapMode 속성을 WrapMode.Clamp으로 설정하려고 하면 항상 예외를 발생시킵니다.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 이 브러시를 복제합니다. |
| [Dispose](./dispose/)() override | 이 [T:Aspose::Page::EPS::GradientBrush](../) 객체가 사용하는 모든 리소스를 해제합니다. |
| [get_Bounds](./get_bounds/)() const | 이 그라디언트 브러시의 경계를 반환하거나 지정합니다. |
| [get_NativeBrush](./get_nativebrush/)() const | 네이티브 그라디언트 브러시를 반환합니다. |
| [get_WrapMode](./get_wrapmode/)() const | 이 그라디언트 브러시의 랩 모드를 반환하거나 지정합니다. WrapMode.Clamp일 수 있으며, 이는 네이티브 그라디언트 브러시에서 예외를 발생시킵니다. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | 새 인스턴스를 [GradientBrush](./) 로 생성합니다. |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | 이 그라디언트 브러시의 경계를 반환하거나 지정합니다. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | 이 그라디언트 브러시의 랩 모드를 반환하거나 지정합니다. WrapMode.Clamp일 수 있으며, 이는 네이티브 그라디언트 브러시에서 예외를 발생시킵니다. |
## 또 보기

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

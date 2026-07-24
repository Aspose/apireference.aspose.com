---
title: "Aspose::Page::EPS::GradientBrush klass"
linktitle: "GradientBrush"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::GradientBrush klass. Denna klass används för att kapsla in LinearGradientBrush och PathGradientBrush med möjlighet att sätta omslagsläge till clamp. Inbyggda gradientpenslar kastar alltid ett undantag när någon försöker sätta WrapMode-egenskapen till WrapMode.Clamp i C++."
type: docs
weight: 300
url: /sv/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


Denna klass används för att kapsla in LinearGradientBrush och PathGradientBrush med möjlighet att sätta omslagsläge till clamp. Inbyggda gradientpenslar kastar alltid ett undantag när någon försöker sätta WrapMode‑egenskapen till WrapMode.Clamp.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Clone](./clone/)() override | Klonar denna pensel. |
| [Dispose](./dispose/)() override | Frigir alla resurser som används av detta [T:Aspose::Page::EPS::GradientBrush](../) objekt. |
| [get_Bounds](./get_bounds/)() const | Returnerar eller specificerar gränser för denna gradientpensel. |
| [get_NativeBrush](./get_nativebrush/)() const | Returnerar inbyggd gradientpensel. |
| [get_WrapMode](./get_wrapmode/)() const | Returnerar eller specificerar omslagsläge för denna gradientpensel. Det kan vara WrapMode.Clamp, vilket resulterar i att ett undantag kastas i inbyggda gradientpenslar. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Skapar en ny instans av [GradientBrush](./). |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Returnerar eller specificerar gränser för denna gradientpensel. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Returnerar eller specificerar omslagsläge för denna gradientpensel. Det kan vara WrapMode.Clamp, vilket resulterar i att ett undantag kastas i inbyggda gradientpenslar. |
## Se även

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

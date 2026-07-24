---
title: "Aspose::Page::EPS::GradientBrush klasse"
linktitle: "GradientBrush"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::GradientBrush klasse. Deze klasse wordt gebruikt voor het encapsuleren van LinearGradientBrush en PathGradientBrush met de mogelijkheid om de wrap-modus in te stellen op clamp. Native gradientpenselen gooien altijd een uitzondering wanneer iemand probeert de eigenschap WrapMode in te stellen op WrapMode.Clamp in C++."
type: docs
weight: 300
url: /nl/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


Deze klasse wordt gebruikt om LinearGradientBrush en PathGradientBrush te encapsuleren met de mogelijkheid om de wrap‑modus in te stellen op clamp. Native gradient brushes gooien altijd een uitzondering wanneer iemand probeert de WrapMode‑eigenschap in te stellen op WrapMode.Clamp.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Kloont deze kwast. |
| [Dispose](./dispose/)() override | Geeft alle bronnen vrij die door dit [T:Aspose::Page::EPS::GradientBrush](../) object worden gebruikt. |
| [get_Bounds](./get_bounds/)() const | Retourneert of specificeert de grenzen voor deze gradientpenselen. |
| [get_NativeBrush](./get_nativebrush/)() const | Retourneert native gradientkwast. |
| [get_WrapMode](./get_wrapmode/)() const | Retourneert of specificeert de wrap-modus voor deze gradientkwast. Het kan WrapMode.Clamp zijn, wat resulteert in het gooien van een uitzondering in native gradientpenselen. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Maakt een nieuwe instantie van [GradientBrush](./) aan. |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Retourneert of specificeert de grenzen voor deze gradientpenselen. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Retourneert of specificeert de wrap-modus voor deze gradientkwast. Het kan WrapMode.Clamp zijn, wat resulteert in het gooien van een uitzondering in native gradientpenselen. |
## Zie ook

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

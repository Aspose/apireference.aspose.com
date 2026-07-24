---
title: "Aspose::Page::EPS::GradientBrush Klasse"
linktitle: "GradientBrush"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::GradientBrush Klasse. Diese Klasse wird verwendet, um LinearGradientBrush und PathGradientBrush zu kapseln, mit der Möglichkeit, den Wrap‑Modus auf Clamp zu setzen. Native Gradient‑Pinsel werfen immer eine Ausnahme, wenn jemand versucht, die WrapMode‑Eigenschaft in C++ auf WrapMode.Clamp zu setzen."
type: docs
weight: 300
url: /de/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


Diese Klasse wird verwendet, um LinearGradientBrush und PathGradientBrush zu kapseln, mit der Möglichkeit, den Wrap‑Modus auf Clamp zu setzen. Native Gradient‑Pinsel werfen stets eine Ausnahme, wenn versucht wird, die Eigenschaft WrapMode auf WrapMode.Clamp zu setzen.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() override | Klont diesen Pinsel. |
| [Dispose](./dispose/)() override | Gibt alle von diesem [T:Aspose::Page::EPS::GradientBrush](../) Objekt genutzten Ressourcen frei. |
| [get_Bounds](./get_bounds/)() const | Gibt die Grenzen für diesen Gradient‑Pinsel zurück oder legt sie fest. |
| [get_NativeBrush](./get_nativebrush/)() const | Gibt den nativen Gradient‑Pinsel zurück. |
| [get_WrapMode](./get_wrapmode/)() const | Gibt den Wrap‑Modus für diesen Gradient‑Pinsel zurück oder legt ihn fest. Er kann WrapMode.Clamp sein, was bei nativen Gradient‑Pinseln eine Ausnahme auslöst. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Erstellt eine neue Instanz von [GradientBrush](./). |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Gibt die Grenzen für diesen Gradient‑Pinsel zurück oder legt sie fest. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Gibt den Wrap‑Modus für diesen Gradient‑Pinsel zurück oder legt ihn fest. Er kann WrapMode.Clamp sein, was bei nativen Gradient‑Pinseln eine Ausnahme auslöst. |
## Siehe auch

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

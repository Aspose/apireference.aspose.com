---
title: "Aspose::Page::EPS::GradientBrush classe"
linktitle: "GradientBrush"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::GradientBrush classe. Cette classe est utilisée pour encapsuler LinearGradientBrush et PathGradientBrush avec la possibilité de définir le mode d'enroulement sur clamp. Les pinceaux de dégradé natifs lèvent toujours une exception lorsqu'on essaie de définir la propriété WrapMode sur WrapMode.Clamp en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


Cette classe est utilisée pour encapsuler LinearGradientBrush et PathGradientBrush avec la possibilité de définir le mode d'enroulement sur clamp. Les pinceaux de dégradé natifs lèvent toujours une exception lorsqu'on essaie de définir la propriété WrapMode sur WrapMode.Clamp.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clone](./clone/)() override | Clone ce pinceau. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par cet objet [T:Aspose::Page::EPS::GradientBrush](../). |
| [get_Bounds](./get_bounds/)() const | Renvoie ou spécifie les limites pour ces pinceaux de dégradé. |
| [get_NativeBrush](./get_nativebrush/)() const | Renvoie le pinceau de dégradé natif. |
| [get_WrapMode](./get_wrapmode/)() const | Renvoie ou spécifie le mode d'enroulement pour ce pinceau de dégradé. Il peut être WrapMode.Clamp, ce qui entraîne le lancement d'une exception dans les pinceaux de dégradé natifs. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Crée une nouvelle instance de [GradientBrush](./). |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Renvoie ou spécifie les limites pour ces pinceaux de dégradé. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Renvoie ou spécifie le mode d'enroulement pour ce pinceau de dégradé. Il peut être WrapMode.Clamp, ce qui entraîne le lancement d'une exception dans les pinceaux de dégradé natifs. |
## Voir aussi

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

---
title: "Aspose::Page::EPS::GradientBrush class"
linktitle: "GradientBrush"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::EPS::GradientBrush class. Questa classe è usata per incapsulare LinearGradientBrush e PathGradientBrush con la possibilità di impostare la modalità di avvolgimento a clamp. I pennelli gradiente nativi generano sempre un'eccezione quando qualcuno tenta di impostare la proprietà WrapMode a WrapMode.Clamp in C++."
type: docs
weight: 300
url: /it/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


Questa classe è usata per incapsulare LinearGradientBrush e PathGradientBrush con la possibilità di impostare la modalità di avvolgimento a clamp. I pennelli gradiente nativi lanciano sempre un'eccezione quando si tenta di impostare la proprietà WrapMode su WrapMode.Clamp.

```cpp
class GradientBrush : public System::Drawing::Brush
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Clona questo pennello. |
| [Dispose](./dispose/)() override | Rilascia tutte le risorse utilizzate da questo oggetto [T:Aspose::Page::EPS::GradientBrush](../). |
| [get_Bounds](./get_bounds/)() const | Restituisce o specifica i limiti per questi pennelli gradiente. |
| [get_NativeBrush](./get_nativebrush/)() const | Restituisce il pennello gradiente nativo. |
| [get_WrapMode](./get_wrapmode/)() const | Restituisce o specifica la modalità di avvolgimento per questo pennello gradiente. Può essere WrapMode.Clamp, il che provoca il lancio di un'eccezione nei pennelli gradiente nativi. |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | Crea una nuova istanza di [GradientBrush](./). |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | Restituisce o specifica i limiti per questi pennelli gradiente. |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | Restituisce o specifica la modalità di avvolgimento per questo pennello gradiente. Può essere WrapMode.Clamp, il che provoca il lancio di un'eccezione nei pennelli gradiente nativi. |
## Vedi anche

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

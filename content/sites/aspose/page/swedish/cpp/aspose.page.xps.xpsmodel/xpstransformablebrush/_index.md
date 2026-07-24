---
title: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush klass"
linktitle: "XpsTransformableBrush"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush klass. Klass som kapslar in gemensamma egenskaper för transformera­bara pensel‑element (alla förutom SolidColorBrush) i C++."
type: docs
weight: 4300
url: /sv/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


Klass som inkapslar gemensamma egenskaper för transformerbara penselselement (alla förutom SolidColorBrush).

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [get_Transform](./get_transform/)() override | Returnerar/sätter matrisomvandlingen som tillämpas på penselns koordinatrymd. Transform‑egenskapen konkateneras med den aktuella effektiva renderingsomvandlingen för att ge en effektiv renderingsomvandling lokal för penseln. Vyporten för penseln transformeras med den lokala effektiva renderingsomvandlingen. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Returnerar/sätter matrisomvandlingen som tillämpas på penselns koordinatrymd. Transform‑egenskapen konkateneras med den aktuella effektiva renderingsomvandlingen för att ge en effektiv renderingsomvandling lokal för penseln. Vyporten för penseln transformeras med den lokala effektiva renderingsomvandlingen. |
## Se även

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

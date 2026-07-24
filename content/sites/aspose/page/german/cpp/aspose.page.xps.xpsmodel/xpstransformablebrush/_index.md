---
title: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush Klasse"
linktitle: "XpsTransformableBrush"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush Klasse. Klasse, die gemeinsame Merkmale von transformierbaren Pinsel-Elementen (alle außer SolidColorBrush) in C++ kapselt."
type: docs
weight: 4300
url: /de/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


Klasse, die gemeinsame Merkmale von transformierbaren Pinsel-Elementen (alle außer SolidColorBrush) kapselt.

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_Transform](./get_transform/)() override | Gibt die Matrixtransformation zurück bzw. setzt sie, die auf den Koordinatenraum des Pinsels angewendet wird. Die Transform‑Eigenschaft wird mit der aktuellen effektiven Render-Transformation verkettet, um eine effektive Render-Transformation lokal zum Pinsel zu erzeugen. Der Viewport des Pinsels wird mithilfe der lokalen effektiven Render-Transformation transformiert. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Gibt die Matrixtransformation zurück bzw. setzt sie, die auf den Koordinatenraum des Pinsels angewendet wird. Die Transform‑Eigenschaft wird mit der aktuellen effektiven Render-Transformation verkettet, um eine effektive Render-Transformation lokal zum Pinsel zu erzeugen. Der Viewport des Pinsels wird mithilfe der lokalen effektiven Render-Transformation transformiert. |
## Siehe auch

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

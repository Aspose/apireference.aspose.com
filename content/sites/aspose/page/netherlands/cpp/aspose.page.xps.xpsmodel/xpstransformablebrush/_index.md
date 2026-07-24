---
title: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush class"
linktitle: "XpsTransformableBrush"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush class. Klasse die algemene kenmerken van transformeerbare brush-elementen encapsuleert (alle behalve SolidColorBrush) in C++."
type: docs
weight: 4300
url: /nl/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


Klasse die gemeenschappelijke kenmerken van transformeerbare kwast-elementen incapsuleert (alle behalve SolidColorBrush).

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Transform](./get_transform/)() override | Retourneert/instelt de matrixtransformatie die wordt toegepast op de coördinatenruimte van de brush. De Transform-eigenschap wordt samengevoegd met de huidige effectieve rendertransformatie om een effectieve rendertransformatie lokaal voor de brush te verkrijgen. Het viewport voor de brush wordt getransformeerd met behulp van de lokale effectieve rendertransformatie. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Retourneert/instelt de matrixtransformatie die wordt toegepast op de coördinatenruimte van de brush. De Transform-eigenschap wordt samengevoegd met de huidige effectieve rendertransformatie om een effectieve rendertransformatie lokaal voor de brush te verkrijgen. Het viewport voor de brush wordt getransformeerd met behulp van de lokale effectieve rendertransformatie. |
## Zie ook

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

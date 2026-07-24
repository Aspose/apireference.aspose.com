---
title: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush class"
linktitle: "XpsTransformableBrush"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsModel::XpsTransformableBrush class. Classe encapsulant les fonctionnalités communes des éléments de pinceaux transformables (tous sauf SolidColorBrush) en C++."
type: docs
weight: 4300
url: /fr/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


Classe encapsulant les fonctionnalités communes des éléments de brosses transformables (toutes sauf SolidColorBrush).

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Transform](./get_transform/)() override | Renvoie/definit la transformation matricielle appliquée à l'espace de coordonnées du pinceau. La propriété Transform est concaténée avec la transformation de rendu effective actuelle pour produire une transformation de rendu effective locale au pinceau. Le viewport du pinceau est transformé en utilisant la transformation de rendu effective locale. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Renvoie/definit la transformation matricielle appliquée à l'espace de coordonnées du pinceau. La propriété Transform est concaténée avec la transformation de rendu effective actuelle pour produire une transformation de rendu effective locale au pinceau. Le viewport du pinceau est transformé en utilisant la transformation de rendu effective locale. |
## Voir aussi

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

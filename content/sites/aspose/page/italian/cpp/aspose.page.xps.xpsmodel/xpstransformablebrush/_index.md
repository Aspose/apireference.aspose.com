---
title: "Classe Aspose::Page::XPS::XpsModel::XpsTransformableBrush"
linktitle: "XpsTransformableBrush"
second_title: "Aspose.Page per C++"
description: "Classe Aspose::Page::XPS::XpsModel::XpsTransformableBrush. Classe che incapsula le funzionalità comuni degli elementi pennelli trasformabili (tutti tranne SolidColorBrush) in C++."
type: docs
weight: 4300
url: /it/cpp/aspose.page.xps.xpsmodel/xpstransformablebrush/
---
## XpsTransformableBrush class


Classe che incapsula le caratteristiche comuni degli elementi pennelli trasformabili (tutti tranne SolidColorBrush).

```cpp
class XpsTransformableBrush : public Aspose::Page::XPS::XpsModel::XpsBrush,
                              public Aspose::Page::XPS::XpsModel::ITransformableProperty
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Transform](./get_transform/)() override | Restituisce/imposta la trasformazione matriciale applicata allo spazio delle coordinate del pennello. La proprietà Transform è concatenata con la trasformazione di rendering efficace corrente per ottenere una trasformazione di rendering efficace locale al pennello. Il viewport del pennello è trasformato usando la trasformazione di rendering efficace locale. |
| [set_Transform](./set_transform/)(System::SharedPtr\<XpsMatrix\>) override | Restituisce/imposta la trasformazione matriciale applicata allo spazio delle coordinate del pennello. La proprietà Transform è concatenata con la trasformazione di rendering efficace corrente per ottenere una trasformazione di rendering efficace locale al pennello. Il viewport del pennello è trasformato usando la trasformazione di rendering efficace locale. |
## Vedi anche

* Class [XpsBrush](../xpsbrush/)
* Class [ITransformableProperty](../itransformableproperty/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

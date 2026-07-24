---
title: "Aspose::Page::IMultiPageDevice classe"
linktitle: "IMultiPageDevice"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::IMultiPageDevice classe. Cette interface contient des méthodes pour manipuler un dispositif multi-pages en C++."
type: docs
weight: 800
url: /fr/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


Cette interface contient des méthodes pour manipuler un dispositif multi‑pages.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [ClosePage](./closepage/)() | Effectue la préparation nécessaire du dispositif après le rendu de la page. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | Numéro de page actuel. |
| virtual [InitPageNumbers](./initpagenumbers/)() | Initialise le nombre de pages à produire. |
| virtual [OpenPage](./openpage/)(System::String) | Effectue les préparations nécessaires du dispositif avant le rendu de la page. |
| virtual [OpenPage](./openpage/)(float, float) | Effectue les préparations nécessaires du dispositif avant le rendu de chaque page. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | Met à jour les paramètres de page à partir d'un autre dispositif multi-pages. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)

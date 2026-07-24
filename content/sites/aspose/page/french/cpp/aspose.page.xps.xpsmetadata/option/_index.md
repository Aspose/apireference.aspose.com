---
title: "Classe Aspose::Page::XPS::XpsMetadata::Option"
linktitle: "Option"
second_title: "Aspose.Page pour C++"
description: "Classe Aspose::Page::XPS::XpsMetadata::Option. La classe qui implémente une PrintTicketOption commune. La classe de base pour toutes les options définies par le schéma. Un élément Option contient tous les éléments Property et ScoredProperty associés à cette option. en C++."
type: docs
weight: 7600
url: /fr/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


La classe qui implémente une **[Option](./)** de [PrintTicket](../printticket/). La classe de base pour toutes les options définies par le schéma. Un élément [Option](./) contient tous les éléments [Property](../property/) et [ScoredProperty](../scoredproperty/) associés à cette option. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Ajoute une liste d’éléments à la fin de la liste d’éléments de cette option. Chaque élément doit être une instance de [ScoredProperty](../scoredproperty/) ou de [Property](../property/). |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Crée une nouvelle instance d’option [PrintTicket](../printticket/). |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | Crée une nouvelle instance d’option [PrintTicket](../printticket/). |
| [Option](./option/)(System::SharedPtr\<Option\>) | Crée une instance d’option clonée. |
## Voir aussi

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)

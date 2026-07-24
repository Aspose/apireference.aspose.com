---
title: "Aspose::Page::XPS::XpsMetadata::Feature class"
linktitle: "Fonctionnalité"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature class. La classe qui encapsule une fonctionnalité commune du Print Schema. La classe de base pour toutes les fonctionnalités définies par le schéma. Un élément Feature contient une liste complète des éléments Option et Property qui décrivent pleinement un attribut de dispositif, un paramètre de formatage de travail ou toute autre caractéristique pertinente.  en C++."
type: docs
weight: 2900
url: /fr/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


La classe qui encapsule une fonctionnalité commune du schéma d’impression. La classe de base pour toutes les fonctionnalités définies par le schéma. Un élément **[Feature](./)** contient une liste complète des éléments [Option](../option/) et [Property](../property/) qui décrivent entièrement un attribut de périphérique, un paramètre de formatage de travail ou toute autre caractéristique pertinente. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Ajoute une liste d’éléments à la fin de la liste d’éléments de cette fonctionnalité. Chaque élément doit être une instance de [Feature](./), d’un [Option](../option/) ou d’un [Property](../property/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Crée une nouvelle instance de fonctionnalité [PrintTicket](../printticket/). |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | Crée une nouvelle instance de fonctionnalité [PrintTicket](../printticket/). |
## Voir aussi

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)

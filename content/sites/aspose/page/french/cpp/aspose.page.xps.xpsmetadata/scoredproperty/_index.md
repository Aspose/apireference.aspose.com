---
title: "Aspose::Page::XPS::XpsMetadata::ScoredProperty class"
linktitle: "ScoredProperty"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::ScoredProperty class. La classe qui implémente une PrintTicketScoredProperty commune. La classe de base pour toutes les propriétés notées définies par le schéma. Un élément ScoredProperty déclare une propriété intrinsèque à une définition d'Option. De telles propriétés doivent être comparées lors de l'évaluation de la proximité entre une Option demandée et une Option prise en charge par le dispositif.  en C++."
type: docs
weight: 14600
url: /fr/cpp/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class


La classe qui implémente une **[ScoredProperty](./)** commune du [PrintTicket](../printticket/). La classe de base pour toutes les propriétés notées définies par le schéma. Un élément **[ScoredProperty](./)** déclare une propriété qui est intrinsèque à une définition d'[Option](../option/). De telles propriétés doivent être comparées lors de l'évaluation de la proximité entre une [Option](../option/) demandée et une [Option](../option/) prise en charge par le dispositif. [https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty](https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty).

```cpp
class ScoredProperty : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                       public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                       public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<ParameterRef\>) | Crée une nouvelle instance. |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IScoredPropertyItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)

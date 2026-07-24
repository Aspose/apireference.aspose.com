---
title: "Aspose::Page::XPS::XpsMetadata::Property classe"
linktitle: "Propriété"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsMetadata::Property classe. La classe qui implémente un PrintTicketProperty commun. La classe de base pour toutes les propriétés définies par le schéma. Un élément Property déclare un dispositif, un formatage de travail ou toute autre propriété pertinente dont le nom est fourni par son attribut name. Un élément Value est utilisé pour attribuer une valeur à la Property. Une Property peut être complexe, contenant éventuellement plusieurs sous‑propriétés. Les sous‑propriétés sont également représentées par des éléments Property.  en C++."
type: docs
weight: 14300
url: /fr/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


La classe qui implémente un **[Property](./)** commun de [PrintTicket](../printticket/). La classe de base pour toutes les propriétés définies par le schéma. Un élément **[Property](./)** déclare un dispositif, un formatage de travail ou toute autre propriété pertinente dont le nom est fourni par son attribut name. Un élément [Value](../value/) est utilisé pour attribuer une valeur au **[Property](./)**. Un **[Property](./)** peut être complexe, contenant éventuellement plusieurs sous‑propriétés. Les sous‑propriétés sont également représentées par des éléments **[Property](./)**. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Crée une nouvelle instance. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | Crée une nouvelle instance. |
## Voir aussi

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)

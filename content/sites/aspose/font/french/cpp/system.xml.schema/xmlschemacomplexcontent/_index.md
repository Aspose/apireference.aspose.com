---
title: "System::Xml::Schema::XmlSchemaComplexContent classe"
linktitle: "XmlSchemaComplexContent"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaComplexContent classe. Représente l'élément complexContent du XML Schema tel que spécifié par le World Wide Web Consortium (W3C). Cette classe représente le modèle de contenu complexe pour les types complexes. Elle contient des extensions ou des restrictions sur un type complexe qui possède uniquement des éléments ou un contenu mixte en C++."
type: docs
weight: 1800
url: /fr/cpp/system.xml.schema/xmlschemacomplexcontent/
---
## XmlSchemaComplexContent class


Représente l'élément **complexContent** du XML [Schema](../) tel que spécifié par le World Wide [Web](../../system.web/) Consortium (W3C). Cette classe représente le modèle de contenu complexe pour les types complexes. Elle contient des extensions ou des restrictions sur un type complexe qui possède uniquement des éléments ou un contenu mixte.

```cpp
class XmlSchemaComplexContent : public System::Xml::Schema::XmlSchemaContentModel
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Content](./get_content/)() override | Renvoie le contenu. |
| [get_IsMixed](./get_ismixed/)() | Renvoie des informations qui déterminent si le type possède un modèle de contenu mixte. |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | Définit le contenu. |
| [set_IsMixed](./set_ismixed/)(bool) | Définit des informations qui déterminent si le type possède un modèle de contenu mixte. |
| [XmlSchemaComplexContent](./xmlschemacomplexcontent/)() | Initialise une nouvelle instance de la classe [XmlSchemaComplexContent](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)

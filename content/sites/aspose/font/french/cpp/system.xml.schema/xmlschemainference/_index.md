---
title: "Classe System::Xml::Schema::XmlSchemaInference"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaInference. Infère un schéma XML Schema Definition Language (XSD) à partir d'un document XML. La classe XmlSchemaInference ne peut pas être héritée en C++."
type: docs
weight: 3700
url: /fr/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


Infère un schéma XML [Schema](../) Definition Language (XSD) à partir d'un document XML. La classe [XmlSchemaInference](./) ne peut pas être héritée.

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| Énumération | Description |
| --- | --- |
| [InferenceOption](./inferenceoption/) | Affecte les informations d'occurrence et de type inférées par la classe [XmlSchemaInference](./) pour les éléments et attributs d'un document XML. |
## Méthodes

| Méthode | Description |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | Renvoie la valeur [XmlSchemaInference::InferenceOption](./inferenceoption/) qui affecte les déclarations d'occurrence du schéma inférées à partir du document XML. |
| [get_TypeInference](./get_typeinference/)() | Renvoie la valeur [XmlSchemaInference::InferenceOption](./inferenceoption/) qui affecte les types inférés à partir du document XML. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | Infère un schéma XML [Schema](../) Definition Language (XSD) à partir du document XML contenu dans l'objet [XmlReader](../../system.xml/xmlreader/) spécifié. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | Infère un schéma XML [Schema](../) Definition Language (XSD) à partir du document XML contenu dans l'objet [XmlReader](../../system.xml/xmlreader/) spécifié, et affine le schéma inféré en utilisant un schéma existant dans l'objet [XmlSchemaSet](../xmlschemaset/) spécifié avec le même espace de noms cible. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | Définit la valeur [XmlSchemaInference::InferenceOption](./inferenceoption/) qui affecte les déclarations d'occurrence du schéma inférées à partir du document XML. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | Définit la valeur [XmlSchemaInference::InferenceOption](./inferenceoption/) qui affecte les types inférés à partir du document XML. |
| [XmlSchemaInference](./xmlschemainference/)() | Initialise une nouvelle instance de la classe [XmlSchemaInference](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)

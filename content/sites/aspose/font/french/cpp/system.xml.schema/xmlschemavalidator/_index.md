---
title: "Classe System::Xml::Schema::XmlSchemaValidator"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::Schema::XmlSchemaValidator. Représente un moteur de validation de schéma XML Schema Definition Language (XSD). La classe XmlSchemaValidator ne peut pas être héritée en C++."
type: docs
weight: 7000
url: /fr/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


Représente un moteur de validation de [Schema](../) XML Definition Language (XSD) [Schema](../). La classe [XmlSchemaValidator](./) ne peut pas être héritée.

```cpp
class XmlSchemaValidator : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | Ajoute un schéma XML [Schema](../) Definition Language (XSD) au jeu de schémas utilisés pour la validation. |
| [EndValidation](./endvalidation/)() | Termine la validation et vérifie les contraintes d'identité pour l'ensemble du document XML. |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | Renvoie les informations de numéro de ligne pour le nœud XML en cours de validation. |
| [get_SourceUri](./get_sourceuri/)() | Renvoie l'URI source du nœud XML en cours de validation. |
| [get_ValidationEventSender](./get_validationeventsender/)() | Renvoie l'objet envoyé comme objet expéditeur d'un événement de validation. |
| [GetExpectedAttributes](./getexpectedattributes/)() | Renvoie les attributs attendus pour le contexte de l'élément actuel. |
| [GetExpectedParticles](./getexpectedparticles/)() | Renvoie les particules attendues dans le contexte de l'élément actuel. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | Valide les contraintes d'identité sur les attributs par défaut et remplit la List spécifiée avec des objets [XmlSchemaAttribute](../xmlschemaattribute/) pour tous les attributs ayant des valeurs par défaut qui n'ont pas été préalablement validés à l'aide de la méthode [XmlSchemaValidator::ValidateAttribute](./validateattribute/) dans le contexte de l'élément. |
| [Initialize](./initialize/)() | Initialise l'état de l'objet [XmlSchemaValidator](./). |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | Initialise l'état de l'objet [XmlSchemaValidator](./) en utilisant le [XmlSchemaObject](../xmlschemaobject/) spécifié pour la validation partielle. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | Définit les informations de numéro de ligne pour le nœud XML en cours de validation. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | Définit l'URI source du nœud XML en cours de validation. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | Définit l'objet envoyé comme objet expéditeur d'un événement de validation. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Définit l'objet [XmlResolver](../../system.xml/xmlresolver/) utilisé pour résoudre les éléments **xs:import** et **xs:include**, ainsi que les attributs **xsi:schemaLocation** et **xsi:noNamespaceSchemaLocation**. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Ignore la validation du contenu de l'élément actuel et prépare l'objet [XmlSchemaValidator](./) pour valider le contenu dans le contexte de l'élément parent. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Valide le nom de l'attribut, l'URI de l'espace de noms et la valeur dans le contexte de l'élément actuel. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | Valide le nom de l'attribut, l'URI de l'espace de noms et la valeur dans le contexte de l'élément actuel. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Valide l'élément dans le contexte actuel. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | Valide l'élément dans le contexte actuel avec les valeurs d'attribut **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation** et **xsi:NoNamespaceSchemaLocation** spécifiées. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Vérifie si le contenu texte de l'élément est valide selon son type de données pour les éléments à contenu simple, et vérifie si le contenu de l'élément actuel est complet pour les éléments à contenu complexe. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | Vérifie si le contenu texte de l'élément spécifié est valide selon son type de données. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | Vérifie que tous les attributs requis dans le contexte de l'élément sont présents et prépare l'objet [XmlSchemaValidator](./) pour valider le contenu enfant de l'élément. |
| [ValidateText](./validatetext/)(const String\&) | Valide si la **string** texte spécifiée est autorisée dans le contexte de l'élément actuel, et accumule le texte pour la validation si l'élément actuel a un contenu simple. |
| [ValidateText](./validatetext/)(XmlValueGetter) | Valide si le texte renvoyé par l'objet [XmlValueGetter](../xmlvaluegetter/) spécifié est autorisé dans le contexte de l'élément actuel, et accumule le texte pour la validation si l'élément actuel a un contenu simple. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | Valide si l'espace blanc dans la **string** spécifiée est autorisé dans le contexte de l'élément actuel, et accumule l'espace blanc pour la validation si l'élément actuel a un contenu simple. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | Valide si l'espace blanc renvoyé par l'objet [XmlValueGetter](../xmlvaluegetter/) spécifié est autorisé dans le contexte de l'élément actuel, et accumule l'espace blanc pour la validation si l'élément actuel a un contenu simple. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | Initialise une nouvelle instance de la classe [XmlSchemaValidator](./). |
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

---
title: "Classe System::Xml::XmlReaderSettings"
linktitle: "XmlReaderSettings"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlReaderSettings. Spécifie un ensemble de fonctionnalités à prendre en charge sur l'objet XmlReader créé par la méthode XmlReader::Create en C++."
type: docs
weight: 3400
url: /fr/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


Spécifie un ensemble de fonctionnalités à prendre en charge sur l'objet [XmlReader](../xmlreader/) créé par la méthode [XmlReader::Create](../xmlreader/create/).

```cpp
class XmlReaderSettings : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | Crée une copie de l'instance [XmlReaderSettings](./). |
| [get_CheckCharacters](./get_checkcharacters/)() | Renvoie une valeur indiquant s'il faut effectuer la vérification des caractères. |
| [get_CloseInput](./get_closeinput/)() | Renvoie une valeur indiquant si le flux sous-jacent ou le TextReader doit être fermé lorsque le lecteur est fermé. |
| [get_ConformanceLevel](./get_conformancelevel/)() | Renvoie le niveau de conformité auquel le [XmlReader](../xmlreader/) doit se conformer. |
| [get_DtdProcessing](./get_dtdprocessing/)() | Renvoie une valeur qui détermine le traitement des DTD. |
| [get_IgnoreComments](./get_ignorecomments/)() | Renvoie une valeur indiquant s'il faut ignorer les commentaires. |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | Renvoie une valeur indiquant s'il faut ignorer les instructions de traitement. |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | Renvoie une valeur indiquant s'il faut ignorer les espaces blancs insignifiants. |
| [get_LineNumberOffset](./get_linenumberoffset/)() | Renvoie le décalage du numéro de ligne de l'objet [XmlReader](../xmlreader/). |
| [get_LinePositionOffset](./get_linepositionoffset/)() | Renvoie le décalage de la position de ligne de l'objet [XmlReader](../xmlreader/). |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | Renvoie une valeur indiquant le nombre maximal de caractères autorisé dans un document résultant de l'expansion des entités. |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | Renvoie une valeur indiquant le nombre maximal de caractères autorisé dans un document XML. Une valeur zéro (0) signifie qu'il n'y a aucune limite sur la taille du document XML. Une valeur non nulle spécifie la taille maximale, en caractères. |
| [get_NameTable](./get_nametable/)() | Renvoie le [XmlNameTable](../xmlnametable/) utilisé pour les comparaisons de chaînes atomisées. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | Renvoie une valeur indiquant s'il faut interdire le traitement des définitions de type de document (DTD). |
| [get_Schemas](./get_schemas/)() | Renvoie le XmlSchemaSet à utiliser lors de la validation du schéma. |
| [get_ValidationFlags](./get_validationflags/)() | Renvoie une valeur indiquant les paramètres de validation du schéma. Ce paramètre s'applique aux objets [XmlReader](../xmlreader/) qui valident les schémas (la valeur de [XmlReaderSettings::get_ValidationType](./get_validationtype/) est [ValidationType::Schema](../validationtype/)). |
| [get_ValidationType](./get_validationtype/)() | Renvoie une valeur indiquant si le [XmlReader](../xmlreader/) effectuera la validation ou l'affectation de type lors de la lecture. |
| [Reset](./reset/)() | Réinitialise les membres de la classe de paramètres à leurs valeurs par défaut. |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | Définit une valeur indiquant s'il faut effectuer la vérification des caractères. |
| [set_CloseInput](./set_closeinput/)(bool) | Définit une valeur indiquant si le flux sous-jacent ou le TextReader doit être fermé lorsque le lecteur est fermé. |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | Définit le niveau de conformité auquel le [XmlReader](../xmlreader/) doit se conformer. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | Définit une valeur qui détermine le traitement des DTD. |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | Définit une valeur indiquant s'il faut ignorer les commentaires. |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | Définit une valeur indiquant s'il faut ignorer les instructions de traitement. |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | Définit une valeur indiquant s'il faut ignorer les espaces blancs insignifiants. |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | Définit le décalage du numéro de ligne de l'objet [XmlReader](../xmlreader/). |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | Définit le décalage de position de ligne de l'objet [XmlReader](../xmlreader/). |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | Définit une valeur indiquant le nombre maximal de caractères autorisés dans un document résultant de l'expansion des entités. |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | Définit une valeur indiquant le nombre maximal de caractères autorisés dans un document XML. Une valeur zéro (0) signifie qu'il n'y a aucune limite sur la taille du document XML. Une valeur non nulle spécifie la taille maximale, en caractères. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Définit le [XmlNameTable](../xmlnametable/) utilisé pour les comparaisons de chaînes atomisées. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | Définit une valeur indiquant s'il faut interdire le traitement des définitions de type de document (DTD). |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Définit le XmlSchemaSet à utiliser lors de la validation du schéma. |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | Définit une valeur indiquant les paramètres de validation du schéma. Ce paramètre s'applique aux objets [XmlReader](../xmlreader/) qui valident les schémas (la valeur de [XmlReaderSettings::get_ValidationType](./get_validationtype/) est [ValidationType::Schema](../validationtype/)). |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | Définit une valeur indiquant si le [XmlReader](../xmlreader/) effectuera une validation ou une assignation de type lors de la lecture. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Définit le [XmlResolver](../xmlresolver/) utilisé pour accéder aux documents externes. |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | Ajoute un gestionnaire d'événement qui se déclenche lorsque le lecteur rencontre des erreurs de validation. |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | Supprime un gestionnaire d'événement qui se déclenche lorsque le lecteur rencontre des erreurs de validation. |
| [XmlReaderSettings](./xmlreadersettings/)() | Initialise une nouvelle instance de la classe [XmlReaderSettings](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

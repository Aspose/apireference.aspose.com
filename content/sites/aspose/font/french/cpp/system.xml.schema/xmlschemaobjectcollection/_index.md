---
title: "System::Xml::Schema::XmlSchemaObjectCollection classe"
linktitle: "XmlSchemaObjectCollection"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaObjectCollection classe. Une collection d'XmlSchemaObjects en C++."
type: docs
weight: 5100
url: /fr/cpp/system.xml.schema/xmlschemaobjectcollection/
---
## XmlSchemaObjectCollection class


Une collection d'XmlSchemaObjects.

```cpp
class XmlSchemaObjectCollection : public System::Collections::CollectionBase<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const SharedPtr\<XmlSchemaObject\>\&) | Ajoute un [XmlSchemaObject](../xmlschemaobject/) à la [XmlSchemaObjectCollection](./). |
| [Contains](./contains/)(const SharedPtr\<XmlSchemaObject\>\&) | Indique si le [XmlSchemaObject](../xmlschemaobject/) spécifié se trouve dans la [XmlSchemaObjectCollection](./). |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchemaObject\>\>\&, int32_t) | Copie tous les XmlSchemaObjects de la collection dans le tableau fourni, en commençant à l'index donné. |
| [GetEnumerator](./getenumerator/)() override | Renvoie un énumérateur pour parcourir les XmlSchemaObjects contenus dans la [XmlSchemaObjectCollection](./). |
| virtual [idx_get](./idx_get/)(int32_t) | Renvoie le [XmlSchemaObject](../xmlschemaobject/) à l'index spécifié. |
| virtual [idx_set](./idx_set/)(int32_t, SharedPtr\<XmlSchemaObject\>) | Définit le [XmlSchemaObject](../xmlschemaobject/) à l'index spécifié. |
| [IndexOf](./indexof/)(const SharedPtr\<XmlSchemaObject\>\&) | Renvoie l'index de la collection correspondant au [XmlSchemaObject](../xmlschemaobject/) spécifié. |
| [Insert](./insert/)(int32_t, const SharedPtr\<XmlSchemaObject\>\&) | Insère un [XmlSchemaObject](../xmlschemaobject/) dans la [XmlSchemaObjectCollection](./). |
| [Remove](./remove/)(const SharedPtr\<XmlSchemaObject\>\&) | Supprime un [XmlSchemaObject](../xmlschemaobject/) de la [XmlSchemaObjectCollection](./). |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Définir le n-ième argument de modèle comme un pointeur faible (plutôt que partagé). Permet de basculer les pointeurs dans les conteneurs en mode faible. |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)() | Initialise une nouvelle instance de la classe [XmlSchemaObjectCollection](./). |
| [XmlSchemaObjectCollection](./xmlschemaobjectcollection/)(const SharedPtr\<XmlSchemaObject\>\&) | Initialise une nouvelle instance de la classe [XmlSchemaObjectCollection](./) qui prend un [XmlSchemaObject](../xmlschemaobject/). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [CollectionBase](../../system.collections/collectionbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)

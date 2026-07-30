---
title: "classe System::Xml::XmlAttributeCollection"
linktitle: "Collection d'attributs XML"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlAttributeCollection class. Représente une collection d'attributs qui peuvent être accédés par nom ou par indice en C++."
type: docs
weight: 700
url: /fr/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


Représente une collection d'attributs qui peuvent être accédés par nom ou index.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | Insère l'attribut spécifié comme le dernier nœud de la collection. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | Copie tous les objets [XmlAttribute](../xmlattribute/) de cette collection dans le tableau fourni. |
| [idx_get](./idx_get/)(int32_t) | Renvoie l'attribut avec l'indice spécifié. |
| [idx_get](./idx_get/)(const String\&) | Renvoie l'attribut avec le nom spécifié. |
| [idx_get](./idx_get/)(const String\&, const String\&) | Renvoie l'attribut avec le nom local et l'Uniform Resource Identifier (URI) d'espace de noms spécifiés. |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Insère l'attribut spécifié immédiatement après l'attribut de référence spécifié. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Insère l'attribut spécifié immédiatement avant l'attribut de référence spécifié. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | Insère l'attribut spécifié comme le premier nœud de la collection. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | Supprime l'attribut spécifié de la collection. |
| [RemoveAll](./removeall/)() | Supprime tous les attributs de la collection. |
| [RemoveAt](./removeat/)(int32_t) | Supprime l'attribut correspondant à l'indice spécifié de la collection. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | Ajoute un [XmlNode](../xmlnode/) en utilisant le résultat de son [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

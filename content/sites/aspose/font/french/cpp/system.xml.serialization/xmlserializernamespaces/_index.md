---
title: "System::Xml::Serialization::XmlSerializerNamespaces classe"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces classe. Contient les espaces de noms XML et les préfixes que Serialization::XmlSerializer utilise pour générer des noms qualifiés dans une instance de document XML en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


Contient les espaces de noms XML et les préfixes que le [Serialization::XmlSerializer](../xmlserializer/) utilise pour générer des noms qualifiés dans une instance de document XML.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Ajoute une paire préfixe et espace de noms à un objet [Serialization::XmlSerializerNamespaces](./). |
| [get_Count](./get_count/)() | Renvoie le nombre de paires préfixe et espace de noms dans la collection. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | Renvoie le tableau des paires préfixe et espace de noms dans un objet [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | Initialise une nouvelle instance de la classe [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | Initialise une nouvelle instance de la classe [Serialization::XmlSerializerNamespaces](./), en utilisant l'instance spécifiée de **[XmlSerializerNamespaces](./)** contenant la collection de paires préfixe et espace de noms. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Initialise une nouvelle instance de la classe [Serialization::XmlSerializerNamespaces](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Font for C++](../../)

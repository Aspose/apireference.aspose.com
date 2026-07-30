---
title: "System::Xml::XmlElement classe"
linktitle: "XmlElement"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlElement classe. Représente un élément en C++."
type: docs
weight: 1700
url: /fr/cpp/system.xml/xmlelement/
---
## XmlElement class


Représente un élément.

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Renvoie une valeur **bool** indiquant si le nœud actuel possède des attributs. |
| [get_InnerText](./get_innertext/)() override | Renvoie les valeurs concaténées du nœud et de tous ses enfants. |
| [get_InnerXml](./get_innerxml/)() override | Renvoie le balisage représentant uniquement les enfants de ce nœud. |
| [get_IsEmpty](./get_isempty/)() | Renvoie le format de balise de l'élément. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud actuel. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Renvoie l'URI d'espace de noms de ce nœud. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Renvoie le [XmlDocument](../xmldocument/) auquel appartient ce nœud. |
| [get_Prefix](./get_prefix/)() override | Renvoie le préfixe d'espace de noms de ce nœud. |
| [get_SchemaInfo](./get_schemainfo/)() override | Renvoie l'ensemble d'informations post-validation de schéma qui a été attribué à ce nœud à la suite de la validation de schéma. |
| virtual [GetAttribute](./getattribute/)(String) | Renvoie la valeur de l'attribut avec le nom spécifié. |
| virtual [GetAttribute](./getattribute/)(String, String) | Renvoie la valeur de l'attribut avec le nom local et l'URI d'espace de noms spécifiés. |
| virtual [GetAttributeNode](./getattributenode/)(String) | Renvoie le [XmlAttribute](../xmlattribute/) avec le nom spécifié. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | Renvoie le [XmlAttribute](../xmlattribute/) avec le nom local et l'URI d'espace de noms spécifiés. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Renvoie une [XmlNodeList](../xmlnodelist/) contenant une liste de tous les éléments descendants correspondant au [XmlElement::get_Name](./get_name/) spécifié. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Renvoie une [XmlNodeList](../xmlnodelist/) contenant une liste de tous les éléments descendants correspondant aux valeurs [XmlElement::get_LocalName](./get_localname/) et [XmlElement::get_NamespaceURI](./get_namespaceuri/) spécifiées. |
| virtual [HasAttribute](./hasattribute/)(String) | Détermine si le nœud actuel possède un attribut avec le nom spécifié. |
| virtual [HasAttribute](./hasattribute/)(String, String) | Détermine si le nœud actuel possède un attribut avec le nom local et l'URI d'espace de noms spécifiés. |
| [RemoveAll](./removeall/)() override | Supprime tous les attributs et enfants spécifiés du nœud actuel. Les attributs par défaut ne sont pas supprimés. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | Supprime tous les attributs spécifiés de l'élément. Les attributs par défaut ne sont pas supprimés. |
| virtual [RemoveAttribute](./removeattribute/)(String) | Supprime un attribut par son nom. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | Supprime un attribut avec le nom local et l'URI d'espace de noms spécifiés. (Si l'attribut supprimé a une valeur par défaut, elle est immédiatement remplacée). |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | Supprime le nœud d'attribut avec l'index spécifié de l'élément. (Si l'attribut supprimé a une valeur par défaut, elle est immédiatement remplacée). |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | Supprime le [XmlAttribute](../xmlattribute/) spécifié. |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | Supprime le [XmlAttribute](../xmlattribute/) spécifié par le nom local et l'URI d'espace de noms. (Si l'attribut supprimé a une valeur par défaut, elle est immédiatement remplacée). |
| [set_InnerText](./set_innertext/)(String) override | Définit les valeurs concaténées du nœud et de tous ses enfants. |
| [set_InnerXml](./set_innerxml/)(String) override | Définit le balisage représentant uniquement les enfants de ce nœud. |
| [set_IsEmpty](./set_isempty/)(bool) | Définit le format de balise de l'élément. |
| [set_Prefix](./set_prefix/)(String) override | Définit le préfixe d'espace de noms de ce nœud. |
| virtual [SetAttribute](./setattribute/)(String, String) | Définit la valeur de l'attribut avec le nom spécifié. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | Définit la valeur de l'attribut avec le nom local et l'URI d'espace de noms spécifiés. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | Ajoute le [XmlAttribute](../xmlattribute/) spécifié. |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | Ajoute le [XmlAttribute](../xmlattribute/) spécifié. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre tous les enfants du nœud dans le [XmlWriter](../xmlwriter/) spécifié. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre le nœud actuel dans le [XmlWriter](../xmlwriter/) spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

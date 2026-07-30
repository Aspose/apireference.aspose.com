---
title: "System::Xml::XmlNamedNodeMap classe"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNamedNodeMap classe. Représente une collection de nœuds qui peuvent être accédés par nom ou indice en C++."
type: docs
weight: 2200
url: /fr/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


Représente une collection de nœuds qui peuvent être accédés par nom ou indice.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [begin](./begin/)() const | Obtient l'itérateur du premier élément de la collection. |
| [cbegin](./cbegin/)() const | Obtient l'itérateur du premier élément de la collection. |
| [cend](./cend/)() const | Obtient l'itérateur d'un élément inexistant situé après le dernier élément de la collection. |
| [end](./end/)() const | Obtient l'itérateur d'un élément inexistant situé après le dernier élément de la collection. |
| virtual [get_Count](./get_count/)() | Renvoie le nombre de nœuds dans le [XmlNamedNodeMap](./). |
| [GetEnumerator](./getenumerator/)() override | Fournit la prise en charge de l'itération sur la collection de nœuds du [XmlNamedNodeMap](./). |
| virtual [GetNamedItem](./getnameditem/)(String) | Récupère un [XmlNode](../xmlnode/) spécifié par son nom. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | Récupère un nœud dont les valeurs [XmlNode::get_LocalName](../xmlnode/get_localname/) et [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) correspondent. |
| virtual [Item](./item/)(int32_t) | Récupère le nœud à l'indice spécifié dans le [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String) | Supprime le nœud du [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | Supprime un nœud dont les valeurs [XmlNode::get_LocalName](../xmlnode/get_localname/) et [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) correspondent. |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | Ajoute un [XmlNode](../xmlnode/) en utilisant sa valeur [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [iterator](./iterator/) | Type d'itérateur. |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

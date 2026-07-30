---
title: "System::Xml::XPath::XPathNodeIterator classe"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XPath::XPathNodeIterator classe. Fournit un itérateur sur un ensemble sélectionné de nœuds en C++."
type: docs
weight: 600
url: /fr/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


Fournit un itérateur sur un ensemble sélectionné de nœuds.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Clone](./clone/)() | Lorsqu'il est remplacé dans une classe dérivée, renvoie un clone de cet objet [XPathNodeIterator](./). |
| virtual [get_Count](./get_count/)() | Renvoie l'index du dernier nœud dans l'ensemble sélectionné de nœuds. |
| virtual [get_Current](./get_current/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient l'objet [XPathNavigator](../xpathnavigator/) pour ce [XPathNodeIterator](./), positionné sur le nœud de contexte actuel. |
| virtual [get_CurrentPosition](./get_currentposition/)() | Lorsqu'il est remplacé dans une classe dérivée, obtient l'index de la position actuelle dans l'ensemble sélectionné de nœuds. |
| [GetEnumerator](./getenumerator/)() override | Renvoie un objet IEnumerator pour itérer à travers l'ensemble de nœuds sélectionné. |
| virtual [MoveNext](./movenext/)() | Lorsqu'il est remplacé dans une classe dérivée, déplace l'objet [XPathNavigator](../xpathnavigator/) renvoyé par la méthode [XPathNodeIterator::get_Current](./get_current/) vers le nœud suivant dans l'ensemble de nœuds sélectionné. |
| [XPathNodeIterator](./xpathnodeiterator/)() | Initialise une nouvelle instance de la classe [XPathNodeIterator](./). |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Voir aussi

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)

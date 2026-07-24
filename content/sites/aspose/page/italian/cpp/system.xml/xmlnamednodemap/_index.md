---
title: "Classe System::Xml::XmlNamedNodeMap"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Page per C++"
description: "Classe System::Xml::XmlNamedNodeMap. Rappresenta una collezione di nodi accessibili per nome o indice in C++."
type: docs
weight: 2200
url: /it/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


Rappresenta una raccolta di nodi che può essere accessibile per nome o indice.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [begin](./begin/)() const | Ottiene l'iteratore al primo elemento della collezione. |
| [cbegin](./cbegin/)() const | Ottiene l'iteratore al primo elemento della collezione. |
| [cend](./cend/)() const | Ottiene l'iteratore per un elemento inesistente situato dopo l'ultimo elemento della collezione. |
| [end](./end/)() const | Ottiene l'iteratore per un elemento inesistente situato dopo l'ultimo elemento della collezione. |
| virtual [get_Count](./get_count/)() | Restituisce il numero di nodi nel [XmlNamedNodeMap](./). |
| [GetEnumerator](./getenumerator/)() override | Fornisce il supporto per l'iterazione sulla collezione di nodi nel [XmlNamedNodeMap](./). |
| virtual [GetNamedItem](./getnameditem/)(String) | Recupera un [XmlNode](../xmlnode/) specificato per nome. |
| virtual [GetNamedItem](./getnameditem/)(String, String) | Recupera un nodo con i valori corrispondenti di [XmlNode::get_LocalName](../xmlnode/get_localname/) e [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [Item](./item/)(int32_t) | Recupera il nodo all'indice specificato nella [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String) | Rimuove il nodo dalla [XmlNamedNodeMap](./). |
| virtual [RemoveNamedItem](./removenameditem/)(String, String) | Rimuove un nodo con i valori corrispondenti di [XmlNode::get_LocalName](../xmlnode/get_localname/) e [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) | Aggiunge un [XmlNode](../xmlnode/) utilizzando il suo valore [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [iterator](./iterator/) | Tipo di iteratore. |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)

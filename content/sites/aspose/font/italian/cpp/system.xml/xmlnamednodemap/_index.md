---
title: "Classe System::Xml::XmlNamedNodeMap"
linktitle: "XmlNamedNodeMap"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlNamedNodeMap. Rappresenta una raccolta di nodi accessibili per nome o indice in C++."
type: docs
weight: 2200
url: /it/cpp/system.xml/xmlnamednodemap/
---
## XmlNamedNodeMap class


Rappresenta una raccolta di nodi a cui è possibile accedere per nome o indice.

```cpp
class XmlNamedNodeMap : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [begin](./begin/)() const | Ottiene l'iteratore al primo elemento della raccolta. |
| [cbegin](./cbegin/)() const | Ottiene l'iteratore al primo elemento della raccolta. |
| [cend](./cend/)() const | Ottiene l'iteratore per un elemento inesistente dopo l'ultimo elemento della raccolta. |
| [end](./end/)() const | Ottiene l'iteratore per un elemento inesistente dopo l'ultimo elemento della raccolta. |
| virtual [get_Count](./get_count/)() | Restituisce il numero di nodi nella [XmlNamedNodeMap](./). |
| [GetEnumerator](./getenumerator/)() override | Fornisce supporto per l'iterazione sulla raccolta di nodi nella [XmlNamedNodeMap](./). |
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



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

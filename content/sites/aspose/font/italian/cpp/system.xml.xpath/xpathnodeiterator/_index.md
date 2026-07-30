---
title: "System::Xml::XPath::XPathNodeIterator class"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Font per C++"
description: "System::Xml::XPath::XPathNodeIterator class. Fornisce un iteratore su un insieme selezionato di nodi in C++."
type: docs
weight: 600
url: /it/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


Fornisce un iteratore su un insieme selezionato di nodi.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Clone](./clone/)() | Quando sovrascritto in una classe derivata, restituisce un clone di questo oggetto [XPathNodeIterator](./). |
| virtual [get_Count](./get_count/)() | Restituisce l'indice dell'ultimo nodo nell'insieme selezionato di nodi. |
| virtual [get_Current](./get_current/)() | Quando sovrascritto in una classe derivata, ottiene l'oggetto [XPathNavigator](../xpathnavigator/) per questo [XPathNodeIterator](./), posizionato sul nodo di contesto corrente. |
| virtual [get_CurrentPosition](./get_currentposition/)() | Quando sovrascritto in una classe derivata, ottiene l'indice della posizione corrente nell'insieme selezionato di nodi. |
| [GetEnumerator](./getenumerator/)() override | Restituisce un oggetto IEnumerator per iterare attraverso l'insieme di nodi selezionato. |
| virtual [MoveNext](./movenext/)() | Quando sovrascritto in una classe derivata, sposta l'oggetto [XPathNavigator](../xpathnavigator/) restituito dal metodo [XPathNodeIterator::get_Current](./get_current/) al nodo successivo nell'insieme di nodi selezionato. |
| [XPathNodeIterator](./xpathnodeiterator/)() | Inizializza una nuova istanza della classe [XPathNodeIterator](./). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)

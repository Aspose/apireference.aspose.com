---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlAttributeCollection class. Rappresenta una raccolta di attributi che può essere accessibile per nome o indice in C++."
type: docs
weight: 700
url: /it/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


Rappresenta una collezione di attributi accessibili per nome o indice.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | Inserisce l'attributo specificato come ultimo nodo nella raccolta. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | Copia tutti gli oggetti [XmlAttribute](../xmlattribute/) da questa raccolta nell'array fornito. |
| [idx_get](./idx_get/)(int32_t) | Restituisce l'attributo con l'indice specificato. |
| [idx_get](./idx_get/)(const String\&) | Restituisce l'attributo con il nome specificato. |
| [idx_get](./idx_get/)(const String\&, const String\&) | Restituisce l'attributo con il nome locale e lo spazio dei nomi Uniform Resource Identifier (URI) specificati. |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Inserisce l'attributo specificato immediatamente dopo l'attributo di riferimento specificato. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Inserisce l'attributo specificato immediatamente prima dell'attributo di riferimento specificato. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | Inserisce l'attributo specificato come primo nodo nella raccolta. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | Rimuove l'attributo specificato dalla raccolta. |
| [RemoveAll](./removeall/)() | Rimuove tutti gli attributi dalla raccolta. |
| [RemoveAt](./removeat/)(int32_t) | Rimuove l'attributo corrispondente all'indice specificato dalla raccolta. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | Aggiunge un [XmlNode](../xmlnode/) usando il risultato di [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

---
title: "Classe System::Xml::XmlDocumentFragment"
linktitle: "XmlDocumentFragment"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlDocumentFragment. Rappresenta un oggetto leggero utile per operazioni di inserimento dell'albero in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml/xmldocumentfragment/
---
## XmlDocumentFragment class


Rappresenta un oggetto leggero utile per le operazioni di inserimento nell'albero.

```cpp
class XmlDocumentFragment : public System::Xml::XmlNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_InnerXml](./get_innerxml/)() override | Restituisce il markup che rappresenta i figli di questo nodo. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Restituisce il [XmlDocument](../xmldocument/) a cui appartiene questo nodo. |
| [set_InnerXml](./set_innerxml/)(String) override | Imposta il markup che rappresenta i figli di questo nodo. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva tutti i figli del nodo nello [XmlWriter](../xmlwriter/) specificato. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Salva il nodo nello [XmlWriter](../xmlwriter/) specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

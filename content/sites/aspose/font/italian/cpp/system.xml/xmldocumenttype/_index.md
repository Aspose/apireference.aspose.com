---
title: "System::Xml::XmlDocumentType classe"
linktitle: "XmlDocumentType"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlDocumentType classe. Rappresenta la dichiarazione del tipo di documento in C++."
type: docs
weight: 1600
url: /it/cpp/system.xml/xmldocumenttype/
---
## XmlDocumentType class


Rappresenta la dichiarazione del tipo di documento.

```cpp
class XmlDocumentType : public System::Xml::XmlLinkedNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_Entities](./get_entities/)() | Restituisce la raccolta dei nodi [XmlEntity](../xmlentity/) dichiarati nella dichiarazione del tipo di documento. |
| [get_InternalSubset](./get_internalsubset/)() | Restituisce il valore del sottoinsieme interno della definizione del tipo di documento (DTD) nella dichiarazione DOCTYPE. |
| [get_IsReadOnly](./get_isreadonly/)() override | Restituisce un valore che indica se il nodo è di sola lettura. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_Notations](./get_notations/)() | Restituisce la raccolta dei nodi [XmlNotation](../xmlnotation/) presenti nella dichiarazione del tipo di documento. |
| [get_PublicId](./get_publicid/)() | Restituisce il valore dell'identificatore pubblico nella dichiarazione DOCTYPE. |
| [get_SystemId](./get_systemid/)() | Restituisce il valore dell'identificatore di sistema nella dichiarazione DOCTYPE. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva tutti i figli del nodo nel [XmlWriter](../xmlwriter/) specificato. Per i nodi [XmlDocumentType](./), questo metodo non ha effetto. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Salva il nodo nello [XmlWriter](../xmlwriter/) specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlLinkedNode](../xmllinkednode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

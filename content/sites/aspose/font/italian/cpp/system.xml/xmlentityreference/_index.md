---
title: "Classe System::Xml::XmlEntityReference"
linktitle: "XmlEntityReference"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlEntityReference. Rappresenta un nodo di riferimento a un'entità in C++."
type: docs
weight: 1900
url: /it/cpp/system.xml/xmlentityreference/
---
## XmlEntityReference class


Rappresenta un nodo di riferimento di entità.

```cpp
class XmlEntityReference : public System::Xml::XmlLinkedNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_BaseURI](./get_baseuri/)() override | Restituisce l'Uniform Resource Identifier (URI) di base del nodo corrente. |
| [get_IsReadOnly](./get_isreadonly/)() override | Restituisce un valore che indica se il nodo è di sola lettura. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo. |
| [get_Value](./get_value/)() override | Restituisce il valore del nodo. |
| [set_Value](./set_value/)(String) override | Imposta il valore del nodo. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva tutti i figli del nodo nello [XmlWriter](../xmlwriter/) specificato. |
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

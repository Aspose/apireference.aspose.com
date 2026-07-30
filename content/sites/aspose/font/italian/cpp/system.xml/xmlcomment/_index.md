---
title: "Classe System::Xml::XmlComment"
linktitle: "XmlComment"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlComment. Rappresenta il contenuto di un commento XML in C++."
type: docs
weight: 1100
url: /it/cpp/system.xml/xmlcomment/
---
## XmlComment class


Rappresenta il contenuto di un commento XML.

```cpp
class XmlComment : public System::Xml::XmlCharacterData
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva tutti i figli del nodo nello [XmlWriter](../xmlwriter/) specificato. Poiché i nodi commento non hanno figli, questo metodo non ha alcun effetto. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Salva il nodo nello [XmlWriter](../xmlwriter/) specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

---
title: "classe System::Xml::XmlCDataSection"
linktitle: "XmlCDataSection"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::XmlCDataSection. Rappresenta una sezione CDATA in C++."
type: docs
weight: 800
url: /it/cpp/system.xml/xmlcdatasection/
---
## XmlCDataSection class


Rappresenta una sezione CDATA.

```cpp
class XmlCDataSection : public System::Xml::XmlCharacterData
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_PreviousText](./get_previoustext/)() override | Restituisce il nodo di testo che precede immediatamente questo nodo. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva i figli del nodo nello [XmlWriter](../xmlwriter/) specificato. |
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

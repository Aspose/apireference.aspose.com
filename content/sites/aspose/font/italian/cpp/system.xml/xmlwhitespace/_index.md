---
title: "Classe System::Xml::XmlWhitespace"
linktitle: "XmlWhitespace"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlWhitespace. Rappresenta gli spazi bianchi nel contenuto degli elementi in C++."
type: docs
weight: 4300
url: /it/cpp/system.xml/xmlwhitespace/
---
## XmlWhitespace class


Rappresenta gli spazi bianchi nel contenuto dell'elemento.

```cpp
class XmlWhitespace : public System::Xml::XmlCharacterData
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo. |
| [get_PreviousText](./get_previoustext/)() override | Restituisce il nodo di testo che precede immediatamente questo nodo. |
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

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

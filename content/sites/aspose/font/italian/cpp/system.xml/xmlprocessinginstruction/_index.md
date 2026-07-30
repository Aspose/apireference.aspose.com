---
title: "System::Xml::XmlProcessingInstruction classe"
linktitle: "XmlProcessingInstruction"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlProcessingInstruction classe. Rappresenta un'istruzione di elaborazione, che XML definisce per conservare informazioni specifiche del processore nel testo del documento in C++."
type: docs
weight: 3100
url: /it/cpp/system.xml/xmlprocessinginstruction/
---
## XmlProcessingInstruction class


Rappresenta un'istruzione di elaborazione, che XML definisce per mantenere informazioni specifiche del processore nel testo del documento.

```cpp
class XmlProcessingInstruction : public System::Xml::XmlLinkedNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_Data](./get_data/)() | Restituisce il contenuto dell'istruzione di elaborazione, escludendo il target. |
| [get_InnerText](./get_innertext/)() override | Restituisce i valori concatenati del nodo e di tutti i suoi figli. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_Target](./get_target/)() | Restituisce il target dell'istruzione di elaborazione. |
| [get_Value](./get_value/)() override | Restituisce il valore del nodo. |
| [set_Data](./set_data/)(const String\&) | Imposta il contenuto dell'istruzione di elaborazione, escludendo il target. |
| [set_InnerText](./set_innertext/)(String) override | Imposta i valori concatenati del nodo e di tutti i suoi figli. |
| [set_Value](./set_value/)(String) override | Imposta il valore del nodo. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva tutti i figli del nodo nello [XmlWriter](../xmlwriter/) specificato. Poiché i nodi ProcessingInstruction non hanno figli, questo metodo non ha effetto. |
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

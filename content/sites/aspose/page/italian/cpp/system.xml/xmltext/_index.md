---
title: "System::Xml::XmlText classe"
linktitle: "XmlText"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlText classe. Rappresenta il contenuto testuale di un elemento o attributo in C++."
type: docs
weight: 3800
url: /it/cpp/system.xml/xmltext/
---
## XmlText class


Rappresenta il contenuto testuale di un elemento o attributo.

```cpp
class XmlText : public System::Xml::XmlCharacterData
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_PreviousText](./get_previoustext/)() override | Restituisce il nodo di testo che precede immediatamente questo nodo. |
| [get_Value](./get_value/)() override | Restituisce il valore del nodo. |
| [set_Value](./set_value/)(String) override | Imposta il valore del nodo. |
| virtual [SplitText](./splittext/)(int32_t) | Divide il nodo in due nodi all'offset specificato, mantenendo entrambi nell'albero come fratelli. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva tutti i figli del nodo nel [XmlWriter](../xmlwriter/) specificato. I nodi [XmlText](./) non hanno figli, quindi questo metodo non ha effetto. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Salva il nodo nel [XmlWriter](../xmlwriter/) specificato. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Osservazioni



Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai istanze di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o errori di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

## Vedi anche

* Class [XmlCharacterData](../xmlcharacterdata/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)

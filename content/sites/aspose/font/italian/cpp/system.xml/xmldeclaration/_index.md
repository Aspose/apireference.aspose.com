---
title: "classe System::Xml::XmlDeclaration"
linktitle: "XmlDeclaration"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::XmlDeclaration. Rappresenta il nodo di dichiarazione XML <?xml version=''1.0''...?> in C++."
type: docs
weight: 1300
url: /it/cpp/system.xml/xmldeclaration/
---
## XmlDeclaration class


Rappresenta il nodo di dichiarazione XML **<?xml version='1.0'...?>**.

```cpp
class XmlDeclaration : public System::Xml::XmlLinkedNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_Encoding](./get_encoding/)() | Restituisce il livello di codifica del documento XML. |
| [get_InnerText](./get_innertext/)() override | Restituisce i valori concatenati del [XmlDeclaration](./). |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_Standalone](./get_standalone/)() | Restituisce il valore dell'attributo standalone. |
| [get_Value](./get_value/)() override | Restituisce il valore del [XmlDeclaration](./). |
| [get_Version](./get_version/)() | Restituisce la versione XML del documento. |
| [set_Encoding](./set_encoding/)(const String\&) | Imposta il livello di codifica del documento XML. |
| [set_InnerText](./set_innertext/)(String) override | Imposta i valori concatenati del [XmlDeclaration](./). |
| [set_Standalone](./set_standalone/)(const String\&) | Imposta il valore dell'attributo standalone. |
| [set_Value](./set_value/)(String) override | Imposta il valore del [XmlDeclaration](./). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva i figli del nodo nel [XmlWriter](../xmlwriter/) specificato. Poiché i nodi [XmlDeclaration](./) non hanno figli, questo metodo non ha alcun effetto. |
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

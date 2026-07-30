---
title: "Classe System::Xml::XmlNotation"
linktitle: "XmlNotation"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlNotation. Rappresenta una dichiarazione di notazione, come <!NOTATION... > in C++."
type: docs
weight: 2900
url: /it/cpp/system.xml/xmlnotation/
---
## XmlNotation class


Rappresenta una dichiarazione di notazione, come **<!NOTATION... >**.

```cpp
class XmlNotation : public System::Xml::XmlNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. I nodi di notazione non possono essere clonati. Chiamare questo metodo su un oggetto [XmlNotation](./) genera un'eccezione. |
| [get_InnerXml](./get_innerxml/)() override | Restituisce il markup che rappresenta i figli di questo nodo. |
| [get_IsReadOnly](./get_isreadonly/)() override | Restituisce un valore che indica se il nodo è di sola lettura. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome del nodo corrente senza il prefisso dello spazio dei nomi. |
| [get_Name](./get_name/)() override | Restituisce il nome del nodo corrente. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_OuterXml](./get_outerxml/)() override | Restituisce il markup che rappresenta questo nodo e tutti i suoi figli. |
| [get_PublicId](./get_publicid/)() | Restituisce il valore dell'identificatore pubblico nella dichiarazione di notazione. |
| [get_SystemId](./get_systemid/)() | Restituisce il valore dell'identificatore di sistema nella dichiarazione di notazione. |
| [set_InnerXml](./set_innerxml/)(String) override | Imposta il markup che rappresenta i figli di questo nodo. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva i figli del nodo nel [XmlWriter](../xmlwriter/) specificato. Questo metodo non ha effetto sui nodi [XmlNotation](./). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Salva il nodo nel [XmlWriter](../xmlwriter/) specificato. Questo metodo non ha effetto sui nodi [XmlNotation](./). |
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

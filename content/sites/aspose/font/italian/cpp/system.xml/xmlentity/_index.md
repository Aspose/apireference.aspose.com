---
title: "Classe System::Xml::XmlEntity"
linktitle: "XmlEntity"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlEntity. Rappresenta una dichiarazione di entità, come <!ENTITY... > in C++."
type: docs
weight: 1800
url: /it/cpp/system.xml/xmlentity/
---
## XmlEntity class


Rappresenta una dichiarazione di entità, come **<!ENTITY... >**.

```cpp
class XmlEntity : public System::Xml::XmlNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. I nodi di entità non possono essere clonati. Chiamare questo metodo su un oggetto [XmlEntity](./) genera un'eccezione. |
| [get_BaseURI](./get_baseuri/)() override | Restituisce l'Uniform Resource Identifier (URI) di base del nodo corrente. |
| [get_InnerText](./get_innertext/)() override | Restituisce i valori concatenati del nodo entità e di tutti i suoi figli. |
| [get_InnerXml](./get_innerxml/)() override | Restituisce il markup che rappresenta i figli di questo nodo. |
| [get_IsReadOnly](./get_isreadonly/)() override | Restituisce un valore che indica se il nodo è di sola lettura. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome del nodo senza il prefisso del namespace. |
| [get_Name](./get_name/)() override | Restituisce il nome del nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo. |
| [get_NotationName](./get_notationname/)() | Restituisce il nome dell'attributo opzionale NDATA nella dichiarazione dell'entità. |
| [get_OuterXml](./get_outerxml/)() override | Restituisce il markup che rappresenta questo nodo e tutti i suoi figli. |
| [get_PublicId](./get_publicid/)() | Restituisce il valore dell'identificatore pubblico nella dichiarazione dell'entità. |
| [get_SystemId](./get_systemid/)() | Restituisce il valore dell'identificatore di sistema nella dichiarazione dell'entità. |
| [set_InnerText](./set_innertext/)(String) override | Imposta i valori concatenati del nodo entità e di tutti i suoi figli. |
| [set_InnerXml](./set_innerxml/)(String) override | Imposta il markup che rappresenta i figli di questo nodo. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva tutti i figli del nodo nello [XmlWriter](../xmlwriter/) specificato. Per i nodi [XmlEntity](./), questo metodo non ha effetto. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Salva il nodo nello [XmlWriter](../xmlwriter/) specificato. Per i nodi [XmlEntity](./), questo metodo non ha effetto. |
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

---
title: "classe System::Xml::XmlElement"
linktitle: "XmlElement"
second_title: "Aspose.Font per C++"
description: "classe System::Xml::XmlElement. Rappresenta un elemento in C++."
type: docs
weight: 1700
url: /it/cpp/system.xml/xmlelement/
---
## XmlElement class


Rappresenta un elemento.

```cpp
class XmlElement : public System::Xml::XmlLinkedNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| virtual [get_HasAttributes](./get_hasattributes/)() | Restituisce un valore **bool** che indica se il nodo corrente ha attributi. |
| [get_InnerText](./get_innertext/)() override | Restituisce i valori concatenati del nodo e di tutti i suoi figli. |
| [get_InnerXml](./get_innerxml/)() override | Restituisce il markup che rappresenta solo i figli di questo nodo. |
| [get_IsEmpty](./get_isempty/)() | Restituisce il formato del tag dell'elemento. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo corrente. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Restituisce l'URI dello spazio dei nomi di questo nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Restituisce il [XmlDocument](../xmldocument/) a cui appartiene questo nodo. |
| [get_Prefix](./get_prefix/)() override | Restituisce il prefisso dello spazio dei nomi di questo nodo. |
| [get_SchemaInfo](./get_schemainfo/)() override | Restituisce l'infoset post-validazione dello schema che è stato assegnato a questo nodo a seguito della validazione dello schema. |
| virtual [GetAttribute](./getattribute/)(String) | Restituisce il valore dell'attributo con il nome specificato. |
| virtual [GetAttribute](./getattribute/)(String, String) | Restituisce il valore dell'attributo con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [GetAttributeNode](./getattributenode/)(String) | Restituisce il [XmlAttribute](../xmlattribute/) con il nome specificato. |
| virtual [GetAttributeNode](./getattributenode/)(String, String) | Restituisce il [XmlAttribute](../xmlattribute/) con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Restituisce un [XmlNodeList](../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono al [XmlElement::get_Name](./get_name/) specificato. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Restituisce un [XmlNodeList](../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono ai valori [XmlElement::get_LocalName](./get_localname/) e [XmlElement::get_NamespaceURI](./get_namespaceuri/) specificati. |
| virtual [HasAttribute](./hasattribute/)(String) | Determina se il nodo corrente ha un attributo con il nome specificato. |
| virtual [HasAttribute](./hasattribute/)(String, String) | Determina se il nodo corrente ha un attributo con il nome locale e l'URI dello spazio dei nomi specificati. |
| [RemoveAll](./removeall/)() override | Rimuove tutti gli attributi e i figli specificati del nodo corrente. Gli attributi predefiniti non vengono rimossi. |
| virtual [RemoveAllAttributes](./removeallattributes/)() | Rimuove tutti gli attributi specificati dall'elemento. Gli attributi predefiniti non vengono rimossi. |
| virtual [RemoveAttribute](./removeattribute/)(String) | Rimuove un attributo per nome. |
| virtual [RemoveAttribute](./removeattribute/)(String, String) | Rimuove un attributo con il nome locale e l'URI dello spazio dei nomi specificati. (Se l'attributo rimosso ha un valore predefinito, viene immediatamente sostituito). |
| virtual [RemoveAttributeAt](./removeattributeat/)(int32_t) | Rimuove il nodo attributo con l'indice specificato dall'elemento. (Se l'attributo rimosso ha un valore predefinito, viene immediatamente sostituito). |
| virtual [RemoveAttributeNode](./removeattributenode/)(SharedPtr\<XmlAttribute\>) | Rimuove il [XmlAttribute](../xmlattribute/) specificato. |
| virtual [RemoveAttributeNode](./removeattributenode/)(String, String) | Rimuove il [XmlAttribute](../xmlattribute/) specificato dal nome locale e dall'URI dello spazio dei nomi. (Se l'attributo rimosso ha un valore predefinito, viene immediatamente sostituito). |
| [set_InnerText](./set_innertext/)(String) override | Imposta i valori concatenati del nodo e di tutti i suoi figli. |
| [set_InnerXml](./set_innerxml/)(String) override | Imposta il markup che rappresenta solo i figli di questo nodo. |
| [set_IsEmpty](./set_isempty/)(bool) | Imposta il formato del tag dell'elemento. |
| [set_Prefix](./set_prefix/)(String) override | Imposta il prefisso dello spazio dei nomi di questo nodo. |
| virtual [SetAttribute](./setattribute/)(String, String) | Imposta il valore dell'attributo con il nome specificato. |
| virtual [SetAttribute](./setattribute/)(String, String, String) | Imposta il valore dell'attributo con il nome locale e l'URI dello spazio dei nomi specificati. |
| virtual [SetAttributeNode](./setattributenode/)(SharedPtr\<XmlAttribute\>) | Aggiunge il [XmlAttribute](../xmlattribute/) specificato. |
| virtual [SetAttributeNode](./setattributenode/)(String, String) | Aggiunge il [XmlAttribute](../xmlattribute/) specificato. |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva tutti i figli del nodo nello [XmlWriter](../xmlwriter/) specificato. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Salva il nodo corrente nel [XmlWriter](../xmlwriter/) specificato. |
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

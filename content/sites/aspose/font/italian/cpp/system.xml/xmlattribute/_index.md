---
title: "System::Xml::XmlAttribute classe"
linktitle: "XmlAttribute"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlAttribute classe. Rappresenta un attributo. I valori validi e predefiniti per l'attributo sono definiti in una definizione di tipo documento (DTD) o schema in C++."
type: docs
weight: 600
url: /it/cpp/system.xml/xmlattribute/
---
## XmlAttribute class


Rappresenta un attributo. I valori validi e predefiniti per l'attributo sono definiti in una definizione di tipo documento (DTD) o in uno schema.

```cpp
class XmlAttribute : public System::Xml::XmlNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) override | Aggiunge il nodo specificato alla fine dell'elenco dei nodi figlio di questo nodo. |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [get_BaseURI](./get_baseuri/)() override | Restituisce l'Uniform Resource Identifier (URI) di base del nodo. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NamespaceURI](./get_namespaceuri/)() override | Restituisce l'URI dello spazio dei nomi di questo nodo. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Restituisce il [XmlDocument](../xmldocument/) a cui appartiene questo nodo. |
| virtual [get_OwnerElement](./get_ownerelement/)() | Restituisce l'[XmlElement](../xmlelement/) a cui appartiene l'attributo. |
| [get_Prefix](./get_prefix/)() override | Restituisce il prefisso dello spazio dei nomi di questo nodo. |
| [get_SchemaInfo](./get_schemainfo/)() override | Restituisce il post-schema-validation-infoset che è stato assegnato a questo nodo come risultato della convalida dello schema. |
| virtual [get_Specified](./get_specified/)() | Restituisce un valore che indica se il valore dell'attributo è stato impostato esplicitamente. |
| [get_Value](./get_value/)() override | Restituisce il valore del nodo. |
| [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Inserisce il nodo specificato immediatamente dopo il nodo di riferimento specificato. |
| [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Inserisce il nodo specificato immediatamente prima del nodo di riferimento specificato. |
| [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) override | Aggiunge il nodo specificato all'inizio dell'elenco dei nodi figlio per questo nodo. |
| [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) override | Rimuove il nodo figlio specificato. |
| [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) override | Sostituisce il nodo figlio specificato con il nuovo nodo figlio specificato. |
| [set_InnerText](./set_innertext/)(String) override | Imposta i valori concatenati del nodo e di tutti i suoi figli. |
| [set_InnerXml](./set_innerxml/)(String) override | Imposta il valore dell'attributo. |
| [set_Prefix](./set_prefix/)(String) override | Imposta il prefisso dello spazio dei nomi di questo nodo. |
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

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

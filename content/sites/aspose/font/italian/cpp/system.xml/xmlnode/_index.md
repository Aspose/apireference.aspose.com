---
title: "Classe System::Xml::XmlNode"
linktitle: "XmlNode"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlNode. Rappresenta un singolo nodo nel documento XML in C++."
type: docs
weight: 2500
url: /it/cpp/system.xml/xmlnode/
---
## XmlNode class


Rappresenta un singolo nodo nel documento XML.

```cpp
class XmlNode : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                public System::Xml::XPath::IXPathNavigable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [AppendChild](./appendchild/)(SharedPtr\<XmlNode\>) | Aggiunge il nodo specificato alla fine dell'elenco dei nodi figlio di questo nodo. |
| virtual [Clone](./clone/)() | Crea un duplicato di questo nodo. |
| virtual [CloneNode](./clonenode/)(bool) | Crea un duplicato del nodo, quando sovrascritto in una classe derivata. |
| [CreateNavigator](./createnavigator/)() override | Crea un XPathNavigator per navigare questo oggetto. |
| virtual [get_Attributes](./get_attributes/)() | Restituisce una [XmlAttributeCollection](../xmlattributecollection/) contenente gli attributi di questo nodo. |
| virtual [get_BaseURI](./get_baseuri/)() | Restituisce l'URI di base del nodo corrente. |
| virtual [get_ChildNodes](./get_childnodes/)() | Restituisce tutti i nodi figlio del nodo. |
| virtual [get_FirstChild](./get_firstchild/)() | Restituisce il primo figlio del nodo. |
| virtual [get_HasChildNodes](./get_haschildnodes/)() | Restituisce un valore che indica se questo nodo ha dei nodi figlio. |
| virtual [get_InnerText](./get_innertext/)() | Restituisce i valori concatenati del nodo e di tutti i suoi nodi figlio. |
| virtual [get_InnerXml](./get_innerxml/)() | Restituisce il markup che rappresenta solo i nodi figlio di questo nodo. |
| virtual [get_IsReadOnly](./get_isreadonly/)() | Restituisce un valore che indica se il nodo è di sola lettura. |
| virtual [get_LastChild](./get_lastchild/)() | Restituisce l'ultimo figlio del nodo. |
| virtual [get_LocalName](./get_localname/)() | Restituisce il nome locale del nodo, quando sovrascritto in una classe derivata. |
| virtual [get_Name](./get_name/)() | Restituisce il nome qualificato del nodo, quando sovrascritto in una classe derivata. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | Restituisce l'URI dello spazio dei nomi di questo nodo. |
| virtual [get_NextSibling](./get_nextsibling/)() | Restituisce il nodo immediatamente successivo a questo nodo. |
| virtual [get_NodeType](./get_nodetype/)() | Restituisce il tipo del nodo corrente, quando sovrascritto in una classe derivata. |
| virtual [get_OuterXml](./get_outerxml/)() | Restituisce il markup contenente questo nodo e tutti i suoi nodi figlio. |
| virtual [get_OwnerDocument](./get_ownerdocument/)() | Restituisce il [XmlDocument](../xmldocument/) a cui appartiene questo nodo. |
| virtual [get_ParentNode](./get_parentnode/)() | Restituisce il genitore di questo nodo (per i nodi che possono avere genitori). |
| virtual [get_Prefix](./get_prefix/)() | Restituisce il prefisso dello spazio dei nomi di questo nodo. |
| virtual [get_PreviousSibling](./get_previoussibling/)() | Restituisce il nodo immediatamente precedente a questo nodo. |
| virtual [get_PreviousText](./get_previoustext/)() | Restituisce il nodo di testo che precede immediatamente questo nodo. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | Restituisce l'infoset post-validazione dello schema che è stato assegnato a questo nodo a seguito della validazione dello schema. |
| virtual [get_Value](./get_value/)() | Restituisce il valore del nodo. |
| [GetEnumerator](./getenumerator/)() override | Restituisce un enumeratore che itera attraverso i nodi figlio nel nodo corrente. |
| virtual [GetNamespaceOfPrefix](./getnamespaceofprefix/)(String) | Cerca la dichiarazione **xmlns** più vicina per il prefisso fornito che è in ambito per il nodo corrente e restituisce l'URI dello spazio dei nomi nella dichiarazione. |
| virtual [GetPrefixOfNamespace](./getprefixofnamespace/)(String) | Cerca la dichiarazione **xmlns** più vicina per l'URI dello spazio dei nomi fornito che è in ambito per il nodo corrente e restituisce il prefisso definito in quella dichiarazione. |
| virtual [idx_get](./idx_get/)(String) | Restituisce il primo elemento figlio con il [XmlNode::get_Name](./get_name/) specificato. |
| virtual [idx_get](./idx_get/)(String, String) | Restituisce il primo elemento figlio con i valori [XmlNode::get_LocalName](./get_localname/) e [XmlNode::get_NamespaceURI](./get_namespaceuri/) specificati. |
| virtual [InsertAfter](./insertafter/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Inserisce il nodo specificato immediatamente dopo il nodo di riferimento specificato. |
| virtual [InsertBefore](./insertbefore/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Inserisce il nodo specificato immediatamente prima del nodo di riferimento specificato. |
| virtual [Normalize](./normalize/)() | Colloca tutti i nodi [XmlText](../xmltext/) nella profondità completa del sotto-albero sotto questo [XmlNode](./) in una forma "normale" dove solo il markup (cioè tag, commenti, istruzioni di elaborazione, sezioni CDATA e riferimenti a entità) separa i nodi [XmlText](../xmltext/), ovvero non ci sono nodi [XmlText](../xmltext/) adiacenti. |
| virtual [PrependChild](./prependchild/)(SharedPtr\<XmlNode\>) | Aggiunge il nodo specificato all'inizio dell'elenco dei nodi figlio per questo nodo. |
| virtual [RemoveAll](./removeall/)() | Rimuove tutti i nodi figlio e/o gli attributi del nodo corrente. |
| virtual [RemoveChild](./removechild/)(SharedPtr\<XmlNode\>) | Rimuove il nodo figlio specificato. |
| virtual [ReplaceChild](./replacechild/)(SharedPtr\<XmlNode\>, SharedPtr\<XmlNode\>) | Sostituisce il nodo figlio **oldChild** con il nodo **newChild**. |
| [SelectNodes](./selectnodes/)(const String\&) | Seleziona un elenco di nodi che corrispondono all'espressione [XPath](../../system.xml.xpath/). |
| [SelectNodes](./selectnodes/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Seleziona un elenco di nodi che corrispondono all'espressione [XPath](../../system.xml.xpath/). Qualsiasi prefisso trovato nell'espressione [XPath](../../system.xml.xpath/) viene risolto utilizzando il [XmlNamespaceManager](../xmlnamespacemanager/) fornito. |
| [SelectSingleNode](./selectsinglenode/)(const String\&) | Seleziona il primo [XmlNode](./) che corrisponde all'espressione [XPath](../../system.xml.xpath/). |
| [SelectSingleNode](./selectsinglenode/)(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) | Seleziona il primo [XmlNode](./) che corrisponde all'espressione [XPath](../../system.xml.xpath/). Qualsiasi prefisso trovato nell'espressione [XPath](../../system.xml.xpath/) viene risolto utilizzando il [XmlNamespaceManager](../xmlnamespacemanager/) fornito. |
| virtual [set_InnerText](./set_innertext/)(String) | Imposta i valori concatenati del nodo e di tutti i suoi nodi figlio. |
| virtual [set_InnerXml](./set_innerxml/)(String) | Imposta il markup che rappresenta solo i nodi figlio di questo nodo. |
| virtual [set_Prefix](./set_prefix/)(String) | Imposta il prefisso dello spazio dei nomi di questo nodo. |
| virtual [set_Value](./set_value/)(String) | Imposta il valore del nodo. |
| virtual [Supports](./supports/)(String, String) | Verifica se l'implementazione DOM implementa una funzionalità specifica. |
| virtual [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) | Salva tutti i nodi figlio del nodo nello [XmlWriter](../xmlwriter/) specificato, quando sovrascritto in una classe derivata. |
| virtual [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) | Salva il nodo corrente nello [XmlWriter](../xmlwriter/) specificato, quando sovrascritto in una classe derivata. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [Ptr](./ptr/) | Un alias per un puntatore condiviso a un'istanza di questa classe. |
## Vedi anche

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IXPathNavigable](../../system.xml.xpath/ixpathnavigable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

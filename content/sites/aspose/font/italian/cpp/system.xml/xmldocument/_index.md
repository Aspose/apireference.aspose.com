---
title: "Classe System::Xml::XmlDocument"
linktitle: "XmlDocument"
second_title: "Aspose.Font per C++"
description: "Classe System::Xml::XmlDocument. Rappresenta un documento XML. È possibile utilizzare questa classe per caricare, convalidare, modificare, aggiungere e posizionare XML in un documento in C++."
type: docs
weight: 1400
url: /it/cpp/system.xml/xmldocument/
---
## XmlDocument class


Rappresenta un documento XML. È possibile utilizzare questa classe per caricare, convalidare, modificare, aggiungere e posizionare XML in un documento.

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crea un duplicato di questo nodo. |
| [CreateAttribute](./createattribute/)(const String\&) | Crea un [XmlAttribute](../xmlattribute/) con il nome specificato. |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | Crea un [XmlAttribute](../xmlattribute/) con il nome qualificato specificato e [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | Crea un [XmlAttribute](../xmlattribute/) con il [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/) e [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) specificati. |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | Crea una [XmlCDataSection](../xmlcdatasection/) contenente i dati specificati. |
| virtual [CreateComment](./createcomment/)(const String\&) | Crea un [XmlComment](../xmlcomment/) contenente i dati specificati. |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | Crea una [XmlDocumentFragment](../xmldocumentfragment/). |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | Restituisce un nuovo oggetto [XmlDocumentType](../xmldocumenttype/). |
| [CreateElement](./createelement/)(const String\&) | Crea un elemento con il nome specificato. |
| [CreateElement](./createelement/)(const String\&, const String\&) | Crea un [XmlElement](../xmlelement/) con il nome qualificato e [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | Crea un elemento con il [XmlNode::get_Prefix](../xmlnode/get_prefix/) specificato, il [XmlDocument::get_LocalName](./get_localname/) e il [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | Crea un [XmlEntityReference](../xmlentityreference/) con il nome specificato. |
| [CreateNavigator](./createnavigator/)() override | Crea un nuovo oggetto XPathNavigator per navigare questo documento. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | Crea un [XmlNode](../xmlnode/) con il [XmlNodeType](../xmlnodetype/) specificato, il [XmlNode::get_Prefix](../xmlnode/get_prefix/), il [XmlDocument::get_Name](./get_name/) e il [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | Crea un [XmlNode](../xmlnode/) con il tipo di nodo specificato, il [XmlDocument::get_Name](./get_name/) e il [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | Crea un [XmlNode](../xmlnode/) con il [XmlNodeType](../xmlnodetype/) specificato, il [XmlDocument::get_Name](./get_name/) e il [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | Crea un [XmlProcessingInstruction](../xmlprocessinginstruction/) con il nome e i dati specificati. |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | Crea un nodo [XmlSignificantWhitespace](../xmlsignificantwhitespace/). |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | Crea un [XmlText](../xmltext/) con il testo specificato. |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | Crea un nodo [XmlWhitespace](../xmlwhitespace/). |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | Crea un nodo [XmlDeclaration](../xmldeclaration/) con i valori specificati. |
| [get_BaseURI](./get_baseuri/)() override | Restituisce l'URI di base del nodo corrente. |
| [get_DocumentElement](./get_documentelement/)() | Restituisce l'elemento radice [XmlElement](../xmlelement/) del documento. |
| virtual [get_DocumentType](./get_documenttype/)() | Restituisce il nodo che contiene la dichiarazione DOCTYPE. |
| [get_Implementation](./get_implementation/)() | Restituisce l'oggetto [XmlImplementation](../xmlimplementation/) per il documento corrente. |
| [get_InnerXml](./get_innerxml/)() override | Restituisce il markup che rappresenta i figli del nodo corrente. |
| [get_IsReadOnly](./get_isreadonly/)() override | Restituisce un valore che indica se il nodo corrente è di sola lettura. |
| [get_LocalName](./get_localname/)() override | Restituisce il nome locale del nodo. |
| [get_Name](./get_name/)() override | Restituisce il nome qualificato del nodo. |
| [get_NameTable](./get_nametable/)() | Restituisce la [XmlNameTable](../xmlnametable/) associata a questa implementazione. |
| [get_NodeType](./get_nodetype/)() override | Restituisce il tipo del nodo corrente. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Restituisce il [XmlDocument](./) a cui appartiene il nodo corrente. |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | Restituisce un valore che indica se preservare gli spazi bianchi nel contenuto dell'elemento. |
| [get_SchemaInfo](./get_schemainfo/)() override | Restituisce il Post-Schema-Validation-Infoset (PSVI) del nodo. |
| [get_Schemas](./get_schemas/)() | Restituisce l'oggetto XmlSchemaSet associato a questo [XmlDocument](./). |
| virtual [GetElementById](./getelementbyid/)(String) | Restituisce il [XmlElement](../xmlelement/) con l'ID specificato. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Restituisce un [XmlNodeList](../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono al nome specificato. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Restituisce un [XmlNodeList](../xmlnodelist/) contenente un elenco di tutti gli elementi discendenti che corrispondono al [XmlDocument::get_LocalName](./get_localname/) specificato e al [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) specificato. |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | Importa un nodo da un altro documento al documento corrente. |
| virtual [Load](./load/)(String) | Carica il documento XML dall'URL specificato. |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | Carica il documento XML dallo stream specificato. |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | Carica il documento XML dal TextReader specificato. |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | Carica il documento XML dal [XmlReader](../xmlreader/) specificato. |
| virtual [LoadXml](./loadxml/)(String) | Carica il documento XML dalla stringa specificata. |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | Crea un oggetto [XmlNode](../xmlnode/) basato sulle informazioni nel [XmlReader](../xmlreader/). Il lettore deve essere posizionato su un nodo o su un attributo. |
| virtual [Save](./save/)(String) | Salva il documento XML nel file specificato. Se il file specificato esiste, questo metodo lo sovrascrive. |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | Salva il documento XML nello stream specificato. |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | Salva il documento XML nel TextWriter specificato. |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | Salva il documento XML nel [XmlWriter](../xmlwriter/) specificato. |
| [set_InnerText](./set_innertext/)(String) override | Genera un'InvalidOperationException in tutti i casi. |
| [set_InnerXml](./set_innerxml/)(String) override | Imposta il markup che rappresenta i figli del nodo corrente. |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | Imposta un valore che indica se preservare gli spazi bianchi nel contenuto dell'elemento. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Imposta l'oggetto XmlSchemaSet associato a questo [XmlDocument](./). |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | Imposta il [XmlResolver](../xmlresolver/) da utilizzare per la risoluzione delle risorse esterne. |
| [Validate](./validate/)(Schema::ValidationEventHandler) | Convalida il [XmlDocument](./) rispetto agli schemi XML [Schema](../../system.xml.schema/) Definition Language (XSD) contenuti nell'elenco [XmlDocument::get_Schemas](./get_schemas/). |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | Convalida l'oggetto [XmlNode](../xmlnode/) specificato rispetto agli schemi XML [Schema](../../system.xml.schema/) Definition Language (XSD) presenti nell'elenco [XmlDocument::get_Schemas](./get_schemas/). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Salva tutti i figli del nodo [XmlDocument](./) nello [XmlWriter](../xmlwriter/) specificato. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Salva il nodo [XmlDocument](./) nello [XmlWriter](../xmlwriter/) specificato. |
| [XmlDocument](./xmldocument/)() | Inizializza una nuova istanza della classe [XmlDocument](./). |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | Inizializza una nuova istanza della classe [XmlDocument](./) con il [XmlNameTable](../xmlnametable/) specificato. |
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

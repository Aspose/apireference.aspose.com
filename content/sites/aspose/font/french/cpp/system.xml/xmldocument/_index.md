---
title: "Classe System::Xml::XmlDocument"
linktitle: "Document XML"
second_title: "Aspose.Font pour C++"
description: "Classe System::Xml::XmlDocument. Représente un document XML. Vous pouvez utiliser cette classe pour charger, valider, modifier, ajouter et positionner du XML dans un document en C++."
type: docs
weight: 1400
url: /fr/cpp/system.xml/xmldocument/
---
## XmlDocument class


Représente un document XML. Vous pouvez utiliser cette classe pour charger, valider, modifier, ajouter et positionner le XML dans un document.

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Crée un duplicata de ce nœud. |
| [CreateAttribute](./createattribute/)(const String\&) | Crée un [XmlAttribute](../xmlattribute/) avec le nom spécifié. |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | Crée un [XmlAttribute](../xmlattribute/) avec le nom qualifié spécifié et [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | Crée un [XmlAttribute](../xmlattribute/) avec le [XmlNode::get_Prefix](../xmlnode/get_prefix/) spécifié, le [XmlDocument::get_LocalName](./get_localname/) et le [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) spécifiés. |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | Crée une [XmlCDataSection](../xmlcdatasection/) contenant les données spécifiées. |
| virtual [CreateComment](./createcomment/)(const String\&) | Crée un [XmlComment](../xmlcomment/) contenant les données spécifiées. |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | Crée une [XmlDocumentFragment](../xmldocumentfragment/). |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | Renvoie un nouvel objet [XmlDocumentType](../xmldocumenttype/). |
| [CreateElement](./createelement/)(const String\&) | Crée un élément avec le nom spécifié. |
| [CreateElement](./createelement/)(const String\&, const String\&) | Crée un [XmlElement](../xmlelement/) avec le nom qualifié et [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | Crée un élément avec le [XmlNode::get_Prefix](../xmlnode/get_prefix/), le [XmlDocument::get_LocalName](./get_localname/) et le [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) spécifiés. |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | Crée un [XmlEntityReference](../xmlentityreference/) avec le nom spécifié. |
| [CreateNavigator](./createnavigator/)() override | Crée un nouvel objet XPathNavigator pour parcourir ce document. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | Crée un [XmlNode](../xmlnode/) avec le [XmlNodeType](../xmlnodetype/) spécifié, le [XmlNode::get_Prefix](../xmlnode/get_prefix/), le [XmlDocument::get_Name](./get_name/) et le [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | Crée un [XmlNode](../xmlnode/) avec le type de nœud spécifié, le [XmlDocument::get_Name](./get_name/) et le [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | Crée un [XmlNode](../xmlnode/) avec le [XmlNodeType](../xmlnodetype/) spécifié, le [XmlDocument::get_Name](./get_name/) et le [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | Crée un [XmlProcessingInstruction](../xmlprocessinginstruction/) avec le nom et les données spécifiés. |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | Crée un nœud [XmlSignificantWhitespace](../xmlsignificantwhitespace/). |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | Crée un [XmlText](../xmltext/) avec le texte spécifié. |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | Crée un nœud [XmlWhitespace](../xmlwhitespace/). |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | Crée un nœud [XmlDeclaration](../xmldeclaration/) avec les valeurs spécifiées. |
| [get_BaseURI](./get_baseuri/)() override | Renvoie l'URI de base du nœud actuel. |
| [get_DocumentElement](./get_documentelement/)() | Renvoie l'élément racine [XmlElement](../xmlelement/) du document. |
| virtual [get_DocumentType](./get_documenttype/)() | Renvoie le nœud contenant la déclaration DOCTYPE. |
| [get_Implementation](./get_implementation/)() | Renvoie l'objet [XmlImplementation](../xmlimplementation/) du document actuel. |
| [get_InnerXml](./get_innerxml/)() override | Renvoie le balisage représentant les enfants du nœud actuel. |
| [get_IsReadOnly](./get_isreadonly/)() override | Renvoie une valeur indiquant si le nœud actuel est en lecture seule. |
| [get_LocalName](./get_localname/)() override | Renvoie le nom local du nœud. |
| [get_Name](./get_name/)() override | Renvoie le nom qualifié du nœud. |
| [get_NameTable](./get_nametable/)() | Renvoie le [XmlNameTable](../xmlnametable/) associé à cette implémentation. |
| [get_NodeType](./get_nodetype/)() override | Renvoie le type du nœud actuel. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Renvoie le [XmlDocument](./) auquel appartient le nœud actuel. |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | Renvoie une valeur indiquant s'il faut préserver les espaces blancs dans le contenu des éléments. |
| [get_SchemaInfo](./get_schemainfo/)() override | Renvoie le Post-Schema-Validation-Infoset (PSVI) du nœud. |
| [get_Schemas](./get_schemas/)() | Renvoie l'objet XmlSchemaSet associé à ce [XmlDocument](./). |
| virtual [GetElementById](./getelementbyid/)(String) | Renvoie le [XmlElement](../xmlelement/) avec l'ID spécifié. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Renvoie une [XmlNodeList](../xmlnodelist/) contenant la liste de tous les éléments descendants correspondant au nom spécifié. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Renvoie une [XmlNodeList](../xmlnodelist/) contenant une liste de tous les éléments descendants qui correspondent au [XmlDocument::get_LocalName](./get_localname/) spécifié et au [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) spécifié. |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | Importe un nœud d'un autre document vers le document actuel. |
| virtual [Load](./load/)(String) | Charge le document XML depuis l'URL spécifiée. |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | Charge le document XML depuis le flux spécifié. |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | Charge le document XML depuis le TextReader spécifié. |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | Charge le document XML depuis le [XmlReader](../xmlreader/) spécifié. |
| virtual [LoadXml](./loadxml/)(String) | Charge le document XML depuis la chaîne spécifiée. |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | Crée un objet [XmlNode](../xmlnode/) basé sur les informations du [XmlReader](../xmlreader/). Le lecteur doit être positionné sur un nœud ou un attribut. |
| virtual [Save](./save/)(String) | Enregistre le document XML dans le fichier spécifié. Si le fichier spécifié existe, cette méthode le remplace. |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | Enregistre le document XML dans le flux spécifié. |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | Enregistre le document XML dans le TextWriter spécifié. |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | Enregistre le document XML dans le [XmlWriter](../xmlwriter/) spécifié. |
| [set_InnerText](./set_innertext/)(String) override | Lance une InvalidOperationException dans tous les cas. |
| [set_InnerXml](./set_innerxml/)(String) override | Définit le balisage représentant les enfants du nœud actuel. |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | Définit une valeur indiquant s'il faut préserver les espaces blancs dans le contenu des éléments. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Définit l'objet XmlSchemaSet associé à ce [XmlDocument](./). |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | Définit le [XmlResolver](../xmlresolver/) à utiliser pour résoudre les ressources externes. |
| [Validate](./validate/)(Schema::ValidationEventHandler) | Valide le [XmlDocument](./) contre les schémas XML [Schema](../../system.xml.schema/) Definition Language (XSD) contenus dans la liste [XmlDocument::get_Schemas](./get_schemas/). |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | Valide l'objet [XmlNode](../xmlnode/) spécifié contre les schémas XML [Schema](../../system.xml.schema/) Definition Language (XSD) présents dans la liste [XmlDocument::get_Schemas](./get_schemas/). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre tous les enfants du nœud [XmlDocument](./) dans le [XmlWriter](../xmlwriter/) spécifié. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Enregistre le nœud [XmlDocument](./) dans le [XmlWriter](../xmlwriter/) spécifié. |
| [XmlDocument](./xmldocument/)() | Initialise une nouvelle instance de la classe [XmlDocument](./). |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | Initialise une nouvelle instance de la classe [XmlDocument](./) avec le [XmlNameTable](../xmlnametable/) spécifié. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [Ptr](./ptr/) | Un alias pour un pointeur partagé vers une instance de cette classe. |
## Remarques



Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instances de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

## Voir aussi

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Xml::XmlDocument klasse"
linktitle: "XmlDocument"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocument klasse. Vertegenwoordigt een XML-document. U kunt deze klasse gebruiken om XML te laden, valideren, bewerken, toevoegen en positioneren in een document in C++."
type: docs
weight: 1400
url: /nl/cpp/system.xml/xmldocument/
---
## XmlDocument class


Stelt een XML‑document voor. Je kunt deze klasse gebruiken om XML te laden, valideren, bewerken, toe te voegen en te positioneren in een document.

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Maakt een duplicaat van dit knooppunt. |
| [CreateAttribute](./createattribute/)(const String\&) | Maakt een [XmlAttribute](../xmlattribute/) met de opgegeven naam. |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | Maakt een [XmlAttribute](../xmlattribute/) met de opgegeven gekwalificeerde naam en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | Maakt een [XmlAttribute](../xmlattribute/) met het opgegeven [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/) en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | Maakt een [XmlCDataSection](../xmlcdatasection/) die de opgegeven gegevens bevat. |
| virtual [CreateComment](./createcomment/)(const String\&) | Maakt een [XmlComment](../xmlcomment/) die de opgegeven gegevens bevat. |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | Maakt een [XmlDocumentFragment](../xmldocumentfragment/). |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | Retourneert een nieuw [XmlDocumentType](../xmldocumenttype/) object. |
| [CreateElement](./createelement/)(const String\&) | Maakt een element met de opgegeven naam. |
| [CreateElement](./createelement/)(const String\&, const String\&) | Maakt een [XmlElement](../xmlelement/) met de gekwalificeerde naam en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | Maakt een element met het opgegeven [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/) en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | Maakt een [XmlEntityReference](../xmlentityreference/) met de opgegeven naam. |
| [CreateNavigator](./createnavigator/)() override | Maakt een nieuw XPathNavigator-object voor het navigeren door dit document. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | Maakt een [XmlNode](../xmlnode/) met het opgegeven [XmlNodeType](../xmlnodetype/), [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_Name](./get_name/) en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | Maakt een [XmlNode](../xmlnode/) met het opgegeven knooptype, [XmlDocument::get_Name](./get_name/) en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | Maakt een [XmlNode](../xmlnode/) met het opgegeven [XmlNodeType](../xmlnodetype/), [XmlDocument::get_Name](./get_name/) en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | Maakt een [XmlProcessingInstruction](../xmlprocessinginstruction/) met de opgegeven naam en gegevens. |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | Maakt een [XmlSignificantWhitespace](../xmlsignificantwhitespace/) knooppunt. |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | Maakt een [XmlText](../xmltext/) met de opgegeven tekst. |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | Maakt een [XmlWhitespace](../xmlwhitespace/) knooppunt. |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | Maakt een [XmlDeclaration](../xmldeclaration/) knooppunt met de opgegeven waarden. |
| [get_BaseURI](./get_baseuri/)() override | Retourneert de basis-URI van het huidige knooppunt. |
| [get_DocumentElement](./get_documentelement/)() | Retourneert het root-[XmlElement](../xmlelement/) van het document. |
| virtual [get_DocumentType](./get_documenttype/)() | Retourneert het knooppunt dat de DOCTYPE-declaratie bevat. |
| [get_Implementation](./get_implementation/)() | Retourneert het [XmlImplementation](../xmlimplementation/) object voor het huidige document. |
| [get_InnerXml](./get_innerxml/)() override | Retourneert de markup die de kinderen van het huidige knooppunt weergeeft. |
| [get_IsReadOnly](./get_isreadonly/)() override | Retourneert een waarde die aangeeft of het huidige knooppunt alleen-lezen is. |
| [get_LocalName](./get_localname/)() override | Geeft de lokale naam van het knooppunt terug. |
| [get_Name](./get_name/)() override | Geeft de gekwalificeerde naam van het knooppunt terug. |
| [get_NameTable](./get_nametable/)() | Geeft de [XmlNameTable](../xmlnametable/) die aan deze implementatie is gekoppeld terug. |
| [get_NodeType](./get_nodetype/)() override | Retourneert het type van het huidige knooppunt. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Retourneert het [XmlDocument](./) waartoe het huidige knooppunt behoort. |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | Retourneert een waarde die aangeeft of witruimte in elementinhoud moet worden behouden. |
| [get_SchemaInfo](./get_schemainfo/)() override | Retourneert de Post-Schema-Validation-Infoset (PSVI) van het knooppunt. |
| [get_Schemas](./get_schemas/)() | Retourneert het XmlSchemaSet-object dat aan dit [XmlDocument](./) is gekoppeld. |
| virtual [GetElementById](./getelementbyid/)(String) | Retourneert het [XmlElement](../xmlelement/) met de opgegeven ID. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Retourneert een [XmlNodeList](../xmlnodelist/) met een lijst van alle afstammings‑elementen die overeenkomen met de opgegeven naam. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Retourneert een [XmlNodeList](../xmlnodelist/) met een lijst van alle afstammings‑elementen die overeenkomen met de opgegeven [XmlDocument::get_LocalName](./get_localname/) en [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | Importeert een knooppunt van een ander document naar het huidige document. |
| virtual [Load](./load/)(String) | Laadt het XML-document van de opgegeven URL. |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | Laadt het XML-document van de opgegeven stream. |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | Laadt het XML-document van de opgegeven TextReader. |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | Laadt het XML-document van de opgegeven [XmlReader](../xmlreader/). |
| virtual [LoadXml](./loadxml/)(String) | Laadt het XML-document van de opgegeven tekenreeks. |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | Maakt een [XmlNode](../xmlnode/) object op basis van de informatie in de [XmlReader](../xmlreader/). De lezer moet gepositioneerd zijn op een knooppunt of attribuut. |
| virtual [Save](./save/)(String) | Slaat het XML-document op naar het opgegeven bestand. Als het opgegeven bestand bestaat, overschrijft deze methode het. |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | Slaat het XML-document op naar de opgegeven stream. |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | Slaat het XML-document op naar de opgegeven TextWriter. |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | Slaat het XML-document op naar de opgegeven [XmlWriter](../xmlwriter/). |
| [set_InnerText](./set_innertext/)(String) override | Gooit in alle gevallen een InvalidOperationException. |
| [set_InnerXml](./set_innerxml/)(String) override | Stelt de opmaak in die de kinderen van het huidige knooppunt vertegenwoordigt. |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | Stelt een waarde in die aangeeft of witruimte in elementinhoud behouden moet blijven. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Stelt het XmlSchemaSet-object in dat aan dit [XmlDocument](./) is gekoppeld. |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | Stelt de [XmlResolver](../xmlresolver/) in die gebruikt wordt voor het oplossen van externe bronnen. |
| [Validate](./validate/)(Schema::ValidationEventHandler) | Valideert het [XmlDocument](./) tegen de XML [Schema](../../system.xml.schema/) Definition Language (XSD)-schema's die zich in de lijst [XmlDocument::get_Schemas](./get_schemas/) bevinden. |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | Valideert het opgegeven [XmlNode](../xmlnode/)-object tegen de XML [Schema](../../system.xml.schema/) Definition Language (XSD)-schema's in de lijst [XmlDocument::get_Schemas](./get_schemas/). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat alle kinderen van het [XmlDocument](./)-knooppunt op naar de opgegeven [XmlWriter](../xmlwriter/). |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Slaat het [XmlDocument](./)-knooppunt op naar de opgegeven [XmlWriter](../xmlwriter/). |
| [XmlDocument](./xmldocument/)() | Initialiseert een nieuw exemplaar van de [XmlDocument](./)-klasse. |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | Initialiseert een nieuw exemplaar van de [XmlDocument](./)-klasse met de opgegeven [XmlNameTable](../xmlnametable/). |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)

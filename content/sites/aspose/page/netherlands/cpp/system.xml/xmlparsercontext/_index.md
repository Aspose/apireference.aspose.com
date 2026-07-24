---
title: "System::Xml::XmlParserContext klasse"
linktitle: "XmlParserContext"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlParserContext klasse. Biedt alle contextinformatie die vereist is door de XmlReader om een XML-fragment te parseren in C++."
type: docs
weight: 3000
url: /nl/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


Biedt alle contextinformatie die vereist is door de [XmlReader](../xmlreader/) om een XML-fragment te parseren.

```cpp
class XmlParserContext : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | Retourneert de basis-URI. |
| [get_DocTypeName](./get_doctypename/)() | Retourneert de naam van de documenttypeverklaring. |
| [get_Encoding](./get_encoding/)() | Retourneert het coderingstype. |
| [get_InternalSubset](./get_internalsubset/)() | Retourneert de interne DTD-subset. |
| [get_NamespaceManager](./get_namespacemanager/)() | Retourneert de [XmlNamespaceManager](../xmlnamespacemanager/). |
| [get_NameTable](./get_nametable/)() | Retourneert de [XmlNameTable](../xmlnametable/) die wordt gebruikt om strings te atomiseren. Voor meer informatie over geatomiseerde strings, zie [XmlNameTable](../xmlnametable/). |
| [get_PublicId](./get_publicid/)() | Retourneert de publieke identifier. |
| [get_SystemId](./get_systemid/)() | Retourneert de systeemidentifier. |
| [get_XmlLang](./get_xmllang/)() | Retourneert de huidige **xml:lang**‑scope. |
| [get_XmlSpace](./get_xmlspace/)() | Geeft het huidige **xml:space**-bereik terug. |
| [set_BaseURI](./set_baseuri/)(const String\&) | Stelt de basis-URI in. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | Stelt de naam van de documenttypeverklaring in. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Stelt het coderingstype in. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | Stelt de interne DTD-subset in. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | Stelt de [XmlNamespaceManager](../xmlnamespacemanager/) in. |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Stelt de [XmlNameTable](../xmlnametable/) die wordt gebruikt om strings te atomiseren in. Voor meer informatie over geatomiseerde strings, zie [XmlNameTable](../xmlnametable/). |
| [set_PublicId](./set_publicid/)(const String\&) | Stelt de publieke identifier in. |
| [set_SystemId](./set_systemid/)(const String\&) | Stelt de systeemidentifier in. |
| [set_XmlLang](./set_xmllang/)(const String\&) | Stelt de huidige **xml:lang** scope in. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | Stelt de huidige **xml:space** scope in. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | Initialiseert een nieuw exemplaar van de [XmlParserContext](./) klasse met de opgegeven [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang** en **xml:space** waarden. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Initialiseert een nieuw exemplaar van de [XmlParserContext](./) klasse met de opgegeven [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, **xml:space**, en codering. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | Initialiseert een nieuw exemplaar van de [XmlParserContext](./) klasse met de opgegeven [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), basis-URI, **xml:lang**, **xml:space**, en documenttypewaarden. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Initialiseert een nieuw exemplaar van de [XmlParserContext](./) klasse met de opgegeven [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), basis-URI, **xml:lang**, **xml:space**, codering en documenttype‑waarden. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [Ptr](./ptr/) | Een alias voor een gedeelde pointer naar een exemplaar van deze klasse. |
## Opmerkingen



Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit exemplaren van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)

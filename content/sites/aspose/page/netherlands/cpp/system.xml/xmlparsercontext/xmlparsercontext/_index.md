---
title: "System::Xml::XmlParserContext::XmlParserContext constructor"
linktitle: "XmlParserContext"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlParserContext::XmlParserContext constructor. Initialiseert een nieuw exemplaar van de XmlParserContext-klasse met de opgegeven XmlNameTable, XmlNamespaceManager, basis-URI, xml:lang, xml:space en documenttype-waarden in C++."
type: docs
weight: 100
url: /nl/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


Initialiseert een nieuw exemplaar van de [XmlParserContext](../)-klasse met de opgegeven [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), basis-URI, **xml:lang**, **xml:space** en documenttype-waarden.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | De [XmlNameTable](../../xmlnametable/) die gebruikt wordt om strings te atomiseren. Als dit **nullptr** is, wordt de naamtabel die gebruikt wordt om de **nsMgr** te construeren in plaats daarvan gebruikt. Voor meer informatie over geatomiseerde strings, zie [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | De [XmlNamespaceManager](../../xmlnamespacemanager/) die gebruikt wordt om namespace-informatie op te zoeken, of **nullptr**. |
| docTypeName | const String\& | De naam van de documenttypeverklaring. |
| pubId | const String\& | De publieke identifier. |
| sysId | const String\& | De systeemidentificatie. |
| internalSubset | const String\& | De interne DTD-subset. De DTD-subset wordt gebruikt voor entiteitsresolutie, niet voor documentvalidatie. |
| baseURI | const String\& | De basis-URI voor het XML-fragment (de locatie waar het fragment werd geladen). |
| xmlLang | const String\& | Het **xml:lang**-bereik. |
| xmlSpace | System::Xml::XmlSpace | Een [XmlSpace](../../xmlspace/) waarde die de **xml:space**-scope aangeeft. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlParserContext](../)-klasse met de opgegeven [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), basis-URI, **xml:lang**, **xml:space**, codering en documenttype‑waarden.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | De [XmlNameTable](../../xmlnametable/) die gebruikt wordt om strings te atomiseren. Als dit **nullptr** is, wordt de naamtabel die gebruikt wordt om de **nsMgr** te construeren in plaats daarvan gebruikt. Voor meer informatie over geatomiseerde strings, zie [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | De [XmlNamespaceManager](../../xmlnamespacemanager/) die gebruikt wordt om namespace-informatie op te zoeken, of **nullptr**. |
| docTypeName | const String\& | De naam van de documenttypeverklaring. |
| pubId | const String\& | De publieke identifier. |
| sysId | const String\& | De systeemidentificatie. |
| internalSubset | const String\& | De interne DTD-subset. De DTD wordt gebruikt voor entiteitsresolutie, niet voor documentvalidatie. |
| baseURI | const String\& | De basis-URI voor het XML-fragment (de locatie waar het fragment werd geladen). |
| xmlLang | const String\& | Het **xml:lang**-bereik. |
| xmlSpace | System::Xml::XmlSpace | Een [XmlSpace](../../xmlspace/) waarde die de **xml:space**-scope aangeeft. |
| enc | const SharedPtr\\<System::Text::Encoding\\>\\& | Een Encoding‑object dat de coderingsinstelling aangeeft. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


Initialiseert een nieuw exemplaar van de [XmlParserContext](../)-klasse met de opgegeven [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, en **xml:space** waarden.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | De [XmlNameTable](../../xmlnametable/) die gebruikt wordt om strings te atomiseren. Als dit **nullptr** is, wordt de naamtabel die gebruikt wordt om de **nsMgr** te construeren in plaats daarvan gebruikt. Voor meer informatie over geatomiseerde strings, zie [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | De [XmlNamespaceManager](../../xmlnamespacemanager/) die gebruikt wordt om namespace-informatie op te zoeken, of **nullptr**. |
| xmlLang | const String\& | Het **xml:lang**-bereik. |
| xmlSpace | System::Xml::XmlSpace | Een [XmlSpace](../../xmlspace/) waarde die de **xml:space**-scope aangeeft. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initialiseert een nieuw exemplaar van de [XmlParserContext](../)-klasse met de opgegeven [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space**, en codering.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | De [XmlNameTable](../../xmlnametable/) die gebruikt wordt om strings te atomiseren. Als dit **nullptr** is, wordt de naamtafel die gebruikt wordt om de **nsMgr** te construeren, in plaats daarvan gebruikt. Zie voor meer informatie over geatomiseerde strings [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | De [XmlNamespaceManager](../../xmlnamespacemanager/) die gebruikt wordt om namespace-informatie op te zoeken, of **nullptr**. |
| xmlLang | const String\& | Het **xml:lang**-bereik. |
| xmlSpace | System::Xml::XmlSpace | Een [XmlSpace](../../xmlspace/) waarde die de **xml:space**-scope aangeeft. |
| enc | const SharedPtr\\<System::Text::Encoding\\>\\& | Een Encoding‑object dat de coderingsinstelling aangeeft. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

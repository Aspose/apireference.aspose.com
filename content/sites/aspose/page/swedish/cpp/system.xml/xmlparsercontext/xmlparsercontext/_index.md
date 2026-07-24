---
title: "System::Xml::XmlParserContext::XmlParserContext konstruktor"
linktitle: "XmlParserContext"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlParserContext::XmlParserContext konstruktor. Initierar en ny instans av XmlParserContext‑klassen med de angivna XmlNameTable-, XmlNamespaceManager-, bas‑URI-, xml:lang-, xml:space- och dokumenttypvärdena i C++."
type: docs
weight: 100
url: /sv/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


Initierar en ny instans av [XmlParserContext](../)-klassen med de angivna [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), bas‑URI, **xml:lang**, **xml:space** och dokumenttypvärden.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Det [XmlNameTable](../../xmlnametable/) att använda för att atomisera strängar. Om detta är **nullptr** används namntabellen som användes för att konstruera **nsMgr** istället. För mer information om atomiserade strängar, se [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Det [XmlNamespaceManager](../../xmlnamespacemanager/) att använda för att slå upp namnrymdsinformation, eller **nullptr**. |
| docTypeName | const String\& | Namnet på dokumenttypdeklarationen. |
| pubId | const String\& | Den offentliga identifieraren. |
| sysId | const String\& | Systemidentifieraren. |
| internalSubset | const String\& | Den interna DTD-delmängden. DTD-delmängden används för entitetsupplösning, inte för dokumentvalidering. |
| baseURI | const String\& | Bas-URI för XML-fragmentet (platsen där fragmentet laddades). |
| xmlLang | const String\& | Omfattningen för **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Ett [XmlSpace](../../xmlspace/)-värde som indikerar **xml:space**‑omfånget. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initierar en ny instans av klassen [XmlParserContext](../) med den angivna [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), bas-URI, **xml:lang**, **xml:space**, kodning och dokumenttypvärden.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Det [XmlNameTable](../../xmlnametable/) att använda för att atomisera strängar. Om detta är **nullptr** används namntabellen som användes för att konstruera **nsMgr** istället. För mer information om atomiserade strängar, se [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Det [XmlNamespaceManager](../../xmlnamespacemanager/) att använda för att slå upp namnrymdsinformation, eller **nullptr**. |
| docTypeName | const String\& | Namnet på dokumenttypdeklarationen. |
| pubId | const String\& | Den offentliga identifieraren. |
| sysId | const String\& | Systemidentifieraren. |
| internalSubset | const String\& | Den interna DTD-delmängden. DTD används för entitetsupplösning, inte för dokumentvalidering. |
| baseURI | const String\& | Bas-URI för XML-fragmentet (platsen där fragmentet laddades). |
| xmlLang | const String\& | Omfattningen för **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Ett [XmlSpace](../../xmlspace/)-värde som indikerar **xml:space**‑omfånget. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Ett Encoding-objekt som anger kodningsinställningen. |

## Se även

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


Initierar en ny instans av klassen [XmlParserContext](../) med den angivna [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang** och **xml:space** värden.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Det [XmlNameTable](../../xmlnametable/) att använda för att atomisera strängar. Om detta är **nullptr** används namntabellen som användes för att konstruera **nsMgr** istället. För mer information om atomiserade strängar, se [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Det [XmlNamespaceManager](../../xmlnamespacemanager/) att använda för att slå upp namnrymdsinformation, eller **nullptr**. |
| xmlLang | const String\& | Omfattningen för **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Ett [XmlSpace](../../xmlspace/)-värde som indikerar **xml:space**‑omfånget. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initierar en ny instans av klassen [XmlParserContext](../) med den angivna [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space** och kodning.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Den [XmlNameTable](../../xmlnametable/) att använda för att atomisera strängar. Om detta är **nullptr**, används namntabellen som användes för att konstruera **nsMgr** istället. För mer information om atomiserade strängar, se [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Det [XmlNamespaceManager](../../xmlnamespacemanager/) att använda för att slå upp namnrymdsinformation, eller **nullptr**. |
| xmlLang | const String\& | Omfattningen för **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Ett [XmlSpace](../../xmlspace/)-värde som indikerar **xml:space**‑omfånget. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Ett Encoding-objekt som anger kodningsinställningen. |

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

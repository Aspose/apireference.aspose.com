---
title: "System::Xml::XmlParserContext::XmlParserContext Konstruktor"
linktitle: "XmlParserContext"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlParserContext::XmlParserContext Konstruktor. Initialisiert eine neue Instanz der XmlParserContext‑Klasse mit den angegebenen XmlNameTable-, XmlNamespaceManager-, Basis‑URI-, xml:lang-, xml:space‑ und Dokumenttypwerten in C++."
type: docs
weight: 100
url: /de/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


Initialisiert eine neue Instanz der [XmlParserContext](../)-Klasse mit den angegebenen [XmlNameTable](../../xmlnametable/)-, [XmlNamespaceManager](../../xmlnamespacemanager/)-, Basis‑URI-, **xml:lang**, **xml:space**- und Dokumenttypwerten.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Die [XmlNameTable](../../xmlnametable/) zum Atomisieren von Zeichenketten. Wenn dies **nullptr** ist, wird stattdessen die Namens­tabelle verwendet, die zum Erzeugen des **nsMgr** verwendet wurde. Weitere Informationen zu atomisierten Zeichenketten finden Sie unter [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Der [XmlNamespaceManager](../../xmlnamespacemanager/) zum Nachschlagen von Namespace‑Informationen oder **nullptr**. |
| docTypeName | const String\& | Der Name der Dokumenttyp-Deklaration. |
| pubId | const String\& | Der öffentliche Bezeichner. |
| sysId | const String\& | Der Systembezeichner. |
| internalSubset | const String\& | Das interne DTD-Subset. Das DTD-Subset wird zur Entity-Auflösung verwendet, nicht zur Dokumentvalidierung. |
| baseURI | const String\& | Die Basis-URI für das XML-Fragment (der Ort, von dem das Fragment geladen wurde). |
| xmlLang | const String\& | Der **xml:lang**-Geltungsbereich. |
| xmlSpace | System::Xml::XmlSpace | Ein [XmlSpace](../../xmlspace/)-Wert, der den **xml:space**‑Bereich angibt. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlParserContext](../) mit der angegebenen [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), Basis-URI, **xml:lang**, **xml:space**, Kodierung und Dokumenttypwerten.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Die [XmlNameTable](../../xmlnametable/) zum Atomisieren von Zeichenketten. Wenn dies **nullptr** ist, wird stattdessen die Namens­tabelle verwendet, die zum Erzeugen des **nsMgr** verwendet wurde. Weitere Informationen zu atomisierten Zeichenketten finden Sie unter [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Der [XmlNamespaceManager](../../xmlnamespacemanager/) zum Nachschlagen von Namespace‑Informationen oder **nullptr**. |
| docTypeName | const String\& | Der Name der Dokumenttyp-Deklaration. |
| pubId | const String\& | Der öffentliche Bezeichner. |
| sysId | const String\& | Der Systembezeichner. |
| internalSubset | const String\& | Das interne DTD-Subset. Das DTD wird zur Entity-Auflösung verwendet, nicht zur Dokumentvalidierung. |
| baseURI | const String\& | Die Basis-URI für das XML-Fragment (der Ort, von dem das Fragment geladen wurde). |
| xmlLang | const String\& | Der **xml:lang**-Geltungsbereich. |
| xmlSpace | System::Xml::XmlSpace | Ein [XmlSpace](../../xmlspace/)-Wert, der den **xml:space**‑Bereich angibt. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Ein Encoding-Objekt, das die Kodierungseinstellung angibt. |

## Siehe auch

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


Initialisiert eine neue Instanz der Klasse [XmlParserContext](../) mit der angegebenen [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**- und **xml:space**-Werten.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Die [XmlNameTable](../../xmlnametable/) zum Atomisieren von Zeichenketten. Wenn dies **nullptr** ist, wird stattdessen die Namens­tabelle verwendet, die zum Erzeugen des **nsMgr** verwendet wurde. Weitere Informationen zu atomisierten Zeichenketten finden Sie unter [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Der [XmlNamespaceManager](../../xmlnamespacemanager/) zum Nachschlagen von Namespace‑Informationen oder **nullptr**. |
| xmlLang | const String\& | Der **xml:lang**-Geltungsbereich. |
| xmlSpace | System::Xml::XmlSpace | Ein [XmlSpace](../../xmlspace/)-Wert, der den **xml:space**‑Bereich angibt. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Initialisiert eine neue Instanz der Klasse [XmlParserContext](../) mit der angegebenen [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space** und Kodierung.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | Die [XmlNameTable](../../xmlnametable/), die zum Atomisieren von Zeichenketten verwendet wird. Wenn dies **nullptr** ist, wird stattdessen die Namens­tabelle verwendet, die zum Erzeugen des **nsMgr** benutzt wurde. Weitere Informationen zu atomisierten Zeichenketten finden Sie in [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Der [XmlNamespaceManager](../../xmlnamespacemanager/) zum Nachschlagen von Namespace‑Informationen oder **nullptr**. |
| xmlLang | const String\& | Der **xml:lang**-Geltungsbereich. |
| xmlSpace | System::Xml::XmlSpace | Ein [XmlSpace](../../xmlspace/)-Wert, der den **xml:space**‑Bereich angibt. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Ein Encoding-Objekt, das die Kodierungseinstellung angibt. |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Xml::XmlDocument::CreateNode Methode"
linktitle: "CreateNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlDocument::CreateNode Methode. Erstellt ein XmlNode mit dem angegebenen Knotentyp, XmlDocument::get_Name und XmlNode::get_NamespaceURI in C++."
type: docs
weight: 1100
url: /de/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Erstellt ein [XmlNode](../../xmlnode/) mit dem angegebenen Knotentyp, [XmlDocument::get_Name](../get_name/) und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| nodeTypeString | const String\& | Die [String](../../../system/string/) Version des [XmlNodeType](../../xmlnodetype/) des neuen Knotens. Dieser Parameter muss einer der in der nachstehenden Tabelle aufgeführten Werte sein. |
| name | const String\& | Der qualifizierte Name des neuen Knotens. Wenn der Name einen Doppelpunkt enthält, wird er in die Komponenten [XmlNode::get_Prefix](../../xmlnode/get_prefix/) und [XmlDocument::get_LocalName](../get_localname/) zerlegt. |
| namespaceURI | const String\& | Der Namespace-URI des neuen Knotens. |

### ReturnValue

Der neue [XmlNode](../../xmlnode/).
## Hinweise



Der **nodeTypeString** Parameter ist case‑sensitive und muss einer der Werte in der folgenden Tabelle sein: |||
|-|-|
| nodeTypeString | XmlNodeType |
| Attribut | Attribute |
| CDATAAbschnitt | CDATA |
| Kommentar | Comment |
| Dokument | Document |
| Dokumentfragment | DocumentFragment |
| Dokumenttyp | DocumentType |
| Element | Element |
| Entitätsreferenz | EntityReference |
| Verarbeitungsanweisung | ProcessingInstruction |
| bedeutende Leerzeichen | SignificantWhitespace |
| Text | Text |
| Leerzeichen | Whitespace |

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Erstellt einen [XmlNode](../../xmlnode/) mit dem angegebenen [XmlNodeType](../../xmlnodetype/), [XmlDocument::get_Name](../get_name/) und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | XmlNodeType | Der [XmlNodeType](../../xmlnodetype/) des neuen Knotens. |
| name | const String\& | Der qualifizierte Name des neuen Knotens. Wenn der Name einen Doppelpunkt enthält, wird er in die Komponenten [XmlNode::get_Prefix](../../xmlnode/get_prefix/) und [XmlDocument::get_LocalName](../get_localname/) zerlegt. |
| namespaceURI | const String\& | Der Namespace-URI des neuen Knotens. |

### ReturnValue

Der neue [XmlNode](../../xmlnode/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Erstellt einen [XmlNode](../../xmlnode/) mit dem angegebenen [XmlNodeType](../../xmlnodetype/), [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| type | XmlNodeType | Der [XmlNodeType](../../xmlnodetype/) des neuen Knotens. |
| Präfix | const String\& | Das Präfix des neuen Knotens. |
| Name | const String\& | Der lokale Name des neuen Knotens. |
| namespaceURI | const String\& | Der Namespace-URI des neuen Knotens. |

### ReturnValue

Der neue [XmlNode](../../xmlnode/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

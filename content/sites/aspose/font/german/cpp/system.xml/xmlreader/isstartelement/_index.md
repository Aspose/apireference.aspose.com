---
title: "System::Xml::XmlReader::IsStartElement-Methode"
linktitle: "IsStartElement"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::IsStartElement-Methode. Ruft XmlReader::MoveToContent auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag in C++ ist."
type: docs
weight: 3000
url: /de/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


Ruft [XmlReader::MoveToContent](../movetocontent/) auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag ist.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## Siehe auch

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String, String) method


Ruft [XmlReader::MoveToContent](../movetocontent/) auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag ist und ob die Werte von [XmlReader::get_LocalName](../get_localname/) und [XmlReader::get_NamespaceURI](../get_namespaceuri/) des gefundenen Elements mit den angegebenen Zeichenketten übereinstimmen.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localname | String | Die Zeichenkette, die mit dem **LocalName**‑Wert des gefundenen Elements abgeglichen werden soll. |
| ns | String | Die Zeichenkette, die mit dem **NamespaceURI**‑Wert des gefundenen Elements abgeglichen werden soll. |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::IsStartElement(String) method


Ruft [XmlReader::MoveToContent](../movetocontent/) auf und prüft, ob der aktuelle Inhaltsknoten ein Start‑Tag oder ein leeres Element‑Tag ist und ob der Wert von [XmlReader::get_Name](../get_name/) des gefundenen Elements mit dem angegebenen Argument übereinstimmt.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Die Zeichenkette wurde mit dem **Name**-Wert des gefundenen Elements abgeglichen. |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

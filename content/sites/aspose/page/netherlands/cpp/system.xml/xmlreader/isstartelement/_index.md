---
title: "System::Xml::XmlReader::IsStartElement methode"
linktitle: "IsStartElement"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::IsStartElement methode. Roept XmlReader::MoveToContent aan en test of de huidige contentnode een start‑tag of een lege element‑tag is in C++."
type: docs
weight: 3000
url: /nl/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


Roept [XmlReader::MoveToContent](../movetocontent/) aan en test of de huidige contentnode een start‑tag of een lege element‑tag is.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## Zie ook

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String, String) method


Roept [XmlReader::MoveToContent](../movetocontent/) aan en test of de huidige contentnode een start‑tag of een lege element‑tag is en of de waarden van [XmlReader::get_LocalName](../get_localname/) en [XmlReader::get_NamespaceURI](../get_namespaceuri/) van het gevonden element overeenkomen met de opgegeven tekenreeksen.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lokale naam | String | De tekenreeks om te vergelijken met de **LocalName**‑waarde van het gevonden element. |
| ns | String | De tekenreeks om te vergelijken met de **NamespaceURI**‑waarde van het gevonden element. |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String) method


Roept [XmlReader::MoveToContent](../movetocontent/) aan en test of de huidige contentnode een start‑tag of een lege element‑tag is en of de waarde van [XmlReader::get_Name](../get_name/) van het gevonden element overeenkomt met het opgegeven argument.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De tekenreeks die wordt vergeleken met de **Name**‑waarde van het gevonden element. |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

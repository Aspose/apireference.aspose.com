---
title: "System::Xml::XmlReader::IsStartElement μέθοδος"
linktitle: "IsStartElement"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::IsStartElement μέθοδος. Καλεί το XmlReader::MoveToContent και ελέγχει αν ο τρέχων κόμβος περιεχομένου είναι ετικέτα έναρξης ή κενό στοιχείο σε C++."
type: docs
weight: 3000
url: /el/cpp/system.xml/xmlreader/isstartelement/
---
## XmlReader::IsStartElement() method


Καλεί το [XmlReader::MoveToContent](../movetocontent/) και ελέγχει αν ο τρέχων κόμβος περιεχομένου είναι ετικέτα έναρξης ή κενό στοιχείο.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement()
```


### ReturnValue

**true** if [XmlReader::MoveToContent](../movetocontent/) finds a start tag or empty element tag; **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found.

## Δείτε επίσης

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String, String) method


Καλεί το [XmlReader::MoveToContent](../movetocontent/) και ελέγχει αν ο τρέχων κόμβος περιεχομένου είναι ετικέτα έναρξης ή κενό στοιχείο και αν οι τιμές [XmlReader::get_LocalName](../get_localname/) και [XmlReader::get_NamespaceURI](../get_namespaceuri/) του εντοπισμένου στοιχείου ταιριάζουν με τις δοσμένες συμβολοσειρές.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String localname, String ns)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localname | String | Η συμβολοσειρά για σύγκριση με την τιμή **LocalName** του εντοπισμένου στοιχείου. |
| ns | String | Η συμβολοσειρά για σύγκριση με την τιμή **NamespaceURI** του εντοπισμένου στοιχείου. |

### ReturnValue

**true** if the resulting node is an element. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the **LocalName** and **NamespaceURI** values of the element do not match the specified strings.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::IsStartElement(String) method


Καλεί το [XmlReader::MoveToContent](../movetocontent/) και ελέγχει αν ο τρέχων κόμβος περιεχομένου είναι ετικέτα έναρξης ή κενό στοιχείο και αν η τιμή [XmlReader::get_Name](../get_name/) του εντοπισμένου στοιχείου ταιριάζει με το δοσμένο όρισμα.

```cpp
virtual bool System::Xml::XmlReader::IsStartElement(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Η συμβολοσειρά που ταιριάζει με την τιμή **Name** του εντοπισμένου στοιχείου. |

### ReturnValue

**true** if the resulting node is an element and the **Name** value matches the specified string. **false** if a node type other than [XmlNodeType::Element](../../xmlnodetype/) was found or if the element **Name** value does not match the specified string.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

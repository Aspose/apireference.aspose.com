---
title: "System::Xml::XmlDocument::GetElementsByTagName μέθοδος"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDocument::GetElementsByTagName μέθοδος. Επιστρέφει ένα XmlNodeList που περιέχει μια λίστα με όλα τα απογόμενα στοιχεία που ταιριάζουν με το καθορισμένο XmlDocument::get_LocalName και XmlNode::get_NamespaceURI σε C++."
type: docs
weight: 3200
url: /el/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


Επιστρέφει ένα [XmlNodeList](../../xmlnodelist/) που περιέχει μια λίστα με όλα τα απογόμενα στοιχεία που ταιριάζουν με το καθορισμένο [XmlDocument::get_LocalName](../get_localname/) και [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το LocalName για αντιστοίχιση. Η ειδική τιμή **\"*\"** ταιριάζει με όλες τις ετικέτες. |
| namespaceURI | String | NamespaceURI για αντιστοίχιση. |

### ReturnValue

Ένα [XmlNodeList](../../xmlnodelist/) που περιέχει μια λίστα με όλους τους αντιστοιχούντες κόμβους. Εάν κανένας κόμβος δεν ταιριάζει με το καθορισμένο **localName** και **namespaceURI**, η επιστρεφόμενη συλλογή θα είναι κενή.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


Επιστρέφει ένα [XmlNodeList](../../xmlnodelist/) που περιέχει μια λίστα με όλα τα απογόμενα στοιχεία που ταιριάζουν με το καθορισμένο όνομα.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Το πλήρες όνομα για αντιστοίχιση. Συμφωνεί με την τιμή **get_Name** του αντίστοιχου κόμβου. Η ειδική τιμή **\"*\"** ταιριάζει με όλες τις ετικέτες. |

### ReturnValue

Ένα [XmlNodeList](../../xmlnodelist/) που περιέχει μια λίστα με όλους τους αντιστοιχούντες κόμβους. Εάν κανένας κόμβος δεν ταιριάζει με το **name**, η επιστρεφόμενη συλλογή θα είναι κενή.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

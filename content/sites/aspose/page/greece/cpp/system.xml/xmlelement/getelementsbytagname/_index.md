---
title: "System::Xml::XmlElement::GetElementsByTagName μέθοδος"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlElement::GetElementsByTagName μέθοδος. Επιστρέφει ένα XmlNodeList που περιέχει μια λίστα όλων των απογόνων στοιχείων που ταιριάζουν με τις καθορισμένες τιμές XmlElement::get_LocalName και XmlElement::get_NamespaceURI σε C++."
type: docs
weight: 1500
url: /el/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Επιστρέφει ένα [XmlNodeList](../../xmlnodelist/) που περιέχει μια λίστα όλων των απογόνων στοιχείων που ταιριάζουν με τις καθορισμένες τιμές [XmlElement::get_LocalName](../get_localname/) και [XmlElement::get_NamespaceURI](../get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| localName | String | Το τοπικό όνομα για αντιστοίχιση. Το αστερίσκο (*) είναι μια ειδική τιμή που ταιριάζει με όλες τις ετικέτες. |
| namespaceURI | String | Το URI του ονοματοχώρου για αντιστοίχιση. |

### ReturnValue

Μια [XmlNodeList](../../xmlnodelist/) που περιέχει μια λίστα με όλους τους αντιστοιχισμένους κόμβους. Η λίστα είναι κενή εάν δεν υπάρχουν αντιστοιχισμένοι κόμβοι.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Επιστρέφει μια [XmlNodeList](../../xmlnodelist/) που περιέχει μια λίστα με όλα τα απογόνους στοιχεία που ταιριάζουν με το καθορισμένο [XmlElement::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | String | Η ετικέτα ονόματος για αντιστοίχιση. Αυτό είναι ένα πλήρες όνομα. Συμφωνεί με την τιμή **get_Name** του αντιστοιχισμένου κόμβου. Το αστερίσκο (*) είναι μια ειδική τιμή που ταιριάζει με όλες τις ετικέτες. |

### ReturnValue

Μια [XmlNodeList](../../xmlnodelist/) που περιέχει μια λίστα με όλους τους αντιστοιχισμένους κόμβους. Η λίστα είναι κενή εάν δεν υπάρχουν αντιστοιχισμένοι κόμβοι.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

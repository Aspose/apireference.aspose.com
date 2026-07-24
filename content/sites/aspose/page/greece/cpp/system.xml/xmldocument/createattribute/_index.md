---
title: "System::Xml::XmlDocument::CreateAttribute μέθοδος"
linktitle: "CreateAttribute"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDocument::CreateAttribute μέθοδος. Δημιουργεί ένα XmlAttribute με το καθορισμένο όνομα σε C++."
type: docs
weight: 300
url: /el/cpp/system.xml/xmldocument/createattribute/
---
## XmlDocument::CreateAttribute(const String\&) method


Δημιουργεί ένα [XmlAttribute](../../xmlattribute/) με το καθορισμένο όνομα.

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| name | const String\& | Το πλήρες όνομα του χαρακτηριστικού. Εάν το όνομα περιέχει άνω-κάτω τελεία, η τιμή του [XmlNode::get_Prefix](../../xmlnode/get_prefix/) αντικατοπτρίζει το τμήμα του ονόματος που προηγείται της πρώτης άνω-κάτω τελείας και η τιμή του [XmlDocument::get_LocalName](../get_localname/) αντικατοπτρίζει το τμήμα του ονόματος που ακολουθεί την πρώτη άνω-κάτω τελεία. Η τιμή του [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) παραμένει κενή εκτός εάν το πρόθεμα είναι αναγνωρισμένο ενσωματωμένο πρόθεμα όπως **xmlns**. Σε αυτήν την περίπτωση το get_NamespaceURI έχει τιμή [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Το νέο [XmlAttribute](../../xmlattribute/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&, const String\&) method


Δημιουργεί ένα [XmlAttribute](../../xmlattribute/) με το καθορισμένο [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/) και [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| prefix | const String\& | Το πρόθεμα του χαρακτηριστικού (εάν υπάρχει). [String::Empty](../../../system/string/empty/) και **nullptr** είναι ισοδύναμα. |
| localName | const String\& | Το τοπικό όνομα του χαρακτηριστικού. |
| namespaceURI | const String\& | Το URI του ονοματοχώρου του χαρακτηριστικού (εάν υπάρχει). [String::Empty](../../../system/string/empty/) και **nullptr** είναι ισοδύναμα. Εάν το **prefix** είναι **xmlns**, τότε αυτή η παράμετρος πρέπει να είναι [http://www.w3.org/2000/xmlns/;](http://www.w3.org/2000/xmlns/;) διαφορετικά ρίχνεται εξαίρεση. |

### ReturnValue

Το νέο [XmlAttribute](../../xmlattribute/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateAttribute(const String\&, const String\&) method


Δημιουργεί ένα [XmlAttribute](../../xmlattribute/) με το καθορισμένο πλήρες όνομα και [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlAttribute> System::Xml::XmlDocument::CreateAttribute(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| qualifiedName | const String\& | Το πλήρες όνομα του χαρακτηριστικού. Εάν το όνομα περιέχει άνω-κάτω τελεία, η τιμή του [XmlNode::get_Prefix](../../xmlnode/get_prefix/) θα αντικατοπτρίζει το τμήμα του ονόματος που προηγείται της άνω-κάτω τελείας και η τιμή του [XmlDocument::get_LocalName](../get_localname/) θα αντικατοπτρίζει το τμήμα του ονόματος μετά την άνω-κάτω τελεία. |
| namespaceURI | const String\& | Το namespaceURI του χαρακτηριστικού. Εάν το πλήρες όνομα περιλαμβάνει πρόθεμα **xmlns**, τότε αυτή η παράμετρος πρέπει να είναι [http://www.w3.org/2000/xmlns/](http://www.w3.org/2000/xmlns/). |

### ReturnValue

Το νέο [XmlAttribute](../../xmlattribute/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

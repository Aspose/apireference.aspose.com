---
title: "System::Xml::XmlDocument::CreateElement method"
linktitle: "CreateElement"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlDocument::CreateElement method. Δημιουργεί ένα στοιχείο με το καθορισμένο όνομα σε C++."
type: docs
weight: 800
url: /el/cpp/system.xml/xmldocument/createelement/
---
## XmlDocument::CreateElement(const String\&) method


Δημιουργεί ένα στοιχείο με το καθορισμένο όνομα.

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &name)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| name | const String\& | Το πλήρες όνομα του στοιχείου. Εάν το όνομα περιέχει άνω-κάτω τελεία, τότε η τιμή [XmlNode::get_Prefix](../../xmlnode/get_prefix/) αντικατοπτρίζει το τμήμα του ονόματος πριν από την άνω-κάτω τελεία και η τιμή [XmlDocument::get_LocalName](../get_localname/) αντικατοπτρίζει το τμήμα του ονόματος μετά την άνω-κάτω τελεία. Το πλήρες όνομα δεν μπορεί να περιλαμβάνει πρόθεμα **xmlns**. |

### ReturnValue

Το νέο [XmlElement](../../xmlelement/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&, const String\&) method


Δημιουργεί ένα στοιχείο με το καθορισμένο [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_LocalName](../get_localname/), και [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &prefix, const String &localName, const String &namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| prefix | const String\& | Το πρόθεμα του νέου στοιχείου (εάν υπάρχει). [String::Empty](../../../system/string/empty/) και **nullptr** είναι ισοδύναμα. |
| localName | const String\& | Το τοπικό όνομα του νέου στοιχείου. |
| namespaceURI | const String\& | Το URI του ονόματος χώρου του νέου στοιχείου (εάν υπάρχει). [String::Empty](../../../system/string/empty/) και **nullptr** είναι ισοδύναμα. |

### ReturnValue

Το νέο [XmlElement](../../xmlelement/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateElement(const String\&, const String\&) method


Δημιουργεί ένα [XmlElement](../../xmlelement/) με το πλήρες όνομα και το [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
SharedPtr<XmlElement> System::Xml::XmlDocument::CreateElement(const String &qualifiedName, const String &namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| qualifiedName | const String\& | Το πλήρες όνομα του στοιχείου. Εάν το όνομα περιέχει άνω τελεία, τότε η τιμή του [XmlNode::get_Prefix](../../xmlnode/get_prefix/) θα αντικατοπτρίζει το τμήμα του ονόματος που προηγείται της άνω τελείας και η τιμή του [XmlDocument::get_LocalName](../get_localname/) θα αντικατοπτρίζει το τμήμα του ονόματος που ακολουθεί την άνω τελεία. Το πλήρες όνομα δεν μπορεί να περιλαμβάνει πρόθεμα **xmlns**. |
| namespaceURI | const String\& | Το URI του χώρου ονομάτων του στοιχείου. |

### ReturnValue

Το νέο [XmlElement](../../xmlelement/).

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

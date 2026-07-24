---
title: "System::Xml::XmlReader::ReadElementContentAs μέθοδος"
linktitle: "ReadElementContentAs"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::ReadElementContentAs μέθοδος. Διαβάζει το περιεχόμενο του στοιχείου ως τον ζητούμενο τύπο σε C++."
type: docs
weight: 5200
url: /el/cpp/system.xml/xmlreader/readelementcontentas/
---
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) method


Διαβάζει το περιεχόμενο του στοιχείου ως τον ζητούμενο τύπο.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| returnType | const TypeInfo\& | Ο τύπος της τιμής που θα επιστραφεί. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Ένα αντικείμενο [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση τυχόν προθεμάτων ονομάτων χώρου που σχετίζονται με τη μετατροπή τύπου. |

### ReturnValue

Το περιεχόμενο του στοιχείου μετατρεπόμενο στο ζητούμενο αντικείμενο τύπου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadElementContentAs(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) method


Ελέγχει ότι το καθορισμένο τοπικό όνομα και το URI του ονοματοχώρου ταιριάζουν με αυτά του τρέχοντος στοιχείου, στη συνέχεια διαβάζει το περιεχόμενο του στοιχείου ως τον ζητούμενο τύπο.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadElementContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver, String localName, String namespaceURI)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| returnType | const TypeInfo\& | Ο τύπος της τιμής που θα επιστραφεί. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Ένα αντικείμενο [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση τυχόν προθεμάτων ονομάτων χώρου που σχετίζονται με τη μετατροπή τύπου. |
| localName | String | Το τοπικό όνομα του στοιχείου. |
| namespaceURI | String | Το URI του χώρου ονομάτων του στοιχείου. |

### ReturnValue

Το περιεχόμενο του στοιχείου μετατρεπόμενο στο ζητούμενο αντικείμενο τύπου.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

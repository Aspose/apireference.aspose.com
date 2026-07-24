---
title: "System::Xml::XmlReader::ReadContentAs μέθοδος"
linktitle: "ReadContentAs"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Xml::XmlReader::ReadContentAs. Διαβάζει το περιεχόμενο ως αντικείμενο του τύπου που καθορίζεται σε C++."
type: docs
weight: 3900
url: /el/cpp/system.xml/xmlreader/readcontentas/
---
## XmlReader::ReadContentAs method


Διαβάζει το περιεχόμενο ως ένα αντικείμενο του καθορισμένου τύπου.

```cpp
virtual SharedPtr<Object> System::Xml::XmlReader::ReadContentAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> namespaceResolver)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| returnType | const TypeInfo\& | Ο τύπος της τιμής που θα επιστραφεί. |
| namespaceResolver | SharedPtr\<IXmlNamespaceResolver\> | Ένα αντικείμενο [IXmlNamespaceResolver](../../ixmlnamespaceresolver/) που χρησιμοποιείται για την επίλυση τυχόν προθεμάτων ονοματοχώρου που σχετίζονται με τη μετατροπή τύπου. Για παράδειγμα, αυτό μπορεί να χρησιμοποιηθεί κατά τη μετατροπή ενός αντικειμένου [XmlQualifiedName](../../xmlqualifiedname/) σε **xs:string**. Αυτή η τιμή μπορεί να είναι **nullptr**. |

### ReturnValue

Το συνενωμένο κείμενο ή η τιμή του χαρακτηριστικού που μετατράπηκε στον ζητούμενο τύπο.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../ixmlnamespaceresolver/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

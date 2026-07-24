---
title: "System::Xml::XmlAttribute::PrependChild μέθοδος"
linktitle: "PrependChild"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlAttribute::PrependChild μέθοδος. Προσθέτει τον καθορισμένο κόμβο στην αρχή της λίστας των θυγατρικών κόμβων για αυτόν τον κόμβο σε C++."
type: docs
weight: 1600
url: /el/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


Προσθέτει τον καθορισμένο κόμβο στην αρχή της λίστας των υποκόμβων για αυτόν τον κόμβο.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Το [XmlNode](../../xmlnode/) προς προσθήκη. Εάν είναι ένα [XmlDocumentFragment](../../xmldocumentfragment/), το πλήρες περιεχόμενο του τμήματος εγγράφου μετακινείται στη λίστα των θυγατρικών κόμβων αυτού του κόμβου. |

### ReturnValue

Ο [XmlNode](../../xmlnode/) που προστέθηκε.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

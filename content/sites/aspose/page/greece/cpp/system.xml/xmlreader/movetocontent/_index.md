---
title: "System::Xml::XmlReader::MoveToContent method"
linktitle: "MoveToContent"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::MoveToContent μέθοδος. Ελέγχει αν ο τρέχων κόμβος είναι κόμβος περιεχομένου (κείμενο χωρίς λευκούς χαρακτήρες, CDATA, Element, EndElement, EntityReference ή EndEntity). Εάν ο κόμβος δεν είναι κόμβος περιεχομένου, ο αναγνώστης παραλείπει προς τον επόμενο κόμβο περιεχομένου ή το τέλος του αρχείου. Παραλείπει κόμβους των ακόλουθων τύπων: ProcessingInstruction, DocumentType, Comment, Whitespace ή SignificantWhitespace σε C++."
type: docs
weight: 3300
url: /el/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


Ελέγχει εάν ο τρέχων κόμβος είναι κόμβος περιεχομένου (μη κενό κείμενο, **CDATA**, **Element**, **EndElement**, **EntityReference**, ή **EndEntity**). Εάν ο κόμβος δεν είναι κόμβος περιεχομένου, ο αναγνώστης παραλείπει προς τον επόμενο κόμβο περιεχομένου ή το τέλος του αρχείου. Παραλείπει κόμβους των ακόλουθων τύπων: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, ή **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

Η τιμή [XmlReader::get_NodeType](../get_nodetype/) του τρέχοντος κόμβου που βρέθηκε από τη μέθοδο ή [XmlNodeType::None](../../xmlnodetype/) εάν ο αναγνώστης έχει φτάσει στο τέλος της ροής εισόδου.

## Δείτε επίσης

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Xml::XmlTextWriter::WriteDocType μέθοδος"
linktitle: "WriteDocType"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlTextWriter::WriteDocType μέθοδος. Γράφει τη δήλωση DOCTYPE με το καθορισμένο όνομα και προαιρετικά χαρακτηριστικά σε C++."
type: docs
weight: 2500
url: /el/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


Γράφει τη δήλωση DOCTYPE με το καθορισμένο όνομα και προαιρετικές ιδιότητες.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | const String\& | Το όνομα του DOCTYPE. Πρέπει να μην είναι κενό. |
| pubid | const String\& | Αν δεν είναι null, γράφει επίσης PUBLIC "pubid" "sysid" όπου **pubid** και **sysid** αντικαθίστανται με την τιμή των δεδομένων ορισμάτων. |
| sysid | const String\& | Αν το **pubid** είναι null και το **sysid** δεν είναι null, γράφει SYSTEM "sysid" όπου **sysid** αντικαθίσταται με την τιμή αυτού του ορίσματος. |
| subset | const String\& | Αν δεν είναι null, γράφει [subset] όπου το subset αντικαθίσταται με την τιμή αυτού του ορίσματος. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Xml::XmlWriter::WriteDocType μέθοδος"
linktitle: "WriteDocType"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlWriter::WriteDocType μέθοδος. Όταν παρακαμφθεί σε μια κληρονομημένη κλάση, γράφει τη δήλωση DOCTYPE με το καθορισμένο όνομα και προαιρετικά χαρακτηριστικά σε C++."
type: docs
weight: 1700
url: /el/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


Όταν αντικαθίσταται σε μια παράγωγη κλάση, γράφει τη δήλωση DOCTYPE με το καθορισμένο όνομα και προαιρετικά χαρακτηριστικά.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| όνομα | const String\& | Το όνομα του DOCTYPE. Πρέπει να μην είναι κενό. |
| pubid | const String\& | Αν δεν είναι null, γράφει επίσης PUBLIC "pubid" "sysid" όπου **pubid** και **sysid** αντικαθίστανται με την τιμή των δεδομένων ορισμάτων. |
| sysid | const String\& | Αν το **pubid** είναι **nullptr** και το **sysid** δεν είναι μηδενικό, γράφει SYSTEM "sysid" όπου το **sysid** αντικαθίσταται με την τιμή αυτού του ορίσματος. |
| subset | const String\& | Αν δεν είναι null, γράφει [subset] όπου το subset αντικαθίσταται με την τιμή αυτού του ορίσματος. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

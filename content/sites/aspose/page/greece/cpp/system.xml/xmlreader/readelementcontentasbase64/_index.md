---
title: "System::Xml::XmlReader::ReadElementContentAsBase64 μέθοδος"
linktitle: "ReadElementContentAsBase64"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReader::ReadElementContentAsBase64 μέθοδος. Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο Base64 σε C++."
type: docs
weight: 5300
url: /el/cpp/system.xml/xmlreader/readelementcontentasbase64/
---
## XmlReader::ReadElementContentAsBase64 method


Διαβάζει το στοιχείο και αποκωδικοποιεί το περιεχόμενο **Base64**.

```cpp
virtual int32_t System::Xml::XmlReader::ReadElementContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προσωρινή μνήμη | ArrayPtr\<uint8_t\> | Το buffer στο οποίο θα αντιγραφεί το παραγόμενο κείμενο. Αυτή η τιμή δεν μπορεί να είναι **nullptr**. |
| δείκτης | int32_t | Η μετατόπιση στο buffer όπου θα ξεκινήσει η αντιγραφή του αποτελέσματος. |
| count | int32_t | Ο μέγιστος αριθμός byte που θα αντιγραφούν στο buffer. Ο πραγματικός αριθμός των αντιγραμμένων byte επιστρέφεται από αυτή τη μέθοδο. |

### ReturnValue

Ο αριθμός των byte που γράφτηκαν στο buffer.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

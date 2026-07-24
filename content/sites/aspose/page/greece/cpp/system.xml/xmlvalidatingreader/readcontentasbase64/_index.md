---
title: "System::Xml::XmlValidatingReader::ReadContentAsBase64 μέθοδος"
linktitle: "ReadContentAsBase64"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlValidatingReader::ReadContentAsBase64 μέθοδος. Διαβάζει το περιεχόμενο και επιστρέφει τα δυαδικά byte που αποκωδικοποιήθηκαν από Base64 σε C++."
type: docs
weight: 4100
url: /el/cpp/system.xml/xmlvalidatingreader/readcontentasbase64/
---
## XmlValidatingReader::ReadContentAsBase64 method


Διαβάζει το περιεχόμενο και επιστρέφει τα δυαδικά bytes που αποκωδικοποιήθηκαν σε Base64.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadContentAsBase64(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

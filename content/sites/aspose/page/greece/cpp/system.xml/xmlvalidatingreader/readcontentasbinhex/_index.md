---
title: "System::Xml::XmlValidatingReader::ReadContentAsBinHex μέθοδος"
linktitle: "ReadContentAsBinHex"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlValidatingReader::ReadContentAsBinHex μέθοδος. Διαβάζει το περιεχόμενο και επιστρέφει τα δυαδικά bytes που αποκωδικοποιήθηκαν από BinHex σε C++."
type: docs
weight: 4200
url: /el/cpp/system.xml/xmlvalidatingreader/readcontentasbinhex/
---
## XmlValidatingReader::ReadContentAsBinHex method


Διαβάζει το περιεχόμενο και επιστρέφει τα δυαδικά bytes που αποκωδικοποιήθηκαν σε BinHex.

```cpp
int32_t System::Xml::XmlValidatingReader::ReadContentAsBinHex(ArrayPtr<uint8_t> buffer, int32_t index, int32_t count) override
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

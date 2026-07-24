---
title: "System::Xml::XmlReaderSettings::get_NameTable μέθοδος"
linktitle: "get_NameTable"
second_title: "Aspose.Page για C++"
description: "System::Xml::XmlReaderSettings::get_NameTable μέθοδος. Επιστρέφει το XmlNameTable που χρησιμοποιείται για ατομικές συγκρίσεις συμβολοσειρών σε C++."
type: docs
weight: 1500
url: /el/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


Επιστρέφει το [XmlNameTable](../../xmlnametable/) που χρησιμοποιείται για ατομικές συγκρίσεις συμβολοσειρών.

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

Το [XmlNameTable](../../xmlnametable/) που αποθηκεύει όλες τις ατομικές συμβολοσειρές που χρησιμοποιούνται από όλες τις [XmlReader](../../xmlreader/) αντιπροσωπείες που δημιουργούνται χρησιμοποιώντας αυτό το αντικείμενο [XmlReaderSettings](../). Η προεπιλογή είναι **nullptr**. Η δημιουργημένη [XmlReader](../../xmlreader/) αντιπροσωπία θα χρησιμοποιήσει ένα νέο κενό [NameTable](../../nametable/) εάν αυτή η τιμή είναι **nullptr**.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Xml::XmlReaderSettings::get_NameTable method"
linktitle: "get_NameTable"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlReaderSettings::get_NameTable method. Restituisce l'XmlNameTable utilizzato per i confronti di stringhe atomizzate in C++."
type: docs
weight: 1500
url: /it/cpp/system.xml/xmlreadersettings/get_nametable/
---
## XmlReaderSettings::get_NameTable method


Restituisce il [XmlNameTable](../../xmlnametable/) utilizzato per i confronti di stringhe atomizzate.

```cpp
SharedPtr<XmlNameTable> System::Xml::XmlReaderSettings::get_NameTable()
```


### ReturnValue

Il [XmlNameTable](../../xmlnametable/) che memorizza tutte le stringhe atomizzate utilizzate da tutte le istanze di [XmlReader](../../xmlreader/) create con questo oggetto [XmlReaderSettings](../). Il valore predefinito è **nullptr**. L'istanza di [XmlReader](../../xmlreader/) creata utilizzerà un nuovo [NameTable](../../nametable/) vuoto se questo valore è **nullptr**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlReaderSettings](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

---
title: "System::Xml::XmlWriter::WriteDocType-Methode"
linktitle: "WriteDocType"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlWriter::WriteDocType-Methode. Wenn in einer abgeleiteten Klasse überschrieben, schreibt sie die DOCTYPE‑Deklaration mit dem angegebenen Namen und optionalen Attributen in C++."
type: docs
weight: 1700
url: /de/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


Wenn in einer abgeleiteten Klasse überschrieben, schreibt die DOCTYPE‑Deklaration mit dem angegebenen Namen und optionalen Attributen.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | const String\& | Der Name des DOCTYPE. Dieser darf nicht leer sein. |
| pubid | const String\& | Falls nicht null, schreibt es außerdem PUBLIC \"pubid\" \"sysid\", wobei **pubid** und **sysid** durch den Wert der übergebenen Argumente ersetzt werden. |
| sysid | const String\& | Wenn **pubid** **nullptr** ist und **sysid** nicht null ist, schreibt es SYSTEM "sysid", wobei **sysid** durch den Wert dieses Arguments ersetzt wird. |
| subset | const String\& | Wenn nicht null, schreibt es [subset], wobei subset durch den Wert dieses Arguments ersetzt wird. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

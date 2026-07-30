---
title: "System::Xml::XmlTextWriter::WriteDocType Methode"
linktitle: "WriteDocType"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlTextWriter::WriteDocType Methode. Schreibt die DOCTYPE‑Deklaration mit dem angegebenen Namen und optionalen Attributen in C++."
type: docs
weight: 2500
url: /de/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


Schreibt die DOCTYPE-Deklaration mit dem angegebenen Namen und optionalen Attributen.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | const String\& | Der Name des DOCTYPE. Dieser darf nicht leer sein. |
| pubid | const String\& | Falls nicht null, schreibt es außerdem PUBLIC \"pubid\" \"sysid\", wobei **pubid** und **sysid** durch den Wert der übergebenen Argumente ersetzt werden. |
| sysid | const String\& | Wenn **pubid** null ist und **sysid** nicht null ist, schreibt es SYSTEM "sysid", wobei **sysid** durch den Wert dieses Arguments ersetzt wird. |
| subset | const String\& | Wenn nicht null, schreibt es [subset], wobei subset durch den Wert dieses Arguments ersetzt wird. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

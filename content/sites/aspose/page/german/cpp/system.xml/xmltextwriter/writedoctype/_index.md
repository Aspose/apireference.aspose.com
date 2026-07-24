---
title: "System::Xml::XmlTextWriter::WriteDocType-Methode"
linktitle: "WriteDocType"
second_title: "Aspose.Page für C++"
description: "System::Xml::XmlTextWriter::WriteDocType-Methode. Schreibt die DOCTYPE-Deklaration mit dem angegebenen Namen und optionalen Attributen in C++."
type: docs
weight: 2500
url: /de/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


Schreibt die DOCTYPE‑Deklaration mit dem angegebenen Namen und optionalen Attributen.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | const String\& | Der Name des DOCTYPE. Dieser darf nicht leer sein. |
| pubid | const String\& | Falls nicht null, schreibt es außerdem PUBLIC "pubid" "sysid", wobei **pubid** und **sysid** durch die Werte der übergebenen Argumente ersetzt werden. |
| sysid | const String\& | Falls **pubid** null ist und **sysid** nicht null ist, schreibt es SYSTEM "sysid", wobei **sysid** durch den Wert dieses Arguments ersetzt wird. |
| subset | const String\& | Falls nicht null, schreibt es [subset], wobei subset durch den Wert dieses Arguments ersetzt wird. |

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

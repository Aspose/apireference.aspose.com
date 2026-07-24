---
title: "System::Xml::XmlTextWriter::WriteDocType methode"
linktitle: "WriteDocType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlTextWriter::WriteDocType methode. Schrijft de DOCTYPE-declaratie met de opgegeven naam en optionele attributen in C++."
type: docs
weight: 2500
url: /nl/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


Schrijft de DOCTYPE-declaratie met de opgegeven naam en optionele attributen.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | const String\& | De naam van de DOCTYPE. Deze mag niet leeg zijn. |
| pubid | const String\& | Als niet-null schrijft het ook PUBLIC "pubid" "sysid" waarbij **pubid** en **sysid** worden vervangen door de waarde van de opgegeven argumenten. |
| sysid | const String\& | Als **pubid** null is en **sysid** niet-null, schrijft het SYSTEM "sysid" waarbij **sysid** wordt vervangen door de waarde van dit argument. |
| subset | const String\& | Als niet-null schrijft het [subset] waarbij subset wordt vervangen door de waarde van dit argument. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

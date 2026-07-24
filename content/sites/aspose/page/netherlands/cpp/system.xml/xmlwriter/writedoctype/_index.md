---
title: "System::Xml::XmlWriter::WriteDocType methode"
linktitle: "WriteDocType"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlWriter::WriteDocType methode. Wanneer overschreven in een afgeleide klasse, schrijft het de DOCTYPE-declaratie met de opgegeven naam en optionele attributen in C++."
type: docs
weight: 1700
url: /nl/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


Wanneer overschreven in een afgeleide klasse, schrijft de DOCTYPE‑declaratie met de opgegeven naam en optionele attributen.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | const String\& | De naam van de DOCTYPE. Deze mag niet leeg zijn. |
| pubid | const String\& | Als niet-null schrijft het ook PUBLIC "pubid" "sysid" waarbij **pubid** en **sysid** worden vervangen door de waarde van de opgegeven argumenten. |
| sysid | const String\& | Als **pubid** **nullptr** is en **sysid** niet‑null is, schrijft het SYSTEM \"sysid\" waarbij **sysid** wordt vervangen door de waarde van dit argument. |
| subset | const String\& | Als niet-null schrijft het [subset] waarbij subset wordt vervangen door de waarde van dit argument. |

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

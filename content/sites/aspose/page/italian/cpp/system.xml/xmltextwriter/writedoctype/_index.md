---
title: "System::Xml::XmlTextWriter::WriteDocType metodo"
linktitle: "WriteDocType"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlTextWriter::WriteDocType metodo. Scrive la dichiarazione DOCTYPE con il nome specificato e gli attributi opzionali in C++."
type: docs
weight: 2500
url: /it/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


Scrive la dichiarazione DOCTYPE con il nome specificato e gli attributi opzionali.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | const String\& | Il nome del DOCTYPE. Deve essere non vuoto. |
| pubid | const String\& | Se non nullo scrive anche PUBLIC "pubid" "sysid" dove **pubid** e **sysid** sono sostituiti con il valore degli argomenti forniti. |
| sysid | const String\& | Se **pubid** è nullo e **sysid** è non nullo scrive SYSTEM "sysid" dove **sysid** è sostituito con il valore di questo argomento. |
| subset | const String\& | Se non nullo scrive [subset] dove subset è sostituito con il valore di questo argomento. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

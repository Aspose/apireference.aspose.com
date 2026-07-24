---
title: "Metodo System::Xml::XmlWriter::WriteDocType"
linktitle: "WriteDocType"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::XmlWriter::WriteDocType. Quando sovrascritto in una classe derivata, scrive la dichiarazione DOCTYPE con il nome specificato e gli attributi opzionali in C++."
type: docs
weight: 1700
url: /it/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


Quando sovrascritto in una classe derivata, scrive la dichiarazione DOCTYPE con il nome specificato e gli attributi opzionali.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| name | const String\& | Il nome del DOCTYPE. Deve essere non vuoto. |
| pubid | const String\& | Se non nullo scrive anche PUBLIC "pubid" "sysid" dove **pubid** e **sysid** sono sostituiti con il valore degli argomenti forniti. |
| sysid | const String\& | Se **pubid** è **nullptr** e **sysid** è non nullo, scrive SYSTEM \"sysid\" dove **sysid** è sostituito con il valore di questo argomento. |
| subset | const String\& | Se non nullo scrive [subset] dove subset è sostituito con il valore di questo argomento. |

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)

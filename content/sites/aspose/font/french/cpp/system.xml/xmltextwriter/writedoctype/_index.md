---
title: "System::Xml::XmlTextWriter::WriteDocType méthode"
linktitle: "WriteDocType"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlTextWriter::WriteDocType méthode. Écrit la déclaration DOCTYPE avec le nom spécifié et les attributs optionnels en C++."
type: docs
weight: 2500
url: /fr/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


Écrit la déclaration DOCTYPE avec le nom spécifié et les attributs optionnels.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | const String\& | Le nom du DOCTYPE. Il doit être non vide. |
| pubid | const String\& | Si non nul, il écrit également PUBLIC "pubid" "sysid" où **pubid** et **sysid** sont remplacés par la valeur des arguments fournis. |
| sysid | const String\& | Si **pubid** est nul et que **sysid** n'est pas nul, il écrit SYSTEM "sysid" où **sysid** est remplacé par la valeur de cet argument. |
| subset | const String\& | Si non nul, il écrit [subset] où subset est remplacé par la valeur de cet argument. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

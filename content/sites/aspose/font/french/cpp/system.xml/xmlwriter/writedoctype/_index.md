---
title: "Méthode System::Xml::XmlWriter::WriteDocType"
linktitle: "WriteDocType"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlWriter::WriteDocType. Lorsqu'elle est remplacée dans une classe dérivée, écrit la déclaration DOCTYPE avec le nom spécifié et les attributs optionnels en C++."
type: docs
weight: 1700
url: /fr/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


Lorsqu'il est remplacé dans une classe dérivée, écrit la déclaration DOCTYPE avec le nom spécifié et les attributs optionnels.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nom | const String\& | Le nom du DOCTYPE. Il doit être non vide. |
| pubid | const String\& | Si non nul, il écrit également PUBLIC "pubid" "sysid" où **pubid** et **sysid** sont remplacés par la valeur des arguments fournis. |
| sysid | const String\& | Si **pubid** est **nullptr** et que **sysid** n'est pas nul, il écrit SYSTEM "sysid" où **sysid** est remplacé par la valeur de cet argument. |
| subset | const String\& | Si non nul, il écrit [subset] où subset est remplacé par la valeur de cet argument. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)

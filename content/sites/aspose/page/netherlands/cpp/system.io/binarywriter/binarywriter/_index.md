---
title: "System::IO::BinaryWriter::BinaryWriter constructor"
linktitle: "BinaryWriter"
second_title: "Aspose.Page voor C++"
description: "System::IO::BinaryWriter::BinaryWriter-constructor. Construeert een exemplaar van de BinaryWriter-klasse die gegevens schrijft naar de opgegeven stream met behulp van de opgegeven codering in C++."
type: docs
weight: 100
url: /nl/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


Construeert een instantie van de [BinaryWriter](../)-klasse die gegevens naar de opgegeven stream schrijft met de opgegeven codering.

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| stream | const StreamPtr\& | De uitvoerstream |
| encoding | const EncodingPtr\& | De te gebruiken codering |
| leaveopen | bool | Specificeert of de stream **stream** open moet blijven (true) nadat het huidige object is vrijgegeven of niet (false) |

## Zie ook

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

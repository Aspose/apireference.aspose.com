---
title: "System::IO::BinaryWriter::BinaryWriter-Konstruktor"
linktitle: "BinaryWriter"
second_title: "Aspose.Font für C++"
description: "System::IO::BinaryWriter::BinaryWriter-Konstruktor. Erstellt eine Instanz der Klasse BinaryWriter, die Daten in den angegebenen Stream unter Verwendung der angegebenen Kodierung in C++ schreibt."
type: docs
weight: 100
url: /de/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


Erstellt eine Instanz der Klasse [BinaryWriter](../), die Daten in den angegebenen Stream unter Verwendung der angegebenen Kodierung schreibt.

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Stream | const StreamPtr\& | Der Ausgabestream |
| encoding | const EncodingPtr\& | Die zu verwendende Kodierung |
| leaveopen | bool | Gibt an, ob der Stream **stream** nach der Entsorgung des aktuellen Objekts offen bleiben soll (true) oder nicht (false). |

## Siehe auch

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

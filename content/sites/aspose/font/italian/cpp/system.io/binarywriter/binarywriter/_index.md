---
title: "System::IO::BinaryWriter::BinaryWriter costruttore"
linktitle: "BinaryWriter"
second_title: "Aspose.Font per C++"
description: "System::IO::BinaryWriter::BinaryWriter costruttore. Crea un'istanza della classe BinaryWriter che scrive dati sul flusso specificato usando la codifica specificata in C++."
type: docs
weight: 100
url: /it/cpp/system.io/binarywriter/binarywriter/
---
## BinaryWriter::BinaryWriter constructor


Crea un'istanza della classe [BinaryWriter](../) che scrive dati sul flusso specificato usando la codifica specificata.

```cpp
System::IO::BinaryWriter::BinaryWriter(const StreamPtr &stream, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked(), bool leaveopen=false)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const StreamPtr\& | Il flusso di output |
| encoding | const EncodingPtr\& | La codifica da utilizzare |
| leaveopen | bool | Specifica se il flusso **stream** deve rimanere aperto (true) dopo che l'oggetto corrente è stato smaltito o no (false) |

## Vedi anche

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [BinaryWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

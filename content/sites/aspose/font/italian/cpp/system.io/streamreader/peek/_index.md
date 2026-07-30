---
title: "Metodo System::IO::StreamReader::Peek"
linktitle: "Peek"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::StreamReader::Peek. Legge un singolo carattere dallo stream senza modificare il cursore di lettura dello stream in C++."
type: docs
weight: 800
url: /it/cpp/system.io/streamreader/peek/
---
## StreamReader::Peek method


Legge un singolo carattere dal flusso senza modificare il cursore di lettura del flusso.

```cpp
virtual int System::IO::StreamReader::Peek() override
```


### ReturnValue

Leggi il carattere codificato con la codifica UTF-16; se il carattere letto è rappresentato da due codepoint nella codifica UTF-16, allora viene restituito solo il surragate alto; se non è stato letto alcun carattere, viene restituito -1.

## Vedi anche

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

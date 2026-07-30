---
title: "System::IO::File::Create metodo"
linktitle: "Create"
second_title: "Aspose.Font per C++"
description: "System::IO::File::Create metodo. Crea un nuovo file (o sovrascrive quello esistente) e lo apre per accesso in lettura e scrittura utilizzando la dimensione del buffer e le opzioni specificate in C++."
type: docs
weight: 500
url: /it/cpp/system.io/file/create/
---
## File::Create method


Crea un nuovo file (o sovrascrive quello esistente) e lo apre per lettura e scrittura usando la dimensione del buffer e le opzioni specificate.

```cpp
static FileStreamPtr System::IO::File::Create(const String &path, int32_t bufferSize=DefaultBufferSize, FileOptions options=FileOptions::None)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file da creare o sovrascrivere |
| bufferSize | int32_t | Il numero di byte memorizzati nel buffer durante la lettura e la scrittura del file |
| opzioni | FileOptions | Specifica come creare o sovrascrivere il file |

### ReturnValue

Un puntatore condiviso all'oggetto [FileStream](../../filestream/) associato al file specificato

## Vedi anche

* Typedef [FileStreamPtr](../../../system/filestreamptr/)
* Class [String](../../../system/string/)
* Enum [FileOptions](../../fileoptions/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

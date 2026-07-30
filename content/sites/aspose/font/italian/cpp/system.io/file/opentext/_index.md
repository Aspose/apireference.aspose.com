---
title: "Metodo System::IO::File::OpenText"
linktitle: "OpenText"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::File::OpenText. Apre il file esistente specificato per la lettura del testo usando la codifica UTF-8 senza condivisione in C++."
type: docs
weight: 2100
url: /it/cpp/system.io/file/opentext/
---
## File::OpenText method


Apre il file esistente specificato per leggere il testo usando la codifica UTF-8 senza condivisione.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file da aprire |
| encoding | const EncodingPtr\& | La codifica dei caratteri da utilizzare |

### ReturnValue

Un puntatore condiviso a un oggetto [StreamWriter](../../streamwriter/) associato al file aperto

## Vedi anche

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

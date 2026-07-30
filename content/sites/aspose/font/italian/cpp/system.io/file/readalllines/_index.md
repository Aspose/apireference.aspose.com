---
title: "Metodo System::IO::File::ReadAllLines"
linktitle: "ReadAllLines"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::File::ReadAllLines. Legge il contenuto del file di testo specificato riga per riga in un array di stringhe usando la codifica dei caratteri specificata in C++."
type: docs
weight: 2400
url: /it/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


Legge il contenuto del file di testo specificato riga per riga in un array di stringhe usando la codifica dei caratteri specificata.

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file da leggere |
| encoding | const EncodingPtr\& | La codifica dei caratteri da utilizzare |

### ReturnValue

Un array di stringhe in cui ogni elemento rappresenta una singola riga del file specificato

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

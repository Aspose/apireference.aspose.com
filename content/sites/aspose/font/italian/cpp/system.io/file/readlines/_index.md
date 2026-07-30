---
title: "System::IO::File::ReadLines method"
linktitle: "ReadLines"
second_title: "Aspose.Font per C++"
description: "System::IO::File::ReadLines method. Legge il contenuto del file di testo specificato riga per riga utilizzando la codifica dei caratteri specificata e restituisce una collezione enumerabile di stringhe, ciascuna delle quali rappresenta una singola riga del contenuto del file in C++."
type: docs
weight: 2600
url: /it/cpp/system.io/file/readlines/
---
## File::ReadLines method


Legge il contenuto del file di testo specificato riga per riga usando la codifica dei caratteri specificata e restituisce una collezione enumerabile di stringhe, ognuna delle quali rappresenta una singola riga del contenuto del file.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file da leggere |
| encoding | const EncodingPtr\& | La codifica dei caratteri da utilizzare |

### ReturnValue

Una collezione enumerabile di stringhe che rappresentano il contenuto del file specificato

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

---
title: "Metodo System::IO::File::AppendAllLines"
linktitle: "AppendAllLines"
second_title: "Aspose.Page per C++"
description: "Metodo System::IO::File::AppendAllLines. Aggiunge le stringhe dalla collezione di stringhe specificata al file specificato usando la codifica specificata, scrivendo ogni stringa in una nuova riga. Se il file specificato non esiste, viene creato. Il file viene chiuso dopo aver scritto tutte le stringhe in C++."
type: docs
weight: 100
url: /it/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


Aggiunge le stringhe dalla collezione di stringhe specificata al file specificato usando la codifica specificata, scrivendo ogni stringa in una nuova riga. Se il file specificato non esiste, viene creato. Il file viene chiuso dopo aver scritto tutte le stringhe.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il percorso del file a cui aggiungere le stringhe |
| contenuti | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Le stringhe da scrivere nel file |
| encoding | const EncodingPtr\& | La codifica dei caratteri da utilizzare |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

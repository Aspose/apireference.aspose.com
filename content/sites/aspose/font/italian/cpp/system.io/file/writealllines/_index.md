---
title: "System::IO::File::WriteAllLines method"
linktitle: "WriteAllLines"
second_title: "Aspose.Font per C++"
description: "System::IO::File::WriteAllLines method. Crea un nuovo file di testo o sovrascrive quello esistente e scrive tutte le stringhe dall'array di stringhe specificato, ogni stringa su una nuova riga, utilizzando la codifica specificata in C++."
type: docs
weight: 3600
url: /it/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Crea un nuovo file di testo o sovrascrive quello esistente e scrive tutte le stringhe dall'array di stringhe specificato nel file, ogni stringa su una nuova riga, usando la codifica specificata.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il file da creare o sovrascrivere |
| contenuti | const ArrayPtr\<String\>\& | Un array di stringhe |
| encoding | const EncodingPtr\& | La codifica dei caratteri da utilizzare |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Crea un nuovo file di testo o sovrascrive quello esistente e scrive tutte le stringhe dalla collezione enumerabile di stringhe specificata nel file, ogni stringa su una nuova riga, usando la codifica specificata.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percorso | const String\& | Il file da creare o sovrascrivere |
| contenuti | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Una collezione enumerabile di stringhe |
| encoding | const EncodingPtr\& | La codifica dei caratteri da utilizzare |

## Vedi anche

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

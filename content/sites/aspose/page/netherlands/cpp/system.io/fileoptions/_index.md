---
title: "System::IO::FileOptions enum"
linktitle: "FileOptions"
second_title: "Aspose.Page voor C++"
description: "System::IO::FileOptions enum. Vertegenwoordigt geavanceerde opties voor het aanmaken van een FileStream-object in C++."
type: docs
weight: 3200
url: /nl/cpp/system.io/fileoptions/
---
## FileOptions enum


Vertegenwoordigt geavanceerde opties voor het aanmaken van een [FileStream](../filestream/) object.

```cpp
enum class FileOptions
```

### Waarden

| Naam | Waarde | Beschrijving |
| --- | --- | --- |
| None | 0 | Geen extra opties. |
| Encrypted | 16384 | Het bestand is versleuteld. NIET GEREALISEERD. |
| DeleteOnClose | 67108864 | Het bestand moet automatisch worden verwijderd wanneer het niet meer in gebruik is. |
| SequentialScan | 134217728 | Het bestand moet sequentieel worden benaderd. |
| RandomAccess | 268435456 | Het bestand wordt willekeurig benaderd. |
| Asynchronous | 1073741824 | Het bestand kan worden gebruikt voor asynchrone I/O-bewerkingen. |
| WriteThrough | n/a | Alle schrijfbewerkingen moeten rechtstreeks naar de schijf gaan, waarbij elke tussenliggende cache wordt omzeild. |

## Zie ook

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

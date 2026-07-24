---
title: "System::IO::FileOptions enum"
linktitle: "FileOptions"
second_title: "Aspose.Page för C++"
description: "System::IO::FileOptions enum. Representerar avancerade alternativ för att skapa FileStream‑objekt i C++."
type: docs
weight: 3200
url: /sv/cpp/system.io/fileoptions/
---
## FileOptions enum


Representerar avancerade alternativ för att skapa [FileStream](../filestream/)‑objekt.

```cpp
enum class FileOptions
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| None | 0 | Inga ytterligare alternativ. |
| Encrypted | 16384 | Filen är krypterad. INTE IMPLEMENTERAT. |
| DeleteOnClose | 67108864 | Filen bör automatiskt tas bort när den inte längre används. |
| SequentialScan | 134217728 | Filen bör nås sekventiellt. |
| RandomAccess | 268435456 | Filen nås slumpmässigt. |
| Asynchronous | 1073741824 | Filen kan användas för asynkrona I/O‑operationer. |
| WriteThrough | n/a | Alla skrivningar bör gå direkt till disken och kringgå eventuell mellancache. |

## Se även

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

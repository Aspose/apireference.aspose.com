---
title: "System::IO::FileInfo::Replace metodo"
linktitle: "Sostituisci"
second_title: "Aspose.Font per C++"
description: "System::IO::FileInfo::Replace metodo. Sostituisce il contenuto di un file di destinazione specificato con il file rappresentato dall'oggetto FileInfo corrente e crea un backup del file sostituito in C++."
type: docs
weight: 2000
url: /it/cpp/system.io/fileinfo/replace/
---
## FileInfo::Replace(const String\&, const String\&) method


Sostituisce il contenuto di un file di destinazione specificato con il file rappresentato dall'oggetto [FileInfo](../) corrente e crea una copia di backup del file sostituito.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationFileName | const String\& | Un nome del file da sostituire |
| destinationBackupFileName | const String\& | Un nome del file di backup |

### ReturnValue

Un oggetto FileInfor che rappresenta il file a cui punta **destinationFileName**

## Vedi anche

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileInfo::Replace(const String\&, const String\&, bool) method


Sostituisce il contenuto di un file di destinazione specificato con il file rappresentato dall'oggetto [FileInfo](../) corrente e crea una copia di backup del file sostituito.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| destinationFileName | const String\& | Un nome del file da sostituire |
| destinationBackupFileName | const String\& | Un nome del file di backup |
| ignoreMetadataErrors | bool | Specifica se gli errori di unione dal file sostituito al file di sostituzione devono essere ignorati (true) o meno (false) |

### ReturnValue

Un oggetto FileInfor che rappresenta il file a cui punta **destinationFileName**

## Vedi anche

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

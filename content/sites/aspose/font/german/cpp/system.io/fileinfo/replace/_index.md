---
title: "System::IO::FileInfo::Replace Methode"
linktitle: "Ersetzen"
second_title: "Aspose.Font für C++"
description: "System::IO::FileInfo::Replace Methode. Ersetzt den Inhalt einer angegebenen Zieldatei durch die von dem aktuellen FileInfo-Objekt repräsentierte Datei und erstellt ein Backup der ersetzten Datei in C++."
type: docs
weight: 2000
url: /de/cpp/system.io/fileinfo/replace/
---
## FileInfo::Replace(const String\&, const String\&) method


Ersetzt den Inhalt einer angegebenen Zieldatei durch die Datei, die vom aktuellen [FileInfo](../)-Objekt repräsentiert wird, und erstellt eine Sicherungskopie der ersetzten Datei.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| destinationFileName | const String\& | Ein Name der zu ersetzenden Datei |
| destinationBackupFileName | const String\& | Ein Name der Sicherungsdatei |

### ReturnValue

Ein FileInfor-Objekt, das die Datei bezeichnet, auf die **destinationFileName** verweist.

## Siehe auch

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileInfo::Replace(const String\&, const String\&, bool) method


Ersetzt den Inhalt einer angegebenen Zieldatei durch die Datei, die vom aktuellen [FileInfo](../)-Objekt repräsentiert wird, und erstellt eine Sicherungskopie der ersetzten Datei.

```cpp
FileInfoPtr System::IO::FileInfo::Replace(const String &destinationFileName, const String &destinationBackupFileName, bool ignoreMetadataErrors)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| destinationFileName | const String\& | Ein Name der zu ersetzenden Datei |
| destinationBackupFileName | const String\& | Ein Name der Sicherungsdatei |
| ignoreMetadataErrors | bool | Gibt an, ob die Merge-Fehler von der ersetzten Datei zur Ersatzdatei ignoriert werden sollen (true) oder nicht (false). |

### ReturnValue

Ein FileInfor-Objekt, das die Datei bezeichnet, auf die **destinationFileName** verweist.

## Siehe auch

* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [FileInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

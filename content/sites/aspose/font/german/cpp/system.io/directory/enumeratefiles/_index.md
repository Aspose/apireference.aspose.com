---
title: "System::IO::Directory::EnumerateFiles Methode"
linktitle: "EnumerateFiles"
second_title: "Aspose.Font für C++"
description: "System::IO::Directory::EnumerateFiles Methode. Durchsucht die Dateien, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis verwurzelt ist, in C++."
type: docs
weight: 400
url: /de/cpp/system.io/directory/enumeratefiles/
---
## Directory::EnumerateFiles method


Durchsucht die Dateien, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis wurzelt.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Vollständiger oder relativer Pfad zum Verzeichnis, in dem gesucht werden soll |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien |
| searchOption | SearchOption | Gibt an, ob die Suche nur im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis verwurzelt ist, durchgeführt werden muss. |

### ReturnValue

Die aufzählbare Sammlung voller Pfade der gefundenen Dateien, deren Namen dem **searchPattern** entsprechen

## Siehe auch

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

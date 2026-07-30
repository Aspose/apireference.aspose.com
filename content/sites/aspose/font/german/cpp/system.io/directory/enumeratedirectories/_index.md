---
title: "System::IO::Directory::EnumerateDirectories Methode"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Font für C++"
description: "System::IO::Directory::EnumerateDirectories Methode. Durchsucht die Verzeichnisse, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis verwurzelt ist, in C++."
type: docs
weight: 300
url: /de/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


Durchsucht die Verzeichnisse, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis wurzelt.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Vollständiger oder relativer Pfad zum Verzeichnis, in dem gesucht werden soll |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Verzeichnisse |
| searchOption | SearchOption | Gibt an, ob die Suche nur im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis verwurzelt ist, durchgeführt werden muss. |

### ReturnValue

Die aufzählbare Sammlung von vollständigen Pfaden der gefundenen Verzeichnisse, deren Namen dem **searchPattern** entsprechen

## Siehe auch

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

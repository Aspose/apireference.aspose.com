---
title: "System::IO::Directory::GetFiles Methode"
linktitle: "GetFiles"
second_title: "Aspose.Font für C++"
description: "System::IO::Directory::GetFiles Methode. Durchsucht die Dateien, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis verwurzelt ist, in C++."
type: docs
weight: 1200
url: /de/cpp/system.io/directory/getfiles/
---
## Directory::GetFiles method


Durchsucht die Dateien, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis wurzelt.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Pfad | const String\& | Vollständiger oder relativer Pfad zum Verzeichnis, in dem gesucht werden soll |
| searchPattern | const String\& | Das Namensmuster der zu suchenden Dateien |
| searchOption | SearchOption | Gibt an, ob die Suche nur im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis verwurzelt ist, durchgeführt werden muss. |

### ReturnValue

Ein Array von vollständigen Pfaden der gefundenen Dateien, deren Namen dem **searchPattern** entsprechen

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

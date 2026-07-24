---
title: "System::IO::Directory::GetFileSystemEntries methode"
linktitle: "GetFileSystemEntries"
second_title: "Aspose.Page voor C++"
description: "System::IO::Directory::GetFileSystemEntries methode. Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld, in C++."
type: docs
weight: 1300
url: /nl/cpp/system.io/directory/getfilesystementries/
---
## Directory::GetFileSystemEntries method


Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld.

```cpp
static ArrayPtr<String> System::IO::Directory::GetFileSystemEntries(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Volledig of relatief pad naar de map waarin gezocht moet worden |
| searchPattern | const String\& | Het naampatroon van de bestanden en mappen waarnaar gezocht moet worden |
| searchOption | SearchOption | Specificeert of de zoekopdracht alleen in de opgegeven map moet worden uitgevoerd of in de volledige mappenboom die in de opgegeven map is geworteld |

### ReturnValue

Een array van volledige paden van de gevonden bestanden en mappen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

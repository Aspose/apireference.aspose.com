---
title: "System::IO::Directory::EnumerateDirectories methode"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Page voor C++"
description: "System::IO::Directory::EnumerateDirectories methode. Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria, ofwel in de opgegeven map of in de volledige mapstructuur die is geworteld in de opgegeven map in C++."
type: docs
weight: 300
url: /nl/cpp/system.io/directory/enumeratedirectories/
---
## Directory::EnumerateDirectories method


Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateDirectories(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Volledig of relatief pad naar de map waarin gezocht moet worden |
| searchPattern | const String\& | Het naampatroon van de mappen waarnaar gezocht moet worden. |
| searchOption | SearchOption | Specificeert of de zoekopdracht alleen in de opgegeven map moet worden uitgevoerd of in de volledige mappenboom die in de opgegeven map is geworteld |

### ReturnValue

De enumerabele collectie van volledige paden van de gevonden mappen waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

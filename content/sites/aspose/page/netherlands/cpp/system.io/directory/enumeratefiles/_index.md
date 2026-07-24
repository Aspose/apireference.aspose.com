---
title: "System::IO::Directory::EnumerateFiles methode"
linktitle: "EnumerateFiles"
second_title: "Aspose.Page voor C++"
description: "System::IO::Directory::EnumerateFiles methode. Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld, in C++."
type: docs
weight: 400
url: /nl/cpp/system.io/directory/enumeratefiles/
---
## Directory::EnumerateFiles method


Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld.

```cpp
static StringEnumerablePtr System::IO::Directory::EnumerateFiles(const String &path, const String &searchPattern=u"*", SearchOption searchOption=SearchOption::TopDirectoryOnly)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pad | const String\& | Volledig of relatief pad naar de map waarin gezocht moet worden |
| searchPattern | const String\& | Het naampatroon van de bestanden om naar te zoeken |
| searchOption | SearchOption | Specificeert of de zoekopdracht alleen in de opgegeven map moet worden uitgevoerd of in de volledige mappenboom die in de opgegeven map is geworteld |

### ReturnValue

De enumerabele collectie van volledige paden van de gevonden bestanden waarvan de namen overeenkomen met **searchPattern**

## Zie ook

* Typedef [StringEnumerablePtr](../stringenumerableptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [Directory](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

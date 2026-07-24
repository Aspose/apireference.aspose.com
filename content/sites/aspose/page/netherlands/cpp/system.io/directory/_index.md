---
title: "System::IO::Directory klasse"
linktitle: "Directory"
second_title: "Aspose.Page voor C++"
description: "System::IO::Directory klasse. Bevat methoden voor het manipuleren van mappen. Dit is een statisch type zonder instantie‑services. Je mag onder geen enkele omstandigheid instanties ervan maken in C++."
type: docs
weight: 1100
url: /nl/cpp/system.io/directory/
---
## Directory class


Bevat methoden voor het manipuleren van mappen. Dit is een statisch type zonder instantie‑services. Je mag onder geen enkele omstandigheid instanties ervan maken.

```cpp
class Directory
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | Maakt alle mappen aan in het opgegeven pad als deze niet bestaan. |
| static [Delete](./delete/)(const String\&, bool) | Verwijdert het opgegeven bestand of de opgegeven map. Werpt geen uitzondering. |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld. |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld. |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld. |
| static [Exists](./exists/)(const String\&) | Bepaalt of het opgegeven pad verwijst naar een bestaande map. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Retourneert de creatietijd van de opgegeven entiteit als lokale tijd. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Retourneert de creatietijd van de opgegeven entiteit als UTC‑tijd. |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | Retourneert de volledige naam (inclusief pad) van de huidige map. |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | Zoekt naar de mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld. |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | Retourneert de hoofdmap van het opgegeven pad. |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | Zoekt naar de bestanden die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld. |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | Zoekt naar de bestanden en mappen die voldoen aan de opgegeven zoekcriteria, hetzij in de opgegeven map, hetzij in de volledige mappenboom die in de opgegeven map is geworteld. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Retourneert de laatste toegangstijd van de opgegeven entiteit als lokale tijd. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Retourneert de laatste toegangstijd van de opgegeven entiteit als UTC‑tijd. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Retourneert de laatste schrijftijd van de opgegeven entiteit als lokale tijd. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Retourneert de laatste schrijftijd van de opgegeven entiteit als UTC‑tijd. |
| static [GetLogicalDrives](./getlogicaldrives/)() | NOG NIET GEÏMPLENTEERD. |
| static [GetParent](./getparent/)(const String\&) | Retourneert een gedeelde pointer naar [DirectoryInfo](../directoryinfo/) object dat de bovenliggende map van de opgegeven entiteit vertegenwoordigt. |
| static [Move](./move/)(const String\&, const String\&) | Verplaatst de opgegeven entiteit naar de nieuwe locatie. Als de te verplaatsen entiteit een map is, wordt deze verplaatst met al zijn inhoud. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | Stelt de aanmaaktijd van de opgegeven entiteit in als lokale tijd. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | Stelt de aanmaaktijd van de opgegeven entiteit in als UTC-tijd. |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | Stelt de huidige map in. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | Stelt de laatste toegangstijd van de opgegeven entiteit in als lokale tijd. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | Stelt de laatste toegangstijd van de opgegeven entiteit in als UTC-tijd. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Stelt de laatste schrijftijd van de opgegeven entiteit in als lokale tijd. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Stelt de laatste schrijftijd van de opgegeven entiteit in als UTC-tijd. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | Een alias voor een gedeelde pointer naar een IEnumerable‑object dat over een verzameling van [String](../../system/string/) objecten enumerateert. |
## Opmerkingen



```cpp
#include "system/io/directory.h"
#include "system/io/path.h"
#include "system/string.h"
#include <iostream>

void PrintMessage(const System::String &path)
{
  std::cout << "Directory '" << path << (System::IO::Directory::Exists(path) ? "' exists." : "' doesn't exist.") << std::endl;
}

int main()
{
  // Maak strings die paden naar mappen bevatten.
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // Controleer of mappen bestaan.
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // Print de informatie over de tijdelijke map.
  std::cout <<
    "Creation Time: " << System::IO::Directory::GetCreationTime(tempPath) << std::endl <<
    "Last Access Time: " << System::IO::Directory::GetLastAccessTime(tempPath) << std::endl <<
    "Last Write Time: " << System::IO::Directory::GetLastWriteTime(tempPath) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Directory 'C:\' exists.
Directory 'C:\Some directory' doesn't exist.
Directory 'C:\Users\lanor\AppData\Local\Temp\' exists.
Creation Time: 27.08.2021 14:21:42
Last Access Time: 07.10.2021 12:16:41
Last Write Time: 07.10.2021 12:16:41
*/
```

## Zie ook

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

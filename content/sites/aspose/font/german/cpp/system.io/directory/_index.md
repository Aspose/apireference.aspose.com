---
title: "System::IO::Directory Klasse"
linktitle: "Verzeichnis"
second_title: "Aspose.Font für C++"
description: "System::IO::Directory class. Enthält Methoden zur Manipulation von Verzeichnissen. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise in C++ erstellen."
type: docs
weight: 1100
url: /de/cpp/system.io/directory/
---
## Directory class


Enthält Methoden zur Manipulation von Verzeichnissen. Dies ist ein statischer Typ ohne Instanzdienste. Sie sollten niemals Instanzen davon auf irgendeine Weise erstellen.

```cpp
class Directory
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | Erstellt alle Verzeichnisse im angegebenen Pfad, falls diese nicht existieren. |
| static [Delete](./delete/)(const String\&, bool) | Entfernt die angegebene Datei oder das Verzeichnis. Wirft keine Ausnahme. |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | Durchsucht die Verzeichnisse, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis wurzelt. |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | Durchsucht die Dateien, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis wurzelt. |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis wurzelt. |
| static [Exists](./exists/)(const String\&) | Bestimmt, ob der angegebene Pfad auf ein vorhandenes Verzeichnis verweist. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Gibt die Erstellungszeit der angegebenen Entität als lokale Zeit zurück. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Gibt die Erstellungszeit der angegebenen Entität als UTC‑Zeit zurück. |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | Gibt den vollständigen Namen (einschließlich Pfad) des aktuellen Verzeichnisses zurück. |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | Durchsucht die Verzeichnisse, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis wurzelt. |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | Gibt das Stammverzeichnis des angegebenen Pfads zurück. |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | Durchsucht die Dateien, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis wurzelt. |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | Durchsucht die Dateien und Verzeichnisse, die die angegebenen Suchkriterien erfüllen, entweder im angegebenen Verzeichnis oder im gesamten Verzeichnisbaum, der im angegebenen Verzeichnis wurzelt. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Gibt die letzte Zugriffszeit der angegebenen Entität als lokale Zeit zurück. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Gibt die letzte Zugriffszeit der angegebenen Entität als UTC‑Zeit zurück. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Gibt die letzte Schreibzeit des angegebenen Elements als lokale Zeit zurück. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Gibt die letzte Schreibzeit des angegebenen Elements als UTC-Zeit zurück. |
| static [GetLogicalDrives](./getlogicaldrives/)() | NICHT IMPLEMENTIERT. |
| static [GetParent](./getparent/)(const String\&) | Gibt einen Shared-Pointer auf das [DirectoryInfo](../directoryinfo/)-Objekt zurück, das das übergeordnete Verzeichnis der angegebenen Entität darstellt. |
| static [Move](./move/)(const String\&, const String\&) | Verschiebt die angegebene Entität an den neuen Ort. Wenn die zu verschiebende Entität ein Verzeichnis ist, wird es mit seinem gesamten Inhalt verschoben. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | Setzt die Erstellungszeit der angegebenen Entität auf die lokale Zeit. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | Setzt die Erstellungszeit der angegebenen Entität auf UTC-Zeit. |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | Legt das aktuelle Verzeichnis fest. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | Legt die letzte Zugriffszeit des angegebenen Elements als lokale Zeit fest. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | Legt die letzte Zugriffszeit des angegebenen Elements als UTC-Zeit fest. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Setzt die letzte Schreibzeit des angegebenen Elements als lokale Zeit. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Setzt die letzte Schreibzeit des angegebenen Elements als UTC-Zeit. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | Ein Alias für einen Shared Pointer zu einem IEnumerable-Objekt, das über eine Menge von [String](../../system/string/) Objekten iteriert. |
## Hinweise



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
  // Erstelle Zeichenketten, die Pfade zu Verzeichnissen enthalten.
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // Überprüfe, ob Verzeichnisse existieren.
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // Gib die Informationen des temporären Verzeichnisses aus.
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

## Siehe auch

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)

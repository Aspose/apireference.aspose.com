---
title: "classe System::IO::Directory"
linktitle: "Directory"
second_title: "Aspose.Font per C++"
description: "classe System::IO::Directory. Contiene metodi per manipolare le directory. È un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo in C++."
type: docs
weight: 1100
url: /it/cpp/system.io/directory/
---
## Directory class


Contiene metodi per manipolare le directory. Questo è un tipo statico senza servizi di istanza. Non dovresti mai creare istanze di esso in alcun modo.

```cpp
class Directory
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | Crea tutte le directory nel percorso specificato se non esistono. |
| static [Delete](./delete/)(const String\&, bool) | Rimuove il file o la directory specificati. Non genera eccezioni. |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | Cerca le directory che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata. |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | Cerca i file che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata. |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | Cerca i file e le directory che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata. |
| static [Exists](./exists/)(const String\&) | Determina se il percorso specificato si riferisce a una directory esistente. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Restituisce la data di creazione dell'entità specificata in ora locale. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Restituisce la data di creazione dell'entità specificata in ora UTC. |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | Restituisce il nome completo (incluso il percorso) della directory corrente. |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | Cerca le directory che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata. |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | Restituisce la directory radice del percorso specificato. |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | Cerca i file che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata. |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | Cerca i file e le directory che soddisfano i criteri di ricerca specificati, sia nella directory specificata sia nell'intero albero di directory radicato nella directory specificata. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Restituisce l'ultima ora di accesso dell'entità specificata in ora locale. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Restituisce l'ultima ora di accesso dell'entità specificata in ora UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Restituisce l'ora dell'ultima scrittura dell'entità specificata come ora locale. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Restituisce l'ora dell'ultima scrittura dell'entità specificata come ora UTC. |
| static [GetLogicalDrives](./getlogicaldrives/)() | NON IMPLEMENTATO. |
| static [GetParent](./getparent/)(const String\&) | Restituisce un puntatore condiviso all'oggetto [DirectoryInfo](../directoryinfo/) che rappresenta la directory padre dell'entità specificata. |
| static [Move](./move/)(const String\&, const String\&) | Sposta l'entità specificata nella nuova posizione. Se l'entità da spostare è una directory, viene spostata con tutto il suo contenuto. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | Imposta l'ora di creazione dell'entità specificata come ora locale. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | Imposta l'ora di creazione dell'entità specificata come ora UTC. |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | Imposta la directory corrente. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | Imposta l'ora dell'ultimo accesso dell'entità specificata come ora locale. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | Imposta l'ora dell'ultimo accesso dell'entità specificata come ora UTC. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Imposta l'ora dell'ultima scrittura dell'entità specificata come ora locale. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Imposta l'ora dell'ultima scrittura dell'entità specificata come ora UTC. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | Un alias per un puntatore condiviso a un oggetto IEnumerable che enumera un insieme di oggetti [String](../../system/string/). |
## Osservazioni



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
  // Crea stringhe che contengono percorsi a directory.
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // Verifica se le directory esistono.
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // Stampa le informazioni della directory temporanea.
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

## Vedi anche

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)

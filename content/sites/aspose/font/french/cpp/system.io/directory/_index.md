---
title: "System::IO::Directory classe"
linktitle: "Directory"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::Directory. Contient des méthodes pour manipuler les répertoires. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celle-ci par quelque moyen que ce soit en C++."
type: docs
weight: 1100
url: /fr/cpp/system.io/directory/
---
## Directory class


Contient des méthodes pour manipuler les répertoires. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci, quel que soit le moyen.

```cpp
class Directory
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [CreateDirectory_](./createdirectory_/)(const String\&) | Crée tous les répertoires dans le chemin spécifié s'ils n'existent pas. |
| static [Delete](./delete/)(const String\&, bool) | Supprime le fichier ou le répertoire spécifié. Ne lève pas d'exception. |
| static [EnumerateDirectories](./enumeratedirectories/)(const String\&, const String\&, SearchOption) | Recherche les répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié. |
| static [EnumerateFiles](./enumeratefiles/)(const String\&, const String\&, SearchOption) | Recherche les fichiers qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié. |
| static [EnumerateFileSystemEntries](./enumeratefilesystementries/)(const String\&, const String\&, SearchOption) | Recherche les fichiers et répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié. |
| static [Exists](./exists/)(const String\&) | Détermine si le chemin spécifié fait référence à un répertoire existant. |
| static [GetCreationTime](./getcreationtime/)(const String\&) | Renvoie la date de création de l'entité spécifiée en heure locale. |
| static [GetCreationTimeUtc](./getcreationtimeutc/)(const String\&) | Renvoie la date de création de l'entité spécifiée en temps UTC. |
| static [GetCurrentDirectory](./getcurrentdirectory/)() | Renvoie le nom complet (chemin inclus) du répertoire actuel. |
| static [GetDirectories](./getdirectories/)(const String\&, const String\&, SearchOption) | Recherche les répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié. |
| static [GetDirectoryRoot](./getdirectoryroot/)(const String\&) | Renvoie le répertoire racine du chemin spécifié. |
| static [GetFiles](./getfiles/)(const String\&, const String\&, SearchOption) | Recherche les fichiers qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié. |
| static [GetFileSystemEntries](./getfilesystementries/)(const String\&, const String\&, SearchOption) | Recherche les fichiers et répertoires qui répondent aux critères de recherche spécifiés, soit dans le répertoire indiqué, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire spécifié. |
| static [GetLastAccessTime](./getlastaccesstime/)(const String\&) | Renvoie la dernière heure d'accès de l'entité spécifiée en heure locale. |
| static [GetLastAccessTimeUtc](./getlastaccesstimeutc/)(const String\&) | Renvoie la dernière heure d'accès de l'entité spécifiée en temps UTC. |
| static [GetLastWriteTime](./getlastwritetime/)(const String\&) | Renvoie la dernière heure d'écriture de l'entité spécifiée en heure locale. |
| static [GetLastWriteTimeUtc](./getlastwritetimeutc/)(const String\&) | Renvoie la dernière heure d'écriture de l'entité spécifiée en temps UTC. |
| static [GetLogicalDrives](./getlogicaldrives/)() | NON IMPLEMENTÉ. |
| static [GetParent](./getparent/)(const String\&) | Renvoie un pointeur partagé vers l'objet [DirectoryInfo](../directoryinfo/) représentant le répertoire parent de l'entité spécifiée. |
| static [Move](./move/)(const String\&, const String\&) | Déplace l'entité spécifiée vers le nouvel emplacement. Si l'entité à déplacer est un répertoire, il est déplacé avec tout son contenu. |
| static [SetCreationTime](./setcreationtime/)(const String\&, DateTime) | Définit l'heure de création de l'entité spécifiée en heure locale. |
| static [SetCreationTimeUtc](./setcreationtimeutc/)(const String\&, DateTime) | Définit l'heure de création de l'entité spécifiée en heure UTC. |
| static [SetCurrentDirectory](./setcurrentdirectory/)(const String\&) | Définit le répertoire actuel. |
| static [SetLastAccessTime](./setlastaccesstime/)(const String\&, DateTime) | Définit l'heure du dernier accès de l'entité spécifiée en heure locale. |
| static [SetLastAccessTimeUtc](./setlastaccesstimeutc/)(const String\&, DateTime) | Définit l'heure du dernier accès de l'entité spécifiée en heure UTC. |
| static [SetLastWriteTime](./setlastwritetime/)(const String\&, DateTime) | Définit la date et l'heure de dernière écriture de l'entité spécifiée en heure locale. |
| static [SetLastWriteTimeUtc](./setlastwritetimeutc/)(const String\&, DateTime) | Définit la date et l'heure de dernière écriture de l'entité spécifiée en temps UTC. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [StringEnumerablePtr](./stringenumerableptr/) | Un alias pour un pointeur partagé vers un objet IEnumerable qui énumère un ensemble d'objets [String](../../system/string/). |
## Remarques



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
  // Crée des chaînes contenant des chemins vers des répertoires.
  System::String discPath(u"C:\\");
  System::String directoryPath(u"C:\\Some directory");
  auto tempPath = System::IO::Path::GetTempPath();

  // Vérifie si les répertoires existent.
  PrintMessage(discPath);
  PrintMessage(directoryPath);
  PrintMessage(tempPath);

  // Affiche les informations du répertoire temporaire.
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

## Voir aussi

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)

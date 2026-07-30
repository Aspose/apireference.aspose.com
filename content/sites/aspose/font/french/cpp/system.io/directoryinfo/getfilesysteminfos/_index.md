---
title: "System::IO::DirectoryInfo::GetFileSystemInfos méthode"
linktitle: "GetFileSystemInfos"
second_title: "Aspose.Font pour C++"
description: "System::IO::DirectoryInfo::GetFileSystemInfos méthode. Retourne un tableau contenant des pointeurs partagés vers des objets FileSystemInfo représentant tous les fichiers et répertoires situés dans le répertoire représenté par l'objet actuel en C++."
type: docs
weight: 1400
url: /fr/cpp/system.io/directoryinfo/getfilesysteminfos/
---
## DirectoryInfo::GetFileSystemInfos() method


Retourne un tableau contenant des pointeurs partagés vers des objets [FileSystemInfo](../../filesysteminfo/) représentant tous les fichiers et répertoires situés dans le répertoire représenté par l'objet actuel.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos()
```

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&) method


Recherche les fichiers et répertoires qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des fichiers et répertoires à rechercher |

### ReturnValue

Un tableau de pointeurs partagés vers des objets [FileSystemInfo](../../filesysteminfo/) représentant les fichiers et répertoires trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFileSystemInfos(const String\&, SearchOption) method


Recherche les fichiers et répertoires qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel.

```cpp
ArrayPtr<FileSystemInfoPtr> System::IO::DirectoryInfo::GetFileSystemInfos(const String &searchPattern, SearchOption searchOption)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des fichiers et répertoires à rechercher |
| searchOption | SearchOption | Spécifie si la recherche doit être effectuée uniquement dans le répertoire représenté par l'objet actuel ou dans l'ensemble de l'arborescence de répertoires dont la racine est le répertoire représenté par l'objet actuel |

### ReturnValue

Un tableau de pointeurs partagés vers des objets [FileSystemInfo](../../filesysteminfo/) représentant les fichiers et répertoires trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileSystemInfoPtr](../../../system/filesysteminfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

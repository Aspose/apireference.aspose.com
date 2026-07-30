---
title: "Méthode System::IO::DirectoryInfo::EnumerateFiles"
linktitle: "EnumerateFiles"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::DirectoryInfo::EnumerateFiles. Retourne une collection énumérable contenant tous les fichiers situés dans le répertoire représenté par l'objet actuel en C++."
type: docs
weight: 600
url: /fr/cpp/system.io/directoryinfo/enumeratefiles/
---
## DirectoryInfo::EnumerateFiles() method


Renvoie une collection énumérable contenant tous les fichiers situés dans le répertoire représenté par l'objet actuel.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles()
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&) method


Recherche les fichiers qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des fichiers à rechercher |

### ReturnValue

La collection énumérable de pointeurs partagés vers des objets [FileInfo](../../fileinfo/) représentant les fichiers trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateFiles(const String\&, SearchOption) method


Recherche les fichiers qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel.

```cpp
SharedPtr<IEnumerable<FileInfoPtr>> System::IO::DirectoryInfo::EnumerateFiles(const String &searchPattern, SearchOption searchOption)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des fichiers à rechercher |
| searchOption | SearchOption | Spécifie si la recherche doit être effectuée uniquement dans le répertoire représenté par l'objet actuel ou dans l'ensemble de l'arborescence de répertoires dont la racine est le répertoire représenté par l'objet actuel |

### ReturnValue

La collection énumérable de pointeurs partagés vers des objets [FileInfo](../../fileinfo/) représentant les fichiers trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

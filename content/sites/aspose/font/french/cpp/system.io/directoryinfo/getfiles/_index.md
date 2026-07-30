---
title: "System::IO::DirectoryInfo::GetFiles méthode"
linktitle: "GetFiles"
second_title: "Aspose.Font pour C++"
description: "System::IO::DirectoryInfo::GetFiles méthode. Retourne un tableau contenant des pointeurs partagés vers des objets FileInfo représentant tous les répertoires situés dans le répertoire représenté par l'objet actuel en C++."
type: docs
weight: 1300
url: /fr/cpp/system.io/directoryinfo/getfiles/
---
## DirectoryInfo::GetFiles() method


Retourne un tableau contenant des pointeurs partagés vers des objets [FileInfo](../../fileinfo/) représentant tous les répertoires situés dans le répertoire représenté par l'objet actuel.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles()
```

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&) method


Recherche les fichiers qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des fichiers à rechercher |

### ReturnValue

Un tableau de pointeurs partagés vers des objets [FileInfo](../../fileinfo/) représentant les fichiers trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetFiles(const String\&, SearchOption) method


Recherche les fichiers qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel.

```cpp
ArrayPtr<FileInfoPtr> System::IO::DirectoryInfo::GetFiles(const String &searchPattern, SearchOption searchOption)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des fichiers à rechercher |
| searchOption | SearchOption | Spécifie si la recherche doit être effectuée uniquement dans le répertoire représenté par l'objet actuel ou dans l'ensemble de l'arborescence de répertoires dont la racine est le répertoire représenté par l'objet actuel |

### ReturnValue

Un tableau de pointeurs partagés vers des objets [FileInfo](../../fileinfo/) représentant les fichiers trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [FileInfoPtr](../../../system/fileinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

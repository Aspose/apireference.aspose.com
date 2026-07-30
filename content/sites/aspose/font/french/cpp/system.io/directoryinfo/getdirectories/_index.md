---
title: "Méthode System::IO::DirectoryInfo::GetDirectories"
linktitle: "GetDirectories"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::DirectoryInfo::GetDirectories. Retourne un tableau contenant des pointeurs partagés vers des objets DirectoryInfo représentant tous les répertoires situés dans le répertoire représenté par l'objet actuel en C++."
type: docs
weight: 1200
url: /fr/cpp/system.io/directoryinfo/getdirectories/
---
## DirectoryInfo::GetDirectories() method


Retourne un tableau contenant des pointeurs partagés vers des objets [DirectoryInfo](../) représentant tous les répertoires situés dans le répertoire représenté par l'objet actuel.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories()
```

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&) method


Recherche les répertoires qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des répertoires à rechercher |

### ReturnValue

Un tableau de pointeurs partagés vers des objets [DirectoryInfo](../) représentant les répertoires trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::GetDirectories(const String\&, SearchOption) method


Recherche les répertoires qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel.

```cpp
ArrayPtr<DirectoryInfoPtr> System::IO::DirectoryInfo::GetDirectories(const String &searchPattern, SearchOption searchOption)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des répertoires à rechercher |
| searchOption | SearchOption | Spécifie si la recherche doit être effectuée uniquement dans le répertoire représenté par l'objet actuel ou dans l'ensemble de l'arborescence de répertoires dont la racine est le répertoire représenté par l'objet actuel |

### ReturnValue

Un tableau de pointeurs partagés vers des objets [DirectoryInfo](../) représentant les répertoires trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

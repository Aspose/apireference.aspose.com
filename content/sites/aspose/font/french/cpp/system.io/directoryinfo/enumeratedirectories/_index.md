---
title: "System::IO::DirectoryInfo::EnumerateDirectories méthode"
linktitle: "EnumerateDirectories"
second_title: "Aspose.Font pour C++"
description: "System::IO::DirectoryInfo::EnumerateDirectories méthode. Retourne une collection énumérable contenant tous les répertoires situés dans le répertoire représenté par l'objet actuel en C++."
type: docs
weight: 500
url: /fr/cpp/system.io/directoryinfo/enumeratedirectories/
---
## DirectoryInfo::EnumerateDirectories() method


Renvoie une collection énumérable contenant tous les répertoires situés dans le répertoire représenté par l'objet actuel.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories()
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&) method


Recherche les répertoires qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des répertoires à rechercher |

### ReturnValue

La collection énumérable de pointeurs partagés vers des objets [DirectoryInfo](../) représentant les répertoires trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## DirectoryInfo::EnumerateDirectories(const String\&, SearchOption) method


Recherche les répertoires qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel.

```cpp
SharedPtr<IEnumerable<DirectoryInfoPtr>> System::IO::DirectoryInfo::EnumerateDirectories(const String &searchPattern, SearchOption searchOption)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| searchPattern | const String\& | Le modèle de nom des répertoires à rechercher |
| searchOption | SearchOption | Spécifie si la recherche doit être effectuée uniquement dans le répertoire représenté par l'objet actuel ou dans l'ensemble de l'arborescence de répertoires dont la racine est le répertoire représenté par l'objet actuel |

### ReturnValue

La collection énumérable de pointeurs partagés vers des objets [DirectoryInfo](../) représentant les répertoires trouvés dont les noms correspondent à **searchPattern**

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [DirectoryInfoPtr](../../../system/directoryinfoptr/)
* Class [String](../../../system/string/)
* Enum [SearchOption](../../searchoption/)
* Class [DirectoryInfo](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

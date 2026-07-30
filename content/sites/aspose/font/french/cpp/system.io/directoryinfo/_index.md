---
title: "Classe System::IO::DirectoryInfo"
linktitle: "DirectoryInfo"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::DirectoryInfo. Représente un chemin du système de fichiers, un répertoire référencé par ce chemin et fournit des méthodes d'instance pour manipuler les répertoires. Les objets de cette classe ne doivent être alloués qu'à l'aide de la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 1200
url: /fr/cpp/system.io/directoryinfo/
---
## DirectoryInfo class


Représente un chemin de système de fichiers, un répertoire référencé par ce chemin et fournit des méthodes d'instance pour manipuler les répertoires. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le passer aux fonctions en tant qu'argument.

```cpp
class DirectoryInfo : public System::IO::FileSystemInfo
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Create](./create/)() | Crée un répertoire au chemin représenté par l'objet actuel. |
| [CreateSubdirectory](./createsubdirectory/)(const String\&) | Crée des sous‑répertoires sur le chemin spécifié. |
| [Delete](./delete/)() override | Supprime le répertoire référencé par le chemin représenté par l'objet actuel si le répertoire est vide. |
| [Delete](./delete/)(bool) | Supprime le répertoire référencé par le chemin représenté par l'objet actuel. Un paramètre indique si le contenu du répertoire doit être supprimé de manière récursive si le répertoire n'est pas vide. |
| [DirectoryInfo](./directoryinfo/)(const String\&) | Construit une instance de la classe [DirectoryInfo](./) sur le chemin spécifié. |
| [EnumerateDirectories](./enumeratedirectories/)() | Renvoie une collection énumérable contenant tous les répertoires situés dans le répertoire représenté par l'objet actuel. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&) | Recherche les répertoires qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel. |
| [EnumerateDirectories](./enumeratedirectories/)(const String\&, SearchOption) | Recherche les répertoires qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel. |
| [EnumerateFiles](./enumeratefiles/)() | Renvoie une collection énumérable contenant tous les fichiers situés dans le répertoire représenté par l'objet actuel. |
| [EnumerateFiles](./enumeratefiles/)(const String\&) | Recherche les fichiers qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel. |
| [EnumerateFiles](./enumeratefiles/)(const String\&, SearchOption) | Recherche les fichiers qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)() | Renvoie une collection énumérable contenant tous les fichiers et répertoires situés dans le répertoire représenté par l'objet actuel. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&) | Recherche les fichiers et répertoires qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel. |
| [EnumerateFileSystemInfos](./enumeratefilesysteminfos/)(const String\&, SearchOption) | Recherche les fichiers et répertoires qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel. |
| [get_Exists](./get_exists/)() override | Détermine si le chemin représenté par l'objet actuel fait référence à un répertoire existant. |
| [get_Name](./get_name/)() override | Renvoie le nom de l'entité référencée par le chemin représenté par l'objet actuel. |
| [get_Parent](./get_parent/)() | Renvoie un pointeur partagé vers l'objet [DirectoryInfo](./) qui représente un chemin faisant référence au répertoire parent du répertoire représenté par l'objet actuel. |
| [get_Root](./get_root/)() | Renvoie un pointeur partagé vers l'objet [DirectoryInfo](./) qui représente un chemin faisant référence au répertoire racine du répertoire représenté par l'objet actuel. |
| [GetDirectories](./getdirectories/)() | Renvoie un tableau contenant des pointeurs partagés vers les objets [DirectoryInfo](./) représentant tous les répertoires situés dans le répertoire représenté par l'objet actuel. |
| [GetDirectories](./getdirectories/)(const String\&) | Recherche les répertoires qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel. |
| [GetDirectories](./getdirectories/)(const String\&, SearchOption) | Recherche les répertoires qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel. |
| [GetFiles](./getfiles/)() | Renvoie un tableau contenant des pointeurs partagés vers les objets [FileInfo](../fileinfo/) représentant tous les répertoires situés dans le répertoire représenté par l'objet actuel. |
| [GetFiles](./getfiles/)(const String\&) | Recherche les fichiers qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel. |
| [GetFiles](./getfiles/)(const String\&, SearchOption) | Recherche les fichiers qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel. |
| [GetFileSystemInfos](./getfilesysteminfos/)() | Renvoie un tableau contenant des pointeurs partagés vers les objets [FileSystemInfo](../filesysteminfo/) représentant tous les fichiers et répertoires situés dans le répertoire représenté par l'objet actuel. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&) | Recherche les fichiers et répertoires qui satisfont les critères de recherche spécifiés dans le répertoire représenté par l'objet actuel. |
| [GetFileSystemInfos](./getfilesysteminfos/)(const String\&, SearchOption) | Recherche les fichiers et répertoires qui satisfont les critères de recherche spécifiés, soit dans le répertoire représenté par l'objet actuel, soit dans l'ensemble de l'arborescence de répertoires enracinée dans le répertoire représenté par l'objet actuel. |
| [MoveTo](./moveto/)(const String\&) | Déplace le répertoire représenté par l'objet actuel ainsi que tout son contenu vers l'emplacement spécifié. |
| [ToString](./tostring/)() const override | Renvoie une chaîne contenant le chemin représenté par l'objet actuel. |
## Voir aussi

* Class [FileSystemInfo](../filesysteminfo/)
* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)

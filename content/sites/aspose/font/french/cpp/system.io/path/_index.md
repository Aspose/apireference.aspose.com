---
title: "Classe System::IO::Path"
linktitle: "Chemin"
second_title: "Aspose.Font pour C++"
description: "Classe System::IO::Path. Fournit des méthodes pour manipuler les chemins. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celle-ci par quelque moyen que ce soit en C++."
type: docs
weight: 1900
url: /fr/cpp/system.io/path/
---
## Path class


Fournit des méthodes pour manipuler les chemins. Il s'agit d'un type statique sans services d'instance. Vous ne devez jamais créer d'instances de celui-ci, quel que soit le moyen.

```cpp
class Path
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [ChangeExtension](./changeextension/)(const String\&, const String\&) | Modifie l'extension du chemin de fichier spécifié. |
| static [CheckPath](./checkpath/)(const String\&, const String\&, bool) | Détermine si le chemin spécifié est valide en vérifiant s'il contient des caractères invalides. Une exception est levée si le chemin contient des caractères invalides. |
| static [Combine](./combine/)(const ArrayPtr\<String\>\&) | Combine les segments de chemin spécifiés en un seul chemin en insérant des caractères de séparateur de répertoire entre les segments si nécessaire. |
| static [Combine](./combine/)(const String\&, const String\&) | Combine deux segments de chemin spécifiés en un seul chemin en insérant le caractère séparateur de répertoire entre les segments si nécessaire. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&) | Combine trois segments de chemin spécifiés en un seul chemin en insérant les caractères séparateurs de répertoire entre les segments si nécessaire. |
| static [Combine](./combine/)(const String\&, const String\&, const String\&, const String\&) | Combine quatre segments de chemin spécifiés en un seul chemin en insérant les caractères séparateurs de répertoire entre les segments si nécessaire. |
| static [GetDirectoryName](./getdirectoryname/)(const String\&) | Renvoie le nom du répertoire référencé par le chemin spécifié. |
| static [GetExtension](./getextension/)(const String\&) | Renvoie l'extension du fichier référencé par le chemin spécifié. |
| static [GetFileName](./getfilename/)(const String\&) | Renvoie le nom du fichier référencé par le chemin spécifié. |
| static [GetFileNameWithoutExtension](./getfilenamewithoutextension/)(const String\&) | Renvoie le nom du fichier référencé par le chemin spécifié, sans extension. |
| static [GetFullPath](./getfullpath/)(const String\&) | Convertit le chemin spécifié en chemin absolu. |
| static [GetInvalidFileNameChars](./getinvalidfilenamechars/)() | Renvoie un tableau contenant les caractères qui ne sont pas autorisés dans les noms de fichiers. |
| static [GetInvalidPathChars](./getinvalidpathchars/)() | Renvoie un tableau contenant les caractères qui ne sont pas autorisés dans les noms de chemins. |
| static [GetPathRoot](./getpathroot/)(const String\&) | Renvoie le répertoire racine du chemin spécifié. |
| static [GetRandomFileName](./getrandomfilename/)() | Renvoie un nom de fichier généré aléatoirement. |
| static [GetTempFileName_](./gettempfilename_/)() | Crée un nouveau fichier avec un nom unique et renvoie le chemin complet vers celui-ci. |
| static [GetTempFileNameSafe](./gettempfilenamesafe/)() | Crée un nouveau fichier avec un nom unique et renvoie le chemin complet vers celui-ci. Est un synonyme de la méthode [GetTempFileName_()](./gettempfilename_/). |
| static [GetTempPath](./gettemppath/)() | Renvoie le chemin du répertoire temporaire de l'utilisateur actuel. |
| static [HasExtension](./hasextension/)(const String\&) | Détermine si le chemin spécifié référence un fichier avec extension. |
| static [IsPathRooted](./ispathrooted/)(const String\&) | Détermine si le chemin spécifié contient une racine. |
| static [NormalizePath](./normalizepath/)(const String\&) | Normalise le chemin spécifié. |
| static [ToBoost](./toboost/)(const String\&) | Renvoie une instance de la classe boost::filesystem::path qui représente le chemin spécifié. |
| static [ToString](./tostring/)(const boost::filesystem::path\&) | Renvoie une représentation sous forme de chaîne de l'objet path de Boost spécifié. |
## Champs

| Champ | Description |
| --- | --- |
| static [AltDirectorySeparatorChar](./altdirectoryseparatorchar/) | Un caractère alternatif utilisé pour séparer les niveaux de répertoire dans un chemin. |
| static [DirectorySeparatorChar](./directoryseparatorchar/) | Un caractère utilisé pour séparer les niveaux de répertoire dans un chemin. |
| static [PathSeparator](./pathseparator/) | Un caractère séparateur utilisé pour séparer les chaînes de chemins dans les variables d'environnement. |
| static [VolumeSeparatorChar](./volumeseparatorchar/) | Un caractère séparateur de volume. |
## Remarques



```cpp
#include "system/io/path.h"
#include <iostream>

int main()
{
  using namespace System::IO;

  // Générer un nom de fichier aléatoire.
  auto filename = Path::GetRandomFileName();

  // Afficher les informations sur le nom de fichier.
  std::cout <<
    "Filename: " << Path::GetFileName(filename) << std::endl <<
    "Filename w/o an extension: " << Path::GetFileNameWithoutExtension(filename) << std::endl <<
    "Extension: " << Path::GetExtension(filename) << std::endl;

  return 0;
}
/*
This code example produces the following output:
Filename: qhuzkyqv.y6p
Filename w/o an extension: qhuzkyqv
Extension: .y6p
*/
```

## Voir aussi

* Namespace [System::IO](../)
* Library [Aspose.Font for C++](../../)

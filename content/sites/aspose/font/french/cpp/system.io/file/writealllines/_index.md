---
title: "Méthode System::IO::File::WriteAllLines"
linktitle: "WriteAllLines"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::File::WriteAllLines. Crée un nouveau fichier texte ou écrase celui existant et écrit toutes les chaînes du tableau de chaînes spécifié dans celui‑ci, chaque chaîne sur une nouvelle ligne, en utilisant l’encodage spécifié en C++."
type: docs
weight: 3600
url: /fr/cpp/system.io/file/writealllines/
---
## File::WriteAllLines(const String\&, const ArrayPtr\<String\>\&, const EncodingPtr\&) method


Crée un nouveau fichier texte ou écrase l'existant et écrit toutes les chaînes du tableau de chaînes spécifié dans celui‑ci, chaque chaîne sur une nouvelle ligne, en utilisant l'encodage spécifié.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const ArrayPtr<String> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le fichier à créer ou à écraser |
| contenu | const ArrayPtr\<String\>\& | Un tableau de chaînes |
| encoding | const EncodingPtr\& | L'encodage de caractères à utiliser |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## File::WriteAllLines(const String\&, const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\&, const EncodingPtr\&) method


Crée un nouveau fichier texte ou écrase l'existant et écrit toutes les chaînes de la collection énumérable de chaînes spécifiée dans celui‑ci, chaque chaîne sur une nouvelle ligne, en utilisant l'encodage spécifié.

```cpp
static void System::IO::File::WriteAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le fichier à créer ou à écraser |
| contenu | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Une collection énumérable de chaînes |
| encoding | const EncodingPtr\& | L'encodage de caractères à utiliser |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

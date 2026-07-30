---
title: "Méthode System::IO::File::AppendAllLines"
linktitle: "AppendAllLines"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::File::AppendAllLines. Ajoute des chaînes de la collection de chaînes spécifiée au fichier indiqué en utilisant l'encodage spécifié, en écrivant chaque chaîne sur une nouvelle ligne. Si le fichier spécifié n'existe pas, il est créé. Le fichier est fermé après l'écriture de toutes les chaînes en C++."
type: docs
weight: 100
url: /fr/cpp/system.io/file/appendalllines/
---
## File::AppendAllLines method


Ajoute des chaînes provenant de la collection de chaînes spécifiée au fichier spécifié en utilisant l'encodage spécifié en écrivant chaque chaîne sur une nouvelle ligne. Si le fichier spécifié n'existe pas, il est créé. Le fichier est fermé après l'écriture de toutes les chaînes.

```cpp
static void System::IO::File::AppendAllLines(const String &path, const SharedPtr<Collections::Generic::IEnumerable<String>> &contents, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier auquel ajouter les chaînes |
| contenu | const SharedPtr\<Collections::Generic::IEnumerable\<String\>\>\& | Les chaînes à écrire dans le fichier |
| encoding | const EncodingPtr\& | L'encodage de caractères à utiliser |

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

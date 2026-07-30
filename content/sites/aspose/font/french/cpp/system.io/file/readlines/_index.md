---
title: "Méthode System::IO::File::ReadLines"
linktitle: "ReadLines"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::File::ReadLines. Lit le contenu du fichier texte spécifié ligne par ligne en utilisant l’encodage de caractères spécifié et renvoie une collection énumérable de chaînes, chacune représentant une ligne unique du contenu du fichier en C++."
type: docs
weight: 2600
url: /fr/cpp/system.io/file/readlines/
---
## File::ReadLines method


Lit le contenu du fichier texte spécifié ligne par ligne en utilisant l'encodage de caractères spécifié et renvoie une collection énumérable de chaînes, chacune représentant une ligne du contenu du fichier.

```cpp
static SharedPtr<Collections::Generic::IEnumerable<String>> System::IO::File::ReadLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier à lire |
| encoding | const EncodingPtr\& | L'encodage de caractères à utiliser |

### ReturnValue

Une collection énumérable de chaînes représentant le contenu du fichier spécifié

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

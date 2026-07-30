---
title: "System::IO::File::ReadAllLines méthode"
linktitle: "ReadAllLines"
second_title: "Aspose.Font pour C++"
description: "System::IO::File::ReadAllLines méthode. Lit le contenu du fichier texte spécifié ligne par ligne dans un tableau de chaînes en utilisant le codage de caractères spécifié en C++."
type: docs
weight: 2400
url: /fr/cpp/system.io/file/readalllines/
---
## File::ReadAllLines method


Lit le contenu du fichier texte spécifié ligne par ligne dans un tableau de chaînes en utilisant l'encodage de caractères spécifié.

```cpp
static ArrayPtr<String> System::IO::File::ReadAllLines(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8())
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier à lire |
| encoding | const EncodingPtr\& | L'encodage de caractères à utiliser |

### ReturnValue

Un tableau de chaînes dont chaque élément représente une ligne unique du fichier spécifié

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

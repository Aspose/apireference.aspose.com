---
title: "System::IO::File::OpenText méthode"
linktitle: "OpenText"
second_title: "Aspose.Page pour C++"
description: "System::IO::File::OpenText méthode. Ouvre le fichier existant spécifié pour lire du texte en utilisant le codage UTF-8 sans partage en C++."
type: docs
weight: 2100
url: /fr/cpp/system.io/file/opentext/
---
## File::OpenText method


Ouvre le fichier existant spécifié pour lire du texte en utilisant l'encodage UTF-8, sans partage.

```cpp
static StreamReaderPtr System::IO::File::OpenText(const String &path, const EncodingPtr &encoding=Text::Encoding::get_UTF8Unmarked())
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chemin | const String\& | Le chemin du fichier à ouvrir |
| encoding | const EncodingPtr\& | Le codage des caractères à utiliser |

### ReturnValue

Un pointeur partagé vers un objet [StreamWriter](../../streamwriter/) associé au fichier ouvert

## Voir aussi

* Typedef [StreamReaderPtr](../../../system/streamreaderptr/)
* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [File](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

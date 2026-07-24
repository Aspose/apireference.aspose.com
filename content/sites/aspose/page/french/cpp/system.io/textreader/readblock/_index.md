---
title: "Méthode System::IO::TextReader::ReadBlock"
linktitle: "ReadBlock"
second_title: "Aspose.Page pour C++"
description: "Méthode System::IO::TextReader::ReadBlock. Lit le nombre maximal de caractères spécifié depuis le lecteur de texte actuel et écrit les données dans un tampon, en commençant à l'index spécifié en C++."
type: docs
weight: 500
url: /fr/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


Lit le nombre maximal spécifié de caractères du lecteur de texte actuel et écrit les données dans un tampon, en commençant à l'index indiqué.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArrayPtr\<char_t\> | Un tampon de caractères dans lequel écrire les données lues |
| indice | int | Un indice basé sur 0 dans **buffer** où commencer l'écriture |
| count | int | Le nombre maximal de caractères à lire |

### ReturnValue

Le nombre réel de caractères lus

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

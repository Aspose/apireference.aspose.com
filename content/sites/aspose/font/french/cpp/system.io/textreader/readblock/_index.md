---
title: "System::IO::TextReader::ReadBlock method"
linktitle: "ReadBlock"
second_title: "Aspose.Font pour C++"
description: "System::IO::TextReader::ReadBlock method. Lit le nombre maximal de caractères spécifié depuis le lecteur de texte actuel et écrit les données dans un tampon, en commençant à l'index spécifié en C++."
type: docs
weight: 500
url: /fr/cpp/system.io/textreader/readblock/
---
## TextReader::ReadBlock method


Lit le nombre maximal de caractères spécifié du lecteur de texte actuel et écrit les données dans un tampon, à partir de l'index spécifié.

```cpp
virtual int System::IO::TextReader::ReadBlock(ArrayPtr<char_t> buffer, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArrayPtr\<char_t\> | Un tampon de caractères dans lequel écrire les données lues |
| indice | int | Un index basé sur 0 dans **buffer** où commencer l'écriture |
| count | int | Le nombre maximal de caractères à lire |

### ReturnValue

Le nombre réel de caractères lus

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

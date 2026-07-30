---
title: "System::IO::TextReader::Read méthode"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "System::IO::TextReader::Read méthode. Lit un seul caractère du flux en C++."
type: docs
weight: 400
url: /fr/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Lit un caractère unique du flux.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

Caractère lu encodé en UTF-16 ; si le caractère lu est représenté par deux points de code en UTF-16, alors seul le surragate haut est renvoyé.

## Voir aussi

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Lit le nombre spécifié de caractères du flux et les écrit dans le tableau de caractères spécifié à partir de la position spécifiée.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArrayPtr\<char_t\> | Le tableau de caractères UTF-16 dans lequel écrire les caractères lus du flux |
| indice | int | Un indice basé sur 0 dans **buffer** à partir duquel commencer l'écriture |
| count | int | Le nombre de caractères à lire depuis le flux |

### ReturnValue

Le nombre de caractères lus du flux

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

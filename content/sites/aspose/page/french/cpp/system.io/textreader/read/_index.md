---
title: "Méthode System::IO::TextReader::Read"
linktitle: "Lire"
second_title: "Aspose.Page pour C++"
description: "Méthode System::IO::TextReader::Read. Lit un seul caractère du flux en C++."
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

Lire le caractère encodé en UTF-16 ; si le caractère lu est représenté par deux points de code en encodage UTF-16 alors seul le high surragate est renvoyé.

## Voir aussi

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Lit le nombre spécifié de caractères du flux et les écrit dans le tableau de caractères spécifié en commençant à la position indiquée.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArrayPtr\<char_t\> | Le tableau de caractères UTF-16 dans lequel écrire les caractères lus depuis le flux |
| indice | int | Un indice basé à 0 dans **buffer** à partir duquel commencer l'écriture |
| count | int | Le nombre de caractères à lire depuis le flux |

### ReturnValue

Le nombre de caractères lus depuis le flux

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::IO::StreamReader::Read méthode"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "System::IO::StreamReader::Read méthode. Lit un seul caractère du flux en C++."
type: docs
weight: 900
url: /fr/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


Lit un caractère unique du flux.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

Caractère lu encodé en UTF-16 ; si le caractère lu est représenté par deux points de code en UTF-16, alors seul le surragate haut est renvoyé.

## Voir aussi

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


Lit le nombre spécifié de caractères du flux, les convertit en encodage UTF-16 et écrit les caractères UTF-16 résultants dans le tableau de caractères spécifié en commençant à la position indiquée.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
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
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

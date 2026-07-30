---
title: "System::IO::StringReader::Read méthode"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "System::IO::StringReader::Read méthode. Lit un seul caractère du flux en C++."
type: docs
weight: 500
url: /fr/cpp/system.io/stringreader/read/
---
## StringReader::Read() method


Lit un caractère unique du flux.

```cpp
virtual int System::IO::StringReader::Read() override
```


### ReturnValue

Un caractère lu ou -1 si aucun caractère n'a été lu

## Voir aussi

* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StringReader::Read(ArrayPtr\<char_t\>, int, int) method


Lit le nombre spécifié de caractères du flux vers le tableau de caractères spécifié en commençant à la position indiquée.

```cpp
virtual int System::IO::StringReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArrayPtr\<char_t\> | Le tableau de caractères dans lequel écrire les caractères lus depuis le flux |
| indice | int | Un indice basé sur 0 dans **buffer** à partir duquel commencer l'écriture |
| count | int | Le nombre de caractères à lire depuis le flux |

### ReturnValue

Le nombre de caractères lus du flux

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

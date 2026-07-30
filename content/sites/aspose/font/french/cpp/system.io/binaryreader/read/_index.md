---
title: "System::IO::BinaryReader::Read méthode"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "System::IO::BinaryReader::Read méthode. Lit un caractère unique du flux d'entrée en C++."
type: docs
weight: 700
url: /fr/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


Lit un seul caractère du flux d'entrée.

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

Caractère lu encodé en UTF-16 ; si le caractère lu est représenté par deux points de code en UTF-16, alors seul le surragate haut est renvoyé.

## Voir aussi

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


Lit le nombre spécifié de caractères du flux d'entrée, les convertit en encodage UTF-16 et écrit les caractères UTF-16 résultants dans le tableau de caractères spécifié à partir de la position spécifiée.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArrayPtr\<char_t\> | Le tableau de caractères UTF-16 dans lequel écrire les caractères lus depuis le flux d'entrée |
| indice | int | Un indice basé sur 0 dans **buffer** à partir duquel commencer l'écriture |
| count | int | Le nombre de caractères à lire depuis le flux |

### ReturnValue

Le nombre de caractères lus depuis le flux d'entrée

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


Lit le nombre spécifié d'octets du flux d'entrée et les écrit dans le tableau d'octets spécifié.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | ArrayPtr\<uint8_t\> | Le tableau d'octets où écrire les octets lus |
| indice | int | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

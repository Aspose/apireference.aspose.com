---
title: "Méthode System::IO::BasicSTDIStreamWrapper::Read"
linktitle: "Lire"
second_title: "Aspose.Page pour C++"
description: "Méthode System::IO::BasicSTDIStreamWrapper::Read. Si le mode d'encapsulation est binaire, lit le nombre spécifié d'octets du flux, sinon lit le nombre spécifié de caractères et les convertit en type uint8_t. Écrit le résultat de la lecture dans le tableau d'octets spécifié en C++."
type: docs
weight: 400
url: /fr/cpp/system.io/basicstdistreamwrapper/read/
---
## BasicSTDIStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Si le mode d'encapsulation est binaire, lit le nombre spécifié d'octets du flux, sinon lit le nombre spécifié de caractères et les convertit en type uint8_t. Écrit le résultat de la lecture dans le tableau d'octets spécifié.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau d'octets où écrire les octets lus |
| offset | int32_t | Une position à base zéro dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Nombre d'octets ou de caractères lus

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau d'octets dans laquelle écrire les octets lus |
| offset | int32_t | Une position à base zéro dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

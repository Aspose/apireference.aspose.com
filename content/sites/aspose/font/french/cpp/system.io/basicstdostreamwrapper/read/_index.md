---
title: "System::IO::BasicSTDOStreamWrapper::Read méthode"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "System::IO::BasicSTDOStreamWrapper::Read méthode. Si le mode d'encapsulation est binaire, lit le nombre spécifié d'octets du flux, sinon lit le nombre spécifié de caractères et les convertit en type uint8_t. Écrit le résultat de la lecture dans le tableau d'octets spécifié. Non pris en charge ! en C++."
type: docs
weight: 400
url: /fr/cpp/system.io/basicstdostreamwrapper/read/
---
## BasicSTDOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Si le mode d'encapsulation est binaire, lit le nombre spécifié d'octets du flux, sinon lit le nombre spécifié de caractères et les convertit en type uint8_t. Écrit le résultat de la lecture dans le tableau d'octets spécifié. Non pris en charge !

```cpp
virtual int32_t System::IO::BasicSTDOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau d'octets où écrire les octets lus |
| décalage | int32_t | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Nombre d'octets ou de caractères lus

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
virtual int32_t System::IO::BasicSTDOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau d'octets où écrire les octets lus |
| décalage | int32_t | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

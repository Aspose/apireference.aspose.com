---
title: "System::IO::BasicSTDIOStreamWrapper::Read method"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "System::IO::BasicSTDIOStreamWrapper::Read method. Si le mode d'encapsulation est binaire, lit le nombre spécifié d'octets du flux, sinon lit le nombre spécifié de caractères et les convertit en type uint8_t. Écrit le résultat de la lecture dans le tableau d'octets spécifié en C++."
type: docs
weight: 400
url: /fr/cpp/system.io/basicstdiostreamwrapper/read/
---
## BasicSTDIOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Si le mode d'encapsulation est binaire, lit le nombre d'octets spécifié depuis le flux, sinon lit le nombre de caractères spécifié et les convertit en type uint8_t. Écrit le résultat de la lecture dans le tableau d'octets spécifié.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau d'octets où écrire les octets lus |
| décalage | int32_t | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

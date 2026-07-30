---
title: "System::IO::BufferedStream::Read méthode"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "System::IO::BufferedStream::Read méthode. Lit le nombre spécifié d'octets du flux sous-jacent et les écrit dans le tableau d'octets spécifié en C++."
type: docs
weight: 900
url: /fr/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux sous-jacent et les écrit dans le tableau d'octets spécifié.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau d'octets où écrire les octets lus |
| décalage | int32_t | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux sous-jacent et les écrit dans le tableau d'octets spécifié.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | Le tableau d'octets où écrire les octets lus |
| décalage | int32_t | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

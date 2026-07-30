---
title: "Méthode System::IO::Stream::Read"
linktitle: "Read"
second_title: "Aspose.Font pour C++"
description: "Méthode System::IO::Stream::Read. Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié en C++."
type: docs
weight: 1800
url: /fr/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
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
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau d'octets où écrire les octets lus |
| décalage | int32_t | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Lit le nombre spécifié d'octets du flux et les écrit dans le tableau d'octets spécifié.

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Paramètre | Description |
| --- | --- |
| N | La taille du tableau de pile |

| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::StackArray\<uint8_t, N\>\& | Le tableau empilé d'octets dans lequel écrire les octets lus |
| décalage | int32_t | Une position basée sur 0 dans **buffer** où commencer l'écriture |
| count | int32_t | Le nombre d'octets à lire |

### ReturnValue

Le nombre d'octets lus

## Voir aussi

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

---
title: "System::IO::Stream::Write méthode"
linktitle: "Write"
second_title: "Aspose.Page pour C++"
description: "System::IO::Stream::Write méthode. Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux en C++."
type: docs
weight: 2600
url: /fr/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Écrit la sous-plage d'octets spécifiée du tableau d'octets spécifié dans le flux.

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau contenant les octets à écrire |
| offset | int32_t | Un indice à base zéro de l'élément dans **buffer** où commence la sous-plage à écrire |
| count | int32_t | Le nombre d'éléments dans la sous-plage à écrire |

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Écrit la sous-plage d'octets spécifiée du tableau d'octets spécifié dans le flux.

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau contenant les octets à écrire |
| offset | int32_t | Un indice à base zéro de l'élément dans **buffer** où commence la sous-plage à écrire |
| count | int32_t | Le nombre d'éléments dans la sous-plage à écrire |

## Voir aussi

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Écrit la sous-plage d'octets spécifiée du tableau d'octets spécifié dans le flux.

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Paramètre | Description |
| --- | --- |
| N | La taille du tableau de pile |

| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::StackArray\<uint8_t, N\>\& | Le tableau empilé contenant les octets à écrire |
| offset | int32_t | Un indice à base zéro de l'élément dans **buffer** où commence la sous-plage à écrire |
| count | int32_t | Le nombre d'éléments dans la sous-plage à écrire |

## Voir aussi

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

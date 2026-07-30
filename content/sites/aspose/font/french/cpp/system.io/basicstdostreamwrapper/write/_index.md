---
title: "System::IO::BasicSTDOStreamWrapper::Write méthode"
linktitle: "Write"
second_title: "Aspose.Font pour C++"
description: "System::IO::BasicSTDOStreamWrapper::Write méthode. Si le mode d'encapsulation est binaire, écrit dans le flux la sous-plage spécifiée d'octets du tableau d'octets spécifié, sinon convertit la sous-plage spécifiée d'octets du tableau d'octets spécifié en type char_type et puis écrit le résultat dans le flux en C++."
type: docs
weight: 700
url: /fr/cpp/system.io/basicstdostreamwrapper/write/
---
## BasicSTDOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Si le mode d'encapsulation est binaire, écrit dans le flux la sous-plage spécifiée d'octets du tableau d'octets spécifié, sinon convertit la sous-plage spécifiée d'octets du tableau d'octets spécifié en type [char_type](../char_type/) et puis écrit le résultat dans le flux.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau contenant les octets à écrire |
| décalage | int32_t | Un indice basé sur 0 de l'élément dans **buffer** où commence la sous-plage à écrire |
| count | int32_t | Le nombre d'éléments dans la sous-plage à écrire |

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Écrit la sous-plage spécifiée d'octets du tableau d'octets spécifié dans le flux.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau contenant les octets à écrire |
| décalage | int32_t | Un indice basé sur 0 de l'élément dans **buffer** à partir duquel commence la sous-plage à écrire |
| count | int32_t | Le nombre d'éléments dans la sous-plage à écrire |

## Voir aussi

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)

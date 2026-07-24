---
title: "System::IO::BasicSTDIStreamWrapper::Write méthode"
linktitle: "Write"
second_title: "Aspose.Page pour C++"
description: "System::IO::BasicSTDIStreamWrapper::Write méthode. Si le mode d'encapsulation est binaire, écrit dans le flux la sous-plage spécifiée d'octets du tableau d'octets indiqué, sinon convertit la sous-plage spécifiée d'octets du tableau indiqué en type char_type puis écrit le résultat dans le flux. Non pris en charge ! en C++."
type: docs
weight: 700
url: /fr/cpp/system.io/basicstdistreamwrapper/write/
---
## BasicSTDIStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Si le mode d'encapsulation est binaire, écrit dans le flux la sous-plage spécifiée d'octets du tableau d'octets indiqué, sinon convertit la sous-plage spécifiée d'octets du tableau indiqué en type [char_type](../char_type/) et écrit le résultat dans le flux. Non pris en charge !

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const ArrayPtr\<uint8_t\>\& | Le tableau contenant les octets à écrire. |
| offset | int32_t | Un indice basé sur zéro de l'élément dans **buffer** où commence la sous-plage à écrire. |
| count | int32_t | Le nombre d'éléments dans la sous-plage à écrire. |

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Écrit la sous-plage d'octets spécifiée du tableau d'octets spécifié dans le flux.

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| tampon | const System::Details::ArrayView\<uint8_t\>\& | La vue du tableau contenant les octets à écrire |
| offset | int32_t | Un indice à base zéro de l'élément dans **buffer** où commence la sous-plage à écrire |
| count | int32_t | Le nombre d'éléments dans la sous-plage à écrire |

## Voir aussi

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)

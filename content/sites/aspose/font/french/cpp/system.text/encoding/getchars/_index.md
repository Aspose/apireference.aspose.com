---
title: "Méthode System::Text::Encoding::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Text::Encoding::GetChars. Obtient les caractères résultant du décodage d'un tampon d'octets en C++."
type: docs
weight: 2000
url: /fr/cpp/system.text/encoding/getchars/
---
## Encoding::GetChars(ArrayPtr\<uint8_t\>) method


Obtenez les caractères résultant du décodage d'un tampon d'octets.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) à lire les octets depuis. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Obtenez les caractères résultant du décodage d'un tampon d'octets.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) à lire les octets depuis. |
| byte_index | int | Décalage du tampon d'entrée. |
| byte_count | int | Taille du tampon d'entrée. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) pour placer les caractères. |
| char_index | int | Décalage du tampon de sortie. |

### ReturnValue

Nombre de caractères écrits.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


Obtenez les caractères résultant du décodage d'un tampon d'octets.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) à lire les octets depuis. |
| indice | int | Décalage du tampon d'entrée. |
| count | int | Taille du tampon d'entrée. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetChars(const uint8_t *, int, char_t *, int) method


Obtenez les caractères résultant du décodage d'un tampon d'octets.

```cpp
virtual int System::Text::Encoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) à lire les octets depuis. |
| byte_count | int | Taille du tampon d'entrée. |
| chars | char_t * | [Buffer](../../../system/buffer/) pour placer les caractères. |
| char_count | int | Taille du tampon de sortie. |

### ReturnValue

Nombre de caractères écrits.

## Voir aussi

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

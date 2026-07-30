---
title: "System::Text::Encoding::GetBytes méthode"
linktitle: "GetBytes"
second_title: "Aspose.Font pour C++"
description: "System::Text::Encoding::GetBytes méthode. Obtient les octets résultant du codage d'un tampon de caractères en C++."
type: docs
weight: 1800
url: /fr/cpp/system.text/encoding/getbytes/
---
## Encoding::GetBytes(ArrayPtr\<char_t\>) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caractères à encoder. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
virtual int System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caractères à encoder. |
| char_index | int | Début de la tranche de caractères. |
| char_count | int | Nombre de caractères à convertir. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) pour placer les caractères. |
| byte_index | int | Décalage du tampon de sortie. |

### ReturnValue

Nombre d'octets écrits.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caractères à encoder. |
| indice | int | Début de la tranche de caractères. |
| count | int | Nombre de caractères à convertir. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetBytes(const char_t *, int, uint8_t *, int) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
virtual int System::Text::Encoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | const char_t * | Caractères à encoder. |
| char_count | int | Nombre de caractères à convertir. |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) pour placer les caractères. |
| byte_count | int | Taille du tampon de sortie. |

### ReturnValue

Nombre d'octets écrits.

## Voir aussi

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetBytes(const String\&) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) à encoder. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
virtual int System::Text::Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) à encoder. |
| char_index | int | Début de la tranche de caractères. |
| char_count | int | Nombre de caractères à convertir. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) pour placer les caractères. |
| byte_index | int | Décalage du tampon de sortie. |

### ReturnValue

Nombre d'octets écrits.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | Caractères à encoder. |
| indice | int | Début de la tranche de caractères. |
| count | int | Nombre de caractères à convertir. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | Caractères à encoder. |
| indice | int | Début de la tranche de caractères. |
| count | int | Nombre de caractères à convertir. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | Caractères à encoder. |
| char_index | int | Début de la tranche de caractères. |
| char_count | int | Nombre de caractères à convertir. |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) pour placer les caractères. |
| byte_index | int | Décalage du tampon de sortie. |

### ReturnValue

Nombre d'octets écrits.

## Voir aussi

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


Obtenez les octets résultant de l'encodage d'un tampon de caractères.

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | Caractères à encoder. |
| char_index | int | Début de la tranche de caractères. |
| char_count | int | Nombre de caractères à convertir. |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) pour placer les caractères. |
| byte_index | int | Décalage du tampon de sortie. |

### ReturnValue

Nombre d'octets écrits.

## Voir aussi

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

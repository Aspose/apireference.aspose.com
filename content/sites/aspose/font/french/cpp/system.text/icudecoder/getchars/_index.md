---
title: "Méthode System::Text::ICUDecoder::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Text::ICUDecoder::GetChars. Obtient les caractères résultant du décodage d'un tampon en C++."
type: docs
weight: 500
url: /fr/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Obtenez les caractères résultant du décodage d’un tampon.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | ArrayPtr\<uint8_t\> | Octets à décoder. |
| byteIndex | int | Décalage du tampon d'entrée. |
| byteCount | int | Taille du tampon d'entrée. |
| chars | ArrayPtr\<char_t\> | Tampon de caractères de destination. |
| charIndex | int | Décalage du tableau de destination. |

### ReturnValue

Nombre de caractères écrits.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Obtenez les caractères résultant du décodage d’un tampon.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | ArrayPtr\<uint8_t\> | Octets à décoder. |
| byteIndex | int | Décalage du tampon d'entrée. |
| byteCount | int | Taille du tampon d'entrée. |
| chars | ArrayPtr\<char_t\> | Tampon de caractères de destination. |
| charIndex | int | Décalage du tableau de destination. |
| flush | bool | Si vrai, nettoie l'état interne du décodeur après le calcul. |

### ReturnValue

Nombre de caractères écrits.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Obtenez les caractères résultant du décodage d’un tampon.

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | const uint8_t * | Octets à décoder. |
| byteCount | int | Taille du tampon d'entrée. |
| chars | char_t * | Tampon de caractères de destination. |
| charCount | int | Taille du tableau de destination. |
| flush | bool | Si vrai, nettoie l'état interne du décodeur après le calcul. |

### ReturnValue

Nombre de caractères écrits.

## Voir aussi

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

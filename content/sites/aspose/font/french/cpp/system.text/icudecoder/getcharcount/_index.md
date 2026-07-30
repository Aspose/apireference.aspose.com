---
title: "Méthode System::Text::ICUDecoder::GetCharCount"
linktitle: "GetCharCount"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Text::ICUDecoder::GetCharCount. Obtient le nombre de caractères nécessaires pour décoder un tampon en C++."
type: docs
weight: 400
url: /fr/cpp/system.text/icudecoder/getcharcount/
---
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


Obtient le nombre de caractères nécessaires pour décoder un tampon.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | ArrayPtr\<uint8_t\> | Octets à décoder. |
| index | int | [Buffer](../../../system/buffer/) décalage. |
| count | int | Nombre d’octets à décoder. |

### ReturnValue

Nombre de caractères requis pour décoder le tampon.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


Obtient le nombre de caractères nécessaires pour décoder un tampon.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | ArrayPtr\<uint8_t\> | Octets à décoder. |
| index | int | [Buffer](../../../system/buffer/) décalage. |
| count | int | Nombre d’octets à décoder. |
| flush | bool | Si vrai, nettoie l'état interne du décodeur après le calcul. |

### ReturnValue

Nombre de caractères requis pour décoder le tampon.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetCharCount(const uint8_t *, int, bool) method


Obtient le nombre de caractères nécessaires pour décoder un tampon.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | const uint8_t * | Octets à décoder. |
| count | int | Nombre d’octets à décoder. |
| flush | bool | Si vrai, nettoie l'état interne du décodeur après le calcul. |

### ReturnValue

Nombre de caractères requis pour décoder le tampon.

## Voir aussi

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

---
title: "System::Text::ICUEncoder::GetByteCount méthode"
linktitle: "GetByteCount"
second_title: "Aspose.Font pour C++"
description: "System::Text::ICUEncoder::GetByteCount méthode. Obtient le nombre d'octets nécessaires pour encoder un tampon en C++."
type: docs
weight: 400
url: /fr/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Obtient le nombre d'octets nécessaires pour encoder un tampon.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caractères à encoder. |
| index | int | [Buffer](../../../system/buffer/) décalage. |
| count | int | Nombre de caractères à encoder. |
| flush | bool | Si vrai, nettoie l'état interne de l'encodeur après le calcul. |

### ReturnValue

Nombre d’octets requis pour encoder le tampon.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


Obtient le nombre d'octets nécessaires pour encoder un tampon.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | const char_t * | Caractères à encoder. |
| count | int | Nombre de caractères à encoder. |
| flush | bool | Si vrai, nettoie l'état interne de l'encodeur après le calcul. |

### ReturnValue

Nombre d’octets requis pour encoder le tampon.

## Voir aussi

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

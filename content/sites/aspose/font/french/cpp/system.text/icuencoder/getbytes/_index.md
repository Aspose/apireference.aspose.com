---
title: "System::Text::ICUEncoder::GetBytes méthode"
linktitle: "GetBytes"
second_title: "Aspose.Font pour C++"
description: "System::Text::ICUEncoder::GetBytes méthode. Obtient les octets résultant du codage d'un tampon en C++."
type: docs
weight: 500
url: /fr/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


Obtenez les octets résultant de l'encodage d'un tampon.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caractères à encoder. |
| charIndex | int | Décalage du tableau source. |
| charCount | int | Longueur du sous-tableau source. |
| octets | ArrayPtr\<uint8_t\> | Tampon d'octets de destination. |
| byteIndex | int | Décalage du tampon de destination. |
| flush | bool | Si vrai, nettoie l'état interne de l'encodeur après le calcul. |

### ReturnValue

Nombre d'octets écrits.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


Obtenez les octets résultant de l'encodage d'un tampon.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | const char_t * | Caractères à encoder. |
| charCount | int | Longueur du tableau source. |
| octets | uint8_t * | Tampon d'octets de destination. |
| byteCount | int | Taille du tampon de destination. |
| flush | bool | Si vrai, nettoie l'état interne de l'encodeur après le calcul. |

### ReturnValue

Nombre d'octets écrits.

## Voir aussi

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

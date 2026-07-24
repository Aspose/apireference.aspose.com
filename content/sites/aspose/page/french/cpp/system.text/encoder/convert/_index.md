---
title: "Méthode System::Text::Encoder::Convert"
linktitle: "Convertir"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Text::Encoder::Convert. Convertit des caractères en octets en C++."
type: docs
weight: 100
url: /fr/cpp/system.text/encoder/convert/
---
## Encoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


Convertit les caractères en octets.

```cpp
virtual void System::Text::Encoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Caractères à encoder. |
| charIndex | int | Décalage du tampon d'entrée. |
| charCount | int | Taille du tampon d'entrée. |
| octets | ArrayPtr\<uint8_t\> | Tampon d'octets de destination. |
| byteIndex | int | Décalage du tableau de destination. |
| byteCount | int | Taille du tableau de destination. |
| flush | bool | Si vrai, nettoie l'état interne de l'encodeur après le calcul. |
| charsUsed | int\& | Référence à la variable pour stocker le nombre de caractères lus. |
| bytesUsed | int\& | Référence à la variable pour stocker le nombre d'octets écrits. |
| completed | bool\& | Référence à la variable à définir sur vrai si le tampon d'entrée est épuisé et sur faux sinon. |

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


Convertit les caractères en octets.

```cpp
virtual void System::Text::Encoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| chars | const char_t * | Caractères à encoder. |
| charCount | int | Taille du tampon d'entrée. |
| octets | uint8_t * | Tampon d'octets de destination. |
| byteCount | int | Taille du tableau de destination. |
| flush | bool | Si vrai, nettoie l'état interne de l'encodeur après le calcul. |
| charsUsed | int\& | Référence à la variable pour stocker le nombre de caractères lus. |
| bytesUsed | int\& | Référence à la variable pour stocker le nombre d'octets écrits. |
| completed | bool\& | Référence à la variable à définir sur vrai si le tampon d'entrée est épuisé et sur faux sinon. |

## Voir aussi

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Text::Decoder::Convert méthode"
linktitle: "Convert"
second_title: "Aspose.Font pour C++"
description: "System::Text::Decoder::Convert méthode. Convertit les octets en caractères en C++."
type: docs
weight: 100
url: /fr/cpp/system.text/decoder/convert/
---
## Decoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Convertit les octets en caractères.

```cpp
virtual void System::Text::Decoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | ArrayPtr\<uint8_t\> | Octets à décoder. |
| byteIndex | int | Décalage du tampon d'entrée. |
| byteCount | int | Taille du tampon d'entrée. |
| chars | ArrayPtr\<char_t\> | Tampon de caractères de destination. |
| charIndex | int | Décalage du tableau de destination. |
| charCount | int | Taille du tableau de destination. |
| flush | bool | Si vrai, nettoie l'état interne du décodeur après le calcul. |
| bytesUsed | int\& | Référence à la variable pour stocker le nombre d'octets lus. |
| charsUsed | int\& | Référence à la variable pour stocker le nombre de caractères écrits. |
| completed | bool\& | Référence à la variable à mettre à vrai si le tampon d'entrée a été épuisé et à faux sinon. |

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Convertit les octets en caractères.

```cpp
virtual void System::Text::Decoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| octets | const uint8_t * | Octets à décoder. |
| byteCount | int | Taille du tampon d'entrée. |
| chars | char_t * | Tampon de caractères de destination. |
| charCount | int | Taille du tableau de destination. |
| flush | bool | Si vrai, nettoie l'état interne du décodeur après le calcul. |
| bytesUsed | int\& | Référence à la variable pour stocker le nombre d'octets lus. |
| charsUsed | int\& | Référence à la variable pour stocker le nombre de caractères écrits. |
| completed | bool\& | Référence à la variable à mettre à vrai si le tampon d'entrée a été épuisé et à faux sinon. |

## Voir aussi

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

---
title: "System::Text::EncoderFallbackBuffer::Fallback méthode"
linktitle: "Fallback"
second_title: "Aspose.Page pour C++"
description: "System::Text::EncoderFallbackBuffer::Fallback méthode. Implémente la procédure de repli réelle en C++."
type: docs
weight: 100
url: /fr/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Implémente la procédure de repli réelle.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charUnknown | char_t | L'encodeur de caractères ne parvient pas à encoder. |
| indice | int | Index du caractère qui a déclenché l'erreur. |

### ReturnValue

Vrai si le tampon traite les caractères inconnus, faux s'il les ignore.

## Voir aussi

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Implémente la procédure de repli réelle.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charUnknownHigh | char_t | Partie haute de la paire de substitution qui a déclenché l'erreur. |
| charUnknownLow | char_t | Partie basse de la paire de substitution qui a déclenché l'erreur. |
| indice | int | Index du caractère qui a déclenché l'erreur. |

### ReturnValue

Vrai si le tampon traite les caractères inconnus, faux s'il les ignore.

## Voir aussi

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "Méthode System::Text::EncoderReplacementFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Text::EncoderReplacementFallbackBuffer::Fallback. Gère l'échec d'encodage en C++."
type: docs
weight: 200
url: /fr/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Gère les échecs d'encodage.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charUnknown | char_t | Caractère inconnu; ignoré. |
| indice | int | Position de caractère inconnue; ignorée. |

### ReturnValue

Vrai si la chaîne de remplacement est fournie et n’est pas vide, sinon faux.

## Voir aussi

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Gère les échecs d'encodage.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charUnknownHigh | char_t | Partie haute de la paire de substitution qui a déclenché l'erreur. |
| charUnknownLow | char_t | Partie basse de la paire de substitution qui a déclenché l'erreur. |
| indice | int | Position de caractère inconnue; ignorée. |

### ReturnValue

Vrai si la chaîne de remplacement est fournie et n’est pas vide, sinon faux.

## Voir aussi

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)

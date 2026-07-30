---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback méthode"
linktitle: "Fallback"
second_title: "Aspose.Font pour C++"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback méthode. Gère les échecs d'encodage en C++."
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
| charUnknown | char_t | Caractère inconnu ; ignoré. |
| indice | int | Position de caractère inconnue ; ignorée. |

### ReturnValue

Vrai si la chaîne de remplacement est fournie et n'est pas vide, faux sinon.

## Voir aussi

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Gère les échecs d'encodage.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charUnknownHigh | char_t | Partie haute de la paire de substitution qui a déclenché l'erreur. |
| charUnknownLow | char_t | Partie basse de la paire de substitution qui a déclenché l'erreur. |
| indice | int | Position de caractère inconnue ; ignorée. |

### ReturnValue

Vrai si la chaîne de remplacement est fournie et n'est pas vide, faux sinon.

## Voir aussi

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

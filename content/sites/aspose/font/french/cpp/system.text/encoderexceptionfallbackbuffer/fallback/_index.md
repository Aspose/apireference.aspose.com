---
title: "System::Text::EncoderExceptionFallbackBuffer::Fallback méthode"
linktitle: "Fallback"
second_title: "Aspose.Font pour C++"
description: "System::Text::EncoderExceptionFallbackBuffer::Fallback méthode. Gère l'échec d'encodage en C++."
type: docs
weight: 200
url: /fr/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


Gère les échecs d'encodage.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charUnknown | char_t | Caractères inconnus ; ignorés. |
| indice | int | Décalage des caractères inconnus ; ignoré. |

### ReturnValue

Ne retourne jamais réellement, lève une exception à la place.

## Voir aussi

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


Gère les échecs d'encodage.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| charUnknownHigh | char_t | Partie haute de la paire de substitution qui a déclenché l'erreur. |
| charUnknownLow | char_t | Partie basse de la paire de substitution qui a déclenché l'erreur. |
| indice | int | Décalage du caractère inconnu ; ignoré. |

### ReturnValue

Ne retourne jamais réellement, lève une exception à la place.

## Voir aussi

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

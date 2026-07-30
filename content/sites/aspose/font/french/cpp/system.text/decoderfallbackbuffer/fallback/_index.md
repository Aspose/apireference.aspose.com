---
title: "System::Text::DecoderFallbackBuffer::Fallback méthode"
linktitle: "Fallback"
second_title: "Aspose.Font pour C++"
description: "System::Text::DecoderFallbackBuffer::Fallback méthode. Implémente la procédure réelle de repli en C++."
type: docs
weight: 100
url: /fr/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


Implémente la procédure de repli réelle.

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) d'octets incluant celui que le décodeur ne parvient pas à décoder. |
| indice | int | Indice de l'octet qui a déclenché l'erreur. |

### ReturnValue

Vrai si le tampon traite les octets inconnus, faux s'il les ignore.

## Voir aussi

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)

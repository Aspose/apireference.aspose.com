---
title: "System::String::ToByteArray méthode"
linktitle: "ToByteArray"
second_title: "Aspose.Page pour C++"
description: "System::String::ToByteArray méthode. Convertit une chaîne ou une sous‑chaîne en tableau d'octets en C++."
type: docs
weight: 4700
url: /fr/cpp/system/string/tobytearray/
---
## String::ToByteArray method


Convertit la chaîne ou la sous‑chaîne en tableau d'octets.

```cpp
ArrayPtr<uint8_t> System::String::ToByteArray(int32_t startIndex=0, int32_t length=INT32_MAX, bool LE=true) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| startIndex | int32_t | Indice de début de la sous-chaîne. |
| length | int32_t | Longueur de la sous-chaîne. |
| LE | bool | Si vrai, encode les caractères en utilisant le petit‑endian ; sinon, utilise le gros‑endian. |

### ReturnValue

[Array](../../array/) containing bytes representing characters of the string.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

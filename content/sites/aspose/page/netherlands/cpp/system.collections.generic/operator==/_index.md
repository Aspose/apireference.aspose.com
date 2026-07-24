---
title: "System::Collections::Generic::operator== methode"
linktitle: "operator=="
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::operator== methode. Vergelijkt twee sleutel‑waardeparen met behulp van ''equals''‑semantiek. Gebruikt operator == of de EqualsTo‑methode voor zowel sleutels als waarden, afhankelijk van wat gedefinieerd is in C++."
type: docs
weight: 5600
url: /nl/cpp/system.collections.generic/operator==/
---
## System::Collections::Generic::operator== method


Vergelijkt twee sleutel‑waardeparen met behulp van 'equals'‑semantiek. Gebruikt operator == of de EqualsTo‑methode voor zowel sleutels als waarden, afhankelijk van wat gedefinieerd is.

```cpp
template<typename TKey,typename TValue> bool System::Collections::Generic::operator==(const KeyValuePair<TKey, TValue> &left, const KeyValuePair<TKey, TValue> &right)
```


| Parameter | Beschrijving |
| --- | --- |
| TKey | Sleuteltype. |
| TValue | Waarde‑type. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| links | const KeyValuePair\<TKey, TValue\>\& | LHS operand. |
| rechts | const KeyValuePair\<TKey, TValue\>\& | RHS-operander. |

### ReturnValue

Waar als zowel sleutels als waarden overeenkomen, anders onwaar.

## Zie ook

* Class [KeyValuePair](../keyvaluepair/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

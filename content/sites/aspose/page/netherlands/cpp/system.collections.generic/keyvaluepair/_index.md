---
title: "System::Collections::Generic::KeyValuePair klasse"
linktitle: "KeyValuePair"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::KeyValuePair klasse. Koppel van sleutel en waarde. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de System::SmartPtr‑klasse om objecten van dit type te beheren in C++."
type: docs
weight: 2900
url: /nl/cpp/system.collections.generic/keyvaluepair/
---
## KeyValuePair class


Koppel van sleutel en waarde. Dit type moet op de stack worden gealloceerd en aan functies worden doorgegeven per waarde of per referentie. Gebruik nooit de [System::SmartPtr](../../system/smartptr/)‑klasse om objecten van dit type te beheren.

```cpp
template<typename TKey,typename TValue>class KeyValuePair
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_Key](./get_key/)() const | Haalt sleutel op. |
| [get_Value](./get_value/)() const | Haalt waarde op. |
| [GetHashCode](./gethashcode/)() const | Berekent de hash van het sleutel‑waarde‑koppel door de hashes van sleutel en waarde te XOR‑en. |
| [IsNull](./isnull/)() const | Geeft altijd false terug. |
| [KeyValuePair](./keyvaluepair/)() | Null‑initialisatie van sleutel‑waarde‑koppel. |
| [KeyValuePair](./keyvaluepair/)(const TKey\&, const TValue\&) | Constructor. |
| [KeyValuePair](./keyvaluepair/)(const std::pair\<OtherK, OtherV\>\&) | Type‑conversie‑constructor. |
| [operator<](./operator_/)(const KeyValuePair\&) const | Patch voor klassen die erven van [IComparer<KeyValuePair<TKey, TValue>>](../icomparer/), vergelijkt niets. |
| [ToString](./tostring/)() const | Converteert sleutel‑waarde‑koppel naar string. |

## Zie ook

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

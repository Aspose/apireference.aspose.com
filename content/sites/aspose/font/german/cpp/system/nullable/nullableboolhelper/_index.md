---
title: "System::Nullable::NullableBoolHelper Methode"
linktitle: "NullableBoolHelper"
second_title: "Aspose.Font für C++"
description: "System::Nullable::NullableBoolHelper Methode. Hilfsfunktion, um zu prüfen, ob **this** und **other** beide nicht null sind und in diesem Fall ein Lambda aufzurufen. Wird in Implementierungen in C++ verwendet."
type: docs
weight: 800
url: /de/cpp/system/nullable/nullableboolhelper/
---
## Nullable::NullableBoolHelper method


Hilfsfunktion, um zu prüfen, ob dieses und **other** beide nicht null sind und ggf. ein Lambda aufzurufen. Wird in Implementierungen verwendet.

```cpp
template<typename T1> bool System::Nullable<T>::NullableBoolHelper(const T1 &other, const std::function<bool()> &f, bool default_if_both_are_null=false) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Anderer nullable Typ. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const T1\& | Anderer nullable Wert zum Vergleichen. |
| f | const std::function\<bool()>\& | Lambda, das aufgerufen wird, wenn sowohl **this** als auch **other** nicht null sind. |
| default_if_both_are_null | bool | Rückgabewert, wenn beide Werte null sind. |

### ReturnValue

false, wenn entweder **this** oder **other** null ist; **default_if_both_are_null**, wenn beide null sind; Ergebnis des Aufrufs von **f**, wenn beide nicht null sind.

## Siehe auch

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

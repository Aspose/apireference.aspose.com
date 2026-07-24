---
title: "System::Nullable::operator&= Methode"
linktitle: "operator&="
second_title: "Aspose.Page für C++"
description: "System::Nullable::operator&= Methode. Wendet operator&=() auf den vom aktuellen Objekt dargestellten Wert an und verwendet den angegebenen Wert als Rechtsargument in C++."
type: docs
weight: 1100
url: /de/cpp/system/nullable/operator&=/
---
## Nullable::operator&= method


Wendet [operator&=()](./) auf den vom aktuellen Objekt dargestellten Wert an und verwendet den angegebenen Wert als Rechtsargument.

```cpp
template<typename T1> std::enable_if<std::is_same<T1, bool>::value, Nullable<T>>::type System::Nullable<T>::operator&=(bool other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Template-Parameter, damit SFINAE funktioniert. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| other | bool | Ein boolescher Wert, der als Rechtswert des [operator&=()](./) verwendet wird, das auf den vom aktuellen Objekt dargestellten Wert angewendet wird. |

### ReturnValue

Eine Referenz auf das aktuelle Objekt.

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

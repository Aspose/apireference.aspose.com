---
title: "System::Nullable::operator+ Methode"
linktitle: "operator+"
second_title: "Aspose.Font für C++"
description: "System::Nullable::operator+ Methode. Addiert nullable Werte in C++."
type: docs
weight: 1200
url: /de/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


Addiert nullable Werte.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Typ des rechten Operanden. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const Nullable\<T1\>\& | Wert zum Hinzufügen. |

### ReturnValue

Summierungsergebnis.

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(const T1\&) const method


Addiert nullable und nicht-nullable Werte.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Typ des rechten Operanden. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| andere | const T1\& | Wert zum Hinzufügen. |

### ReturnValue

Summierungsergebnis.

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Gibt eine standardmäßig konstruierte Instanz der Klasse Nullable<T> zurück.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## Siehe auch

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

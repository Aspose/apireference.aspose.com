---
title: "System::operator<=‑metod"
linktitle: "operator<="
second_title: "Aspose.Page för C++"
description: "System::operator<=‑metod. Bestämmer om det angivna värdet är mindre än eller lika med värdet som representeras av det angivna Nullable‑objektet genom att tillämpa operator<=() på dessa värden i C++."
type: docs
weight: 31900
url: /sv/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


Bestämmer om det angivna värdet är mindre än eller lika med värdet som representeras av det angivna [Nullable](../nullable/)‑objektet genom att tillämpa [operator<=()](./) på dessa värden.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Typen för det första jämförelsevärdet |
| T2 | Den underliggande typen av [Nullable](../nullable/)‑objektet som representerar det andra jämförelsevärdet |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| några | const T1\& | En konstant referens till värdet som ska användas som den första jämförelseoperanden |
| other | const Nullable\<T2\>\& | En konstant referens till [Nullable](../nullable/)‑objektet vars representerade värde ska användas som den andra jämförelseoperanden |

### ReturnValue

Sant om den första jämförelsetermen är mindre än eller lika med den andra jämförelsetermen, annars - falskt

## Se även

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## Se även

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


Returnerar alltid falskt.

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## Se även

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## Se även

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## Se även

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
title: System::operator>=‑metod
länktitel: operator>=
andra_titel: Aspose.Page för C++
description: 'System::operator>=‑metod. Bestämmer om det angivna värdet är större än eller lika med värdet som representeras av det angivna Nullable‑objektet genom att tillämpa operator>=() på dessa värden i C++.'
typ: docs
weight: 34600
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


Bestämmer om det angivna värdet är större än eller lika med värdet som representeras av det angivna [Nullable](../nullable/)‑objektet genom att tillämpa [operator>=()](./) på dessa värden.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Typen för det första jämförelsevärdet |
| T2 | Den underliggande typen av [Nullable](../nullable/)‑objektet som representerar det andra jämförelsevärdet |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| några | const T1\& | En konstant referens till värdet som ska användas som den första jämförelseoperanden |
| other | const Nullable\<T2\>\& | En konstant referens till [Nullable](../nullable/)‑objektet vars representerade värde ska användas som den andra jämförelseoperanden |

### ReturnValue

Sant om den första jämförelsetermen är större än eller lika med den andra jämförelsetermen, annars - falskt

## Se även

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## Se även

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


Returnerar alltid falskt.

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## Se även

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## Se även

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## Se även

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

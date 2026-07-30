---
title: "System::operator<= yöntemi"
linktitle: "operator<="
second_title: "Aspose.Font için C++"
description: "System::operator<= yöntemi. Belirtilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değerden küçük veya eşit olup olmadığını, bu değerlere operator<=() uygulanarak C++'ta belirler."
type: docs
weight: 32000
url: /tr/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


Belirtilen değerin, belirtilen [Nullable](../nullable/) nesnesi tarafından temsil edilen değerden küçük veya eşit olup olmadığını, bu değerlere [operator<=()](./) uygulanarak belirler.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
```


| Parametre | Açıklama |
| --- | --- |
| T1 | İlk karşılaştırılan değerin türü |
| T2 | İkinci karşılaştırılan değeri temsil eden [Nullable](../nullable/) nesnenin temel türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bazı | const T1\& | İlk karşılaştırılan olarak kullanılacak değere sabit bir referans |
| other | const Nullable\<T2\>\& | İkinci karşılaştırılan olarak kullanılacak temsil edilen değere sahip [Nullable](../nullable/) nesneye sabit bir referans |

### ReturnValue

İlk karşılaştırılan değer ikinci karşılaştırılan değerden küçük veya eşitse doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## Ayrıca Bakınız

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


Her zaman false döndürür.

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## Ayrıca Bakınız

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## Ayrıca Bakınız

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
title: System::operator>= yöntemi
bağlantı başlığı: operator>=
ikinci başlık: Aspose.Font for C++
description: 'System::operator>= yöntemi. Belirtilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değerden büyük veya eşit olup olmadığını, bu değerlere operator>=() uygulanarak C++'ta belirler.'
tür: docs
ağırlık: 34700
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


Belirtilen değerin, belirtilen [Nullable](../nullable/) nesnesi tarafından temsil edilen değerden büyük veya eşit olup olmadığını, bu değerlere [operator>=()](./) uygulanarak belirler.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
```


| Parametre | Açıklama |
| --- | --- |
| T1 | İlk karşılaştırılan değerin türü |
| T2 | İkinci karşılaştırılan değeri temsil eden [Nullable](../nullable/) nesnenin temel türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| bazı | const T1\& | İlk karşılaştırılan olarak kullanılacak değere sabit bir referans |
| other | const Nullable\<T2\>\& | İkinci karşılaştırılan olarak kullanılacak temsil edilen değere sahip [Nullable](../nullable/) nesneye sabit bir referans |

### ReturnValue

İlk karşılaştırılan değer ikinci karşılaştırılan değerden büyük veya eşitse doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## Ayrıca Bakınız

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


Her zaman false döndürür.

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## Ayrıca Bakınız

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## Ayrıca Bakınız

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

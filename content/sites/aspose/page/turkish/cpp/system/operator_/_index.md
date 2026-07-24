---
title: "System::operator* yöntemi"
linktitle: "operator*"
second_title: "Aspose.Page için C++"
description: "System::operator* yöntemi. Belirtilen değerin ve belirtilen Decimal nesnesi tarafından temsil edilen değerin çarpımının sonucunu temsil eden Decimal sınıfının yeni bir örneğini döndürür."
type: docs
weight: 27400
url: /tr/cpp/system/operator_/
---
## System::operator* method


Belirtilen değerin ve belirtilen [Decimal](../decimal/) nesnesi tarafından temsil edilen değerin çarpımının sonucunu temsil eden [Decimal](../decimal/) sınıfının yeni bir örneğini döndürür.

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | const T\& | İlk çarpan |
| d | const Decimal\& | İkinci çarpanı temsil eden [Decimal](../decimal/) nesnesi |

### ReturnValue

**x** ile **d** tarafından temsil edilen değerin çarpımının sonucunu temsil eden [Decimal](../decimal/) sınıfının yeni bir örneği.

## Ayrıca Bakınız

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
başlık: System::operator< yöntemi
bağlantı başlığı: operator<
second_title: Aspose.Page for C++
description: 'System::operator< yöntemi. Belirtilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değerden daha küçük olup olmadığını, bu değerlere operator<() uygulanarak belirler C++'ta.'
type: docs
ağırlık: 28600
url: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


Belirtilen değerin, belirtilen [Nullable](../nullable/) nesnesi tarafından temsil edilen değerden daha küçük olup olmadığını, bu değerlere [operator<()](./) uygulanarak belirler.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | İlk karşılaştırılan değerin türü |
| T2 | İkinci karşılaştırılan değeri temsil eden [Nullable](../nullable/) nesnenin temel türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| bazı | const T1\& | İlk karşılaştırılan olarak kullanılacak değere sabit bir referans |
| other | const Nullable\<T2\>\& | İkinci karşılaştırılan olarak kullanılacak temsil edilen değere sahip [Nullable](../nullable/) nesneye sabit bir referans |

### ReturnValue

İlk karşılaştırılan değer ikinci karşılaştırılan değerden daha küçükse doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## Ayrıca Bakınız

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


Her zaman false döndürür.

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## Ayrıca Bakınız

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## Ayrıca Bakınız

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
başlık: System::operator> yöntemi
linktitle: operator>
second_title: Aspose.Page for C++
description: 'System::operator> yöntemi. Belirtilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değerden daha büyük olup olmadığını, bu değerlere operator>() uygulanarak belirler C++'ta.'
type: docs
ağırlık: 34100
url: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


Belirtilen değerin, belirtilen [Nullable](../nullable/) nesnesi tarafından temsil edilen değerden daha büyük olup olmadığını, bu değerlere [operator>()](./) uygulanarak belirler.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Açıklama |
| --- | --- |
| T1 | İlk karşılaştırılan değerin türü |
| T2 | İkinci karşılaştırılan değeri temsil eden [Nullable](../nullable/) nesnenin temel türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| bazı | const T1\& | İlk karşılaştırılan olarak kullanılacak değere sabit bir referans |
| other | const Nullable\<T2\>\& | İkinci karşılaştırılan olarak kullanılacak temsil edilen değere sahip [Nullable](../nullable/) nesneye sabit bir referans |

### ReturnValue

İlk karşılaştırılan değer ikinci karşılaştırılan değerden daha büyükse doğru, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## Ayrıca Bakınız

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


Her zaman false döndürür.

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## Ayrıca Bakınız

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## Ayrıca Bakınız

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## Ayrıca Bakınız

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

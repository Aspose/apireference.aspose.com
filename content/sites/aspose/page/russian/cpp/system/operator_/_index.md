---
title: "System::operator* метод"
linktitle: "operator*"
second_title: "Aspose.Page для C++"
description: "System::operator* метод. Возвращает новый экземпляр класса Decimal, представляющий значение, полученное в результате умножения указанного значения и значения, представленного указанным объектом Decimal в C++."
type: docs
weight: 27400
url: /ru/cpp/system/operator_/
---
## System::operator* method


Возвращает новый экземпляр класса [Decimal](../decimal/), представляющий значение, полученное в результате умножения указанного значения и значения, представленного указанным объектом [Decimal](../decimal/).

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| x | const T\& | Первый множитель |
| d | const Decimal\& | [Decimal](../decimal/) объект, представляющий второй множитель |

### ReturnValue

Новый экземпляр класса [Decimal](../decimal/), представляющий значение, полученное в результате умножения **x** и значения, представленного **d**.

## См. также

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
заголовок: System::operator< метод
заголовок ссылки: operator<
second_title: Aspose.Page для C++
description: 'System::operator< метод. Определяет, меньше ли указанное значение, чем значение, представленное указанным объектом Nullable, применяя operator<() к этим значениям в C++.'
type: docs
вес: 28600
url: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


Определяет, меньше ли указанное значение, чем значение, представленное указанным объектом [Nullable](../nullable/) путем применения [operator<()](./) к этим значениям.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип первого сравниваемого значения |
| T2 | Базовый тип объекта [Nullable](../nullable/), представляющего второе сравниваемое значение |

| Параметр | Тип | Описание |
| --- | --- | --- |
| некоторые | const T1\& | Константная ссылка на значение, которое будет использоваться в качестве первого сравниваемого |
| other | const Nullable\<T2\>\& | Константная ссылка на объект [Nullable](../nullable/), значение которого будет использоваться в качестве второго сравниваемого |

### ReturnValue

True если первый сравниваемый меньше второго сравниваемого, иначе - false

## См. также

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## См. также

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


Всегда возвращает false.

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## См. также

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## См. также

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## См. также

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
заголовок: System::operator> method
linktitle: operator>
second_title: Aspose.Page для C++
description: 'System::operator> метод. Определяет, больше ли указанное значение, чем значение, представленное указанным объектом Nullable, применяя operator>() к этим значениям в C++.'
type: docs
вес: 34100
url: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


Определяет, больше ли указанное значение, чем значение, представленное указанным объектом [Nullable](../nullable/) путем применения [operator>()](./) к этим значениям.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип первого сравниваемого значения |
| T2 | Базовый тип объекта [Nullable](../nullable/), представляющего второе сравниваемое значение |

| Параметр | Тип | Описание |
| --- | --- | --- |
| некоторые | const T1\& | Константная ссылка на значение, которое будет использоваться в качестве первого сравниваемого |
| other | const Nullable\<T2\>\& | Константная ссылка на объект [Nullable](../nullable/), значение которого будет использоваться в качестве второго сравниваемого |

### ReturnValue

True если первый сравниваемый больше второго сравниваемого, иначе - false

## См. также

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## См. также

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


Всегда возвращает false.

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## См. также

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## См. также

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## См. также

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::operator<= 메서드"
linktitle: "operator<="
second_title: "C++용 Aspose.Page"
description: "System::operator<= 메서드. 지정된 값이 지정된 Nullable 객체가 나타내는 값보다 작거나 같은지, C++에서 operator<=()를 적용하여 판단합니다."
type: docs
weight: 31900
url: /ko/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


지정된 값이 지정된 [Nullable](../nullable/) 객체가 나타내는 값보다 작거나 같은지, [operator<=()](./)를 적용하여 판단합니다.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 첫 번째 비교 피연산자 값의 유형 |
| T2 | 두 번째 비교 피연산자 값을 나타내는 [Nullable](../nullable/) 객체의 기본 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 일부 | const T1\& | 첫 번째 비교 피연산자로 사용될 값에 대한 상수 참조 |
| other | const Nullable\<T2\>\& | 두 번째 비교 피연산자로 사용될 값을 나타내는 [Nullable](../nullable/) 객체에 대한 상수 참조 |

### ReturnValue

첫 번째 비교 대상이 두 번째 비교 대상보다 작거나 같으면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## 또 보기

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


항상 false를 반환합니다.

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## 또 보기

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## 또 보기

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
title: System::operator>= 메서드
linktitle: operator>=
second_title: Aspose.Page for C++
description: 'System::operator>= 메서드. 지정된 값이 지정된 Nullable 객체가 나타내는 값보다 크거나 같은지, C++에서 operator>=()를 적용하여 판단합니다.'
type: docs
weight: 34600
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


지정된 값이 지정된 [Nullable](../nullable/) 객체가 나타내는 값보다 크거나 같은지, [operator>=()](./)를 적용하여 판단합니다.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
```


| 매개변수 | 설명 |
| --- | --- |
| T1 | 첫 번째 비교 피연산자 값의 유형 |
| T2 | 두 번째 비교 피연산자 값을 나타내는 [Nullable](../nullable/) 객체의 기본 유형 |

| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 일부 | const T1\& | 첫 번째 비교 피연산자로 사용될 값에 대한 상수 참조 |
| other | const Nullable\<T2\>\& | 두 번째 비교 피연산자로 사용될 값을 나타내는 [Nullable](../nullable/) 객체에 대한 상수 참조 |

### ReturnValue

첫 번째 비교 대상이 두 번째 비교 대상보다 크거나 같으면 true, 그렇지 않으면 false

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## 또 보기

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


항상 false를 반환합니다.

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## 또 보기

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## 또 보기

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## 또 보기

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

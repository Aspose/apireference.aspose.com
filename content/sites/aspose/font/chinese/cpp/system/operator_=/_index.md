---
title: "System::operator<= 方法"
linktitle: "operator<="
second_title: "Aspose.Font 适用于 C++"
description: "System::operator<= 方法。通过在 C++ 中对这些值应用 operator<=()，确定指定的值是否小于或等于由指定的 Nullable 对象表示的值。"
type: docs
weight: 32000
url: /zh/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


通过对这些值应用 [operator<=()](./)，确定指定的值是否小于或等于由指定的 [Nullable](../nullable/) 对象表示的值。

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 第一个比较值的类型 |
| T2 | 表示第二个比较值的 [Nullable](../nullable/) 对象的底层类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 一些 | const T1\& | 用于作为第一个比较值的值的常量引用 |
| other | const Nullable\<T2\>\& | 用于作为第二个比较值的值的 [Nullable](../nullable/) 对象的常量引用 |

### ReturnValue

如果第一个比较对象小于或等于第二个比较对象，则为 true；否则为 false

## 另见

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## 另见

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


始终返回 false。

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## 另见

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## 另见

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## 另见

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
title: System::operator>= 方法
链接标题: operator>=
次标题: Aspose.Font for C++
description: 'System::operator>= 方法。通过在 C++ 中对这些值应用 operator>=()，确定指定的值是否大于或等于由指定的 Nullable 对象表示的值。'
类型: 文档
权重: 34700
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


通过对这些值应用 [operator>=()](./)，确定指定的值是否大于或等于由指定的 [Nullable](../nullable/) 对象表示的值。

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 第一个比较值的类型 |
| T2 | 表示第二个比较值的 [Nullable](../nullable/) 对象的底层类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 一些 | const T1\& | 用于作为第一个比较值的值的常量引用 |
| other | const Nullable\<T2\>\& | 用于作为第二个比较值的值的 [Nullable](../nullable/) 对象的常量引用 |

### ReturnValue

如果第一个比较对象大于或等于第二个比较对象，则为 true；否则为 false

## 另见

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## 另见

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


始终返回 false。

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## 另见

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## 另见

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## 另见

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

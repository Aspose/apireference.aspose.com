---
title: "System::Nullable::operator+ 方法"
linktitle: "operator+"
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable::operator+ 方法。在 C++ 中对可空值执行加法。"
type: docs
weight: 1200
url: /zh/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


对可空值进行求和。

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| 参数 | 描述 |
| --- | --- |
| T1 | 右操作数类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 其他 | const Nullable\<T1\>\& | 要添加的值。 |

### ReturnValue

求和结果。

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(const T1\&) const method


对可空值和非可空值进行求和。

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| 参数 | 描述 |
| --- | --- |
| T1 | 右操作数类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 其他 | const T1\& | 要添加的值。 |

### ReturnValue

求和结果。

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


返回 Nullable<T> 类的默认构造实例。

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

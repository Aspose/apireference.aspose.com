---
title: "System::Nullable::operator-= 方法"
linktitle: "operator-="
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable::operator-= 方法。使用指定 Nullable 对象表示的值作为右侧参数，在 C++ 中对当前对象表示的值应用 operator-=()。"
type: docs
weight: 1500
url: /zh/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


将 [operator-=()](./) 应用于当前对象表示的值，使用指定的 [Nullable](../) 对象表示的值作为右侧参数。

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 一个 [Nullable](../) 对象的底层类型，其表示的值用作 [operator-=()](./) 的右侧参数。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 对 [Nullable](../) 对象的常量引用，其表示的值用作对当前对象表示的值应用的 [operator-=()](./) 的右侧参数。 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(const T1\&) method


将 [operator-=()](./) 应用于当前对象表示的值，使用指定的值作为右侧参数。

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| 参数 | 描述 |
| --- | --- |
| T1 | 作为 [operator-=()](./) 右侧值的值的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| other | const T1\& | 对用于当前对象表示的值上应用的 [operator-=()](./) 的右侧值的常量引用。 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(T1) method


返回表示空值的 [Nullable](../) 类的实例。

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

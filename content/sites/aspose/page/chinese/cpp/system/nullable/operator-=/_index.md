---
title: "System::Nullable::operator-= 方法"
linktitle: "operator-="
second_title: "Aspose.Page 适用于 C++"
description: "System::Nullable::operator-= 方法。将 operator-=() 应用于当前对象所表示的值，使用指定的 Nullable 对象所表示的值作为右侧参数（C++）。"
type: docs
weight: 1500
url: /zh/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


将 [operator-=()](./) 应用于当前对象所表示的值，使用指定的 [Nullable](../) 对象所表示的值作为右侧参数。

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| Parameter | 描述 |
| --- | --- |
| T1 | 一个 [Nullable](../) 对象的底层类型，其所表示的值用作 [operator-=()](./) 的右侧参数。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | 对 [Nullable](../) 对象的常量引用，其所表示的值用作对当前对象所表示的值应用的 [operator-=()](./) 的右侧参数。 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(const T1\&) method


将 [operator-=()](./) 应用于当前对象所表示的值，使用指定的值作为右侧参数。

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| Parameter | 描述 |
| --- | --- |
| T1 | 用作 [operator-=()](./) 右侧值的值的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| other | const T1\& | 对用于作为对当前对象所表示的值应用的 [operator-=()](./) 的右侧值的值的常量引用。 |

### ReturnValue

对自身的引用

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(T1) method


返回一个表示空值的 [Nullable](../) 类实例。

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## 另见

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

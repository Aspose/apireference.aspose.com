---
title: "System::Default 方法"
linktitle: "默认"
second_title: "Aspose.Font 适用于 C++"
description: "System::Default 方法。返回对异常类型在 C++ 中唯一默认构造实例的引用。"
type: docs
weight: 16300
url: /zh/cpp/system/default/
---
## System::Default() method


返回对异常类型唯一默认构造实例的引用。

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| 参数 | 描述 |
| --- | --- |
| T | 返回实例的类型 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Default() method


返回对非异常类型唯一默认构造实例的引用。

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| 参数 | 描述 |
| --- | --- |
| T | 返回实例的类型 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

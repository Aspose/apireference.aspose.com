---
title: "System::Default メソッド"
linktitle: "Default"
second_title: "C++ 用 Aspose.Page"
description: "System::Default メソッド。C++ における例外型のデフォルト構築インスタンスへの参照を返します。"
type: docs
weight: 16200
url: /ja/cpp/system/default/
---
## System::Default() method


例外型のデフォルト構築インスタンスへの参照を返します。

```cpp
template<typename T> std::enable_if<IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| パラメーター | 説明 |
| --- | --- |
| T | 返されるインスタンスの型 |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Default() method


例外でない型のデフォルト構築インスタンスへの参照を返します。

```cpp
template<typename T> std::enable_if<!IsExceptionWrapper<T>::value, constT &>::type System::Default()
```


| パラメーター | 説明 |
| --- | --- |
| T | 返されるインスタンスの型 |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

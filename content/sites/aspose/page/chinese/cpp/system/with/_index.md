---
title: "System::With 方法"
linktitle: "使用"
second_title: "Aspose.Page 适用于 C++"
description: "System::With 方法。在 C++ 中，克隆引用记录并对其应用初始化函数对象。"
type: docs
weight: 40100
url: /zh/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


克隆引用记录并对其应用初始化函数对象。

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parameter | 描述 |
| --- | --- |
| T | 要克隆的记录类型。 |
| A | 初始化函数对象类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | 指向要克隆和初始化的对象的共享指针。 |
| initializer | const A\& | 正在应用于 record 克隆的初始化函数对象。 |

### ReturnValue

指向克隆记录的共享指针。

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


复制结构体记录并对其应用初始化函数对象。

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parameter | 描述 |
| --- | --- |
| T | 要复制的记录类型。 |
| A | 初始化函数对象类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| record | const T\& | 要复制并初始化的记录。 |
| initializer | const A\& | 正在对记录副本应用初始化函数对象。 |

### ReturnValue

已复制的记录。

## 另见

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

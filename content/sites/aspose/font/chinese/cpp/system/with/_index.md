---
title: "System::With 方法"
linktitle: "With"
second_title: "Aspose.Font 适用于 C++"
description: "System::With 方法。克隆引用记录并在 C++ 中对其应用初始化函数对象。"
type: docs
weight: 40200
url: /zh/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


克隆引用记录并对其应用初始化函数对象。

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| 参数 | 描述 |
| --- | --- |
| T | 要克隆的记录类型。 |
| A | 初始化函数对象类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | 指向要克隆并初始化的对象的共享指针。 |
| 初始化器 | const A\& | 初始化函数对象正在应用于记录克隆。 |

### ReturnValue

指向克隆记录的共享指针。

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::With(const T\&, const A\&) method


复制结构体记录并将初始化函数对象应用于它。

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| 参数 | 描述 |
| --- | --- |
| T | 要复制的记录类型。 |
| A | 初始化函数对象类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| record | const T\& | 要复制并初始化的记录。 |
| 初始化器 | const A\& | 初始化函数对象正在应用于记录副本。 |

### ReturnValue

已复制的记录。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

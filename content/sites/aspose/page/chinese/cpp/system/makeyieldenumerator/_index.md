---
title: "System::MakeYieldEnumerator 方法"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Page 适用于 C++"
description: "System::MakeYieldEnumerator 方法。创建一个 IEnumerator，来自 C++ 中的 yield 函数。"
type: docs
weight: 25400
url: /zh/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


创建一个 IEnumerator，来自 yield 函数。

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| Parameter | 描述 |
| --- | --- |
| T | 序列中元素的类型 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | 要执行的 yield 函数 |

### ReturnValue

指向 IEnumerator 的共享指针

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

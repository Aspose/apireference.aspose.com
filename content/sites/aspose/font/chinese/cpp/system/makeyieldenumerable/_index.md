---
title: "System::MakeYieldEnumerable 方法"
linktitle: "MakeYieldEnumerable"
second_title: "Aspose.Font 适用于 C++"
description: "System::MakeYieldEnumerable 方法。用于在 C++ 中从 yield 函数创建 IEnumerable。"
type: docs
weight: 25400
url: /zh/cpp/system/makeyieldenumerable/
---
## System::MakeYieldEnumerable method


从 yield 函数创建 IEnumerable。

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerable<T>> System::MakeYieldEnumerable(const Details::YieldFunction<T> &fnc)
```


| 参数 | 描述 |
| --- | --- |
| T | 序列中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | 要执行的 yield 函数 |

### ReturnValue

指向 IEnumerable 的共享指针

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

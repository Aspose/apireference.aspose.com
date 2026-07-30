---
title: "System::MakeYieldEnumerator 方法"
linktitle: "MakeYieldEnumerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::MakeYieldEnumerator 方法。该方法在 C++ 中从 yield 函数创建 IEnumerator。"
type: docs
weight: 25500
url: /zh/cpp/system/makeyieldenumerator/
---
## System::MakeYieldEnumerator method


从 yield 函数创建 IEnumerator。

```cpp
template<typename T> SharedPtr<Collections::Generic::IEnumerator<T>> System::MakeYieldEnumerator(const Details::YieldFunction<T> &fnc)
```


| 参数 | 描述 |
| --- | --- |
| T | 序列中元素的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| fnc | const Details::YieldFunction\<T\>\& | 要执行的 yield 函数 |

### ReturnValue

指向 IEnumerator 的共享指针

## 另见

* Typedef [SharedPtr](../sharedptr/)
* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

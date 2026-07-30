---
title: "System::MakeScopeGuard 方法"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Font 适用于 C++"
description: "System::MakeScopeGuard 方法。一个在 C++ 中创建 ScopedGuard 类实例的工厂函数。"
type: docs
weight: 24800
url: /zh/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


一个创建 ScopedGuard 类实例的工厂函数。

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| 参数 | 描述 |
| --- | --- |
| 该 | 由构造的 ScopedGuard 对象调用的函数对象的类型 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| f | F | 传递给 ScopedGuard 类构造函数的函数对象。 |

### ReturnValue

ScopedGuard 类的一个新实例

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

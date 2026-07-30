---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::invoke method"
linktitle: "invoke"
second_title: "Aspose.Font 适用于 C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::invoke 方法。调用当前委托集合中所有存在的委托。委托按照添加到集合的顺序依次调用。该方法在 C++ 中会阻塞，直至委托执行完毕。"
type: docs
weight: 1200
url: /zh/cpp/system/multicastdelegate_returntype(argumenttypes...)_/invoke/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::invoke method


调用委托集合中当前存在的所有委托。委托按照添加到集合的顺序依次调用。该方法在委托执行期间会阻塞。

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::invoke(ArgumentTypes... args) const
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| args | ArgumentTypes... | 传递给要调用的委托的参数 |

### ReturnValue

最后一个被调用的委托的返回值

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)

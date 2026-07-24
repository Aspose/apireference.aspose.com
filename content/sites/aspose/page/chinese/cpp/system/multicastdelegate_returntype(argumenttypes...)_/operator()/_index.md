---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() 方法"
linktitle: "operator()"
second_title: "Aspose.Page 适用于 C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() 方法。 调用委托集合中当前存在的所有委托。委托按照添加到集合的顺序依次调用。该运算符在 C++ 中会阻塞，直到委托执行完毕。"
type: docs
weight: 1400
url: /zh/cpp/system/multicastdelegate_returntype(argumenttypes...)_/operator()/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::operator() method


调用委托集合中当前存在的所有委托。委托按照添加到集合的顺序依次调用。操作符在委托执行期间会阻塞。

```cpp
ReturnType System::MulticastDelegate<ReturnType(ArgumentTypes...)>::operator()(ArgumentTypes... args) const
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| args | ArgumentTypes... | 传递给要调用的委托的参数 |

### ReturnValue

最后一个被调用的委托的返回值

## 另见

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

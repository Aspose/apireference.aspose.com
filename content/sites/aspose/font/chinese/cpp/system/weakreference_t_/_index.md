---
title: "System::WeakReference< T > 类"
linktitle: "WeakReference< T >"
second_title: "Aspose.Font 适用于 C++"
description: "System::WeakReference< T > 类。表示弱引用，它在仍然允许对象被删除的情况下引用该对象（C++）。"
type: docs
weight: 7700
url: /zh/cpp/system/weakreference_t_/
---
## WeakReference< T > class


表示弱引用，它在引用对象的同时仍允许该对象被删除。

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| 参数 | 描述 |
| --- | --- |
| T | 被引用对象的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | 检查被引用的对象是否非空。 |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | 将被引用的对象与另一个实例 [WeakReference](../weakreference/) 类进行比较。 |
| [operator==](./operator==/)(std::nullptr_t) const | 检查被引用的对象是否为空。 |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | 将被引用的对象与另一个实例 [WeakReference](../weakreference/) 类进行比较。 |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | 设置当前 [WeakReference](../weakreference/) 对象所引用的对象（目标）。 |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | 获取当前 [WeakReference](../weakreference/) 对象所引用的对象（目标）。 |
| [WeakReference](./weakreference/)() | 默认构造函数。 |
| [WeakReference](./weakreference/)(std::nullptr_t) | 使用 nullptr 的构造函数。 |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | 初始化 [WeakReference](../weakreference/) 类的新实例，引用指定的对象。 |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | 初始化 [WeakReference](../weakreference/) 类的新实例，引用指定的对象。 |

## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

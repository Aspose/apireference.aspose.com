---
title: "System::WeakReference<> 类"
linktitle: "WeakReference<>"
second_title: "Aspose.Font 适用于 C++"
description: "System::WeakReference<> 类。表示一种弱引用，它在引用对象的同时仍允许该对象在 C++ 中被删除。"
type: docs
weight: 7800
url: /zh/cpp/system/weakreference__/
---
## WeakReference<> class


表示弱引用，它在引用对象的同时仍允许该对象被删除。

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | 获取当前 [WeakReference](../weakreference/) 对象所引用的对象是否已被删除的指示。 |
| [get_Target](./get_target/)() const | 获取当前 [WeakReference](../weakreference/) 对象所引用的对象（目标）。 |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | 设置当前 [WeakReference](../weakreference/) 对象所引用的对象（目标）。 |
| [WeakReference](./weakreference/)() | 默认构造函数。 |
| [WeakReference](./weakreference/)(std::nullptr_t) | 使用 nullptr 的构造函数。 |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | 初始化 [WeakReference](../weakreference/) 类的新实例，引用指定的对象。 |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | 初始化 [WeakReference](../weakreference/) 类的新实例，引用指定的对象。 |
## 另见

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

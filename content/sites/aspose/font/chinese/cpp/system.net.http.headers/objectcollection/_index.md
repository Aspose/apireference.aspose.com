---
title: "System::Net::Http::Headers::ObjectCollection 类"
linktitle: "ObjectCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Http::Headers::ObjectCollection 类。表示 C++ 中对象的集合。"
type: docs
weight: 1600
url: /zh/cpp/system.net.http.headers/objectcollection/
---
## ObjectCollection class


表示对象的集合。

```cpp
template<typename T>class ObjectCollection : public System::Collections::ObjectModel::Collection<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 对象类型。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [ObjectCollection](./objectcollection/)() | RTTI 信息。 |
| [ObjectCollection](./objectcollection/)(Action\<T\>) | 构造一个新实例。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而不是共享指针）。允许在容器中将指针切换为弱模式。 |

## 另见

* Class [Collection](../../system.collections.objectmodel/collection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)

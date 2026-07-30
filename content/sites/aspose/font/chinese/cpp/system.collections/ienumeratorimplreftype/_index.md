---
title: "System::Collections::IEnumeratorImplRefType 类"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::IEnumeratorImplRefType 类。该包装器在通用迭代器 IEnumeratorImplRefType 之上创建非泛型 IEnumerator 实现——用于 C++ 中引用类型的包装器。"
type: docs
weight: 700
url: /zh/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


包装器创建了非泛型的 [IEnumerator](../ienumerator/) 实现，基于泛型迭代器 [IEnumeratorImplRefType](./) - 用于引用类型的包装器。

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Current](./get_current/)() const override | 获取当前元素。 |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | 包装器构造函数 |
| [MoveNext](./movenext/)() override | 将枚举器移动到下一个元素。如果之前未引用任何元素，则将引用设置为第一个可用元素。如果已到达容器末尾，则不执行任何操作。 |

## 另见

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Collections::IEnumeratorImplValueType 类"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::IEnumeratorImplValueType 类。包装器在通用迭代器 IEnumeratorImplRefType 之上创建非泛型 IEnumerator 实现——用于 C++ 中值类型的包装器。"
type: docs
weight: 800
url: /zh/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


包装器在通用迭代器 [IEnumeratorImplRefType](../ienumeratorimplreftype/) 之上创建非泛型 [IEnumerator](../ienumerator/) 实现——用于值类型的包装器。

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Current](./get_current/)() const override | 获取当前元素。 |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | 包装器构造函数 |
| [MoveNext](./movenext/)() override | 将枚举器移动到下一个元素。如果之前未引用任何元素，则将引用设置为第一个可用元素。如果已到达容器末尾，则不执行任何操作。 |

## 另见

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)

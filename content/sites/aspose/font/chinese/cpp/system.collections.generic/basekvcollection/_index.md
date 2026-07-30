---
title: "System::Collections::Generic::BaseKVCollection 类"
linktitle: "BaseKVCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::BaseKVCollection 类。保存键或值集合的通用代码。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 700
url: /zh/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


保存键或值集合的通用代码。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| 参数 | 描述 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 类型。 |
| KV | 键或值类型，取决于接口的使用方式。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | 创建集合。 |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | 将数据复制到现有数组元素。 |
| [get_Count](./get_count/)() const override | 获取元素数量。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 启用编译，但实际上不执行任何操作，因为此结构不拥有数据。 |

## 另见

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

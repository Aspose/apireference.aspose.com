---
title: "System::Xml::Schema::XmlSchemaObjectEnumerator 类"
linktitle: "XmlSchemaObjectEnumerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaObjectEnumerator 类。表示 C++ 中 XmlSchemaObjectCollection 的枚举器。"
type: docs
weight: 5200
url: /zh/cpp/system.xml.schema/xmlschemaobjectenumerator/
---
## XmlSchemaObjectEnumerator class


表示 [XmlSchemaObjectCollection](../xmlschemaobjectcollection/) 的枚举器。

```cpp
class XmlSchemaObjectEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchemaObject>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 克隆当前迭代器。 |
| [Dispose](./dispose/)() override | 不执行任何操作。 |
| [get_Current](./get_current/)() const override | 返回集合中当前的 [XmlSchemaObject](../xmlschemaobject/)。 |
| [MoveNext](./movenext/)() override | 移动到集合中的下一个项。 |
| [Reset](./reset/)() override | 将枚举器重置到集合的起始位置。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [IEnumerator](../../system.collections.generic/ienumerator/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)

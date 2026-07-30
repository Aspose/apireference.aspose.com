---
title: "System::Xml::Schema::XmlSchemaCollectionEnumerator 类"
linktitle: "XmlSchemaCollectionEnumerator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaCollectionEnumerator 类。支持对集合的简单迭代。此类在 C++ 中不可继承。"
type: docs
weight: 1600
url: /zh/cpp/system.xml.schema/xmlschemacollectionenumerator/
---
## XmlSchemaCollectionEnumerator class


支持对集合的简单迭代。此类不可被继承。

```cpp
class XmlSchemaCollectionEnumerator : public System::Collections::Generic::IEnumerator<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 克隆当前迭代器。 |
| [Dispose](./dispose/)() override | 不执行任何操作。 |
| [get_Current](./get_current/)() const override | 返回集合中当前的 [XmlSchema](../xmlschema/)。 |
| [MoveNext](./movenext/)() override | 将枚举器前进到集合中的下一个模式。 |
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

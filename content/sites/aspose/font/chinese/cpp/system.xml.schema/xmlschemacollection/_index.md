---
title: "System::Xml::Schema::XmlSchemaCollection class"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Schema::XmlSchemaCollection 类。包含在 C++ 中的 XML Schema 定义语言 (XSD) 和 XML-Data Reduced (XDR) 模式的缓存。"
type: docs
weight: 1500
url: /zh/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


包含 XML [Schema](../) 定义语言 (XSD) 和 XML-Data Reduced (XDR) 模式的缓存。

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | 将由给定 URL 定位的模式添加到模式集合中。 |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | 将包含在 [XmlReader](../../system.xml/xmlreader/) 中的模式添加到模式集合中。 |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 将包含在 [XmlReader](../../system.xml/xmlreader/) 中的模式添加到模式集合中。指定的 [XmlResolver](../../system.xml/xmlresolver/) 用于解析任何外部资源。 |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | 将 [XmlSchema](../xmlschema/) 添加到集合中。 |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | 将 [XmlSchema](../xmlschema/) 添加到集合中。指定的 [XmlResolver](../../system.xml/xmlresolver/) 用于解析任何外部引用。 |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | 将给定集合中定义的所有命名空间（包括其关联的模式）添加到此集合中。 |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | 返回一个值，指示指定的 [XmlSchema](../xmlschema/) 的 **targetNamespace** 是否在集合中。 |
| [Contains](./contains/)(const String\&) | 返回一个值，指示具有指定命名空间的模式是否在集合中。 |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | 将此集合中的所有 [XmlSchema](../xmlschema/) 对象复制到给定数组中，从给定索引开始。 |
| [get_Count](./get_count/)() | 返回此集合中定义的命名空间数量。 |
| [get_NameTable](./get_nametable/)() | 返回在加载新模式时由 [XmlSchemaCollection](./) 使用的默认 [XmlNameTable](../../system.xml/xmlnametable/)。 |
| [GetEnumerator](./getenumerator/)() override | 提供对模式集合进行迭代的支持。 |
| [idx_get](./idx_get/)(const String\&) | 返回与给定命名空间 URI 关联的 [XmlSchema](../xmlschema/)。 |
| [XmlSchemaCollection](./xmlschemacollection/)() | 初始化一个新的 [XmlSchemaCollection](./) 类实例。 |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | 使用指定的 [XmlNameTable](../../system.xml/xmlnametable/) 初始化一个新的 [XmlSchemaCollection](./) 类实例。加载模式时会使用该 [XmlNameTable](../../system.xml/xmlnametable/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注


## Deprecated
XmlSchemaCollection 类已过时。请改用 XmlSchemaSet。

此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)

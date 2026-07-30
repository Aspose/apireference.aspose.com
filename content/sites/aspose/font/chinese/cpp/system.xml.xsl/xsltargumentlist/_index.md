---
title: "System::Xml::Xsl::XsltArgumentList 类"
linktitle: "XsltArgumentList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XsltArgumentList 类。包含可变数量的参数，这些参数可以是 XSLT 参数或 C++ 中的扩展对象。"
type: docs
weight: 400
url: /zh/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


包含可变数量的参数，这些参数可以是 XSLT 参数或扩展对象。

```cpp
class XsltArgumentList : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | 向 [XsltArgumentList](./) 添加新对象，并将其关联到命名空间 URI。 |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | 向 [XsltArgumentList](./) 添加参数，并将其与命名空间限定名称关联。 |
| [Clear](./clear/)() | 从 [XsltArgumentList](./) 中移除所有参数和扩展对象。 |
| [GetExtensionObject](./getextensionobject/)(const String\&) | 返回与给定命名空间关联的对象。 |
| [GetParam](./getparam/)(const String\&, const String\&) | 返回与命名空间限定名称关联的参数。 |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | 从 [XsltArgumentList](./) 中移除具有该命名空间 URI 的对象。 |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | 从 [XsltArgumentList](./) 中移除参数。 |
| [XsltArgumentList](./xsltargumentlist/)() | 创建一个新的 [XsltArgumentList](./) 实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)

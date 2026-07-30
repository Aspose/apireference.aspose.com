---
title: "System::Xml::Xsl::XsltSettings 类"
linktitle: "XsltSettings"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::Xsl::XsltSettings 类。指定在 C++ 中执行 XSLT 样式表时要支持的 XSLT 功能。"
type: docs
weight: 800
url: /zh/cpp/system.xml.xsl/xsltsettings/
---
## XsltSettings class


指定在执行 XSLT 样式表期间要支持的 XSLT 功能。

```cpp
class XsltSettings : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [get_Default](./get_default/)() | 返回具有默认设置的 [XsltSettings](./) 对象。对 XSLT **document()** 函数和嵌入式脚本块的支持已禁用。 |
| [get_EnableDocumentFunction](./get_enabledocumentfunction/)() | 返回一个值，指示是否启用对 XSLT **document()** 函数的支持。 |
| [get_EnableScript](./get_enablescript/)() | 返回一个值，指示是否启用对嵌入式脚本块的支持。 |
| static [get_TrustedXslt](./get_trustedxslt/)() | 返回一个启用对 XSLT **document()** 函数和嵌入式脚本块支持的 [XsltSettings](./) 对象。 |
| [set_EnableDocumentFunction](./set_enabledocumentfunction/)(bool) | 设置一个值，指示是否启用对 XSLT **document()** 函数的支持。 |
| [set_EnableScript](./set_enablescript/)(bool) | 设置一个值，指示是否启用对嵌入式脚本块的支持。 |
| [XsltSettings](./xsltsettings/)() | 使用默认设置初始化 [XsltSettings](./) 类的新实例。 |
| [XsltSettings](./xsltsettings/)(bool, bool) | 使用指定设置初始化 [XsltSettings](./) 类的新实例。 |
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

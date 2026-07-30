---
title: "System::Xml::XmlReaderSettings 类"
linktitle: "XmlReaderSettings"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlReaderSettings 类。指定在 C++ 中由 XmlReader::Create 方法创建的 XmlReader 对象上支持的一组功能。"
type: docs
weight: 3400
url: /zh/cpp/system.xml/xmlreadersettings/
---
## XmlReaderSettings class


指定在由 [XmlReader](../xmlreader/) 对象（由 [XmlReader::Create](../xmlreader/create/) 方法创建）上支持的一组功能。

```cpp
class XmlReaderSettings : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CheckReadOnly](./checkreadonly/)(const String\&) |  |
| [Clone](./clone/)() | 创建 [XmlReaderSettings](./) 实例的副本。 |
| [get_CheckCharacters](./get_checkcharacters/)() | 返回一个指示是否进行字符检查的值。 |
| [get_CloseInput](./get_closeinput/)() | 返回一个指示在读取器关闭时是否应关闭底层流或 TextReader 的值。 |
| [get_ConformanceLevel](./get_conformancelevel/)() | 返回 [XmlReader](../xmlreader/) 将遵循的合规级别。 |
| [get_DtdProcessing](./get_dtdprocessing/)() | 返回决定 DTD 处理方式的值。 |
| [get_IgnoreComments](./get_ignorecomments/)() | 返回一个指示是否忽略注释的值。 |
| [get_IgnoreProcessingInstructions](./get_ignoreprocessinginstructions/)() | 返回一个指示是否忽略处理指令的值。 |
| [get_IgnoreWhitespace](./get_ignorewhitespace/)() | 返回一个指示是否忽略无意义空白的值。 |
| [get_LineNumberOffset](./get_linenumberoffset/)() | 返回 [XmlReader](../xmlreader/) 对象的行号偏移。 |
| [get_LinePositionOffset](./get_linepositionoffset/)() | 返回 [XmlReader](../xmlreader/) 对象的行位置偏移。 |
| [get_MaxCharactersFromEntities](./get_maxcharactersfromentities/)() | 返回指示文档在展开实体后允许的最大字符数的值。 |
| [get_MaxCharactersInDocument](./get_maxcharactersindocument/)() | 返回指示 XML 文档中允许的最大字符数的值。零 (0) 值表示对 XML 文档大小没有限制。非零值指定以字符为单位的最大大小。 |
| [get_NameTable](./get_nametable/)() | 返回用于原子化字符串比较的 [XmlNameTable](../xmlnametable/)。 |
| [get_ProhibitDtd](./get_prohibitdtd/)() | 返回一个指示是否禁止文档类型定义 (DTD) 处理的值。 |
| [get_Schemas](./get_schemas/)() | 返回在执行模式验证时使用的 XmlSchemaSet。 |
| [get_ValidationFlags](./get_validationflags/)() | 返回指示模式验证设置的值。此设置适用于验证模式的 [XmlReader](../xmlreader/) 对象（[XmlReaderSettings::get_ValidationType](./get_validationtype/) 的值为 [ValidationType::Schema](../validationtype/)）。 |
| [get_ValidationType](./get_validationtype/)() | 返回一个指示在读取时 [XmlReader](../xmlreader/) 是否执行验证或类型分配的值。 |
| [Reset](./reset/)() | 将设置类的成员重置为默认值。 |
| [set_CheckCharacters](./set_checkcharacters/)(bool) | 设置一个指示是否进行字符检查的值。 |
| [set_CloseInput](./set_closeinput/)(bool) | 设置一个指示在读取器关闭时是否应关闭底层流或 TextReader 的值。 |
| [set_ConformanceLevel](./set_conformancelevel/)(System::Xml::ConformanceLevel) | 设置 [XmlReader](../xmlreader/) 将遵循的合规级别。 |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | 设置决定 DTD 处理方式的值。 |
| [set_IgnoreComments](./set_ignorecomments/)(bool) | 设置一个指示是否忽略注释的值。 |
| [set_IgnoreProcessingInstructions](./set_ignoreprocessinginstructions/)(bool) | 设置一个指示是否忽略处理指令的值。 |
| [set_IgnoreWhitespace](./set_ignorewhitespace/)(bool) | 设置一个指示是否忽略无意义空白的值。 |
| [set_LineNumberOffset](./set_linenumberoffset/)(int32_t) | 设置 [XmlReader](../xmlreader/) 对象的行号偏移。 |
| [set_LinePositionOffset](./set_linepositionoffset/)(int32_t) | 设置 [XmlReader](../xmlreader/) 对象的行位置偏移。 |
| [set_MaxCharactersFromEntities](./set_maxcharactersfromentities/)(int64_t) | 设置一个值，指示文档在展开实体后允许的最大字符数。 |
| [set_MaxCharactersInDocument](./set_maxcharactersindocument/)(int64_t) | 设置一个值，指示 XML 文档中允许的最大字符数。零 (0) 值表示对 XML 文档的大小没有限制。非零值指定以字符为单位的最大大小。 |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | 设置用于原子化字符串比较的 [XmlNameTable](../xmlnametable/)。 |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | 设置一个值，指示是否禁止文档类型定义 (DTD) 处理。 |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | 设置执行模式验证时使用的 XmlSchemaSet。 |
| [set_ValidationFlags](./set_validationflags/)(Schema::XmlSchemaValidationFlags) | 设置一个值，指示模式验证设置。此设置适用于验证模式的 [XmlReader](../xmlreader/) 对象（[XmlReaderSettings::get_ValidationType](./get_validationtype/) 的值为 [ValidationType::Schema](../validationtype/)）。 |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | 设置一个值，指示在读取时 [XmlReader](../xmlreader/) 是否执行验证或类型分配。 |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | 设置用于访问外部文档的 [XmlResolver](../xmlresolver/)。 |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | 添加在读取器遇到验证错误时触发的事件处理程序。 |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | 移除在读取器遇到验证错误时触发的事件处理程序。 |
| [XmlReaderSettings](./xmlreadersettings/)() | 初始化 [XmlReaderSettings](./) 类的新实例。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |
## 备注



此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)

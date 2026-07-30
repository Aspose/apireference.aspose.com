---
title: "System::Security::SecurityElement 类"
linktitle: "SecurityElement"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::SecurityElement 类。用于编码安全对象的 XML 对象模型。未实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.security/securityelement/
---
## SecurityElement class


用于编码安全对象的 XML 对象模型。未实现。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SecurityElement : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | 向标签添加属性。 |
| [AddChild](./addchild/)(SecurityElement) | 添加子标签。 |
| [Attribute](./attribute/)(const String\&) | 获取属性值。 |
| [Copy](./copy/)() | 克隆标签。 |
| [Equal](./equal/)(SecurityElement) | 检查参数是否相等。 |
| static [Escape](./escape/)(const String\&) | 转义 XML 字符串中的字符。 |
| static [FromString](./fromstring/)(const String\&) | 从 XML 代码创建元素。 |
| [get_Attributes](./get_attributes/)() | 获取标签属性。 |
| [get_Children](./get_children/)() | 获取标签子对象。 |
| [get_Tag](./get_tag/)() | 获取标签名称。 |
| [get_Text](./get_text/)() | 获取标签的内部文本。 |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | 检查属性名称是否有效。 |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | 检查属性值是否有效。 |
| static [IsValidTag](./isvalidtag/)(const String\&) | 检查标签是否有效。 |
| static [IsValidText](./isvalidtext/)(const String\&) | 检查文本是否有效。 |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | 按名称获取子标签。 |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | 按标签名称获取子标签的内部文本。 |
| [SecurityElement](./securityelement/)(const String\&) | 构造函数。 |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | 构造函数。 |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | 设置标签属性。 |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | 设置标签子对象。 |
| [set_Tag](./set_tag/)(const String\&) | 设置标签名称。 |
| [set_Text](./set_text/)(const String\&) | 设置标签内部文本。 |
| [ToString](./tostring/)() const override | 将标签转换为字符串。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Text::EncodingInfo 类"
linktitle: "EncodingInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::EncodingInfo 类。关于编码的简要信息。此类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1900
url: /zh/cpp/system.text/encodinginfo/
---
## EncodingInfo class


关于编码的简要信息。此类的对象只能通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class EncodingInfo : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [EncodingInfo](./encodinginfo/)(int, const String\&, const String\&) | 构造函数。 |
| [get_CodePage](./get_codepage/)() const | 获取代码页 ID。 |
| [get_DisplayName](./get_displayname/)() const | 获取完整的本地化编码名称。 |
| [get_Name](./get_name/)() const | 获取编码的短名称。 |
| [GetEncoding](./getencoding/)() | 获取由信息描述的编码。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)

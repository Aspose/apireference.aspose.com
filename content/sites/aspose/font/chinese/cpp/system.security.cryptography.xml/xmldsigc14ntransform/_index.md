---
title: "System::Security::Cryptography::Xml::XmlDsigC14NTransform 类"
linktitle: "XmlDsigC14NTransform"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::Xml::XmlDsigC14NTransform 类。表示用于无注释的数字签名的 C14N XML 规范化转换。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 1400
url: /zh/cpp/system.security.cryptography.xml/xmldsigc14ntransform/
---
## XmlDsigC14NTransform class


表示用于无注释的数字签名的 C14N XML 规范化转换。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class XmlDsigC14NTransform : public System::Security::Cryptography::Xml::Transform
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_InputTypes](./get_inputtypes/)() override |  |
| [get_OutputTypes](./get_outputtypes/)() override |  |
| [GetDigestedOutput](./getdigestedoutput/)(SharedPtr\<HashAlgorithm\>) override |  |
| [GetOutput](./getoutput/)() override |  |
| [GetOutput](./getoutput/)(const TypeInfo\&) override |  |
| [LoadInnerXml](./loadinnerxml/)(SharedPtr\<System::Xml::XmlNodeList\>) override |  |
| [LoadInput](./loadinput/)(SharedPtr\<Object\>) override |  |
| [XmlDsigC14NTransform](./xmldsigc14ntransform/)() |  |
| [XmlDsigC14NTransform](./xmldsigc14ntransform/)(bool) |  |
## 另见

* Class [Transform](../transform/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)

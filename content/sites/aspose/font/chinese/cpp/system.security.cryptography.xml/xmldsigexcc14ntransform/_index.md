---
title: "System::Security::Cryptography::Xml::XmlDsigExcC14NTransform 类"
linktitle: "XmlDsigExcC14NTransform"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::Xml::XmlDsigExcC14NTransform 类。表示用于数字签名且不带注释的独占 C14N XML 规范化转换。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1700
url: /zh/cpp/system.security.cryptography.xml/xmldsigexcc14ntransform/
---
## XmlDsigExcC14NTransform class


表示用于数字签名且不带注释的独占 C14N XML 规范化转换。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class XmlDsigExcC14NTransform : public System::Security::Cryptography::Xml::Transform
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_InclusiveNamespacesPrefixList](./get_inclusivenamespacesprefixlist/)() |  |
| [get_InputTypes](./get_inputtypes/)() override |  |
| [get_OutputTypes](./get_outputtypes/)() override |  |
| [GetDigestedOutput](./getdigestedoutput/)(SharedPtr\<HashAlgorithm\>) override |  |
| [GetOutput](./getoutput/)() override |  |
| [GetOutput](./getoutput/)(const TypeInfo\&) override |  |
| [LoadInnerXml](./loadinnerxml/)(SharedPtr\<System::Xml::XmlNodeList\>) override |  |
| [LoadInput](./loadinput/)(SharedPtr\<Object\>) override |  |
| [set_InclusiveNamespacesPrefixList](./set_inclusivenamespacesprefixlist/)(String) |  |
| [XmlDsigExcC14NTransform](./xmldsigexcc14ntransform/)() |  |
| [XmlDsigExcC14NTransform](./xmldsigexcc14ntransform/)(bool) |  |
| [XmlDsigExcC14NTransform](./xmldsigexcc14ntransform/)(bool, String) |  |
## 另见

* Class [Transform](../transform/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)

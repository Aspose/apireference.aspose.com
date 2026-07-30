---
title: "System::Security::Cryptography::Xml::KeyInfoX509Data 类"
linktitle: "KeyInfoX509Data"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::Xml::KeyInfoX509Data 类。表示 ''X509Data'' 元素。包含与验证或加密密钥相关的 X.509v3 证书信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 600
url: /zh/cpp/system.security.cryptography.xml/keyinfox509data/
---
## KeyInfoX509Data class


表示 'X509Data' 元素。包含与验证或加密密钥相关的 X.509v3 证书信息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class KeyInfoX509Data : public System::Security::Cryptography::Xml::KeyInfoClause
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AddCertificate](./addcertificate/)(SharedPtr\<X509Certificates::X509Certificate\>) |  |
| [AddIssuerSerial](./addissuerserial/)(String, String) |  |
| [AddSubjectKeyId](./addsubjectkeyid/)(ArrayPtr\<uint8_t\>) |  |
| [AddSubjectName](./addsubjectname/)(String) |  |
| [get_Certificates](./get_certificates/)() |  |
| [get_IssuerSerials](./get_issuerserials/)() |  |
| [get_SubjectKeyIds](./get_subjectkeyids/)() |  |
| [get_SubjectNames](./get_subjectnames/)() |  |
| [GetXml](./getxml/)() override |  |
| [GetXml](./getxml/)(SharedPtr\<System::Xml::XmlDocument\>) override |  |
| [InternalAddIssuerSerial](./internaladdissuerserial/)(String, String) |  |
| [KeyInfoX509Data](./keyinfox509data/)() |  |
| [LoadXml](./loadxml/)(SharedPtr\<System::Xml::XmlElement\>) override |  |
## 另见

* Class [KeyInfoClause](../keyinfoclause/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Font for C++](../../)

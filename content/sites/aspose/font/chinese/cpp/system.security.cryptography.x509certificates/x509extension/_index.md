---
title: "System::Security::Cryptography::X509Certificates::X509Extension 类"
linktitle: "X509Extension"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509Extension 类。用于保存与 X.509 证书关联的额外信息的扩展对象。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1200
url: /zh/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


用于保存与 X.509 证书关联的额外信息的扩展对象。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | 从其他对象复制扩展数据。 |
| [get_Critical](./get_critical/)() const | 检查扩展是否为关键的。 |
| [set_Critical](./set_critical/)(bool) | 定义扩展是否为关键的。 |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | RTTI 信息。 |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | 构造函数。 |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | 构造函数。 |
## 另见

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)

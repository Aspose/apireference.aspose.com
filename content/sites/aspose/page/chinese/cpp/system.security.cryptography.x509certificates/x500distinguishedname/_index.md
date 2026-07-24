---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName 类"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Page 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName 类。表示 X509 证书的可分辨名称。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 200
url: /zh/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


表示 X509 证书的可分辨名称。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | 使用标志指定的参数解码名称。 |
| [Format](./format/)(bool) const override | 格式化名称以供打印。 |
| [get_Name](./get_name/)() const | 获取证书的可分辨名称。 |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI 信息。 |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | 构造函数。 |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | 构造函数。 |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | 拷贝构造函数。 |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | 构造函数。 |
## 另见

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)

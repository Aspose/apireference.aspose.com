---
title: "System::Security::Cryptography::X509Certificates::PublicKey 类"
linktitle: "PublicKey"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::PublicKey 类。表示 X509 证书的公钥信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


表示 X509 证书的公钥信息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class PublicKey : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | 获取 ASN.1 编码的公钥值。 |
| [get_EncodedParameters](./get_encodedparameters/)() const | 获取 ASN.1 编码的公钥参数。 |
| [get_Key](./get_key/)() const | 获取一个 [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) 或 [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/)。 |
| [get_Oid](./get_oid/)() const | 获取公钥的标识符 (OID)。 |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | 构造函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)

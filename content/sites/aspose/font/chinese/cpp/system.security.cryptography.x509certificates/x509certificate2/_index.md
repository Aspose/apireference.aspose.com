---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 类"
linktitle: "X509Certificate2"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 类。表示 X509 证书。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 400
url: /zh/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


表示 X509 证书。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Archived](./get_archived/)() const | 获取指示证书已归档的值。 |
| [get_Extensions](./get_extensions/)() const | 获取与证书关联的扩展对象集合。 |
| [get_FriendlyName](./get_friendlyname/)() const | 获取证书的友好名称。 |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | 检查证书是否具有私钥。 |
| [get_IssuerName](./get_issuername/)() const | 获取颁发证书的实体名称。 |
| [get_NotAfter](./get_notafter/)() const | 获取证书不再有效之后的本地日期和时间。 |
| [get_NotBefore](./get_notbefore/)() const | 获取证书生效的本地日期和时间。 |
| [get_PrivateKey](./get_privatekey/)() const | 获取与证书关联的私钥。 |
| [get_PublicKey](./get_publickey/)() const | 获取证书的 [PublicKey](../publickey/) 对象。 |
| [get_RawData](./get_rawdata/)() const | 获取证书原始数据。 |
| [get_SerialNumber](./get_serialnumber/)() const | 获取证书的序列号。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | 获取用于创建证书签名的算法。 |
| [get_SubjectName](./get_subjectname/)() const | 获取证书的主题名称。 |
| [get_Thumbprint](./get_thumbprint/)() const | 获取证书指纹。 |
| [get_Version](./get_version/)() const | 获取证书格式版本。 |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | 获取指定字节数组中包含的证书类型。 |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | 获取指定文件中包含的证书类型。 |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | 获取 [RSA](../../system.security.cryptography/rsa/) 私钥；。 |
| [GetDSAPublicKey](./getdsapublickey/)() const | 获取 [RSA](../../system.security.cryptography/rsa/) 公钥。 |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | 获取 [RSA](../../system.security.cryptography/rsa/) 私钥；。 |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | 获取 [RSA](../../system.security.cryptography/rsa/) 公钥。 |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | 获取证书的主题或颁发者名称。 |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | 获取 [RSA](../../system.security.cryptography/rsa/) 私钥；。 |
| [GetRSAPublicKey](./getrsapublickey/)() const | 获取 [RSA](../../system.security.cryptography/rsa/) 公钥。 |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | 从指定的证书文件导入信息。 |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | 从指定的证书文件导入信息。 |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | 从指定的证书数据导入信息。 |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | 从指定的证书数据导入信息。 |
| [Import](./import/)(const String\&) override | 从指定的证书文件导入信息。 |
| [Import](./import/)(const ByteArrayPtr\&) override | 从指定的证书数据导入信息。 |
| [Reset](./reset/)() override | 重置证书状态。 |
| [set_Archived](./set_archived/)(bool) const | 设置指示证书已归档的值。 |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | 设置证书的友好名称。 |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | 设置或清除与证书关联的私钥。 |
| [ToString](./tostring/)(bool) const override | 以文本格式返回证书信息。 |
| [ToString](./tostring/)() const override | 以文本格式返回证书信息。 |
| [Verify](./verify/)() const | 验证证书链。 |
| [X509Certificate2](./x509certificate2/)() | 构造空的 [X509Certificate2](./)。 |
| [X509Certificate2](./x509certificate2/)(const String\&) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | 构造函数。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | 构造函数。 |
## 另见

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)

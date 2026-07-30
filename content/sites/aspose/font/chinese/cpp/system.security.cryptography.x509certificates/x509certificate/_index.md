---
title: "System::Security::Cryptography::X509Certificates::X509Certificate class"
linktitle: "X509Certificate"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509Certificate 类。X.509 v.3 证书。不支持加密证书。仅支持 X509KeyStorageFlags::DefaultKeySet 标志。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


X.509 v.3 证书。不支持加密证书。仅支持 [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) 标志。此类的对象应使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | 从指定的 PKCS7 文件创建证书。 |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | 从指定的已签名文件创建证书。 |
| [Dispose](./dispose/)() override | 不执行任何操作。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 比较两个证书。 |
| virtual [Export](./export/)(X509ContentType) const | 使用指定的格式将当前对象导出为字节数组。未实现。 |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | 使用指定的格式将当前对象导出为字节数组。未实现。 |
| virtual [Export](./export/)(X509ContentType, const String\&) const | 使用指定的格式将当前对象导出为字节数组。未实现。 |
| [get_Handle](./get_handle/)() const | 获取 Microsoft Cryptographic API 证书上下文的句柄。 |
| [get_Issuer](./get_issuer/)() const | 获取颁发 X.509v3 证书的证书颁发机构的名称。 |
| [get_Subject](./get_subject/)() const | 从证书获取主题可分辨名称。 |
| virtual [GetCertHash](./getcerthash/)() const | 以字节数组形式获取当前对象的哈希值。 |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | 以字节数组形式获取当前对象的哈希值。 |
| virtual [GetCertHashString](./getcerthashstring/)() const | 获取当前对象的 [SHA1](../../system.security.cryptography/sha1/) 哈希，以十六进制字符串形式。 |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | 获取当前对象的 [SHA1](../../system.security.cryptography/sha1/) 哈希，以十六进制字符串形式。 |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | 获取当前证书的生效日期。 |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | 获取当前证书的到期日期。 |
| virtual [GetFormat](./getformat/)() const | 获取证书格式的名称。 |
| [GetHashCode](./gethashcode/)() const override | 获取证书的哈希码。 |
| virtual [GetIssuerName](./getissuername/)() const | 获取颁发当前证书的认证机构的名称。 |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | 以字符串形式获取当前证书的关键信息。 |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | 以字节数组形式获取当前证书的关键信息。 |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | 以十六进制字符串形式获取当前证书的关键信息。 |
| virtual [GetName](./getname/)() const | 获取颁发当前证书的主体名称。 |
| virtual [GetPublicKey](./getpublickey/)() const | 以字节数组形式获取证书的公钥。 |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | 以十六进制字符串形式获取证书的公钥。 |
| virtual [GetRawCertData](./getrawcertdata/)() const | 以字节数组形式获取证书的原始数据。 |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | 以十六进制字符串形式获取证书的原始数据。 |
| virtual [GetSerialNumber](./getserialnumber/)() const | 以字节数组形式获取证书的序列号。 |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | 以十六进制字符串形式获取证书的序列号。 |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | 从指定的证书文件导入信息。未实现。 |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | 从指定的证书文件导入信息。未实现。 |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | 从指定的证书数据导入信息。未实现。 |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | 从指定的证书数据导入信息。未实现。 |
| virtual [Import](./import/)(const String\&) | 从指定的证书文件导入信息。未实现。 |
| virtual [Import](./import/)(const ByteArrayPtr\&) | 从指定的证书数据导入信息。未实现。 |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | 重置证书状态。 |
| virtual [ToString](./tostring/)(bool) const | 以文本格式返回证书信息。 |
| [ToString](./tostring/)() const override | 以文本格式返回证书信息。 |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | 构造函数。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const String\&) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | 构造函数。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | 构造函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 指针类型。 |
## 另见

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)

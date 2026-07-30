---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension 类"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension 类。用于保存密钥使用的额外信息的扩展对象。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1600
url: /zh/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


用于保存密钥使用的额外信息的扩展对象。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | 从其他对象复制扩展数据。 |
| [get_KeyUsages](./get_keyusages/)() | 获取密钥用法。 |
| [X509KeyUsageExtension](./x509keyusageextension/)() | RTTI 信息。 |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | 构造函数。 |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | 构造函数。 |
## 另见

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)

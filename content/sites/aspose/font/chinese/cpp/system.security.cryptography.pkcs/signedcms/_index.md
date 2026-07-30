---
title: "System::Security::Cryptography::Pkcs::SignedCms 类"
linktitle: "SignedCms"
second_title: "Aspose.Font 适用于 C++"
description: "System::Security::Cryptography::Pkcs::SignedCms 类。根据 CMS/PKCS #7 标准对内容进行签名。未实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 300
url: /zh/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


根据 CMS/PKCS #7 标准对内容进行签名。未实现。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class SignedCms : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | 创建签名。 |
| [Encode](./encode/)() | 对 CMS/PKCS #7 消息进行编码。 |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | 构造函数。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Font for C++](../../)

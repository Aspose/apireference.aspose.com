---
title: "System::Net::Security 命名空间"
linktitle: "System::Net::Security"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 System::Net::Security 命名空间。"
type: docs
weight: 5100
url: /zh/cpp/system.net.security/
---



## 类

| 类 | 描述 |
| --- | --- |
| [AuthenticatedStream](./authenticatedstream/) | 包含在流上传递凭据的方法。此类的对象只能使用 [System::MakeObject()](../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。 |
| [SslStream](./sslstream/) | 使用 SSL 协议对服务器进行身份验证并可选地对客户端进行身份验证的流。 |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [AuthenticationLevel](./authenticationlevel/) | WebRequest 特定的身份验证标志。 |
| [EncryptionPolicy](./encryptionpolicy/) | 枚举加密策略。 |
| [SslPolicyErrors](./sslpolicyerrors/) | 枚举 SSL 的策略错误。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [LocalCertificateSelectionCallback](./localcertificateselectioncallback/) | 用于选择本地 SSL 证书的用户委托。 |
| [RemoteCertificateValidationCallback](./remotecertificatevalidationcallback/) | 用于验证远程 SSL 证书的用户委托。 |

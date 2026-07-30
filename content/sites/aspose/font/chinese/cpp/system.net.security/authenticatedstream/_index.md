---
title: "System::Net::Security::AuthenticatedStream class"
linktitle: "AuthenticatedStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::AuthenticatedStream class. 包含跨流传递凭据的方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 100
url: /zh/cpp/system.net.security/authenticatedstream/
---
## AuthenticatedStream class


包含跨流传递凭据的方法。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class AuthenticatedStream : public System::IO::Stream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [get_IsAuthenticated](./get_isauthenticated/)() const | 返回一个值，指示身份验证是否成功通过。 |
| virtual [get_IsEncrypted](./get_isencrypted/)() const | 返回一个值，指示通过此流发送的数据是否已加密。 |
| virtual [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const | 返回一个值，指示服务器和客户端是否已通过身份验证。 |
| virtual [get_IsServer](./get_isserver/)() const | 返回一个值，指示连接的本地端是否为服务器。 |
| virtual [get_IsSigned](./get_issigned/)() const | 返回一个值，指示使用此流发送的数据是否已签名。 |
| [get_LeaveInnerStreamOpen](./get_leaveinnerstreamopen/)() const | RTTI 信息。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 一个没有底层存储的流。 |
## 另见

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)

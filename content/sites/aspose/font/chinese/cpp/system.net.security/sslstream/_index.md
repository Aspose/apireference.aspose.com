---
title: "System::Net::Security::SslStream 类"
linktitle: "SslStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::Security::SslStream 类。一个使用 SSL 协议在 C++ 中对服务器进行身份验证并可选地对客户端进行身份验证的流。"
type: docs
weight: 200
url: /zh/cpp/system.net.security/sslstream/
---
## SslStream class


使用 SSL 协议对服务器进行身份验证并可选地对客户端进行身份验证的流。

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | 对连接的客户端侧进行身份验证。 |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | 对连接的客户端侧进行身份验证。 |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 发起异步读取操作。 |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 发起异步写入操作。 |
| [Close](./close/)() override | 关闭流。 |
| [Dispose](./dispose/)(bool) override | 释放当前对象使用的所有资源并关闭流。 |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | 等待指定的异步读取操作完成。 |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | 结束异步写入操作。等待指定的异步写入操作完成。 |
| [Flush](./flush/)() override | 清除此流的缓冲区并将所有缓冲的数据写入底层存储。 |
| [get_CanRead](./get_canread/)() const override | 确定流是否可读取。 |
| [get_CanSeek](./get_canseek/)() const override | 确定流是否支持定位。 |
| [get_CanTimeout](./get_cantimeout/)() const override | 获取一个值，用于确定当前流是否可以超时。 |
| [get_CanWrite](./get_canwrite/)() const override | 确定流是否可写。 |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | 返回一个值，指示在证书验证过程中是否检查证书吊销列表。 |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | 返回加密算法。 |
| virtual [get_CipherStrength](./get_cipherstrength/)() | 返回所使用加密算法的强度。 |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | 返回哈希算法。 |
| virtual [get_HashStrength](./get_hashstrength/)() | 返回所使用哈希算法的强度。 |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | 返回一个值，指示身份验证是否成功通过。 |
| [get_IsEncrypted](./get_isencrypted/)() const override | 返回一个值，指示通过此流发送的数据是否已加密。 |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | 返回一个值，指示服务器和客户端是否已通过身份验证。 |
| [get_IsServer](./get_isserver/)() const override | 返回一个值，指示连接的本地端是否为服务器。 |
| [get_IsSigned](./get_issigned/)() const override | 返回一个值，指示使用此流发送的数据是否已签名。 |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | 返回所使用密钥交换算法的强度。 |
| [get_Length](./get_length/)() const override | 返回流的字节长度。 |
| virtual [get_LocalCertificate](./get_localcertificate/)() | 返回用于验证本地端点的证书。 |
| [get_Position](./get_position/)() const override | 返回流的当前位置。 |
| [get_ReadTimeout](./get_readtimeout/)() const override | 获取一个以毫秒为单位的值，用于确定流在超时前尝试读取的持续时间。 |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | 返回用于验证远程端点的证书。 |
| virtual [get_SslProtocol](./get_sslprotocol/)() | 返回 SSL 协议。 |
| [get_WriteTimeout](./get_writetimeout/)() const override | 获取一个以毫秒为单位的值，用于确定流在超时前尝试写入的持续时间。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 从流中读取指定数量的字节并将其写入指定的字节数组。 |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | 设置当前对象所表示的流的位置。 |
| [set_Position](./set_position/)(int64_t) override | 设置流的位置。 |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | 设置一个值，用于确定当前流是否可以超时。 |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | 设置一个以毫秒为单位的值，用于确定流在超时前尝试读取的持续时间。 |
| [SetLength](./setlength/)(int64_t) override | 设置当前对象所表示的流的长度。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | 构造一个新实例。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | 构造一个新实例。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | 构造一个新实例。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | 构造一个新实例。 |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | 构造一个新实例。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | 将指定的字节数组写入流。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中的指定子范围字节写入流。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | 将指定的字节数组写入流。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 将指定字节数组中的指定子范围字节写入流。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 一个没有底层存储的流。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | RTTI 信息。 |
| [StreamImplementationPtr](./streamimplementationptr/) | 实现的指针类型。 |
## 另见

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Font for C++](../../)

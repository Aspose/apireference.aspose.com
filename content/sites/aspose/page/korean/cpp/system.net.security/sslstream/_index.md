---
title: "System::Net::Security::SslStream 클래스"
linktitle: "SslStream"
second_title: "C++용 Aspose.Page"
description: "System::Net::Security::SslStream 클래스. SSL 프로토콜을 사용하여 서버를 인증하고 필요에 따라 클라이언트를 인증하는 스트림입니다. C++."
type: docs
weight: 200
url: /ko/cpp/system.net.security/sslstream/
---
## SslStream class


서버와 선택적으로 클라이언트를 인증하기 위해 SSL 프로토콜을 사용하는 스트림입니다.

```cpp
class SslStream : public System::Net::Security::AuthenticatedStream
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String) | 연결의 클라이언트 측을 인증합니다. |
| virtual [AuthenticateAsClient](./authenticateasclient/)(String, System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>, System::Security::Authentication::SslProtocols, bool) | 연결의 클라이언트 측을 인증합니다. |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 비동기 읽기 작업을 시작합니다. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 비동기 쓰기 작업을 시작합니다. |
| [Close](./close/)() override | 스트림을 닫습니다. |
| [Dispose](./dispose/)(bool) override | 현재 객체가 사용한 모든 리소스를 해제하고 스트림을 닫습니다. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | 지정된 비동기 읽기 작업이 완료될 때까지 대기합니다. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | 비동기 쓰기 작업을 종료합니다. 지정된 비동기 쓰기 작업이 완료될 때까지 대기합니다. |
| [Flush](./flush/)() override | 이 스트림의 버퍼를 비우고 모든 버퍼링된 데이터를 기본 저장소에 기록합니다. |
| [get_CanRead](./get_canread/)() const override | 스트림을 읽을 수 있는지 결정합니다. |
| [get_CanSeek](./get_canseek/)() const override | 스트림이 시크(탐색)를 지원하는지 확인합니다. |
| [get_CanTimeout](./get_cantimeout/)() const override | 현재 스트림이 타임아웃될 수 있는지 여부를 결정하는 값을 가져옵니다. |
| [get_CanWrite](./get_canwrite/)() const override | 스트림이 쓰기 가능한지 확인합니다. |
| virtual [get_CheckCertRevocationStatus](./get_checkcertrevocationstatus/)() | 인증서 검증 과정에서 인증서 폐기 목록이 확인되는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_CipherAlgorithm](./get_cipheralgorithm/)() | 암호화 알고리즘을 반환합니다. |
| virtual [get_CipherStrength](./get_cipherstrength/)() | 사용된 암호화 알고리즘의 강도를 반환합니다. |
| virtual [get_HashAlgorithm](./get_hashalgorithm/)() | 해시 알고리즘을 반환합니다. |
| virtual [get_HashStrength](./get_hashstrength/)() | 사용된 해시 알고리즘의 강도를 반환합니다. |
| [get_IsAuthenticated](./get_isauthenticated/)() const override | 인증이 성공적으로 수행되었는지 여부를 나타내는 값을 반환합니다. |
| [get_IsEncrypted](./get_isencrypted/)() const override | 이 스트림을 사용하여 전송된 데이터가 암호화되었는지 여부를 나타내는 값을 반환합니다. |
| [get_IsMutuallyAuthenticated](./get_ismutuallyauthenticated/)() const override | 서버와 클라이언트가 인증되었는지 여부를 나타내는 값을 반환합니다. |
| [get_IsServer](./get_isserver/)() const override | 연결의 로컬 측이 서버인지 여부를 나타내는 값을 반환합니다. |
| [get_IsSigned](./get_issigned/)() const override | 이 스트림을 사용하여 전송된 데이터가 서명되었는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_KeyExchangeStrength](./get_keyexchangestrength/)() | 사용된 키 교환 알고리즘의 강도를 반환합니다. |
| [get_Length](./get_length/)() const override | 스트림의 길이를 바이트 단위로 반환합니다. |
| virtual [get_LocalCertificate](./get_localcertificate/)() | 로컬 엔드포인트를 인증하는 데 사용되는 인증서를 반환합니다. |
| [get_Position](./get_position/)() const override | 스트림의 현재 위치를 반환합니다. |
| [get_ReadTimeout](./get_readtimeout/)() const override | 밀리초 단위로, 스트림이 타임아웃되기 전에 읽기를 시도하는 기간을 결정하는 값을 가져옵니다. |
| virtual [get_RemoteCertificate](./get_remotecertificate/)() | 원격 엔드포인트를 인증하는 데 사용되는 인증서를 반환합니다. |
| virtual [get_SslProtocol](./get_sslprotocol/)() | SSL 프로토콜을 반환합니다. |
| [get_WriteTimeout](./get_writetimeout/)() const override | 밀리초 단위의 값을 가져와 스트림이 타임아웃되기 전에 쓰기를 시도하는 기간을 결정합니다. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | 현재 객체가 나타내는 스트림의 위치를 설정합니다. |
| [set_Position](./set_position/)(int64_t) override | 스트림의 위치를 설정합니다. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | 현재 스트림이 타임아웃될 수 있는지 여부를 결정하는 값을 설정합니다. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | 밀리초 단위의 값을 설정하여 스트림이 타임아웃되기 전에 읽기를 시도하는 기간을 결정합니다. |
| [SetLength](./setlength/)(int64_t) override | 현재 객체가 나타내는 스트림의 길이를 설정합니다. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>) | 새 인스턴스를 생성합니다. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool) | 새 인스턴스를 생성합니다. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback) | 새 인스턴스를 생성합니다. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback) | 새 인스턴스를 생성합니다. |
| [SslStream](./sslstream/)(System::SharedPtr\<IO::Stream\>, bool, RemoteCertificateValidationCallback, LocalCertificateSelectionCallback, EncryptionPolicy) | 새 인스턴스를 생성합니다. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&) | 지정된 바이트 배열을 스트림에 씁니다. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&) | 지정된 바이트 배열을 스트림에 씁니다. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 기본 저장소가 없는 스트림입니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [AsyncResultType](./asyncresulttype/) | RTTI 정보. |
| [StreamImplementationPtr](./streamimplementationptr/) | 구현에 대한 포인터 유형입니다. |
## 또 보기

* Class [AuthenticatedStream](../authenticatedstream/)
* Namespace [System::Net::Security](../)
* Library [Aspose.Page for C++](../../)

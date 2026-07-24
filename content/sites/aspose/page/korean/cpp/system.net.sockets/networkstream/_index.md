---
title: "System::Net::Sockets::NetworkStream 클래스"
linktitle: "NetworkStream"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::NetworkStream 클래스. 네트워크 액세스를 위한 데이터의 기본 스트림을 제공합니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 300
url: /ko/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


네트워크 액세스를 위한 데이터의 기본 스트림을 제공합니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class NetworkStream : public System::IO::Stream
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 비동기 읽기 작업을 시작합니다. |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 비동기 쓰기 작업을 시작합니다. |
| [Close](./close/)(int) | 지정된 시간이 경과한 후 현재 인스턴스를 닫습니다. |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | 지정된 비동기 읽기 작업이 완료될 때까지 대기합니다. |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | 비동기 쓰기 작업을 종료합니다. 지정된 비동기 쓰기 작업이 완료될 때까지 대기합니다. |
| [Flush](./flush/)() override | 이 스트림의 버퍼를 비우고 모든 버퍼링된 데이터를 기본 저장소에 기록합니다. |
| [get_CanRead](./get_canread/)() const override | RTTI 정보. |
| [get_CanSeek](./get_canseek/)() const override | 스트림이 시크(탐색)를 지원하는지 확인합니다. |
| [get_CanTimeout](./get_cantimeout/)() const override | 현재 스트림이 타임아웃될 수 있는지 여부를 결정하는 값을 가져옵니다. |
| [get_CanWrite](./get_canwrite/)() const override | 스트림이 쓰기 가능한지 확인합니다. |
| [get_DataAvailable](./get_dataavailable/)() const | 읽을 수 있는 데이터가 있는지 여부를 나타내는 값을 반환합니다. |
| [get_Length](./get_length/)() const override | 스트림의 길이를 바이트 단위로 반환합니다. |
| [get_Position](./get_position/)() const override | 스트림의 현재 위치를 반환합니다. |
| [get_ReadTimeout](./get_readtimeout/)() const override | 밀리초 단위로, 스트림이 타임아웃되기 전에 읽기를 시도하는 기간을 결정하는 값을 가져옵니다. |
| [get_Socket](./get_socket/)() | 기본 [Socket](../socket/)을 가져옵니다. |
| [get_WriteTimeout](./get_writetimeout/)() const override | 밀리초 단위의 값을 가져와 스트림이 타임아웃되기 전에 쓰기를 시도하는 기간을 결정합니다. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | 새 인스턴스를 생성합니다. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | 새 인스턴스를 생성합니다. |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | 새 인스턴스를 생성합니다. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | 현재 객체가 나타내는 스트림의 위치를 설정합니다. |
| [set_Position](./set_position/)(int64_t) override | 스트림의 위치를 설정합니다. |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | 현재 스트림이 타임아웃될 수 있는지 여부를 결정하는 값을 설정합니다. |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | 밀리초 단위의 값을 설정하여 스트림이 타임아웃되기 전에 읽기를 시도하는 기간을 결정합니다. |
| [SetLength](./setlength/)(int64_t) override | 현재 객체가 나타내는 스트림의 길이를 설정합니다. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| virtual [~NetworkStream](./~networkstream/)() | 현재 인스턴스를 소멸시킵니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 기본 저장소가 없는 스트림입니다. |
## 또 보기

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)

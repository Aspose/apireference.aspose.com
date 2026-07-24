---
title: "System::IO::Stream 클래스"
linktitle: "스트림"
second_title: "C++용 Aspose.Page"
description: "System::IO::Stream 클래스. 다양한 스트림 구현을 위한 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 2100
url: /ko/cpp/system.io/stream/
---
## Stream class


다양한 스트림 구현을 위한 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class Stream : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | 비동기 읽기 작업을 시작합니다. |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | 비동기 쓰기 작업을 시작합니다. |
| virtual [Close](./close/)() | 스트림을 닫습니다. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | 바이트를 지정된 스트림에 복사합니다. |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | 지정된 버퍼 크기를 사용하여 바이트를 지정된 스트림에 복사합니다. |
| [Dispose](./dispose/)() override | 현재 객체가 사용한 모든 리소스를 해제하고 스트림을 닫습니다. |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | 지정된 비동기 읽기 작업이 완료될 때까지 대기합니다. |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | 비동기 쓰기 작업을 종료합니다. 지정된 비동기 쓰기 작업이 완료될 때까지 대기합니다. |
| virtual [Flush](./flush/)() | 이 스트림의 버퍼를 비우고 모든 버퍼링된 데이터를 기본 저장소에 기록합니다. |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | 이 스트림에 대한 모든 버퍼를 비동기적으로 비우고, 버퍼링된 데이터를 기본 장치에 기록하며, 취소 요청을 모니터링합니다. |
| [FlushAsync](./flushasync/)() | 이 스트림에 대한 모든 버퍼를 비동기적으로 비우고, 버퍼링된 데이터를 기본 장치에 기록하며, 취소 요청을 모니터링합니다. |
| virtual [get_CanRead](./get_canread/)() const | 스트림을 읽을 수 있는지 결정합니다. |
| virtual [get_CanSeek](./get_canseek/)() const | 스트림이 시크(탐색)를 지원하는지 확인합니다. |
| virtual [get_CanTimeout](./get_cantimeout/)() const | 현재 스트림이 타임아웃될 수 있는지 여부를 결정하는 값을 가져옵니다. |
| virtual [get_CanWrite](./get_canwrite/)() const | 스트림이 쓰기 가능한지 확인합니다. |
| virtual [get_Length](./get_length/)() const | 스트림의 길이를 바이트 단위로 반환합니다. |
| virtual [get_Position](./get_position/)() const | 스트림의 현재 위치를 반환합니다. |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | 밀리초 단위로, 스트림이 타임아웃되기 전에 읽기를 시도하는 기간을 결정하는 값을 가져옵니다. |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | 밀리초 단위의 값을 가져와 스트림이 타임아웃되기 전에 쓰기를 시도하는 기간을 결정합니다. |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | 현재 스트림에서 바이트 시퀀스를 비동기적으로 읽고, 읽은 바이트 수만큼 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 현재 스트림에서 바이트 시퀀스를 비동기적으로 읽고, 읽은 바이트 수만큼 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다. |
| virtual [ReadByte](./readbyte/)() | 스트림에서 단일 바이트를 읽고, 읽은 바이트 값에 해당하는 32비트 정수 값을 반환합니다. |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | 현재 객체가 나타내는 스트림의 위치를 설정합니다. |
| virtual [set_Position](./set_position/)(int64_t) | 스트림의 위치를 설정합니다. |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | 현재 스트림이 타임아웃될 수 있는지 여부를 결정하는 값을 설정합니다. |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | 밀리초 단위의 값을 설정하여 스트림이 타임아웃되기 전에 읽기를 시도하는 기간을 결정합니다. |
| virtual [SetLength](./setlength/)(int64_t) | 현재 객체가 나타내는 스트림의 길이를 설정합니다. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | 현재 스트림에 바이트 시퀀스를 비동기적으로 쓰고, 기록된 바이트 수만큼 이 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 현재 스트림에 바이트 시퀀스를 비동기적으로 쓰고, 기록된 바이트 수만큼 이 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다. |
| virtual [WriteByte](./writebyte/)(uint8_t) | 지정된 부호 없는 8비트 정수 값을 스트림에 씁니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](./null/) | 기본 저장소가 없는 스트림입니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스에 대한 shared pointer 별칭입니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

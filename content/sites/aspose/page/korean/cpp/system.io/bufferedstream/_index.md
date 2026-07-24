---
title: "System::IO::BufferedStream 클래스"
linktitle: "BufferedStream"
second_title: "C++용 Aspose.Page"
description: "System::IO::BufferedStream 클래스. 다른 스트림 위에 버퍼링 레이어를 추가합니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.io/bufferedstream/
---
## BufferedStream class


다른 스트림 위에 버퍼링 레이어를 추가합니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class BufferedStream : public System::IO::Stream
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | 지정된 스트림을 래핑하고 4096바이트 길이의 버퍼를 사용하는 [BufferedStream](./) 객체를 생성합니다. |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | 지정된 스트림을 래핑하고 지정된 크기의 버퍼를 사용하는 [BufferedStream](./) 객체를 생성합니다. |
| [Flush](./flush/)() override | 버퍼의 내용을 기본 스트림에 씁니다. |
| [get_CanRead](./get_canread/)() const override | 스트림을 읽을 수 있는지 결정합니다. |
| [get_CanSeek](./get_canseek/)() const override | 스트림이 시크(탐색)를 지원하는지 확인합니다. |
| [get_CanWrite](./get_canwrite/)() const override | 스트림이 쓰기 가능한지 확인합니다. |
| [get_Length](./get_length/)() const override | 스트림의 길이를 반환합니다. |
| [get_Position](./get_position/)() const override | 스트림의 현재 위치를 반환합니다. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 기본 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 기본 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [ReadByte](./readbyte/)() override | 기본 스트림에서 단일 바이트를 읽고 읽은 바이트 값에 해당하는 32비트 정수 값을 반환합니다. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 현재 객체가 나타내는 스트림의 위치를 설정합니다. |
| [set_Position](./set_position/)(int64_t) override | 버퍼를 기본 스트림에 플러시하고 스트림의 위치를 설정합니다. |
| [SetLength](./setlength/)(int64_t) override | 현재 객체가 나타내는 스트림의 길이를 설정합니다. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 기본 스트림에 씁니다. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 기본 스트림에 씁니다. |
| [WriteByte](./writebyte/)(uint8_t) override | 지정된 부호 없는 8비트 정수 값을 기본 스트림에 씁니다. |
| virtual [~BufferedStream](./~bufferedstream/)() | 소멸자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](../stream/null/) | 기본 저장소가 없는 스트림입니다. |
## 또 보기

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

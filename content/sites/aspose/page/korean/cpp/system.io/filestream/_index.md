---
title: "System::IO::FileStream 클래스"
linktitle: "FileStream"
second_title: "C++용 Aspose.Page"
description: "System::IO::FileStream 클래스. 동기 및 비동기 읽기와 쓰기 작업을 지원하는 파일 스트림을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용해서는 안 되며, 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1500
url: /ko/cpp/system.io/filestream/
---
## FileStream class


동기 및 비동기 읽기와 쓰기 작업을 지원하는 파일 스트림을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용해서는 안 되며, 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class FileStream : public System::IO::Stream
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 현재 [FileStream](./) 객체를 닫습니다. |
| [FileStream](./filestream/)(const String\&, FileMode) | [FileStream](./) 클래스의 새 인스턴스를 생성하고 지정된 매개변수로 초기화합니다. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | [FileStream](./) 클래스의 새 인스턴스를 생성하고 지정된 매개변수로 초기화합니다. |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | [FileStream](./) 클래스의 새 인스턴스를 생성하고 지정된 매개변수로 초기화합니다. |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | 이 스트림의 버퍼를 비우고 버퍼링된 모든 데이터를 기본 파일에 씁니다. |
| [Flush](./flush/)(bool) | 이 스트림의 버퍼를 비우고 버퍼링된 모든 데이터를 기본 파일에 씁니다. 메서드 [Flush()](./flush/)와 동의어입니다. |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | 이 스트림에 대한 모든 버퍼를 비동기적으로 비우고, 버퍼링된 데이터를 기본 장치에 기록하며, 취소 요청을 모니터링합니다. |
| [get_CanRead](./get_canread/)() const override | 스트림을 읽을 수 있는지 결정합니다. |
| [get_CanSeek](./get_canseek/)() const override | 스트림이 시크(탐색)를 지원하는지 확인합니다. |
| [get_CanWrite](./get_canwrite/)() const override | 스트림이 쓰기 가능한지 확인합니다. |
| [get_Length](./get_length/)() const override | 스트림의 길이를 바이트 단위로 반환합니다. |
| [get_Name](./get_name/)() const | 현재 [FileStream](./) 객체가 캡슐화한 파일의 이름을 반환합니다. |
| [get_Position](./get_position/)() const override | 스트림의 현재 위치를 반환합니다. |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | 현재 스트림에서 바이트 시퀀스를 비동기적으로 읽고, 읽은 바이트 수만큼 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다. |
| [ReadByte](./readbyte/)() override | 스트림에서 단일 바이트를 읽고, 읽은 바이트 값에 해당하는 32비트 정수 값을 반환합니다. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 현재 객체가 나타내는 스트림의 위치를 설정합니다. |
| [set_Position](./set_position/)(int64_t) override | 스트림을 플러시한 다음 스트림 위치를 설정합니다. |
| [SetLength](./setlength/)(int64_t) override | 현재 객체가 나타내는 스트림의 길이를 설정합니다. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | 현재 스트림에 바이트 시퀀스를 비동기적으로 쓰고, 기록된 바이트 수만큼 이 스트림 내 위치를 이동하며, 취소 요청을 모니터링합니다. |
| [WriteByte](./writebyte/)(uint8_t) override | 지정된 부호 없는 8비트 정수 값을 스트림에 씁니다. |
| [~FileStream](./~filestream/)() | 소멸자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | 읽기 및 쓰기 작업 중 버퍼링된 바이트 수의 기본값입니다. |
| static [Null](../stream/null/) | 기본 저장소가 없는 스트림입니다. |
## 또 보기

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

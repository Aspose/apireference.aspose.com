---
title: "System::IO::MemoryStream 클래스"
linktitle: "MemoryStream"
second_title: "C++용 Aspose.Page"
description: "System::IO::MemoryStream 클래스. 메모리에서 읽고 쓰는 스트림을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1800
url: /ko/cpp/system.io/memorystream/
---
## MemoryStream class


메모리에서 읽고 쓰는 스트림을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 유형의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 이 포인터를 함수 인수로 전달하십시오.

```cpp
class MemoryStream : public System::IO::Stream
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 스트림을 닫습니다. |
| [Flush](./flush/)() override | 아무 작업도 수행하지 않습니다. |
| [get_CanRead](./get_canread/)() const override | 스트림을 읽을 수 있는지 결정합니다. |
| [get_CanSeek](./get_canseek/)() const override | 스트림이 시크(탐색)를 지원하는지 확인합니다. |
| [get_CanWrite](./get_canwrite/)() const override | 스트림이 쓰기 가능한지 확인합니다. |
| [get_Capacity](./get_capacity/)() | 기본 메모리 버퍼의 현재 용량을 반환합니다. |
| [get_Length](./get_length/)() const override | 스트림의 길이를 바이트 단위로 반환합니다. |
| [get_Position](./get_position/)() const override | 스트림의 현재 위치를 반환합니다. |
| virtual [GetBuffer](./getbuffer/)() | 기본 버퍼에 대한 포인터를 반환합니다. |
| [MemoryStream](./memorystream/)() | 초기 용량이 0인 [MemoryStream](./) 클래스의 새 인스턴스를 생성합니다. |
| [MemoryStream](./memorystream/)(int) | 지정된 크기의 메모리 버퍼를 기반으로 하는 스트림을 나타내는 [MemoryStream](./) 클래스의 새 인스턴스를 생성합니다. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | 지정된 메모리 버퍼에 연결된 메모리 스트림을 나타내는 [MemoryStream](./) 클래스의 새 인스턴스를 생성합니다. 매개변수는 스트림이 쓰기 가능한지 여부를 지정합니다. |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | 지정된 인덱스에서 시작하고 지정된 요소 수를 포함하는 지정된 메모리 버퍼의 세그먼트에 연결된 메모리 스트림을 나타내는 [MemoryStream](./) 클래스의 새 인스턴스를 생성합니다. 매개변수는 스트림이 쓰기 가능한지와 GetBytes() 메서드를 호출할 수 있는지를 지정합니다. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [ReadByte](./readbyte/)() override | 스트림에서 단일 바이트를 읽고, 읽은 바이트 값에 해당하는 32비트 정수 값을 반환합니다. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 현재 객체가 나타내는 스트림의 위치를 설정합니다. |
| [set_Capacity](./set_capacity/)(int) | 기본 메모리 버퍼의 용량을 설정합니다. |
| [set_Position](./set_position/)(int64_t) override | 스트림의 위치를 설정합니다. |
| [SetLength](./setlength/)(int64_t) override | 현재 객체가 나타내는 스트림의 길이를 설정합니다. |
| virtual [ToArray](./toarray/)() | 기본 메모리 버퍼를 바이트 배열로 복사하여 반환합니다. |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | 이 스트림이 생성된 부호 없는 바이트 배열을 반환합니다. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| [WriteByte](./writebyte/)(uint8_t) override | 지정된 부호 없는 8비트 정수 값을 스트림에 씁니다. |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | 기본 버퍼의 내용을 지정된 스트림에 씁니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](../stream/null/) | 기본 저장소가 없는 스트림입니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 자신에 대한 공유 포인터의 별칭입니다. |
## 또 보기

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

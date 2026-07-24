---
title: "System::IO::UnmanagedMemoryStream 클래스"
linktitle: "UnmanagedMemoryStream"
second_title: "C++용 Aspose.Page"
description: "System::IO::UnmanagedMemoryStream 클래스. 관리되지 않는 메모리에 대한 접근을 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 2800
url: /ko/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


관리되지 않는 메모리에 대한 접근을 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 이 타입의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Flush](./flush/)() override | 아무 작업도 수행하지 않습니다. |
| [get_CanRead](./get_canread/)() const override | 스트림을 읽을 수 있는지 결정합니다. |
| [get_CanSeek](./get_canseek/)() const override | 스트림이 시크(탐색)를 지원하는지 확인합니다. |
| [get_CanWrite](./get_canwrite/)() const override | 스트림이 쓰기 가능한지 확인합니다. |
| virtual [get_Capacity](./get_capacity/)() const | 기본 메모리 버퍼의 현재 용량을 반환합니다. |
| [get_Length](./get_length/)() const override | 스트림의 길이를 바이트 단위로 반환합니다. |
| [get_Position](./get_position/)() const override | 스트림의 현재 위치를 반환합니다. |
| [get_PositionPointer](./get_positionpointer/)() | 구현되지 않음. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 현재 객체가 나타내는 스트림의 위치를 설정합니다. |
| [set_Position](./set_position/)(int64_t) override | 스트림의 위치를 설정합니다. |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | 구현되지 않음. |
| [SetLength](./setlength/)(int64_t) override | 구현되지 않음. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | 새로운 [UnmanagedMemoryStream](./) 인스턴스를 생성합니다. |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | 새로운 [UnmanagedMemoryStream](./) 인스턴스를 생성합니다. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 구현되지 않음. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 구현되지 않음. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](../stream/null/) | 기본 저장소가 없는 스트림입니다. |
## 또 보기

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

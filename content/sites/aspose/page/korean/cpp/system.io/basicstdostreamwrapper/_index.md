---
title: "System::IO::BasicSTDOStreamWrapper 클래스"
linktitle: "BasicSTDOStreamWrapper"
second_title: "C++용 Aspose.Page"
description: "System::IO::BasicSTDOStreamWrapper 클래스. std::basic_ostream 및 파생 객체에 대한 System.IO.Stream 유사 래퍼를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 300
url: /ko/cpp/system.io/basicstdostreamwrapper/
---
## BasicSTDOStreamWrapper class


[System.IO.Stream](../stream/)와 유사한 래퍼를 std::basic_ostream 및 파생 객체에 대해 표시합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
template<typename T,typename>class BasicSTDOStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | 새로운 [BasicSTDOStreamWrapper](./) 인스턴스를 생성합니다. |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(const BasicSTDOStreamWrapper\&) | 복사 생성자. 삭제됨. |
| [Flush](./flush/)() override | 이 스트림의 버퍼를 비우고 모든 버퍼링된 데이터를 기본 저장소에 기록합니다. |
| [operator=](./operator=/)(const BasicSTDOStreamWrapper\&) | 복사 할당 연산자. 삭제됨. |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 래핑 모드가 바이너리인 경우 스트림에서 지정된 바이트 수를 읽고, 그렇지 않으면 지정된 문자 수를 읽어 uint8_t 타입으로 변환합니다. 읽은 결과를 지정된 바이트 배열에 씁니다. 지원되지 않습니다! |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 스트림에서 지정된 바이트 수를 읽어 지정된 바이트 배열에 씁니다. |
| [ReadByte](./readbyte/)() override | 래핑 모드가 바이너리인 경우 마지막 디코딩된 문자 저장소에서 단일 바이트를 읽고, 그렇지 않으면 스트림에서 단일 문자를 읽어 uint8_t 타입으로 변환합니다. 지원되지 않습니다! |
| [SetLength](./setlength/)(int64_t) override | 현재 객체가 나타내는 스트림의 길이를 설정합니다. |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 래핑 모드가 바이너리인 경우 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. 그렇지 않으면 지정된 바이트 배열에서 지정된 바이트 하위 범위를 [char_type](./char_type/) 타입으로 변환한 후 결과를 스트림에 씁니다. |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 스트림에 씁니다. |
| [WriteByte](./writebyte/)(uint8_t) override | 래핑 모드가 바이너리인 경우 지정된 부호 없는 8비트 정수 값을 스트림에 씁니다. 그렇지 않으면 이를 [char_type](./char_type/) 타입으로 변환한 후 결과를 스트림에 씁니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](../stream/null/) | 기본 저장소가 없는 스트림입니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI 정보. |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## 또 보기

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

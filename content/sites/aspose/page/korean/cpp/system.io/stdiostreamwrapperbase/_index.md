---
title: "System::IO::STDIOStreamWrapperBase 클래스"
linktitle: "STDIOStreamWrapperBase"
second_title: "C++용 Aspose.Page"
description: "System::IO::STDIOStreamWrapperBase 클래스. System.IO.Stream와 유사한 래퍼의 기본 클래스를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2000
url: /ko/cpp/system.io/stdiostreamwrapperbase/
---
## STDIOStreamWrapperBase class


Represents a base class for [System.IO.Stream](../stream/)-like wrappers. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename T,typename>class STDIOStreamWrapperBase : public System::IO::Stream
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_CanRead](./get_canread/)() const override | 스트림이 읽기를 지원하는지 확인합니다. |
| [get_CanSeek](./get_canseek/)() const override | 스트림이 시크(탐색)를 지원하는지 확인합니다. |
| [get_CanWrite](./get_canwrite/)() const override | 스트림이 쓰기를 지원하는지 확인합니다. |
| [get_Length](./get_length/)() const override | 스트림의 길이를 반환합니다. |
| [get_Position](./get_position/)() const override | 스트림의 현재 위치를 반환합니다. |
| [operator=](./operator=/)(const STDIOStreamWrapperBase\&) | 복사 할당 연산자. 삭제됨. |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 현재 객체가 나타내는 스트림의 위치를 설정합니다. |
| [set_Position](./set_position/)(int64_t) override | 스트림의 위치를 설정합니다. |
| [STDIOStreamWrapperBase](./stdiostreamwrapperbase/)(const STDIOStreamWrapperBase\&) | 복사 생성자. 삭제됨. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Null](../stream/null/) | 기본 저장소가 없는 스트림입니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI 정보. |
| [int_type](./int_type/) |  |
| [off_type](./off_type/) |  |
| [pos_type](./pos_type/) |  |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## 또 보기

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::IO::StreamWriter 클래스"
linktitle: "StreamWriter"
second_title: "C++용 Aspose.Page"
description: "System::IO::StreamWriter 클래스. 바이트 스트림에 문자를 쓰는 라이터를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 2300
url: /ko/cpp/system.io/streamwriter/
---
## StreamWriter class


바이트 스트림에 문자를 쓰는 라이터를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인수로 전달할 때 해당 포인터를 사용하십시오.

```cpp
class StreamWriter : public System::IO::TextWriter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 스트림을 닫고 획득한 리소스를 해제합니다. |
| [Dispose](./dispose/)() override | 현재 객체가 사용한 모든 리소스를 해제하고 기반 스트림을 닫습니다. |
| [Flush](./flush/)() override | 버퍼의 내용을 기본 스트림에 플러시하고, 그 후 기본 스트림을 플러시합니다. |
| [get_AutoFlush](./get_autoflush/)() const | [StreamWriter](./)가 메서드 [StreamWriter::Write](./write/)가 호출될 때마다 데이터를 기본 스트림에 플러시할지 여부를 나타내는 값을 반환합니다. |
| [get_BaseStream](./get_basestream/)() const | 기본 스트림을 나타내는 객체에 대한 공유 포인터를 반환합니다. |
| [get_Encoding](./get_encoding/)() override | 현재 사용 중인 인코딩을 반환합니다. |
| [set_AutoFlush](./set_autoflush/)(bool) | [StreamWriter](./)가 메서드 [StreamWriter::Write](./write/)가 호출될 때마다 데이터를 기본 스트림에 플러시해야 하는지 여부를 지정하는 값을 반환합니다. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | UTF-8 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 지정된 기본 스트림에 문자를 쓰는 [StreamWriter](./) 객체의 인스턴스를 생성합니다. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | 지정된 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 지정된 기본 스트림에 문자를 쓰는 [StreamWriter](./) 객체의 인스턴스를 생성합니다. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | 지정된 인코딩과 지정된 크기의 버퍼를 사용하여 지정된 기본 스트림에 문자를 쓰는 [StreamWriter](./) 객체의 인스턴스를 생성합니다. 매개변수는 [StreamWriter](./) 객체가 폐기될 때 기본 스트림을 닫을지 여부를 지정합니다. |
| [StreamWriter](./streamwriter/)(const String\&) | UTF-8 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 지정된 파일에 문자를 쓰는 [StreamWriter](./) 객체의 인스턴스를 생성합니다. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | 지정된 인코딩과 기본 크기 1024바이트 버퍼를 사용하여 지정된 파일에 문자를 쓰는 [StreamWriter](./) 객체의 인스턴스를 생성합니다. 매개변수는 데이터를 파일에 추가할지, 파일을 덮어쓸지를 지정합니다. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | 지정된 인코딩과 버퍼 크기를 사용하여 지정된 파일에 문자를 쓰는 [StreamWriter](./) 객체의 인스턴스를 생성합니다. 매개변수는 데이터를 파일에 추가할지, 파일을 덮어쓸지를 지정합니다. |
| [Write](./write/)(char_t) override | 지정된 문자를 스트림에 씁니다. |
| [Write](./write/)(const String\&) override | 지정된 문자열을 스트림에 씁니다. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | 지정된 객체의 문자열 표현을 스트림에 씁니다. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | 지정된 배열의 모든 문자를 스트림에 씁니다. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 지정된 문자 배열에서 지정된 UTF-16 문자 하위 범위를 스트림에 씁니다. |
| [Write](./write/)(const char_t *) override | 지정된 c-string을 스트림에 씁니다. |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | 지정된 객체의 문자열 표현을 스트림에 씁니다. |
| [WriteLine](./writeline/)() override | 줄 구분자 문자를 스트림에 씁니다. |
| [WriteLine](./writeline/)(const String\&) override | 지정된 문자열을 줄 바꿈 문자와 함께 스트림에 씁니다. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | 지정된 객체의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | 지정된 배열의 모든 문자를 줄 바꿈 문자와 함께 스트림에 씁니다. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 지정된 문자 배열에서 지정된 UTF-16 문자 하위 범위를 줄 바꿈 문자와 함께 스트림에 씁니다. |
| [WriteLine](./writeline/)(const char_t *) override | 지정된 C 문자열을 줄 바꿈 문자와 함께 스트림에 씁니다. |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | 지정된 객체의 문자열 표현에 줄 구분자 문자를 추가하여 스트림에 씁니다. |
| [~StreamWriter](./~streamwriter/)() | 소멸자. |
## 또 보기

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

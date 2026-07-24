---
title: "System::IO::StreamReader 클래스"
linktitle: "StreamReader"
second_title: "C++용 Aspose.Page"
description: "System::IO::StreamReader 클래스. 바이트 스트림에서 문자를 읽는 리더를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2200
url: /ko/cpp/system.io/streamreader/
---
## StreamReader class


바이트 스트림에서 문자를 읽는 리더를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용해 함수 인수로 전달하십시오.

```cpp
class StreamReader : public System::IO::TextReader
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 현재 및 기본 스트림을 닫습니다. |
| [Dispose](./dispose/)() override | 현재 객체가 사용한 모든 리소스를 해제하고 기반 스트림을 닫습니다. |
| [get_BaseStream](./get_basestream/)() const | 기본 스트림을 나타내는 객체에 대한 공유 포인터를 반환합니다. |
| [get_CurrentEncoding](./get_currentencoding/)() | 현재 사용 중인 인코딩을 반환합니다. |
| [get_EndOfStream](./get_endofstream/)() | 스트림의 끝에 도달했는지 여부를 나타내는 값을 반환합니다. |
| [Peek](./peek/)() override | 스트림의 읽기 커서를 변경하지 않고 스트림에서 단일 문자를 읽습니다. |
| [Read](./read/)() override | 스트림에서 단일 문자를 읽습니다. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | 스트림에서 지정된 수의 문자를 읽고, 이를 UTF-16 인코딩으로 변환한 뒤, 지정된 위치에서 시작하는 지정된 문자 배열에 결과 UTF-16 문자를 씁니다. |
| [ReadLine](./readline/)() override | 스트림에서 현재 라인의 끝까지 문자를 읽습니다. |
| [ReadToEnd](./readtoend/)() override | 스트림의 끝까지 문자를 읽습니다. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | [StreamReader](./) 객체의 인스턴스를 생성합니다. 이 객체는 지정된 기본 스트림에서 UTF-8 인코딩을 사용하고 기본 크기 1024바이트인 버퍼를 이용해 문자를 읽습니다. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | [StreamReader](./) 객체의 인스턴스를 생성합니다. 이 객체는 지정된 기본 스트림에서 UTF-8 인코딩을 사용하고 기본 크기 1024바이트인 버퍼를 이용해 문자를 읽습니다. 바이트 순서 표시(BOM) 감지를 활성화할지 여부를 지정하는 매개변수가 있습니다. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | [StreamReader](./) 객체의 인스턴스를 생성합니다. 이 객체는 지정된 기본 스트림에서 지정된 인코딩을 사용하고 기본 크기 1024바이트인 버퍼를 이용해 문자를 읽습니다. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | [StreamReader](./) 객체의 인스턴스를 생성합니다. 이 객체는 지정된 기본 스트림에서 지정된 인코딩을 사용하고 기본 크기 1024바이트인 버퍼를 이용해 문자를 읽습니다. 바이트 순서 표시(BOM) 감지를 활성화할지 여부를 지정하는 매개변수가 있습니다. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | [StreamReader](./) 객체의 인스턴스를 생성합니다. 이 객체는 지정된 기본 스트림에서 지정된 인코딩을 사용하고 지정된 크기의 버퍼를 이용해 문자를 읽습니다. 바이트 순서 표시(BOM) 감지를 활성화할지 여부를 지정하는 매개변수가 있습니다. |
| [StreamReader](./streamreader/)(const System::String\&) | [StreamReader](./) 객체의 인스턴스를 생성합니다. 이 객체는 지정된 파일에서 UTF-8 인코딩을 사용하고 기본 크기 4096바이트인 버퍼를 이용해 문자를 읽습니다. |
| [StreamReader](./streamreader/)(const System::String\&, bool) | 지정된 파일에서 UTF-8 인코딩을 사용하고 기본 크기 4096바이트인 버퍼로 문자를 읽는 [StreamReader](./) 객체의 인스턴스를 생성합니다. 매개변수는 바이트 순서 표시(Byte Order Mark) 감지를 활성화할지 여부를 지정합니다. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | 지정된 파일에서 지정된 인코딩을 사용하고 기본 크기 4096바이트인 버퍼로 문자를 읽는 [StreamReader](./) 객체의 인스턴스를 생성합니다. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | 지정된 기본 스트림에서 지정된 인코딩을 사용하고 기본 크기 4096바이트인 버퍼로 문자를 읽는 [StreamReader](./) 객체의 인스턴스를 생성합니다. 매개변수는 바이트 순서 표시 감지를 활성화할지 여부를 지정합니다. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | 지정된 파일에서 지정된 인코딩을 사용하고 지정된 크기의 버퍼로 문자를 읽는 [StreamReader](./) 객체의 인스턴스를 생성합니다. 매개변수는 바이트 순서 표시 감지를 활성화할지 여부를 지정합니다. |
| [~StreamReader](./~streamreader/)() | 소멸자. |
## 또 보기

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

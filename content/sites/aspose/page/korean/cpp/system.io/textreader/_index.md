---
title: "System::IO::TextReader 클래스"
linktitle: "TextReader"
second_title: "C++용 Aspose.Page"
description: "System::IO::TextReader 클래스. 다양한 소스에서 문자 시퀀스를 읽는 리더를 나타내는 클래스들의 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2600
url: /ko/cpp/system.io/textreader/
---
## TextReader class


다양한 소스에서 문자 시퀀스를 읽는 리더를 나타내는 클래스들의 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class TextReader : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Close](./close/)() | 스트림을 닫고 획득한 리소스를 해제합니다. |
| [Dispose](./dispose/)() override | 현재 객체가 사용한 모든 리소스를 해제하고 기반 스트림을 닫습니다. |
| virtual [Peek](./peek/)() | 스트림의 읽기 커서를 변경하지 않고 스트림에서 단일 문자를 읽습니다. |
| virtual [Read](./read/)() | 스트림에서 단일 문자를 읽습니다. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | 스트림에서 지정된 수의 문자를 읽고, 지정된 위치부터 시작하는 지정된 문자 배열에 씁니다. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | 현재 텍스트 리더에서 지정된 최대 수의 문자를 읽고, 지정된 인덱스부터 시작하는 버퍼에 데이터를 씁니다. |
| virtual [ReadLine](./readline/)() | 스트림에서 현재 라인의 끝까지 문자를 읽습니다. |
| virtual [ReadToEnd](./readtoend/)() | 스트림의 끝까지 문자를 읽습니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

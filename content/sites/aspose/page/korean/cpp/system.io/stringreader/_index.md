---
title: "System::IO::StringReader 클래스"
linktitle: "StringReader"
second_title: "C++용 Aspose.Page"
description: "System::IO::StringReader 클래스. 문자열에서 문자를 읽는 리더를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 2400
url: /ko/cpp/system.io/stringreader/
---
## StringReader class


문자열에서 문자를 읽는 리더를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class StringReader : public System::IO::TextReader
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 스트림을 닫습니다. |
| [Dispose](./dispose/)() override | 아무 작업도 수행하지 않습니다. |
| [Dispose](./dispose/)(bool) override | 아무 작업도 수행하지 않습니다. |
| [Peek](./peek/)() override | 스트림 위치를 변경하지 않고 스트림에서 단일 문자를 읽습니다. |
| [Read](./read/)() override | 스트림에서 단일 문자를 읽습니다. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | 스트림에서 지정된 위치부터 시작하여 지정된 문자 배열에 지정된 수만큼의 문자를 읽습니다. |
| [ReadLine](./readline/)() override | 스트림에서 현재 라인의 끝까지 문자를 읽습니다. |
| [ReadToEnd](./readtoend/)() override | 스트림의 끝까지 문자를 읽습니다. |
| [StringReader](./stringreader/)(const String\&) | 지정된 문자열에서 문자를 읽는 [StringReader](./) 클래스의 새 인스턴스를 생성합니다. |
## 또 보기

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

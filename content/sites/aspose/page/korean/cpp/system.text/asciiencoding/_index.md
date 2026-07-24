---
title: "System::Text::ASCIIEncoding 클래스"
linktitle: "ASCIIEncoding"
second_title: "C++용 Aspose.Page"
description: "System::Text::ASCIIEncoding 클래스. ASCII 인코딩을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 100
url: /ko/cpp/system.text/asciiencoding/
---
## ASCIIEncoding class


ASCII 인코딩을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class ASCIIEncoding : public System::Text::ICUEncoding
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ASCIIEncoding](./asciiencoding/)() | 생성자. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 알려진 문자 수를 가진 문자열을 저장할 수 있는 최대 바이트 수를 가져옵니다. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 지정된 바이트 수를 디코딩하는 데 필요한 최대 문자 수를 가져옵니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [ASCII_CODE_PAGE](./ascii_code_page/) | RTTI. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 기본 코드 페이지 값. |
## 또 보기

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

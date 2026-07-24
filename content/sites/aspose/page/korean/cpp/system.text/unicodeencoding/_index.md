---
title: "System::Text::UnicodeEncoding 클래스"
linktitle: "UnicodeEncoding"
second_title: "C++용 Aspose.Page"
description: "System::Text::UnicodeEncoding 클래스. Unicode 인코딩. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 2500
url: /ko/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Unicode 인코딩. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 인코딩 객체를 복제합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 인코딩을 비교합니다. |
| [GetHashCode](./gethashcode/)() const override | 인코딩을 해시합니다. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 지정된 문자 수를 인코딩하는 데 필요한 최대 바이트 수를 가져옵니다. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 지정된 바이트 수를 디코딩하는 데 필요한 최대 문자 수를 가져옵니다. |
| [GetPreamble](./getpreamble/)() override | 인코딩을 나타내는 바이트 시퀀스(예: BOM)를 반환합니다. |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | 코드 페이지와 플래그를 기준으로 인코딩을 비교합니다. |
| [UnicodeEncoding](./unicodeencoding/)() | 생성자. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | 생성자. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | 생성자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | 빅 엔디안 코드 페이지 번호. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 기본 코드 페이지 값. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | 리틀 엔디안 코드 페이지 번호. |
## 또 보기

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

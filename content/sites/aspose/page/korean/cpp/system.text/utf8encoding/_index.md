---
title: "System::Text::UTF8Encoding 클래스"
linktitle: "UTF8Encoding"
second_title: "C++용 Aspose.Page"
description: "System::Text::UTF8Encoding 클래스. UTF-8 인코딩을 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 2800
url: /ko/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


UTF-8 인코딩. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 이 유형의 인스턴스를 만들거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 이 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 인코딩 객체를 복제합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 객체와 비교합니다. |
| [GetHashCode](./gethashcode/)() const override | 인코딩 해시 코드를 가져옵니다. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | 지정된 문자 수를 인코딩하는 데 필요한 최대 바이트 수를 가져옵니다. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | 지정된 바이트 수를 디코딩하는 데 필요한 최대 문자 수를 가져옵니다. |
| [GetPreamble](./getpreamble/)() override | 코드 페이지 프리앰블을 가져옵니다. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | 인코딩 매개변수를 비교합니다. |
| [UTF8Encoding](./utf8encoding/)() | 생성자. |
| [UTF8Encoding](./utf8encoding/)(bool) | 생성자. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | 생성자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 기본 코드 페이지 값. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | RTTI 정보. |
## 또 보기

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Text::UTF32Encoding 클래스"
linktitle: "UTF32Encoding"
second_title: "C++용 Aspose.Page"
description: "System::Text::UTF32Encoding 클래스. UTF-32 인코딩. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 2600
url: /ko/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


UTF-32 인코딩. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clone](./clone/)() override | 인코딩 객체를 복제합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 객체와 비교합니다. |
| [GetHashCode](./gethashcode/)() const override | 인코딩 해시 코드를 가져옵니다. |
| [GetPreamble](./getpreamble/)() override | 코드 페이지 프리앰블을 가져옵니다. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | 인코딩 매개변수를 비교합니다. |
| [UTF32Encoding](./utf32encoding/)() | 생성자. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | 생성자. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | 생성자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | 빅 엔디안 UTF-32 코드페이지 ID에 사용되는 [Windows](../../system.windows/) 매직 번호. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | 기본 코드 페이지 값. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | 리틀 엔디안 UTF-32 코드페이지 ID에 사용되는 [Windows](../../system.windows/) 매직 번호. |
## 또 보기

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

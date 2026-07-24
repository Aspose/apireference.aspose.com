---
title: "System::Net::Http::StringContent 클래스"
linktitle: "StringContent"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::StringContent 클래스. 문자열로 HTTP 콘텐츠를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1100
url: /ko/cpp/system.net.http/stringcontent/
---
## StringContent class


문자열로 HTTP 콘텐츠를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [StringContent](./stringcontent/)(String) | RTTI 정보. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | 새 인스턴스를 생성합니다. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | 새 인스턴스를 생성합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | 기본 인코딩입니다. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | 최대 바이트 수입니다. |
## 또 보기

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)

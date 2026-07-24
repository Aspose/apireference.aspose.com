---
title: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue 클래스"
linktitle: "MediaTypeWithQualityHeaderValue"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::MediaTypeWithQualityHeaderValue 클래스. ''Content-Type'' 헤더 값에 추가 품질 계수를 가진 MIME 유형을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1300
url: /ko/cpp/system.net.http.headers/mediatypewithqualityheadervalue/
---
## MediaTypeWithQualityHeaderValue class


''Content-Type'' 헤더 값에 추가 품질 계수를 가진 MIME 유형을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class MediaTypeWithQualityHeaderValue : public System::Net::Http::Headers::MediaTypeHeaderValue
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Quality](./get_quality/)() | RTTI 정보. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)() | 새 인스턴스를 생성합니다. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String) | 새 인스턴스를 생성합니다. |
| [MediaTypeWithQualityHeaderValue](./mediatypewithqualityheadervalue/)(String, double) | 새 인스턴스를 생성합니다. |
| static [Parse](./parse/)(String) | 전달된 문자열을 [MediaTypeWithQualityHeaderValue](./) 클래스의 인스턴스로 변환합니다. |
| [set_Quality](./set_quality/)(Nullable\<double\>) | 품질 값을 설정합니다. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<MediaTypeWithQualityHeaderValue\>\&) | 전달된 문자열을 [MediaTypeWithQualityHeaderValue](./) 클래스의 인스턴스로 변환을 시도합니다. |
## 또 보기

* Class [MediaTypeHeaderValue](../mediatypeheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)

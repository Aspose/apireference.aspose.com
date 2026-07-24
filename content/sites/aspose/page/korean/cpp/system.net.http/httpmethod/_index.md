---
title: "System::Net::Http::HttpMethod 클래스"
linktitle: "HttpMethod"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::HttpMethod 클래스. HTTP 메서드를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 700
url: /ko/cpp/system.net.http/httpmethod/
---
## HttpMethod class


HTTP 메서드를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | 현재 및 지정된 객체가 같은지 여부를 결정합니다. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| static [get_Delete](./get_delete/)() | 'DELETE' HTTP 메서드를 반환합니다. |
| static [get_Get](./get_get/)() | 'GET' HTTP 메서드를 반환합니다. |
| static [get_Head](./get_head/)() | 'HEAD' HTTP 메서드를 반환합니다. |
| [get_Method](./get_method/)() | HTTP 메서드의 문자열 표현을 반환합니다. |
| static [get_Options](./get_options/)() | 'OPTIONS' HTTP 메서드를 반환합니다. |
| static [get_Post](./get_post/)() | 'POST' HTTP 메서드를 반환합니다. |
| static [get_Put](./get_put/)() | 'PUT' HTTP 메서드를 반환합니다. |
| static [get_Trace](./get_trace/)() | 'TRACE' HTTP 메서드를 반환합니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| [HttpMethod](./httpmethod/)(String) | 새 인스턴스를 생성합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)

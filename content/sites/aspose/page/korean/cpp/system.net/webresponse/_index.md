---
title: "System::Net::WebResponse 클래스"
linktitle: "WebResponse"
second_title: "C++용 Aspose.Page"
description: "System::Net::WebResponse 클래스. 웹 응답을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 4000
url: /ko/cpp/system.net/webresponse/
---
## WebResponse class


웹 응답을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class WebResponse : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Close](./close/)() | 응답 스트림을 닫습니다. |
| [Dispose](./dispose/)() override | 아무 작업도 수행하지 않습니다. |
| virtual [get_ContentLength](./get_contentlength/)() | RTTI 정보. |
| virtual [get_ContentType](./get_contenttype/)() | 리소스의 MIME 유형을 반환합니다. |
| virtual [get_Headers](./get_headers/)() | 현재 응답과 연관된 헤더 컬렉션을 반환합니다. |
| virtual [get_ResponseUri](./get_responseuri/)() | 리소스의 URI를 반환합니다. |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | 현재 응답이 헤더를 지원하는지 여부를 나타내는 값을 반환합니다. |
| virtual [GetResponseStream](./getresponsestream/)() | 응답 스트림을 반환합니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)

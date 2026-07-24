---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "C++용 Aspose.Page"
description: "System::Net::FileWebResponse 클래스. 파일 시스템과 작업하기 위해 WebResponse 추상 클래스를 구현합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 1100
url: /ko/cpp/system.net/filewebresponse/
---
## FileWebResponse class


[WebResponse](../webresponse/) 추상 클래스를 파일 시스템과 작업하도록 구현합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인수로 전달할 때 이 포인터를 사용하십시오.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 응답 스트림을 닫습니다. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | 새 인스턴스를 생성합니다. |
| [get_ContentLength](./get_contentlength/)() override | RTTI 정보. |
| [get_ContentType](./get_contenttype/)() override | 리소스의 MIME 유형을 반환합니다. |
| [get_Headers](./get_headers/)() override | 현재 응답과 연관된 헤더 컬렉션을 반환합니다. |
| [get_ResponseUri](./get_responseuri/)() override | 리소스의 URI를 반환합니다. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | 현재 응답이 헤더를 지원하는지 여부를 나타내는 값을 반환합니다. |
| [GetResponseStream](./getresponsestream/)() override | 응답 스트림을 반환합니다. |
## 또 보기

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)

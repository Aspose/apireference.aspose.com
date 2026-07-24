---
title: "System::Net::FileWebRequest 클래스"
linktitle: "FileWebRequest"
second_title: "C++용 Aspose.Page"
description: "System::Net::FileWebRequest 클래스. 파일 시스템과 작업하기 위해 WebRequest 추상 클래스를 구현합니다. 이 클래스의 객체는 반드시 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.net/filewebrequest/
---
## FileWebRequest class


파일 시스템과 작업하기 위해 [WebRequest](../webrequest/) 추상 클래스를 구현합니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Abort](./abort/)() override | 현재 요청을 중단합니다. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | 리소스에 데이터를 쓰기 위한 스트림을 가져오는 비동기 작업을 시작합니다. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | 리소스에 대한 비동기 요청을 시작합니다. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | 지정된 스트림을 가져오는 비동기 작업이 완료될 때까지 기다립니다. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | 지정된 리소스에 대한 비동기 요청이 완료될 때까지 기다립니다. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | 새 인스턴스를 생성합니다. |
| [get_ContentType](./get_contenttype/)() override | 요청의 MIME 타입을 가져옵니다. |
| [get_Headers](./get_headers/)() override | HTTP 헤더 컬렉션을 가져옵니다. |
| [get_Method](./get_method/)() override | HTTP 메서드를 가져옵니다. |
| [get_RequestUri](./get_requesturi/)() override | 요청 URI를 반환합니다. |
| [GetResponse](./getresponse/)() override | 현재 웹 요청과 연결된 웹 응답을 반환합니다. |
| [set_ContentType](./set_contenttype/)(String) override | 요청의 MIME 유형을 설정합니다. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | HTTP 헤더 컬렉션을 설정합니다. |
| [set_Method](./set_method/)(String) override | HTTP 메서드를 설정합니다. |
| [set_Timeout](./set_timeout/)(int) override | RTTI 정보. |
## 또 보기

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)

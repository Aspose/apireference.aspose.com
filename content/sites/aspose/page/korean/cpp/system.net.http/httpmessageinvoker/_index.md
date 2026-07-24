---
title: "System::Net::Http::HttpMessageInvoker 클래스"
linktitle: "HttpMessageInvoker"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::HttpMessageInvoker 클래스. 애플리케이션이 HTTP 핸들러 체인에서 Send 메서드를 호출할 수 있도록 합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 600
url: /ko/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


애플리케이션이 HTTP 핸들러 체인에서 Send 메서드를 호출할 수 있도록 합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Dispose](./dispose/)() override | 현재 인스턴스를 해제합니다. 필요에 따라 이 메서드는 핸들러도 해제합니다. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | RTTI 정보. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | 새 인스턴스를 생성합니다. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | 지정된 요청을 보냅니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)

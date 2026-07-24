---
title: "System::Net::WebClient 클래스"
linktitle: "WebClient"
second_title: "C++용 Aspose.Page"
description: "System::Net::WebClient 클래스. WebClient는 데이터 전송 및 수신을 위한 일반 메서드를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 3500
url: /ko/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | 지정된 리소스를 바이트 배열로 다운로드합니다. |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | 지정된 리소스를 바이트 배열로 다운로드합니다. |
| [DownloadString](./downloadstring/)(const String\&) const | 지정된 리소스를 문자열로 다운로드합니다. |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | 지정된 리소스를 문자열로 다운로드합니다. |
| [get_Encoding](./get_encoding/)() const | 문자열을 다운로드하거나 업로드할 때 사용되는 인코딩을 가져옵니다. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | 문자열을 다운로드하거나 업로드할 때 사용되는 인코딩을 설정합니다. |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 구현되지 않음. |
| [WebClient](./webclient/)() | RTTI 정보. |
| [~WebClient](./~webclient/)() | 현재 인스턴스를 소멸시킵니다. |
## 또 보기

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)

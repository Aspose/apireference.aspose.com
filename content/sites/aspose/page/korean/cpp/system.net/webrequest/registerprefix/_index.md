---
title: "System::Net::WebRequest::RegisterPrefix 메서드"
linktitle: "RegisterPrefix"
second_title: "C++용 Aspose.Page"
description: "System::Net::WebRequest::RegisterPrefix 메서드. C++에서 지정된 URI에 대한 WebRequest 파생 클래스를 등록합니다."
type: docs
weight: 600
url: /ko/cpp/system.net/webrequest/registerprefix/
---
## WebRequest::RegisterPrefix method


지정된 URI에 대한 [WebRequest](../) 파생 클래스를 등록합니다.

```cpp
static bool System::Net::WebRequest::RegisterPrefix(String prefix, System::SharedPtr<IWebRequestCreate> creator)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 접두사 | String | URI 또는 URI 접두사입니다. |
| creator | System::SharedPtr\<IWebRequestCreate\> | 새로운 [WebRequest](../) 클래스 인스턴스를 생성합니다. |

### ReturnValue

지정된 URI에 대해 [WebRequest](../) 파생 클래스가 성공적으로 등록되면 true, 그렇지 않으면 false입니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IWebRequestCreate](../../iwebrequestcreate/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

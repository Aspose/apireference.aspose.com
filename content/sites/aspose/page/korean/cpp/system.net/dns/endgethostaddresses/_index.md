---
title: "System::Net::Dns::EndGetHostAddresses 메서드"
linktitle: "EndGetHostAddresses"
second_title: "C++용 Aspose.Page"
description: "System::Net::Dns::EndGetHostAddresses 메서드. C++에서 새 IPHostEntry 클래스 인스턴스를 생성하는 지정된 비동기 작업이 완료될 때까지 대기합니다."
type: docs
weight: 500
url: /ko/cpp/system.net/dns/endgethostaddresses/
---
## Dns::EndGetHostAddresses method


지정된 비동기 작업이 새로운 IPHostEntry-class 인스턴스를 생성할 때까지 대기합니다.

```cpp
static System::ArrayPtr<System::SharedPtr<IPAddress>> System::Net::Dns::EndGetHostAddresses(System::SharedPtr<IAsyncResult> asyncResult)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 비동기 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체입니다. |

### ReturnValue

새로 생성된 IPHostEntry 클래스 인스턴스입니다.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../ipaddress/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

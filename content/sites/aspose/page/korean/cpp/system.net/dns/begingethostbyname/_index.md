---
title: "System::Net::Dns::BeginGetHostByName 메서드"
linktitle: "BeginGetHostByName"
second_title: "C++용 Aspose.Page"
description: "System::Net::Dns::BeginGetHostByName 메서드. C++에서 지정된 호스트 이름을 사용하여 새 IPHostEntry 클래스 인스턴스를 생성하는 비동기 작업을 시작합니다."
type: docs
weight: 200
url: /ko/cpp/system.net/dns/begingethostbyname/
---
## Dns::BeginGetHostByName method


지정된 호스트 이름을 사용하여 새로운 IPHostEntry-class 인스턴스를 생성하는 비동기 작업을 시작합니다.

```cpp
static System::SharedPtr<IAsyncResult> System::Net::Dns::BeginGetHostByName(String hostName, AsyncCallback requestCallback, System::SharedPtr<Object> stateObject)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| hostName | String | 호스트 이름입니다. |
| requestCallback | AsyncCallback | 작업이 완료될 때 호출되는 콜백입니다. |
| stateObject | System::SharedPtr\<Object\> | 각 비동기 작업을 고유하게 식별하는 데 사용되는 사용자 제공 데이터입니다. |

### ReturnValue

시작된 비동기 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Net::Dns::EndGetHostEntry 메서드"
linktitle: "EndGetHostEntry"
second_title: "C++용 Aspose.Page"
description: "System::Net::Dns::EndGetHostEntry 메서드. 지정된 비동기 작업이 새로운 IPHostEntry-클래스 인스턴스를 생성할 때까지 기다립니다(C++)."
type: docs
weight: 700
url: /ko/cpp/system.net/dns/endgethostentry/
---
## Dns::EndGetHostEntry method


지정된 비동기 작업이 새로운 IPHostEntry-class 인스턴스를 생성할 때까지 대기합니다.

```cpp
static System::SharedPtr<IPHostEntry> System::Net::Dns::EndGetHostEntry(System::SharedPtr<IAsyncResult> asyncResult)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 비동기 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체입니다. |

### ReturnValue

새로 생성된 IPHostEntry 클래스 인스턴스입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPHostEntry](../../iphostentry/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Dns](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

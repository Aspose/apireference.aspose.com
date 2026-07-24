---
title: "System::Net::IPEndPoint::Create 메서드"
linktitle: "생성"
second_title: "C++용 Aspose.Page"
description: "System::Net::IPEndPoint::Create 메서드. C++에서 지정된 소켓 주소를 사용하여 EndPoint 클래스의 새 인스턴스를 생성합니다."
type: docs
weight: 200
url: /ko/cpp/system.net/ipendpoint/create/
---
## IPEndPoint::Create method


지정된 소켓 주소를 사용하여 [EndPoint](../../endpoint/) 클래스의 새 인스턴스를 생성합니다.

```cpp
System::SharedPtr<EndPoint> System::Net::IPEndPoint::Create(System::SharedPtr<SocketAddress> socketAddress) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| socketAddress | System::SharedPtr\<SocketAddress\> | 새 인스턴스를 초기화하는 데 사용될 소켓 주소입니다. |

### ReturnValue

새로 생성된 EndPoint 클래스 인스턴스입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [EndPoint](../../endpoint/)
* Class [SocketAddress](../../socketaddress/)
* Class [IPEndPoint](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)

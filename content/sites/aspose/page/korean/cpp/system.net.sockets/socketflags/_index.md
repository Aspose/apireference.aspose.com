---
title: "System::Net::Sockets::SocketFlags 열거형"
linktitle: "SocketFlags"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::SocketFlags 열거형. C++에서 소켓 메시지에 대한 상수 값을 제공합니다."
type: docs
weight: 1400
url: /ko/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


소켓 메시지에 대한 상수 값을 제공합니다.

```cpp
enum class SocketFlags
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | 0 | 이 호출에 사용되는 플래그가 없습니다. |
| OutOfBand | 1 | 대역외 데이터가 처리 중입니다. |
| Peek | 2 | 수신 메시지를 엿봅니다. |
| DontRoute | 4 | 라우팅 테이블을 사용하지 않고 메시지를 보냅니다. |
| Truncated | 256 | 메시지가 지정된 버퍼에 맞추기에는 너무 큽니다. 메시지가 잘렸습니다. |
| ControlDataTruncated | 512 | 제어 데이터가 64KB보다 커서 내부 버퍼에 맞지 않습니다. 데이터가 잘렸습니다. |
| Broadcast | 1024 | 브로드캐스트 패킷입니다. |
| Multicast | 2048 | 멀티캐스트 패킷입니다. |
| Partial | 32768 | 메시지가 부분적으로 전송되었거나 수신되었습니다. |

## 또 보기

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)

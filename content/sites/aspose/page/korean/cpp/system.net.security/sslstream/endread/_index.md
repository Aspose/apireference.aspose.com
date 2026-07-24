---
title: "System::Net::Security::SslStream::EndRead 메서드"
linktitle: "EndRead"
second_title: "C++용 Aspose.Page"
description: "System::Net::Security::SslStream::EndRead 메서드. 지정된 비동기 읽기 작업이 완료될 때까지 대기합니다(C++)."
type: docs
weight: 700
url: /ko/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


지정된 비동기 읽기 작업이 완료될 때까지 대기합니다.

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 비동기 읽기 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체 |

### ReturnValue

**asyncResult**가 나타내는 읽기 작업 동안 읽은 바이트 수

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)

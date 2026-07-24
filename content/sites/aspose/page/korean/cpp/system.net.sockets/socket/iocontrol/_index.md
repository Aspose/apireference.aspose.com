---
title: "System::Net::Sockets::Socket::IOControl 메서드"
linktitle: "IOControl"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::Socket::IOControl 메서드. C++에서 소켓의 저수준 운영 모드를 설정합니다."
type: docs
weight: 4000
url: /ko/cpp/system.net.sockets/socket/iocontrol/
---
## Socket::IOControl(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


소켓에 대한 저수준 운영 모드를 설정합니다.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(int32_t ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ioControlCode | int32_t | 수행할 작업의 제어 코드. |
| optionInValue | System::ArrayPtr\<uint8_t\> | 입력 데이터를 포함하는 바이트 배열. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | 출력 데이터를 포함하는 바이트 배열. |

### ReturnValue

**optionOutValue** 매개변수의 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::IOControl(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


소켓에 대한 저수준 운영 모드를 설정합니다.

```cpp
int32_t System::Net::Sockets::Socket::IOControl(IOControlCode ioControlCode, System::ArrayPtr<uint8_t> optionInValue, System::ArrayPtr<uint8_t> optionOutValue)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ioControlCode | IOControlCode | 수행할 작업의 제어 코드. |
| optionInValue | System::ArrayPtr\<uint8_t\> | 입력 데이터를 포함하는 바이트 배열. |
| optionOutValue | System::ArrayPtr\<uint8_t\> | 출력 데이터를 포함하는 바이트 배열. |

### ReturnValue

**optionOutValue** 매개변수의 바이트 수.

## 또 보기

* Enum [IOControlCode](../../iocontrolcode/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)

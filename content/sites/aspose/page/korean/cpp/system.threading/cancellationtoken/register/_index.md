---
title: "System::Threading::CancellationToken::Register 메서드"
linktitle: "Register"
second_title: "C++용 Aspose.Page"
description: "System::Threading::CancellationToken::Register 메서드. C++에서 취소가 요청될 때 호출되는 콜백을 등록합니다."
type: docs
weight: 400
url: /ko/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


취소가 요청될 때 호출될 콜백을 등록합니다.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| callback | const Action<>\& | 취소가 요청될 때 실행할 [Action<>](../../../system/action/) 입니다. |

### ReturnValue

콜백 등록을 해제하는 데 사용할 수 있는 [CancellationTokenRegistration](../../cancellationtokenregistration/) 객체입니다.
## 비고



이미 취소가 요청된 경우, 콜백이 즉시 호출됩니다.

## 또 보기

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)

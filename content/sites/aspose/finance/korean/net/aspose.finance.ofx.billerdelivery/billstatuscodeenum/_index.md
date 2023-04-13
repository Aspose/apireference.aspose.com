---
title: Enum BillStatusCodeEnum
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Ofx.BillerDelivery.BillStatusCodeEnum 열거형. 청구 상태 코드 enum.
type: docs
weight: 1470
url: /ko/net/aspose.finance.ofx.billerdelivery/billstatuscodeenum/
---
## BillStatusCodeEnum enumeration

청구 상태 코드 enum.

```csharp
public enum BillStatusCodeEnum
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| WITHDRAWN | `0` | 청구인 또는 게시자는 더 이상 이 청구서가 표시되는 것을 원하지 않습니다. |
| UNDELIVERABLE | `1` | 적시에 소비자에게 이 청구서를 전달하려는 시도는 실패했습니다. 이 상태는 소비자에게 청구서를 제시 할 때 일반적으로 사용되지 않습니다. 그러나 이 상태를 사용하는 알림에는 많은 유용한 사례가 포함됩니다. |
| NEW | `2` | 서버가 클라이언트 또는 클라이언트 프록시로 청구서를 보내지 않았습니다. 청구서의 초기 상태 코드입니다. |
| DELIVERED | `3` | 서버가 청구서를 클라이언트 또는 클라이언트 프록시로 보냈습니다. |
| VIEWED | `4` | 고객이 청구서를 보았습니다. DELIVERED. 의 이전 상태를 암시합니다. |
| RETIRED | `5` | 고객은 더 이상 이 청구서를 보고 싶어하지 않습니다. DELIVERED. 의 이전 상태를 암시합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery/)
* 집회 [Aspose.Finance](../../)



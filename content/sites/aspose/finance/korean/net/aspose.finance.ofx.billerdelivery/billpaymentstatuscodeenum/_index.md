---
title: Enum BillPaymentStatusCodeEnum
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Ofx.BillerDelivery.BillPaymentStatusCodeEnum 열거형. 청구서 결제 상태 코드 enum.
type: docs
weight: 1440
url: /ko/net/aspose.finance.ofx.billerdelivery/billpaymentstatuscodeenum/
---
## BillPaymentStatusCodeEnum enumeration

청구서 결제 상태 코드 enum.

```csharp
public enum BillPaymentStatusCodeEnum
```

### 가치

| 이름 | 값 | 설명 |
| --- | --- | --- |
| PAIDOUTOFBAND | `0` | OFX를 통해 상태를 보고하지 않는 메커니즘을 통해 이 청구서에 대한 지불이 시작되었습니다. 이 상태는 고객이 청구인에게 현금이나 수표로 직접 지불했거나 OFX를 통해 지불 상태를 보고하지 않는 메커니즘을 통해 전자 지불을 시작했음을 나타냅니다. |
| AUTOPAY | `1` | 청구인 또는 서비스 제공자는 고객의 사전 승인, 일반적으로 정의된 종료 날짜가 없는 "취소될 때까지 유효" 지침에 따라 지불을 시작합니다. 미국에서는 일부 청구인이 신용 카드를 통해 사전 승인된 자동 결제를 제공하지만 반복적인 사전 승인된 ACH 데빗을 사용하여 구현되는 경우가 많습니다. 많은 유틸리티에서 제공하는 지불 서비스(APS) NONE과 마찬가지로 청구서의 초기 지불 상태일 수 있습니다. |
| CANCELLED | `2` | 고객이 이전에 예정된 결제를 취소했습니다. |
| UNPAYABLE | `3` | 이 청구서에 허용된 결제 수단은 결제 제공업체에서 지원하지 않습니다. 이는 the 청구서가 Biller Directory 항목에서 허용되는 지불 수단의 하위 집합으로 지불을 제한하는 경우에 사용하기 위한 것입니다. 등록 및 계정 활성화 후 결제 제공자 또는 청구인이 지원되는 결제 수단 유형을 변경한 경우 이 문제가 발생할 수 있습니다. |
| NONE | `4` | 지불이 예정되어 있지 않으며 이 청구서에 대한 지불도 이루어지지 않았습니다. 청구서의 초기 지불 상태일 수 있습니다. |
| SCHEDULED | `5` | 결제가 예약되었지만 이 청구서에 대해 아직 처리되지 않았습니다. |
| PROCESSED | `6` | 이 청구서에 대한 결제가 처리되었으며 더 이상 취소할 수 없습니다. |
| POSTED | `7` | 청구인이 이 청구서에 대한 지불을 게시했습니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery/)
* 집회 [Aspose.Finance](../../)



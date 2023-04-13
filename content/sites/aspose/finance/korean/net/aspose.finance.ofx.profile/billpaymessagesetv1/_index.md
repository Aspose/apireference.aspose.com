---
title: Class BillPayMessageSetV1
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Ofx.Profile.BillPayMessageSetV1 수업. 요금 지불 메시지 세트의 버전 1.
type: docs
weight: 4420
url: /ko/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

요금 지불 메시지 세트의 버전 1.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1/)() | 의 새 인스턴스를 초기화합니다.`BillPayMessageSetV1` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext/) { get; set; } | 지불 공급자가 지불 작업에서 청구서 표시 컨텍스트 정보를 지원하는지 여부를 가져오거나 설정합니다. |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee/) { get; set; } | 사용자가 수취인을 추가할 수 있는지 여부를 가져오거나 설정합니다. false인 경우 사용자는 결제 시스템에 의해 사용자의 수취인 목록에 추가된 수취인으로 제한됩니다. |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels/) { get; set; } | 모델 수정 허용 여부를 가져오거나 설정합니다. |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments/) { get; set; } | 결제 수정 허용 여부를 가져오거나 설정합니다. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal/) { get; set; } | 인출 날짜에 대한 오프셋을 가져오거나 설정합니다. |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay/) { get; set; } | 수표로 지불할 기본 일수를 가져오거나 설정합니다(이체 제외). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment/) { get; set; } | model 에 의해 생성된 첫 번째 지불에 대해 다른 금액을 지정하기 위한 지원 여부를 가져오거나 설정합니다. |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment/) { get; set; } | model 에 의해 생성된 마지막 결제에 대해 다른 금액을 지정하기 위한 지원 여부를 가져오거나 설정합니다. |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment/) { get; set; } | ExtendedPayment 비즈니스 결제 지원 여부를 가져오거나 설정합니다. |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore/) { get; set; } | 가져오거나 설정합니다.[`MessageSetCore`](../abstractmessagesetversion/messagesetcore/) . |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow/) { get; set; } | 모델 창을 가져오거나 설정합니다. 반복 트랜잭션이 시스템에서 인스턴스화되도록 처리되도록 예약되기 전의 일 수입니다. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress/) { get; set; } | 청구 주소로 식별된 수취인에 대한 지불 지원 여부를 가져오거나 설정합니다.[`Payee`](../../aspose.finance.ofx/payee/) . |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid/) { get; set; } | 서버에서 제공한 수취인 ID로 식별된 수취인에 대한 지불 지원 여부를 가져오거나 설정합니다. |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer/) { get; set; } | 대상 account 로 식별된 수취인에 대한 지급 여부를 가져오거나 설정합니다. |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow/) { get; set; } | 상태 문의를 위해 액세스할 수 있는 트랜잭션 처리 후 일 수를 가져오거나 설정합니다. |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs/) { get; set; } | 처리가 발생하지 않는 요일을 가져오거나 설정합니다. |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime/) { get; set; } | 하루 중 처리가 종료되는 시간을 가져오거나 설정합니다. |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods/) { get; set; } | true인 경우 서버는 PaymentModResponse 메시지를 통해 서버에서 시작된 결제 상태 변경 통신을 지원합니다. |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw/) { get; set; } | 이체 결제를 위해 자금이 인출되는 처리 날짜 이전의 일 수를 가져오거나 설정합니다. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay/) { get; set; } | 이체로 결제할 기본 일수를 가져오거나 설정합니다. |

### 또한보십시오

* class [AbstractMessageSetVersion](../abstractmessagesetversion/)
* 네임스페이스 [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile/)
* 집회 [Aspose.Finance](../../)



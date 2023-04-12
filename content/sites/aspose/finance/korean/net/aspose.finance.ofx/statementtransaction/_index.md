---
title: Class StatementTransaction
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Ofx.StatementTransaction 수업. 이 클래스는 단일 트랜잭션을 설명합니다. 거래 유형과 전기된 날짜를 식별합니다. 이 클래스는 또한 고객이 거래를 인식하는 데 도움이 되는 추가 정보수표 번호 수취인 이름 및 메모를 제공할 수 있습니다. 트랜잭션에는 클라이언트가 트랜잭션을 분류하는 데 사용할 수 있는 표준 산업 코드가 있을 수 있습니다.
type: docs
weight: 5730
url: /ko/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

이 클래스는 단일 트랜잭션을 설명합니다. 거래 유형과 전기된 날짜를 식별합니다. 이 클래스는 또한 고객이 거래를 인식하는 데 도움이 되는 추가 정보(수표 번호, 수취인 이름 및 메모)를 제공할 수 있습니다. 트랜잭션에는 클라이언트가 트랜잭션을 분류하는 데 사용할 수 있는 표준 산업 코드가 있을 수 있습니다.

```csharp
public class StatementTransaction
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [StatementTransaction](statementtransaction/)() | 의 새 인스턴스를 초기화합니다.`StatementTransaction` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto/) { get; set; } | 계정을 가져오거나 설정합니다.[`BankAccount`](../bankaccount/) 또는[`CreditCardAccount`](../creditcardaccount/) . |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate/) { get; set; } | 자금을 사용할 수 있는 날짜(가치 날짜)를 가져오거나 설정합니다. |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber/) { get; set; } | 검사 번호를 가져오거나 설정합니다. |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid/) { get; set; } | 수정된 트랜잭션 ID를 가져오거나 설정합니다. 있는 경우 이 레코드에 의해 수정된 이전에 전송된 트랜잭션의 FinancialInstitutionTransactionId입니다. |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction/) { get; set; } | 시정 조치를 가져오거나 설정합니다. |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency/) { get; set; } | 가져오거나 설정합니다.[`Currency`](./currency/) . |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname/) { get; set; } | 수취인의 확장된 이름 또는 거래 설명을 가져오거나 설정합니다. |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid/) { get; set; } | 금융 기관에서 발급한 거래 ID를 가져오거나 설정합니다. |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas/) { get; set; } | 컬렉션을 가져오거나 설정합니다.[`ImageData`](../imagedata/) . |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource/) { get; set; } | 이 트랜잭션의 현금 출처를 가져오거나 설정합니다. |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo/) { get; set; } | 추가 정보를 가져오거나 설정합니다. |
| [Name](../../aspose.finance.ofx/statementtransaction/name/) { get; set; } | 수취인 이름 또는 거래 설명을 가져오거나 설정합니다. |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency/) { get; set; } | 원점을 가져오거나 설정합니다.[`Currency`](./currency/) . |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee/) { get; set; } | 가져오거나 설정합니다.[`Payee`](./payee/) . |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid/) { get; set; } | 가능한 경우 수취인 식별자를 가져오거나 설정합니다. |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate/) { get; set; } | 트랜잭션이 계정에 게시된 날짜를 가져오거나 설정합니다. |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber/) { get; set; } | 트랜잭션을 고유하게 식별하는 참조 번호를 가져오거나 설정합니다. |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid/) { get; set; } | 서버 할당 트랜잭션 ID를 가져오거나 설정합니다. |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode/) { get; set; } | 표준 산업 코드를 가져오거나 설정합니다. |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount/) { get; set; } | 거래 금액을 가져오거나 설정합니다. |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype/) { get; set; } | 트랜잭션 유형을 가져오거나 설정합니다. |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate/) { get; set; } | 알려진 경우 사용자가 트랜잭션을 시작한 날짜를 가져오거나 설정합니다. |

### 또한보십시오

* 네임스페이스 [Aspose.Finance.Ofx](../../aspose.finance.ofx/)
* 집회 [Aspose.Finance](../../)



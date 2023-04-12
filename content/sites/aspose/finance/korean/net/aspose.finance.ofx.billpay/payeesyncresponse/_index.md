---
title: Class PayeeSyncResponse
second_title: .NET API 참조용 Aspose.Finance
description: Aspose.Finance.Ofx.BillPay.PayeeSyncResponse 수업. 수취인 목록 동기화 응답 클래스.
type: docs
weight: 1020
url: /ko/net/aspose.finance.ofx.billpay/payeesyncresponse/
---
## PayeeSyncResponse class

수취인 목록 동기화 응답 클래스.

```csharp
public class PayeeSyncResponse : AbstractSyncResponse
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PayeeSyncResponse](payeesyncresponse/)() | 의 새 인스턴스를 초기화합니다.`PayeeSyncResponse` 클래스. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | 동기화 요청의 토큰이 서버 기록 테이블의 가장 오래된 항목보다 오래된 경우 예입니다. 이 경우 일부 응답이 손실되었습니다. 동기화 요청의 토큰이 서버 기록 테이블의 토큰보다 최신이거나 일치하는 경우 아니요 히스토리 테이블. |
| [OfxExtension](../../aspose.finance.ofx.billpay/payeesyncresponse/ofxextension/) { get; set; } | 가져오거나 설정합니다.[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/) . |
| [PayeeTransactionResponses](../../aspose.finance.ofx.billpay/payeesyncresponse/payeetransactionresponses/) { get; set; } | 컬렉션을 가져오거나 설정합니다.[`PayeeTransactionResponse`](../payeetransactionresponse/) . |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | 새 동기화 토큰을 가져오거나 설정합니다. |

### 또한보십시오

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* 네임스페이스 [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* 집회 [Aspose.Finance](../../)



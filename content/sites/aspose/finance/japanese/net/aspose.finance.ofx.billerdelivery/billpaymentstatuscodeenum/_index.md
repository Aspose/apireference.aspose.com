---
title: Enum BillPaymentStatusCodeEnum
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Ofx.BillerDelivery.BillPaymentStatusCodeEnum 列挙. 請求書支払い状況コード enum.
type: docs
weight: 1440
url: /ja/net/aspose.finance.ofx.billerdelivery/billpaymentstatuscodeenum/
---
## BillPaymentStatusCodeEnum enumeration

請求書支払い状況コード enum.

```csharp
public enum BillPaymentStatusCodeEnum
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| PAIDOUTOFBAND | `0` | OFX 経由でステータスを報告しないメカニズムを介して、この請求書の支払いが開始されました。このステータスは、 顧客が現金または小切手で請求者に直接支払ったか、または OFX を介して支払いステータスを報告しないメカニズムを介して電子支払いを開始したことを示すことを目的としています. |
| AUTOPAY | `1` | 請求者またはサービス プロバイダーは、顧客による事前承認に基づいて支払いを開始します。通常は、終了日が定義されていない「キャンセルされるまで有効」 指示です。米国では、これは多くの場合、定期的な事前承認済みの ACH デビットを使用して実装されていますが、一部のビラーはクレジット カードによる事前承認済みの自動支払いを提供しています。 Payment Service (APS) offer 多くのユーティリティ. |
| CANCELLED | `2` | 顧客は、以前に予定されていた支払いをキャンセルしました. |
| UNPAYABLE | `3` | この請求書で許可されている支払い方法は、支払いプロバイダーによってサポートされていません。これは、 請求書が請求者ディレクトリ エントリで許可されている支払手段のサブセットへの支払いを制限する場合に使用することを目的としています。これは、支払いプロバイダーまたは 請求者が、登録およびアカウントの有効化後にサポートされている支払い方法の種類を変更した場合に発生する可能性があります. |
| NONE | `4` | 予定されている支払いも、この請求に対して行われた支払いもありません。これは、請求書の最初の支払いステータスである可能性があります. |
| SCHEDULED | `5` | 支払いが予定されていますが、この請求に対してまだ処理されていません。 |
| PROCESSED | `6` | この請求に対して支払いが処理されたため、キャンセルできなくなりました。 |
| POSTED | `7` | 請求者は、この請求に対する支払いを転記しました。 |

### 関連項目

* 名前空間 [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery/)
* 組み立て [Aspose.Finance](../../)



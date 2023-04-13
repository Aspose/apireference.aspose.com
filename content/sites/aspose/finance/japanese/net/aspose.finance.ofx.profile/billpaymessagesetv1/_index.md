---
title: Class BillPayMessageSetV1
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Ofx.Profile.BillPayMessageSetV1 クラス. 請求書支払いメッセージ セットのバージョン 1.
type: docs
weight: 4420
url: /ja/net/aspose.finance.ofx.profile/billpaymessagesetv1/
---
## BillPayMessageSetV1 class

請求書支払いメッセージ セットのバージョン 1.

```csharp
public class BillPayMessageSetV1 : AbstractMessageSetVersion
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [BillPayMessageSetV1](billpaymessagesetv1/)() | の新しいインスタンスを初期化します`BillPayMessageSetV1`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [BillPresentmentContext](../../aspose.finance.ofx.profile/billpaymessagesetv1/billpresentmentcontext/) { get; set; } | 支払いプロバイダーが支払い操作で請求書提示コンテキスト情報をサポートするかどうかを取得または設定します。 |
| [CanAddPayee](../../aspose.finance.ofx.profile/billpaymessagesetv1/canaddpayee/) { get; set; } | ユーザーが受取人を追加できるかどうかを取得または設定します。false の場合、ユーザーは支払システムによってユーザーの受取人リストに追加された受取人に制限されます。 |
| [CanModificationModels](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationmodels/) { get; set; } | モデルの変更を許可するかどうかを取得または設定します。 |
| [CanModificationPayments](../../aspose.finance.ofx.profile/billpaymessagesetv1/canmodificationpayments/) { get; set; } | 支払いの変更を許可するかどうかを取得または設定します. |
| [DaysWithdrawal](../../aspose.finance.ofx.profile/billpaymessagesetv1/dayswithdrawal/) { get; set; } | 引き出し日のオフセットを取得または設定します。 |
| [DefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/defaultdaystopay/) { get; set; } | 小切手で支払うデフォルトの日数を取得または設定します (振込による場合を除く). |
| [DifferentFirstPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentfirstpayment/) { get; set; } | モデルによって生成された最初の支払いに異なる金額を指定するためのサポートの有無を取得または設定します |
| [DifferentLastPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/differentlastpayment/) { get; set; } | モデルによって生成された最後の支払いに対して別の金額を指定するためのサポートを取得または設定します |
| [HasExtendedPayment](../../aspose.finance.ofx.profile/billpaymessagesetv1/hasextendedpayment/) { get; set; } | ExtendedPayment ビジネス支払いをサポートするかどうかを取得または設定します。 |
| [MessageSetCore](../../aspose.finance.ofx.profile/abstractmessagesetversion/messagesetcore/) { get; set; } | を取得または設定します[`MessageSetCore`](../abstractmessagesetversion/messagesetcore/). |
| [ModelWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/modelwindow/) { get; set; } | モデル ウィンドウを取得または設定します。システム上でインスタンス化される定期的なトランザクションが処理されるようにスケジュールされるまでの日数. |
| [PaymentByAddress](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbyaddress/) { get; set; } | 請求先住所で識別される受取人への支払いをサポートするかどうかを取得または設定します。[`Payee`](../../aspose.finance.ofx/payee/). |
| [PaymentByPayeeId](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbypayeeid/) { get; set; } | サーバー提供の受取人 ID によって識別される受取人への支払いをサポートするかどうかを取得または設定します。 |
| [PaymentByTransfer](../../aspose.finance.ofx.profile/billpaymessagesetv1/paymentbytransfer/) { get; set; } | 宛先 account によって識別される受取人への支払いを取得または設定します |
| [PostProcessWindow](../../aspose.finance.ofx.profile/billpaymessagesetv1/postprocesswindow/) { get; set; } | トランザクションが処理されてからステータス照会のためにアクセスできる日数を取得または設定します。 |
| [ProcessingDaysOffs](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingdaysoffs/) { get; set; } | 処理が行われない曜日を取得または設定します。 |
| [ProcessingEndTime](../../aspose.finance.ofx.profile/billpaymessagesetv1/processingendtime/) { get; set; } | 1 日の処理が終了する時刻を取得または設定します。 |
| [StatusViaMods](../../aspose.finance.ofx.profile/billpaymessagesetv1/statusviamods/) { get; set; } | true の場合、サーバーは、PaymentModResponse メッセージによるサーバー開始の支払いステータス変更の通信をサポートします。 |
| [TransferDaysWithdraw](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdayswithdraw/) { get; set; } | 送金による支払いのために資金が引き落とされる処理日の前の日数を取得または設定します. |
| [TransferDefaultDaysToPay](../../aspose.finance.ofx.profile/billpaymessagesetv1/transferdefaultdaystopay/) { get; set; } | 振替で支払うデフォルトの日数を取得または設定します。 |

### 関連項目

* class [AbstractMessageSetVersion](../abstractmessagesetversion/)
* 名前空間 [Aspose.Finance.Ofx.Profile](../../aspose.finance.ofx.profile/)
* 組み立て [Aspose.Finance](../../)



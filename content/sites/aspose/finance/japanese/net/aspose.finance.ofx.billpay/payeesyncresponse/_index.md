---
title: Class PayeeSyncResponse
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Ofx.BillPay.PayeeSyncResponse クラス. 受取人リスト同期応答クラス.
type: docs
weight: 1020
url: /ja/net/aspose.finance.ofx.billpay/payeesyncresponse/
---
## PayeeSyncResponse class

受取人リスト同期応答クラス.

```csharp
public class PayeeSyncResponse : AbstractSyncResponse
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [PayeeSyncResponse](payeesyncresponse/)() | の新しいインスタンスを初期化します`PayeeSyncResponse`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | 同期要求のトークンがサーバーの履歴テーブルの最初のエントリよりも古い場合ははい。この場合、いくつかの応答が失われています。 同期要求のトークンがサーバーの履歴テーブル. |
| [OfxExtension](../../aspose.finance.ofx.billpay/payeesyncresponse/ofxextension/) { get; set; } | を取得または設定します[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/). |
| [PayeeTransactionResponses](../../aspose.finance.ofx.billpay/payeesyncresponse/payeetransactionresponses/) { get; set; } | のコレクションを取得または設定します[`PayeeTransactionResponse`](../payeetransactionresponse/). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | 新しい同期トークンを取得または設定します。 |

### 関連項目

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* 名前空間 [Aspose.Finance.Ofx.BillPay](../../aspose.finance.ofx.billpay/)
* 組み立て [Aspose.Finance](../../)



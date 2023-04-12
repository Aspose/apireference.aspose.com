---
title: Class RecurringInterSyncResponse
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Ofx.InterTransfer.RecurringInterSyncResponse クラス. 定期的な銀行間トランザクション同期応答クラス.
type: docs
weight: 2570
url: /ja/net/aspose.finance.ofx.intertransfer/recurringintersyncresponse/
---
## RecurringInterSyncResponse class

定期的な銀行間トランザクション同期応答クラス.

```csharp
public class RecurringInterSyncResponse : AbstractSyncResponse
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [RecurringInterSyncResponse](recurringintersyncresponse/)() | の新しいインスタンスを初期化します`RecurringInterSyncResponse`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/accountfrom/) { get; set; } | の from を取得または設定します[`BankAccount`](../../aspose.finance.ofx/bankaccount/)また[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/)また[`LoanAccount`](../../aspose.finance.ofx/loanaccount/). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | 同期要求のトークンがサーバーの履歴テーブルの最初のエントリよりも古い場合ははい。この場合、いくつかの応答が失われています。 同期要求のトークンがサーバーの履歴テーブル. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/ofxextension/) { get; set; } | を取得または設定します[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/). |
| [RecurringInterTransactionResponses](../../aspose.finance.ofx.intertransfer/recurringintersyncresponse/recurringintertransactionresponses/) { get; set; } | のコレクションを取得または設定します[`RecurringInterTransactionResponse`](../recurringintertransactionresponse/). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | 新しい同期トークンを取得または設定します。 |

### 関連項目

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* 名前空間 [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer/)
* 組み立て [Aspose.Finance](../../)



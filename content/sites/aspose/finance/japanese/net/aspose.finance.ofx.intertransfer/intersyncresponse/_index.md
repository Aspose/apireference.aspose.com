---
title: Class InterSyncResponse
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Ofx.InterTransfer.InterSyncResponse クラス. 銀行間トランザクション同期応答クラス.
type: docs
weight: 2470
url: /ja/net/aspose.finance.ofx.intertransfer/intersyncresponse/
---
## InterSyncResponse class

銀行間トランザクション同期応答クラス.

```csharp
public class InterSyncResponse : AbstractSyncResponse
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [InterSyncResponse](intersyncresponse/)() | の新しいインスタンスを初期化します`InterSyncResponse`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.intertransfer/intersyncresponse/accountfrom/) { get; set; } | の from を取得または設定します[`BankAccount`](../../aspose.finance.ofx/bankaccount/)また[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/)また[`LoanAccount`](../../aspose.finance.ofx/loanaccount/). |
| [InterTransactionResponses](../../aspose.finance.ofx.intertransfer/intersyncresponse/intertransactionresponses/) { get; set; } | のコレクションを取得または設定します[`InterTransactionResponse`](../intertransactionresponse/). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | 同期要求のトークンがサーバーの履歴テーブルの最初のエントリよりも古い場合ははい。この場合、いくつかの応答が失われています。 同期要求のトークンがサーバーの履歴テーブル. |
| [OfxExtension](../../aspose.finance.ofx.intertransfer/intersyncresponse/ofxextension/) { get; set; } | を取得または設定します[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | 新しい同期トークンを取得または設定します。 |

### 関連項目

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* 名前空間 [Aspose.Finance.Ofx.InterTransfer](../../aspose.finance.ofx.intertransfer/)
* 組み立て [Aspose.Finance](../../)



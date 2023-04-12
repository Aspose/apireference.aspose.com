---
title: Class IntraSyncResponse
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Ofx.Bank.IntraSyncResponse クラス. 銀行内トランザクション同期応答クラス.
type: docs
weight: 500
url: /ja/net/aspose.finance.ofx.bank/intrasyncresponse/
---
## IntraSyncResponse class

銀行内トランザクション同期応答クラス.

```csharp
public class IntraSyncResponse : AbstractSyncResponse
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [IntraSyncResponse](intrasyncresponse/)() | の新しいインスタンスを初期化します`IntraSyncResponse`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AccountFrom](../../aspose.finance.ofx.bank/intrasyncresponse/accountfrom/) { get; set; } | の from を取得または設定します[`BankAccount`](../../aspose.finance.ofx/bankaccount/)また[`CreditCardAccount`](../../aspose.finance.ofx/creditcardaccount/)また[`LoanAccount`](../../aspose.finance.ofx/loanaccount/). |
| [IntraTransactionResponses](../../aspose.finance.ofx.bank/intrasyncresponse/intratransactionresponses/) { get; set; } | のコレクションを取得または設定します[`IntraTransactionResponse`](../intratransactionresponse/). |
| [LostSynchronization](../../aspose.finance.ofx/abstractsyncresponse/lostsynchronization/) { get; set; } | 同期要求のトークンがサーバーの履歴テーブルの最初のエントリよりも古い場合ははい。この場合、いくつかの応答が失われています。 同期要求のトークンがサーバーの履歴テーブル. |
| [OfxExtension](../../aspose.finance.ofx.bank/intrasyncresponse/ofxextension/) { get; set; } | を取得または設定します[`OfxExtensionType`](../../aspose.finance.ofx/ofxextensiontype/). |
| [Token](../../aspose.finance.ofx/abstractsyncresponse/token/) { get; set; } | 新しい同期トークンを取得または設定します。 |

### 関連項目

* class [AbstractSyncResponse](../../aspose.finance.ofx/abstractsyncresponse/)
* 名前空間 [Aspose.Finance.Ofx.Bank](../../aspose.finance.ofx.bank/)
* 組み立て [Aspose.Finance](../../)



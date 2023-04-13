---
title: Class StatementTransaction
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Ofx.StatementTransaction クラス. このクラスは単一のトランザクションを記述しますトランザクションのタイプとそれが転記された日付を識別しますこのクラスは顧客がトランザクションを認識するのに役立つ追加情報 小切手番号受取人名およびメモ も提供できますトランザクションにはクライアントがトランザクションを分類するために使用できる標準産業コードを含めることができます.
type: docs
weight: 5730
url: /ja/net/aspose.finance.ofx/statementtransaction/
---
## StatementTransaction class

このクラスは、単一のトランザクションを記述します。トランザクションのタイプとそれが転記された日付を識別します。このクラスは、顧客がトランザクションを認識するのに役立つ追加情報 (小切手番号、受取人名、およびメモ) も提供できます。トランザクションには、クライアントがトランザクションを分類するために使用できる標準産業コードを含めることができます.

```csharp
public class StatementTransaction
```

## コンストラクター

| 名前 | 説明 |
| --- | --- |
| [StatementTransaction](statementtransaction/)() | の新しいインスタンスを初期化します`StatementTransaction`class. |

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [AccountTo](../../aspose.finance.ofx/statementtransaction/accountto/) { get; set; } | アカウントを取得または設定します。[`BankAccount`](../bankaccount/)また[`CreditCardAccount`](../creditcardaccount/). |
| [AvailableDate](../../aspose.finance.ofx/statementtransaction/availabledate/) { get; set; } | 資金が利用可能になる日付 (起算日) を取得または設定します。 |
| [CheckNumber](../../aspose.finance.ofx/statementtransaction/checknumber/) { get; set; } | チェック番号を取得または設定します。 |
| [CorrectFinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/correctfinancialinstitutiontransactionid/) { get; set; } | 修正されたトランザクション ID を取得または設定します。存在する場合は、このレコードによって修正された、以前に送信されたトランザクションの FinancialInstitutionTransactionId. |
| [CorrectiveAction](../../aspose.finance.ofx/statementtransaction/correctiveaction/) { get; set; } | 修正アクションを取得または設定します。 |
| [Currency](../../aspose.finance.ofx/statementtransaction/currency/) { get; set; } | を取得または設定します[`Currency`](./currency/). |
| [ExtendedName](../../aspose.finance.ofx/statementtransaction/extendedname/) { get; set; } | 受取人の拡張名またはトランザクションの説明を取得または設定します。 |
| [FinancialInstitutionTransactionId](../../aspose.finance.ofx/statementtransaction/financialinstitutiontransactionid/) { get; set; } | 金融機関発行のトランザクション ID を取得または設定します。 |
| [ImageDatas](../../aspose.finance.ofx/statementtransaction/imagedatas/) { get; set; } | のコレクションを取得または設定します[`ImageData`](../imagedata/). |
| [Investment401kSource](../../aspose.finance.ofx/statementtransaction/investment401ksource/) { get; set; } | この取引の資金源を取得または設定します。 |
| [Memo](../../aspose.finance.ofx/statementtransaction/memo/) { get; set; } | 追加情報を取得または設定します。 |
| [Name](../../aspose.finance.ofx/statementtransaction/name/) { get; set; } | 受取人の名前またはトランザクションの説明を取得または設定します。 |
| [OriginCurrency](../../aspose.finance.ofx/statementtransaction/origincurrency/) { get; set; } | Origin を取得または設定します[`Currency`](./currency/). |
| [Payee](../../aspose.finance.ofx/statementtransaction/payee/) { get; set; } | を取得または設定します[`Payee`](./payee/). |
| [PayeeId](../../aspose.finance.ofx/statementtransaction/payeeid/) { get; set; } | 利用可能な場合、受取人識別子を取得または設定します. |
| [PostedDate](../../aspose.finance.ofx/statementtransaction/posteddate/) { get; set; } | トランザクションがアカウントに転記された日付を取得または設定します。 |
| [ReferenceNumber](../../aspose.finance.ofx/statementtransaction/referencenumber/) { get; set; } | トランザクションを一意に識別する参照番号を取得または設定します。 |
| [ServerTransactionId](../../aspose.finance.ofx/statementtransaction/servertransactionid/) { get; set; } | サーバーが割り当てたトランザクション ID を取得または設定します。 |
| [StandardIndustrialCode](../../aspose.finance.ofx/statementtransaction/standardindustrialcode/) { get; set; } | 標準産業コードを取得または設定します。 |
| [TransactionAmount](../../aspose.finance.ofx/statementtransaction/transactionamount/) { get; set; } | トランザクションの金額を取得または設定します。 |
| [TransactionType](../../aspose.finance.ofx/statementtransaction/transactiontype/) { get; set; } | トランザクション タイプを取得または設定します。 |
| [UserDate](../../aspose.finance.ofx/statementtransaction/userdate/) { get; set; } | 既知の場合、ユーザーがトランザクションを開始した日付を取得または設定します。 |

### 関連項目

* 名前空間 [Aspose.Finance.Ofx](../../aspose.finance.ofx/)
* 組み立て [Aspose.Finance](../../)



---
title: Enum BillStatusCodeEnum
second_title: Aspose.Finance for .NET API リファレンス
description: Aspose.Finance.Ofx.BillerDelivery.BillStatusCodeEnum 列挙. 請求ステータス コード enum.
type: docs
weight: 1470
url: /ja/net/aspose.finance.ofx.billerdelivery/billstatuscodeenum/
---
## BillStatusCodeEnum enumeration

請求ステータス コード enum.

```csharp
public enum BillStatusCodeEnum
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| WITHDRAWN | `0` | ビラーまたはパブリッシャーは、この請求書が表示されることを望んでいません. |
| UNDELIVERABLE | `1` | この請求書を消費者にタイムリーに配信する試みは失敗しました。このステータスは、消費者に請求書を提示 する場合、通常は使用されません。ただし、このステータスを使用した通知は、多くの有用なケースをカバーしています. |
| NEW | `2` | サーバーは、請求書をクライアントにもクライアント プロキシにも送信していません。請求書の初期ステータス コードです。 |
| DELIVERED | `3` | サーバーは請求書をクライアントまたはクライアント プロキシに送信しました。 |
| VIEWED | `4` | 顧客は請求書を見ました。 DELIVERED. の以前のステータスを意味します。 |
| RETIRED | `5` | 顧客はこの請求書をもう見たくありません。 DELIVERED. の以前のステータスを意味します。 |

### 関連項目

* 名前空間 [Aspose.Finance.Ofx.BillerDelivery](../../aspose.finance.ofx.billerdelivery/)
* 組み立て [Aspose.Finance](../../)



---
title: Class Location
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Window.Location クラス. Location オブジェクトはDocument のブラウジング コンテキストのアクティブなドキュメントのアドレスの表現を提供し履歴オブジェクトのエントリを追加または置換することによってブラウジング コンテキストのセッション履歴の現在のエントリを変更できるようにします
type: docs
weight: 3850
url: /ja/net/aspose.svg.window/location/
---
## Location class

Location オブジェクトは、Document のブラウジング コンテキストのアクティブなドキュメントのアドレスの表現を提供し、履歴オブジェクトのエントリを追加または置換することによって、ブラウジング コンテキストのセッション履歴の現在のエントリを変更できるようにします。

```csharp
public sealed class Location : Url
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Hash](../../aspose.svg/url/hash/) { get; set; } | 指定された URL ハッシュ セグメントの文字列表現を取得または設定します。 |
| [Host](../../aspose.svg/url/host/) { get; set; } | 指定された URL ホストの文字列表現を取得または設定します。 |
| [Hostname](../../aspose.svg/url/hostname/) { get; set; } | 指定された URL ホスト名の文字列表現を取得または設定します。 |
| [Href](../../aspose.svg/url/href/) { get; set; } | 指定された URL インスタンスのシリアル化された表現を取得または設定します。 |
| [Origin](../../aspose.svg/url/origin/) { get; } | 指定された URL オリジンの文字列表現を取得します。 |
| [Password](../../aspose.svg/url/password/) { get; set; } | 指定された URL パスワードの文字列表現を取得または設定します。 |
| [Pathname](../../aspose.svg/url/pathname/) { get; set; } | 指定された URL パスの文字列表現を取得または設定します。 |
| [Port](../../aspose.svg/url/port/) { get; set; } | 指定された URL ポートの文字列表現を取得または設定します。 |
| [Protocol](../../aspose.svg/url/protocol/) { get; set; } | 指定された URL スキーマの文字列表現を取得または設定します。 |
| [Search](../../aspose.svg/url/search/) { get; set; } | 指定された URL 検索セグメントの文字列表現を取得または設定します。 |
| [SearchParams](../../aspose.svg/url/searchparams/) { get; } | 関連を取得します[`IUrlSearchParams`](../../aspose.svg/iurlsearchparams/)object. |
| [Username](../../aspose.svg/url/username/) { get; set; } | 指定された URL ユーザー名の文字列表現を取得または設定します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Assign](../../aspose.svg.window/location/assign/)(string) | 指定されたページに移動します。 |
| override [Equals](../../aspose.svg/url/equals/)(object) | 指定されたObject 、このインスタンスと等しい. |
| override [GetHashCode](../../aspose.svg/url/gethashcode/)() | このインスタンスのハッシュ コードを返します。 |
| virtual [GetPlatformType](../../aspose.svg.dom/domobject/getplatformtype/)() | このメソッドは、ECMAScript オブジェクトを取得するために使用されますType . |
| [Reload](../../aspose.svg.window/location/reload/)() | 現在のページをリロードします。 |
| [Replace](../../aspose.svg.window/location/replace/)(string) | セッション履歴から現在のページを削除し、指定されたページに移動します。 |
| [ToJson](../../aspose.svg/url/tojson/)() | を返しますStringこのインスタンスを表す. |
| override [ToString](../../aspose.svg/url/tostring/)() | を返しますStringこのインスタンスを表す. |

### 関連項目

* class [Url](../../aspose.svg/url/)
* 名前空間 [Aspose.Svg.Window](../../aspose.svg.window/)
* 組み立て [Aspose.SVG](../../)



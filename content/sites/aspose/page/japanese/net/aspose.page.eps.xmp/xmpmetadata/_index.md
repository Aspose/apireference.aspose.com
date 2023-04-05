---
title: Class XmpMetadata
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.EPS.XMP.XmpMetadata クラス. XMP メタデータ ストリームへのアクセスを提供します
type: docs
weight: 190
url: /ja/net/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class

XMP メタデータ ストリームへのアクセスを提供します。

```csharp
public sealed class XmpMetadata : IDictionary<string, XmpValue>
```

## プロパティ

| 名前 | 説明 |
| --- | --- |
| [Count](../../aspose.page.eps.xmp/xmpmetadata/count/) { get; } | コレクション内の要素数を取得します。 |
| [IsFixedSize](../../aspose.page.eps.xmp/xmpmetadata/isfixedsize/) { get; } | コレクションが固定サイズかどうかをチェックします。 |
| [IsReadOnly](../../aspose.page.eps.xmp/xmpmetadata/isreadonly/) { get; } | コレクションが読み取り専用かどうかを確認します。 |
| [IsSynchronized](../../aspose.page.eps.xmp/xmpmetadata/issynchronized/) { get; } | コレクションが同期されているかどうかを確認します。 |
| [Item](../../aspose.page.eps.xmp/xmpmetadata/item/) { get; set; } | メタデータからデータを取得または設定します。 |
| [Keys](../../aspose.page.eps.xmp/xmpmetadata/keys/) { get; } | メタデータ キーのコレクションを取得します。 |
| [NamespaceManager](../../aspose.page.eps.xmp/xmpmetadata/namespacemanager/) { get; } | 名前空間マネージャーを取得します。 |
| [SyncRoot](../../aspose.page.eps.xmp/xmpmetadata/syncroot/) { get; } | コレクション同期オブジェクトを取得します。 |
| [Values](../../aspose.page.eps.xmp/xmpmetadata/values/) { get; } | メタデータの値を取得します。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add)(KeyValuePair&lt;string, XmpValue&gt;) | キーと値のペアをディクショナリに追加します。 |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_2)(string, object) | メタデータに値を追加します。 |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_1)(string, XmpValue) | メタデータに値を追加します。 |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem)(string, XmpValue) | 配列に値を追加します。値は配列の最後に追加されます. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem_1)(string, int, XmpValue) | 指定されたインデックスで配列に値を追加します。 |
| [AddNamedValue](../../aspose.page.eps.xmp/xmpmetadata/addnamedvalue/)(string, string, XmpValue) | 名前付きの値を構造体に追加します。 |
| [Clear](../../aspose.page.eps.xmp/xmpmetadata/clear/)() | メタデータをクリアします。 |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains)(KeyValuePair&lt;string, XmpValue&gt;) | 指定されたキーと値のペアが辞書に含まれているかどうかをチェックします。 |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains_1)(string) | キーがメタデータに含まれているかどうかをチェックします。 |
| [ContainsKey](../../aspose.page.eps.xmp/xmpmetadata/containskey/)(string) | このディクショナリが指定されたキーを含むかどうかを決定します. |
| [CopyTo](../../aspose.page.eps.xmp/xmpmetadata/copyto/)(KeyValuePair&lt;string, XmpValue&gt;[], int) | コレクションの要素を配列にコピーします。 |
| [GetEnumerator](../../aspose.page.eps.xmp/xmpmetadata/getenumerator/)() | 辞書列挙子を返します。 |
| [GetNamespaceUriByPrefix](../../aspose.page.eps.xmp/xmpmetadata/getnamespaceuribyprefix/)(string) | プレフィックスで名前空間 URI を返します。 |
| [GetPrefixByNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/getprefixbynamespaceuri/)(string) | 名前空間 URI によってプレフィックスを返します。 |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri)(string, string) | 名前空間 URI を登録します。 |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri_1)(string, string, string) | 名前空間 URI を登録します。 |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove)(KeyValuePair&lt;string, XmpValue&gt;) | コレクションからキーと値のペアを削除します。 |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove_1)(string) | メタデータからエントリを削除します。 |
| [SetArrayItem](../../aspose.page.eps.xmp/xmpmetadata/setarrayitem/)(string, int, XmpValue) | 配列に値を設定します。以前の値は新しい値に置き換えられます. |
| [SetNamedValue](../../aspose.page.eps.xmp/xmpmetadata/setnamedvalue/)(string, string, XmpValue) | 名前付きの値を構造体に設定します。以前の名前付きの値が既に存在する場合は、新しい値に置き換えられます. |
| [TryGetValue](../../aspose.page.eps.xmp/xmpmetadata/trygetvalue/)(string, out XmpValue) | ディクショナリでキーを見つけようとし、見つかった場合は値を取得します. |

### 関連項目

* class [XmpValue](../xmpvalue/)
* 名前空間 [Aspose.Page.EPS.XMP](../../aspose.page.eps.xmp/)
* 組み立て [Aspose.Page](../../)



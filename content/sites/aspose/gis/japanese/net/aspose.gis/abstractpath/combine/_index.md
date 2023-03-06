---
title: AbstractPath.Combine
second_title: Aspose.GIS for .NET API リファレンス
description: AbstractPath 方法. これを組み合わせるAbstractPath指定されたパス コンポーネントで.
type: docs
weight: 50
url: /ja/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

これを組み合わせる[`AbstractPath`](../)指定されたパス コンポーネントで.

```csharp
public virtual AbstractPath Combine(string location)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| location | String | これに追加するパス コンポーネント[`AbstractPath`](../). |

### 戻り値

新しい[`AbstractPath`](../)を指している[`Location`](../location/)これは、この場所の組み合わせです[`AbstractPath`](../)and 引数.

### 備考

通常、このメソッドは継承者によってオーバーライドされるべきではありません。デフォルトの implementation はこれを連結します[`Location`](../location/)引数を使用して、[`WithLocation`](../withlocation/)連結された文字列を引数とする メソッド。 結合結果は次のように定義されます: 引数が[`Separator`](../separator/)、組み合わせの結果は引数に等しくなります。そうでなければ、もし[`Location`](../location/)で終わる[`Separator`](../separator/), 組み合わせ結果は` +`;それ以外の場合、結果は次のようになります。` + +`

### 関連項目

* class [AbstractPath](../)
* 名前空間 [Aspose.Gis](../../abstractpath/)
* 組み立て [Aspose.GIS](../../../)



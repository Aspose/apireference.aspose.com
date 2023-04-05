---
title: XpsDocument.CreatePathFigure
second_title: Aspose.Page for .NET API リファレンス
description: XpsDocument 方法. 新しいパス図形を作成します
type: docs
weight: 280
url: /ja/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

新しいパス図形を作成します。

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| startPoint | PointF | パス図の最初のセグメントの開始点。 |
| isClosed | Boolean | パスが閉じているかどうかを指定します。 true に設定すると、ストロークは 「閉じた」状態で描画されます。つまり、パス図の最後のセグメントの最後の点が StartPoint 属性で指定された点に接続されます。それ以外の場合、ストロークは「開いた」状態で描画され、 最後のポイントが開始ポイントに接続されていません。ストロークを指定する {Path} 要素でパス図 is が使用されている場合にのみ適用されます。 |

### 戻り値

新しいパス図。

### 関連項目

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* 名前空間 [Aspose.Page.XPS](../../xpsdocument/)
* 組み立て [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

新しいパス図形を作成します。

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| startPoint | PointF | パス図の最初のセグメントの開始点。 |
| segments | List`1 | パス セグメントのリスト。 |
| isClosed | Boolean | パスが閉じているかどうかを指定します。 true に設定すると、ストロークは 「閉じた」状態で描画されます。つまり、パス図の最後のセグメントの最後の点が StartPoint 属性で指定された点に接続されます。それ以外の場合、ストロークは「開いた」状態で描画され、 最後のポイントが開始ポイントに接続されていません。ストロークを指定する {Path} 要素でパス図 is が使用されている場合にのみ適用されます。 |

### 戻り値

新しいパス図。

### 関連項目

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* 名前空間 [Aspose.Page.XPS](../../xpsdocument/)
* 組み立て [Aspose.Page](../../../)



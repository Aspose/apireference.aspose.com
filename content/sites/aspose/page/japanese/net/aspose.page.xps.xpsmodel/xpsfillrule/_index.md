---
title: Enum XpsFillRule
second_title: Aspose.Page for .NET API リファレンス
description: Aspose.Page.XPS.XpsModel.XpsFillRule 列挙. PathGeometry 要素の FillRule プロパティの有効な値
type: docs
weight: 3080
url: /ja/net/aspose.page.xps.xpsmodel/xpsfillrule/
---
## XpsFillRule enumeration

PathGeometry 要素の FillRule プロパティの有効な値。

```csharp
public enum XpsFillRule
```

### 値

| 名前 | 価値 | 説明 |
| --- | --- | --- |
| EvenOdd | `0` | このルールは、ポイントから任意の方向の無限遠まで ray を描画し、レイが交差する指定された形状からの segment の数をカウントすることによって、キャンバス上のポイントの「内側」を決定します。この数が奇数の場合、ポイントは 内にあります。偶数の場合、ポイントは外側にあります. |
| NonZero | `1` | このルールは、点から任意の方向の無限遠まで ray を描画し、形状のセグメントが線と交差する 場所を調べることによって、キャンバス上の点の「内側」を決定します。カウント 0 から始めて、セグメントがレイを左から右に横切るたびに one を加算し、パス セグメントがレイを右から左に横切るたびに 1 を減算します。交差点を数えた後、 結果がゼロの場合、ポイントはパスの外側にあります。それ以外の場合は、内側です。 |

### 関連項目

* 名前空間 [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* 組み立て [Aspose.Page](../../)



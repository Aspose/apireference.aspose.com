---
title: XpsDocument.CreateArcSegment
second_title: Aspose.Page for .NET API リファレンス
description: XpsDocument 方法. 新しい楕円弧セグメントを作成します
type: docs
weight: 160
url: /ja/net/aspose.page.xps/xpsdocument/createarcsegment/
---
## XpsDocument.CreateArcSegment method

新しい楕円弧セグメントを作成します。

```csharp
public XpsArcSegment CreateArcSegment(PointF point, SizeF size, float rotationAngle, 
    bool isLargeArc, XpsSweepDirection sweepDirection, bool isStroked = true)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| point | PointF | 楕円弧の終点。 |
| size | SizeF | x、y ペアとしての楕円弧の x および y 半径。 |
| rotationAngle | Single | 現在の座標系を基準にして楕円をどのように回転させるかを示します。 |
| isLargeArc | Boolean | 円弧が 180 以上のスイープで描かれるかどうかを決定します。 |
| sweepDirection | XpsSweepDirection | 円弧が描かれる方向。 |
| isStroked | Boolean | パスのこのセグメントのストロークを描画するかどうかを指定します。 |

### 戻り値

新しい楕円弧セグメント。

### 関連項目

* class [XpsArcSegment](../../../aspose.page.xps.xpsmodel/xpsarcsegment/)
* enum [XpsSweepDirection](../../../aspose.page.xps.xpsmodel/xpssweepdirection/)
* class [XpsDocument](../)
* 名前空間 [Aspose.Page.XPS](../../xpsdocument/)
* 組み立て [Aspose.Page](../../../)



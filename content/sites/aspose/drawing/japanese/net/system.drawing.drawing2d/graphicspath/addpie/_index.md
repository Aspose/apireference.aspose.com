---
title: GraphicsPath.AddPie
second_title: Aspose.Drawing for .NET API リファレンス
description: GraphicsPath 方法. パイの輪郭をこのパスに追加します
type: docs
weight: 160
url: /ja/net/system.drawing.drawing2d/graphicspath/addpie/
---
## AddPie(Rectangle, float, float) {#addpie_1}

パイの輪郭をこのパスに追加します。

```csharp
public void AddPie(Rectangle rect, float startAngle, float sweepAngle)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| rect | Rectangle | 円グラフの描画元となる楕円を定義する外接する四角形を表す Rectangle。 |
| startAngle | Single | 軸から時計回りに度単位で測定された円グラフの開始角度。 |
| sweepAngle | Single | startAngle から時計回りに度数で測定された、startAngle とパイ セクションの終了点との間の角度。 |

### 関連項目

* struct [Rectangle](../../../system.drawing/rectangle/)
* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)

---

## AddPie(float, float, float, float, float, float) {#addpie}

パイの輪郭をこのパスに追加します。

```csharp
public void AddPie(float x, float y, float width, float height, float startAngle, float sweepAngle)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| x | Single | 円グラフの描画元となる楕円を定義する、外接するrectangle の左上隅の x 座標。 |
| y | Single | 円グラフの描画元となる楕円を定義する、外接する四角形 の左上隅の y 座標。 |
| width | Single | 円グラフが描画される ellipse を定義する外接する四角形の幅。 |
| height | Single | 円グラフが描画される ellipse を定義する外接する四角形の高さ。 |
| startAngle | Single | パイセクションの開始角度 は、x 軸から時計回りに度単位で測定されます。 |
| sweepAngle | Single | startAngle と円グラフの端点との間の角度 は、startAngle から時計回りに度単位で測定されます。 |

### 関連項目

* class [GraphicsPath](../)
* 名前空間 [System.Drawing.Drawing2D](../../graphicspath/)
* 組み立て [Aspose.Drawing](../../../)



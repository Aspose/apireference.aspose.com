---
title: SvgRenderer.Render
second_title: Aspose.SVG for .NET API リファレンス
description: SvgRenderer 方法. 複数をレンダリングする方法を定義しますSVGDocument具体的にIDevice .
type: docs
weight: 20
url: /ja/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

複数をレンダリングする方法を定義します[`SVGDocument`](../../../aspose.svg/svgdocument/)具体的に[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | IDevice | 出力デバイス。 |
| timeout | TimeSpan | あTimeSpan待機するミリ秒数を表す、またはTimeSpanこれは、無期限に待機する -1 ミリ秒を表します。 |
| documents | SVGDocument[] | レンダリングするドキュメント。 |

### 関連項目

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* 名前空間 [Aspose.Svg.Rendering](../../svgrenderer/)
* 組み立て [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

複数をレンダリングする方法を定義します[`SVGDocument`](../../../aspose.svg/svgdocument/)特定の[`IDevice`](../../idevice/)、キャンセル トークンを使用して操作のキャンセルを要求します。

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | IDevice | 出力デバイス。 |
| cancellationToken | CancellationToken | タスクが完了するのを待っている間に監視するキャンセル トークン。 |
| documents | SVGDocument[] | レンダリングするドキュメント。 |

### 関連項目

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* 名前空間 [Aspose.Svg.Rendering](../../svgrenderer/)
* 組み立て [Aspose.SVG](../../../)



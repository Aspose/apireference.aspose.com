---
title: Class RendererTDocument
second_title: Aspose.SVG for .NET API リファレンス
description: Aspose.Svg.Rendering.Renderer1TDocument クラス. すべてのレンダラーの抽象クラスを表します.
type: docs
weight: 3000
url: /ja/net/aspose.svg.rendering/renderer-1/
---
## Renderer&lt;TDocument&gt; class

すべてのレンダラーの抽象クラスを表します.

```csharp
public abstract class Renderer<TDocument> : Renderer
```

| パラメータ | 説明 |
| --- | --- |
| TDocument | ドキュメントのタイプ。 |

## メソッド

| 名前 | 説明 |
| --- | --- |
| [Dispose](../../aspose.svg.rendering/renderer/dispose/)() | 管理されていないリソースと、オプションで管理されているリソースを解放します。 |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_3)(IDevice, TDocument) | レンダリングの方法を定義します!:TDocument指定された[`IDevice`](../idevice/) . |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_6)(IDevice, params TDocument[]) | 複数をレンダリングする方法を定義します!:TDocument具体的に[`IDevice`](../idevice/) . |
| abstract [Render](../../aspose.svg.rendering/renderer-1/render/#render_1)(IDevice, CancellationToken, params TDocument[]) | 複数をレンダリングする方法を定義します!:TDocument特定の[`IDevice`](../idevice/)、キャンセル トークンを使用して操作のキャンセルを要求します。 |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render)(IDevice, int, params TDocument[]) | 複数をレンダリングする方法を定義します!:TDocument具体的に[`IDevice`](../idevice/) . |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_4)(IDevice, TDocument, int) | レンダリングの方法を定義します!:TDocument指定された[`IDevice`](../idevice/) . |
| [Render](../../aspose.svg.rendering/renderer-1/render/#render_5)(IDevice, TDocument, TimeSpan) | レンダリングの方法を定義します!:TDocument指定された[`IDevice`](../idevice/) . |
| abstract [Render](../../aspose.svg.rendering/renderer-1/render/#render_2)(IDevice, TimeSpan, params TDocument[]) | 複数をレンダリングする方法を定義します!:TDocument具体的に[`IDevice`](../idevice/) . |

### 関連項目

* class [Renderer](../renderer/)
* 名前空間 [Aspose.Svg.Rendering](../../aspose.svg.rendering/)
* 組み立て [Aspose.SVG](../../)



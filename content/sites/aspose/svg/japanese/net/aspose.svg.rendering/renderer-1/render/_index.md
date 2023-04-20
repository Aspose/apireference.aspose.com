---
title: Renderer1.Render
second_title: Aspose.SVG for .NET API リファレンス
description: Renderer 方法. レンダリングの方法を定義しますTDocument指定されたIDevice .
type: docs
weight: 10
url: /ja/net/aspose.svg.rendering/renderer-1/render/
---
## Render(IDevice, TDocument) {#render_3}

レンダリングの方法を定義します!:TDocument指定された[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, TDocument document)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | IDevice | 出力デバイス。 |
| document | TDocument | ドキュメント。 |

### 関連項目

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 名前空間 [Aspose.Svg.Rendering](../../renderer-1/)
* 組み立て [Aspose.SVG](../../../)

---

## Render(IDevice, TDocument, TimeSpan) {#render_5}

レンダリングの方法を定義します!:TDocument指定された[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, TDocument document, TimeSpan timeout)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | IDevice | 出力デバイス。 |
| document | TDocument | ドキュメント。 |
| timeout | TimeSpan | あTimeSpan待機するミリ秒数を表す、またはTimeSpanこれは、無期限に待機する -1 ミリ秒を表します。 |

### 関連項目

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 名前空間 [Aspose.Svg.Rendering](../../renderer-1/)
* 組み立て [Aspose.SVG](../../../)

---

## Render(IDevice, TDocument, int) {#render_4}

レンダリングの方法を定義します!:TDocument指定された[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, TDocument document, int timeout)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | IDevice | 出力デバイス。 |
| document | TDocument | ドキュメント。 |
| timeout | Int32 | 待機するミリ秒数を表すミリ秒数、または無期限に待機する -1 ミリ秒。 |

### 関連項目

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 名前空間 [Aspose.Svg.Rendering](../../renderer-1/)
* 組み立て [Aspose.SVG](../../../)

---

## Render(IDevice, params TDocument[]) {#render_6}

複数をレンダリングする方法を定義します!:TDocument具体的に[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, params TDocument[] documents)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | IDevice | 出力デバイス。 |
| documents | TDocument[] | レンダリングするドキュメント。 |

### 関連項目

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 名前空間 [Aspose.Svg.Rendering](../../renderer-1/)
* 組み立て [Aspose.SVG](../../../)

---

## Render(IDevice, int, params TDocument[]) {#render}

複数をレンダリングする方法を定義します!:TDocument具体的に[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, int timeout, params TDocument[] documents)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | IDevice | 出力デバイス。 |
| timeout | Int32 | 待機するミリ秒数を表すミリ秒数、または無期限に待機する -1 ミリ秒。 |
| documents | TDocument[] | レンダリングするドキュメント。 |

### 関連項目

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 名前空間 [Aspose.Svg.Rendering](../../renderer-1/)
* 組み立て [Aspose.SVG](../../../)

---

## Render(IDevice, TimeSpan, params TDocument[]) {#render_2}

複数をレンダリングする方法を定義します!:TDocument具体的に[`IDevice`](../../idevice/) .

```csharp
public abstract void Render(IDevice device, TimeSpan timeout, params TDocument[] documents)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | IDevice | 出力デバイス。 |
| timeout | TimeSpan | あTimeSpan待機するミリ秒数を表す、またはTimeSpanこれは、無期限に待機する -1 ミリ秒を表します。 |
| documents | TDocument[] | レンダリングするドキュメント。 |

### 関連項目

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 名前空間 [Aspose.Svg.Rendering](../../renderer-1/)
* 組み立て [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params TDocument[]) {#render_1}

複数をレンダリングする方法を定義します!:TDocument特定の[`IDevice`](../../idevice/)、キャンセル トークンを使用して操作のキャンセルを要求します。

```csharp
public abstract void Render(IDevice device, CancellationToken cancellationToken, 
    params TDocument[] documents)
```

| パラメータ | タイプ | 説明 |
| --- | --- | --- |
| device | IDevice | 出力デバイス。 |
| cancellationToken | CancellationToken | あCancellationTokenタスクが完了するのを待っている間に観察します。 |
| documents | TDocument[] | レンダリングするドキュメント。 |

### 関連項目

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 名前空間 [Aspose.Svg.Rendering](../../renderer-1/)
* 組み立て [Aspose.SVG](../../../)



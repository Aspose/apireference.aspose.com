---
title: Renderer-1.Render
second_title: Aspose.SVG for .NET API Reference
description: Renderer method. Defines method for rendering TDocument into specified IDevice
type: docs
weight: 10
url: /net/aspose.svg.rendering/renderer-1/render/
---
## Render(IDevice, TDocument) {#render_3}

Defines method for rendering !:TDocument into specified [`IDevice`](../../idevice/).

```csharp
public void Render(IDevice device, TDocument document)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The output device. |
| document | TDocument | The document. |

### See Also

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* namespace [Aspose.Svg.Rendering](../../renderer-1/)
* assembly [Aspose.SVG](../../../)

---

## Render(IDevice, TDocument, TimeSpan) {#render_5}

Defines method for rendering !:TDocument into specified [`IDevice`](../../idevice/).

```csharp
public void Render(IDevice device, TDocument document, TimeSpan timeout)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The output device. |
| document | TDocument | The document. |
| timeout | TimeSpan | A TimeSpan that represents the number of milliseconds to wait, or a TimeSpan that represents -1 millisecond to wait indefinitely. |

### See Also

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* namespace [Aspose.Svg.Rendering](../../renderer-1/)
* assembly [Aspose.SVG](../../../)

---

## Render(IDevice, TDocument, int) {#render_4}

Defines method for rendering !:TDocument into specified [`IDevice`](../../idevice/).

```csharp
public void Render(IDevice device, TDocument document, int timeout)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The output device. |
| document | TDocument | The document. |
| timeout | Int32 | A number of milliseconds that represents the number of milliseconds to wait, or -1 millisecond to wait indefinitely. |

### See Also

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* namespace [Aspose.Svg.Rendering](../../renderer-1/)
* assembly [Aspose.SVG](../../../)

---

## Render(IDevice, params TDocument[]) {#render_6}

Defines method for rendering multiple !:TDocuments into specific [`IDevice`](../../idevice/).

```csharp
public void Render(IDevice device, params TDocument[] documents)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The output device. |
| documents | TDocument[] | The documents to render. |

### See Also

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* namespace [Aspose.Svg.Rendering](../../renderer-1/)
* assembly [Aspose.SVG](../../../)

---

## Render(IDevice, int, params TDocument[]) {#render}

Defines method for rendering multiple !:TDocuments into specific [`IDevice`](../../idevice/).

```csharp
public void Render(IDevice device, int timeout, params TDocument[] documents)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The output device. |
| timeout | Int32 | A number of milliseconds that represents the number of milliseconds to wait, or -1 millisecond to wait indefinitely. |
| documents | TDocument[] | The documents to render. |

### See Also

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* namespace [Aspose.Svg.Rendering](../../renderer-1/)
* assembly [Aspose.SVG](../../../)

---

## Render(IDevice, TimeSpan, params TDocument[]) {#render_2}

Defines method for rendering multiple !:TDocuments into specific [`IDevice`](../../idevice/).

```csharp
public abstract void Render(IDevice device, TimeSpan timeout, params TDocument[] documents)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The output device. |
| timeout | TimeSpan | A TimeSpan that represents the number of milliseconds to wait, or a TimeSpan that represents -1 millisecond to wait indefinitely. |
| documents | TDocument[] | The documents to render. |

### See Also

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* namespace [Aspose.Svg.Rendering](../../renderer-1/)
* assembly [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params TDocument[]) {#render_1}

Defines a method for rendering multiple !:TDocuments into a specific [`IDevice`](../../idevice/), using a cancellation token to request cancellation of the operation.

```csharp
public abstract void Render(IDevice device, CancellationToken cancellationToken, 
    params TDocument[] documents)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The output device. |
| cancellationToken | CancellationToken | A CancellationToken to observe while waiting for the task to complete. |
| documents | TDocument[] | The documents to render. |

### See Also

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* namespace [Aspose.Svg.Rendering](../../renderer-1/)
* assembly [Aspose.SVG](../../../)

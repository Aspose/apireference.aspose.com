---
title: MhtmlRenderer.Render
second_title: Aspose.HTML for .NET API Reference
description: MhtmlRenderer Render method. Renders multiple MHTML documents into specified IDevice
type: docs
weight: 20
url: /net/aspose.html.rendering/mhtmlrenderer/render/
---
## Render(*[IDevice](../../idevice/), TimeSpan, params Stream[]*) {#render_10}

Renders multiple MHTML documents into specified [`IDevice`](../../idevice/).

```csharp
public override void Render(IDevice device, TimeSpan timeout, params Stream[] sources)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The device. |
| timeout | TimeSpan | A TimeSpan that represents the number of milliseconds to wait, or a TimeSpan that represents -1 millisecond to wait indefinitely. |
| sources | Stream[] | The MHTML documents to render. |

### See Also

* interface [IDevice](../../idevice/)
* class [MhtmlRenderer](../)
* namespace [Aspose.Html.Rendering](../../../aspose.html.rendering/)
* assembly [Aspose.HTML](../../../)

---

## Render(*[IDevice](../../idevice/), CancellationToken, params Stream[]*) {#render_9}

Defines a method for rendering multiple MHTML documents into a specific [`IDevice`](../../idevice/), using a cancellation token to request cancellation of the operation.

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params Stream[] sources)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The output device. |
| cancellationToken | CancellationToken | A CancellationToken to observe while waiting for the task to complete. |
| sources | Stream[] | The MHTML documents to render. |

### See Also

* interface [IDevice](../../idevice/)
* class [MhtmlRenderer](../)
* namespace [Aspose.Html.Rendering](../../../aspose.html.rendering/)
* assembly [Aspose.HTML](../../../)

---

## Render(*[IDevice](../../idevice/), Stream, [Configuration](../../../aspose.html/configuration/)*) {#render_4}

Renders MHTML document into specified [`IDevice`](../../idevice/).

```csharp
public void Render(IDevice device, Stream source, Configuration configuration)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The device. |
| source | Stream | The MHTML document. |
| configuration | Configuration | The configuration. |

### See Also

* interface [IDevice](../../idevice/)
* class [Configuration](../../../aspose.html/configuration/)
* class [MhtmlRenderer](../)
* namespace [Aspose.Html.Rendering](../../../aspose.html.rendering/)
* assembly [Aspose.HTML](../../../)

---

## Render(*[IDevice](../../idevice/), Stream, [Configuration](../../../aspose.html/configuration/), TimeSpan*) {#render_5}

Renders MHTML document into specified [`IDevice`](../../idevice/). The rendering will be performed once there are no any network operations for loading resources, active timers, animation tasks or specified timeout is elapsed.

```csharp
public void Render(IDevice device, Stream source, Configuration configuration, TimeSpan timeout)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The device. |
| source | Stream | The MHTML document. |
| configuration | Configuration | The configuration. |
| timeout | TimeSpan | A TimeSpan that represents the number of milliseconds to wait, or a TimeSpan that represents -1 millisecond to wait indefinitely. |

### See Also

* interface [IDevice](../../idevice/)
* class [Configuration](../../../aspose.html/configuration/)
* class [MhtmlRenderer](../)
* namespace [Aspose.Html.Rendering](../../../aspose.html.rendering/)
* assembly [Aspose.HTML](../../../)

---

## Render(*[IDevice](../../idevice/), IList&lt;Stream&gt;, [Configuration](../../../aspose.html/configuration/)*) {#render_1}

Renders multiple MHTML documents into specified [`IDevice`](../../idevice/).

```csharp
public void Render(IDevice device, IList<Stream> sources, Configuration configuration)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The device. |
| sources | IList`1 | The IList of MHTML documents to render. |
| configuration | Configuration | The configuration. |

### See Also

* interface [IDevice](../../idevice/)
* class [Configuration](../../../aspose.html/configuration/)
* class [MhtmlRenderer](../)
* namespace [Aspose.Html.Rendering](../../../aspose.html.rendering/)
* assembly [Aspose.HTML](../../../)

---

## Render(*[IDevice](../../idevice/), IList&lt;Stream&gt;, [Configuration](../../../aspose.html/configuration/), TimeSpan*) {#render_2}

Renders multiple MHTML documents into specified [`IDevice`](../../idevice/). The rendering will be performed once there are no any network operations for loading resources, active timers, animation tasks or specified timeout is elapsed.

```csharp
public void Render(IDevice device, IList<Stream> sources, Configuration configuration, 
    TimeSpan timeout)
```

| Parameter | Type | Description |
| --- | --- | --- |
| device | IDevice | The device. |
| sources | IList`1 | The IList of MHTML documents to render. |
| configuration | Configuration | The configuration. |
| timeout | TimeSpan | A TimeSpan that represents the number of milliseconds to wait, or a TimeSpan that represents -1 millisecond to wait indefinitely. |

### See Also

* interface [IDevice](../../idevice/)
* class [Configuration](../../../aspose.html/configuration/)
* class [MhtmlRenderer](../)
* namespace [Aspose.Html.Rendering](../../../aspose.html.rendering/)
* assembly [Aspose.HTML](../../../)

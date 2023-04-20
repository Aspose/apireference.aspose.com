---
title: Renderer1.Render
second_title: Referencia de API de Aspose.SVG para .NET
description: Renderer método. Define el método para renderizarTDocument en especificadoIDevice .
type: docs
weight: 10
url: /es/net/aspose.svg.rendering/renderer-1/render/
---
## Render(IDevice, TDocument) {#render_3}

Define el método para renderizar!:TDocument en especificado[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, TDocument document)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | IDevice | El dispositivo de salida. |
| document | TDocument | El documento. |

### Ver también

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* espacio de nombres [Aspose.Svg.Rendering](../../renderer-1/)
* asamblea [Aspose.SVG](../../../)

---

## Render(IDevice, TDocument, TimeSpan) {#render_5}

Define el método para renderizar!:TDocument en especificado[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, TDocument document, TimeSpan timeout)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | IDevice | El dispositivo de salida. |
| document | TDocument | El documento. |
| timeout | TimeSpan | ATimeSpan que representa el número de milisegundos a esperar, o unTimeSpan eso representa -1 milisegundo para esperar indefinidamente. |

### Ver también

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* espacio de nombres [Aspose.Svg.Rendering](../../renderer-1/)
* asamblea [Aspose.SVG](../../../)

---

## Render(IDevice, TDocument, int) {#render_4}

Define el método para renderizar!:TDocument en especificado[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, TDocument document, int timeout)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | IDevice | El dispositivo de salida. |
| document | TDocument | El documento. |
| timeout | Int32 | Una cantidad de milisegundos que representa la cantidad de milisegundos para esperar, o -1 milisegundo para esperar indefinidamente. |

### Ver también

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* espacio de nombres [Aspose.Svg.Rendering](../../renderer-1/)
* asamblea [Aspose.SVG](../../../)

---

## Render(IDevice, params TDocument[]) {#render_6}

Define el método para renderizar múltiples!:TDocument s en específico[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, params TDocument[] documents)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | IDevice | El dispositivo de salida. |
| documents | TDocument[] | Los documentos a rendir. |

### Ver también

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* espacio de nombres [Aspose.Svg.Rendering](../../renderer-1/)
* asamblea [Aspose.SVG](../../../)

---

## Render(IDevice, int, params TDocument[]) {#render}

Define el método para renderizar múltiples!:TDocument s en específico[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, int timeout, params TDocument[] documents)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | IDevice | El dispositivo de salida. |
| timeout | Int32 | Una cantidad de milisegundos que representa la cantidad de milisegundos para esperar, o -1 milisegundo para esperar indefinidamente. |
| documents | TDocument[] | Los documentos a rendir. |

### Ver también

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* espacio de nombres [Aspose.Svg.Rendering](../../renderer-1/)
* asamblea [Aspose.SVG](../../../)

---

## Render(IDevice, TimeSpan, params TDocument[]) {#render_2}

Define el método para renderizar múltiples!:TDocument s en específico[`IDevice`](../../idevice/) .

```csharp
public abstract void Render(IDevice device, TimeSpan timeout, params TDocument[] documents)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | IDevice | El dispositivo de salida. |
| timeout | TimeSpan | ATimeSpan que representa el número de milisegundos a esperar, o unTimeSpan eso representa -1 milisegundo para esperar indefinidamente. |
| documents | TDocument[] | Los documentos a rendir. |

### Ver también

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* espacio de nombres [Aspose.Svg.Rendering](../../renderer-1/)
* asamblea [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params TDocument[]) {#render_1}

Define un método para renderizar múltiples!:TDocument s en un específico[`IDevice`](../../idevice/) , utilizando un token de cancelación para solicitar la cancelación de la operación.

```csharp
public abstract void Render(IDevice device, CancellationToken cancellationToken, 
    params TDocument[] documents)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| device | IDevice | El dispositivo de salida. |
| cancellationToken | CancellationToken | ACancellationToken para observar mientras espera que se complete la tarea. |
| documents | TDocument[] | Los documentos a rendir. |

### Ver también

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* espacio de nombres [Aspose.Svg.Rendering](../../renderer-1/)
* asamblea [Aspose.SVG](../../../)



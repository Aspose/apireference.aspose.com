---
title: Renderer1.Render
second_title: .NET API 참조용 Aspose.SVG
description: Renderer 방법. 렌더링 방법 정의TDocument 지정된IDevice .
type: docs
weight: 10
url: /ko/net/aspose.svg.rendering/renderer-1/render/
---
## Render(IDevice, TDocument) {#render_3}

렌더링 방법 정의!:TDocument 지정된[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, TDocument document)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | IDevice | 출력 장치. |
| document | TDocument | 문서. |

### 또한보십시오

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 네임스페이스 [Aspose.Svg.Rendering](../../renderer-1/)
* 집회 [Aspose.SVG](../../../)

---

## Render(IDevice, TDocument, TimeSpan) {#render_5}

렌더링 방법 정의!:TDocument 지정된[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, TDocument document, TimeSpan timeout)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | IDevice | 출력 장치. |
| document | TDocument | 문서. |
| timeout | TimeSpan | ㅏTimeSpan 대기 시간(밀리초) 또는TimeSpan 무기한 대기하는 -1밀리초를 나타냅니다. |

### 또한보십시오

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 네임스페이스 [Aspose.Svg.Rendering](../../renderer-1/)
* 집회 [Aspose.SVG](../../../)

---

## Render(IDevice, TDocument, int) {#render_4}

렌더링 방법 정의!:TDocument 지정된[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, TDocument document, int timeout)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | IDevice | 출력 장치. |
| document | TDocument | 문서. |
| timeout | Int32 | 대기할 시간(밀리초) 또는 무기한 대기하려면 -1밀리초를 나타내는 밀리초 수입니다. |

### 또한보십시오

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 네임스페이스 [Aspose.Svg.Rendering](../../renderer-1/)
* 집회 [Aspose.SVG](../../../)

---

## Render(IDevice, params TDocument[]) {#render_6}

다중 렌더링 방법을 정의합니다.!:TDocument 구체적으로[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, params TDocument[] documents)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | IDevice | 출력 장치. |
| documents | TDocument[] | 렌더링할 문서입니다. |

### 또한보십시오

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 네임스페이스 [Aspose.Svg.Rendering](../../renderer-1/)
* 집회 [Aspose.SVG](../../../)

---

## Render(IDevice, int, params TDocument[]) {#render}

다중 렌더링 방법을 정의합니다.!:TDocument 구체적으로[`IDevice`](../../idevice/) .

```csharp
public void Render(IDevice device, int timeout, params TDocument[] documents)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | IDevice | 출력 장치. |
| timeout | Int32 | 대기할 시간(밀리초) 또는 무기한 대기하려면 -1밀리초를 나타내는 밀리초 수입니다. |
| documents | TDocument[] | 렌더링할 문서입니다. |

### 또한보십시오

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 네임스페이스 [Aspose.Svg.Rendering](../../renderer-1/)
* 집회 [Aspose.SVG](../../../)

---

## Render(IDevice, TimeSpan, params TDocument[]) {#render_2}

다중 렌더링 방법을 정의합니다.!:TDocument 구체적으로[`IDevice`](../../idevice/) .

```csharp
public abstract void Render(IDevice device, TimeSpan timeout, params TDocument[] documents)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | IDevice | 출력 장치. |
| timeout | TimeSpan | ㅏTimeSpan 대기 시간(밀리초) 또는TimeSpan 무기한 대기하는 -1밀리초를 나타냅니다. |
| documents | TDocument[] | 렌더링할 문서입니다. |

### 또한보십시오

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 네임스페이스 [Aspose.Svg.Rendering](../../renderer-1/)
* 집회 [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params TDocument[]) {#render_1}

다중 렌더링 방법을 정의합니다.!:TDocument 특정으로[`IDevice`](../../idevice/) , 취소 토큰을 사용하여 작업 취소를 요청합니다.

```csharp
public abstract void Render(IDevice device, CancellationToken cancellationToken, 
    params TDocument[] documents)
```

| 모수 | 유형 | 설명 |
| --- | --- | --- |
| device | IDevice | 출력 장치. |
| cancellationToken | CancellationToken | ㅏCancellationToken 작업이 완료되기를 기다리는 동안 관찰합니다. |
| documents | TDocument[] | 렌더링할 문서입니다. |

### 또한보십시오

* interface [IDevice](../../idevice/)
* class [Renderer&lt;TDocument&gt;](../)
* 네임스페이스 [Aspose.Svg.Rendering](../../renderer-1/)
* 집회 [Aspose.SVG](../../../)



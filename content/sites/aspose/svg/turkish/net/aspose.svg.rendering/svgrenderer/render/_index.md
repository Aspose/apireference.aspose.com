---
title: SvgRenderer.Render
second_title: Aspose.SVG for .NET API Referansı
description: SvgRenderer yöntem. Çoklu işleme yöntemini tanımlarSVGDocument spesifik olarakIDevice .
type: docs
weight: 20
url: /tr/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

Çoklu işleme yöntemini tanımlar[`SVGDocument`](../../../aspose.svg/svgdocument/) spesifik olarak[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| device | IDevice | Çıkış cihazı. |
| timeout | TimeSpan | ATimeSpan beklenecek milisaniye sayısını temsil eden veyaTimeSpan bu süresiz olarak beklemek için -1 milisaniyeyi temsil eder. |
| documents | SVGDocument[] | İşlenecek belgeler. |

### Ayrıca bakınız

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* ad alanı [Aspose.Svg.Rendering](../../svgrenderer/)
* toplantı [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

Çoklu işlemek için bir yöntem tanımlar[`SVGDocument`](../../../aspose.svg/svgdocument/) belirli bir[`IDevice`](../../idevice/) , işlemin iptalini talep etmek için bir iptal belirteci kullanarak.

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| device | IDevice | Çıkış cihazı. |
| cancellationToken | CancellationToken | Görevin tamamlanmasını beklerken gözlemlenecek bir iptal belirteci. |
| documents | SVGDocument[] | İşlenecek belgeler. |

### Ayrıca bakınız

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* ad alanı [Aspose.Svg.Rendering](../../svgrenderer/)
* toplantı [Aspose.SVG](../../../)



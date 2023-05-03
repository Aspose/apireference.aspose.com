---
title: GraphicsPath.Widen
second_title: Aspose.Drawing voor .NET API-referentie
description: GraphicsPath methode. Voegt een extra omtrek toe aan het pad.
type: docs
weight: 360
url: /nl/net/system.drawing.drawing2d/graphicspath/widen/
---
## Widen(Pen) {#widen}

Voegt een extra omtrek toe aan het pad.

```csharp
public void Widen(Pen pen)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pen | Pen | APen die de breedte specificeert tussen de oorspronkelijke omtrek van het pad en de nieuwe omtrek die deze methode maakt. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| NotImplementedException | Methode niet geïmplementeerd. |

### Zie ook

* class [Pen](../../../system.drawing/pen/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix) {#widen_1}

Voegt een extra omtrek toe aan hetGraphicsPath .

```csharp
public void Widen(Pen pen, Matrix matrix)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pen | Pen | APen die de breedte specificeert tussen de oorspronkelijke omtrek van het pad en de nieuwe omtrek die deze methode maakt. |
| matrix | Matrix | AMatrix dat specificeert een transformatie die moet worden toegepast op het pad voordat het wordt verbreed. |

### Zie ook

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)

---

## Widen(Pen, Matrix, float) {#widen_2}

Vervangt ditGraphicsPath met curven die het gebied omsluiten dat wordt gevuld wanneer dit pad wordt getekend met de opgegeven pen.

```csharp
public void Widen(Pen pen, Matrix matrix, float flatness)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| pen | Pen | APen die de breedte specificeert tussen de oorspronkelijke omtrek van het pad en de nieuwe omtrek die deze methode maakt. |
| matrix | Matrix | AMatrix dat specificeert een transformatie die moet worden toegepast op het pad voordat het wordt verbreed. |
| flatness | Single | Een waarde die de vlakheid voor krommen specificeert. |

### Opmerkingen

MS System.Drawing-implementatie roept Flatten() binnen Widen() aan of gebruikt hetzelfde algoritme. Aspose.Drawing-implementatie gebruikt het Skia-algoritme zonder de curven te vervangen door lijnsegmenten. Het negeert de`vlakheid` parameter.

### Zie ook

* class [Pen](../../../system.drawing/pen/)
* class [Matrix](../../matrix/)
* class [GraphicsPath](../)
* naamruimte [System.Drawing.Drawing2D](../../graphicspath/)
* montage [Aspose.Drawing](../../../)



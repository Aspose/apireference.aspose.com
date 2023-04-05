---
title: XpsDocument.CreatePathFigure
second_title: Aspose.Page for .NET API Referansı
description: XpsDocument yöntem. Yeni bir yol şekli oluşturur.
type: docs
weight: 280
url: /tr/net/aspose.page.xps/xpsdocument/createpathfigure/
---
## CreatePathFigure(PointF, bool) {#createpathfigure}

Yeni bir yol şekli oluşturur.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, bool isClosed = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| startPoint | PointF | Yol şeklinin ilk bölümü için başlangıç noktası. |
| isClosed | Boolean | Yolun kapalı olup olmadığını belirtir. true olarak ayarlanırsa, kontur çizilir "kapalı", yani yol şeklinin son segmentindeki son nokta, StartPoint özniteliğinde belirtilen noktayla bağlanır, aksi takdirde kontur "açık" olarak çizilir ve son olarak çizilir noktası başlangıç noktasına bağlı değil. Yalnızca bir konturu belirten bir {Path} öğesinde yol şekli is kullanılıyorsa uygulanabilir. |

### Geri dönüş değeri

Yeni yol figürü.

### Ayrıca bakınız

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsDocument](../)
* ad alanı [Aspose.Page.XPS](../../xpsdocument/)
* toplantı [Aspose.Page](../../../)

---

## CreatePathFigure(PointF, List&lt;XpsPathSegment&gt;, bool) {#createpathfigure_1}

Yeni bir yol şekli oluşturur.

```csharp
public XpsPathFigure CreatePathFigure(PointF startPoint, List<XpsPathSegment> segments, 
    bool isClosed = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| startPoint | PointF | Yol şeklinin ilk bölümü için başlangıç noktası. |
| segments | List`1 | Yol bölümlerinin listesi. |
| isClosed | Boolean | Yolun kapalı olup olmadığını belirtir. true olarak ayarlanırsa, kontur çizilir "kapalı", yani yol şeklinin son segmentindeki son nokta, StartPoint özniteliğinde belirtilen noktayla bağlanır, aksi takdirde kontur "açık" olarak çizilir ve son olarak çizilir noktası başlangıç noktasına bağlı değil. Yalnızca bir konturu belirten bir {Path} öğesinde yol şekli is kullanılıyorsa uygulanabilir. |

### Geri dönüş değeri

Yeni yol figürü.

### Ayrıca bakınız

* class [XpsPathFigure](../../../aspose.page.xps.xpsmodel/xpspathfigure/)
* class [XpsPathSegment](../../../aspose.page.xps.xpsmodel/xpspathsegment/)
* class [XpsDocument](../)
* ad alanı [Aspose.Page.XPS](../../xpsdocument/)
* toplantı [Aspose.Page](../../../)



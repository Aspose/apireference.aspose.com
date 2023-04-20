---
title: SvgRenderer.Render
second_title: Aspose.SVG για Αναφορά API .NET
description: SvgRenderer μέθοδος. Καθορίζει τη μέθοδο απόδοσης πολλαπλώνSVGDocument s σε συγκεκριμέναIDevice .
type: docs
weight: 20
url: /el/net/aspose.svg.rendering/svgrenderer/render/
---
## Render(IDevice, TimeSpan, params SVGDocument[]) {#render_6}

Καθορίζει τη μέθοδο απόδοσης πολλαπλών[`SVGDocument`](../../../aspose.svg/svgdocument/) s σε συγκεκριμένα[`IDevice`](../../idevice/) .

```csharp
public override void Render(IDevice device, TimeSpan timeout, params SVGDocument[] documents)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| device | IDevice | Η συσκευή εξόδου. |
| timeout | TimeSpan | ΕΝΑTimeSpan που αντιπροσωπεύει τον αριθμό των χιλιοστών του δευτερολέπτου για αναμονή, ή αTimeSpan που αντιπροσωπεύει -1 χιλιοστό του δευτερολέπτου για απεριόριστη αναμονή. |
| documents | SVGDocument[] | Τα έγγραφα προς απόδοση. |

### Δείτε επίσης

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* χώρος ονομάτων [Aspose.Svg.Rendering](../../svgrenderer/)
* συνέλευση [Aspose.SVG](../../../)

---

## Render(IDevice, CancellationToken, params SVGDocument[]) {#render_5}

Καθορίζει μια μέθοδο για την απόδοση πολλαπλών[`SVGDocument`](../../../aspose.svg/svgdocument/) s σε ένα συγκεκριμένο[`IDevice`](../../idevice/) , χρησιμοποιώντας ένα διακριτικό ακύρωσης για να ζητήσετε ακύρωση της λειτουργίας.

```csharp
public override void Render(IDevice device, CancellationToken cancellationToken, 
    params SVGDocument[] documents)
```

| Παράμετρος | Τύπος | Περιγραφή |
| --- | --- | --- |
| device | IDevice | Η συσκευή εξόδου. |
| cancellationToken | CancellationToken | Ένα διακριτικό ακύρωσης που πρέπει να παρατηρήσετε ενώ περιμένετε να ολοκληρωθεί η εργασία. |
| documents | SVGDocument[] | Τα έγγραφα προς απόδοση. |

### Δείτε επίσης

* interface [IDevice](../../idevice/)
* class [SVGDocument](../../../aspose.svg/svgdocument/)
* class [SvgRenderer](../)
* χώρος ονομάτων [Aspose.Svg.Rendering](../../svgrenderer/)
* συνέλευση [Aspose.SVG](../../../)



---
title: AbstractPath.Combine
second_title: Aspose.GIS für .NET-API-Referenz
description: AbstractPath methode. Kombiniert diesAbstractPath mit angegebenen Pfadkomponenten.
type: docs
weight: 50
url: /de/net/aspose.gis/abstractpath/combine/
---
## AbstractPath.Combine method

Kombiniert dies[`AbstractPath`](../) mit angegebenen Pfadkomponenten.

```csharp
public virtual AbstractPath Combine(string location)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| location | String | Eine daran anzuhängende Pfadkomponente[`AbstractPath`](../). |

### Rückgabewert

Ein neues[`AbstractPath`](../) zeigt auf a[`Location`](../location/) das ist eine Kombination von Standorten davon[`AbstractPath`](../)und das Argument.

### Bemerkungen

Normalerweise sollte diese Methode nicht von einem Erben überschrieben werden. Die Standardimplementierung verkettet dies[`Location`](../location/) mit dem Argument und ruft die[`WithLocation`](../withlocation/) -Methode mit der verketteten Zeichenfolge als Argument. Das Kombinationsergebnis ist wie folgt definiert:  Wenn das Argument mit dem beginnt[`Separator`](../separator/), das Kombinationsergebnis ist gleich dem Argument; Ansonsten, wenn[`Location`](../location/) endet mit der[`Separator`](../separator/) , das Kombinationsergebnis gleich ist` +`; Andernfalls ist das Ergebnis gleich` + +`

### Siehe auch

* class [AbstractPath](../)
* namensraum [Aspose.Gis](../../abstractpath/)
* Montage [Aspose.GIS](../../../)



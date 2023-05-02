---
title: Delegate Graphics.DrawImageAbort
second_title: Aspose.Drawing voor .NET API-referentie
description: Biedt een callbackmethode om te beslissen wanneer deDrawImage methode zou de uitvoering voortijdig moeten annuleren en stoppen met het tekenen van een afbeelding.
type: docs
weight: 540
url: /nl/net/system.drawing/graphics.drawimageabort/
---
## Graphics.DrawImageAbort delegate

Biedt een callback-methode om te beslissen wanneer de[`DrawImage`](../graphics/drawimage/) methode zou de uitvoering voortijdig moeten annuleren en stoppen met het tekenen van een afbeelding.

```csharp
public delegate bool DrawImageAbort(IntPtr callbackdata);
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callbackdata | IntPtr | Interne aanwijzer die gegevens specificeert voor de callback-methode. Deze parameter wordt niet door iedereen doorgegeven[`DrawImage`](../graphics/drawimage/) overbelastingen. U kunt testen op afwezigheid door te controleren op de waardeZero . |

### Winstwaarde

Deze methode retourneert true als het besluit dat de[`DrawImage`](../graphics/drawimage/) methode zou de uitvoering voortijdig moeten stoppen. Anders retourneert het false om aan te geven dat de[`DrawImage`](../graphics/drawimage/) methode moet doorgaan met uitvoeren.

### Zie ook

* class [Graphics](../graphics/)
* naamruimte [System.Drawing](../../system.drawing/)
* montage [Aspose.Drawing](../../)



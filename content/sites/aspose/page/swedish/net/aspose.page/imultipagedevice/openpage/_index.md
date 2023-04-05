---
title: IMultiPageDevice.OpenPage
second_title: Aspose.Page för .NET API-referens
description: IMultiPageDevice metod. Gör nödvändiga förberedelser av enheten innan sidrendering.
type: docs
weight: 40
url: /sv/net/aspose.page/imultipagedevice/openpage/
---
## OpenPage(string) {#openpage_1}

Gör nödvändiga förberedelser av enheten innan sidrendering.

```csharp
public bool OpenPage(string title)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| title | String | Sidans titel. |

### Returvärde

Sant om sidan är från det begärda intervallet, annars false. Används i enheter som kan återge en specificerad matris med sidnummer.

### Se även

* interface [IMultiPageDevice](../)
* namnutrymme [Aspose.Page](../../imultipagedevice/)
* hopsättning [Aspose.Page](../../../)

---

## OpenPage(float, float) {#openpage}

Gör nödvändiga förberedelser av enheten före varje sidrendering.

```csharp
public bool OpenPage(float width, float height)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | Single | En bredd på sidan. |
| height | Single | En höjd på sidan. |

### Returvärde

Returnerar sant om den öppnade sidan har ett nummer som faller inom ett intervall av valda sidnummer och annars falskt.

### Se även

* interface [IMultiPageDevice](../)
* namnutrymme [Aspose.Page](../../imultipagedevice/)
* hopsättning [Aspose.Page](../../../)



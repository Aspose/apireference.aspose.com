---
title: SetHeader
second_title: Aspose.Cells för .NET API-referens
description: Ställer in ett skript som formaterar rubriken för en Excel-fil.
type: docs
weight: 620
url: /sv/net/aspose.cells/pagesetup/setheader/
---
## PageSetup.SetHeader method

Ställer in ett skript som formaterar rubriken för en Excel-fil.

```csharp
public void SetHeader(int section, string headerScript)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| section | Int32 | 0: Vänster sektion, 1: Mittsektion, 2: Höger sektion. |
| headerScript | String | Skript i rubrikformat. |

### Anmärkningar

Skriptkommandon:

**Kommando**

**Beskrivning**

&amp;P

Aktuellt sidnummer

&amp;N

Sidonummer

&amp;D

Dagens datum

&amp;T

Aktuell tid

&amp;A

Bladets namn

&amp;F

Filnamn utan sökväg

&amp;"&lt;Teckensnitt&gt;"

Teckensnittsnamn, till exempel: &amp;"Arial"

&amp;"&lt;FontName&gt;, &lt;FontStyle&gt;"

Teckensnittsnamn och teckensnittsstil, till exempel: &amp;"Arial,Fet"

&amp;&lt;Teckenstorlek&gt;

Textstorlek. Om detta kommando följs av ett vanligt nummer som ska skrivas ut i rubriken, kommer det att separeras från teckensnittets höjd med ett mellanslag.

&amp;K&lt;RRGGBB&gt;

Teckensnittsfärg, till exempel (RÖD): &amp;KFF0000

&amp;G

Bildskript

Till exempel: "&amp;Arial,Fet&amp;8Header Note"

### Se även

* class [PageSetup](../../pagesetup)
* namnutrymme [Aspose.Cells](../../pagesetup)
* hopsättning [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->

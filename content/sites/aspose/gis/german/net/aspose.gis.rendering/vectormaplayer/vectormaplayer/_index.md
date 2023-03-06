---
title: VectorMapLayer.VectorMapLayer
second_title: Aspose.GIS für .NET-API-Referenz
description: VectorMapLayer constructeur. Erstellt eine neue Instanz mit dem Standardsymbolisierer.
type: docs
weight: 10
url: /de/net/aspose.gis.rendering/vectormaplayer/vectormaplayer/
---
## VectorMapLayer(FeaturesSequence) {#constructor}

Erstellt eine neue Instanz mit dem Standardsymbolisierer.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Features-Sequenz. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |

### Siehe auch

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorMapLayer](../)
* namensraum [Aspose.Gis.Rendering](../../vectormaplayer/)
* Montage [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer) {#constructor_1}

Erstellt eine neue Instanz mit dem Standardsymbolisierer.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Features-Sequenz. |
| symbolizer | VectorSymbolizer | Symbolisierer zum Rendern von Layern. Wenn`null`, wird der Standardsymbolisierer verwendet. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |

### Siehe auch

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* namensraum [Aspose.Gis.Rendering](../../vectormaplayer/)
* Montage [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer, Labeling) {#constructor_2}

Erstellt eine neue Instanz mit dem Standardsymbolisierer.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, 
    Labeling labeling)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Features-Sequenz. |
| symbolizer | VectorSymbolizer | Symbolisierer zum Rendern von Layern. Wenn`null`, wird der Standardsymbolisierer verwendet. |
| labeling | Labeling | Beschriftung zum Beschriften von Features im Layer. Wenn`null` , Standard[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) wird verwendet. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |

### Siehe auch

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* namensraum [Aspose.Gis.Rendering](../../vectormaplayer/)
* Montage [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, bool) {#constructor_5}

Erstellt eine neue Instanz mit dem Standardsymbolisierer.

```csharp
public VectorMapLayer(VectorLayer layer, bool keepOpen = true)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| layer | VectorLayer | Vektorebene. |
| keepOpen | Boolean | `true` um die Ebene nach dem offen zu lassen[`VectorMapLayer`](../) Objekt wird entsorgt; ansonsten,`false` . |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Schicht ist`null`. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorMapLayer](../)
* namensraum [Aspose.Gis.Rendering](../../vectormaplayer/)
* Montage [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, bool) {#constructor_4}

Erstellt eine neue Instanz.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = true)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| layer | VectorLayer | Vektorebene. |
| symbolizer | VectorSymbolizer | Symbolisierer zum Rendern von Layern. Wenn`null`, wird der Standardsymbolisierer verwendet. |
| keepOpen | Boolean | `true` um die Ebene nach dem offen zu lassen[`VectorMapLayer`](../) Objekt wird entsorgt; ansonsten,`false` . |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Schicht ist`null`. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [VectorMapLayer](../)
* namensraum [Aspose.Gis.Rendering](../../vectormaplayer/)
* Montage [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, bool) {#constructor_3}

Erstellt eine neue Instanz.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = true)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| layer | VectorLayer | Vektorebene. |
| symbolizer | VectorSymbolizer | Symbolisierer zum Rendern der Ebene. Wenn`null` wird der Standardsymbolisierer verwendet. |
| labeling | Labeling | Beschriftung zum Beschriften von Features im Layer. Wenn`null` , Standard[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) wird verwendet. |
| keepOpen | Boolean | `true` um die Ebene nach dem offen zu lassen[`VectorMapLayer`](../) Objekt wird entsorgt; ansonsten,`false` . |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Schicht ist`null`. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [VectorMapLayer](../)
* namensraum [Aspose.Gis.Rendering](../../vectormaplayer/)
* Montage [Aspose.GIS](../../../)



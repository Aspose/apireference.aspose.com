---
title: SectionDividerLayer.GetRelatedLayerGroup
second_title: Aspose.PSD für .NET-API-Referenz
description: SectionDividerLayer methode. Ruft die abLayerGroup das hängt damit zusammenSectionDividerLayer Instanz.
type: docs
weight: 20
url: /de/net/aspose.psd.fileformats.psd.layers/sectiondividerlayer/getrelatedlayergroup/
---
## SectionDividerLayer.GetRelatedLayerGroup method

Ruft die ab[`LayerGroup`](../../layergroup/) das hängt damit zusammen[`SectionDividerLayer`](../) Instanz.

```csharp
public LayerGroup GetRelatedLayerGroup()
```

### Rückgabewert

Der[`LayerGroup`](../../layergroup/) Beispiel.

### Beispiele

Der folgende Code demonstriert SectionDividerLayer-Layer und wie man die zugehörige LayerGroup erhält.

```csharp
[C#]

// Der folgende Code demonstriert SectionDividerLayer-Ebenen und wie man die zugehörige LayerGroup erhält.

// Ebenenhierarchie
// [0]: '</Ebenengruppe>' SectionDividerLayer für Gruppe 1
// [1]: Normale Ebene 'Ebene 1'
// [2]: '</Ebenengruppe>' SectionDividerLayer für Gruppe 2
// [3]: '</Ebenengruppe>' SectionDividerLayer für Gruppe 3
// [4]: 'Gruppe 3' Gruppenebene
// [5]: 'Gruppe 2' Gruppenebene
// [6]: 'Gruppe 1' Gruppenebene

void AssertAreEqual(object expected, object actual, string message = null)
{
    if (!object.Equals(expected, actual))
    {
        throw new Exception(message ?? "Objects are not equal.");
    }
}

using (var image = new PsdImage(100, 100))
{
    // Ebenenhierarchie erstellen
    // Fügen Sie die LayerGroup 'Gruppe 1' hinzu
    LayerGroup group1 = image.AddLayerGroup("Group 1", 0, true);
    // Normale Ebene hinzufügen
    Layer layer1 = new Layer();
    layer1.DisplayName = "Layer 1";
    group1.AddLayer(layer1);
    // Fügen Sie die LayerGroup 'Gruppe 2' hinzu
    LayerGroup group2 = group1.AddLayerGroup("Group 2", 1);
    // Fügen Sie die LayerGroup 'Gruppe 3' hinzu
    LayerGroup group3 = group2.AddLayerGroup("Group 3", 0);

    // Ruft die SectionDividerLayer ab
    SectionDividerLayer divider1 = (SectionDividerLayer)image.Layers[0];
    SectionDividerLayer divider2 = (SectionDividerLayer)image.Layers[2];
    SectionDividerLayer divider3 = (SectionDividerLayer)image.Layers[3];

    // Ruft mit der Methode SectionDividerLayer.GetRelatedLayerGroup() die zugehörige LayerGroup-Instanz ab.
    AssertAreEqual(group1.DisplayName, divider1.GetRelatedLayerGroup().DisplayName); // die gleiche LayerGroup
    AssertAreEqual(group2.DisplayName, divider2.GetRelatedLayerGroup().DisplayName); // die gleiche LayerGroup
    AssertAreEqual(group3.DisplayName, divider3.GetRelatedLayerGroup().DisplayName); // die gleiche LayerGroup

    LayerGroup folder1 = divider1.GetRelatedLayerGroup();
    AssertAreEqual(5, folder1.Layers.Length); // 'Gruppe 1' enthält 5 Ebenen
}
```

### Siehe auch

* class [LayerGroup](../../layergroup/)
* class [SectionDividerLayer](../)
* namensraum [Aspose.PSD.FileFormats.Psd.Layers](../../sectiondividerlayer/)
* Montage [Aspose.PSD](../../../)



---
title: RuleBasedSymbolizer.Add
second_title: Référence de l'API Aspose.GIS pour .NET
description: RuleBasedSymbolizer méthode. Ajoute de nouveauxRule .
type: docs
weight: 40
url: /fr/net/aspose.gis.rendering.symbolizers/rulebasedsymbolizer/add/
---
## Add(Func&lt;Feature, bool&gt;, VectorSymbolizer) {#add_1}

Ajoute de nouveaux[`Rule`](../../rule/) .

```csharp
public void Add(Func<Feature, bool> filter, VectorSymbolizer symbolizer)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| filter | Func`2 | Détermine quand le symboliseur doit être appliqué à une entité. |
| symbolizer | VectorSymbolizer | Symboliseur à appliquer à une entité lorsque*filter* renvoie vrai. |

### Voir également

* class [Feature](../../../aspose.gis/feature/)
* class [VectorSymbolizer](../../vectorsymbolizer/)
* class [RuleBasedSymbolizer](../)
* espace de noms [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* Assemblée [Aspose.GIS](../../../)

---

## Add(Rule) {#add}

Ajoute une règle.

```csharp
public void Add(Rule rule)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| rule | Rule | Règle à ajouter. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |

### Voir également

* class [Rule](../../rule/)
* class [RuleBasedSymbolizer](../)
* espace de noms [Aspose.Gis.Rendering.Symbolizers](../../rulebasedsymbolizer/)
* Assemblée [Aspose.GIS](../../../)



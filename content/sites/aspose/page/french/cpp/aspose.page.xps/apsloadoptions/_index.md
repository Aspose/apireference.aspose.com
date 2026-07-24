---
title: "Aspose::Page::XPS::ApsLoadOptions classe"
linktitle: "ApsLoadOptions"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::ApsLoadOptions classe. Options de chargement de documents APS en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


Options de chargement de document APS.

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | Crée une nouvelle instance d'options. |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | Une valeur entière de 0 à 255 en dessous de laquelle le pixel d'une image contenant des valeurs alpha sera considéré comme totalement transparent. PostScript ne prend pas en charge la transparence, mais peut appliquer un masque explicite sur l'image couleur où certains pixels seront totalement opaques et d'autres totalement transparents. Le seuil de transparence est utilisé pour obtenir la meilleure ressemblance entre l'original et le résultat PostScript. La valeur par défaut est 255. |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | Une valeur entière de 0 à 255 en dessous de laquelle le pixel d'une image contenant des valeurs alpha sera considéré comme totalement transparent. PostScript ne prend pas en charge la transparence, mais peut appliquer un masque explicite sur l'image couleur où certains pixels seront totalement opaques et d'autres totalement transparents. Le seuil de transparence est utilisé pour obtenir la meilleure ressemblance entre l'original et le résultat PostScript. La valeur par défaut est 255. |
## Voir aussi

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)

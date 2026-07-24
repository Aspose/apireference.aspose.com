---
title: "Aspose::Page::XPS::XpsModel::XpsTileMode-enum"
linktitle: "XpsTileMode"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsModel::XpsTileMode-enum. Giltiga värden för tilingpenslarnas TileMode-egenskap i C++."
type: docs
weight: 5500
url: /sv/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


Giltiga värden för tiling-penslarnas egenskap TileMode.

```cpp
enum class XpsTileMode
```

### Värden

| Namn | Värde | Beskrivning |
| --- | --- | --- |
| None | 0 | I detta läge ritas endast den enda basplattan. Det återstående området lämnas transparent. |
| Tile | 1 | I detta läge ritas basplattan och det återstående området fylls genom att upprepa basplattan så att den högra kanten på varje platta ligger intill den vänstra kanten på nästa, och den nedre kanten på varje platta ligger intill den övre kanten på nästa. |
| FlipX | 2 | Plattarrangemanget liknar Tile-läget, men alternerande kolumner av plattor vänds horisontellt. Basplattan placeras enligt vad som anges av visningsområdet. Plattor i kolumnerna till vänster och höger om denna platta vänds horisontellt. |
| FlipY | 3 | Plattarrangemanget liknar Tile-läget, men alternerande rader av plattor vänds vertikalt. Basplattan placeras enligt vad som anges av visningsområdet. Rader ovanför och nedanför vänds vertikalt. |
| FlipXY | 4 | Tile‑arrangemanget är liknande Tile tile mode, men alternerande kolumner av plattor vänds horisontellt och alternerande rader av plattor vänds vertikalt. Basplattan placeras enligt vad som specificeras av viewporten. |

## Se även

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

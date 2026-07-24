---
title: "Aspose::Page::XPS::ApsLoadOptions klass"
linktitle: "ApsLoadOptions"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::ApsLoadOptions klass. APS-dokumentladdningsalternativ i C++."
type: docs
weight: 100
url: /sv/cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


APS-dokumentladdningsalternativ.

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | Skapar en ny instans av alternativ. |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | Ett heltal från 0 till 255 under vilket en bildpixel som innehåller alfa-värden betraktas som helt transparent. PostScript stödjer inte transparens, men kan applicera en explicit mask ovanpå färgbilden där vissa pixlar blir helt ogenomskinliga och vissa blir helt transparenta. Transparensgränsen används för att hitta den bästa likheten mellan originalet och PostScript-resultatet. Standardvärdet är 255. |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | Ett heltal från 0 till 255 under vilket en bildpixel som innehåller alfa-värden betraktas som helt transparent. PostScript stödjer inte transparens, men kan applicera en explicit mask ovanpå färgbilden där vissa pixlar blir helt ogenomskinliga och vissa blir helt transparenta. Transparensgränsen används för att hitta den bästa likheten mellan originalet och PostScript-resultatet. Standardvärdet är 255. |
## Se även

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)

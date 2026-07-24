---
title: "Aspose::Page::AssemblyConstants klass"
linktitle: "AssemblyConstants"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::AssemblyConstants klass. Definierar de konstanter som deltar i licenskontrollen för komponenten. Dessa brukade definieras direkt som sammansättningsattribut, men jag flyttade dem till en separat klass eftersom jag i .NET Compact Framework inte kan komma åt sammansättningsattribut. Nu använder licenskoden när den kompileras för .NET Compact Framework dessa konstanter istället för sammansättningsattributen i C++."
type: docs
weight: 100
url: /sv/cpp/aspose.page/assemblyconstants/
---
## AssemblyConstants class


Definierar de konstanter som deltar i licenskontrollen för komponenten. Dessa brukade definieras direkt som sammansättningsattribut, men jag flyttade dem till en separat klass eftersom jag i .NET Compact Framework inte kan komma åt sammansättningsattribut. Nu använder licenskoden när den kompileras för .NET Compact Framework dessa konstanter i stället för sammansättningsattributen.

```cpp
class AssemblyConstants : public System::Object
```

## Fält

| Fält | Beskrivning |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Producer](./producer/) | Producenten av utdata-dokumenten. |
| static [PRODUCT](./product/) |  |
| static [Product](./product/) | Detta används av **Aspose** licenskod för att verifiera att licensen är för rätt produkt. |
| static [Product2](./product2/) | Detta används av **Aspose** licenskod för att verifiera att licensen är för rätt produkt. Tillfälligt kommer **Aspose.EPS** licensen att vara giltig för [Aspose.Page](../) också. |
| static [Product3](./product3/) | Detta används av **Aspose** licenskod för att verifiera att licensen är för rätt produkt. Tillfälligt kommer Aspose.XPS-licensen att vara giltig för [Aspose.Page](../) också. |
| static [ReleaseDate](./releasedate/) | Detta används av **Aspose** licenskod för att kontrollera prenumerationsutgång. Du måste sätta detta till datumet då du publicerar en release eller en hotfix. |
| static [Title](./title/) |  |
| static [VERSION](./version/) |  |
| static [Version](./version/) | Versionen av sammansättningen. |
## Se även

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)

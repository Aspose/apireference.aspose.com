---
title: "Aspose::Page::AssemblyConstants Klasse"
linktitle: "AssemblyConstants"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::AssemblyConstants Klasse. Definiert die Konstanten, die an der Lizenzprüfung für die Komponente teilnehmen. Diese wurden früher direkt als Assembly-Attribute definiert, aber ich habe sie in eine separate Klasse verschoben, weil ich im .NET Compact Framework nicht auf Assembly-Attribute zugreifen kann. Jetzt verwendet der Lizenzcode, wenn er für das .NET Compact Framework kompiliert wird, diese Konstanten anstelle der Assembly-Attribute in C++."
type: docs
weight: 100
url: /de/cpp/aspose.page/assemblyconstants/
---
## AssemblyConstants class


Definiert die Konstanten, die an der Lizenzprüfung für die Komponente teilnehmen. Diese wurden früher direkt als Assembly-Attribute definiert, aber ich habe sie in eine separate Klasse verschoben, weil ich im .NET Compact Framework nicht auf Assembly-Attribute zugreifen kann. Jetzt verwendet der Lizenzcode, wenn er für das .NET Compact Framework kompiliert wird, diese Konstanten anstelle der Assembly-Attribute.

```cpp
class AssemblyConstants : public System::Object
```

## Felder

| Feld | Beschreibung |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Producer](./producer/) | Der Erzeuger der Ausgabedokumente. |
| static [PRODUCT](./product/) |  |
| static [Product](./product/) | Dies wird vom **Aspose** Lizenzcode verwendet, um zu überprüfen, ob die Lizenz für das richtige Produkt ist. |
| static [Product2](./product2/) | Dies wird vom **Aspose** Lizenzcode verwendet, um zu überprüfen, ob die Lizenz für das richtige Produkt ist. Vorübergehend ist die **Aspose.EPS** Lizenz auch für [Aspose.Page](../) gültig. |
| static [Product3](./product3/) | Dies wird vom **Aspose** Lizenzcode verwendet, um zu überprüfen, ob die Lizenz für das richtige Produkt ist. Vorübergehend ist die Aspose.XPS Lizenz auch für [Aspose.Page](../) gültig. |
| static [ReleaseDate](./releasedate/) | Dies wird vom **Aspose** Lizenzcode verwendet, um das Ablaufdatum des Abonnements zu prüfen. Sie müssen dies auf das Datum setzen, an dem Sie ein Release oder einen Hotfix veröffentlichen. |
| static [Title](./title/) |  |
| static [VERSION](./version/) |  |
| static [Version](./version/) | Die Version der Assembly. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)

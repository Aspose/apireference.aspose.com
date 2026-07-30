---
title: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum"
linktitle: "CffUpdateStringIndexStrategy"
second_title: "Aspose.Font für C++"
description: "Aspose::Font::CffDataProviders::CffUpdateStringIndexStrategy enum. Gibt an, wie Zeichenketten im CFF String INDEX-Speicher hinzugefügt werden. Wenn wir versuchen, eine Zeichenkette in den CFF String INDEX einzufügen, kann es vorkommen, dass diese Zeichenkette bereits im String INDEX vorhanden ist. Mit der Option SearchForDuplicates können wir eine Suche im String INDEX erzwingen, um zu erkennen, ob die Zeichenkette bereits vorhanden ist oder nicht. Dieser Ansatz spart Platz in der String INDEX-Struktur, erfordert jedoch mehr Zeit zum Hinzufügen der Zeichenkette in C++."
type: docs
weight: 1000
url: /de/cpp/aspose.font.cffdataproviders/cffupdatestringindexstrategy/
---
## CffUpdateStringIndexStrategy enum


Gibt an, wie Zeichenketten im CFF String INDEX-Speicher hinzugefügt werden. Wenn wir versuchen, eine Zeichenkette in den CFF String INDEX einzufügen, kann es vorkommen, dass diese Zeichenkette bereits im String INDEX vorhanden ist. Mit der Option [SearchForDuplicates](./) können wir eine Suche im String INDEX erzwingen, um zu erkennen, ob die Zeichenkette bereits vorhanden ist oder nicht. Dieser Ansatz spart Platz in der String INDEX-Struktur, erfordert jedoch mehr Zeit zum Hinzufügen der Zeichenkette.

```cpp
enum class CffUpdateStringIndexStrategy
```

### Werte

| Name | Wert | Beschreibung |
| --- | --- | --- |
| SearchForDuplicates | 0 | Gibt an, dass die Suche nach der hinzuzufügenden Zeichenkette in der String INDEX-Struktur durchgeführt werden soll, um Duplikate zu vermeiden. |
| AddStringAsIs | 1 | Gibt an, dass keine Prüfungen auf Duplikate durchgeführt werden sollen, wenn ein String hinzugefügt wird. Dieser Ansatz arbeitet schneller, kann jedoch zu ineffizienter Speichernutzung für String INDEX führen. |

## Siehe auch

* Namespace [Aspose::Font::CffDataProviders](../)
* Library [Aspose.Font for C++](../../)

---
title: AbstractPath.Open
second_title: Aspose.GIS für .NET-API-Referenz
description: AbstractPath methode. Öffnet diesAbstrakterPfadals Datei.
type: docs
weight: 120
url: /de/net/aspose.gis/abstractpath/open/
---
## AbstractPath.Open method

Öffnet dies`AbstrakterPfad`als Datei.

```csharp
public abstract Stream Open(FileAccess access)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| access | FileAccess | Gibt eine Teilmenge von Vorgängen an, die für a ausgeführt werden könnenStream. |

### Rückgabewert

AStream mit den angegebenen geöffnetFileAccess .

### Bemerkungen

Wenn*access* hat die FlaggeWrite gesetzt, und die Datei existiert nicht, muss ein Erbe sie erstellen. Ein`AbstrakterPfad` kann mehrfach geöffnet werden`Aspose.GIS` . Dies ist erforderlich, um eine Datei unabhängig mit mehreren Streams zu lesen. Sie sollten das Ergebnis nicht zwischenspeichern, sondern neu zurückgebenStream Jedes Mal wird diese Methode aufgerufen.

### Siehe auch

* class [AbstractPath](../)
* namensraum [Aspose.Gis](../../abstractpath/)
* Montage [Aspose.GIS](../../../)



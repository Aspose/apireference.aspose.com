---
title: Class JobErrorSheet
second_title: Aspose.Page für .NET-API-Referenz
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet klas. Beschreibt die Ausgabe des Fehlerblatts. Der gesamte Job hat ein einziges Fehlerblatt. Standardmäßig sollte der Fehler sheet ausgegeben werdenPageMediaSize und die Standardeinstellung verwendenPageMediaType . Das Fehlerblatt sollte vom Rest des Jobs isoliert werden. Das bedeutet dass alle Endbearbeitungs oder Verarbeitungsoptionen wie z   oder  sollte das Fehlerblatt nicht enthalten. Das Fehlerblatt sollte als letztes Blatt des Auftrags erscheinen. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1290
url: /de/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

Beschreibt die Ausgabe des Fehlerblatts. Der gesamte Job hat ein einziges Fehlerblatt. Standardmäßig sollte der Fehler sheet ausgegeben werden[`PageMediaSize`](../pagemediasize/) und die Standardeinstellung verwenden[`PageMediaType`](../pagemediatype/) . Das Fehlerblatt sollte vom Rest des Jobs isoliert werden. Das bedeutet, dass alle Endbearbeitungs- oder Verarbeitungsoptionen (wie z , , oder ) sollte das Fehlerblatt nicht enthalten. Das Fehlerblatt sollte als letztes Blatt des Auftrags erscheinen. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | Erstellt eine neue Instanz. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Ruft den Elementnamen ab. |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | Fügt eine Liste von Elementen am Ende der Elementliste dieser Funktion hinzu. Jeder muss a sein[`Feature`](../feature/) , ein[`Option`](../option/) oder ein[`Property`](../property/) Instanz. |

## Andere Mitglieder

| Name | Beschreibung |
| --- | --- |
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | Beschreibt die`JobErrorSheet` Funktionsoptionen. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | Beschreibt innere Funktion. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | Die Schnittstelle von jedem`JobErrorSheet` Funktionselement. |

### Siehe auch

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* namensraum [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Montage [Aspose.Page](../../)



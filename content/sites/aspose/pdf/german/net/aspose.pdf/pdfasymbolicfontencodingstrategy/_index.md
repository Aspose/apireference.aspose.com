---
title: Class PdfASymbolicFontEncodingStrategy
second_title: Aspose.PDF for .NET API Reference
description: Aspose.Pdf.PdfASymbolicFontEncodingStrategy class. Diese Klasse beschreibt Regeln, die verwendet werden können, um den Prozess des Kopierens von Encodierungsdaten anzupassen, wenn eine TrueType-Symbolschrift mehr als eine Encodierung besitzt.
type: docs
weight: 8330
url: /de/net/aspose.pdf/pdfasymbolicfontencodingstrategy/
---
## PdfASymbolicFontEncodingStrategy class

Diese Klasse beschreibt Regeln, die verwendet werden können, um den Prozess des Kopierens von Encodierungsdaten anzupassen, wenn eine TrueType-Symbolschrift mehr als eine Encodierung besitzt. Einige PDF-Dokumente können nach der Konvertierung in das PDF/A-Format den Fehler "More than one encoding in symbolic TrueType font's cmap" auslösen. Was ist der Grund für diesen Fehler? Alle TrueType-Symbolschriften verfügen über eine spezielle Tabelle "cmap" in ihren internen Daten. Diese Tabelle ordnet Zeichencodes den Glyphenindizes zu. Zudem kann diese Tabelle verschiedene Encodierung-Untertabellen enthalten, die die verwendeten Encodierungen beschreiben. Siehe weiterführende Informationen zu cmap-Tabellen unter https://developer.apple.com/fonts/TrueType-Reference-Manual/RM06/Chap6cmap.html. Normalerweise enthält die cmap-Tabelle mehrere Encodierung-Untertabellen, aber der PDF/A-Standard schreibt vor, dass entweder nur eine einzelne Encodierung-Untertabelle für diese Schrift im PDF/A-Dokument übrig bleiben darf oder dass unter den Untertabellen dieser Schrift eine (3,0)-Encodierungstabelle vorhanden sein muss. Und die entscheidende Frage lautet – welche Daten müssen aus den anderen Untertabellen entnommen werden, um in die Ziel-Encodierungstabelle (3,0) kopiert zu werden? Die Mehrheit der Schriften verfügt über 'well-formed' cmap-Tabellen, in denen jede Encodierung-Untertabelle vollständig konsistent mit den anderen ist. Aber einige Schriften weisen cmap-Tabellen mit Konflikten auf – beispielsweise, wenn eine Untertabelle für unicode 100 den glyph index 100 besitzt, während eine andere Untertabelle für denselben unicode 100 den glyph index 200 aufweist. Um diese Probleme zu lösen, ist eine spezielle Strategie erforderlich. Standardmäßig wird folgende Strategie angewendet: Es wird nach der mac-Untertabelle(1,0) gesucht. Wird diese Tabelle gefunden, werden nur deren Daten zur Befüllung der Ziel-Tabelle (3,0) verwendet. Falls die mac-Untertabelle nicht gefunden wird, werden alle Untertabellen außer (3,0) durchlaufen und zur Übertragung der Daten in die Ziel-Untertabelle (3,0) genutzt. Außerdem wird die Zuordnung für jeden unicode (unicode, glyph index) in die Ziel-Tabelle kopiert, jedoch nur, wenn diese unicode zum aktuellen Zeitpunkt in der Ziel-Tabelle noch nicht vorhanden ist. So wird beispielsweise, wenn die erste Untertabelle für unicode 100 den glyph index 100 besitzt und die nächste Untertabelle für denselben unicode 100 den glyph index 200 liefert, nur der Datenwert aus der ersten Untertabelle (unicode=100, glyph index = 100) kopiert. Somit hat jede vorhergehende Untertabelle Vorrang vor der folgenden. Die Eigenschaften dieser Klasse `PdfASymbolicFontEncodingStrategy` helfen dabei, das Standardverhalten anzupassen. Ist die Eigenschaft [`PreferredCmapEncodingTable`](./preferredcmapencodingtable/) vom Typ [`CMapEncodingTableType`](../pdfasymbolicfontencodingstrategy.queueitem.cmapencodingtabletype/) gesetzt, wird die entsprechende Untertabelle gegenüber der mac-Untertabelle(1,0) bevorzugt verwendet. Der Wert 'MacTable' aus der Enumeration [`CMapEncodingTableType`](../pdfasymbolicfontencodingstrategy.queueitem.cmapencodingtabletype/) ist in diesem Fall sinnlos, da er auf dieselbe mac-Untertabelle(1,0) verweist, die standardmäßig verwendet wird. Die Eigenschaft [`CmapEncodingTablesPriorityQueue`](./cmapencodingtablespriorityqueue/) hebt alle Prioritäten für beliebige Untertabellen auf. Ist diese Eigenschaft gesetzt, werden nur die in der deklarierten Queue festgelegten Untertabellen in der spezifizierten Reihenfolge verwendet. Falls die angegebenen Untertabellen nicht gefunden werden, wird die oben beschriebene Standarditeration aller Untertabellen und Kopierstrategie angewendet. Das Objekt [`QueueItem`](../pdfasymbolicfontencodingstrategy.queueitem/) legt fest, welche Encodierung-Untertabelle verwendet wird. Diese Untertabelle kann entweder über eine Kombination der Mitglieder (PlatformID, PlatformSpecificId) oder über die Enumeration [`CMapEncodingTableType`](../pdfasymbolicfontencodingstrategy.queueitem.cmapencodingtabletype/) festgelegt werden. Falls die Schrift keine (3,0)-Untertabelle besitzt, wird eine andere Untertabelle verwendet, um die PDF/A-Kompatibilität sicherzustellen. Die Auswahl der zu verwendenden Untertabelle erfolgt nach denselben Regeln wie bereits beschrieben, sodass die Eigenschaften [`PreferredCmapEncodingTable`](./preferredcmapencodingtable/) und [`CmapEncodingTablesPriorityQueue`](./cmapencodingtablespriorityqueue/) zur Bestimmung der resultierenden Untertabelle herangezogen werden, und falls die Schrift nicht über die angeforderten Untertabellen verfügt, wird eine beliebig existierende Untertabelle verwendet.

```csharp
public class PdfASymbolicFontEncodingStrategy
```

## Konstruktoren

| Name | Beschreibung |
| --- | --- |
| [PdfASymbolicFontEncodingStrategy](pdfasymbolicfontencodingstrategy/#constructor)() | Konstruktor. Setzt die Standard-Untertabelle (mac 1,0) |
| [PdfASymbolicFontEncodingStrategy](pdfasymbolicfontencodingstrategy/#constructor_1)(CMapEncodingTableType) | Konstruktor |
| [PdfASymbolicFontEncodingStrategy](pdfasymbolicfontencodingstrategy/#constructor_2)(Queue&lt;QueueItem&gt;) | Konstruktor |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [CmapEncodingTablesPriorityQueue](../../aspose.pdf/pdfasymbolicfontencodingstrategy/cmapencodingtablespriorityqueue/) { get; set; } | Legt die Queue der zu verarbeitenden Encodierung-Untertabellen fest. |
| [PreferredCmapEncodingTable](../../aspose.pdf/pdfasymbolicfontencodingstrategy/preferredcmapencodingtable/) { get; set; } | Legt die Untertabelle fest, die gegenüber der mac-Untertabelle(1,0) bevorzugt verwendet wird. Der Wert 'MacTable' aus der Enumeration [`CMapEncodingTableType`](../pdfasymbolicfontencodingstrategy.queueitem.cmapencodingtabletype/) ist in diesem Fall sinnlos, da er auf dieselbe mac-Untertabelle(1,0) verweist, die standardmäßig verwendet wird. |

### Siehe auch

* Namensraum [Aspose.Pdf](../../aspose.pdf/)
* Assembly [Aspose.PDF](../../)
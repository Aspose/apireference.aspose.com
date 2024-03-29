---
title: EmfPlusSetClipRect
second_title: Aspose.Imaging für .NET-API-Referenz
description: Der EmfPlusSetClipRect-Datensatz kombiniert den aktuellen Clipping-Bereich mit einem Rechteck.
type: docs
weight: 6300
url: /de/net/aspose.imaging.fileformats.emf.emfplus.records/emfplussetcliprect/
---
## EmfPlusSetClipRect class

Der EmfPlusSetClipRect-Datensatz kombiniert den aktuellen Clipping-Bereich mit einem Rechteck.

```csharp
public sealed class EmfPlusSetClipRect : EmfPlusClippingRecordType
```

## Konstrukteure

| Name | Beschreibung |
| --- | --- |
| [EmfPlusSetClipRect](emfplussetcliprect)(EmfPlusRecord) | Initialisiert eine neue Instanz von[`EmfPlusSetClipRect`](../emfplussetcliprect) Klasse. |

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [ClipRect](../../aspose.imaging.fileformats.emf.emfplus.records/emfplussetcliprect/cliprect) { get; set; } | Ruft ein EmfPlusRectF-Objekt (Abschnitt 2.2.2.39) ab oder legt es fest, das das Rechteck definiert, das in der CombineMode-Operation verwendet werden soll. |
| [Cm](../../aspose.imaging.fileformats.emf.emfplus.records/emfplussetcliprect/cm) { get; set; } | Holt oder setzt das CM (4 Bits): Gibt die logische Operation zum Kombinieren zweier Regionen an. Siehe die CombineMode-Enumeration (Abschnitt 2.1.1.4) für die Bedeutung der Werte. |
| virtual [DataSize](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/datasize) { get; set; } | Ruft eine 32-Bit-Ganzzahl ohne Vorzeichen ab oder legt diese fest, die die 32-Bit-ausgerichtete Anzahl von Bytes von Daten im folgenden RecordData-Feld definieren MUSS. Diese Nummer enthält nicht den 12-Byte-Datensatzheader. |
| virtual [Flags](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/flags) { get; set; } | Ruft eine 16-Bit-Ganzzahl ohne Vorzeichen ab oder legt sie fest, die für einige Datensätze Informationen darüber enthält, wie die Operation ausgeführt werden soll, und über die Struktur des Datensatzes. |
| virtual [Size](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/size) { get; set; } | Ruft eine 32-Bit-Ganzzahl ohne Vorzeichen ab oder legt diese fest, die die 32-Bit-ausgerichtete Anzahl von Bytes im gesamten Datensatz angibt, einschließlich des 12-Byte-Datensatzheaders und datensatzspezifischer Daten. |
| [Type](../../aspose.imaging.fileformats.emf.emfplus.records/emfplusrecord/type) { get; } | Ruft eine 16-Bit-Ganzzahl ohne Vorzeichen ab, die den Datensatztyp identifiziert. |

### Siehe auch

* class [EmfPlusClippingRecordType](../emfplusclippingrecordtype)
* namensraum [Aspose.Imaging.FileFormats.Emf.EmfPlus.Records](../../aspose.imaging.fileformats.emf.emfplus.records)
* Montage [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->

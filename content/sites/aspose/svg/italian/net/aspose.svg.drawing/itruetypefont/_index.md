---
title: Interface ITrueTypeFont
second_title: Riferimento API Aspose.SVG per .NET
description: Aspose.Svg.Drawing.ITrueTypeFont interfaccia. Dichiara i metodi per lavorare con il carattere TrueType.
type: docs
weight: 1510
url: /it/net/aspose.svg.drawing/itruetypefont/
---
## ITrueTypeFont interface

Dichiara i metodi per lavorare con il carattere TrueType.

```csharp
public interface ITrueTypeFont
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [DataSize](../../aspose.svg.drawing/itruetypefont/datasize/) { get; } | Restituisce la dimensione dei dati del carattere in byte |
| [FamilyName](../../aspose.svg.drawing/itruetypefont/familyname/) { get; } | Ottieni il nome della famiglia di caratteri. |
| [FullFontName](../../aspose.svg.drawing/itruetypefont/fullfontname/) { get; } | Dovrebbe essere una combinazione di "FamilyName" e "SubFamilyName". Eccezione: se il carattere è "Regular" come indicato in "SubFamilyName", utilizzare solo il cognome contenuto in "FamilyName". Un'eccezione alla definizione precedente di Full font name è per le stringhe della piattaforma Microsoft per i font CFF OpenType: in questo caso, la stringa Full font name deve essere identica al PostScript FontName nel CFF Name INDEX. |
| [SubFamilyName](../../aspose.svg.drawing/itruetypefont/subfamilyname/) { get; } | Il nome della sottofamiglia di font distingue il font in un gruppo con lo stesso nome di famiglia di font. Si presume che si tratti di stile (corsivo, obliquo) e peso (chiaro, grassetto, nero, ecc.). Un font senza particolari differenze di peso o di stile (es. peso medio, non corsivo e fsSelection bit 6 impostato) dovrebbe avere la stringa "Regular" memorizzata in questa posizione. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [GetAscent](../../aspose.svg.drawing/itruetypefont/getascent/)(float) | Restituisce la salita, in punti. |
| [GetData](../../aspose.svg.drawing/itruetypefont/getdata/)() | Apri lo stream con i dati dei font. Il chiamante è responsabile dell'eliminazione del flusso. |
| [GetDescent](../../aspose.svg.drawing/itruetypefont/getdescent/)(float) | Restituisce la discesa, in punti. |

### Guarda anche

* spazio dei nomi [Aspose.Svg.Drawing](../../aspose.svg.drawing/)
* assemblea [Aspose.SVG](../../)



---
title: "System::Drawing::Imaging::Encoder classe"
linktitle: "Encoder"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Imaging::Encoder classe. Rappresenta un GUID associato a un insieme di parametri di codifica dell'immagine. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.drawing.imaging/encoder/
---
## Encoder class


Rappresenta un GUID associato a un insieme di parametri di codifica dell'immagine. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Encoder : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Encoder](./encoder/)(const Guid\&) | Crea una nuova istanza della classe [Encoder](./). |
| [get_Guid](./get_guid/)() const | Restituisce un GUID che specifica un insieme di parametri di codifica dell'immagine rappresentati dall'oggetto corrente. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [ChrominanceTable](./chrominancetable/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria di parametro della tabella di crominanza. |
| static [ColorDepth](./colordepth/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria del parametro di profondità colore. |
| static [Compression](./compression/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria del parametro di compressione. |
| static [LuminanceTable](./luminancetable/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria del parametro della tabella di luminanza. |
| static [Quality](./quality/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria del parametro di qualità. |
| static [RenderMethod](./rendermethod/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria del parametro del metodo di rendering. |
| static [SaveFlag](./saveflag/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria del parametro di flag di salvataggio. |
| static [ScanMethod](./scanmethod/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria del parametro del metodo di scansione. |
| static [Transformation](./transformation/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria del parametro di trasformazione. |
| static [Version](./version/) | Un'istanza della classe [Encoder](./) che rappresenta la categoria del parametro di versione. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)

---
title: "System::Drawing::Imaging::ImageAttributes classe"
linktitle: "ImageAttributes"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Imaging::ImageAttributes classe. Rappresenta le informazioni su come i colori dell'immagine vengono manipolati durante il rendering. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Rappresenta informazioni su come i colori dell'immagine vengono manipolati durante il rendering. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class ImageAttributes : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | NON IMPLEMENTATO. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | NON IMPLEMENTATO. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | NON IMPLEMENTATO. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | NON IMPLEMENTATO. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | NON IMPLEMENTATO. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | NON IMPLEMENTATO. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | NON IMPLEMENTATO. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | NON IMPLEMENTATO. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | NON IMPLEMENTATO. |
| [Clone](./clone/)() | Crea una copia dell'oggetto corrente. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | NON IMPLEMENTATO. |
| [ImageAttributes](./imageattributes/)() | Costruttore predefinito. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | NON IMPLEMENTATO. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | NON IMPLEMENTATO. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | NON IMPLEMENTATO. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Imposta la matrice di correzione del colore. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | NON IMPLEMENTATO. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | NON IMPLEMENTATO. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | NON IMPLEMENTATO. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | NON IMPLEMENTATO. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | NON IMPLEMENTATO. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | NON IMPLEMENTATO. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Imposta la modalità di avvolgimento e il colore usati per decidere come ripetere una texture su una forma, o ai bordi della forma. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)

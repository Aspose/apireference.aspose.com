---
title: "classe System::Drawing::Imaging::ImageAttributes"
linktitle: "ImageAttributes"
second_title: "Aspose.Page per C++"
description: "classe System::Drawing::Imaging::ImageAttributes. Rappresenta informazioni su come i colori dell'immagine vengono manipolati durante il rendering. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 900
url: /it/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Rappresenta informazioni su come i colori dell'immagine vengono manipolati durante il rendering. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class ImageAttributes : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | NOT IMPLEMENTED. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | NOT IMPLEMENTED. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | NOT IMPLEMENTED. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | NOT IMPLEMENTED. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | NOT IMPLEMENTED. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | NOT IMPLEMENTED. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | NOT IMPLEMENTED. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | NOT IMPLEMENTED. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | NOT IMPLEMENTED. |
| [Clone](./clone/)() | Crea una copia dell'oggetto corrente. |
| [Dispose](./dispose/)() | Rilascia tutte le risorse del sistema operativo acquisite dall'oggetto corrente. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | NOT IMPLEMENTED. |
| [ImageAttributes](./imageattributes/)() | Costruttore predefinito. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | NOT IMPLEMENTED. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | NOT IMPLEMENTED. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | NOT IMPLEMENTED. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Imposta la matrice di regolazione del colore. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | NOT IMPLEMENTED. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | NOT IMPLEMENTED. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | NOT IMPLEMENTED. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | NOT IMPLEMENTED. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | NOT IMPLEMENTED. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | NOT IMPLEMENTED. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Imposta la modalità di avvolgimento e il colore usati per decidere come ripetere una texture su una forma, o ai bordi della forma. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)

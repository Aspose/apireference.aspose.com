---
title: "System::Drawing::Imaging::ImageAttributes Klasse"
linktitle: "ImageAttributes"
second_title: "Aspose.Font für C++"
description: "System::Drawing::Imaging::ImageAttributes Klasse. Stellt Informationen darüber bereit, wie Bildfarben während des Renderns manipuliert werden. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


Stellt Informationen darüber bereit, wie Bildfarben beim Rendern manipuliert werden. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ImageAttributes : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | NICHT IMPLEMENTIERT. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [Clone](./clone/)() | Erstellt eine Kopie des aktuellen Objekts. |
| [Dispose](./dispose/)() | Gibt alle vom aktuellen Objekt erworbenen Betriebssystemressourcen frei. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [ImageAttributes](./imageattributes/)() | Standardkonstruktor. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | NICHT IMPLEMENTIERT. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | Setzt die Farbkorrekturmatrix. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | NICHT IMPLEMENTIERT. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | Setzt den Wrap-Modus und die Farbe, die verwendet werden, um zu bestimmen, wie eine Textur über einer Form gekachelt wird oder an Formgrenzen. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)

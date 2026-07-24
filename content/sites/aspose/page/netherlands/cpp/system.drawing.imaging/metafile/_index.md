---
title: "System::Drawing::Imaging::Metafile klasse"
linktitle: "Metafile"
second_title: "Aspose.Page voor C++"
description: "System::Drawing::Imaging::Metafile klasse. Stelt een grafisch metafile voor. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1200
url: /nl/cpp/system.drawing.imaging/metafile/
---
## Metafile class


Stelt een grafisch metafile voor. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class Metafile : public System::Drawing::Image
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clone](./clone/)() override | Retourneert een kopie van het huidige object. |
| [get_Height](./get_height/)() const override | Retourneert de hoogte van de afbeelding in pixels. |
| [get_PixelFormat](./get_pixelformat/)() const override | Retourneert een waarde die het pixelformaat aangeeft. |
| [get_RawFormat](./get_rawformat/)() const override | Retourneert een waarde die het afbeeldingsformaat aangeeft. |
| [get_Width](./get_width/)() const override | Retourneert de breedte van de afbeelding in pixels. |
| [GetHenhmetafile](./gethenhmetafile/)() | NOG NIET GEÏMPLENTEERD. |
| [GetMetafileHeader](./getmetafileheader/)() | Retourneert een header die bij het huidige object hoort. |
| [Metafile](./metafile/)(const System::String\&) | NOG NIET GEÏMPLENTEERD. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | NOG NIET GEÏMPLENTEERD. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | NOG NIET GEÏMPLENTEERD. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | NOG NIET GEÏMPLENTEERD. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | NOG NIET GEÏMPLENTEERD. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | NOG NIET GEÏMPLENTEERD. |
| [Metafile](./metafile/)(IntPtr, EmfType) | NOG NIET GEÏMPLENTEERD. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | NOG NIET GEÏMPLENTEERD. |
| virtual [~Metafile](./~metafile/)() | Destructor. |
## Zie ook

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)

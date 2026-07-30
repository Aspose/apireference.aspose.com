---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Imaging::Metafile class. Rappresenta un metafile grafico. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.drawing.imaging/metafile/
---
## Metafile class


Rappresenta un metafile grafico. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarla alle funzioni come argomento.

```cpp
class Metafile : public System::Drawing::Image
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Restituisce una copia dell'oggetto corrente. |
| [get_Height](./get_height/)() const override | Restituisce le altezze dell'immagine in pixel. |
| [get_PixelFormat](./get_pixelformat/)() const override | Restituisce un valore che indica il formato dei pixel. |
| [get_RawFormat](./get_rawformat/)() const override | Restituisce un valore che indica il formato dell'immagine. |
| [get_Width](./get_width/)() const override | Restituisce la larghezza dell'immagine in pixel. |
| [GetHenhmetafile](./gethenhmetafile/)() | NON IMPLEMENTATO. |
| [GetMetafileHeader](./getmetafileheader/)() | Restituisce un'intestazione associata all'oggetto corrente. |
| [Metafile](./metafile/)(const System::String\&) | NON IMPLEMENTATO. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | NON IMPLEMENTATO. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | NON IMPLEMENTATO. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | NON IMPLEMENTATO. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | NON IMPLEMENTATO. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | NON IMPLEMENTATO. |
| [Metafile](./metafile/)(IntPtr, EmfType) | NON IMPLEMENTATO. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | NON IMPLEMENTATO. |
| virtual [~Metafile](./~metafile/)() | Distruttore. |
## Vedi anche

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)

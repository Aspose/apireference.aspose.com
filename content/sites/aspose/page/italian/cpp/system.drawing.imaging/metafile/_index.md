---
title: "System::Drawing::Imaging::Metafile class"
linktitle: "Metafile"
second_title: "Aspose.Page per C++"
description: "System::Drawing::Imaging::Metafile class. Rappresenta un metafile grafico. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1200
url: /it/cpp/system.drawing.imaging/metafile/
---
## Metafile class


Rappresenta un metafile grafico. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class Metafile : public System::Drawing::Image
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Clone](./clone/)() override | Restituisce una copia dell'oggetto corrente. |
| [get_Height](./get_height/)() const override | Restituisce le altezze dell'immagine in pixel. |
| [get_PixelFormat](./get_pixelformat/)() const override | Restituisce un valore che indica il formato pixel. |
| [get_RawFormat](./get_rawformat/)() const override | Restituisce un valore che indica il formato immagine. |
| [get_Width](./get_width/)() const override | Restituisce la larghezza dell'immagine in pixel. |
| [GetHenhmetafile](./gethenhmetafile/)() | NOT IMPLEMENTED. |
| [GetMetafileHeader](./getmetafileheader/)() | Restituisce un'intestazione associata all'oggetto corrente. |
| [Metafile](./metafile/)(const System::String\&) | NOT IMPLEMENTED. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&) | NOT IMPLEMENTED. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, EmfType) | NOT IMPLEMENTED. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr) | NOT IMPLEMENTED. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, Rectangle, MetafileFrameUnit, EmfType) | NOT IMPLEMENTED. |
| [Metafile](./metafile/)(const SharedPtr\<System::IO::Stream\>\&, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | NOT IMPLEMENTED. |
| [Metafile](./metafile/)(IntPtr, EmfType) | NOT IMPLEMENTED. |
| [PlayRecord](./playrecord/)(EmfPlusRecordType, int32_t, int32_t, System::ByteArrayPtr) | NOT IMPLEMENTED. |
| virtual [~Metafile](./~metafile/)() | Distruttore. |
## Vedi anche

* Class [Image](../../system.drawing/image/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Drawing::Imaging::BitmapData class"
linktitle: "BitmapData"
second_title: "Aspose.Font per C++"
description: "System::Drawing::Imaging::BitmapData class. Rappresenta un insieme di attributi di un'immagine bitmap. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.drawing.imaging/bitmapdata/
---
## BitmapData class


Rappresenta un insieme di attributi di un'immagine bitmap. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class BitmapData : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_Height](./get_height/)() const | Restituisce l'altezza dell'immagine in pixel. |
| [get_PixelFormat](./get_pixelformat/)() const | Restituisce il formato pixel dell'immagine bitmap. |
| [get_Scan0](./get_scan0/)() const | Restituisce l'indirizzo del primo dato pixel nella bitmap. |
| [get_Stride](./get_stride/)() const | Restituisce la larghezza di stride dell'immagine in byte. |
| [get_Width](./get_width/)() const | Restituisce la larghezza dell'immagine in pixel. |
| [set_Height](./set_height/)(int) | Imposta l'altezza dell'immagine in pixel. |
| [set_PixelFormat](./set_pixelformat/)(PixelFormat) | Imposta il formato pixel dell'immagine bitmap. |
| [set_Scan0](./set_scan0/)(IntPtr) | Imposta l'indirizzo del primo dato pixel nella bitmap. |
| [set_Stride](./set_stride/)(int) | Imposta la larghezza di stride dell'immagine in byte. |
| [set_Width](./set_width/)(int) | Imposta la larghezza dell'immagine in pixel. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)

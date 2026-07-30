---
title: "System::Drawing::Bitmap class"
linktitle: "Bitmap"
second_title: "Aspose.Font per C++"
description: "Classe System::Drawing::Bitmap. Rappresenta un'immagine bitmap GDI+. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.drawing/bitmap/
---
## Bitmap class


Rappresenta un'immagine bitmap GDI+. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Bitmap : public System::Drawing::Image
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BeginPixelProcessing](./beginpixelprocessing/)(bool) | Abilita la modalità di elaborazione dei pixel. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&) | Crea un nuovo oggetto [Bitmap](./) dall'immagine esistente specificata. |
| [Bitmap](./bitmap/)(const SharedPtr\<System::IO::Stream\>\&, bool) | Crea un nuovo oggetto [Bitmap](./) dallo stream specificato. |
| [Bitmap](./bitmap/)(const String\&) | Crea un nuovo oggetto [Bitmap](./) dal file specificato. |
| [Bitmap](./bitmap/)(const String\&, bool) | Crea un nuovo oggetto [Bitmap](./) dal file specificato. |
| [Bitmap](./bitmap/)(int, int, Imaging::PixelFormat) | Crea un nuovo oggetto [Bitmap](./) che rappresenta un'immagine bitmap con la larghezza, altezza, formato pixel e dati pixel specificati. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, const Size\&) | Crea un nuovo oggetto [Bitmap](./) dall'immagine esistente specificata, ridimensionata alla dimensione specificata. |
| [Bitmap](./bitmap/)(const SharedPtr\<Image\>\&, int, int) | Crea un nuovo oggetto [Bitmap](./) dall'immagine esistente specificata con larghezza e altezza ridimensionate ai valori specificati. |
| [Clone](./clone/)() override | Crea una copia dell'oggetto corrente. |
| [Clone](./clone/)(Rectangle, Imaging::PixelFormat) | Crea un oggetto [Bitmap](./) che rappresenta una copia di una regione dell'immagine bitmap rappresentata dall'oggetto corrente. |
| [Clone](./clone/)(RectangleF, Imaging::PixelFormat) | Crea un oggetto [Bitmap](./) che rappresenta una copia di una regione dell'immagine bitmap rappresentata dall'oggetto corrente. |
| [ComputeHash](./computehash/)() | Calcola il valore hash SHA1. |
| static [ConvertToARGBImage](./converttoargbimage/)(const SharedPtr\<Bitmap\>\&) | Crea una copia dell'immagine bitmap specificata con il formato pixel modificato in Format32bppArgb. |
| [EndPixelProcessing](./endpixelprocessing/)(bool) | Disabilita la modalità di elaborazione dei pixel. |
| [get_Height](./get_height/)() const override | Restituisce l'altezza dell'immagine in pixel. |
| [get_Palette](./get_palette/)() const override | Restituisce la tavolozza dei colori usata dall'immagine rappresentata dall'oggetto corrente. |
| [get_PixelFormat](./get_pixelformat/)() const override | Restituisce il formato pixel dell'immagine rappresentata dall'oggetto corrente. |
| [get_RawFormat](./get_rawformat/)() const override | Restituisce il formato file dell'immagine rappresentata dall'oggetto corrente. |
| [get_Width](./get_width/)() const override | Restituisce la larghezza dell'immagine in pixel. |
| [GetHbitmap](./gethbitmap/)() | Crea un oggetto bitmap GDI dall'immagine bitmap rappresentata dall'oggetto corrente. |
| [GetPixel](./getpixel/)(int, int) | Restituisce il colore del pixel specificato. |
| [GetSkBitmap](./getskbitmap/)() const override | Restituisce un puntatore grezzo all'oggetto SkBitmap sottostante. |
| [IsMultiImage](./ismultiimage/)() const override | Restituisce se il formato originale è un'immagine multipla. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat) | Blocca un [Bitmap](./) nella memoria di sistema. |
| [LockBits](./lockbits/)(const Rectangle\&, Imaging::ImageLockMode, Imaging::PixelFormat, const Imaging::BitmapDataPtr\&) | Blocca un [Bitmap](./) nella memoria di sistema. |
| [MakeTransparent](./maketransparent/)(Color) | Cambia il colore di tutti i pixel con il colore specificato in trasparente. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(Bitmap, CODEPORTING_ARGS(const SharedPtr\<Image\>\&original, int width, int height), CODEPORTING_ARGS(original, width, height)) |  |
| [PremultipleColors](./premultiplecolors/)() | Pre-moltiplica i colori dei pixel dell'immagine rappresentata dall'oggetto corrente. |
| [RotateFlip](./rotateflip/)(RotateFlipType) override | Ruota l'immagine a multipli di 90 gradi e la capovolge. |
| [set_Palette](./set_palette/)(Imaging::ColorPalettePtr) override | Imposta la tavolozza dei colori usata dall'immagine rappresentata dall'oggetto corrente. |
| [SetPixel](./setpixel/)(int, int, Color) | Imposta il colore del pixel specificato nell'immagine bitmap rappresentata dall'oggetto corrente. |
| [SetResolution](./setresolution/)(float, float) | Imposta la risoluzione dell'immagine. |
| [UnlockBits](./unlockbits/)(const Imaging::BitmapDataPtr\&) | Sblocca la bitmap specificata dalla memoria di sistema. |
## Vedi anche

* Class [Image](../image/)
* Namespace [System::Drawing](../)
* Library [Aspose.Font for C++](../../)

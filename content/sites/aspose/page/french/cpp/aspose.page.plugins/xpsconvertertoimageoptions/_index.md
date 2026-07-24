---
title: "Aspose::Page::Plugins::XpsConverterToImageOptions classe"
linktitle: "XpsConverterToImageOptions"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::Plugins::XpsConverterToImageOptions classe. Représente les options du convertisseur XPS vers Image pour le plugin XpsConverter en C++."
type: docs
weight: 2100
url: /fr/cpp/aspose.page.plugins/xpsconvertertoimageoptions/
---
## XpsConverterToImageOptions class


Représente les options du convertisseur [XPS](../../aspose.page.xps/) vers Image pour le plugin [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterToImageOptions : public Aspose::Page::Plugins::XpsConverterOptions
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_ImageFormat](./get_imageformat/)() const | Obtient/definit le type d'image. |
| [get_OperationName](./get_operationname/)() override | Renvoie le nom de l'opération. |
| [get_PageNumbers](./get_pagenumbers/)() const | Obtient/definit le tableau des numéros de pages du document [XPS](../../aspose.page.xps/) à convertir. Si non défini, toutes les pages seront converties. |
| [get_Resolution](./get_resolution/)() const | Obtient/definit la résolution de l'image. |
| [get_Size](./get_size/)() const | Obtient/definit la taille de l'image résultante. |
| [get_SmoothingMode](./get_smoothingmode/)() const | Obtient/definit le mode de lissage pour le rendu de l'image. |
| [set_ImageFormat](./set_imageformat/)(Aspose::Page::Drawing::Imaging::ImageFormat) | Obtient/definit le type d'image. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) | Obtient/definit le tableau des numéros de pages du document [XPS](../../aspose.page.xps/) à convertir. Si non défini, toutes les pages seront converties. |
| [set_Resolution](./set_resolution/)(float) | Obtient/definit la résolution de l'image. |
| [set_Size](./set_size/)(System::Drawing::Size) | Obtient/definit la taille de l'image résultante. |
| [set_SmoothingMode](./set_smoothingmode/)(System::Nullable\<System::Drawing::Drawing2D::SmoothingMode\>) | Obtient/definit le mode de lissage pour le rendu de l'image. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)() | Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](./) avec les options par défaut. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat) | Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](./) avec le format d'image. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(System::Drawing::Size) | Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](./) avec une taille de l'image résultante. |
| [XpsConverterToImageOptions](./xpsconvertertoimageoptions/)(Aspose::Page::Drawing::Imaging::ImageFormat, System::Drawing::Size) | Initialise une nouvelle instance de l'objet [XpsConverterToImageOptions](./) avec le format d'image et une taille de l'image résultante. |
## Voir aussi

* Class [XpsConverterOptions](../xpsconverteroptions/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)

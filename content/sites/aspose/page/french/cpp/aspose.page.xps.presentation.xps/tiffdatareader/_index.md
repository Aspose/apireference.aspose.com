---
title: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader classe"
linktitle: "TiffDataReader"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Presentation::Xps::TiffDataReader classe. La classe est utilisée pour lire les données du répertoire de fichiers d'image TIFF (IFD). Elle aide à lire la résolution TIFF et à vérifier la conformité TIFF en C++."
type: docs
weight: 100
url: /fr/cpp/aspose.page.xps.presentation.xps/tiffdatareader/
---
## TiffDataReader class


La classe est utilisée pour lire les données du répertoire de fichiers d'image TIFF (IFD). Elle aide à lire la résolution TIFF et à vérifier la conformité TIFF.

```cpp
class TiffDataReader : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_ImageHeight](./get_imageheight/)() | Renvoie la hauteur de l'image Tiff. Si la hauteur est 0, renvoie la valeur par défaut (100). |
| [get_ImageWidth](./get_imagewidth/)() | Renvoie la largeur de l'image Tiff. Si la largeur est 0, renvoie la valeur par défaut (100). |
| [get_ImageXResolution](./get_imagexresolution/)() const | Renvoie la résolution X de l'image Tiff. |
| [get_ImageYResolution](./get_imageyresolution/)() const | Renvoie la résolution Y de l'image Tiff. |
| [get_IsConformXpsSpecification](./get_isconformxpsspecification/)() | Renvoie true si l'image TIFF est conforme à la spécification [XPS](../../aspose.page.xps/) et peut être insérée dans le document [XPS](../../aspose.page.xps/) tel quel. |
| static [IsTiff](./istiff/)(System::ArrayPtr\<uint8_t\>) | La documentation du format se trouve dans Aspose.Words\Doc. |
| [TiffDataReader](./tiffdatareader/)(System::ArrayPtr\<uint8_t\>) | Initialise une nouvelle instance de la classe [TiffDataReader](./). |
| [TiffDataReader](./tiffdatareader/)(System::SharedPtr\<Foundation::BigEndianBinaryReader\>) | Initialise une nouvelle instance de la classe [TiffDataReader](./). |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation::Xps](../)
* Library [Aspose.Page for C++](../../)

---
title: "Aspose::Page::EPS::PsDocument classe"
linktitle: "PsDocument"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::EPS::PsDocument classe. Cette classe encapsule les documents PS/EPS en C++."
type: docs
weight: 700
url: /fr/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Cette classe encapsule les documents PS/EPS.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Ajoute un clip à l'état graphique actuel. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Ajoute un clip à l'état graphique actuel puis écrit l'opérateur "newpath". Il est nécessaire de le faire pour éviter la confluence de ce chemin de découpage et de certains chemins ultérieurs tels que les glyphes tracés avec l'opérateur "charpath". |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Ajoute un rectangle de découpage à l'état graphique actuel. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Ajoute un clip à partir du contour du texte donné dans la police donnée. |
| [ClosePage](./closepage/)() | Complète la page actuelle. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Convertit la police Type 1 en **TrueType**. Le nom de la police TTF convertie sera le même que la police Type 1 d'entrée avec l'extension ".ttf". Le fichier TTF sera enregistré dans le répertoire de sortie assigné. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Convertit la police Type 3 en **TrueType**. Le nom de la police TTF convertie sera le même que le fichier de police Type 3 d'entrée avec l'extension ".ttf". Le fichier TTF sera enregistré dans le répertoire de sortie assigné. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Convertit la police Type 3 en flux **TrueType**. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Recadre le [PsDocument](./) donné en fichier [EPS](../). Il enregistre le fichier [EPS](../) initial avec le %BoundingBox existant mis à jour ou un nouveau sera créé. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Recadre le [PsDocument](./) donné en fichier [EPS](../). Il enregistre le fichier [EPS](../) initial avec le %BoundingBox existant mis à jour ou un nouveau sera créé. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Dessine un chemin arbitraire. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Dessine un arc. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Dessine une image masquée. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Dessine une image. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Dessine une image transformée avec arrière-plan. |
| [DrawLine](./drawline/)(double, double, double, double) | Dessine un segment de ligne. |
| [DrawOval](./drawoval/)(double, double, double, double) | Dessine un ovale. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Dessine un polygone. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Dessine un poligone. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Dessine une polyligne. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Dessine une polyligne. |
| [DrawRect](./drawrect/)(double, double, double, double) | Dessine un rectangle. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Dessine un rectangle arrondi. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Dessine une image transparente transformée. Si l'image n'a pas de canal Alpha, elle sera dessinée comme une image opaque. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Lit le fichier [EPS](../) et extrait la boîte englobante de l'image [EPS](../) à partir du commentaire %BoundingBox ou les limites pour la taille de page par défaut (0, 0, 595, 842) si elle n'existe pas. |
| [ExtractEpsSize](./extractepssize/)() | Lit le fichier [EPS](../) et extrait la taille de l'image [EPS](../) à partir du commentaire %BoundingBox ou la taille de page par défaut (595, 842) si elle n'existe pas. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Extrait le texte d'un fichier PS. Le texte ne peut être extrait que s'il est écrit avec une police Type 42 (**TrueType**) ou une police Type 0 contenant des polices Type 42 dans sa carte vectorielle. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Remplit un chemin arbitraire. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes et en dessinant les contours des glyphes. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes et en dessinant les contours des glyphes. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes et en dessinant les contours des glyphes. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes et en dessinant les contours des glyphes. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Remplit un arc. |
| [FillOval](./filloval/)(double, double, double, double) | Remplit une ellipse. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Remplit un poligone. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Remplit un poligone. |
| [FillRect](./fillrect/)(double, double, double, double) | Remplit un rectangle. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Remplit un rectangle arrondi. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Ajoute une chaîne de texte en remplissant l'interrior des glyphes. |
| [get_InputStream](./get_inputstream/)() | Initialise [PsDocument](./) avec un flux et des options de chargement. |
| [get_NumberOfPages](./get_numberofpages/)() const | Renvoie le nombre de pages du document PDF résultant. |
| [GetPaint](./getpaint/)() | Obtient le paint de l'état graphique actuel. |
| [GetStroke](./getstroke/)() | Définit le trait dans l'état graphique actuel. |
| [GetXmpMetadata](./getxmpmetadata/)() | Lit le fichier PS/EPS et extrait les XmpMetdata s'ils existent déjà ou en ajoute de nouveaux s'ils n'existent pas. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Fusionne les fichiers PS/EPS vers un dispositif. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | Fusionne les fichiers PS/EPS vers un dispositif. |
| [OpenPage](./openpage/)(float, float) | Crée une nouvelle page et la rend actuelle. |
| [OpenPage](./openpage/)(System::String) | Crée une nouvelle page avec la taille du document et la rend actuelle. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Ajoute une chaîne de texte en dessinant les contours des glyphes. |
| [PsDocument](./psdocument/)() | Initialise un [PsDocument](./) vide. Ce constructeur n'est utilisé que pour des opérations supplémentaires qui ne sont pas liées aux fichiers PostScript, par exemple la conversion de polices. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Initialise un [PsDocument](./) vide avec une page initialisée. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Initialise un [PsDocument](./) vide avec une page initialisée. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initialise un [PsDocument](./) vide. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Initialise un [PsDocument](./) vide. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initialise un [PsDocument](./) vide lorsque le nombre de pages du document [Postscript](../../aspose.page.eps.postscript/) est connu à l'avance. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Initialise un [PsDocument](./) vide lorsque le nombre de pages du document [Postscript](../../aspose.page.eps.postscript/) est connu à l'avance. |
| [PsDocument](./psdocument/)(System::String) | Initialise le [PsDocument](./) avec un fichier PS/EPS d'entrée. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | Initialise le [PsDocument](./) avec un flux de fichier PS/EPS. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Redimensionne le [PsDocument](./) donné en fichier [EPS](../). Cette méthode n'est utilisée qu'après l'extraction de la taille du [EPS](../). Elle enregistre le [EPS](../) initial filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hThe output directory where image file will be saved.e avec le %BoundingBox existant mis à jour ou un nouveau sera créé. La matrice de transformation [Page](../../aspose.page/) sera également définie. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Redimensionne le [PsDocument](./) donné en fichier [EPS](../). Cette méthode n'est utilisée qu'après l'extraction de la taille du [EPS](../). Elle enregistre le fichier [EPS](../) initial avec le %BoundingBox existant mis à jour ou crée un nouveau. La matrice de transformation [Page](../../aspose.page/) sera également définie. |
| [Rotate](./rotate/)(float) | Ajoute une rotation dans le sens inverse des aiguilles d'une montre autour de l'origine à l'état graphique actuel (rotation de la matrice actuelle). |
| [Rotate](./rotate/)(int32_t) | Ajoute une rotation dans le sens inverse des aiguilles d'une montre autour de l'origine à l'état graphique actuel (rotation de la matrice actuelle). |
| [Save](./save/)(System::String) | Enregistre le [PsDocument](./) donné en fichier [EPS](../). Cette méthode n'est utilisée qu'après la mise à jour des métadonnées [XMP](../../aspose.page.eps.xmp/). Elle enregistre le fichier [EPS](../) initial avec les métadonnées existantes mises à jour ou crée un nouveau lors de l'appel de la méthode GetMetadata. Dans ce dernier cas, tout le code PostScript nécessaire et les commentaires [EPS](../) sont ajoutés. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Enregistre le [PsDocument](./) donné dans le flux. Cette méthode n'est utilisée qu'après la mise à jour des métadonnées [XMP](../../aspose.page.eps.xmp/). Elle enregistre le fichier [EPS](../) initial avec les métadonnées existantes mises à jour ou crée un nouveau lors de l'appel de la méthode GetMetadata. Dans ce dernier cas, tout le code PostScript nécessaire et les commentaires [EPS](../) sont ajoutés. |
| [Save](./save/)() | Enregistre le [PsDocument](./) donné en fichier PS ou [EPS](../). Cette méthode n'est utilisée que lorsque le [PsDocument](./) a été créé à partir de zéro. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Enregistre le fichier PS/EPS en fichier image. Le répertoire de sortie et le nom du fichier seront les mêmes que ceux du fichier PS d'entrée. L'extension du fichier correspondra au format d'image indiqué dans le paramètre "options". Si le document a été initialisé avec un flux qui n'est pas un FileStream, le fichier image sera enregistré dans le dossier actuel avec le modèle de nom de fichier par défaut. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | Enregistre le fichier PS/EPS en fichier image dans le répertoire spécifié avec le nom de fichier spécifié. L'extension du fichier correspondra au format d'image indiqué dans le paramètre "options". |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | Enregistre le fichier PS/EPS dans des tableaux d'octets d'images. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | Enregistre le fichier PS/EPS en fichier PDF. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | Enregistre le fichier PS/EPS dans un flux PDF. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Enregistre l'image PNG/JPEG/TIFF/BMP/GIF/EMF depuis le flux d'entrée vers le flux de sortie [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Enregistre l'image PNG/JPEG/TIFF/BMP/GIF/EMF depuis le fichier vers le fichier [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Enregistre l'objet Bitmap dans le fichier [EPS](../). |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Enregistre l'objet Bitmap dans le flux de sortie [EPS](../). |
| [Scale](./scale/)(float, float) | Ajoute une mise à l'échelle à l'état graphique actuel (mise à l'échelle de la matrice actuelle). |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | Initialise [PsDocument](./) avec un flux et des options de chargement. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Définit les paramètres du dispositif de page (voir l'opérateur "setpagedevice" de la spécification PostScript). Parmi ceux-ci, il peut y avoir la taille de la page, la couleur, etc. |
| [SetPageSize](./setpagesize/)(float, float) | Définit la taille de la page. Pour créer des pages de tailles différentes dans un même document, utilisez la méthode [SetPageDevice](./setpagedevice/) juste après cette méthode. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Définit la peinture dans l'état graphique actuel. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Définit le trait dans l'état graphique actuel. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Définit la transformation actuelle sur celle-ci. |
| [Shear](./shear/)(float, float) | Fait pivoter l'état graphique actuel dans le sens inverse des aiguilles d'une montre autour d'un point. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Ajoute une transformation à l'état graphique actuel (concatène cette matrice avec celle actuelle). |
| [Translate](./translate/)(float, float) | Ajoute une translation à l'état graphique actuel (déplace la matrice actuelle). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Écrit la restauration de l'état graphique actuel (voir la spécification PostScript pour l'opérateur "grestore"). |
| [WriteGraphicsSave](./writegraphicssave/)() | Écrit la sauvegarde de l'état graphique actuel (voir la spécification PostScript pour l'opérateur "gsave"). |
## Voir aussi

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

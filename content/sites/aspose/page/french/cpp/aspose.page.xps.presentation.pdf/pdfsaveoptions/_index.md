---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions class"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions class. Classe pour les options d’enregistrement XPS‑vers‑PDF en C++."
type: docs
weight: 300
url: /fr/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


Classe pour les options d'enregistrement XPS-en-PDF.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Spécifie la taille d'une portion de pages à transmettre d'un nœud à l'autre. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | La collection de gestionnaires d'événements qui effectue des modifications sur une page [XPS](../../aspose.page.xps/) juste avant qu'elle ne soit enregistrée. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Obtient les détails du chiffrement. Si non défini, aucun chiffrement ne sera effectué. |
| [get_ImageCompression](./get_imagecompression/)() const | Spécifie le type de compression à utiliser pour toutes les images du document. La valeur par défaut est [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | Spécifie jusqu’à quel niveau le plan du document doit être développé lorsqu’on ouvre le fichier PDF dans un visualiseur. 1 - seuls les éléments du premier niveau sont affichés, 2 - les éléments du premier et du deuxième niveau sont affichés, etc. La valeur par défaut est 1. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Spécifie la hauteur de l’arbre du plan du document à enregistrer. 0 - l’arbre du plan ne sera pas converti, 1 - seuls les éléments du premier niveau seront convertis, etc. La valeur par défaut est 10. |
| [get_PageNumbers](./get_pagenumbers/)() override | Obtient/definit le tableau des numéros de pages à convertir. |
| [get_PreserveText](./get_preservetext/)() override | Dans [XPS](../../aspose.page.xps/), certains éléments de texte peuvent contenir des références à des formes de glyphes alternatives qui ne correspondent à aucun code de caractère dans la police. Si ce drapeau est défini sur true, le texte de ces éléments [XPS](../../aspose.page.xps/) est converti en formes graphiques. Le texte lui‑-même apparaît alors transparent au-dessus. Cela rend le texte de ces éléments sélectionnable. Cependant, l’effet secondaire est que le fichier de sortie peut être beaucoup plus volumineux que l’original. Si ce drapeau est défini sur false, les caractères qui devraient être affichés sous forme de glyphes alternatifs sont remplacés par d’autres caractères qui sont mappés aux formes de glyphes alternatives. Ainsi, le texte, bien qu’encore sélectionnable, sera modifié et deviendra probablement illisible. La valeur par défaut est false. |
| [get_TextCompression](./get_textcompression/)() const | Spécifie à quel niveau du plan du document afficher les objets [ApsBookmark](../). 0 - non affiché. 1 au premier niveau, etc. La valeur par défaut est 0. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Crée une nouvelle instance d'options. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Spécifie la taille d'une portion de pages à transmettre d'un nœud à l'autre. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Définit les détails du chiffrement. Si non défini, aucun chiffrement ne sera effectué. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Spécifie le type de compression à utiliser pour toutes les images du document. La valeur par défaut est [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | Spécifie jusqu’à quel niveau le plan du document doit être développé lorsqu’on ouvre le fichier PDF dans un visualiseur. 1 - seuls les éléments du premier niveau sont affichés, 2 - les éléments du premier et du deuxième niveau sont affichés, etc. La valeur par défaut est 1. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Spécifie la hauteur de l’arbre du plan du document à enregistrer. 0 - l’arbre du plan ne sera pas converti, 1 - seuls les éléments du premier niveau seront convertis, etc. La valeur par défaut est 10. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Obtient/definit le tableau des numéros de pages à convertir. |
| [set_PreserveText](./set_preservetext/)(bool) override | Dans [XPS](../../aspose.page.xps/), certains éléments de texte peuvent contenir des références à des formes de glyphes alternatives qui ne correspondent à aucun code de caractère dans la police. Si ce drapeau est défini sur true, le texte de ces éléments [XPS](../../aspose.page.xps/) est converti en formes graphiques. Le texte lui‑-même apparaît alors transparent au-dessus. Cela rend le texte de ces éléments sélectionnable. Cependant, l’effet secondaire est que le fichier de sortie peut être beaucoup plus volumineux que l’original. Si ce drapeau est défini sur false, les caractères qui devraient être affichés sous forme de glyphes alternatifs sont remplacés par d’autres caractères qui sont mappés aux formes de glyphes alternatives. Ainsi, le texte, bien qu’encore sélectionnable, sera modifié et deviendra probablement illisible. La valeur par défaut est false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Spécifie à quel niveau du plan du document afficher les objets [ApsBookmark](../). 0 - non affiché. 1 au premier niveau, etc. La valeur par défaut est 0. |
## Voir aussi

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)

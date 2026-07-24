---
title: "Méthode Aspose::Page::XPS::XpsDocument::SaveAsImage"
linktitle: "SaveAsImage"
second_title: "Aspose.Page pour C++"
description: "Méthode Aspose::Page::XPS::XpsDocument::SaveAsImage. Enregistre le document dans un fichier image. Le répertoire de sortie et le nom de fichier seront les mêmes que ceux du fichier XPS d'entrée. L'extension du fichier correspondra au format d'image dans le paramètre \"options\". Si le document a été initialisé avec un flux qui n'est pas FileStream, le fichier image sera enregistré dans le dossier actuel avec le modèle de nom de fichier par défaut en C++."
type: docs
weight: 5500
url: /fr/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


Enregistre le document en fichier image. Le répertoire de sortie et le nom de fichier seront les mêmes que ceux du fichier [XPS](../../) d'entrée. L'extension du fichier correspondra au format d'image dans le paramètre "options". Si le document a été initialisé avec un flux qui n'est pas un FileStream, le fichier image sera enregistré dans le dossier actuel avec le modèle de nom de fichier par défaut.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Options pour enregistrer le document au format d'image bitmap. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


Enregistre le document dans un fichier image dans le répertoire spécifié avec le nom de fichier indiqué. L'extension du fichier correspondra au format d'image indiqué dans le paramètre "options".

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| options | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | Options pour enregistrer le document au format d'image bitmap. |
| outDir | System::String | Le répertoire de sortie où le fichier image sera enregistré. |
| fileNameTemplate | System::String | Le modèle de nom de fichier pour l'image (sans extension). Si le fichier [XPS](../../) d'entrée est à une seule page, il sera exactement le nom de fichier, sinon "_[n]", où "n" - un numéro de page commençant à 0, le suffixe sera ajouté à cela. L'extension du fichier correspondra au format d'image dans le paramètre "option". |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)

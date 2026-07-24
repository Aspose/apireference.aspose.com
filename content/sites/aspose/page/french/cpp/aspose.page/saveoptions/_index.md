---
title: "Aspose::Page::SaveOptions classe"
linktitle: "SaveOptions"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::SaveOptions classe. Cette classe contient les options nécessaires à la gestion du processus de conversion en C++."
type: docs
weight: 1500
url: /fr/cpp/aspose.page/saveoptions/
---
## SaveOptions class


Cette classe contient les options nécessaires à la gestion du processus de conversion.

```cpp
class SaveOptions : public virtual System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Spécifie les dossiers supplémentaires où le convertisseur doit rechercher les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | Spécifie s'il faut enregistrer les polices non TrueType au format TTF. Cela réduit considérablement le volume du document résultant lors de la conversion PS vers PDF et augmente la vitesse de conversion des fichiers PS contenant une grande quantité de texte en polices non TrueType vers n'importe quel format de sortie. Cependant, il y a un léger décalage vertical du texte lors de la conversion d'un fichier PostScript en image. |
| virtual [get_Debug](./get_debug/)() | Spécifie si les informations de débogage doivent être imprimées sur le flux de sortie standard ou non. |
| virtual [get_Exceptions](./get_exceptions/)() | Renvoie une liste des erreurs de conversion supprimées si [SuppressErrors](../) est vrai. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | La catégorie Qualité spécifie le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre indiqué est bas, plus la compression est élevée et donc plus la qualité de l'image est faible. Une valeur de 0 donne l'image de la plus basse qualité, tandis que 100 donne la plus haute. |
| [get_Size](./get_size/)() const | Obtient/définit la taille de l'image. |
| virtual [get_SupressErrors](./get_supresserrors/)() | Spécifie si les erreurs doivent être supprimées ou non. Si vrai, les erreurs supprimées sont ajoutées à la liste [Exceptions](../). Si faux, la première erreur terminera le programme. |
| [SaveOptions](./saveoptions/)() | Initialise une nouvelle instance de la classe [SaveOptions](./) avec les valeurs par défaut pour les indicateurs [SuppressErrors](../) (true) et [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(bool) | Initialise une nouvelle instance de la classe [SaveOptions](./) avec la valeur par défaut pour l'indicateur [Debug](../) (false). |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | Initialise une nouvelle instance de [SaveOptions](./) avec la taille spécifiée de la page. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | Initialise une nouvelle instance de la classe [SaveOptions](./) avec la valeur par défaut pour l'indicateur [Debug](../) (false) et avec la taille spécifiée de la page. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Spécifie les dossiers supplémentaires où le convertisseur doit rechercher les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | Spécifie s'il faut enregistrer les polices non TrueType au format TTF. Cela réduit considérablement le volume du document résultant lors de la conversion PS vers PDF et augmente la vitesse de conversion des fichiers PS contenant une grande quantité de texte en polices non TrueType vers n'importe quel format de sortie. Cependant, il y a un léger décalage vertical du texte lors de la conversion d'un fichier PostScript en image. |
| virtual [set_Debug](./set_debug/)(bool) | Spécifie si les informations de débogage doivent être imprimées sur le flux de sortie standard ou non. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | La catégorie Qualité spécifie le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre indiqué est bas, plus la compression est élevée et donc plus la qualité de l'image est faible. Une valeur de 0 donne l'image de la plus basse qualité, tandis que 100 donne la plus haute. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | Obtient/définit la taille de l'image. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | Spécifie si les erreurs doivent être supprimées ou non. Si vrai, les erreurs supprimées sont ajoutées à la liste [Exceptions](../). Si faux, la première erreur terminera le programme. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)

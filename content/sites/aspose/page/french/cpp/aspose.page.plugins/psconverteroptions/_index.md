---
title: "Aspose::Page::Plugins::PsConverterOptions classe"
linktitle: "PsConverterOptions"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::Plugins::PsConverterOptions classe. Représente les options pour le plugin PsConverter en C++."
type: docs
weight: 1200
url: /fr/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


Représente les options pour le plugin [PsConverter](../psconverter/).

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Ajoute une nouvelle source de données à la collection de données du plugin [PsConverter](../psconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Ajoute une nouvelle source de données à la collection de données du plugin [PsConverterOptions](./). |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Spécifie les dossiers supplémentaires où le convertisseur doit rechercher les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes. |
| [get_DataCollection](./get_datacollection/)() override | Renvoie la collection de données du plugin [PsConverterOptions](./). |
| virtual [get_Debug](./get_debug/)() | Spécifie si les informations de débogage doivent être imprimées sur le flux de sortie standard ou non. |
| virtual [get_Exceptions](./get_exceptions/)() | Renvoie une liste des erreurs de conversion supprimées si [SuppressErrors](../) est vrai. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | La catégorie Qualité spécifie le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre indiqué est bas, plus la compression est élevée et donc plus la qualité de l'image est faible. Une valeur de 0 donne l'image de la plus basse qualité, tandis que 100 donne la plus haute. |
| virtual [get_OperationName](./get_operationname/)() | Renvoie le nom de l'opération. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Obtient la collection des cibles ajoutées pour enregistrer les résultats de l'opération. |
| [get_SupressErrors](./get_supresserrors/)() const | Spécifie si les erreurs doivent être supprimées ou non. Si vrai, les erreurs supprimées sont ajoutées à la liste [Exceptions](../). Si faux, la première erreur terminera le programme. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Spécifie les dossiers supplémentaires où le convertisseur doit rechercher les polices pour le document d'entrée. Le dossier par défaut est le dossier de polices standard où le système d'exploitation trouve les polices pour les besoins internes. |
| virtual [set_Debug](./set_debug/)(bool) | Spécifie si les informations de débogage doivent être imprimées sur le flux de sortie standard ou non. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | Renvoie une liste des erreurs de conversion supprimées si [SuppressErrors](../) est vrai. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | La catégorie Qualité spécifie le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre indiqué est bas, plus la compression est élevée et donc plus la qualité de l'image est faible. Une valeur de 0 donne l'image de la plus basse qualité, tandis que 100 donne la plus haute. |
| [set_SupressErrors](./set_supresserrors/)(bool) | Spécifie si les erreurs doivent être supprimées ou non. Si vrai, les erreurs supprimées sont ajoutées à la liste [Exceptions](../). Si faux, la première erreur terminera le programme. |
## Voir aussi

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)

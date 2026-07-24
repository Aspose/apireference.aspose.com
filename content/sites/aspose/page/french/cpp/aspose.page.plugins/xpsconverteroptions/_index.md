---
title: "Aspose::Page::Plugins::XpsConverterOptions classe"
linktitle: "XpsConverterOptions"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::Plugins::XpsConverterOptions classe. Représente les options pour le plugin XpsConverter en C++."
type: docs
weight: 2000
url: /fr/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


Représente les options pour le plugin [XpsConverter](../xpsconverter/).

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | Ajoute une nouvelle source de données à la collection de données du plugin [XpsConverter](../xpsconverter/). |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | Ajoute une nouvelle source de données à la collection de données du plugin [XpsConverterOptions](./). |
| [get_DataCollection](./get_datacollection/)() override | Renvoie la collection de données du plugin [XpsConverterOptions](./). |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | La catégorie Qualité spécifie le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre indiqué est bas, plus la compression est élevée et donc plus la qualité de l'image est faible. Une valeur de 0 donne l'image de la plus basse qualité, tandis que 100 donne la plus haute. |
| virtual [get_OperationName](./get_operationname/)() | Renvoie le nom de l'opération. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | Obtient la collection des cibles ajoutées pour enregistrer les résultats de l'opération. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | La catégorie Qualité spécifie le niveau de compression d'une image. Les valeurs disponibles vont de 0 à 100. Plus le nombre indiqué est bas, plus la compression est élevée et donc plus la qualité de l'image est faible. Une valeur de 0 donne l'image de la plus basse qualité, tandis que 100 donne la plus haute. |
## Voir aussi

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)

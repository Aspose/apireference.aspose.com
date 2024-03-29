---
title: StructuredDocumentTag.BuildingBlockGallery
linktitle: BuildingBlockGallery
articleTitle: BuildingBlockGallery
second_title: Aspose.Words для .NET
description: StructuredDocumentTag BuildingBlockGallery свойство. Указывает тип строительного блока для этогоСДТ . Не может бытьнулевой  на С#.
type: docs
weight: 40
url: /ru/net/aspose.words.markup/structureddocumenttag/buildingblockgallery/
---
## StructuredDocumentTag.BuildingBlockGallery property

Указывает тип строительного блока для этого**СДТ** . Не может быть`нулевой` .

```csharp
public string BuildingBlockGallery { get; set; }
```

## Примечания

Доступ к этому ресурсу будет работать только дляBuildingBlockGallery and DocPartObj Типы СДТ. Он доступен только для чтения для**СДТ** типа части документа.

Для всех остальных типов SDT возникнет исключение.

## Примеры

Показывает, как вставить тег структурированного документа в качестве стандартного блока и установить его категорию и галерею.

```csharp
Document doc = new Document();

StructuredDocumentTag buildingBlockSdt =
    new StructuredDocumentTag(doc, SdtType.BuildingBlockGallery, MarkupLevel.Block)
    {
        BuildingBlockCategory = "Built-in",
        BuildingBlockGallery = "Table of Contents"
    };

doc.FirstSection.Body.AppendChild(buildingBlockSdt);

doc.Save(ArtifactsDir + "StructuredDocumentTag.BuildingBlockCategories.docx");
```

### Смотрите также

* class [StructuredDocumentTag](../)
* пространство имен [Aspose.Words.Markup](../../../aspose.words.markup/)
* сборка [Aspose.Words](../../../)

---
title: 更新上次保存的时间属性
linktitle: 更新上次保存的时间属性
second_title: Aspose.Words for .NET API 参考
description: 了解如何在使用 Aspose.Words for .NET 保存文档时自动更新上次保存时间属性。
type: docs
weight: 10
url: /zh/net/programming-with-ooxmlsaveoptions/update-last-saved-time-property/
---
在本教程中，我们将探索提供的 C# 源代码，以在使用 Aspose.Words for .NET 保存文档时更新上次保存时间属性。此功能允许您自动更新生成文档的上次保存时间属性。

## 第 1 步：设置环境

在您开始之前，请确保您已经使用 Aspose.Words for .NET 设置了您的开发环境。确保您已经添加了必要的引用并导入了适当的命名空间。

## 第 2 步：装入文档

```csharp
//文档目录的路径
string dataDir = "YOUR DOCUMENTS DIRECTORY";

Document doc = new Document(dataDir + "Document.docx");
```

在此步骤中，我们使用`Document`方法并将路径传递给要加载的 DOCX 文件。

## 第 3 步：配置 OOXML 备份选项

```csharp
OoxmlSaveOptions saveOptions = new OoxmlSaveOptions { UpdateLastSavedTimeProperty = true };
```

在此步骤中，我们使用`OoxmlSaveOptions`班级。我们通过设置启用上次保存时间属性的自动更新`UpdateLastSavedTimeProperty`到`true`.

## 第 4 步：使用更新的属性保存文档

```csharp
doc.Save(dataDir + "WorkingWithOoxmlSaveOptions.UpdateLastSavedTimeProperty.docx", saveOptions);
```

在这最后一步中，我们使用`Save`方法并将路径传递给输出文件`.docx`扩展名，以及指定的保存选项。

现在您可以运行源代码以在保存文档时自动更新上次保存时间属性。生成的文件将保存在指定目录中，名称为“WorkingWithOoxmlSaveOptions.UpdateLastSavedTimeProperty.docx”。

### 使用 Aspose.Words for .NET 更新上次保存时间属性的示例源代码 

```csharp

//文档目录的路径
string dataDir = "YOUR DOCUMENT DIRECTORY"; 

Document doc = new Document(dataDir + "Document.docx");

OoxmlSaveOptions saveOptions = new OoxmlSaveOptions { UpdateLastSavedTimeProperty = true };

doc.Save(dataDir + "WorkingWithOoxmlSaveOptions.UpdateLastSavedTimeProperty.docx", saveOptions);
            
        
```

## 结论

在本教程中，我们探索了在使用 Aspose.Words for .NET 保存文档时自动更新上次保存时间属性的功能。通过使用 OOXML 保存选项启用此功能，您可以确保在生成的文档中自动更新上次保存时间属性。

更新上次保存时间属性对于跟踪文档的更改和版本很有用。它还会跟踪上次保存文档的时间，这在各种情况下都很有用。

Aspose.Words for .NET 通过提供灵活而强大的备份选项，使自动更新上次备份时间属性变得容易。您可以将此功能集成到您的项目中，以确保生成的文档具有准确的备份信息。
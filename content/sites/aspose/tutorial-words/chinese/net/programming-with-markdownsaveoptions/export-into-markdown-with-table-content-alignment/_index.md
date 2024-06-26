---
title: 使用表格内容对齐导出到 Markdown
linktitle: 使用表格内容对齐导出到 Markdown
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words for .NET 将具有不同对齐方式的表格内容导出到 Markdown 文件。
type: docs
weight: 10
url: /zh/net/programming-with-markdownsaveoptions/export-into-markdown-with-table-content-alignment/
---
这是一个分步指南，用于解释以下 C# 源代码，这些代码有助于使用适用于 .NET 的 Aspose.Words 库将内容导出到具有表内容对齐的 Markdown 文件。在使用此代码之前，请确保您已将 Aspose.Words 库包含在您的项目中。

## 第一步：设置文档目录路径

```csharp
//文档目录的路径。
string dataDir = "YOUR_DIRECTORY_OF_DOCUMENTS";
```

请务必指定保存已编辑文档的文档目录的正确路径。

## 第 2 步：创建文档和文档生成器

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

这里我们创建一个实例`Document`类和一个实例`DocumentBuilder`允许我们操作文档和添加元素的类。

## 第 3 步：在表格中插入具有不同段落对齐方式的单元格

```csharp
builder. InsertCell();
builder.ParagraphFormat.Alignment = ParagraphAlignment.Right;
builder.Write("Cell1");
builder. InsertCell();
builder.ParagraphFormat.Alignment = ParagraphAlignment.Center;
builder.Write("Cell2");
```

我们使用文档生成器将单元格插入表格并为每个单元格设置不同的段落对齐方式。

## 第 4 步：设置 Markdown 导出选项并保存修改后的文档

```csharp
MarkdownSaveOptions saveOptions = new MarkdownSaveOptions
{
     TableContentAlignment = TableContentAlignment.Left
};
doc.Save(dataDir + "Content_table_left_alignment.md", saveOptions);

saveOptions.TableContentAlignment = TableContentAlignment.Right;
doc.Save(dataDir + "Content_table_right_alignment.md", saveOptions);

saveOptions.TableContentAlignment = TableContentAlignment.Center;
doc.Save(dataDir + "Content_table_alignment_center.md", saveOptions);

saveOptions.TableContentAlignment = TableContentAlignment.Auto;
doc.Save(dataDir + "Content_table_auto_alignment.md", saveOptions);
```

我们使用不同的表格内容对齐设置 Markdown 导出选项，然后使用每个对齐选项保存修改后的文档。

### 使用 Aspose.Words for .NET 使用表格内容对齐导出到 Markdown 的示例源代码

```csharp

            
	//文档目录的路径。
    string dataDir = "YOUR DOCUMENT DIRECTORY";
	
	Document doc = new Document();
	DocumentBuilder builder = new DocumentBuilder(doc);

	builder.InsertCell();
	builder.ParagraphFormat.Alignment = ParagraphAlignment.Right;
	builder.Write("Cell1");
	builder.InsertCell();
	builder.ParagraphFormat.Alignment = ParagraphAlignment.Center;
	builder.Write("Cell2");

	//使表格内的所有段落对齐。
	MarkdownSaveOptions saveOptions = new MarkdownSaveOptions
	{
		TableContentAlignment = TableContentAlignment.Left
	};
	doc.Save(ArtifactsDir + "WorkingWithMarkdownSaveOptions.LeftTableContentAlignment.md", saveOptions);

	saveOptions.TableContentAlignment = TableContentAlignment.Right;
	doc.Save(ArtifactsDir + "WorkingWithMarkdownSaveOptions.RightTableContentAlignment.md", saveOptions);

	saveOptions.TableContentAlignment = TableContentAlignment.Center;
	doc.Save(ArtifactsDir + "WorkingWithMarkdownSaveOptions.CenterTableContentAlignment.md", saveOptions);

	//这种情况下的对齐将从相应表格列中的第一段获取。
	saveOptions.TableContentAlignment = TableContentAlignment.Auto;
	
	//保存修改后的文件
	doc.Save(dataDir + "WorkingWithMarkdownSaveOptions.AutoTableContentAlignment.md", saveOptions);
            
        
```

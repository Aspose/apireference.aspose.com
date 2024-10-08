---
title: 不受限制的部分
linktitle: 不受限制的部分
second_title: Aspose.Words for .NET API 参考
description: 了解如何使用 Aspose.Words for .NET 在 Word 文档中定义不受限制的部分。
type: docs
weight: 10
url: /zh/net/document-protection/unrestricted-section/
---

在本教程中，我们将指导您完成使用 Aspose.Words for .NET 的无限制部分功能的步骤。此功能允许您在 Word 文档中定义不受保护的特定部分，即使文档的其余部分受到保护也是如此。请按照以下步骤操作：

## 第 1 步：创建文档和部分

首先创建一个 Document 类的实例和一个 DocumentBuilder 对象：

```csharp
string dataDir = "YOUR DOCUMENTS DIRECTORY";
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);
```

## 第 2 步：向文档添加内容
使用 DocumentBuilder 对象向文档添加内容并插入分节符：

```csharp
builder.Writeln("Section 1. Unprotected.");
builder. InsertBreak(BreakType. SectionBreakContinuous);
builder.Writeln("Section 2. Protected.");
```

## 第 3 步：保护文档和章节

部分保护仅在启用文档保护且仅允许在表单字段中进行编辑时才有效。您可以使用 Document 对象的 Protect() 方法保护文档：

```csharp
doc.Protect(ProtectionType.AllowOnlyFormFields, "password");
```

请务必指定正确的保护类型并设置所需的密码。

## 第 4 步：禁用特定部分的保护

默认情况下，所有部分都受到保护，但您可以使用 Section 对象的 ProtectedForForms 属性有选择地禁用对特定部分的保护：

```csharp
doc.Sections[0].ProtectedForForms = false;
```

在本例中，第一部分的保护被禁用。

## 第 5 步：保存文档

最后，保存修改后的文件：

```csharp
doc.Save(dataDir + "DocumentProtection.UnrestrictedSection.docx");
```

请务必指定正确的路径和文件名以保存包含不受限制的部分的文档。

### 使用 Aspose.Words for .NET 的 Unrestricted Section 示例源代码

以下是使用 Aspose.Words for .NET 的无限制部分的完整源代码：


```csharp

//文档目录的路径。
string dataDir = "YOUR DOCUMENT DIRECTORY";
//插入带有一些文本的两个部分。
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Section 1. Unprotected.");
builder.InsertBreak(BreakType.SectionBreakContinuous);
builder.Writeln("Section 2. Protected.");

//部分保护仅在打开文档保护时有效，并且只允许在表单域中进行编辑。
doc.Protect(ProtectionType.AllowOnlyFormFields, "password");

//默认情况下，所有部分都受到保护，但我们可以有选择地关闭保护。
doc.Sections[0].ProtectedForForms = false;
doc.Save(dataDir + "DocumentProtection.UnrestrictedSection.docx");

doc = new Document(dataDir + "DocumentProtection.UnrestrictedSection.docx");

```

通过执行这些步骤，您将能够使用 Aspose.Words for .NET 轻松地在 Word 文档中定义不受限制的部分。


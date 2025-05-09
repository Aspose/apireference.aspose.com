---
title: PdfPageEditor.GetPageBoxSize
second_title: Aspose.PDF for .NET API Reference
description: PdfPageEditor 方法。返回文档中指定框的大小
type: docs
weight: 130
url: /zh/net/aspose.pdf.facades/pdfpageeditor/getpageboxsize/
---
## PdfPageEditor.GetPageBoxSize 方法

返回文档中指定框的大小。

```csharp
public Rectangle GetPageBoxSize(int page, string pageBoxName)
```

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| page | Int32 | 页面索引。文档页面从 1 开始编号。 |
| pageBoxName | String | 框类型名称。有效值为：“art”，“bleed”，“crop”，“media”，“trim”。 |

### 返回值

包含请求框的矩形。

## 示例

以下示例演示如何获取第 1 页的媒体框：

```csharp
PdfPageEditor editor = new PdfPageEditor();
editor.BindPdf("sample.pdf");
System.Drawing.Rectangle rect = editor.GetBoxSize(1, "media");
```

### 另请参阅

* 类 [PdfPageEditor](../)
* 命名空间 [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* 程序集 [Aspose.PDF](../../../)
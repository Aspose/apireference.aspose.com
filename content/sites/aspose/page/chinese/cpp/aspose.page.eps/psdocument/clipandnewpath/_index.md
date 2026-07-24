---
title: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method"
linktitle: "ClipAndNewPath"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PsDocument::ClipAndNewPath method. 向当前图形状态添加剪裁，然后写入 \\\"newpath\\\" 操作符。这样做是为了避免此剪裁路径与后续路径（例如使用 \\\"charpath\\\" 操作符描绘的字形）发生冲突。"
type: docs
weight: 300
url: /zh/cpp/aspose.page.eps/psdocument/clipandnewpath/
---
## PsDocument::ClipAndNewPath method


向当前图形状态添加裁剪，然后写入 \"newpath\" 操作符。这样做是为了避免此裁剪路径与后续路径（例如使用 \"charpath\" 操作符描边的字形）相交。

```cpp
void Aspose::Page::EPS::PsDocument::ClipAndNewPath(System::SharedPtr<System::Drawing::Drawing2D::GraphicsPath> s)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| s | System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\> | 剪裁路径。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [GraphicsPath](../../../system.drawing.drawing2d/graphicspath/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)

---
title: FileFormatUtil.ExtensionToSaveFormat
linktitle: ExtensionToSaveFormat
articleTitle: ExtensionToSaveFormat
second_title: 用于 .NET 的 Aspose.Words
description: FileFormatUtil ExtensionToSaveFormat 方法. 将文件扩展名转换为SaveFormat值 在 C#.
type: docs
weight: 40
url: /zh/net/aspose.words/fileformatutil/extensiontosaveformat/
---
## FileFormatUtil.ExtensionToSaveFormat method

将文件扩展名转换为[`SaveFormat`](../../saveformat/)值.

```csharp
public static SaveFormat ExtensionToSaveFormat(string extension)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| extension | String | 文件扩展名。可以带或不带前导点。不区分大小写。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 如果参数是则抛出`无效的`。 |

## 评论

如果无法识别扩展名，则返回Unknown。

## 例子

演示如何使用 FileFormatUtil 方法来检测文档的格式。

```csharp
// 从缺少文件扩展名的文件中加载文档，然后检测其文件格式。
using (FileStream docStream = File.OpenRead(MyDir + "Word document with missing file extension"))
{
    FileFormatInfo info = FileFormatUtil.DetectFileFormat(docStream);
    LoadFormat loadFormat = info.LoadFormat;

    Assert.AreEqual(LoadFormat.Doc, loadFormat);

    // 下面是将 LoadFormat 转换为其相应的 SaveFormat 的两种方法。
    // 1 - 获取 LoadFormat 的文件扩展名字符串，然后从该字符串获取相应的 SaveFormat：
    string fileExtension = FileFormatUtil.LoadFormatToExtension(loadFormat);
    SaveFormat saveFormat = FileFormatUtil.ExtensionToSaveFormat(fileExtension);

    // 2 - 将 LoadFormat 直接转换为其 SaveFormat：
    saveFormat = FileFormatUtil.LoadFormatToSaveFormat(loadFormat);

    // 从流中加载文档，然后将其保存到自动检测到的文件扩展名。
    Document doc = new Document(docStream);

    Assert.AreEqual(".doc", FileFormatUtil.SaveFormatToExtension(saveFormat));

    doc.Save(ArtifactsDir + "File.SaveToDetectedFileFormat" + FileFormatUtil.SaveFormatToExtension(saveFormat));
}
```

### 也可以看看

* enum [SaveFormat](../../saveformat/)
* class [FileFormatUtil](../)
* 命名空间 [Aspose.Words](../../../aspose.words/)
* 部件 [Aspose.Words](../../../)

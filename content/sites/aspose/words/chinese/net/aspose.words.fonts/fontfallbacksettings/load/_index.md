---
title: FontFallbackSettings.Load
linktitle: Load
articleTitle: Load
second_title: 用于 .NET 的 Aspose.Words
description: FontFallbackSettings Load 方法. 从 XML 文件加载字体后备设置 在 C#.
type: docs
weight: 20
url: /zh/net/aspose.words.fonts/fontfallbacksettings/load/
---
## Load(*string*) {#load_1}

从 XML 文件加载字体后备设置。

```csharp
public void Load(string fileName)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| fileName | String | 输入文件名。 |

## 例子

演示如何在本地文件系统中的 XML 文档中加载和保存字体后备设置。

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

// 加载定义一组字体后备设置的 XML 文档。
FontSettings fontSettings = new FontSettings();
fontSettings.FallbackSettings.Load(MyDir + "Font fallback rules.xml");

doc.FontSettings = fontSettings;
doc.Save(ArtifactsDir + "FontSettings.LoadFontFallbackSettingsFromFile.pdf");

// 将文档当前的字体后备设置保存为 XML 文档。
doc.FontSettings.FallbackSettings.Save(ArtifactsDir + "FallbackSettings.xml");
```

### 也可以看看

* class [FontFallbackSettings](../)
* 命名空间 [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* 部件 [Aspose.Words](../../../)

---

## Load(*Stream*) {#load}

从 XML 流加载后备设置。

```csharp
public void Load(Stream stream)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| stream | Stream | 输入流。 |

## 例子

演示如何从流中加载和保存字体后备设置。

```csharp
Document doc = new Document(MyDir + "Rendering.docx");

// 加载定义一组字体后备设置的 XML 文档。
using (FileStream fontFallbackStream = new FileStream(MyDir + "Font fallback rules.xml", FileMode.Open))
{
    FontSettings fontSettings = new FontSettings();
    fontSettings.FallbackSettings.Load(fontFallbackStream);

    doc.FontSettings = fontSettings;
}

doc.Save(ArtifactsDir + "FontSettings.LoadFontFallbackSettingsFromStream.pdf");

// 使用流将文档当前的字体后备设置保存为 XML 文档。
using (FileStream fontFallbackStream =
    new FileStream(ArtifactsDir + "FallbackSettings.xml", FileMode.Create))
{
    doc.FontSettings.FallbackSettings.Save(fontFallbackStream);
}
```

### 也可以看看

* class [FontFallbackSettings](../)
* 命名空间 [Aspose.Words.Fonts](../../../aspose.words.fonts/)
* 部件 [Aspose.Words](../../../)

---
title: HtmlFixedSaveOptions.UseTargetMachineFonts
linktitle: UseTargetMachineFonts
articleTitle: UseTargetMachineFonts
second_title: 用于 .NET 的 Aspose.Words
description: HtmlFixedSaveOptions UseTargetMachineFonts 财产. 标志指示是否必须使用来自目标计算机的字体来显示文档 如果此标志设置为真的FontFormat和ExportEmbeddedFonts属性没有效果 也ResourceSavingCallback不会针对字体触发 默认为错误的 在 C#.
type: docs
weight: 190
url: /zh/net/aspose.words.saving/htmlfixedsaveoptions/usetargetmachinefonts/
---
## HtmlFixedSaveOptions.UseTargetMachineFonts property

标志指示是否必须使用来自目标计算机的字体来显示文档。 如果此标志设置为`真的`,[`FontFormat`](../fontformat/)和[`ExportEmbeddedFonts`](../exportembeddedfonts/)属性没有效果， 也[`ResourceSavingCallback`](../resourcesavingcallback/)不会针对字体触发。 默认为`错误的`.

```csharp
public bool UseTargetMachineFonts { get; set; }
```

## 例子

显示将文档保存为 HTML 时如何仅使用目标计算机的字体。

```csharp
Document doc = new Document(MyDir + "Bullet points with alternative font.docx");

HtmlFixedSaveOptions saveOptions = new HtmlFixedSaveOptions
{
    ExportEmbeddedCss = true,
    UseTargetMachineFonts = useTargetMachineFonts,
    FontFormat = ExportFontFormat.Ttf,
    ExportEmbeddedFonts = false,
};

doc.Save(ArtifactsDir + "HtmlFixedSaveOptions.UsingMachineFonts.html", saveOptions);

string outDocContents = File.ReadAllText(ArtifactsDir + "HtmlFixedSaveOptions.UsingMachineFonts.html");

if (useTargetMachineFonts)
    Assert.False(Regex.Match(outDocContents, "@font-face").Success);
else
    Assert.True(Regex.Match(outDocContents,
        "@font-face { font-family:'Arial'; font-style:normal; font-weight:normal; src:local[(]'☺'[)], " +
        "url[(]'HtmlFixedSaveOptions.UsingMachineFonts/font001.ttf'[)] format[(]'truetype'[)]; }").Success);
```

### 也可以看看

* class [HtmlFixedSaveOptions](../)
* 命名空间 [Aspose.Words.Saving](../../../aspose.words.saving/)
* 部件 [Aspose.Words](../../../)

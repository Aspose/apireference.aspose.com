---
title: Sonekler Olmadan Değiştirme Alın
linktitle: Sonekler Olmadan Değiştirme Alın
second_title: Aspose.Words for .NET API Referansı
description: Bu öğreticide, Aspose.Words for .NET ile bir Word belgesinde soneksiz geçersiz kılmaların nasıl elde edileceğini öğrenin.
type: docs
weight: 10
url: /tr/net/working-with-fonts/get-substitution-without-suffixes/
---

Bu öğreticide, .NET için Aspose.Words kitaplığını kullanarak bir Word belgesinde sonekler olmadan geçersiz kılmaları nasıl alacağınızı göstereceğiz. Belgeleri görüntülerken veya yazdırırken yazı tipi değiştirme sorunlarını çözmek için son eksiz değiştirmeler kullanılır. .NET projenizdeki kodu anlamanıza ve uygulamanıza yardımcı olmak için sizi adım adım yönlendireceğiz.

## Önkoşullar
Başlamadan önce, aşağıdaki öğelere sahip olduğunuzdan emin olun:
- C# programlama dili hakkında çalışma bilgisi
- Projenizde yüklü olan .NET için Aspose.Words kitaplığı

## 1. Adım: Belge dizinini tanımlayın
 Öncelikle, dizin yolunu Word belgenizin konumuna ayarlamanız gerekir. Yer değiştirmek`"YOUR DOCUMENT DIRECTORY"` uygun yol ile kodda.

```csharp
// Belgeler dizininizin yolu
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## 2. Adım: Belgeyi yükleyin ve sonekler olmadan değiştirmeleri yapılandırın
 Ardından, kullanarak belgeyi yükleyeceğiz`Document` kullanarak soneksiz ikameleri sınıflandırın ve yapılandırın.`DocumentSubstitutionWarnings` sınıf. Yazı tiplerini içeren bir klasör belirterek bir yazı tipi kaynağı da ekleyeceğiz.

```csharp
//Belgeyi yükleyin ve sonekler olmadan değiştirmeleri yapılandırın
Document doc = new Document(dataDir + "Get substitution without suffixes.docx");
DocumentSubstitutionWarnings substitutionWarningHandler = new DocumentSubstitutionWarnings();
doc.WarningCallback = substitutionWarningHandler;

List<FontSourceBase> fontSources = new List<FontSourceBase>(FontSettings.DefaultInstance.GetFontsSources());
FolderFontSource folderFontSource = new FolderFontSource(FontsDir, true);
fontSources.Add(folderFontSource);
FontSourceBase[] updatedFontSources = fontSources.ToArray();
FontSettings.DefaultInstance.SetFontsSources(updatedFontSources);
```

## 3. Adım: Belgeyi kaydedin
Son olarak, belgeyi soneksiz geçersiz kılmalar uygulanmış olarak kaydedeceğiz.

```csharp
// belgeyi kaydet
doc.Save(dataDir + "WorkingWithFonts.GetSubstitutionWithoutSuffixes.pdf");
```

### Aspose.Words for .NET kullanarak Get Substitution Without Suffixes için örnek kaynak kodu 
```csharp

// Belge dizininizin yolu
string dataDir = "YOUR DOCUMENT DIRECTORY";

Document doc = new Document(dataDir + "Get substitution without suffixes.docx");
DocumentSubstitutionWarnings substitutionWarningHandler = new DocumentSubstitutionWarnings();
doc.WarningCallback = substitutionWarningHandler;
List<FontSourceBase> fontSources = new List<FontSourceBase>(FontSettings.DefaultInstance.GetFontsSources());
FolderFontSource folderFontSource = new FolderFontSource(FontsDir, true);
fontSources.Add(folderFontSource);
FontSourceBase[] updatedFontSources = fontSources.ToArray();
FontSettings.DefaultInstance.SetFontsSources(updatedFontSources);
doc.Save(dataDir + "WorkingWithFonts.GetSubstitutionWithoutSuffixes.pdf");

```

## Çözüm
Bu öğreticide, Aspose.Words for .NET ile bir Word belgesinde sonekler olmadan geçersiz kılmaların nasıl alınacağını gördük. Son eksiz ikameler, yazı tipi değiştirme problemlerini çözmek için kullanışlıdır. Belgelerinizin görüntülenmesini ve yazdırılmasını iyileştirmek için bu özelliği kullanmaktan çekinmeyin.

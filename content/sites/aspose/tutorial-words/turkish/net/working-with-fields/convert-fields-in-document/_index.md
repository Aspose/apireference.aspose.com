---
title: Belgedeki Alanları Dönüştür
linktitle: Belgedeki Alanları Dönüştür
second_title: Aspose.Words for .NET API Referansı
description: Aspose.Words for .NET kullanarak belge alanlarını metne dönüştürmek için adım adım kılavuz.
type: docs
weight: 10
url: /tr/net/working-with-fields/convert-fields-in-document/
---

Bu öğreticide, Aspose.Words for .NET yazılımının ConvertFieldsInDocument işlevini kullanarak size adım adım kılavuzluk edeceğiz. Bu özellik için gereken C# kaynak kodunu ayrıntılı olarak açıklayacağız ve örnek işaretleme çıktı biçimleri sağlayacağız.

## 1. Adım: Önkoşullar
Başlamadan önce, aşağıdakilere sahip olduğunuzdan emin olun:

- Geliştirme makinenizde kurulu Aspose.Words for .NET.
- Metne dönüştürmek istediğiniz bağlantılı alanları içeren bir Word belgesi.
- Dönüştürülen belgeyi kaydedebileceğiniz bir belge dizini.

## 2. Adım: Ortamı ayarlama
Aspose.Words for .NET'i kullanmak için geliştirme ortamınızı doğru şekilde yapılandırdığınızdan emin olun. Gerekli ad alanlarını içe aktarın ve belgeler dizininize giden yolu ayarlayın.

```csharp
// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENTS DIRECTORY";
```

## 3. Adım: Belgeyi yükleyin
 Kullan`Document` dönüştürmek istediğiniz bağlantılı alanları içeren Word belgesini yüklemek için Aspose.Words sınıfı.

```csharp
Document doc = new Document(MyDir + "Linked fields.docx");
```

## 4. Adım: İlişkili alanları metne dönüştürün
 Kullan`Unlink()` belgede karşılaşılan tüm "IF" tipi alanları metne dönüştürme yöntemi. Bu yöntem, bağlantılı alanları metin içeriklerine dönüştürmek için kullanılır.

```csharp
doc.Range.Fields.Where(f => f.Type == FieldType.FieldIf).ToList().ForEach(f => f.Unlink());
```

## 5. Adım: Dönüştürülen belgeyi kaydedin
 Kullan`Save()` Belgeyi, belirtilen belge dizininde metne dönüştürülmüş alanlarla kaydetme yöntemi.

```csharp
doc.Save(dataDir + "WorkingWithFields.ConvertFieldsInDocument.docx");
```

## Aspose.Words for .NET kullanan ConvertFieldsInDocument için örnek kaynak kodu

İşte ConvertFieldsInDocument işlevi için eksiksiz kaynak kodu:

```csharp
// Belgeler dizininin yolu.
string dataDir = "YOUR DOCUMENTS DIRECTORY";

Document doc = new Document(MyDir + "Linked fields.docx");

// Belgede karşılaşılan tüm IF alanlarını (üstbilgiler ve altbilgiler dahil) metne dönüştürmek için uygun parametreleri iletin.
doc.Range.Fields.Where(f => f.Type == FieldType.FieldIf).ToList().ForEach(f => f.Unlink());

// Belgeyi diske dönüştürülmüş alanlarla kaydedin
doc.Save(dataDir + "WorkingWithFields.ConvertFieldsInDocument.docx");
```

## Çözüm
Aspose.Words for .NET'in ConvertFieldsInDocument işlevi, bir Word belgesindeki bağlantılı alanları metne dönüştürmek için güçlü bir araçtır. 
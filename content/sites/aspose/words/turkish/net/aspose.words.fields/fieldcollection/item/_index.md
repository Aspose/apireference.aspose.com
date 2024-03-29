---
title: FieldCollection.Item
linktitle: Item
articleTitle: Item
second_title: Aspose.Words for .NET
description: FieldCollection Item mülk. Belirtilen dizindeki bir alanı döndürür C#'da.
type: docs
weight: 20
url: /tr/net/aspose.words.fields/fieldcollection/item/
---
## FieldCollection indexer

Belirtilen dizindeki bir alanı döndürür.

```csharp
public Field this[int index] { get; }
```

| Parametre | Tanım |
| --- | --- |
| index | Koleksiyona bir dizin. |

## Notlar

Endeks sıfır bazlıdır.

Negatif dizinlere izin verilir ve koleksiyonun arkasından erişimi belirtir. Örneğin -1 son öğe anlamına gelir, -2 sondan önceki ikinci öğe anlamına gelir ve bu şekilde devam eder.

Dizin listedeki öğe sayısından büyük veya ona eşitse bu, boş bir başvuru döndürür.

Dizin negatifse ve mutlak değeri listedeki öğe sayısından büyükse bu, boş bir başvuru döndürür.

## Örnekler

Alan koleksiyonundan alanların nasıl kaldırılacağını gösterir.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertField(" DATE \\@ \"dddd, d MMMM yyyy\" ");
builder.InsertField(" TIME ");
builder.InsertField(" REVNUM ");
builder.InsertField(" AUTHOR  \"John Doe\" ");
builder.InsertField(" SUBJECT \"My Subject\" ");
builder.InsertField(" QUOTE \"Hello world!\" ");
doc.UpdateFields();

FieldCollection fields = doc.Range.Fields;

Assert.AreEqual(6, fields.Count);

// Aşağıda alanları bir alan koleksiyonundan kaldırmanın dört yolu verilmiştir.
// 1 - Kendini kaldıracak bir alan edinin:
fields[0].Remove();
Assert.AreEqual(5, fields.Count);

// 2 - Kaldırma yöntemine ilettiğimiz bir alanı kaldırmak için koleksiyonu alın:
Field lastField = fields[3];
fields.Remove(lastField);
Assert.AreEqual(4, fields.Count);

// 3 - Bir dizindeki koleksiyondan bir alanı kaldırın:
fields.RemoveAt(2);
Assert.AreEqual(3, fields.Count);

// 4 - Koleksiyondaki tüm alanları tek seferde kaldırın:
fields.Clear();
Assert.AreEqual(0, fields.Count);
```

### Ayrıca bakınız

* class [Field](../../field/)
* class [FieldCollection](../)
* ad alanı [Aspose.Words.Fields](../../../aspose.words.fields/)
* toplantı [Aspose.Words](../../../)

---
title: Style.Name
linktitle: Name
articleTitle: Name
second_title: Aspose.Words for .NET
description: Style Name mülk. Stilin adını alır veya ayarlar C#'da.
type: docs
weight: 120
url: /tr/net/aspose.words/style/name/
---
## Style.Name property

Stilin adını alır veya ayarlar.

```csharp
public string Name { get; set; }
```

## Notlar

Boş dize olamaz.

Koleksiyonda zaten böyle bir ada sahip bir stil varsa, bu stil onu geçersiz kılacaktır. Etkilenen tüm düğümler yeni stile referans verecektir.

## Örnekler

Bir belgenin stil koleksiyonuna nasıl erişileceğini gösterir.

```csharp
Document doc = new Document();

Assert.AreEqual(4, doc.Styles.Count);

// Aspose.Words kullanılarak oluşturulan bir belgenin varsayılan olarak içerdiği tüm stilleri numaralandırın ve listeleyin.
using (IEnumerator<Style> stylesEnum = doc.Styles.GetEnumerator())
{
    while (stylesEnum.MoveNext())
    {
        Style curStyle = stylesEnum.Current;
        Console.WriteLine($"Style name:\t\"{curStyle.Name}\", of type \"{curStyle.Type}\"");
        Console.WriteLine($"\tSubsequent style:\t{curStyle.NextParagraphStyleName}");
        Console.WriteLine($"\tIs heading:\t\t\t{curStyle.IsHeading}");
        Console.WriteLine($"\tIs QuickStyle:\t\t{curStyle.IsQuickStyle}");

        Assert.AreEqual(doc, curStyle.Document);
    }
}
```

Bir belgenin stilinin nasıl kopyalanacağını gösterir.

```csharp
Document doc = new Document();

// AddCopy yöntemi belirtilen stilin bir kopyasını oluşturur ve
// stil için otomatik olarak "Başlık 1_0" gibi yeni bir ad oluşturur.
Style newStyle = doc.Styles.AddCopy(doc.Styles["Heading 1"]);

// Stilin tanımlayıcı adını değiştirmek için stilin "Ad" özelliğini kullanın.
newStyle.Name = "My Heading 1";

// Belgemiz artık farklı adlara sahip iki aynı görünümlü stile sahip.
// Stillerden birinin ayarlarının değiştirilmesi diğerini etkilemez.
newStyle.Font.Color = Color.Red;

Assert.AreEqual("My Heading 1", newStyle.Name);
Assert.AreEqual("Heading 1", doc.Styles["Heading 1"].Name);

Assert.AreEqual(doc.Styles["Heading 1"].Type, newStyle.Type);
Assert.AreEqual(doc.Styles["Heading 1"].Font.Name, newStyle.Font.Name);
Assert.AreEqual(doc.Styles["Heading 1"].Font.Size, newStyle.Font.Size);
Assert.AreNotEqual(doc.Styles["Heading 1"].Font.Color, newStyle.Font.Color);
```

### Ayrıca bakınız

* class [Style](../)
* ad alanı [Aspose.Words](../../../aspose.words/)
* toplantı [Aspose.Words](../../../)

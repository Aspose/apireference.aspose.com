---
title: FormEditor.AddField
second_title: Aspose.PDF for .NET API Reference
description: FormEditor metodu. Belirtilen türde alanı forma ekle
type: docs
weight: 100
url: /tr/net/aspose.pdf.facades/formeditor/addfield/
---
## AddField(FieldType, string, int, float, float, float, float) {#addfield}

Belirtilen türde alanı forma ekle.

```csharp
public bool AddField(FieldType fieldType, string fieldName, int pageNum, float llx, float lly, 
    float urx, float ury)
```

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fieldType | FieldType | Eklenmesi gereken alanın türü. |
| fieldName | String | Eklenmesi gereken alanın adı. |
| pageNum | Int32 | Yeni alanın yerleştirilmesi gereken sayfa numarası. |
| llx | Single | Alanın sol alt köşesinin abscissası. |
| lly | Single | Alanın sol alt köşesinin ordinatı. |
| urx | Single | Alanın sağ üst köşesinin abscissası. |
| ury | Single | Alanın sağ üst köşesinin ordinatı. |

### Dönüş Değeri

Alan başarıyla eklendiyse true döner.

## Örnekler

```csharp
FormEditor formEditor = new Aspose.Pdf.Facades.FormEditor("PdfForm.pdf", "FormEditor_AddField_Text.pdf");
formEditor.AddField(FieldType.Text, "AddedTextField",  1, 10, 30, 110, 46);
formEditor.Save();
```

### Ayrıca Bakınız

* enum [FieldType](../../fieldtype/)
* class [FormEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)

---

## AddField(FieldType, string, string, int, float, float, float, float) {#addfield_1}

Belirtilen türde alanı forma ekle.

```csharp
public bool AddField(FieldType fieldType, string fieldName, string initValue, int pageNum, 
    float llx, float lly, float urx, float ury)
```

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fieldType | FieldType | Eklenmesi gereken alanın türü. |
| fieldName | String | Eklenmesi gereken alanın adı. |
| initValue | String | Alanın başlangıç değeri. |
| pageNum | Int32 | Yeni alanın yerleştirilmesi gereken sayfa numarası. |
| llx | Single | Alanın sol alt köşesinin abscissası. |
| lly | Single | Alanın sol alt köşesinin ordinatı. |
| urx | Single | Alanın sağ üst köşesinin abscissası. |
| ury | Single | Alanın sağ üst köşesinin ordinatı. |

### Dönüş Değeri

Alan başarıyla eklendiyse true döner.

## Örnekler

```csharp
FormEditor formEditor = new Aspose.Pdf.Facades.FormEditor("PdfForm.pdf", "FormEditor_AddField_Text.pdf");
formEditor.AddField(FieldType.Text, "AddedTextField", "Text Value", 1, 10, 30, 110, 46);
formEditor.Items = new string[] { "Item1", "Item2", Item3" };
formEditor.AddField(FieldType.Radio, "RadioButtonField", 1, 265, 695, 365, 720);
formEditor.Save();
```

### Ayrıca Bakınız

* enum [FieldType](../../fieldtype/)
* class [FormEditor](../)
* namespace [Aspose.Pdf.Facades](../../../aspose.pdf.facades/)
* assembly [Aspose.PDF](../../../)
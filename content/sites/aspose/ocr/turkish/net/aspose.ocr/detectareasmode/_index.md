---
title: Enum DetectAreasMode
second_title: Aspose.OCR for .NET API Referansı
description: Aspose.OCR.DetectAreasMode Sıralama. Alan tespiti için kullanılan sinir ağının türünü belirler.
type: docs
weight: 60
url: /tr/net/aspose.ocr/detectareasmode/
---
## DetectAreasMode enumeration

Alan tespiti için kullanılan sinir ağının türünü belirler.

```csharp
public enum DetectAreasMode
```

### değerler

| İsim | Değer | Tanım |
| --- | --- | --- |
| NONE | `0` | Paragrafları algılamaz. Resimsiz tek sütunlu basit bir belge için daha iyidir. |
| DOCUMENT | `1` | Paragrafları algılar, belgeler için NN modelini kullanır. Çok sütunlu belge, resimli belge veya diğer metin olmayan nesneler için daha iyi. |
| PHOTO | `2` | Paragrafları algılar, fotoğraflar için NN modelini kullanır. Çok sayıda resim ve diğer metin olmayan nesneler içeren görüntü için daha iyi. |
| COMBINE | `3` | Metin içeren paragrafları algılar ve ardından paragrafların içindeki alanları algılamak için diğer NN modelini kullanır. Karmaşık yapıya sahip görüntüler için daha iyidir. |
| TABLE | `4` | Metin içeren hücreleri algılar. Tablo yapısına sahip görüntüler için tercih edilen mod. |
| CURVED_TEXT | `5` | Çizgileri algılar ve kavisli görüntülerdeki metni tanır. Kitap ve dergi sayfalarının fotoğrafları için tercih edilen mod. |

### Notlar

[`RecognitionSettings`](../recognitionsettings/) hangi görüntü türünü tanımak istediğinizi belirtmek için.

### Ayrıca bakınız

* ad alanı [Aspose.OCR](../../aspose.ocr/)
* toplantı [Aspose.OCR](../../)



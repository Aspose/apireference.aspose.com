---
title: OmrEngine.GenerateTemplate
second_title: Aspose.OMR for .NET API Referansı
description: OmrEngine yöntem. MemoryStream tabanlı bir şablon .omr ve şablon görüntüsü oluşturur
type: docs
weight: 40
url: /tr/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection, Encoding) {#generatetemplate_2}

MemoryStream tabanlı bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null, Encoding encoding = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | İşaretleme satırları içeren akış |
| settings | GlobalPageSettings | Tüm sayfa öğeleri için geçerli genel ayarlar |
| userImages | ImageCollection | Bir şablon oluşturma için kullanılabilecek görüntülerin toplanması. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |
| encoding | Encoding | biçimlendirme satırları kodlaması, varsayılan olarak UTF-8 kullanılır |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ad alanı [Aspose.OMR.Api](../../omrengine/)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection, Encoding) {#generatetemplate_1}

MemoryStream tabanlı bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null, 
    Encoding encoding = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | İşaretleme satırları içeren akış |
| userImages | ImageCollection | Bir şablon oluşturma için kullanılabilecek görüntülerin toplanması. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |
| encoding | Encoding | biçimlendirme satırları kodlaması, varsayılan olarak UTF-8 kullanılır |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ad alanı [Aspose.OMR.Api](../../omrengine/)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

İşaretleme satırları dizisine dayalı olarak bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupLines | String[] | İşaretleme satırları dizisi |
| settings | GlobalPageSettings | Tüm sayfa öğeleri için geçerli genel ayarlar |
| userImages | ImageCollection | Bir şablon oluşturma için kullanılabilecek görüntülerin toplanması. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ad alanı [Aspose.OMR.Api](../../omrengine/)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

İşaretleme satırları dizisine dayalı olarak bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupLines | String[] | İşaretleme satırları dizisi |
| userImages | ImageCollection | Bir şablon oluşturma için kullanılabilecek görüntülerin toplanması. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ad alanı [Aspose.OMR.Api](../../omrengine/)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings, Encoding) {#generatetemplate_3}

Metin işaretlemesine dayalı bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings, 
    Encoding encoding = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupPath | String | Metin biçimlendirme dosyasının yolu |
| settings | GlobalPageSettings | Tüm sayfa öğeleri için geçerli genel ayarlar |
| encoding | Encoding | biçimlendirme dosyası kodlaması, varsayılan olarak UTF-8 kullanılır |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [OmrEngine](../)
* ad alanı [Aspose.OMR.Api](../../omrengine/)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string, Encoding) {#generatetemplate_5}

Metin işaretlemesine dayalı bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string markupPath, Encoding encoding = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupPath | String | Metin biçimlendirme dosyasının yolu |
| encoding | Encoding | biçimlendirme dosyası kodlaması, varsayılan olarak UTF-8 kullanılır |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* ad alanı [Aspose.OMR.Api](../../omrengine/)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[], Encoding) {#generatetemplate_4}

Metin işaretlemesine dayalı bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths, 
    Encoding encoding = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupPath | String | Metin biçimlendirme dosyasının yolu |
| imagesPaths | String[] | Oluşturmada kullanılan görüntülerin tam yolları |
| encoding | Encoding | biçimlendirme dosyası kodlaması, varsayılan olarak UTF-8 kullanılır |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [OmrEngine](../)
* ad alanı [Aspose.OMR.Api](../../omrengine/)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Şablon object tabanlı bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| config | TemplateConfig | Tüm öğeleri temsil eden şablon nesnesi |
| settings | GlobalPageSettings | tüm şablon oluşturmada kullanılan genel ayarlar |
| userImages | ImageCollection | Bir şablon oluşturma için kullanılabilecek görüntülerin toplanması. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult/)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig/)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings/)
* class [ImageCollection](../../imagecollection/)
* class [OmrEngine](../)
* ad alanı [Aspose.OMR.Api](../../omrengine/)
* toplantı [Aspose.OMR](../../../)



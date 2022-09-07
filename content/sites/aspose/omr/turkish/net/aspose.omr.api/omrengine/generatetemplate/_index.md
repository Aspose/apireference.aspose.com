---
title: GenerateTemplate
second_title: Aspose.OMR for .NET API Referansı
description: MemoryStream tabanlı bir şablon .omr ve şablon görüntüsü oluşturur
type: docs
weight: 40
url: /tr/net/aspose.omr.api/omrengine/generatetemplate/
---
## GenerateTemplate(MemoryStream, GlobalPageSettings, ImageCollection) {#generatetemplate_2}

MemoryStream tabanlı bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | İşaretleme satırlarını içeren akış |
| settings | GlobalPageSettings | Tüm sayfa öğeleri için geçerli genel ayarlar |
| userImages | ImageCollection | Şablon oluşturma için kullanılabilecek görüntü koleksiyonu. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* ad alanı [Aspose.OMR.Api](../../omrengine)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(MemoryStream, ImageCollection) {#generatetemplate_1}

MemoryStream tabanlı bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(MemoryStream stream, ImageCollection userImages = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| stream | MemoryStream | İşaretleme satırlarını içeren akış |
| userImages | ImageCollection | Şablon oluşturma için kullanılabilecek görüntü koleksiyonu. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* ad alanı [Aspose.OMR.Api](../../omrengine)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], GlobalPageSettings, ImageCollection) {#generatetemplate_7}

Bir şablon (.omr) ve bir dizi biçimlendirme satırına dayalı olarak şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupLines | String[] | İşaretleme çizgileri dizisi |
| settings | GlobalPageSettings | Tüm sayfa öğeleri için geçerli genel ayarlar |
| userImages | ImageCollection | Şablon oluşturma için kullanılabilecek görüntü koleksiyonu. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* ad alanı [Aspose.OMR.Api](../../omrengine)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string[], ImageCollection) {#generatetemplate_6}

Bir şablon (.omr) ve bir dizi biçimlendirme satırına dayalı olarak şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string[] markupLines, ImageCollection userImages = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupLines | String[] | İşaretleme çizgileri dizisi |
| userImages | ImageCollection | Şablon oluşturma için kullanılabilecek görüntü koleksiyonu. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* ad alanı [Aspose.OMR.Api](../../omrengine)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string, GlobalPageSettings) {#generatetemplate_4}

Metin işaretlemesine dayalı olarak bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string markupPath, GlobalPageSettings settings)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupPath | String | Metin işaretleme dosyasının yolu |
| settings | GlobalPageSettings | Tüm sayfa öğeleri için geçerli genel ayarlar |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [OmrEngine](../../omrengine)
* ad alanı [Aspose.OMR.Api](../../omrengine)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string) {#generatetemplate_3}

Metin işaretlemesine dayalı olarak bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string markupPath)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupPath | String | Metin işaretleme dosyasının yolu |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* ad alanı [Aspose.OMR.Api](../../omrengine)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(string, string[]) {#generatetemplate_5}

Metin işaretlemesine dayalı olarak bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(string markupPath, string[] imagesPaths)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| markupPath | String | Metin işaretleme dosyasının yolu |
| imagesPaths | String[] | Üretimde kullanılan görüntülerin tam yolları |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [OmrEngine](../../omrengine)
* ad alanı [Aspose.OMR.Api](../../omrengine)
* toplantı [Aspose.OMR](../../../)

---

## GenerateTemplate(TemplateConfig, GlobalPageSettings, ImageCollection) {#generatetemplate}

Template object temelinde bir şablon (.omr) ve şablon görüntüsü oluşturur

```csharp
public GenerationResult GenerateTemplate(TemplateConfig config, GlobalPageSettings settings, 
    ImageCollection userImages = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| config | TemplateConfig | Tüm öğeleri temsil eden şablon nesnesi |
| settings | GlobalPageSettings | tüm şablon oluşturmada kullanılan genel ayarlar |
| userImages | ImageCollection | Şablon oluşturma için kullanılabilecek görüntü koleksiyonu. Dosya sistemi yerine MemoryStream'den görüntülerin kullanılmasına izin ver |

### Geri dönüş değeri

Üretim sonucu

### Ayrıca bakınız

* class [GenerationResult](../../../aspose.omr.generation/generationresult)
* class [TemplateConfig](../../../aspose.omr.generation.config/templateconfig)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [ImageCollection](../../imagecollection)
* class [OmrEngine](../../omrengine)
* ad alanı [Aspose.OMR.Api](../../omrengine)
* toplantı [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->

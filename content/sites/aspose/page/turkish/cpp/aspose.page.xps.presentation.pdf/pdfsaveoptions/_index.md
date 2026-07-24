---
title: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions sınıfı"
linktitle: "PdfSaveOptions"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::XPS::Presentation::Pdf::PdfSaveOptions sınıfı. C++'ta XPS-yi PDF olarak kaydetme seçenekleri için sınıf."
type: docs
weight: 300
url: /tr/cpp/aspose.page.xps.presentation.pdf/pdfsaveoptions/
---
## PdfSaveOptions class


XPS-olarak-PDF kaydetme seçenekleri için sınıf.

```cpp
class PdfSaveOptions : public Aspose::Page::SaveOptions,
                       public Aspose::Page::IMultiPageSaveOptions,
                       public Aspose::Page::XPS::Presentation::IXpsTextConversionOptions,
                       public Aspose::Page::XPS::Presentation::IPipelineOptions,
                       public Aspose::Page::XPS::Presentation::IEventBasedModificationOptions
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_BatchSize](./get_batchsize/)() override | Düğümden düğüme geçecek sayfa bölümünün boyutunu belirtir. |
| [get_BeforePageSavingEventHandlers](./get_beforepagesavingeventhandlers/)() override | Kaydedilmeden hemen önce bir [XPS](../../aspose.page.xps/) sayfasına değişiklik yapan olay işleyicileri koleksiyonu. |
| [get_EncryptionDetails](./get_encryptiondetails/)() const | Şifreleme ayrıntılarını alır. Ayarlanmamışsa, şifreleme yapılmaz. |
| [get_ImageCompression](./get_imagecompression/)() const | Belge içindeki tüm görüntüler için kullanılacak sıkıştırma türünü belirtir. Varsayılan, [PdfImageCompression::Auto](../pdfimagecompression/). |
| [get_OutlineTreeExpansionLevel](./get_outlinetreeexpansionlevel/)() const | PDF dosyası bir görüntüleyicide açıldığında belge taslağının hangi seviyeye kadar genişletileceğini belirtir. 1 - yalnızca birinci seviye taslak öğeleri gösterilir, 2 - birinci ve ikinci seviye taslak öğeleri gösterilir, vb. Varsayılan 1'dir. |
| [get_OutlineTreeHeight](./get_outlinetreeheight/)() const | Kaydedilecek belge taslak ağacının yüksekliğini belirtir. 0 - taslak ağacı dönüştürülmez, 1 - yalnızca birinci seviye taslak öğeleri dönüştürülür, vb. Varsayılan 10'dur. |
| [get_PageNumbers](./get_pagenumbers/)() override | Dönüştürülecek sayfa numaralarının dizisini alır/ayar. |
| [get_PreserveText](./get_preservetext/)() override | Bazı metin öğeleri, yazı tipinde herhangi bir karakter koduna karşılık gelmeyen alternatif glif formlarına referanslar içerebilir. Bu bayrak true olarak ayarlanırsa, bu tür [XPS](../../aspose.page.xps/) öğelerindeki metin grafik şekillere dönüştürülür. Ardından metin kendisi üstte şeffaf görünür. Bu, bu öğelerin metninin seçilebilir kalmasını sağlar. Ancak yan etkisi, çıktı dosyasının orijinalden çok daha büyük olabilmesidir. Bayrak false olarak ayarlanırsa, alternatif formlarda gösterilmesi gereken karakterler, alternatif glif formlarıyla eşleşecek başka karakterlerle değiştirilir. Böylece metin hâlâ seçilebilir olsa da değiştirilecek ve muhtemelen okunamaz hâle gelecektir. Varsayılan false. |
| [get_TextCompression](./get_textcompression/)() const | Belge taslağında [ApsBookmark](../) nesnelerinin hangi seviyede görüntüleneceğini belirtir. 0 - görüntülenmez. 1 - birinci seviyede ve devam eder. Varsayılan 0'dır. |
| [PdfSaveOptions](./pdfsaveoptions/)() | Seçeneklerin yeni bir örneğini oluşturur. |
| [set_BatchSize](./set_batchsize/)(int32_t) override | Düğümden düğüme geçecek sayfa bölümünün boyutunu belirtir. |
| [set_EncryptionDetails](./set_encryptiondetails/)(System::SharedPtr\<PdfEncryptionDetails\>) | Şifreleme ayrıntılarını ayarlar. Ayarlanmamışsa, şifreleme yapılmaz. |
| [set_ImageCompression](./set_imagecompression/)(PdfImageCompression) | Belge içindeki tüm görüntüler için kullanılacak sıkıştırma türünü belirtir. Varsayılan, [PdfImageCompression::Auto](../pdfimagecompression/). |
| [set_OutlineTreeExpansionLevel](./set_outlinetreeexpansionlevel/)(int32_t) | PDF dosyası bir görüntüleyicide açıldığında belge taslağının hangi seviyeye kadar genişletileceğini belirtir. 1 - yalnızca birinci seviye taslak öğeleri gösterilir, 2 - birinci ve ikinci seviye taslak öğeleri gösterilir, vb. Varsayılan 1'dir. |
| [set_OutlineTreeHeight](./set_outlinetreeheight/)(int32_t) | Kaydedilecek belge taslak ağacının yüksekliğini belirtir. 0 - taslak ağacı dönüştürülmez, 1 - yalnızca birinci seviye taslak öğeleri dönüştürülür, vb. Varsayılan 10'dur. |
| [set_PageNumbers](./set_pagenumbers/)(System::ArrayPtr\<int32_t\>) override | Dönüştürülecek sayfa numaralarının dizisini alır/ayar. |
| [set_PreserveText](./set_preservetext/)(bool) override | Bazı metin öğeleri, yazı tipinde herhangi bir karakter koduna karşılık gelmeyen alternatif glif formlarına referanslar içerebilir. Bu bayrak true olarak ayarlanırsa, bu tür [XPS](../../aspose.page.xps/) öğelerindeki metin grafik şekillere dönüştürülür. Ardından metin kendisi üstte şeffaf görünür. Bu, bu öğelerin metninin seçilebilir kalmasını sağlar. Ancak yan etkisi, çıktı dosyasının orijinalden çok daha büyük olabilmesidir. Bayrak false olarak ayarlanırsa, alternatif formlarda gösterilmesi gereken karakterler, alternatif glif formlarıyla eşleşecek başka karakterlerle değiştirilir. Böylece metin hâlâ seçilebilir olsa da değiştirilecek ve muhtemelen okunamaz hâle gelecektir. Varsayılan false. |
| [set_TextCompression](./set_textcompression/)(PdfTextCompression) | Belge taslağında [ApsBookmark](../) nesnelerinin hangi seviyede görüntüleneceğini belirtir. 0 - görüntülenmez. 1 - birinci seviyede ve devam eder. Varsayılan 0'dır. |
## Ayrıca Bakınız

* Class [SaveOptions](../../aspose.page/saveoptions/)
* Class [IMultiPageSaveOptions](../../aspose.page/imultipagesaveoptions/)
* Class [IXpsTextConversionOptions](../../aspose.page.xps.presentation/ixpstextconversionoptions/)
* Class [IPipelineOptions](../../aspose.page.xps.presentation/ipipelineoptions/)
* Class [IEventBasedModificationOptions](../../aspose.page.xps.presentation/ieventbasedmodificationoptions/)
* Namespace [Aspose::Page::XPS::Presentation::Pdf](../)
* Library [Aspose.Page for C++](../../)

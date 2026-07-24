---
title: "Aspose::Page::EPS::PsDocument sınıfı"
linktitle: "PsDocument"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::EPS::PsDocument sınıfı. Bu sınıf C++'ta PS/EPS belgelerini kapsar."
type: docs
weight: 700
url: /tr/cpp/aspose.page.eps/psdocument/
---
## PsDocument class


Bu sınıf PS/EPS belgelerini kapsüller.

```cpp
class PsDocument : public Aspose::Page::Document
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clip](./clip/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Mevcut grafik durumuna kırpma ekler. |
| [ClipAndNewPath](./clipandnewpath/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Mevcut grafik durumuna kırpma ekler ve ardından \"newpath\" operatörünü yazar. Bu, bu kırpma yolunun ve \"charpath\" operatörüyle çevrelenmiş glifler gibi bazı sonraki yolların birleşmesinden kaçınmak için gereklidir. |
| [ClipRectangle](./cliprectangle/)(System::Drawing::RectangleF) | Mevcut grafik durumuna kırpma dikdörtgeni ekler. |
| [ClipText](./cliptext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Verilen yazı tipindeki verilen metnin taslağından kırpma ekler. |
| [ClosePage](./closepage/)() | Mevcut sayfayı tamamla. |
| [ConvertType1FontToTTF](./converttype1fonttottf/)(System::String, System::String) | Type 1 yazı tipini **TrueType**'a dönüştürür. Dönüştürülen TTF yazı tipinin adı, \".ttf\" uzantılı giriş Type 1 yazı tipiyle aynı olacaktır. TTF dosyası atanmış çıkış dizinine kaydedilecektir. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::String) | Type 3 yazı tipini **TrueType**'a dönüştürür. Dönüştürülen TTF yazı tipinin adı, \".ttf\" uzantılı giriş Type 3 yazı tipi dosyasıyla aynı olacaktır. TTF dosyası atanmış çıkış dizinine kaydedilecektir. |
| [ConvertType3FontToTTF](./converttype3fonttottf/)(System::String, System::SharedPtr\<System::IO::Stream\>) | Type 3 yazı tipini **TrueType** akışına dönüştürür. |
| [CropEps](./cropeps/)(System::String, System::ArrayPtr\<float\>) | Verilen [PsDocument](./) dosyasını [EPS](../) dosyası olarak kırpar. Mevcut %BoundingBox güncellenmiş şekilde ilk [EPS](../) dosyasını kaydeder veya yeni bir tane oluşturulur. |
| [CropEps](./cropeps/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) | Verilen [PsDocument](./) dosyasını [EPS](../) dosyası olarak kırpar. Mevcut %BoundingBox güncellenmiş şekilde ilk [EPS](../) dosyasını kaydeder veya yeni bir tane oluşturulur. |
| [Draw](./draw/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Keyfi bir yol çizer. |
| [DrawArc](./drawarc/)(double, double, double, double, double, double) | Bir yay çizer. |
| [DrawExplicitImageMask](./drawexplicitimagemask/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Maskeleme uygulanmış görüntüyü çizer. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>) | Görüntüyü çizer. |
| [DrawImage](./drawimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Color) | Arka planlı dönüştürülmüş görüntüyü çizer. |
| [DrawLine](./drawline/)(double, double, double, double) | Bir çizgi segmenti çizer. |
| [DrawOval](./drawoval/)(double, double, double, double) | Bir oval çizer. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Bir çokgen çizer. |
| [DrawPolygon](./drawpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Bir poligone çizer. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Bir çoklu çizgi çizer. |
| [DrawPolyline](./drawpolyline/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Bir çoklu çizgi çizer. |
| [DrawRect](./drawrect/)(double, double, double, double) | Bir dikdörtgen çizer. |
| [DrawRoundRect](./drawroundrect/)(double, double, double, double, double, double) | Yuvarlak köşeli bir dikdörtgen çizer. |
| [DrawTransparentImage](./drawtransparentimage/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, int32_t) | Dönüştürülmüş şeffaf görüntüyü çizer. Görüntünün Alpha kanalı yoksa opak görüntü olarak çizilir. |
| [ExtractEpsBoundingBox](./extractepsboundingbox/)() | Bir [EPS](../) dosyasını okur ve %BoundingBox yorumundan veya mevcut değilse varsayılan sayfa boyutu (0, 0, 595, 842) sınırlarından [EPS](../) görüntüsünün sınırlayıcı kutusunu çıkarır. |
| [ExtractEpsSize](./extractepssize/)() | Bir [EPS](../) dosyasını okur ve %BoundingBox yorumundan veya mevcut değilse varsayılan sayfa boyutu (595, 842) üzerinden [EPS](../) görüntüsünün boyutunu çıkarır. |
| [ExtractText](./extracttext/)(System::SharedPtr\<SaveOptions\>, int32_t, int32_t) | Bir PS dosyasından metin çıkarır. Metin yalnızca Type 42 (**TrueType**) yazı tipiyle ya da Vector Map içinde Type 42 yazı tipleri bulunan Type 0 yazı tipiyle yazılmışsa çıkarılabilir. |
| [Fill](./fill/)(System::SharedPtr\<System::Drawing::Drawing2D::GraphicsPath\>) | Keyfi bir yolu doldur. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler. |
| [FillAndStrokeText](./fillandstroketext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>, System::SharedPtr\<System::Drawing::Pen\>) | Gliflerin içini doldurarak ve glif konturlarını çizerek bir metin dizesi ekler. |
| [FillArc](./fillarc/)(double, double, double, double, double, double) | Bir yay doldurur. |
| [FillOval](./filloval/)(double, double, double, double) | Bir oval doldurur. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<int32_t\>, System::ArrayPtr\<int32_t\>, int32_t) | Bir poligone doldurur. |
| [FillPolygon](./fillpolygon/)(System::ArrayPtr\<double\>, System::ArrayPtr\<double\>, int32_t) | Bir poligone doldurur. |
| [FillRect](./fillrect/)(double, double, double, double) | Bir dikdörtgen doldurur. |
| [FillRoundRect](./fillroundrect/)(double, double, double, double, double, double) | Yuvarlak köşeli bir dikdörtgen doldurur. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](./filltext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [FillText](./filltext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Brush\>) | Gliflerin içini doldurarak bir metin dizesi ekler. |
| [get_InputStream](./get_inputstream/)() | [PsDocument](./) bir akış ve yükleme seçenekleriyle başlatır. |
| [get_NumberOfPages](./get_numberofpages/)() const | Oluşan PDF belgesindeki sayfa sayısını döndürür. |
| [GetPaint](./getpaint/)() | Mevcut grafik durumunun boyasını alır. |
| [GetStroke](./getstroke/)() | Mevcut grafik durumunda çizgi (stroke) ayarlar. |
| [GetXmpMetadata](./getxmpmetadata/)() | PS/EPS dosyasını okur ve XmpMetdata mevcutsa çıkarır, mevcut değilse yenisini ekler. |
| [MergeToPdf](./mergetopdf/)(System::String, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | PS/EPS dosyalarını bir cihaza birleştirir. |
| [MergeToPdf](./mergetopdf/)(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<System::String\>, System::SharedPtr\<SaveOptions\>) | PS/EPS dosyalarını bir cihaza birleştirir. |
| [OpenPage](./openpage/)(float, float) | Yeni bir sayfa oluşturur ve onu mevcut sayfa yapar. |
| [OpenPage](./openpage/)(System::String) | Belgenin boyutuyla yeni bir sayfa oluşturur ve onu mevcut sayfa yapar. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<System::Drawing::Font\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [OutlineText](./outlinetext/)(System::String, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [OutlineText](./outlinetext/)(System::String, System::ArrayPtr\<float\>, System::SharedPtr\<Aspose::Page::Font::DrFont\>, float, float, System::SharedPtr\<System::Drawing::Pen\>) | Glif konturlarını çizerek bir metin dizesi ekler. |
| [PsDocument](./psdocument/)() | Boş [PsDocument](./) başlatır. Bu yapıcı yalnızca PostScript dosyalarıyla ilgili olmayan ek işlemler için kullanılır, örneğin, yazı tiplerini dönüştürmek. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Başlatılmış sayfa ile boş [PsDocument](./) başlatır. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Başlatılmış sayfa ile boş [PsDocument](./) başlatır. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Boş [PsDocument](./) başlatır. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) | Boş [PsDocument](./) başlatır. |
| [PsDocument](./psdocument/)(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Belge sayfalarının [Postscript](../../aspose.page.eps.postscript/) sayfa sayısı önceden bilindiğinde boş [PsDocument](./) başlatır. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) | Belge sayfalarının [Postscript](../../aspose.page.eps.postscript/) sayfa sayısı önceden bilindiğinde boş [PsDocument](./) başlatır. |
| [PsDocument](./psdocument/)(System::String) | [PsDocument](./) bir giriş PS/EPS dosyasıyla başlatır. |
| [PsDocument](./psdocument/)(System::SharedPtr\<System::IO::Stream\>) | [PsDocument](./) bir PS/EPS dosyası akışıyla başlatır. |
| [ResizeEps](./resizeeps/)(System::String, System::Drawing::SizeF, Units) | Verilen [PsDocument](./) dosyasını [EPS](../) dosyası olarak yeniden boyutlandırır. Bu yöntem yalnızca [EPS](../) boyutu çıkarıldıktan sonra kullanılır. Başlangıçtaki [EPS](../) filD:\\ASPOSE.GIT\\aspose.pdf.cpp\\cs_porter_produce\\Aspose.Page.Cpp.Page.Cpp\\eps\\src_eps\\PsDocument.hThe output directory where image file will be saved.e güncellenmiş mevcut %BoundingBox ile veya yeni bir %BoundingBox oluşturularak kaydedilir. [Page](../../aspose.page/) dönüşüm matrisi de ayarlanacaktır. |
| [ResizeEps](./resizeeps/)(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) | Verilen [PsDocument](./) dosyasını [EPS](../) dosyası olarak yeniden boyutlandırır. Bu yöntem yalnızca [EPS](../) boyutu çıkarıldıktan sonra kullanılır. Başlangıçtaki [EPS](../) dosyasını güncellenmiş mevcut %BoundingBox ile veya yeni bir %BoundingBox oluşturularak kaydeder. [Page](../../aspose.page/) dönüşüm matrisi de ayarlanacaktır. |
| [Rotate](./rotate/)(float) | Mevcut grafik durumuna (geçerli matrisi döndür) orijine göre saat yönünün tersine döndürme ekler. |
| [Rotate](./rotate/)(int32_t) | Mevcut grafik durumuna (geçerli matrisi döndür) orijine göre saat yönünün tersine döndürme ekler. |
| [Save](./save/)(System::String) | Verilen [PsDocument](./) dosyasını [EPS](../) dosyası olarak kaydeder. Bu yöntem yalnızca [XMP](../../aspose.page.eps.xmp/) üst verileri güncellendikten sonra kullanılır. Başlangıçtaki [EPS](../) dosyasını güncellenmiş mevcut üst verilerle veya GetMetadata yöntemi çağrılırken oluşturulan yeni bir üst veriyle kaydeder. Son durumda gerekli tüm PostScript kodu ve [EPS](../) yorumları eklenir. |
| [Save](./save/)(System::SharedPtr\<System::IO::Stream\>) | Verilen [PsDocument](./) akışa kaydeder. Bu yöntem yalnızca [XMP](../../aspose.page.eps.xmp/) üst verileri güncellendikten sonra kullanılır. Başlangıçtaki [EPS](../) dosyasını güncellenmiş mevcut üst verilerle veya GetMetadata yöntemi çağrılırken oluşturulan yeni bir üst veriyle kaydeder. Son durumda gerekli tüm PostScript kodu ve [EPS](../) yorumları eklenir. |
| [Save](./save/)() | Verilen [PsDocument](./) dosyasını PS veya [EPS](../) dosyası olarak kaydeder. Bu yöntem yalnızca [PsDocument](./) sıfırdan oluşturulduğunda kullanılır. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>) | PS/EPS dosyasını görüntü dosyasına kaydeder. Çıktı dizini ve dosya adı, giriş PS dosyasındakilerle aynı olacaktır. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir. Belge, FileStream olmayan bir akışla başlatıldıysa, görüntü dosyası mevcut klasörde varsayılan dosya adı şablonu ile kaydedilir. |
| [SaveAsImage](./saveasimage/)(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) | PS/EPS dosyasını belirtilen dizine, belirtilen dosya adıyla görüntü dosyasına kaydeder. Dosya uzantısı, "options" parametresindeki görüntü formatına karşılık gelir. |
| [SaveAsImagesBytes](./saveasimagesbytes/)(System::SharedPtr\<Device::ImageSaveOptions\>) | PS/EPS dosyasını görüntü bayt dizilerine kaydeder. |
| [SaveAsPdf](./saveaspdf/)(System::String, System::SharedPtr\<Device::PdfSaveOptions\>) | PS/EPS dosyasını PDF dosyasına kaydeder. |
| [SaveAsPdf](./saveaspdf/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PdfSaveOptions\>) | PS/EPS dosyasını PDF akışına kaydeder. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | PNG/JPEG/TIFF/BMP/GIF/EMF görüntüsünü giriş akışından [EPS](../) çıktı akışına kaydeder. |
| static [SaveImageAsEps](./saveimageaseps/)(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | PNG/JPEG/TIFF/BMP/GIF/EMF görüntüsünü dosyadan [EPS](../) dosyasına kaydeder. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) | Bitmap nesnesini [EPS](../) dosyasına kaydeder. |
| static [SaveImageAsEps](./saveimageaseps/)(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) | Bitmap nesnesini [EPS](../) çıktı akışına kaydeder. |
| [Scale](./scale/)(float, float) | Mevcut grafik durumuna (geçerli matrisi ölçekle) ölçek ekler. |
| [set_InputStream](./set_inputstream/)(System::SharedPtr\<System::IO::Stream\>) | [PsDocument](./) bir akış ve yükleme seçenekleriyle başlatır. |
| [SetPageDevice](./setpagedevice/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | Sayfa aygıtı parametrelerini ayarlar ("setpagedevice" operatörüne bakın, PostScript spesifikasyonu). Bunlar arasında sayfa boyutu, renk vb. bulunabilir. |
| [SetPageSize](./setpagesize/)(float, float) | Sayfa boyutunu ayarlar. Tek bir belgede farklı boyutlarda sayfalar oluşturmak için bu yöntemden hemen sonra [SetPageDevice](./setpagedevice/) yöntemini kullanın. |
| [SetPaint](./setpaint/)(System::SharedPtr\<System::Drawing::Brush\>) | Mevcut grafik durumunda boyayı ayarlar. |
| [SetStroke](./setstroke/)(System::SharedPtr\<System::Drawing::Pen\>) | Mevcut grafik durumunda çizgi (stroke) ayarlar. |
| [SetTransform](./settransform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Mevcut dönüşümü buna ayarla. |
| [Shear](./shear/)(float, float) | Mevcut grafik durumunu bir nokta etrafında saat yönünün tersine döndürür. |
| [Transform](./transform/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Mevcut grafik durumuna dönüşüm ekler (bu matrisi mevcut matrisle birleştirir). |
| [Translate](./translate/)(float, float) | Mevcut grafik durumuna çeviri ekler (mevcut matrisi çevirir). |
| [WriteGraphicsRestore](./writegraphicsrestore/)() | Mevcut grafik durumunun geri yüklenmesini yazar ("grestore" operatörüyle ilgili PostScript spesifikasyonuna bakınız). |
| [WriteGraphicsSave](./writegraphicssave/)() | Mevcut grafik durumunun kaydedilmesini yazar ("gsave" operatörüyle ilgili PostScript spesifikasyonuna bakınız). |
## Ayrıca Bakınız

* Class [Document](../../aspose.page/document/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)

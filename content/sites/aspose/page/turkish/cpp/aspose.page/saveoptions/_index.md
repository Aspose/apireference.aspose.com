---
title: "Aspose::Page::SaveOptions sınıfı"
linktitle: "SaveOptions"
second_title: "Aspose.Page için C++"
description: "Aspose::Page::SaveOptions sınıfı. Bu sınıf, C++'da dönüşüm sürecini yönetmek için gerekli seçenekleri içerir."
type: docs
weight: 1500
url: /tr/cpp/aspose.page/saveoptions/
---
## SaveOptions class


Bu sınıf, dönüşüm sürecini yönetmek için gerekli seçenekleri içerir.

```cpp
class SaveOptions : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | Dönüştürücünün giriş belgesi için yazı tiplerini bulması gereken ek klasörleri belirtir. Varsayılan klasör, işletim sisteminin dahili ihtiyaçları için yazı tiplerini bulduğu standart yazı tipi klasörüdür. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | TrueType olmayan yazı tiplerinin TTF olarak kaydedilip kaydedilmeyeceğini belirtir. PS'den PDF'ye dönüşümde ortaya çıkan belgenin boyutunu önemli ölçüde azaltır ve TrueType olmayan yazı tiplerinde büyük miktarda metin içeren PS dosyalarının herhangi bir çıktı formatına dönüşüm hızını artırır. Ancak PostScript dosyasını görüntüye dönüştürürken metinde küçük bir dikey kayma oluşur. |
| virtual [get_Debug](./get_debug/)() | Hata ayıklama bilgilerinin standart çıktı akışına yazdırılıp yazdırılmayacağını belirtir. |
| virtual [get_Exceptions](./get_exceptions/)() | [SuppressErrors](../) doğru ise, bastırılan dönüşüm hatalarının bir listesini döndürür. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Kalite kategorisi, bir görüntünün sıkıştırma seviyesini belirtir. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahip görüntü üretir. |
| [get_Size](./get_size/)() const | Görüntünün boyutunu alır/ayarlar. |
| virtual [get_SupressErrors](./get_supresserrors/)() | Hataların bastırılıp bastırılmayacağını belirtir. Doğru ise bastırılan hatalar [Exceptions](../) listesine eklenir. Yanlış ise ilk hata programı sonlandırır. |
| [SaveOptions](./saveoptions/)() | Yeni bir [SaveOptions](./) sınıf örneği başlatır; [SuppressErrors](../) (true) ve [Debug](../) (false) bayrakları için varsayılan değerler kullanılır. |
| [SaveOptions](./saveoptions/)(bool) | Yeni bir [SaveOptions](./) sınıf örneği başlatır; [Debug](../) (false) bayrağı için varsayılan değer kullanılır. |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | Yeni bir [SaveOptions](./) örneği, sayfanın belirtilen boyutu ile başlatılır. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | Yeni bir [SaveOptions](./) sınıf örneği, [Debug](../) (false) bayrağı için varsayılan değer ve sayfanın belirtilen boyutu ile başlatılır. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | Dönüştürücünün giriş belgesi için yazı tiplerini bulması gereken ek klasörleri belirtir. Varsayılan klasör, işletim sisteminin dahili ihtiyaçları için yazı tiplerini bulduğu standart yazı tipi klasörüdür. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | TrueType olmayan yazı tiplerinin TTF olarak kaydedilip kaydedilmeyeceğini belirtir. PS'den PDF'ye dönüşümde ortaya çıkan belgenin boyutunu önemli ölçüde azaltır ve TrueType olmayan yazı tiplerinde büyük miktarda metin içeren PS dosyalarının herhangi bir çıktı formatına dönüşüm hızını artırır. Ancak PostScript dosyasını görüntüye dönüştürürken metinde küçük bir dikey kayma oluşur. |
| virtual [set_Debug](./set_debug/)(bool) | Hata ayıklama bilgilerinin standart çıktı akışına yazdırılıp yazdırılmayacağını belirtir. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Kalite kategorisi, bir görüntünün sıkıştırma seviyesini belirtir. Kullanılabilir değerler 0 ile 100 arasındadır. Belirtilen sayı ne kadar düşük olursa sıkıştırma o kadar yüksek olur ve dolayısıyla görüntünün kalitesi o kadar düşük olur. 0 değeri en düşük kaliteye, 100 değeri ise en yüksek kaliteye sahip görüntü üretir. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | Görüntünün boyutunu alır/ayarlar. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | Hataların bastırılıp bastırılmayacağını belirtir. Doğru ise bastırılan hatalar [Exceptions](../) listesine eklenir. Yanlış ise ilk hata programı sonlandırır. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)

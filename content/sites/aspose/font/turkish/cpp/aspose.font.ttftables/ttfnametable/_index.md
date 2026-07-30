---
title: "Aspose::Font::TtfTables::TtfNameTable class"
linktitle: "TtfNameTable"
second_title: "Aspose.Font için C++"
description: "Aspose::Font::TtfTables::TtfNameTable sınıfı. C++'ta TTF Yazı tipi dosyasının \"name\" tablosunu temsil eder."
type: docs
weight: 1300
url: /tr/cpp/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class


TTF [Font](../../aspose.font/font/) dosyasının "name" tablosunu temsil eder.

```cpp
class TtfNameTable : public Aspose::Font::TtfTables::TtfTableBase
```

## Nested classes

* Class [NameRecord](./namerecord/)
## Enums

| Enum | Açıklama |
| --- | --- |
| [MacLanguageId](./maclanguageid/) | Macintosh platformu dil kimliği numaralandırması. |
| [MacPlatformSpecificId](./macplatformspecificid/) | Macintosh platformu PlatformSpecificId numaralandırmasını temsil eder. |
| [MSLanguageId](./mslanguageid/) | Microsoft platformu dil kimliği numaralandırması. |
| [MSPlatformSpecificId](./msplatformspecificid/) | Microsoft platformu PlatformSpecificId numaralandırmasını temsil eder. |
| [NameId](./nameid/) | Temsil eder [NameId](./nameid/). |
| [PlatformId](./platformid/) | Temsil eder [PlatformId](./platformid/) numaralandırmasını. |
| [UnicodePlatformSpecificId](./unicodeplatformspecificid/) | Unicode platforma özgü numaralandırmayı temsil eder. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddMultiLanguageNames](./addmultilanguagenames/)(System::SharedPtr\<MultiLanguageString\>, TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Geçilen *mlNames* nesnesinden tüm çok dilli dizeleri çıkarır ve çıkarılan her dize için geçilen *platformId*, *platformSpecificId* ve *nameId* parametreleri kullanılarak ilgili [NameRecord](./namerecord/) yapısını oluşturur. *languageID* alanının değeri *mlNames* nesnesinden çıkarılır. Yeni oluşturulan kayıt tabloya eklenir. PlatformID, platformSpecificID, nameID ve languageId alanlarıyla aynı olan bir kayıt bulunursa, yeni oluşturulan kayıt eklenmez ve yalnızca dize verisi mevcut kayıt için güncellenir. |
| [AddName](./addname/)(TtfNameTable::NameId, TtfNameTable::PlatformId, int32_t, int32_t, System::String) | Tabloya bir giriş ekler. Eklenecek dize veri kategorisi *name* parametresiyle belirtilir. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId) | Geçilen parametrelere ilişkin tüm kayıtları siler. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t) | Belirtilen platforma ilişkin tüm kayıtları siler. |
| [DeleteRecords](./deleterecords/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t) | Belirtilen parametrelere ilişkin kayıt(ları) siler. |
| [DeleteRecordsByNameId](./deleterecordsbynameid/)(TtfNameTable::NameId) | Geçilen nameId parametresine ilişkin tüm kayıtları siler. |
| static [get_Tag](./get_tag/)() | Tablo etiketini alır. |
| [GetAllNameRecords](./getallnamerecords/)() | Tablodan tüm [NameRecord](./namerecord/) yapılarını döndürür. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId) | nameId ile bir adı döndürür. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId) | Geçilen platform tanımlayıcısını kullanarak nameId ile bir adı döndürür. |
| [GetMultiLanguageNameById](./getmultilanguagenamebyid/)(TtfNameTable::NameId, TtfNameTable::PlatformId, uint16_t) | Bir adı, [MultiLanguageString](../../aspose.font/multilanguagestring/) türünde bir nesne olarak döndürür. Metod, geçilen nameId, platformId ve platformSpecificId parametreleriyle aynı olan tüm [NameRecord](./namerecord/) yapılarını toplar ve ardından bu yapı listesine dayanarak sonuç nesnesini oluşturur. |
| [GetNameById](./getnamebyid/)(TtfNameTable::NameId) | nameId bulunursa adı döndürür, aksi takdirde null. |
| [GetNameRecordsByNameId](./getnamerecordsbynameid/)(TtfNameTable::NameId) | Geçilen *nameId* değerine eşit [NameId](./nameid/) alanına sahip tüm [NameRecord](./namerecord/) yapılarını döndürür. Kayıt bulunamazsa boş dizi döndürülür. |
| [UpdateName](./updatename/)(TtfNameTable::PlatformId, uint16_t, TtfNameTable::NameId, uint16_t, System::String) | Belirtilen platforma (platformId ve platformSpecificId kombinasyonu), kategoriye (nameId) ve dile (languageId) ilişkin kayıt(larda) adı günceller. |
| [UpdateNamesByNameId](./updatenamesbynameid/)(TtfNameTable::NameId, System::String) | Parametre nameId ile belirtilen mantıksal dize kategorisiyle ilişkili tüm kayıtları seçer ve bu kayıtlardaki name alanını (dize verisi) günceller. Platform (platformID, Platform‑spesifik kodlama ID) ve dil (Language ID) ile ilgili alanlar bu yöntem tarafından etkilenmez. Yalnızca name dize verisi yeni bir adla değiştirilir. Bu yöntemi dikkatli kullanın, çünkü nameId ile ilişkili tüm platform ve diller için orijinal adları değiştirecektir. Orijinal adlar farklı değerler içeriyorsa, değiştirme işlemi bu değerlerin tümünü tek bir yeni değerle değiştirerek çakışmalara yol açabilir. Ve bu yeni değer bazı platform ve dillerle mantıksal tutarsızlık gösterebilir. Bu yöntem, orijinal adın tüm platform ve diller için tek bir temsiline sahip olduğu durumlarda faydalıdır; örneğin, ad dize verisi İngilizce dilindeyse. |
## Ayrıca Bakınız

* Class [TtfTableBase](../ttftablebase/)
* Namespace [Aspose::Font::TtfTables](../)
* Library [Aspose.Font for C++](../../)

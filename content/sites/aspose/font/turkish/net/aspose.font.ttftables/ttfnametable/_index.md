---
title: TtfNameTable
second_title: Aspose.Font for .NET API Referansı
description: TTF Yazı Tipi dosyasının ad tablosunu temsil eder.
type: docs
weight: 900
url: /tr/net/aspose.font.ttftables/ttfnametable/
---
## TtfNameTable class

TTF Yazı Tipi dosyasının "ad" tablosunu temsil eder.

```csharp
public class TtfNameTable : TtfTableBase
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Offset](../../aspose.font.ttftables/ttftablebase/offset) { get; } | sfnt. başlangıcından itibaren ofseti alır |
| [TtfTables](../../aspose.font.ttftables/ttftablebase/ttftables) { get; } | TTF tablo deposuna başvuru. |
| static [Tag](../../aspose.font.ttftables/ttfnametable/tag) { get; } | Tablo etiketini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AddMultiLanguageNames](../../aspose.font.ttftables/ttfnametable/addmultilanguagenames)(MultiLanguageString, PlatformId, ushort, NameId) | Geçilen tüm çok dilli dizeleri ayıklar*mlNames* nesne ve , geçirilen parametreleri kullanılarak çıkarılan her dize için karşılık gelen NameRecord yapısı oluşturur*platformId* ,*platformSpecificId* ve*nameId* . Alan dili kimliği değeri şuradan alınır:*mlNames* nesne. Yeni oluşturulan kayıt tabloya eklenir. PlatformID, platformSpecificID, nameID ve langugeId alanları tarafından yeni oluşturulan kayıtlarla çakışan kayıt bulunursa, yeni oluşturulan kayıt eklenmez ve sadece mevcut kayıt için dize verileri güncellenir. |
| [AddName](../../aspose.font.ttftables/ttfnametable/addname)(NameId, PlatformId, int, int, string) | Tabloya girdi ekler. Eklenecek dize veri kategorisi şununla belirtilir:*name* parametre. |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords)(PlatformId, ushort) | Belirtilen platformla ilgili tüm kayıtları siler |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_1)(PlatformId, ushort, NameId) | Geçirilen parametrelerle ilgili tüm kayıtları siler |
| [DeleteRecords](../../aspose.font.ttftables/ttfnametable/deleterecords#deleterecords_2)(PlatformId, ushort, NameId, ushort) | Belirtilen parametrelerle ilgili kayıtları siler |
| [DeleteRecordsByNameId](../../aspose.font.ttftables/ttfnametable/deleterecordsbynameid)(NameId) | Geçirilen nameId parametresi ile ilgili tüm kayıtları siler |
| [GetAllNameRecords](../../aspose.font.ttftables/ttfnametable/getallnamerecords)() | Tümünü döndürür[`NameRecord`](../ttfnametable.namerecord) table 'den yapılar |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid)(NameId) | nameId. ile bir ad döndürür |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_1)(NameId, PlatformId) | Geçilen platform tanımlayıcısını kullanarak nameId'ye göre bir ad döndürür. |
| [GetMultiLanguageNameById](../../aspose.font.ttftables/ttfnametable/getmultilanguagenamebyid#getmultilanguagenamebyid_2)(NameId, PlatformId, ushort) | Türün nesnesi olarak bir ad döndürür[`MultiLanguageString`](../../aspose.font/multilanguagestring) . Yöntem, geçirilen nameId, platformId ve platformSpecificId parametreleriyle çakışan tüm NameRecord yapılarını toplar ve ardından bu yapılar listesine dayalı olarak sonuç nesnesi oluşturur. |
| [GetNameById](../../aspose.font.ttftables/ttfnametable/getnamebyid)(NameId) | Bulunursa nameId'ye göre bir ad döndürür, aksi takdirde null |
| [GetNameRecordsByNameId](../../aspose.font.ttftables/ttfnametable/getnamerecordsbynameid)(NameId) | Tümünü döndürür[`NameRecord`](../ttfnametable.namerecord) NameId alanının ile eşit olduğu yapılar geçirilir*nameId* değer. Kayıt bulunamazsa boş dizi döndürülür. |
| [UpdateName](../../aspose.font.ttftables/ttfnametable/updatename)(PlatformId, ushort, NameId, ushort, string) | Belirtilen platform (platformId ve platformSpecificId kombinasyonu), kategorisi (nameId) ve dil (dil kimliği) ile ilgili kayıtlarda adı günceller. |
| [UpdateNamesByNameId](../../aspose.font.ttftables/ttfnametable/updatenamesbynameid)(NameId, string) | nameId parametresi tarafından belirtilen mantıksal dize kategorisiyle ilgili tüm kayıtları seçer ve bu kayıtlarda ad alanını (dize verileri) günceller. Platform (platformID, Platforma özgü kodlama kimliği) ve dil (Dil Kimliği) ile ilgili alanlar bu yöntemden etkilenmez. Yalnızca ad dizesi verileri yeni bir adla değiştirilir. Bu yöntemi dikkatli kullanın, çünkü ile nameId ile ilgili tüm platformlar ve diller için orijinal adların yerini alacaktır. Orijinal adların farklı değerlere sahip olduğu durumlarda çakışma yapabilir, değiştirme işleminin tüm bu değerleri yeni tek bir değerle değiştirmesine neden olabilir. Ve bu yeni değerin bazı platformları ve dilleri ile mantıksal bir tutarsızlığı olabilir. Bu yöntem, orijinal adın tüm platformlar ve diller için tek bir temsile sahip olduğu durumlarda, örneğin, ad dizesi verilerinin İngilizce dilinde olduğu durumlarda yararlıdır. |

## Diğer_Üyeler

| İsim | Tanım |
| --- | --- |
| enum [MacLanguageId](ttfnametable.maclanguageid) | Macintosh platform dili kimliği numaralandırma. |
| enum [MacPlatformSpecificId](ttfnametable.macplatformspecificid) | Macintosh platformu PlatformSpecificId numaralandırmasını temsil eder. |
| enum [MSLanguageId](ttfnametable.mslanguageid) | Microsoft platform dili kimliği numaralandırma. |
| enum [MSPlatformSpecificId](ttfnametable.msplatformspecificid) | Microsoft platformu PlatformSpecificId numaralandırmasını temsil eder. |
| enum [NameId](ttfnametable.nameid) | NameId. 'yi temsil eder |
| class [NameRecord](ttfnametable.namerecord) | 'name' tablosunun NameRecord yapısını temsil eder |
| enum [PlatformId](ttfnametable.platformid) | PlatformId numaralandırmasını temsil eder. |
| enum [UnicodePlatformSpecificId](ttfnametable.unicodeplatformspecificid) | Unicode platforma özgü numaralandırmayı temsil eder. |

### Ayrıca bakınız

* class [TtfTableBase](../ttftablebase)
* ad alanı [Aspose.Font.TtfTables](../../aspose.font.ttftables)
* toplantı [Aspose.Font](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Font.dll -->

---
title: Class XmpMetadata
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.EPS.XMP.XmpMetadata sınıf. XMP meta veri akışına erişim sağlar.
type: docs
weight: 190
url: /tr/net/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class

XMP meta veri akışına erişim sağlar.

```csharp
public sealed class XmpMetadata : IDictionary<string, XmpValue>
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Count](../../aspose.page.eps.xmp/xmpmetadata/count/) { get; } | Koleksiyondaki öğelerin sayısını alır. |
| [IsFixedSize](../../aspose.page.eps.xmp/xmpmetadata/isfixedsize/) { get; } | Koleksiyonun sabit boyutu olup olmadığını kontrol eder. |
| [IsReadOnly](../../aspose.page.eps.xmp/xmpmetadata/isreadonly/) { get; } | Koleksiyonun salt okunur olup olmadığını kontrol eder. |
| [IsSynchronized](../../aspose.page.eps.xmp/xmpmetadata/issynchronized/) { get; } | Koleksiyonun senkronize olup olmadığını kontrol eder. |
| [Item](../../aspose.page.eps.xmp/xmpmetadata/item/) { get; set; } | Meta verilerden veri alır veya ayarlar. |
| [Keys](../../aspose.page.eps.xmp/xmpmetadata/keys/) { get; } | Meta veri anahtarlarının koleksiyonunu alır. |
| [NamespaceManager](../../aspose.page.eps.xmp/xmpmetadata/namespacemanager/) { get; } | Ad alanı yöneticisini alır. |
| [SyncRoot](../../aspose.page.eps.xmp/xmpmetadata/syncroot/) { get; } | Koleksiyon eşitleme nesnesini alır. |
| [Values](../../aspose.page.eps.xmp/xmpmetadata/values/) { get; } | Meta verilerdeki değerleri alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add)(KeyValuePair&lt;string, XmpValue&gt;) | Sözlüğe anahtar ve değer çifti ekler. |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_2)(string, object) | Meta verilere değer katar. |
| [Add](../../aspose.page.eps.xmp/xmpmetadata/add/#add_1)(string, XmpValue) | Meta verilere değer katar. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem)(string, XmpValue) | Bir diziye değer ekler. Değer, dizinin sonuna eklenecektir. |
| [AddArrayItem](../../aspose.page.eps.xmp/xmpmetadata/addarrayitem/#addarrayitem_1)(string, int, XmpValue) | Belirtilen dizine göre bir diziye değer ekler. |
| [AddNamedValue](../../aspose.page.eps.xmp/xmpmetadata/addnamedvalue/)(string, string, XmpValue) | Bir yapıya adlandırılmış değer ekler. |
| [Clear](../../aspose.page.eps.xmp/xmpmetadata/clear/)() | Meta verileri temizler. |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains)(KeyValuePair&lt;string, XmpValue&gt;) | Belirtilen anahtar/değer çiftinin sözlükte bulunup bulunmadığını kontrol eder. |
| [Contains](../../aspose.page.eps.xmp/xmpmetadata/contains/#contains_1)(string) | Anahtarın meta verilerde olup olmadığını kontrol eder. |
| [ContainsKey](../../aspose.page.eps.xmp/xmpmetadata/containskey/)(string) | Bu sözlüğün belirtilen anahtarı içerip içermediğini belirler. |
| [CopyTo](../../aspose.page.eps.xmp/xmpmetadata/copyto/)(KeyValuePair&lt;string, XmpValue&gt;[], int) | Koleksiyonun öğelerini diziye kopyalar. |
| [GetEnumerator](../../aspose.page.eps.xmp/xmpmetadata/getenumerator/)() | Sözlük numaralandırıcısını döndürür. |
| [GetNamespaceUriByPrefix](../../aspose.page.eps.xmp/xmpmetadata/getnamespaceuribyprefix/)(string) | Ön eke göre ad alanı URI'sini döndürür. |
| [GetPrefixByNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/getprefixbynamespaceuri/)(string) | Ad alanı URI'sine göre öneki döndürür. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri)(string, string) | Ad alanı URI'sini kaydeder. |
| [RegisterNamespaceUri](../../aspose.page.eps.xmp/xmpmetadata/registernamespaceuri/#registernamespaceuri_1)(string, string, string) | Ad alanı URI'sini kaydeder. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove)(KeyValuePair&lt;string, XmpValue&gt;) | Koleksiyondan anahtar/değer çiftini kaldırır. |
| [Remove](../../aspose.page.eps.xmp/xmpmetadata/remove/#remove_1)(string) | Girişi meta verilerden kaldırır. |
| [SetArrayItem](../../aspose.page.eps.xmp/xmpmetadata/setarrayitem/)(string, int, XmpValue) | Bir dizideki değeri ayarlar. Önceki değer yenisiyle değiştirilecek. |
| [SetNamedValue](../../aspose.page.eps.xmp/xmpmetadata/setnamedvalue/)(string, string, XmpValue) | Adlandırılmış değeri bir yapıya ayarlar. Önceden adlandırılmış değer, eğer zaten varsa, yenisiyle değiştirilecek. |
| [TryGetValue](../../aspose.page.eps.xmp/xmpmetadata/trygetvalue/)(string, out XmpValue) | Anahtarı sözlükte bulmaya çalışır ve bulunursa değeri alır. |

### Ayrıca bakınız

* class [XmpValue](../xmpvalue/)
* ad alanı [Aspose.Page.EPS.XMP](../../aspose.page.eps.xmp/)
* toplantı [Aspose.Page](../../)


